package ch15.book.exercise.p07;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {

	public List<Board> getBoardList() { // <Board>와 new Board가 중요하다
		List<Board> list = new ArrayList<>();
		list.add(new Board("제목1", "내용1"));
		list.add(new Board("제목2", "내용2"));
		list.add(new Board("제목3", "내용3"));
		return list;
	}	

}
