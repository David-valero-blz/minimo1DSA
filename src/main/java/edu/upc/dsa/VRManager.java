package edu.upc.dsa;

import java.util.List;

import edu.upc.dsa.models.Objeto;
import edu.upc.dsa.models.Usuario;

public interface VRManager {

    public List<Usuario> usuariosAlfabeticamente();
    public void comprarobjeto(String idobjeto,String idusuario, String precio, String saldo) throws Exception;
    public List<String> tienda();
}
