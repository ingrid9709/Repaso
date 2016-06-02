package com.ejemplo.jpa.entities;

import com.ejemplo.jpa.entities.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-02T10:50:56")
@StaticMetamodel(Kripa.class)
public class Kripa_ { 

    public static volatile SingularAttribute<Kripa, Integer> idKripa;
    public static volatile SingularAttribute<Kripa, String> tipo;
    public static volatile SingularAttribute<Kripa, Integer> precio;
    public static volatile ListAttribute<Kripa, Usuario> usuarioList;
    public static volatile SingularAttribute<Kripa, String> nombre;
    public static volatile SingularAttribute<Kripa, Integer> tamano;

}