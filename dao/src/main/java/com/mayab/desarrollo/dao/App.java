package com.mayab.desarrollo.dao;
import java.util.List;

import com.mayab.desarrollo.entities.User;
import com.mayab.desarrollo.persistencia.UserDAO;
import com.mayab.desarrollo.persistencia.UserDAOImp;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        User alumno1 = new User(1,"elrayodev","11111111","pass1234");
        User alumno2 = new User(2,"elrayodev1","22222222","pass1234");
        User alumno3 = new User(3,"elrayodev2","33333333","pass1234");
        UserDAO dao = new UserDAOImp();
        
        dao.insert(alumno1);
        dao.insert(alumno2);
        dao.insert(alumno3);
        
        List<User> todos = dao.findAll();
        
        for(User u:todos)
        {
        	System.out.println("Nombre = " + u.getName() + " Tel = " + u.getTel());
        }
    }
}
