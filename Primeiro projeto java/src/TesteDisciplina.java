public class TesteDisciplina {
  public static void main(String[] args){
    Disciplina d1 = new Disciplina();
    d1.nome = "Matematica";
    d1.cargaHoraria = 20;
    d1.serie = 2;
    d1.professor = "Flavio";
    Disciplina d2 = new Disciplina();
    d2.nome = "Portugues";
    d2.cargaHoraria = 20;
    d2.serie = 3;
    d2.professor = "Marcos";

    System.out.println(d1.nome);
    System.out.println(d1.cargaHoraria);
    System.out.println(d1.serie);
    System.out.println(d1.professor);
    System.out.println(" ");
    System.out.println("Disciplina 2");
    System.out.println(d2.nome);
    System.out.println(d2.cargaHoraria);
    System.out.println(d2.serie);
    System.out.println(d2.professor);
  }
}
