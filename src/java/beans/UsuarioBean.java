package beans;

public class UsuarioBean {
    private String usuario;
    private String contraseña;
    private String nombreUsuario;
    private int bitcoin;
    private int ethereum;
    private int ripple;
    
    public UsuarioBean(){}
    
    public UsuarioBean(String usuario, String contraseña){
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    
    public String getUsuario(){
        return usuario;
    }
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getBitcoin() {
        return bitcoin;
    }

    public void setBitcoin(int bitcoin) {
        this.bitcoin = bitcoin;
    }

    public int getEthereum() {
        return ethereum;
    }

    public void setEthereum(int ethereum) {
        this.ethereum = ethereum;
    }

    public int getRipple() {
        return ripple;
    }

    public void setRipple(int ripple) {
        this.ripple = ripple;
    }
    
}
