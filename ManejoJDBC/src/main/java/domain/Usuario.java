package domain;

public class Usuario {
    private int id_usuario;
    private String usuario;
    private String password;

    public Usuario(){
    }

    public Usuario(int id_usuario){
        this.id_usuario = id_usuario;
    }

    public Usuario(String usuario, String password){
        this.usuario = usuario;
        this.password = password;

    }

    public Usuario(int id_usuario, String usario, String password){
        this.id_usuario = id_usuario;
        this.usuario = usario;
        this.password = password;
    }

    public int getId_usuario() {
        return this.id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUsario() {
        return this.usuario;
    }

    public void setUsario(String usario) {
        this.usuario = usario;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id_usuario=" + id_usuario +
                ", usuario='" + usuario + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
