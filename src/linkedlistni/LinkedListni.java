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

        while (!"stop".equals(menu)) {
            size = object.size();
            menu = JOptionPane.showInputDialog(null, "type:\n[add] to add element"
                    + "\n[rem] to remove element\n[srch] to search\n[dsp] to display list"
                    + "\n[stop] to stop operation\n\nList Size: " + size);
            switch (menu) {
                case "add":
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
                                input = JOptionPane.showInputDialog(null, "[4]with index\nAdd element");
                                index = Integer.parseInt(JOptionPane.showInputDialog(null, "@ index #"));
                                object.add(index, input2);
                                JOptionPane.showMessageDialog(null, "Element '" + input + "' added to index #" + index);
                                break;
                            default:
                                break;
                        }
                    }
                    break;

                case "rem":
                    input = JOptionPane.showInputDialog(null, "Remove element");
                    src = object.contains(input);
                    if (src) {
                        object.remove(input);
                        JOptionPane.showMessageDialog(null, "Element '" + input + "' removed");
                    } else {
                        JOptionPane.showMessageDialog(null, "List doesn't contain the element '" + input + "'\nnothing removed");
                    }
                    break;
                case "srch":
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
                        index = Integer.parseInt(JOptionPane.showInputDialog(null, "index #"));
                        object.get(index);
                        JOptionPane.showMessageDialog(null, "Element '" + object.get(index) + "' found at index# " + index);
                    }

                    break;
                case "dsp":
                    System.out.println("Linked list : " + object);
                    JOptionPane.showMessageDialog(null, "Linked list : " + object);
                    break;
                case "stop":
                    JOptionPane.showMessageDialog(null, "Stopped");
                    System.out.println("Stopped op");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "None of the options");
                    break;
            }
        }

    }

}
