package Pack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Pack.dao.MemberRepository;
import Pack.dto.MemberDTO;

@Service
public class LoginService {
	@Autowired
	private MemberRepository memberRepository;

	public MemberDTO login(MemberDTO memberDTO) {
		return memberRepository.login(memberDTO);
	}
	
	public MemberDTO insert(MemberDTO memberDTO) {
		return memberRepository.insert(memberDTO);
	}
}