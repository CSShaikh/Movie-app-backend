package com.service;

import java.util.List;

import com.model.Screen;

public interface ScreenService {
	
	public List<Screen> getAllScreens();
	    
	public Screen addScreen(Screen screen);
	    
	public Screen getScreenById(Long screenId);

}
