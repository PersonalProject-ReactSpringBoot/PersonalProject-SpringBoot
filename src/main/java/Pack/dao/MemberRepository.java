package Pack.dao;

import Pack.dto.BoardDTO;
import Pack.dto.MemberDTO;

public interface MemberRepository {
	MemberDTO login(MemberDTO memberDTO);
	MemberDTO signUp(MemberDTO memberDTO);
	BoardDTO board(BoardDTO boardDTO);
}