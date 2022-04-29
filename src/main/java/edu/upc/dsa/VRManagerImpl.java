package edu.upc.dsa;

import edu.upc.dsa.models.Usuario;
import edu.upc.dsa.models.Objeto;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class VRManagerImpl implements VRManager {

    HashMap<String, Usuario> usuarios;
    List<Objeto> tienda;

    private static Logger logger = Logger.getLogger(VRManagerImpl.class);


    private static VRManagerImpl manager;
    public static VRManagerImpl getInstance(){
        if(manager == null){
            manager = new VRManagerImpl();
        }
        return manager;
    }

    private VRManagerImpl (){
        this.usuarios = new HashMap<>();
        this.tienda = new ArrayList<>();
    }

    public HashMap<String, Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(HashMap<String, Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Objeto> getTienda() {
        return tienda;
    }

    public void setTienda(List<Objeto> tienda) {
        this.tienda = tienda;
    }

    //complementarias
    public Usuario getUsuarioById(String id){
        return this.usuarios.get(id);
    }



    @Override
    public List<Usuario> usuariosAlfabeticamente() {
        this.usuarios.sort((Usuario a, Usuario b)->{
           int cmp = a.getId().compareTo(b.getId());
           if (cmp == 0)
               cmp = a.getFecha().compareTo(b.getFecha());
           return cmp;
        });
       return (List<Usuario>) this.usuarios;
    }

    @Override
    public void comprarobjeto(String idobjeto, String idusuario, String precio, String saldo) throws Exception{

        if () {
            logger.info("Realizando compra");
            logger.debug(this.tienda);
            logger.debug(this.usuarios);
        } else {
       }
    }

    }


    public void setUpResources(){
        //crear usuarios
        Usuario u1 = new Usuario("david");
        Usuario u2 = new Usuario("sentry");
        Usuario u3 = new Usuario("dragon666");
        u1.setId("1234");
        this.usuarios.put(u1.getId(), u1);
        this.usuarios.put(u2.getId(), u2);
        this.usuarios.put(u3.getId(),u3);
        String m1 = "espada magica";
        String m2 = "capa invisibilidad";
        String m3 = "baston magico";

        //crear objetos

        Objeto o1 = new Objeto(m1,u1.getId(),"Espada de gran poder");
        Objeto o2 = new Objeto(m2,u2.getId(),"Capa que te permite ser invisible");
        Objeto o3 = new Objeto(m2,u3.getId(),"Baston que permite lanzar hechizos");

        this.tienda.add(o1);
        this.tienda.add(o2);
        this.tienda.add(o3);

    }

    public void tearDownResources(){
        setUsuarios(new HashMap<>());
        setTienda(new ArrayList<>());
    }
}
