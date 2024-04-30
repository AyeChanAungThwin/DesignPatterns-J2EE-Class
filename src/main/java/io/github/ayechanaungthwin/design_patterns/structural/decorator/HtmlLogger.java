package io.github.ayechanaungthwin.design_patterns.structural.decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class HtmlLogger implements Logger {

	private Logger logger;
	
	@Override
	public String log() {
		// TODO Auto-generated method stub
		return "<html>"+logger.log()+"</html>";
	}

}
