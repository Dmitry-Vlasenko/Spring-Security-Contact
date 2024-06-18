package com.dvlasenko.App.security;

import com.dvlasenko.App.entity.Contact;
import com.dvlasenko.App.entity.Role;
import com.dvlasenko.App.repository.ContactRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class AppContactDetailsService implements UserDetailsService {

    private final ContactRepository contactRepository;

    public AppContactDetailsService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Contact contact = contactRepository.findByEmail(email);

        if (contact != null) {
            return new org.springframework.security.core.userdetails.User(
                    contact.getEmail(),
                    contact.getPassword(),
                    mapRolesToAuthorities(contact.getRoles()));
        } else {
            throw new UsernameNotFoundException("Invalid login or password.");
        }
    }

    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles) {
        return roles.stream()
                .map(role -> new SimpleGrantedAuthority(role.getName()))
                .collect(Collectors.toList());
    }
}
