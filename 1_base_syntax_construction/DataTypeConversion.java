class DataTypeConversion {
  public static void main(String[] args) {

    // byte (1 byte), short (2 byte), int (4 byte), long (8 byte)
    // boolean (1 byte), char (2 byte), float (4 byte), double (8 byte) 


    short short_a = 127;
    int int_a = short_a;
   
    float float_a = 111;
    int int_b = (int)float_a;

    char char_a = '1';
    byte byte_b = (byte)char_a;

    System.out.println(int_a);
    System.out.println(int_b);
    System.out.println(byte_b);
  }
}
