public class TestarProfessor {
  public static void main(String[] args){
    Professor p1 = new Professor();
    p1.nome = "Paulo";
    p1.area = "Geografia";
    p1.titulacao = "Doutorado";

    Professor p2 = new Professor();
    p2.nome = "Marina";
    p2.area = "Fisica";
    p2.titulacao = "Mestrado";
    System.out.println(p1.nome);
    System.out.println(p1.area);
    System.out.println(p1.titulacao);
    System.out.println("Professor 2");
    System.out.println(p2.nome);
    System.out.println(p2.area);
    System.out.println(p2.titulacao);
  }
}
