
import java.awt.event.*;
import javax.swing.event.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Frank
 */
public class GeneratorController {
    Model model;
    View view;
    public GeneratorController (Model a, View b) {
        model = a;
        view = b;
        newActionListener();
    }
    
    public void newActionListener(){
        //=======================================================
        //Password Options
        //=======================================================
        ItemListener passwordOptions = new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent event) {
                Object source = event.getSource();
                char[] temp = model.getGenerator().getChoices();
                
                if(source == view.getMyJFrame().getGeneratePassword().getNumbers()){
                    int state = event.getStateChange();
                    if(state == ItemEvent.SELECTED){
                        temp[0]='t';
                    }
                    else{
                        temp[0]='-';
                    }
                    model.getGenerator().setChoices(temp);
                }
                if(source == view.getMyJFrame().getGeneratePassword().getLetters()){
                    int state = event.getStateChange();
                    if(state == ItemEvent.SELECTED){
                        temp[1]='t';
                    }
                    else{
                        temp[1]='-';
                    }
                    model.getGenerator().setChoices(temp);
                }
                if(source == view.getMyJFrame().getGeneratePassword().getSpecialChars()){
                    int state = event.getStateChange();
                    if(state == ItemEvent.SELECTED){
                        temp[2]='t';
                    }
                    else{
                        temp[2]='-';
                    }
                    model.getGenerator().setChoices(temp);
                }
                if(event.getStateChange() == ItemEvent.DESELECTED){
                    
                }
            }
        };
        //=======================================================
        //Generate button
        //=======================================================
         ActionListener generatePassword = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                Object source = event.getSource();
                if(source == view.getMyJFrame().getGeneratePassword().getGenerate()){
                    System.out.println(model.getGenerator().getChoices());
                }
            }
        };
        
        //=======================================================
        //Add Listeners
        //=======================================================
        view.getMyJFrame().getGeneratePassword().getNumbers().addItemListener(passwordOptions);
        view.getMyJFrame().getGeneratePassword().getLetters().addItemListener(passwordOptions);
        view.getMyJFrame().getGeneratePassword().getSpecialChars().addItemListener(passwordOptions);
        view.getMyJFrame().getGeneratePassword().getGenerate().addActionListener(generatePassword);
    }
}
