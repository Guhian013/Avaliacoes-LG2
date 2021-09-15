public class Aluno {
    private String prontuario;
    private String nome;

    public Aluno() {
        this.prontuario = "";
        this.nome = "";
    }

    public Aluno(String nome, String prontuario) {
        this.nome = nome;
        this.prontuario = prontuario;
    }

    public void setProntuario(String prontuario) {
        if(prontuario.startsWith("SP") || prontuario.startsWith("Sp") || prontuario.startsWith("sp") ) {
            if(prontuario.length() == 8) {
                this.prontuario = prontuario;
            } else {
                throw new IllegalArgumentException("Tamanho do Prontuário Inválido!");
            }
        } else {
            throw new IllegalArgumentException("Inserção Inválida!");
        }
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setNome(String nome) {
        if(nome.trim().isEmpty() == false) {
            if(nome.length() >= 5 && nome.length() <= 100) {
                this.nome = nome;
            } else {
                throw new IllegalArgumentException("Tamanho do Nome Inválido!");
            }
        } else {
            throw new IllegalArgumentException("Inserção Vazia!");
        }
    }

    public String getNome() {
        return nome;
    }
}
