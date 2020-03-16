/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejbs;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.annotation.PostConstruct;
import javax.ejb.Stateful;

/**
 *
 * @author Анюта
 */
@Stateful
public class EJB implements EJBDemo {

    private static boolean isRegistred;
    private static int count;
    private Properties properties=new Properties();

    /**
     * Get the value of isRegistred
     *
     * @return the value of isRegistred
     */
    public static boolean getIsRegistred() {
        return isRegistred;
    }

    @Override
    public boolean login(String login, String psw) {
        return false;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @Override
    public String getMessage(String login) {
        return properties.getProperty("goodMsg","RRRE");
    }

    @PostConstruct
    private void init() {
        try (InputStream is
                = getClass().getClassLoader()
                        .getResourceAsStream("conf/properties.properties");) {
                    properties.load(is);
                    System.out.println("!!!!!!!!!!!!!!\n");
                    System.out.println(properties.toString());
                    System.out.println("!!!!!!!!!!!!!!\n");
                } catch (IOException ex) {
                    System.out.println("ERRRORRRR!!");;
                }
    }
}
