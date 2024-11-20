
package org.example;

public class Animal {
    public String emitirSom() {
        return "Som genérico";
    }
}

class Cachorro extends Animal {
    @Override
    public String emitirSom() {
        return "Au Au";
    }
}

class Gato extends Animal {
    @Override
    public String emitirSom() {
        return "Miau";
    }
}


