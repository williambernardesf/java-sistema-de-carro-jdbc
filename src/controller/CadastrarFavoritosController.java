package controller;

import dao.FavoritosDao;
import model.Favoritos;
import view.CadastrarFavoritosView;

public class CadastrarFavoritosController {
	
	private CadastrarFavoritosView cfv;
	private Favoritos f;
    private FavoritosDao fDAO;   
    
	public CadastrarFavoritosController() {
		
		cfv = new CadastrarFavoritosView();
        f = cfv.telaDeCadastro(f);
        
        fDAO = new FavoritosDao();
        fDAO.insere(f);    
        
        
    }	        
}
