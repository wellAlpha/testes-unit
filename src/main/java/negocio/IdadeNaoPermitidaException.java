package negocio;

public class IdadeNaoPermitidaException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	public static String MSG_IDADE_INVALIDA = "O cliente deve ter idade entre 18 e 65 anos.";

	public IdadeNaoPermitidaException(String msg) {
		super(msg);
	}

}
