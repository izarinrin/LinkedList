/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistni;

import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author Maylngni
 */
public class LinkedListni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<String> object = new LinkedList<String>();
        String menu = null, menu2 = null, input = null, input2 = null;
        int index = 0, size = 0;
        boolean src;

        while (!"x".equals(menu)) {
            size = object.size();
            menu = JOptionPane.showInputDialog(null, "type:\n[a] to add element\n[u] update"
                    + "\n[r] to remove element\n[s] to search\n[d] to display list"
                    + "\n[x] to stop operation\n\nList Size: " + size);
            switch (menu) {
                case "a":
                    menu2 = JOptionPane.showInputDialog(null, "[1]-just add\n[2]-First element"
                            + "\n[3]-last element\n[4]-with index");
                    if (null != menu2) {
                        switch (menu2) {
                            case "1":
                                input = JOptionPane.showInputDialog(null, "Add element");
                                object.add(input);
                                JOptionPane.showMessageDialog(null, "Element '" + input + "' added");
                                break;
                            case "2":
                                input = JOptionPane.showInputDialog(null, "[2]First element\nAdd element");
                                object.addFirst(input);
                                JOptionPane.showMessageDialog(null, "Element '" + input + "' added as first");
                                break;
                            case "3":
                                input = JOptionPane.showInputDialog(null, "[3]last element\nAdd element");
                                object.addLast(input);
                                JOptionPane.showMessageDialog(null, "Element '" + input + "' added as last");
                                break;
                            case "4":
                                int s= size-1;
                                if(s<0){
                                    JOptionPane.showMessageDialog(null, "i cannot insert empty :(");
                                }else{
                                    boolean ttt = false;
                                    input = JOptionPane.showInputDialog(null, "Add w index\ninput element");
                                    while(ttt!=true){
                                    index = Integer.parseInt(JOptionPane.showInputDialog(null, "@ index #\ncan input from 0-"+s));
                                    if(index>s||index<0){
                                           JOptionPane.showMessageDialog(null, "wrong input");
                                    }else {
                                    object.add(index, input);
                                    JOptionPane.showMessageDialog(null, "Element '" + input + "' added to index #" + index);
                                    ttt=true;
                                           }    
                                    }    
                                }
                        break;    
                            default:
                                break;
                        }
                    }
                    break;

                case "r":
                    int s= size-1;
                    if(s<0){
                        JOptionPane.showMessageDialog(null, "i cannot remove empty :(");
                    }
                    else{
                        menu2 = JOptionPane.showInputDialog(null, "[1]Remove element\n[2]Remove using index");
                    if ("1".equals(menu2)) {
                        input = JOptionPane.showInputDialog(null, "Remove element");
                        src = object.contains(input);
                        if (src) {
                        object.remove(input);
                        JOptionPane.showMessageDialog(null, "Element '" + input + "' removed");
                        } else {
                        JOptionPane.showMessageDialog(null, "List doesn't contain the element '" + input + "'\nnothing removed");
                        }
                    } else if ("2".equals(menu2)) {
                        index = Integer.parseInt(JOptionPane.showInputDialog(null, "index # (from 0-"+s+")"));
                        if(index>=size){
                            JOptionPane.showMessageDialog(null, "wrong input");
                        } else{
                            object.remove(index);
                            JOptionPane.showMessageDialog(null, "Element removed at index# " + index);
                        }
                        }
                    }
                    break;
                    
                case "s":
                    menu2 = JOptionPane.showInputDialog(null, "[1]Search element\n[2]Search using index");
                    if ("1".equals(menu2)) {
                        input = JOptionPane.showInputDialog(null, "Find element");
                        src = object.contains(input);
                        if (src) {
                            JOptionPane.showMessageDialog(null,"List contains the element '" + input + "' @ index#" + object.indexOf(input));
                            System.out.println("List contains the element '" + input + "' @ index#" + object.indexOf(input));
                        } else {
                            JOptionPane.showMessageDialog(null, "List doesn't contain the element");
                        }
                    } else if ("2".equals(menu2)) {
                        s = size-1;
                        index = Integer.parseInt(JOptionPane.showInputDialog(null, "index # (from 0-"+s+")"));
                        if(index>=size){
                            JOptionPane.showMessageDialog(null, "wrong input");
                        } else{
                            object.get(index);
                            JOptionPane.showMessageDialog(null, "Element '" + object.get(index) + "' found at index# " + index);
                        }
                    }
                    break;
                    
                case "d":
                    System.out.println("Linked list : " + object);
                    JOptionPane.showMessageDialog(null, "Linked list : " + object);
                    break;
                case "x":
                    JOptionPane.showMessageDialog(null, "Stopped");
                    System.out.println("Stopped op");
                    break;
                    
                case "u":
                    s= size-1;
                    if(s<0){
                        JOptionPane.showMessageDialog(null, "i cannot update empty :(");
                            }else{
                                boolean ttt = false;
                                input = JOptionPane.showInputDialog(null, "update replace\ninput element");
                                while(ttt!=true){
                                    index = Integer.parseInt(JOptionPane.showInputDialog(null, "@ index #\ncan input from 0-"+s));
                                    if(index>s||index<0){
                                           JOptionPane.showMessageDialog(null, "wrong input");
                                    }else {
                                    object.set(index, input);
                                    JOptionPane.showMessageDialog(null, "Element '" + input + "' added to index #" + index);
                                    ttt=true;
                                           }    
                                    }    
                                }
                    break;
                    
                    /*                case "null":
                    menu = "x";
                    break; desont workheh*/
                    
                default:
                    JOptionPane.showMessageDialog(null, "None of the options");
                    break;
            }
        }

    }

}
