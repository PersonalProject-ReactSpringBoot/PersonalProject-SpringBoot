package Pack.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import Pack.dto.BoardDTO;
import Pack.dto.MemberDTO;
import Pack.util.Delegate;
import Pack.util.JdbcTemplate;

@Repository
public class MemberRepositoryImp implements MemberRepository{	
	@Override
	public MemberDTO login(MemberDTO memberDTO) {
		MemberDTO member = (MemberDTO)JdbcTemplate.getInstance().proxy(new Delegate() {
			public Object delegate(SqlSession session) {
				return session.selectOne("login", memberDTO.getId());
			}
		});
		return member;
	}
	
	@Override
	public MemberDTO signUp(MemberDTO memberDTO) {
		JdbcTemplate.getInstance().proxy(new Delegate() {
			public Object delegate(SqlSession session) {
				return session.insert("signUp", memberDTO);
			}
		});
		return memberDTO;
	}
	
	@Override
	public BoardDTO board(BoardDTO boardDTO) {
		JdbcTemplate.getInstance().proxy(new Delegate() {
			public Object delegate(SqlSession session) {
				return session.insert("board", boardDTO);
			}
		});
		return boardDTO;
	}
}
