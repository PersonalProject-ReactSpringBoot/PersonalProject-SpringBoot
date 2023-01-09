package Pack.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Pack.dto.MemberDTO;
import Pack.service.SignUpService;

@RestController
public class SignUpController {
	@Autowired
	private SignUpService signUpService;
	
	@RequestMapping("/api/signUp")
	public MemberDTO signUp(
			@RequestBody MemberDTO memberDTO,
			HttpServletRequest request) {
		
		System.out.println(memberDTO.toString());
		return signUpService.signUp(memberDTO);
	}
}
