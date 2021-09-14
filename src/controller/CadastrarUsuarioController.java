package controller;

import dao.UsuarioDao;
import model.Usuario;
import view.CadastrarUsuarioView;

public class CadastrarUsuarioController {
	
	private CadastrarUsuarioView cuv;
	private Usuario u;
    private UsuarioDao uDAO;   
    
	public CadastrarUsuarioController() {
		
		cuv = new CadastrarUsuarioView();
        u = cuv.telaDeCadastro(u);
        
        uDAO = new UsuarioDao();
        uDAO.insere(u);    
         
    }	        
}