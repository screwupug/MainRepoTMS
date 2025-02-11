package solid.isp;

interface Worker {
    void work();
    void eat();
}

class StrangeRobot implements Worker {
    public void work() { System.out.println("Робот работает."); }
    public void eat() { throw new UnsupportedOperationException("Робот не ест!"); }
}


//--------------------------------------------------------------------------------------------------------


interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Human implements Workable, Eatable {
    public void work() { System.out.println("Человек работает."); }
    public void eat() { System.out.println("Человек ест."); }
}

class Robot implements Workable {
    public void work() { System.out.println("Робот работает."); }
}


