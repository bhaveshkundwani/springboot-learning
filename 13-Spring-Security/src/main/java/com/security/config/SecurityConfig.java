package com.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.config.annotation.web.configurers.SessionManagementConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {

		/*
		 * with lambda
		 */
//		 httpSecurity.csrf(customizer -> customizer.disable());
//		 httpSecurity.authorizeHttpRequests(request -> request.anyRequest().authenticated());
//		// httpSecurity.formLogin(Customizer.withDefaults()); // don't need this when we have sessionCreationPolicy
//		 httpSecurity.httpBasic(Customizer.withDefaults());
//		 httpSecurity.sessionManagement(session ->
//		 session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

		/*
		 * without lambda
		 */
//		Customizer<CsrfConfigurer<HttpSecurity>> custCsrf = new Customizer<CsrfConfigurer<HttpSecurity>>() {
//			@Override
//			public void customize(CsrfConfigurer<HttpSecurity> httpSecurityCsrfConfigurer) {
//				httpSecurityCsrfConfigurer.disable();
//			}
//		};
//		httpSecurity.csrf(custCsrf);
//
//		Customizer<AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry> custHttp = new Customizer<AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry>() {
//			@Override
//			public void customize(
//					AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry authorizationManagerRequestMatcherRegistry) {
//				authorizationManagerRequestMatcherRegistry.anyRequest().authenticated();
//			}
//		};
//		httpSecurity.authorizeHttpRequests(custHttp);
//
//		httpSecurity.httpBasic(Customizer.withDefaults());
//
//		Customizer<SessionManagementConfigurer<HttpSecurity>> custSession = new Customizer<SessionManagementConfigurer<HttpSecurity>>() {
//			@Override
//			public void customize(SessionManagementConfigurer<HttpSecurity> httpSecuritySessionManagementConfigurer) {
//				httpSecuritySessionManagementConfigurer.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//			}
//		};
//		httpSecurity.sessionManagement(custSession);
		
		/*
		 * with lambda	
		 */
		 httpSecurity
		 	.csrf(customizer -> customizer.disable())
		 	.authorizeHttpRequests(request -> request.anyRequest().authenticated())
		 	.httpBasic(Customizer.withDefaults())
		 	.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

		return httpSecurity.build();
	}
}
