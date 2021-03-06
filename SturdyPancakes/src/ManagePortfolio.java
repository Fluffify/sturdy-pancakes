
import java.awt.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Frank
 */
public class ManagePortfolio extends JPanel{
    private JButton backButton, createCategoryButton, editCategoryButton, deleteCategoryButton, createCredentialsButton, editCredentialsButton, deleteCredentialsButton; 
    private JLabel jlabel1;
    public ManagePortfolio(){
        super();
        setVisible(true);
        setBackground(Color.white);
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1;
        c.weighty = 1;
        c.ipady =20;
        
        backButton = new JButton("< Main Menu");
        backButton.setOpaque(false);
        backButton.setContentAreaFilled(false);
        c.anchor = GridBagConstraints.NORTHWEST;
        add(backButton,c);
        c.ipadx = 100;
        c.ipady = 100;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.WEST;
   
        c.gridx = 1;
        c.gridy = 0;
        createCategoryButton = new JButton("Create Categories");
        createCategoryButton.setOpaque(false);
        createCategoryButton.setContentAreaFilled(false);
        add(createCategoryButton,c);
        
        c.gridx = 1;
        c.gridy = 1;
        editCategoryButton = new JButton("Edit Categories");
        editCategoryButton.setOpaque(false);
        editCategoryButton.setContentAreaFilled(false);
        add(editCategoryButton,c);
        
        c.gridx = 1;
        c.gridy = 2;
        deleteCategoryButton = new JButton("Delete Categories");
        deleteCategoryButton.setOpaque(false);
        deleteCategoryButton.setContentAreaFilled(false);
        add(deleteCategoryButton,c);
        
        c.gridx = 1;
        c.gridy = 3;
        createCredentialsButton = new JButton("Create Credentials");
        createCredentialsButton.setOpaque(false);
        createCredentialsButton.setContentAreaFilled(false);
        add(createCredentialsButton,c);
        
        
        
        c.gridx = 1;
        c.gridy = 5;
        deleteCredentialsButton = new JButton("Delete Credentials");
        deleteCredentialsButton.setOpaque(false); 
        deleteCredentialsButton.setContentAreaFilled(false);
        add(deleteCredentialsButton,c);
        
        c.ipadx = 0;
        c.ipady = 0;
        c.gridx=2;
        c.fill = GridBagConstraints.NONE;
        c.anchor = GridBagConstraints.SOUTHEAST;
        jlabel1 = new JLabel("");
        add(jlabel1,c);
        
        
    }
    public JButton getBackButton(){
        return backButton;
    }
    public JButton getCreateCredentialsButton() {
        return createCredentialsButton;
    }
    public JButton getEditCredentialsButton() {
        return editCredentialsButton;
    }
    public JButton getDeleteCategoryButton() {
        return deleteCategoryButton;
    }
    public JButton getCreateCategoryButton() {
        return createCategoryButton;
    }
    public JButton getEditCategoryButton() {
        return editCategoryButton;
    }
    public JButton getDeleteCredentialsButton() {
        return deleteCredentialsButton;
    }
    
    
}
