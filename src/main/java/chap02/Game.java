package chap02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Game {

	private Team team1;
	private Team team2;
	private Referee referee1;
	private Referee referee2;
	
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public Game() {
		System.out.println("경기 객체가 생성되었습니다.");
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
	@Qualifier("referee1")
	public void setReferee1(Referee referee1) {
		this.referee1 = referee1;
	}
	
	@Autowired
	@Qualifier("referee2")
	public void setReferee2(Referee referee2) {
		this.referee2 = referee2;
	}
	
	public void info() {
		System.out.println(name);
		System.out.println(team1.getName());
		System.out.println(team2.getName());
		System.out.println(referee1.getName());
		System.out.println(referee2.getName());
	}
}
