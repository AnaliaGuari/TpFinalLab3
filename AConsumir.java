package Red;

public abstract class AConsumir {

		String título;
		int Calificación;  //promedio de todas las calificaciones de los resultados 
		//punteros[]//son los comentarios anclados a este aConsumir
		//codigo //código con el que se identifica en el hashmap que sería el sistema

		public abstract void mostarComentario();//mostrar primero comentarios del mismo usuario

}