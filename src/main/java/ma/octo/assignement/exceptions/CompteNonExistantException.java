package ma.octo.assignement.exceptions;

public class CompteNonExistantException extends RuntimeException {

  private static final long serialVersionUID = 1L;


  public CompteNonExistantException(String message) {
    super(message);
  }
}
