//Violation of LSP

class Bird {
    public void fly() {
        System.out.println("Flying");
    }
}

class Ostrich extends Bird {
    @Override 
    public void fly() {
        throw new UnsupportedOperationException("Ostrich cannot fly");
    }
}

//Adhering to LSP

interface Bird {
    void move();
}

class Sparrow implements Bird {
    @Override 
    public void move() {
        System.out.println("Flying");
    }
}

class Ostrich implements Bird {
    @Override 
    public void move() {
        System.out.println("Running");
    }
}