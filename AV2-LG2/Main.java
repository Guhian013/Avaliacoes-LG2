public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();

        System.out.println("\n------------Aluno 1-----------");

        a1.setProntuario("SP304414");
        System.out.println("\nProntuário 1: " + a1.getProntuario());

        a1.setNome("Josefino");
        System.out.println("\nNome 1: " + a1.getNome());

        System.out.println("\n------------------------------\n");

        System.out.println("------------Aluno 2-----------");

        a1.setProntuario("sp304414");
        System.out.println("\nProntuário 2: " + a1.getProntuario());

        a1.setNome("Josefino Pereira da Silva Maria Junior Terceiro");
        System.out.println("\nNome 2: " + a1.getNome());

        System.out.println("\n------------------------------\n");

    }
}
