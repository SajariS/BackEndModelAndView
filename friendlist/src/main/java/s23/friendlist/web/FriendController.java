package s23.friendlist.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;
import s23.friendlist.domain.Friend;

@Controller
public class FriendController {
	List<Friend> friendList = new ArrayList<>();

	@GetMapping("/index")
	public String friendForm(Model model) {
		model.addAttribute("friendList", friendList);
		model.addAttribute("friend", new Friend());
		return "friendList";
	}

	@PostMapping("/index")
	public String friendSubmit(@Valid Friend friend, BindingResult bindingResult, Model model) {
		if (!bindingResult.hasErrors()) {
			friendList.add(friend);
			model.addAttribute("friendList", friendList);
		}
		return "redirect:/index";
	}
}
