package app;

public class login {
    private String nome;
    private String login;
    private String senha;

    public void AutLogin(String login, String senha){
        if(this.login.equals(login)&&this.senha.equals(senha)) {
            System.out.println("autenticado");
        } else{
            System.out.println("nao autenticado");
        }
    }

    public void setMeuLogin(String nome, String login, String senha){
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
