/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Pablo Caiza
 */
public class MyDefaultTableCellRenderer extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel cell=(JLabel)super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if(value instanceof String){
            cell.setForeground(Color.red);
            return cell;
        }
         if (value instanceof JLabel) {
            
            JLabel lbl = (JLabel) value;
            
            return lbl;
        }
        
        
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
