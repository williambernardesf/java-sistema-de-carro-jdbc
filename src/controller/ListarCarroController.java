package controller;

import java.sql.ResultSet;

import dao.CarroDao;
import view.ListarCarroView;


public class ListarCarroController {
	
	private CarroDao cDAO;
    private ResultSet rs;
    private ListarCarroView lcv;   
    
    public ListarCarroController(){
        
        cDAO = new CarroDao();
        rs = cDAO.listar();
        
        lcv = new ListarCarroView();
        lcv.telaListarCarro(rs);
        
    }
}