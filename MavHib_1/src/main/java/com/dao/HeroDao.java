package com.dao;

import java.util.List;

import com.frame.Hero;

public interface HeroDao {
	
	public boolean addHero(Hero p);
	public boolean deleteHero(int personId);
	public boolean updateHero(Hero p);
	public Hero getHero(int pId);
	public List<Hero> getAllHeroes();

}
