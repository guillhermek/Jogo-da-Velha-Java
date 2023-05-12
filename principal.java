package jogo;

public class principal {

	public static void main(String[] args) {
		
		joga c1 = new joga();
		c1.test();
		c1.mostratabela();
		c1.jogadaX(0,0);
		c1.mostratabela();
		c1.jogadaO(1,2);
		c1.mostratabela();
		c1.jogadaX(0,1);
		c1.mostratabela();
		c1.jogadaO(2,1);
		c1.mostratabela();
		c1.jogadaX(0,2);
		c1.mostratabela();
		c1.testarodada();
		if(c1.comando == false) {
			c1.jogadaO(1,1);
			c1.mostratabela();
			c1.testarodada();
		}
		if(c1.comando == false) {
			c1.jogadaX(2,2);
			c1.mostratabela();
			c1.testarodada();
		}
		if(c1.comando == false) {
			c1.jogadaO(2,0);
			c1.mostratabela();
			c1.testarodada();
		}
		if(c1.comando == false) {
			c1.jogadaX(1,0);
			c1.mostratabela();
			c1.testarodada();
		}
		
	}

}
