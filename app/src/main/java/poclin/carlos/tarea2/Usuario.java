package poclin.carlos.tarea2;

/**
 * Created by CARLOSIVÁN on 23/09/2017.
 */

public class Usuario {

    private String u_name;
    private String u_ap;
    private String u_am;
    private String u_edad;
    private String u_sexo;
    private String u_correo;
    private String u_user;
    private String u_pass;

    public Usuario(String u_name, String u_ap, String u_am, String u_edad, String u_sexo, String u_correo, String u_user, String u_pass) {
        this.u_name = u_name;
        this.u_ap = u_ap;
        this.u_am = u_am;
        this.u_edad = u_edad;
        this.u_sexo = u_sexo;
        this.u_correo = u_correo;
        this.u_user = u_user;
        this.u_pass = u_pass;
    }

    public String getU_name() { return u_name; }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_ap() {
        return u_ap;
    }

    public void setU_ap(String u_ap) {
        this.u_ap = u_ap;
    }

    public String getU_am() {
        return u_am;
    }

    public void setU_am(String u_am) {
        this.u_am = u_am;
    }

    public String getU_edad() {
        return u_edad;
    }

    public void setU_edad(String u_edad) {
        this.u_edad = u_edad;
    }

    public String getU_sexo() {
        return u_sexo;
    }

    public void setU_sexo(String u_sexo) {
        this.u_sexo = u_sexo;
    }

    public String getU_correro() {
        return u_correo;
    }

    public void setU_correro(String u_correo) {
        this.u_correo = u_correo;
    }

    public String getU_user() {
        return u_user;
    }

    public void setU_user(String u_user) {
        this.u_user = u_user;
    }

    public String getU_pass() {
        return u_pass;
    }

    public void setU_pass(String u_pass) {
        this.u_pass = u_pass;
    }
}
