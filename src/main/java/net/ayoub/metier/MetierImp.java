package net.ayoub.metier;

import net.ayoub.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImp implements IMetier{
    @Autowired
    private IDao dao ; // couplage faible (depend des interfaces mais pas des classes)
//injection des  dependances par le constructeur avec parametre

    public MetierImp(IDao dao) {
        this.dao = dao;
    }
// injection des dependances en utilisant le setters

    public MetierImp() {
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double temp = dao.getData();
        return temp*4/2*Math.cos(temp)+Math.PI;
    }
}
