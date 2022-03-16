package com.wrong_format;
 interface Wash_class {
      void provide_pairs(int pairs);
     void provide_detergent();

    //Interface Segregation is violated because in a single interface multiple functionalities are being existed.
    //provide_fragrance cannot be implemented by Strong_wash class but due to not segregating interfaces it has to implement it
    // unnecessarily.


     void provide_fragrance();

    String wash(String mode);
    // Liskov substitution principle is violated
    String wash(String mode,int repetitions);
}
