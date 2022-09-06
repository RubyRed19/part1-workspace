public class Television {

  public static final int MIN_VOLUME = 0;
  public static final int MAX_VOLUME = 100;

  private static int instanceCount = 0;
  private String brand;
  private int volume;

  public Television(){
    instanceCount++;
  }

  public Television (String brand){
    this();
    setBrand(brand);
  }

  public Television (String brand, int volume){
    this(brand);
    setVolume(volume);
  }

  //business methods
  public void turnOn() {
    boolean isConnected = verifyInternetConnection();
      System.out.println("The " + brand + " television is on, with a volume of " + volume);
    }

    public void turnOff() {
      System.out.println("The " + brand + " television is off");
    }

  public static int getInstanceCount() {
    return instanceCount;
  }
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    if(volume < MIN_VOLUME || volume > MAX_VOLUME) {
      //print f - formatted string, use for data formatted in a particular way
      System.out.printf( "%d is invalid; volume must be between %d and %d (inclusive).%n", volume, MIN_VOLUME, MAX_VOLUME );
    } else {
      this.volume = volume;
    }
  }

  //helper methods
  private boolean verifyInternetConnection() {
      return true;
  }

  public String toString(){
      return "Television: brand = " + brand + ", volume = " + volume;
  }
}
