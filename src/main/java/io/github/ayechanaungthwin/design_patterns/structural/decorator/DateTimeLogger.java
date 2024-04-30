package io.github.ayechanaungthwin.design_patterns.structural.decorator;

import java.util.Date;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DateTimeLogger implements Logger {

	private Logger logger;

	@Override
	public String log() {
		// TODO Auto-generated method stub
		return logger.log()+", "+new Date();
	}
}
