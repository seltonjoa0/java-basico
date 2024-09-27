public class TestarCoordenador {
  public static void main(String[] args){
    Coordenador co1 = new Coordenador();
    co1.nome = "Rafaela";
    co1.area = "DS";
    co1.salario = 5000.00;

    Coordenador co2 = new Coordenador();
    co2.nome = "Mariana";
    co2.area = "Redes";
    co2.salario = 4000.00;
    System.out.println(co1.nome);
    System.out.println(co1.area);
    System.out.println(co1.salario);
    System.out.println(" ");
    System.out.println("Coordenador 2");
    System.out.println(co2.nome);
    System.out.println(co2.area);
    System.out.println(co2.salario);
  }
}
