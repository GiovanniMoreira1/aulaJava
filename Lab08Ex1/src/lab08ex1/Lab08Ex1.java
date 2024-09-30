package lab08ex1;

import controller.UsuarioController;
import view.BuscarUsuario;
import view.Janela;


public class Lab08Ex1 {

    
    public static void main(String[] args) {
        Janela j = new Janela();
        BuscarUsuario b = new BuscarUsuario();
        UsuarioController c = new UsuarioController(j,b);
        
        j.setC(c);
        b.setC(c);
        
        j.setVisible(true);
        b.setVisible(false);
    }
    
}
