package com.pharmacy.pharmacyapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth
			.userDetailsService(userDetailsService)
			.passwordEncoder(bCryptPasswordEncoder());
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.authorizeRequests()
		          .antMatchers("/").permitAll();
		// TODO Auto-generated method stub
//		http.authorizeRequests()
//		//.antMatchers("/").permitAll()
//		.antMatchers("/viewphamacist").hasAnyRole("ADMIN","USER")
//		.antMatchers("/showaddpharmacist", "/showpharmacist/**", "/deletepharmacist/**").hasAnyRole("ADMIN")
//		.anyRequest().authenticated()
//		.and()
//		.formLogin()
//			.permitAll()
//		.and()
//		.logout()
//			.invalidateHttpSession(true)
//			.permitAll()
//			.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//			.and()
//				.exceptionHandling().accessDeniedPage("/403");
	}
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
