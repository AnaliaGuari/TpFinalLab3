package Red;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class Sistema {

	Map<String,AConsumir> test = new HashMap<String, AConsumir>();
	Set<Usuario> usuarios = new HashSet<Usuario>();
	LinkedList <Comentario> comentarios = new LinkedList <Comentario>();
	
	public void mostrarComentarioConsu (String codigo)
	{
		Iterator<Comentario> it= this.comentarios.iterator();
		while (it.hasNext())
		{
			if (it.next().codigo==codigo)
			{
				System.out.println(it.next().toString());
			}
		}
	}
	
	public void mostrarComentarioUsuario (String user)
	{
		Iterator<Comentario> it= this.comentarios.iterator();
		while (it.hasNext())
		{
			if (it.next().usuario==user)
			{
				System.out.println(it.next().toString());
			}
		}
	}
}
