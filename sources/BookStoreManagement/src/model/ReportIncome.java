/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author Corazon
 */
public class ReportIncome {
    private float Income;
    
    public ReportIncome(){};
    public float getIncome(Date ngaylap) {
        String SQL="call USP_GetIncomeByDate(ngaylap)";
        float income = 0;
        try{
            DataAccessHelper.getInstance().getConnect();
            Statement statement =DataAccessHelper.getInstance().conn.createStatement();
            ResultSet rs=statement.executeQuery(SQL);
            while(rs.next())
            {
                income += rs.getFloat("TongTien");
            }
            DataAccessHelper.getInstance().getClose();
        } catch (Exception e) {}
        return income;
    }
}
