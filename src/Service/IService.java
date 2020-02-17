/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author HP
 */
public interface IService<T> {
    boolean insert(T t);
    boolean update(T t);
    boolean delete(T t);
    List<T> displayAll();
    ResultSet display(String v);

    
}
