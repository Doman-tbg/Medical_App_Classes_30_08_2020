package pl.sda.entity;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class SessionFactoryTest {

    @Test
    public void test() {


        SessionFactory sessionFactory = new Configuration (  )
                .configure()
                .buildSessionFactory();

        sessionFactory.close();

    }

}