
package Classes;

import java.awt.Color;
import javax.swing.JTextField;

/**
 * A class used validate the data that the user has entered
 * @author Mr S Malinga(218021100)
 */

public class dataValidation {

    /**
     * Constructor used to declare a dataValidation object
     */
    
    public dataValidation() 
    {

    }

    /**
     * A method used to return true or false whether the length of an entered value is the parameter value
     * @param text
     * @param length
     * @return 
     */
    
    public boolean equalLength(JTextField text, int length) 
    {
        boolean temp = false;

        if (text.getText().length() == length) 
        {
            temp = true;
        }
        return temp;
    }

    /**
     * A method used to return true or false whether the correct time format is used
     * @param text
     * @return 
     */
    
    public boolean checkTimeFormat(JTextField text) 
    {
        boolean temp = false;
        String time = text.getText();

        if (equalLength(text, 5) == true) 
        {
            if (Character.isDigit(time.charAt(0)) && Character.isDigit(time.charAt(1)) && time.charAt(2) == ':' && Character.isDigit(time.charAt(3)) && Character.isDigit(time.charAt(4))) 
            {
                temp = true;
            }
            else
            {
                text.setForeground(Color.red);
            }
        }
        else
        {
            text.setForeground(Color.red);
        }
        return temp;
    }

    /**
     * A method used to return true or false whether a text field is filled in or left empty
     * @param text
     * @return 
     */
    
    public boolean presenceCheck(JTextField text) 
    {
        boolean temp = true;

        if (text.getText().equals("")) 
        {
            temp = false;
            text.setForeground(Color.red);
        }

        return temp;
    }

    /**
     * A method used to return true or false depending on if there are numbers or not
     * @param txt
     * @return 
     */
    
    public boolean formatCheckNames(JTextField txt) 
    {
        String num = "123456789!@#$%^&*()_+=-{}[]:;<>,./?";
        boolean temp = true;

        for (int i = 0; i < num.length(); i++) 
        {
            for (int j = 0; j < txt.getText().length(); j++) 
            {
                if (txt.getText().charAt(j) == num.charAt(i)) 
                {
                    temp = false;
                    txt.setForeground(Color.red);
                }
            }
        }

        return temp;
    }

    /**
     * A method used to return true or false depending on if the String contains letters or not
     * @param txt
     * @return 
     */
    
    public boolean formatCheckNumbers(JTextField txt)
    {
        boolean temp = true;
        try
        {
            String numbers = txt.getText();
            
            for (int i = 0; i < numbers.length(); i++)
            {
                if (!(Character.isDigit(numbers.charAt(i))))
                {
                    temp = false;
                    txt.setForeground(Color.red);
                }
            }
            
        }
        
        catch (Exception ex)
        {
            
        }
        return temp;
    }

    /**
     * A method used to return true or false to check if the email has an '@' sign or not
     * @param txt
     * @return 
     */
    
    public boolean checkEmail(JTextField txt) 
    {
        boolean temp = false;

        if (txt.getText().contains("@")) 
        {
            temp = true;
        }
        else
        {
            txt.setForeground(Color.red);
        }

        return temp;
    }

    /**
     * A method used to return true or false to validate whether the email has an '@' sign and is present
     * @param txt
     * @return 
     */
    
    public boolean validateEmail(JTextField txt) 
    {
        boolean temp = false;

        if (checkEmail(txt) == true && presenceCheck(txt) == true) 
        {
            temp = true;
        }
        else
        {
            txt.setForeground(Color.red);
        }
        return true;
    }

    /**
     * A method used to validate whether the cellphone number has only 10 digits and only contain numbers
     * @param txt
     * @return 
     */
    
    public boolean validateCell(JTextField txt) 
    {
        boolean temp = false;

        if (equalLength(txt, 10) == true && formatCheckNumbers(txt) == true) 
        {
            temp = true;
        }
        else
        {
            txt.setForeground(Color.red);
        }
        
        return temp;
    }
}
