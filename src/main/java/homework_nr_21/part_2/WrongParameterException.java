package homework_nr_21.part_2;

public class WrongParameterException extends Exception {
  public WrongParameterException(String message) {
    super(message);
  }
  public WrongParameterException() {super("Wrong parameter was given!");}
}
