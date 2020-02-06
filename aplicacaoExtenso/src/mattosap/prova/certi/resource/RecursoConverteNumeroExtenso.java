package mattosap.prova.certi.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/converte")
public class RecursoConverteNumeroExtenso {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{param}")
	public JsonBean createSimpleBean(@PathParam("param") String numeroParamentro) {

		try {
			int numeroMostra = Integer.parseInt(numeroParamentro, 10);

			return new JsonBean(ConverteNumeroExtenso.numeroExtenso(numeroMostra));

		} catch (NumberFormatException e) {

			return new JsonBean("Erro na transformação do numero");
		}

	}

}