package controller;

import java.sql.ResultSet;

import dao.UsuarioDao;
import model.Autentica;
import view.AutenticaUsuarioView;
import view.ListarUsuarioView;


public class ListarUsuarioController {
	
	private UsuarioDao uDAO;
	private Autentica a;
    private ResultSet rs;
    private ListarUsuarioView luv;   
    private AutenticaUsuarioView auv;
    
    public ListarUsuarioController(){
    	
    	auv = new AutenticaUsuarioView();
    	a = auv.telaDeAutentica(a);
        
        uDAO = new UsuarioDao();
        rs = uDAO.listar(a);
        
        luv = new ListarUsuarioView();
        luv.telaListarUsuario(rs);
        
    }
}