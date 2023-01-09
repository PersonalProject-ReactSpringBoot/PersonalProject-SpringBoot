package Pack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Pack.dao.MemberRepository;
import Pack.dto.MemberDTO;

@Service
public class SignUpService {
	@Autowired
	private MemberRepository memberRepository;
	
	public MemberDTO signUp(MemberDTO memberDTO) {
		return memberRepository.signUp(memberDTO);
	}
}