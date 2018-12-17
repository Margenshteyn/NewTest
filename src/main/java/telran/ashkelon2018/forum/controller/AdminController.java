package telran.ashkelon2018.forum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import telran.ashkelon2018.forum.domain.Role;
import telran.ashkelon2018.forum.dto.NewRoleDTO;
import telran.ashkelon2018.forum.service.AccountServiceImpl;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	AccountServiceImpl service;

	@PostMapping("/role")
	public Role addNewRole(@RequestBody NewRoleDTO role) {
		return service.addRoleToDB(role);
	}

}
