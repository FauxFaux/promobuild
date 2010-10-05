package com.goeswhere.promobuild.ui;

import org.springframework.web.bind.annotation.ModelAttribute;

import com.goeswhere.promobuild.general.UiMsg;

public class LocalisedController {
	protected final UiMsg msg;

	@ModelAttribute("msg")
	UiMsg getMsg() {
		return msg;
	}

	public LocalisedController(UiMsg msg) {
		this.msg = msg;
	}
}
