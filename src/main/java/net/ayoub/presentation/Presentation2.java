package net.ayoub.presentation;

import net.ayoub.dao.IDao;
import net.ayoub.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;
//instanciation dynamique
public class Presentation2 {
   public static void main (String[] args) throws Exception {
       Scanner scanner = new Scanner(new File("config.txt"));
       String daoClassName = scanner.nextLine();
       Class cDao = Class.forName(daoClassName);
       IDao iDao =(IDao) cDao.newInstance();

       String metierClassName = scanner.nextLine();
       Class cMetier = Class.forName(metierClassName);
       IMetier iMetier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(iDao);


       System.out.println("Resultats = "+iMetier.calcul());
   }
}
