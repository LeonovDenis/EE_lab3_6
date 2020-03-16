/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejbs;

import java.util.Properties;
import javax.ejb.Stateful;

/**
 *
 * @author Анюта
 */
@Stateful
public class EJB implements EJBDemo {

    private static boolean isRegistred;
    private static int count;
    private Properties properties;

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
        return "Test";
    }
}
