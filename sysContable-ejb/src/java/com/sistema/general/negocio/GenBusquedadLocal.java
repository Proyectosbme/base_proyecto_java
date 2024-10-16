package com.sistema.general.negocio;

import com.sistema.general.entidades.Genpersonas;
import com.sistema.general.entidades.Genpuntoventas;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import javax.ejb.Local;

/**
 * Interfaz para operaciones de búsqueda genérica.
 *
 * @param <T> el tipo de entidad
 */
@Local
public interface GenBusquedadLocal<T> {

    /**
     * Busca una entidad por su clave primaria.
     *
     * @param <T> el tipo de entidad
     * @param entityClass la clase de la entidad
     * @param id la clave primaria de la entidad
     * @return la entidad encontrada, o null si no se encontró
     * @throws Exception si ocurre un error durante la búsqueda
     */
    public <T> T buscarPorPK(Class<T> entityClass, Object id) throws NullPointerException, Exception;

    /**
     * Busca todas las entidades de una tabla.
     *
     * @param <T> el tipo de entidad
     * @param entityClass la clase de la entidad
     * @return una lista de todas las entidades de la tabla
     */
    public <T> List<T> buscarTodos(Class<T> entityClass) throws NullPointerException, Exception;

    /**
     * Cuenta el número de filas de una tabla.
     *
     * @param entityClass la clase de la entidad
     * @return el número de filas de la tabla
     */
    public BigInteger contarFilas(Class<?> entityClass) throws NullPointerException, Exception;

    /**
     * Obtiene el siguiente valor de correlativo para una entidad especificada.
     *
     * @param nombreEntidad el nombre de la entidad para la cual se desea
     * obtener el correlativo
     * @return el siguiente valor de correlativo
     * @throws ValidacionesException si no se encuentra la entidad en la base de
     * datos
     * @throws NullPointerException si se produce una excepción de puntero nulo
     * @throws Exception si se produce una excepción no controlada
     */
    public BigInteger obtenerCorrelativo(String nombreEntidad)
            throws NullPointerException, Exception;
    
    
     public List<Genpuntoventas> buscarPuntoVenta(Map parametros) throws NullPointerException, Exception;
     
      public List<Genpersonas> buscarPersona(Map parametros) throws NullPointerException, Exception ;
}
