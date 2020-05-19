package com.Pfano.SpringbootPart2.websecurityconfig;

import com.Pfano.SpringbootPart2.model.User;

@Configuration
@EnableGlobalMethodSecurity( securedEnabled = true)
public class SecurityConfig {
    @Override
    public UserDetailsService userDetailsService() {
        UserDetails user =
                User.withDefaultPasswordEncoder()
                        .username("user")
                        .password("pass")
                        .roles("USER")
                        .build();
        return new InMemoryUserDetailsManager(user);
    }
}
