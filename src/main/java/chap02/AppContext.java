package chap02;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"chap02"})
public class AppContext {
	
	//구단주
	@Bean
	public Owner owner1() {
		Owner owner = new Owner();
		owner.setName("구단주1");
		return owner;
	}
	
	@Bean
	public Owner owner2() {
		Owner owner = new Owner();
		owner.setName("구단주2");
		return owner;
	}
	
	@Bean
	public Owner owner3() {
		Owner owner = new Owner();
		owner.setName("구단주3");
		return owner;
	}
	
	//선수
	@Bean
	public Player player11() {
		Player player = new Player();
		player.setName("선수1");
		return player;
	}
	
	@Bean
	public Player player12() {
		Player player = new Player();
		player.setName("선수2");
		return player;
	}
	
	@Bean
	public Player player13() {
		Player player = new Player();
		player.setName("선수3");
		return player;
	}
	
	@Bean
	public Player player21() {
		Player player = new Player();
		player.setName("선수4");
		return player;
	}
	
	@Bean
	public Player player22() {
		Player player = new Player();
		player.setName("선수5");
		return player;
	}
	
	@Bean
	public Player player23() {
		Player player = new Player();
		player.setName("선수6");
		return player;
	}
	
	@Bean
	public Player player31() {
		Player player = new Player();
		player.setName("선수7");
		return player;
	}
	
	@Bean
	public Player player32() {
		Player player = new Player();
		player.setName("선수8");
		return player;
	}
	
	@Bean
	public Player player33() {
		Player player = new Player();
		player.setName("선수9");
		return player;
	}
	
	//감독
	@Bean
	public Director director1() {
		Director director = new Director();
		director.setName("감독1");
		return director;
	}
	
	@Bean
	public Director director2() {
		Director director = new Director();
		director.setName("감독2");
		return director;
	}
	
	@Bean
	public Director director3() {
		Director director = new Director();
		director.setName("감독3");
		return director;
	}
	
	//코치
	@Bean
	public Coach coach1() {
		Coach coach = new Coach();
		coach.setName("코치1");
		return coach;
	}
	
	@Bean
	public Coach coach2() {
		Coach coach = new Coach();
		coach.setName("코치2");
		return coach;
	}
	
	@Bean
	public Coach coach3() {
		Coach coach = new Coach();
		coach.setName("코치3");
		return coach;
	}
	
	//팀
	@Bean
	@Qualifier("team1")
	public Team team1() {
		Team team1 = new Team();
		team1.setCoach(coach1());
		team1.setDirector(director1());
		team1.setOwner(owner1());
		team1.setPlayer1(player11());
		team1.setPlayer2(player12());
		team1.setPlayer3(player13());
		team1.setName("팀 1번");
		return team1;
	}
	
	@Bean
	@Qualifier("team2")
	public Team team2() {
		Team team2 = new Team();
		team2.setCoach(coach2());
		team2.setDirector(director2());
		team2.setOwner(owner2());
		team2.setPlayer1(player21());
		team2.setPlayer2(player22());
		team2.setPlayer3(player23());
		team2.setName("팀 2번");
		return team2;
	}
	
	@Bean
	@Qualifier("team3")
	public Team team3() {
		Team team3 = new Team();
		team3.setCoach(coach3());
		team3.setDirector(director3());
		team3.setOwner(owner3());
		team3.setPlayer1(player31());
		team3.setPlayer2(player32());
		team3.setPlayer3(player33());
		team3.setName("팀 3번");
		return team3;
	}
	
	//심판
	@Bean
	@Qualifier("referee1")
	public Referee referee1() {
		Referee referee = new Referee();
		referee.setName("심판1");
		return referee;
	}
	
	@Bean
	@Qualifier("referee2")
	public Referee referee2() {
		Referee referee = new Referee();
		referee.setName("심판2");
		return referee;
	}
}
