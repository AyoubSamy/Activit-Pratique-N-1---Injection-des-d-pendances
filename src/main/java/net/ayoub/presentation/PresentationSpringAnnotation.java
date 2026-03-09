package net.ayoub.presentation;

import net.ayoub.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.net.Inet4Address;
import java.net.Inet6Address;

public class PresentationSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("net.ayoub");

        IMetier metier = context.getBean(IMetier.class);

        System.out.println("Resultat = " +metier.calcul());
    }
}
