package net.ayoub.presentation;

import net.ayoub.ext.DaoImpV2;
import net.ayoub.metier.MetierImp;

// instansiation statique
public class Presentation1 {
    public static void main(String[] args) {
        DaoImpV2 d = new DaoImpV2();
        MetierImp metierImp = new MetierImp(d);
        System.out.println("Resultats = "+metierImp.calcul());
    }
}