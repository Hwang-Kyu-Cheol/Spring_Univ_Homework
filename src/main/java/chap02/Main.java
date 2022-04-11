package chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
		
		//빈 객체 가져오기
		Sports sports = ctx.getBean("sports", Sports.class);
		Game game = ctx.getBean("game", Game.class);
		Team team1 = ctx.getBean("team1", Team.class);
		
		//setName
		sports.setName("스포츠 이름 입니다.");
		game.setName("게임 이름 입니다.");
		
		//빈 객체 정보 출력
		sports.info();
		game.info();
		team1.info();
		
		ctx.close();
	}
}
