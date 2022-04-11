package chap02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Sports {
	
	private Team team1;
	private Team team2;
	private Team team3;
	private Game game;
	
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public Sports() {
		System.out.println("스포츠 객체가 생성되었습니다.");
	}
	
	@Autowired
	@Qualifier("team1")
	public void setTeam1(Team team1) {
		this.team1 = team1;
	}
	
	@Autowired
	@Qualifier("team2")
	public void setTeam2(Team team2) {
		this.team2 = team2;
	}
	
	@Autowired
	@Qualifier("team3")
	public void setTeam3(Team team3) {
		this.team3 = team3;
	}
	
	@Autowired
	public void setGame(Game game) {
		this.game = game;
	}
	
	public void info() {
		System.out.println(name);
		System.out.println(team1.getName());
		System.out.println(team2.getName());
		System.out.println(team3.getName());
		System.out.println(game.getName());
	}
}
