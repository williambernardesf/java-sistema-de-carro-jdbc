package controller;

import java.sql.ResultSet;

import dao.MotoDao;
import view.ListarMotoView;


public class ListarMotoController {
	
	private MotoDao mDAO;
    private ResultSet rs;
    private ListarMotoView lmv;   
    
    public ListarMotoController(){
        
        mDAO = new MotoDao();
        rs = mDAO.listar();
        
        lmv = new ListarMotoView();
        lmv.telaListarMoto(rs);
        
    }
}