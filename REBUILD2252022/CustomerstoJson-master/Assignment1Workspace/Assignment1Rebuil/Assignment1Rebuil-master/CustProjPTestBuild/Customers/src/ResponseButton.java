

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;




public class ResponseButton extends JFrame  {
    // setting up some important refernces
    JTextField Customer;
    JTextField email;
    JButton submitbtn;
    JPasswordField password;
    JLabel userLabel;
    JLabel emailLabel;
    JLabel passwordLabel;

    // creating Font for the JtextFields and Jlabels
    Font myFavFont;

   ResponseButton(){
       Customer = new JTextField();
        email = new JTextField();
        password = new JPasswordField();

        userLabel = new JLabel("Name:");
        emailLabel = new JLabel("Email:");
        passwordLabel = new JLabel("Password:");

        submitbtn = new JButton("Submit");
        submitbtn.setBackground(Color.blue);
        submitbtn.setForeground(Color.white);

        // the constructor accpts three parametters
        myFavFont = new Font("MV BOli",Font.BOLD,25);


        userLabel.setBounds(10,20,110,30);
        emailLabel.setBounds(10,60,110,30);
        passwordLabel.setBounds(10,100,130,30);

        Customer.setBounds(140,20,350,30);
        email.setBounds(140,60,350,30);
        password.setBounds(140,100,350,30);

        submitbtn.setBounds(250,150,100,30);

        Customer.setFont(myFavFont);
        email.setFont(myFavFont);
        // the character that is used in the password field
        password.setEchoChar('*');

        // setting up the fonts
        passwordLabel.setFont(myFavFont);
        userLabel.setFont(myFavFont);
        emailLabel.setFont(myFavFont);
       Customer.setBackground(Color.cyan);
        password.setBackground(Color.cyan);
        email.setBackground(Color.cyan);
        password.setFont(myFavFont);


        // adding components to the JFrame
        this.add(Customer);
        this.add(email);
        this.add(password);
        this.add(userLabel);
        this.add(emailLabel);
        this.add(passwordLabel);
        this.add(submitbtn);

        // lets register our JtextFiedls with the
        // DocumentListner interface when some event
        // occur on these text field then it will be
        // handled by the following  Methods.


        Customer.getDocument().addDocumentListener
                (new TextFiledEventHandler(Customer));
        email.getDocument().addDocumentListener
                (new TextFiledEventHandler(email));
        password.getDocument().addDocumentListener
                (new TextFiledEventHandler(password));



        this.setTitle("Login Form");
        this.setIconImage(new ImageIcon("Images/icon.png").getImage());
        this.setResizable(false);

        this.setSize(new Dimension(600,550));
        this.setLocation(new Point(500,300));
        this.setLayout(null);
        this.getContentPane().setBackground(Color.PINK);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        }

    public static void main (String[] args) {
        ResponseButton test = new ResponseButton();
    }

    // creating inner class to make it easier to pass parameter
    private class TextFiledEventHandler implements DocumentListener{

        JTextField textField;
        TextFiledEventHandler(JTextField textField){
            this.textField = textField;
        }

        @Override
        public void insertUpdate (DocumentEvent e) { 
        textField.setBorder(BorderFactory.createLineBorder(Color.green));
        }

        @Override
        public void removeUpdate (DocumentEvent e) {
        textField.setBorder(BorderFactory.createLineBorder(Color.red));
        }

        @Override
        public void changedUpdate (DocumentEvent e) {
        textField.setBorder(BorderFactory.createLineBorder(Color.BLUE));

        }
    }
}