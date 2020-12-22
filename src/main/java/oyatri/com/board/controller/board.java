package oyatri.com.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class board {
	@RequestMapping("/board.do")
	public String board(){
		return "oyatri/board";
	}
}
