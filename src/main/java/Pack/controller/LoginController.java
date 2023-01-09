package Pack.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
		
		System.out.println(memberDTO.toString());
		
		return loginService.login(memberDTO);
	}
}