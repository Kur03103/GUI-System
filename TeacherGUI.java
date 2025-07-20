import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;
import java.util.*;


public class TeacherGUI{
   
    ArrayList<Teacher> t_List = new ArrayList();
   
    public void Open()
    {
        JFrame frame = new JFrame("Coursework Gui");
        
        frame.setLayout(null);
        frame.setSize(660,660);
        
        Font Font_1 = new Font("Comic Sans MS", Font.BOLD, 30);//Adding font
        Font Font_2 = new Font("Cambria", Font.BOLD, 20);
        Font Font_3 = new Font("Arial Narrow", Font.BOLD, 15);
        Color Grey = new Color(229, 228, 226);
        
        JPanel panel = new JPanel();
        panel.setBounds(0,0,660,660);
        panel.setLayout(null);
        panel.setBackground(Grey);
        
        JLabel j_1 = new JLabel("Welcome to my program.");
        j_1.setBounds(100,0,500,100);
        j_1.setFont(Font_1);
        
        JLabel j_2 = new JLabel("Click here to Access Lecturer !");
        j_2.setBounds(56,280,500,100);
        j_2.setFont(Font_3);
        
        JLabel j_3 = new JLabel("Click here to Access Tutuor !");
        j_3.setBounds(356,280,500,100);
        j_3.setFont(Font_3);
        
        JLabel j_4 = new JLabel("©2024 - Aayush Sapkota- All rights reserved");
        j_4.setBounds(210,530,500,100);
        j_4.setFont(Font_3);
        
        JButton b_1 = new JButton("Lecturer");
        b_1.setBounds(50,205,250,90);
        b_1.setFont(Font_2);
        b_1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                frame.dispose();
                lecturer();
            }
        });
        
        JButton b_2 = new JButton("Tutor");
        b_2.setBounds(340,205,250,90);
        b_2.setFont(Font_2);
        b_2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                frame.dispose();
                tutor();      
            }
        });
        
        panel.add(j_1);
        panel.add(j_2);
        panel.add(j_3);
        panel.add(j_4);
        panel.add(b_1);
        panel.add(b_2);
        frame.add(panel);
        frame.setVisible(true);
    }
    
    public void lecturer()
    {
    //----------------------------------------------------------------------------------------------------        
    JFrame frame = new JFrame("Coursework GUI");// making frame to include all the necessary button,text area/feild.
    frame.getContentPane().setBackground(Color.RED);
    JPanel panel = new JPanel();
    panel.setBounds(0,0,700,600);
    panel.setLayout(null);
    panel.setBackground(new Color(229, 228, 226));

   
    Font Font_1 = new Font("Comic Sans MS", Font.BOLD, 20);//Adding font
    Font Font_2 = new Font("Century", Font.BOLD, 8);
    Font_2= Font_2.deriveFont(Font_2.getSize() + 6f);
    //--------------------------------------------------------------------------
   
   
   
   
    //////-----------------Section 1(Label and text feild for lecturer) -----------------------------------///
   
    /////adding all label and their respective text feilds//////////
   
   
    //-------------------------------------------------------------------------
    JLabel jl_1 = new JLabel("Lecturer");
    jl_1.setBounds(250,0,300,70);
    jl_1.setFont(Font_1);
    //-------------------------------------------------------------------------
   
   
    //----------------------------------------------------------------------
    JLabel jl_2 = new JLabel("Teacher ID :- ");
    jl_2.setBounds(20,50,100,70);
   
    JTextField jt_1 = new JTextField("");
    jt_1.setBounds(175,65,190,30);
   
    jl_2.setFont(Font_2);
   
   
    //----------------------------------------------------------------------
   
    //---------------------------------------------------------------------
    JLabel jl_3 = new JLabel("Teacher Name :-");
    jl_3.setBounds(20,88,125,70);
   
    JTextField jt_2 = new JTextField("");
    jt_2.setBounds(175,110,190,30);
   
    jl_3.setFont(Font_2);
   
    //--------------------------------------------------------------------
   
   
    //---------------------------------------------------------------------
    JLabel jl_4 = new JLabel("Address:-");
    jl_4.setBounds(20,134,110,70);
   
    JTextField jt_3 = new JTextField("");
    jt_3.setBounds(175,155,190,30);
   
    jl_4.setFont(Font_2);
   
    //--------------------------------------------------------------------
   
   
    //---------------------------------------------------------------------
    JLabel jl_5 = new JLabel("Working Type:-");
    jl_5.setBounds(20,180,110,70);
   
    JTextField jt_4 = new JTextField("");
    jt_4.setBounds(175,200,190,30);
   
    jl_5.setFont(Font_2);
   
    //--------------------------------------------------------------------
   
    //---------------------------------------------------------------------
    JLabel jl_6 = new JLabel("Employment Status:-");
    jl_6.setBounds(20,226,150,70);
   
    JTextField jt_5 = new JTextField("");
    jt_5.setBounds(175,245,190,30);
   
    jl_6.setFont(Font_2);
   
    //--------------------------------------------------------------------
   
   
    //---------------------------------------------------------------------
    JLabel jl_7 = new JLabel("Department");
    jl_7.setBounds(20,272,130,70);
   
    JTextField jt_6 = new JTextField("");
    jt_6.setBounds(175,290,190,30);
   
    jl_7.setFont(Font_2);
   
    //--------------------------------------------------------------------
   
      //---------------------------------------------------------------------
    JLabel jl_8 = new JLabel("Year of Experince:-");
    jl_8.setBounds(20,318,150,70);
   
    JTextField jt_7 = new JTextField("");
    jt_7.setBounds(175,338,190,30);
   
    jl_8.setFont(Font_2);
   
    //--------------------------------------------------------------------
   
 
    //---------------------------------------------------------------------
    JLabel jl_9 = new JLabel("Graded Score:-");
    jl_9.setBounds(20,364,150,70);
   
    JTextField jt_8 = new JTextField("");
    jt_8.setBounds(175,385,190,30);
   
    jl_9.setFont(Font_2);
   
    //--------------------------------------------------------------------
   
    //////-------------------------Section 1 ends here---------------------/////
   
   
   
    /////-----------------------Section 2(Buttons for lecturer)---------------------////
   
    ////Adding button in the lecturer to make it responsive-----------------///
   
    //-----------------------------------------------------------------------
    JButton b_1 = new JButton("Change to tutor");
    b_1.setBounds(410,280,220,40);
    b_1.setFont(Font_2);
    b_1.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
    frame.dispose();
    tutor(); // Call the tutor method
    }
    });
   


   
   
    //--------------------------------------------------------------------
    JButton b_3 = new JButton("Grade Assignment");// Adding lecture and its textfeild
    b_3.setBounds(410,85,220,40);
    b_3.setFont(Font_2);
    b_3.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent ae) {
      if (jt_1.getText().isEmpty() || jt_2.getText().isEmpty() || jt_3.getText().isEmpty() || jt_4.getText().isEmpty() ||
      jt_5.getText().isEmpty() || jt_6.getText().isEmpty() || jt_7.getText().isEmpty() || jt_8.getText().isEmpty())
      {
          JOptionPane.showMessageDialog(null, "Fill the table");
         
      }
      else
      {
       
            try{
              int id = Integer.parseInt(jt_1.getText());
              String name = (jt_2.getText());
              String address = (jt_3.getText());
              String workingType = (jt_4.getText());
              String employmentStatus = (jt_5.getText());
              String department = (jt_6.getText());
              int experince = Integer.parseInt(jt_7.getText());
              int gradedScore = Integer.parseInt(jt_8.getText());
            
              Teacher teacher = new Lecturer(id,name,address,workingType,employmentStatus,department,experince,gradedScore);
              Lecturer lecturer = (Lecturer) teacher;
              t_List.add(lecturer);
            if (teacher.getTeacherId() == id){
                    JOptionPane.showMessageDialog(null, "teacher ID " + id + " \nYear of Experience " + experince +
                                "\nDepartment " + department+ " \nGraded Score:" + gradedScore+".");   
                                
                    lecturer.gradeAssignment(gradedScore,department,experince);
                }
            }
                  catch(NumberFormatException e){
                 JOptionPane.showMessageDialog(null, "Invalid output");
            }
        }
          
         
   
         
     
    }
    });
   
    //-----------------------------------------------------------------------------------
   
    //------------------------------------------------------------------------------------
    JButton b_4 = new JButton("Clear");// Adding lecture and its textfeild
    b_4.setBounds(485,450,150,40);
    b_4.setFont(Font_2);
    b_4.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
    jt_1.setText("");
    jt_2.setText("");
    jt_3.setText("");
    jt_4.setText("");
    jt_5.setText("");
    jt_6.setText("");
    jt_7.setText("");
    jt_8.setText("");
    JOptionPane.showMessageDialog(null, "Table Cleared");
    }
    });
    //------------------------------------------------------------------------------------
   
   
   
   
    //------------------------------------------------------------------------------------
    JButton b_5 = new JButton("Add Lecture");// Adding lecture and its textfeild
    b_5.setBounds(410,180,220,40);
    b_5.setFont(Font_2);
    b_5.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
      if (jt_1.getText().isEmpty() || jt_2.getText().isEmpty() || jt_3.getText().isEmpty() || jt_4.getText().isEmpty() ||
      jt_5.getText().isEmpty() || jt_6.getText().isEmpty() || jt_7.getText().isEmpty() || jt_8.getText().isEmpty())
      {
          JOptionPane.showMessageDialog(null, "Fill the table");
      }
      try{
          int id = Integer.parseInt(jt_1.getText());
          String name = (jt_2.getText());
          String address = (jt_3.getText());
          String workingType = (jt_4.getText());
          String employmentStatus = (jt_5.getText());
          String department = (jt_6.getText());
          int experince = Integer.parseInt(jt_7.getText());
          int gradedScore = Integer.parseInt(jt_8.getText());
       
      Lecturer l1 = new Lecturer(Integer.parseInt(jt_1.getText()),jt_2.getText(),jt_3.getText(),jt_4.getText(),jt_5.getText(),jt_6.getText(),Integer.parseInt(jt_7.getText()),Integer.parseInt(jt_8.getText()));
      t_List.add(l1);
      {
          JOptionPane.showMessageDialog(null,"added to table");
      }
    }
       
      catch (NumberFormatException ae){
                        JOptionPane.showMessageDialog(null, "Invalid input for numeric fields", "Error", JOptionPane.ERROR_MESSAGE);

                    }
    }
    });
    //------------------------------------------------------------------------------------
   
        //--------------------------------------------------------------------
    JButton b_2 = new JButton("Display");// Adding lecture and its textfeild
    b_2.setBounds(20,450,150,40);
    b_2.setFont(Font_2);
    b_2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
       for(Teacher t : t_List)
       {
           if(t instanceof Lecturer)
           {
               t.display();
           }
       }
    }
    });
   
    //-----------------------------------------------------------------------------------
   
    ////-----------------------Section 2 ends here!!!!-------------------------------------------////
   
   
   
    //-----------------------------Section 3(Frame for Lecturer)-------------------------------------------------------
   
    frame.setSize(700,600); // adding frame size
    frame.setVisible(true);// making it true so that all the content are visible in the frame
    frame.setLayout(null);// making it null so that all the item are correctly positioned where it is set
    //-----------------------------------------------------------------
   
    //-----------------------------------------------------------------
    //-------------------------------section 4---------------------
   
    frame.add(panel);//adding panel on frame
    panel.add(jl_1);// adding all the elemnets in the panel.
   
    panel.add(jl_2);
    panel.add(jt_1);
   
    panel.add(jl_3);
    panel.add(jt_2);
   
    panel.add(jl_4);
    panel.add(jt_3);
   
     
    panel.add(jl_5);
    panel.add(jt_4);
   
    panel.add(jl_6);
    panel.add(jt_5);
   
 
    panel.add(jl_7);
    panel.add(jt_6);
   
    panel.add(jl_8);
    panel.add(jt_7);
   
    panel.add(jl_9);
    panel.add(jt_8);
    //--------------------------------Section 4 ends ----------------------------------------------------
   
    //------------------------------------Section 5---------------------------------------------------
    panel.add(b_1);//adding button to the panel
    panel.add(b_2);
    panel.add(b_3);
    panel.add(b_4);
    panel.add(b_5);
    //------------------------------------Section 5 ends--------------------------------------------
    }
   
   
   
   
    //------------------------------Section 6(Tutor)----------------------------------
    public void tutor(){
    JFrame frame = new JFrame("Coursework GUI");// making frame to include all the necessary button,text area/feild for Tutor GUI.
    JPanel panel = new JPanel();
    panel.setBounds(0,0,700,640);
    panel.setLayout(null);
    panel.setBackground(new Color(229, 228, 226));
   
    Font Font_1 = new Font("Comic Sans MS", Font.BOLD, 20);
    Font Font_2 = new Font("Century", Font.BOLD, 8);
    Font_2= Font_2.deriveFont(Font_2.getSize() + 6f);
   
    //-------------------------------------------------------------------------
    //////-----------------Section 7(Label and text feild for Tutor) -----------------------------------///
   
    /////adding all label and their respective text feilds//////////
   
    JLabel jll_1 = new JLabel("Tutor");
    jll_1.setBounds(250,0,300,70);
    jll_1.setFont(Font_1);
    //-------------------------------------------------------------------------
   
    //----------------------------------------------------------------------
    JLabel jll_2 = new JLabel("Teacher ID :- ");
    jll_2.setBounds(20,50,100,70);
   
    JTextField jtt_1 = new JTextField("");
    jtt_1.setBounds(175,65,190,30);
   
    jll_2.setFont(Font_2);
   
   
    //----------------------------------------------------------------------
   
    //---------------------------------------------------------------------
    JLabel jll_3 = new JLabel("Teacher Name :-");
    jll_3.setBounds(20,88,125,70);
   
    JTextField jtt_2 = new JTextField("");
    jtt_2.setBounds(175,110,190,30);
   
    jll_3.setFont(Font_2);
   
    //--------------------------------------------------------------------
   
   
    //---------------------------------------------------------------------
    JLabel jll_4 = new JLabel("Address :-");
    jll_4.setBounds(20,134,110,70);
   
    JTextField jtt_3 = new JTextField("");
    jtt_3.setBounds(175,155,190,30);
   
    jll_4.setFont(Font_2);
   
    //--------------------------------------------------------------------
   
   
    //---------------------------------------------------------------------
    JLabel jll_5 = new JLabel("Working Type:-");
    jll_5.setBounds(20,180,110,70);
   
    JTextField jtt_4 = new JTextField("");
    jtt_4.setBounds(175,200,190,30);
   
    jll_5.setFont(Font_2);
   
    //--------------------------------------------------------------------
   
    //---------------------------------------------------------------------
    JLabel jll_6 = new JLabel("Employment Status:-");
    jll_6.setBounds(20,226,150,70);
   
    JTextField jtt_5 = new JTextField("");
    jtt_5.setBounds(175,245,190,30);
   
    jll_6.setFont(Font_2);
   
    //--------------------------------------------------------------------
   
   
    //---------------------------------------------------------------------
    JLabel jll_7 = new JLabel("Working Hour:-");
    jll_7.setBounds(20,272,130,70);
   
    JTextField jtt_6 = new JTextField("");
    jtt_6.setBounds(175,290,190,30);
   
    jll_7.setFont(Font_2);
   
    //--------------------------------------------------------------------
   
      //---------------------------------------------------------------------
    JLabel jll_8 = new JLabel("Salary:-");
    jll_8.setBounds(20,318,160,70);
   
    JTextField jtt_7 = new JTextField("");
    jtt_7.setBounds(175,338,190,30);
   
    jll_8.setFont(Font_2);
   
    //--------------------------------------------------------------------
   
 
    //---------------------------------------------------------------------
    JLabel jll_9 = new JLabel("Specialization:-");
    jll_9.setBounds(20,364,180,70);
   
    JTextField jtt_8 = new JTextField("");
    jtt_8.setBounds(175,385,190,30);
   
    jll_9.setFont(Font_2);
   
    //--------------------------------------------------------------------
   
   
    //---------------------------------------------------------------------
    JLabel jll_10 = new JLabel("Qualification:-");
    jll_10.setBounds(20,410,180,70);
   
    JTextField jtt_9 = new JTextField("");
    jtt_9.setBounds(175,429,190,30);
   
    jll_10.setFont(Font_2);
   
    //--------------------------------------------------------------------
   
   
   
    //---------------------------------------------------------------------
    JLabel jll_11 = new JLabel("Performance Index:-");
    jll_11.setBounds(20,456,180,70);
   
    JTextField jtt_10 = new JTextField("");
    jtt_10.setBounds(175,473,190,30);
   
    jll_11.setFont(Font_2);
   
    //-------------------------------section 6 ends here-------------------------------------
   
   
    /////-----------------------Section 7(Buttons for TUTOR)---------------------////
   
    ////Adding button in the TUTOR to make it responsive-----------------///
   
    JButton bb_1 = new JButton("Clear");
    bb_1.setBounds(20,550,150,40);
    bb_1.setFont(Font_2);
    bb_1.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
    jtt_1.setText("");
    jtt_2.setText("");
    jtt_3.setText("");
    jtt_4.setText("");
    jtt_5.setText("");
    jtt_6.setText("");
    jtt_7.setText("");
    jtt_8.setText("");
    jtt_9.setText("");
    jtt_10.setText("");
    }
    });
   

     
    JButton bb_3 = new JButton("Display");
    bb_3.setBounds(485,550,150,40);
    bb_3.setFont(Font_2);
    bb_3.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        for(Teacher t : t_List)
       {
           if(t instanceof Tutor)
           {
               t.display();
           }
       }
    }
   
    });  
    
    
    
   
   
    JButton bb_4 = new JButton("Set Salary");
    bb_4.setBounds(410,100,220,40);
    bb_4.setFont(Font_2);
    bb_4.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
   try {
            // Check if all fields are filled
            if (jtt_1.getText().isEmpty() || jtt_7.getText().isEmpty() || jtt_8.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Enter Teacher ID, New Salary, and New Performance Index.");
                return;
            }
              int id = Integer.parseInt(jtt_1.getText());
              String name = (jtt_2.getText());
              String address = (jtt_3.getText());
              String workingType = (jtt_4.getText());
              String employmentStatus = (jtt_5.getText());
              int workingHour = Integer.parseInt(jtt_6.getText());
              double salary = Double.parseDouble(jtt_7.getText());
              String special = (jtt_8.getText());
              String qualification = (jtt_9.getText()); 
              int index  = Integer.parseInt(jtt_10.getText());
              
              Teacher teacher = new Tutor(id,name,address,workingType,employmentStatus,workingHour,salary,special,qualification,index);
              Tutor tutor = (Tutor) teacher;
              t_List.add(tutor);
           
            if (teacher.getTeacherId() == id){ 
            
                JOptionPane.showMessageDialog(null, "teacher Id " + id + " \nSalary " + salary +
                                "\nPeformance Index " + index+".");   
            tutor.setSalary(salary,index);
        }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please enter valid numerical values for Teacher ID, Salary, and Performance Index.");
        }
    }
    });
   
    JButton bb_5 = new JButton("Add Tutor");
    bb_5.setBounds(410,180,220,40);
    bb_5.setFont(Font_2);
    bb_5.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
      if (jtt_1.getText().isEmpty() || jtt_2.getText().isEmpty() || jtt_3.getText().isEmpty() || jtt_4.getText().isEmpty() ||
      jtt_5.getText().isEmpty() || jtt_6.getText().isEmpty() || jtt_7.getText().isEmpty() || jtt_8.getText().isEmpty() || jtt_9.getText().isEmpty() || jtt_10.getText().isEmpty())
      {
          JOptionPane.showMessageDialog(null, "Fill the table");
      }
      try{
      int id = Integer.parseInt(jtt_1.getText());
              String name = (jtt_2.getText());
              String address = (jtt_3.getText());
              String workingType = (jtt_4.getText());
              String employmentStatus = (jtt_5.getText());
              int workingHour = Integer.parseInt(jtt_6.getText());
              double salary = Double.parseDouble(jtt_7.getText());
              String special = (jtt_8.getText());
              String qualification = (jtt_9.getText()); 
              int index  = Integer.parseInt(jtt_10.getText());  
      Tutor t1 = new Tutor(Integer.parseInt(jtt_1.getText()),jtt_2.getText(),jtt_3.getText(),jtt_4.getText(),jtt_5.getText(),Integer.parseInt(jtt_6.getText()),Double.parseDouble(jtt_7.getText()),jtt_8.getText(),jtt_9.getText(),Integer.parseInt(jtt_10.getText()));
      t_List.add(t1);
      
      {
          JOptionPane.showMessageDialog(null,"added to table");
      }
    }
       
      catch (NumberFormatException ae){
                        JOptionPane.showMessageDialog(null, "Invalid input for numeric fields", "Error", JOptionPane.ERROR_MESSAGE);

                    }
                }
    });
   
    JButton bb_6 = new JButton("Remove Tutor");
    bb_6.setBounds(410,270,220,40);
    bb_6.setFont(Font_2);
    bb_6.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
   try {
            // Check if all fields are filled
            if (jtt_1.getText().isEmpty() || jtt_7.getText().isEmpty() || jtt_8.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Enter Teacher ID, New Salary, and New Performance Index.");
                return;
            }
              int id = Integer.parseInt(jtt_1.getText());
              String name = (jtt_2.getText());
              String address = (jtt_3.getText());
              String workingType = (jtt_4.getText());
              String employmentStatus = (jtt_5.getText());
              int workingHour = Integer.parseInt(jtt_6.getText());
              double salary = Double.parseDouble(jtt_7.getText());
              String special = (jtt_8.getText());
              String qualification = (jtt_9.getText()); 
              int index  = Integer.parseInt(jtt_10.getText());
              
              Teacher teacher = new Tutor(id,name,address,workingType,employmentStatus,workingHour,salary,special,qualification,index);
              Tutor tutor = (Tutor) teacher;
              t_List.add(tutor);
                                
             tutor.removeTutor();
             JOptionPane.showMessageDialog(null, "Tutor Sucessfully Removed");   

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "invalid output");
        }
    }
});
   
    JButton bb_2 = new JButton("Change to Lecturer");
    bb_2.setBounds(410,358,220,40);
    bb_2.setFont(Font_2);
    bb_2.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
    frame.dispose();
    lecturer(); // Call the tutor method
    }
    });
   
    //------------------------------Section 7 ends here!!!-------------------------
    //------------------------------------------------------------------------------------
    frame.setSize(700,640);
    frame.setVisible(true);
    frame.setLayout(null);
    //-----------------------------------------------------------------
   
    //------------------------------Section 8-----------------------------------
   
    frame.add(panel);//adding panel on frame
    panel.add(jll_1);
   
    panel.add(jll_2);
    panel.add(jtt_1);
   
    panel.add(jll_3);
    panel.add(jtt_2);
   
    panel.add(jll_4);
    panel.add(jtt_3);
   
     
    panel.add(jll_5);
    panel.add(jtt_4);
   
    panel.add(jll_6);
    panel.add(jtt_5);
   
 
    panel.add(jll_7);
    panel.add(jtt_6);
   
    panel.add(jll_8);
    panel.add(jtt_7);
   
    panel.add(jll_9);
    panel.add(jtt_8);
   
    panel.add(jll_10);
    panel.add(jtt_9);
   
    panel.add(jll_11);
    panel.add(jtt_10);
    ////-------------------------------------------------------------------------////
   
    ////-----------------------------Section 9 -------------------------------------------------///
    ///adding buttons on panel..../////////////////////
    panel.add(bb_1);
    panel.add(bb_2);
    panel.add(bb_3);
    panel.add(bb_4);
    panel.add(bb_5);
    panel.add(bb_6);
    }
    //-----------------------------------------------------------------------------------------------------//
   
   
   
    ///--------------------------------Section 10 ---------------------------------------
    public static void main(String[] args)
    {
        TeacherGUI gui = new TeacherGUI();
        gui.Open();
    }
    ///------------------------------------------------------------------------------------------------///
}