package dev.alansep.kairos.security;

import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Collections;

@Service
public class ReactiveUserDetailsServiceImpl implements ReactiveUserDetailsService {

    @Override
    public Mono<UserDetails> findByUsername(String username) {
        if ("admin".equals(username)) {
            return Mono.just(new User("admin", "$2a$10$v1sSmNa7bl01uj.Ydwaox.GcrvXpDJD8YALYF.NpFqLE0tpGtoKBO", Collections.emptyList()));
        } else {
            return Mono.empty();
        }
    }
}
