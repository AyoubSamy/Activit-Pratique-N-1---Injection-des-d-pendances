package net.ayoub.dao;

public class DaoImpl implements IDao{
    public DaoImpl() {
    }

    @Override
    public double getData() {
        System.out.println("Version base de donnee .");
        double temp = 23;
        return temp;
    }

}
