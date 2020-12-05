/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khang;

import frm.frmDangNhap;
import frm.frmTrangChu;
import frm.frmTrangChu_1;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author huy
 */
public class com {
  public static  frm.frmTrangChu frmTC=new frmTrangChu();
  public static  frmTrangChu_1 frmTC1=new frmTrangChu_1();
  public static database.clsConnectDB connection = new  database.clsConnectDB ();

    public static void main(String[] args) {
       frm.frmDangNhap frmDN= new   frm.frmDangNhap();      
       frmDN.show();
    }
   
    
}
