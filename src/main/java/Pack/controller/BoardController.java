package Pack.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Pack.dto.BoardDTO;
import Pack.service.BoardService;

@RestController
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/api/board")
	public BoardDTO board(
			@RequestBody BoardDTO boardDTO,
			HttpServletRequest request) {
		
		System.out.println(boardDTO.toString());
		return boardService.board(boardDTO);
	}
}
