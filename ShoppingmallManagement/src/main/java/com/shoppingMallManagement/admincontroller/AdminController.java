package com.shoppingMallManagement.admincontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingMallManagement.adminentity.Adminservice;
import com.shoppingMallManagement.adminrepository.AdminRepository;

@RestController
public class AdminController {

	@Autowired
	private AdminRepository repo;
	
	@PostMapping("/admin")
	public Adminservice newAdmin(@RequestBody Adminservice a)  {
		return repo.save(a);
		
	}
	@GetMapping("/admin")
	public List<Adminservice> getAdmin(){
		return repo.findAll();
	}
	@GetMapping("/admin/[id]")
	public Adminservice getAdminById(@PathVariable Long id) {
		return repo.findById(id).get();
	}
	
	@DeleteMapping("/admin/[id]")
	public void deleteAdmin(@PathVariable Long id) {
		repo.deleteById(id);
	}
	@PutMapping("/admin/[id]")
	public Adminservice updateAdmin(@PathVariable Long  id, @RequestBody Adminservice a) {
		a.setId(id);
		return repo.save(a);
	}
}
