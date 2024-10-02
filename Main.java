package strategyy;

public class Main {

	    public static void main(String[] args) {
	        Aritmetica calculoAritmetico = new Aritmetica();
	        Disciplina d1 = new Disciplina(calculoAritmetico);
	        d1.setNome("Geografia");
	        d1.setP1(9);
	        d1.setP2(7);
	        d1.CalcularMedia();
	        System.out.println(String.format("P1: %.2f P2: %.2f Média: %.2f Situação: %s", d1.getP1(), d1.getP2(), d1.getMedia(), d1.getSituacao()));

	        Geometrica calculoGeometrico = new Geometrica();
	        Disciplina d2 = new Disciplina(calculoGeometrico);
	        d2.setNome("Geografia");
	        d2.setP1(9);
	        d2.setP2(7);
	        d2.CalcularMedia();
	        System.out.println(String.format("P1: %.2f P2: %.2f Média: %.2f Situação: %s", d2.getP1(), d2.getP2(), d2.getMedia(), d2.getSituacao()));
	    }
	}
