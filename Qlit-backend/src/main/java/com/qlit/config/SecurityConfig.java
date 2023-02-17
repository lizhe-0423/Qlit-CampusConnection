package com.qlit.config;

import com.qlit.handle.CustomAuthenticationFailureHandler;
import com.qlit.handle.GlobalExceptionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private CustomAuthenticationFailureHandler customAuthenticationFailureHandler;

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        /**
         .authorizeRequests() 方法开启针对 URL 的安全性配置。
         .antMatchers("/", "/register").permitAll() 指定哪些 URL 是允许匿名访问的，这里指定 / 和 /register 可以匿名访问。
         .anyRequest().authenticated() 剩下的所有请求都需要身份验证，即登录后才能访问。
         .formLogin() 指定使用表单登录进行身份验证。
         .loginPage("/login") 指定登录页面的 URL。
         .defaultSuccessUrl("/home") 指定登录成功后要跳转的页面。
         .permitAll() 允许所有用户访问登录页面和登录出页面。
         .logout() 指定使用 Spring Security 的默认登出功能。
         .permitAll() 允许所有用户访问登出页面。**/
        http
                .authorizeRequests()
                .antMatchers("/", "/register","/swagger-ui/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .failureHandler(customAuthenticationFailureHandler)
                .defaultSuccessUrl("/home")
                .permitAll()
                .and()
                .logout()
                .permitAll();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        //认证管理器 同时配置密码加密
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
