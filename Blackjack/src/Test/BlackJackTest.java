package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Logic.BlackJack;

public class BlackJackTest {

	@Test
	public void test() {
		
		BlackJack blackjack = new BlackJack();
		
		assertEquals(10, blackjack.play(10, 22));
		assertEquals(9, blackjack.play(22, 9));
		assertEquals(0, blackjack.play(22, 22));
		assertEquals(10, blackjack.play(10, 7));
		assertEquals(19, blackjack.play(1, 19));
		
		
		
	}

}
