package com.example.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.StaffMapper;
import com.example.demo.model.Staff;

@Service
public class LoginUserDetailsService implements UserDetailsService {
    @Autowired
    StaffMapper staffMapper;

    @Override
    public LoginUserDetails loadUserByUsername(String loginid) throws UsernameNotFoundException {
        Staff staff = staffMapper.findByLoginid(loginid);
        if  (staff   ==  null)   {
            throw new UsernameNotFoundException("Wrong email or password");
        }


        return new LoginUserDetails(staff, "ADMIN");
    }

}
