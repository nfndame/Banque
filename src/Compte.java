
public class Compte 

{
	public int numero ;
	public int solde;
	
	public int getNumero() 
	{
		return numero;
	}

	public void setNumero(int numero) 
	{
		this.numero = numero;
	}

	public int getSolde() 
	{
		return solde;
	}
	

	public void setSolde(int solde) 
	{
		this.solde = solde;
	}


//constructeur
public Compte(int numero,int solde)
{
	this.numero = numero;
	this.solde = solde;
	

}

// Fonction debiter
public void debiter (double montant)
{
      solde = (int) (solde -montant)  ;
}
//fonction crediter 
public void crediter (double montant)
{
      solde = (int) (solde +montant)  ;
}





}