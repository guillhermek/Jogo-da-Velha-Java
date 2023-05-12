package jogo;
import java.util.Scanner;
public class joga {
	Scanner scanner = new Scanner(System.in);
	String vetA[][] = new String[3][3];
	String c;
	String a,b; 
	boolean confira1, confira2, confira3;
	boolean confira4, confira5, confira6;
	boolean confira7, confira8;
	boolean comando;
	boolean hdhd;
	
	void mostratabela() {
			
			for(int i=0; i<3; i++){
				System.out.println("");
				for(int j=0;j<3;j++){
				System.out.print(vetA[i][j]+"|");
			}}}
		
	void test() {
			this.c=" - ";
			for(int i=0; i<3; i++){
				for(int j=0;j<3;j++){
					vetA[i][j]=this.c;
			}}}
	void jogadaX(int g1,int g2) {
		this.a=" X ";
		System.out.println("");
		if(vetA[g1][g2]==this.c) {
			vetA[g1][g2]=this.a;
			System.out.println("-----");
		}
		else {
			System.out.println(" ERRO ");
			hdhd=true;
			
		}}
	void jogadaO(int e2,int f2) {
		this.b=" O ";
		System.out.println("");
		if(vetA[e2][f2]==this.c) {
			vetA[e2][f2]=this.b;
			System.out.println("-----");
		}
		else {
			System.out.println(" ERRO ");
			hdhd=true;
		}}
	void testarodada() {
		comando=false;
			if(((vetA[0][0]!=c) && (vetA[0][1]!=c)) && (vetA[0][2]!=c)){
			confira1=true;
			}
			if(((vetA[1][0]!=c) && (vetA[1][1]!=c)) && (vetA[1][2]!=c)){
			confira2=true;
			}
			if(((vetA[2][0]!=c) && (vetA[2][1]!=c)) && (vetA[2][2]!=c)){
			confira3=true;
			}
			if(((vetA[0][0]!=c) && (vetA[1][0]!=c)) && (vetA[2][0]!=c)){
			confira4=true;
			}
			if(((vetA[0][1]!=c) && (vetA[1][1]!=c)) && (vetA[2][1]!=c)){
			confira5=true;
			}
			if(((vetA[0][2]!=c) && (vetA[1][2]!=c)) && (vetA[2][2]!=c)){
			confira6=true;
			}
			if(((vetA[0][0]!=c) && (vetA[1][1]!=c)) && (vetA[2][2]!=c)){
			confira7=true;
			}
			if(((vetA[0][2]!=c) && (vetA[1][1]!=c)) && (vetA[2][0]!=c)){
			confira8=true;
			}
			if(confira1 == true){
				if(((vetA[0][0]==a) && (vetA[0][1]==a)) && (vetA[0][2]==a)){ comando=true;  
		 		System.out.println(" FIM DE JOGO O JOGADOR 1° VENCEU ");
					}
				if(((vetA[0][0]==b) && (vetA[0][1]==b)) && (vetA[0][2]==b)){   comando=true; 
				System.out.println(" FIM DE JOGO O JOGADOR 2° VENCEU ");
					}
				}
			if(confira2 == true){
				if(((vetA[1][0]==a) && (vetA[1][1]==a)) && (vetA[1][2]==a)){   comando=true; 
		 		System.out.println(" FIM DE JOGO O JOGADOR 1° VENCEU ");
					}
				if(((vetA[1][0]==b) && (vetA[1][1]==b)) && (vetA[1][2]==b)){   comando=true; 
				System.out.println(" FIM DE JOGO O JOGADOR 2° VENCEU ");
					}
				}
			if(confira3 == true){
				if(((vetA[2][0]==a) && (vetA[2][1]==a)) && (vetA[2][2]==a)){   comando=true; 
		 		System.out.println(" FIM DE JOGO O JOGADOR 1° VENCEU ");
					}
				if(((vetA[2][0]==b) && (vetA[2][1]==b)) && (vetA[2][2]==b)){   comando=true; 
				System.out.println(" FIM DE JOGO O JOGADOR 2° VENCEU ");
					}
				}
			if(confira4 == true){
				if(((vetA[0][0]==a) && (vetA[1][0]==a)) && (vetA[2][0]==a)){   comando=true; 
		 		System.out.println(" FIM DE JOGO O JOGADOR 1° VENCEU ");
					}
				if(((vetA[0][0]==b) && (vetA[1][0]==b)) && (vetA[2][0]==b)){   comando=true; 
				System.out.println(" FIM DE JOGO O JOGADOR 2° VENCEU ");
					}
				}
			if(confira5 == true){
				if(((vetA[0][1]==a) && (vetA[1][1]==a)) && (vetA[2][1]==a)){   comando=true; 
		 		System.out.println(" FIM DE JOGO O JOGADOR 1° VENCEU ");
					}
				if(((vetA[0][1]==b) && (vetA[1][1]==b)) && (vetA[2][1]==b)){   comando=true; 
				System.out.println(" FIM DE JOGO O JOGADOR 2° VENCEU ");
					}
				}
			if(confira6 == true){
				if(((vetA[0][2]==a) && (vetA[1][2]==a)) && (vetA[2][2]==a)){   comando=true; 
		 		System.out.println(" FIM DE JOGO O JOGADOR 1° VENCEU ");
					}
				if(((vetA[0][2]==b) && (vetA[1][2]==b)) && (vetA[2][2]==b)){   comando=true; 
				System.out.println(" FIM DE JOGO O JOGADOR 2° VENCEU ");
					}
				}
			if(confira7 == true){
				if(((vetA[0][0]==a) && (vetA[1][1]==a)) && (vetA[2][2]==a)){   comando=true; 
		 		System.out.println(" FIM DE JOGO O JOGADOR 1° VENCEU ");
					}
				if(((vetA[0][0]==b) && (vetA[1][1]==b)) && (vetA[2][2]==b)){   comando=true; 
				System.out.println(" FIM DE JOGO O JOGADOR 2° VENCEU ");
					}
				}

			if(confira8 == true){
				if(((vetA[0][2]==a) && (vetA[1][1]==a)) && (vetA[0][2]==a)){    comando=true; 
		 		System.out.println(" FIM DE JOGO O JOGADOR 1° VENCEU ");
					}
				if(((vetA[0][2]==b) && (vetA[1][1]==b)) && (vetA[0][2]==b)){    comando=true; 
				System.out.println(" FIM DE JOGO O JOGADOR 2° VENCEU ");
					}}
	}
}
