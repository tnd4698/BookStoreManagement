/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import model.Book;
import model.ImportBook;

/**
 *
 * @author tnd
 */
public class ImportBookController {
    ImportBook Model=new ImportBook();

    public void loadBook(JComboBox<String> cbBook) {
        cbBook.removeAllItems();
        ArrayList<Book>list= (new Book()).getBook();
        for(int i=0;i<list.size();i++)
        {
            cbBook.addItem(list.get(i).name()+":"+list.get(i).id());
        }
        cbBook.addItem("Thêm...");
    }

    public boolean AddImportBook(String[][] data,String date,String value) throws ParseException {
        if(!Model.AddImportBook(new SimpleDateFormat("dd/MM/yyyy").parse(date),Float.parseFloat(value)))
            return false;
        for(int i=0;i<data.length;i++)
        {
            String id=data[i][0];
            int count=Integer.parseInt(data[i][1]);
            float price=Float.parseFloat(data[i][2]);
            float total=Float.parseFloat(data[i][3]);
            if(!Model.AddImportBookInfo(id,count,price,total))
                return false;
        }
        return true;
    }
  
}
