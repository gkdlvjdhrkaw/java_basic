package day15.poly.basic;

class Monitor {}
class LGMonitor extends Monitor {}
class HPMonitor extends Monitor {}

public class Computer {

    public Monitor monitor;

    public Computer() { // 객체의 교환성이 유용하다
        this.monitor = new LGMonitor();
        this.monitor = new HPMonitor();
    }
}
