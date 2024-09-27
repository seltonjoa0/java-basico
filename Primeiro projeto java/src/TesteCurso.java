public class TesteCurso {
  public static void main(String[] args){
    Curso c1 = new Curso();
    c1.nome = "Redes";
    c1.cargaHoraria = 20;
    c1.nivel = "Superior";
    Curso c2 = new Curso();
    c2.nome = "Desenvolvimento de Sistemas";
    c2.cargaHoraria = 20;
    c2.nivel = "Tecnico";

    System.out.println(c1.nome);
    System.out.println(c1.cargaHoraria);
    System.out.println(c1.nivel);
    System.out.println(" ");
    System.out.println("Curso 2");
    System.out.println(c2.nome);
    System.out.println(c2.cargaHoraria);
    System.out.println(c2.nivel);
    
  }
}
