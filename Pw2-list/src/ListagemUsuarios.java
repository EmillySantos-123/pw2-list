import java.util.List;

public class ListagemUsuarios {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.setId(1);
		u1.setNome("Cersa");
		u1.setPontuacao(1);
		u1.setModerador(true);
	
		Usuario u2 = new Usuario();
		u2.setId(2);
		u2.setNome("Emilly");
		u2.setPontuacao(2);
		u2.setModerador(false);
		
		Usuario u3 = new Usuario();
		u3.setId(3);
		u3.setNome("Paulo");
		u3.setPontuacao(3);
		u3.setModerador(true);
		
		Usuario u4 = new Usuario();
		u4.setId(4);
		u4.setNome("Henrique");
		u4.setPontuacao(4);
		u4.setModerador(false);
		
		Usuario u5 = new Usuario();
		u5.setId(5);
		u5.setNome("Gabriel");
		u5.setPontuacao(5);
		u5.setModerador(true);
		
		
		List<Usuario> lista= List.of(u1, u2, u3, u4, u5);
		System.out.println("Quantidade:" + lista.size());
		lista.forEach(e -> {
			System.out.println("\nNome: " + e.getNome());
			System.out.println("Id: " + e.getId());
			System.out.println("Pontuação: " + e.getPontuacao());
			System.out.println("Moderador:\n " + e.isModerador());
		});
	}
}
