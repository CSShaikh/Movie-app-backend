package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Screen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String screenName;
    private int seatLimit;
    
	public Screen() {
		super();
	}

	public Screen(Long id, String screenName, int seatLimit) {
		super();
		this.id = id;
		this.screenName = screenName;
		this.seatLimit = seatLimit;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public int getSeatLimit() {
		return seatLimit;
	}

	public void setSeatLimit(int seatLimit) {
		this.seatLimit = seatLimit;
	}
    
    
}
