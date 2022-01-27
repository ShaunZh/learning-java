package com.hexon.poly_.polyparameter_;

public class PolyParameter {

    public void showEmpAnnual(Employee e) {
        System.out.println(e.getName() + "的年收入为: " + e.getAnnual());
    }

    public void test(Employee e) {
        if (e instanceof Worker) {
            testWorker((Worker)e);
        } else if (e instanceof Manager) {
            testManager((Manager)e);
        } else {
            System.out.println("not working");
        }
    }


    public void testWorker(Worker w) {
        w.work();
    }

    public void testManager(Manager m) {
        m.manage();
    }

    public static void main(String[] args) {
        Employee b = new Worker("Bob", 12399);
        Employee h = new Manager("Hexon", 3888888, 2000000);
        PolyParameter poly = new PolyParameter();
        poly.showEmpAnnual(b);
        poly.showEmpAnnual(h);
        poly.test(b);
        poly.test(h);
    }

}
