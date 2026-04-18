import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{

    // Globally defining the Butoons and TextFields so that we can use these button outside the constructor.

    JButton login, clear, signup;
    JTextField cardTextField, pinTextField;
    JPasswordField pinTextField1;


    // Constructor for Login class.

    Login(){

        // Setting the title of the JFrame.

        setTitle("AUTOMATED TELLER MACHINE");

        // Setting the layout of the JFrame to null for absolute positioning.

        setLayout(null);

        // Adding an image to the JFrame using ImageIcon and JLabel.

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Bank Logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Label = new JLabel(i3);
        Label.setBounds(70, 10, 100, 100);
        add(Label);

        // Adding text labels for the welcome message, card number, and PIN.

        JLabel text = new JLabel("WELCOME TO ATM");
        text.setFont(new Font("Osward", Font.BOLD, 40));
        text.setBounds(200, 40, 400, 40);
        add(text);

        // Adding a label for the card number input field.

        JLabel cardno = new JLabel("CARD NO: ");
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        cardno.setBounds(120, 150, 150, 30);
        add(cardno);

        // Adding a text field for the card number input.

        cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 230, 30);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 15));
        add(cardTextField);

        // Adding a label for the PIN input field.

        JLabel pin = new JLabel("PIN: ");
        pin.setFont(new Font("Raleway", Font.BOLD, 30));
        pin.setBounds(120, 220, 250, 30);
        add(pin);

        pinTextField = new JPasswordField(); 
        pinTextField.setBounds(300, 220, 230, 30);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 15));
        add(pinTextField);

        // Adding a Button for Sign in by using Jbutton class.

        login = new JButton("SIGN IN");
        login.setBounds(300, 280, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        // Adding a Button for clear the written input by using Jbutton class.

        clear = new JButton("CLEAR");
        clear.setBounds(430, 280, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("SIGN UP");
        signup.setBounds(300, 330, 230, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);



        // Setting the background color of the content pane to white.

        getContentPane().setBackground(Color.WHITE);

        // Setting the size of the JFrame, making it visible, and setting its location on the screen.

        setSize(800, 450);
        setVisible(true);
        setLocation(350,200);
    }

    // 

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == clear){
            pinTextField.setText("");
            cardTextField.setText("");

         } else if (ae.getSource() == login){


         } else if (ae.getSource() == signup){

         }
       


    }

    public static void main(String[] args){
        new Login();

    }

   
    }
    
