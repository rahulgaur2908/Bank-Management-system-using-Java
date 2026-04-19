import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.util.*;
//import com.toedter.calendar.JDateChooser;

public class SignUpone extends JFrame {

    SignUpone() {

        setLayout(null);

        Random ran = new Random();
        long random = Math.abs((ran.nextLong() % 9000L) + 1000l);

         // Adding a label for the APPLICATION FORM input field.

        JLabel formNo = new JLabel("APPLICATION FORM NO: " + random);
        formNo.setFont(new Font("Raleway", Font.BOLD, 38));
        formNo.setBounds(140, 20, 600, 40);
        add(formNo);

        // Adding a label for the Personal Details input field.

        
        JLabel PD = new JLabel("Page 1: Personal Details");
        PD.setFont(new Font("Raleway", Font.BOLD, 22));
        PD.setBounds(290, 80, 400, 30);
        add(PD);

        // Adding a label for the AName input field.

        
        JLabel name = new JLabel("Name: ");
        name.setFont(new Font("Raleway", Font.BOLD, 22));
        name.setBounds(100, 140, 200, 30);
        add(name);

        // Adding a text field for the Name input.

        JTextField nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);

        // Adding a label for the Father's Name input field.

        JLabel fname = new JLabel("Father's Name: ");
        fname.setFont(new Font("Raleway", Font.BOLD, 22));
        fname.setBounds(100, 190, 200, 30);
        add(fname);

        // Adding a text field for the Father's Name input.

        JTextField faTextField = new JTextField();
        faTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        faTextField.setBounds(300, 190, 400, 30);
        add(faTextField);

        // Adding a label for the Date Of Birth (DOB) input field.

        JLabel DOB = new JLabel("Date Of Birth: ");
        DOB.setFont(new Font("Raleway", Font.BOLD, 22));
        DOB.setBounds(100, 240, 200, 30);
        add(DOB);

        /*JDateChooser dc = new JDateChooser();
        dc.setBounds(300, 240, 400, 30);
        dc.setForeground(new Color(105, 105, 105));
        dc.setDateFormatString("dd-MM-yyyy");
        add(dc);*/

        // Adding a label for the Gender input field.

        JLabel gen = new JLabel("Gender: ");
        gen.setFont(new Font("Raleway", Font.BOLD, 22));
        gen.setBounds(100, 290, 200, 30);
        add(gen);

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(300, 290, 60,  30);
        male.setBackground(Color.WHITE);
        add(male);


        JRadioButton female = new JRadioButton("Female");
        female.setBounds(450, 290, 120,  30);
        female.setBackground(Color.WHITE);
        add(female);

        ButtonGroup gendeGroup = new ButtonGroup();
        gendeGroup.add(male);
        gendeGroup.add(female);

        // Adding a label for the Email Address input field.

        JLabel emadd = new JLabel("Email Address: ");
        emadd.setFont(new Font("Raleway", Font.BOLD, 22));
        emadd.setBounds(100, 340, 200, 30);
        add(emadd);

        // Adding a text field for the Email Address input.

        JTextField emTextField = new JTextField();
        emTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        emTextField.setBounds(300, 340, 400, 30);
        add(emTextField);

        // Adding a label for the Marital Status input field.

        JLabel mstat = new JLabel("Marital Status: ");
        mstat.setFont(new Font("Raleway", Font.BOLD, 22));
        mstat.setBounds(100, 390, 200, 30);
        add(mstat);

        
        JRadioButton married = new JRadioButton("Married");
        married.setBounds(300, 390, 100,  30);
        married.setBackground(Color.WHITE);
        add(married);

        JRadioButton unmarried = new JRadioButton("UnMarried");
        unmarried.setBounds(450, 390, 100,  30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);

        JRadioButton other = new JRadioButton("Other");
        other.setBounds(630, 390, 100,  30);
        other.setBackground(Color.WHITE);
        add(other);

        
        ButtonGroup Maritalgroup= new ButtonGroup();
        Maritalgroup.add(married);
        Maritalgroup.add(unmarried);
        Maritalgroup.add(other);


        // Adding a label for the Address input field.

        JLabel add = new JLabel("Address: ");
        add.setFont(new Font("Raleway", Font.BOLD, 22));
        add.setBounds(100, 440, 200, 30);
        add(add);

        // Adding a text field for the Address input.

        JTextField adTextField = new JTextField();
        adTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        adTextField.setBounds(300, 440, 400, 30);
        add(adTextField);

        // Adding a label for the City input field.

        JLabel city = new JLabel("City: ");
        city.setFont(new Font("Raleway", Font.BOLD, 22));
        city.setBounds(100, 490, 200, 30);
        add(city);

        // Adding a text field for the City input.

        JTextField cTextField = new JTextField();
        cTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        cTextField.setBounds(300, 490, 400, 30);
        add(cTextField);

        // Adding a label for the State input field.

        JLabel st = new JLabel("State: ");
        st.setFont(new Font("Raleway", Font.BOLD, 22));
        st.setBounds(100, 540, 200, 30);
        add(st);

        // Adding a text field for the State input.

        JTextField sTextField = new JTextField();
        sTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        sTextField.setBounds(300, 540, 400, 30);
        add(sTextField);

        // Adding a label for the Pin Code input field.
        
        JLabel pincd = new JLabel("Pin Code: ");
        pincd.setFont(new Font("Raleway", Font.BOLD, 22));
        pincd.setBounds(100, 590, 200, 30);
        add(pincd);

        // Adding a text field for thePin Code input.

        JTextField pTextField = new JTextField();
        pTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        pTextField.setBounds(300, 590, 400, 30);
        add(pTextField);

        JButton next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 630, 80, 30);
        add(next);

        getContentPane().setBackground(Color.WHITE);
    
        setSize(850, 750);
        setLocation(350, 10);
        setVisible(true);
    }

    public static void main(String args[]) {
        new SignUpone();    

      
    }
}
    

