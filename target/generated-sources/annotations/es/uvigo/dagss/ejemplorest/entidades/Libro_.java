package es.uvigo.dagss.ejemplorest.entidades;

import es.uvigo.dagss.ejemplorest.entidades.Autor;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-12-17T16:01:26")
@StaticMetamodel(Libro.class)
public class Libro_ { 

    public static volatile SingularAttribute<Libro, Long> id;
    public static volatile SingularAttribute<Libro, String> titulo;
    public static volatile SingularAttribute<Libro, Date> fecha;
    public static volatile SingularAttribute<Libro, Integer> numeroPaginas;
    public static volatile SetAttribute<Libro, Autor> autores;

}