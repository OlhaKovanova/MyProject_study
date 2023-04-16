import org.testng.Assert;
import org.testng.annotations.Test;
import shool.redrower.Director;
import shool.redrower.Manager;
import shool.redrower.Worker;

public class TestHW131 {
    @Test
    public void testHW131() {
        Worker worker = new Worker("Dima", 28, "F", 30000);
        Manager manager = new Manager("Kostya", 40, "F", 10000, 0);
        Manager manager2 = new Manager("Sasha", 40, "F", 10000, 20);
        Director director = new Director("Olha", 28, "F", 10000,0);
        Director director2 = new Director("Olha", 28, "F", 10000,200);

        Assert.assertEquals(worker.getSalary(), worker.getBaseSalary());
        Assert.assertEquals(manager.getSalary(), 0);
        Assert.assertEquals(manager2.getSalary(), 6000);
        Assert.assertEquals(director.getSalary(), 0);
        Assert.assertEquals(director2.getSalary(), 180000);
    }
}
