package Pack.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Pack.dto.MemberDTO;
import Pack.service.LoginService;

@RestController
public class LoginController {
	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/api/login")
	public MemberDTO login(
			@RequestBody MemberDTO memberDTO,
			HttpServletRequest request) {
		
		System.out.println(memberDTO.getId());
		System.out.println(memberDTO.getPassword());
		
		return loginService.login(memberDTO);
	}
}