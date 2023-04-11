import java.awt.*;
import java.awt.event.*;

class MyFirstFrame extends Frame implements ActionListener
{

    final TextField tf=new TextField();
    final TextField tf1 =new TextField();
    final TextField tf3 = new TextField();
    final TextField tf2 = new TextField();
    final TextField tf4 = new TextField();
    final TextField tf5 = new TextField();

    Label l1 =  new Label("First Name");
    Label l3=  new Label("Last Name");
    Label l2=  new Label("Age");
    Label l4=  new Label("SSC Score");
    Label l5=  new Label(" HSC Score");
    MyFirstFrame()


    {

        Frame f=new Frame("ActionListener Example");
        Button b=new Button("Save");

        l1.setBounds(50,50,160,30);

        l3.setBounds(50,90,160,50);
        tf3.setBounds(200, 100, 150, 30);

        l2.setBounds(50,130,160,70);
        tf2.setBounds(200, 150, 150, 30);

        l4.setBounds(50,170,160,90);
        tf4.setBounds(200, 200, 150, 30);

        l5 .setBounds(50,210,160,110);
        tf5.setBounds(200, 250, 150, 30);

        tf1.setBounds(200,50, 150,30);
        b.setBounds(150,300,60,30);
        b.addActionListener(this);


        f.add(b);
        f.add(tf);
        f.add(l1);
        f.add(tf1);
        f.add(l1);
        f.add(tf2);
        f.add(l3);
        f.add(tf3);
        f.add(l2);
        f.add(tf4);
        f.add(l4);
        f.add(tf5);
        f.add(l5);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }


    public void actionPerformed(ActionEvent e)
    {
        /* tf.setText("Creating another frame.");*/

        Frame f1=new Frame("ActionListener Example");
        Button b1=new Button("ok");
        tf.setBounds(50,50, 150,20);





        f1.add(tf1);
        f1.add(l1);
        f1.add(tf2);
        f1.add(l3);
        f1.add(tf3);
        f1.add(l2);
        f1.add(tf4);
        f1.add(l4);
        f1.add(tf5);
        f1.add(l5);
        f1.add(tf);


        f1.setSize(500,500);
        f1.setLayout(null);
        f1.setVisible(true);

    }



    public static void main(String args[])
    {

        MyFirstFrame mff = new MyFirstFrame();
}
}
