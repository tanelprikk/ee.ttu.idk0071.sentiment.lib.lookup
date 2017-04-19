package ee.ttu.idk0071.sentiment.lib.fetching.objects;

public class FetchException extends Exception {
	private static final long serialVersionUID = -742616885379530453L;

	public FetchException(Throwable t) {
		super(t);
	}

	public FetchException(String message, Throwable t) {
		super(message, t);
	}

	public FetchException(String message) {
		super(message);
	}

	public FetchException() {
		
	}
}
