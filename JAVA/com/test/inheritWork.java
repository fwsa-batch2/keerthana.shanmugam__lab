package test;

/**
 * inheritWork/**
 * s grandpa
 */
class grandFather {

String grandPa = "keerupa";
}

class father extends grandFather {
    String appa = "keerutha";
}

class son extends father {
    String magane = "keerthis";
}

public class inheritWork {

    public static void main(String[] args) {
        son family = new son();
        System.out.println(family.appa);
        System.out.println(family.magane);
        System.out.println(family.grandPa);


    }
}