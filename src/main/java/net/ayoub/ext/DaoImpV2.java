package net.ayoub.ext;

import net.ayoub.dao.IDao;
import org.springframework.stereotype.Component;

@Component("d2")
public class DaoImpV2 implements IDao {
    public DaoImpV2() {
    }

    @Override
    public double getData() {
        System.out.println("version capteur ..");
        double temp = 15;
        return temp;
    }
}
