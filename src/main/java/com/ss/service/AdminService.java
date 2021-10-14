package com.ss.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ss.model.Admin;
import com.ss.repository.AdminRepository;
@Service
public class AdminService {
	
	@Autowired
	private AdminRepository adminRepository;
	
	public Admin getAdmin(String username) {
		return adminRepository.findById(username).get();
	}

	public boolean loginVerify(String username, String password) {
		Admin admin = adminRepository.findById(username).get();
        if (admin!= null && admin.getUsername().equals(username) && admin.getPassword().equals(password)) {
            return true;
        }
        return false;
	}

	public void updatePassword(Admin admin) {
		adminRepository.save(admin);
	}

}
