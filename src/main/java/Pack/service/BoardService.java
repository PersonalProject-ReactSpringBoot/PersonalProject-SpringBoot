package Pack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Pack.dao.MemberRepository;
import Pack.dto.BoardDTO;

@Service
public class BoardService {
	@Autowired
	private MemberRepository memberRepository;
	
	public BoardDTO board(BoardDTO boardDTO) {
		return memberRepository.board(boardDTO);
	}
}