public class OverspeedingException extends Exception {
  @Override
  public String getMessage() {
    return "Overspeeding is extremely dangerous";
  }
}