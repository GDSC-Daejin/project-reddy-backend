package com.solution.reddy.global.config;

import com.solution.reddy.global.jwt.JwtFilter;
import com.solution.reddy.global.jwt.JwtTokenProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@RequiredArgsConstructor
public class JwtFilterConfig extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {
    private final JwtTokenProvider tokenProvider;

    // TokenProvider 를 주입받아서 JwtFilter 를 통해 Security 로직에 필터를 등록
    @Override
    public void configure(HttpSecurity http) {
        JwtFilter customFilter = new JwtFilter(tokenProvider);
        http.addFilterBefore(customFilter, UsernamePasswordAuthenticationFilter.class);
    }

    public JwtFilterConfig customJwtFilterConfig() {
        return new JwtFilterConfig(tokenProvider);
    }
}
