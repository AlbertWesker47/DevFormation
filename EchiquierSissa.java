package fr.eni.echiquier;
/** 
	* Ce projet permet d'effectuer le problème mathématique de l'échiquier de Sissa.
	*
	* Soit un échiquier de 64 cases. Le but du problème est de placer un grain de riz sur la première case.
	*
	* Pour avancer sur la case suivante, il faut placer le double de grains de riz présents sur la case actuelle.
	*
	* On doit afficher sur la console le nombre de grains présents sur l'échiquier.
	*
	* Pour plus de clarté, j'ai ajouté un affichage qui renvoie en temps réel, le nombre de grains présents dans la case actuelle.
*/



public class EchiquierSissa {
	public static void main(String args[]){
		
		/** Saisie des variables nécessaires, la variable TotalEchiquier fixe le nombre de cases, ici 64.
		*/
		
		float TotalEchiquier = 0f;
		float TotalCase = 1f;
		int LimiteEchiquier =64;
		int compteur =0;
	
		/** Une boucle for est mise en place, elle va boucler dans que nous n'avons pas atteint le total de cases
		*
		* Le compteur est initié à la valeur 0.
		*
		* A chaque changement de case, le nombre de grains de riz placés dans la case est multiplié par lui-même.
		*/
		
		for(compteur =0;compteur<LimiteEchiquier;compteur++)
		{
		
			TotalEchiquier=TotalCase+TotalEchiquier;
			System.out.println("Le nombre de grains de riz sur l'échiquier est de  "+TotalEchiquier);
			System.out.println("Grains de riz dans la case :"+TotalCase);
			TotalCase=TotalCase*2;
		}
	
}
}