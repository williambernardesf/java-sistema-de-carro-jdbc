package controller;

import java.sql.ResultSet;

import dao.TesteDao;
import model.Teste;
import view.CadastrarTesteCarroView;
import view.ListarTesteCarroView;

public class CadastrarTesteCarroController {
	
	private CadastrarTesteCarroView ctcv;
	private Teste t;
    private TesteDao tDAO;   
    private ResultSet rs;
    private ListarTesteCarroView ltcv;  
    
	public CadastrarTesteCarroController() {
		
		ctcv = new CadastrarTesteCarroView();
        t = ctcv.telaDeCadastro(t);
        
        tDAO = new TesteDao();
        tDAO.insereTeste(t);
        
        rs =tDAO.listarTeste(t);
        ltcv = new ListarTesteCarroView();
        ltcv.telaListarTeste(rs);
        
        
       
    }	        
}

