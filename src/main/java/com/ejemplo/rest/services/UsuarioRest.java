/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.rest.services;

import com.ejemplo.jpa.entities.Usuario;
import com.ejemplo.jpa.sessions.UsuarioSession;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author adsi1
 */
@Path("usuarios")
@Stateless
public class UsuarioRest {
    @EJB
    UsuarioSession usuarioSession;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Usuario> findAll(){
        return usuarioSession.findAll();
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void create (Usuario usuario){
        usuarioSession.create(usuario);
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public void update(@PathParam("id")Integer id, Usuario usuario){
        usuarioSession.update(usuario);
    }
}
