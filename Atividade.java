import java.util.*; 

interface ITriangulo{
	double base = 0;
	double altura = 0;
	public double AreaTriangulo();
}

class Triangulo implements ITriangulo{
	//Implementação interface
	public double base = 0;
	public double altura = 0;
	
	public double AreaTriangulo() {
		return (this.base * this.altura)/2;
	}
}

public class Atividade {

	public static void main(String[] args) {
		
		//Instânciar classes
		Triangulo t = new Triangulo();
		Scanner sc= new Scanner(System.in);
		
		//Leitura variaveis
		System.out.print("Informe a base do triangulo: ");  
		t.base = sc.nextDouble();
		
		System.out.print("Informe a altura do triangulo: ");  
		t.altura = sc.nextDouble();
		
		System.out.printf("A area do triangulo e: %.2f ", t.AreaTriangulo());
		
		//Encerrar instância Scanner
		sc.close();

	}

}
