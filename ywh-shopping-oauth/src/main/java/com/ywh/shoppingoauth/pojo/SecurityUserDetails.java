package com.ywh.shoppingoauth.pojo;

import com.google.common.collect.Sets;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Set;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2021/1/5
 */
@Data
@AllArgsConstructor
public class SecurityUserDetails implements UserDetails {

    private User user;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Set<GrantedAuthority> authoritieSet = Sets.newHashSet();
        authoritieSet.add((GrantedAuthority) () -> "1111");
        authoritieSet.add((GrantedAuthority) () -> "2222");
        authoritieSet.add((GrantedAuthority) () -> "3333");
        authoritieSet.add((GrantedAuthority) () -> "4444");
        return authoritieSet;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
