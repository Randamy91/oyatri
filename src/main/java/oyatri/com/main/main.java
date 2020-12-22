package oyatri.com.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class main {
	@RequestMapping("/main.do")
	public String main(){
		return "oyatri/main";
	}
}
