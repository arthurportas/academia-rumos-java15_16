/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import pt.rumos.staffgest.models.Person;

/**
 *
 * @author Utilizador
 */
public interface Crud {
 
    void persist(Person person);//create
    void findAll();//read
    Person update(Person person);//update
    void delete(Person person);//delete
    
}
