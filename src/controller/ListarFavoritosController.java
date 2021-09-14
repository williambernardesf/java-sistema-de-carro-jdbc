package controller;

import java.sql.ResultSet;

import dao.FavoritosDao;
import model.Autentica;
import view.AutenticaUsuarioView;
import view.ListarFavoritosView;

public class ListarFavoritosController {
	
	private FavoritosDao fDAO;
	private Autentica a;
    private ResultSet rs;
    private ListarFavoritosView lfv;   
    private AutenticaUsuarioView auv;
    
    public ListarFavoritosController(){
        
    	auv = new AutenticaUsuarioView();
    	a = auv.telaDeAutentica(a);
    	
        fDAO = new FavoritosDao();
        rs = fDAO.listar(a);
        
        lfv = new ListarFavoritosView();
        lfv.telaListarFavoritos(rs);
        
    }
}