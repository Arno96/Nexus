package com.webspr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CharacterController {
	@RequestMapping(value = "addCharacter", method = RequestMethod.GET)
	public String addCharacter(ModelMap map) {
		Character ch=new Character();
		map.addAttribute("chObj",ch);
		return "CharacterForm";
	}
	@RequestMapping(value = "getCharacter", method = RequestMethod.POST)
	public String getCharacter(@ModelAttribute Character chObj,ModelMap map) {
		map.addAttribute("chObj",chObj);
		return "ViewCharacter";
	}
	

}
