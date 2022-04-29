package edu.upc.dsa.services;

import edu.upc.dsa.VRManagerImpl;
import edu.upc.dsa.VRManagerImpl;
import edu.upc.dsa.models.Objeto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Api(value = "/game", description = "ENDPOINT COVID MANAGER")
@Path("/game")
public class VRManagerService {
    private VRManagerImpl manager;

    public VRManagerService(){
        manager = VRManagerImpl.getInstance();
        if(manager.getUsuarios().size() == 0 ){
            manager.setUpResources();
        }
    }

























}
