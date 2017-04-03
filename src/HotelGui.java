import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ruhul on 3/29/2017.
 *
 */
public class HotelGui {
    JFrame homeMenu = new JFrame("Home");
    JLabel image = new JLabel(new ImageIcon("C:\\jimage\\hotel.jpg"));
    JFrame login = new JFrame("Login");
    JTextField userName = new JTextField("Enter UserName");
    JTextField passWord = new JTextField("Enter PassWord");
    JButton loginNow = new JButton("Login");
    JFrame bookingmenu = new JFrame("Booking info");
    int flag=0;
    int floorNumber;
    JLabel error = new JLabel("Enter login info",SwingConstants.CENTER);
    JComboBox floor = new JComboBox();
    JComboBox room = new JComboBox();
    public HotelGui()
    {

        homeMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homeMenu.setLayout(null);
        homeMenu.setVisible(true);
        homeMenu.setSize(500,700);

        JButton booking = new JButton("Booking");
        homeMenu.add(booking);
        booking.setVisible(true);
        booking.setBounds(180,150,150,30);
        booking.setBackground(Color.green);

        JButton booked = new JButton("Booked");
        booked.setBackground(Color.green);
        booked.setVisible(true);
        homeMenu.add(booked);
        booked.setBounds(180,250,150,30);

        JButton info = new JButton("Contact Info");
        info.setBackground(Color.green);
        info.setVisible(true);
        homeMenu.add(info);
        info.setBounds(180,350,150,30);

        homeMenu.add(image);
        image.setVisible(true);
        image.setBounds(0,0,500,700);

        booking.addActionListener(new bookingSelection());


    }

    public class bookingSelection implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            login.setSize(500,700);
            login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            login.setLayout(null);



            userName.setVisible(true);
            userName.setBounds(180,150,150,30);
            userName.setBackground(Color.green);
            login.add(userName);


            passWord.setVisible(true);
            passWord.setBounds(180,250,150,30);
            passWord.setBackground(Color.green);
            login.add(passWord);


            loginNow.setVisible(true);
            loginNow.setBounds(180,350,150,30);
            loginNow.setBackground(Color.green);
            login.add(loginNow);

            error.setVisible(true);
            error.setBounds(0,401,500,30);
            error.setForeground(Color.red);
            error.setFont(new Font("Courier New", Font.BOLD, 18));
            login.add(error);


            homeMenu.dispose();
            login.setVisible(true);
            login.add(image);
            image.setVisible(true);
            image.setBounds(0,0,500,700);
            flag=1;


            loginNow.addActionListener(new bookingMenu());

        }

        public class bookingMenu implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user= userName.getText();
                String pass = passWord.getText();
                if(user.equals("admin")&&pass.equals("admin")) {
                    bookingmenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    bookingmenu.setVisible(true);
                    bookingmenu.setSize(500,700);


                    String[] floor1 = {"1st","2nd","3rd"};
                    floor = new JComboBox(floor1);
                    bookingmenu.add(floor);
                    floor.setVisible(true);
                    floor.setBounds(180,50,150,30);
                    floor.setBackground(Color.green);

                    JButton Done = new JButton("Done");
                    Done.setBounds(180,100,150,30);
                    bookingmenu.add(Done);
                    Done.setVisible(true);
                    Done.addActionListener(new roomChoose());


                    login.dispose();
                    bookingmenu.setLayout(null);
                    image.setVisible(true);
                    image.setBounds(0, 0, 500, 700);


                    bookingmenu.add(image);

                }
                else {
                    error.setBounds(0,401,500,30);
                    error.setText("Enter correct login info");
                }



            }

            private class roomChoose implements ActionListener {
                @Override
                public void actionPerformed(ActionEvent e) {
                    floorNumber = floor.getSelectedIndex();
                    if(floorNumber==0)
                    {

                        String[] room1 = {"101","102","103","104"};
                        JComboBox room2 = new JComboBox(room1);
                        bookingmenu.add(room2);
                        room2.setVisible(true);
                        room2.setBounds(180,300,150,30);
                        room2.setBackground(Color.green);
                        room.setVisible(false);
                    }
                    else if(floorNumber==1)
                    {
                        String[] room1 = {"201","202","203","204"};
                        JComboBox room2 = new JComboBox(room1);
                        bookingmenu.add(room2);
                        room2.setVisible(true);
                        room2.setBounds(180,300,150,30);
                        room2.setBackground(Color.green);
                        room.setVisible(false);
                    }
                    else if(floorNumber==2)
                    {
                        String[] room1 = {"301","302","303","304"};
                        JComboBox room2 = new JComboBox(room1);
                        bookingmenu.add(room2);
                        room2.setVisible(true);
                        room2.setBounds(180,300,150,30);
                        room2.setBackground(Color.green);
                        room.setVisible(false);

                    }
                }
            }
        }
        }
}


