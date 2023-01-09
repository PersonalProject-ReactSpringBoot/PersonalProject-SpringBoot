package Pack.dao;

import Pack.dto.MemberDTO;

public interface MemberRepository {
	MemberDTO login(MemberDTO memberDTO);
	MemberDTO insert(MemberDTO memberDTO);
}