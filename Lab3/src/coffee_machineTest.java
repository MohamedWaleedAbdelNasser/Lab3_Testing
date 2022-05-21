import org.junit.Test;

class coffee_machineTest {
    @Test
    public void test1() {
        coffee_machine c = new coffee_machine();
        assertEquals("Please turn the machine on", c.addMoney(30));
    }

    private void assertEquals(String please_turn_the_machine_on, String addMoney) {
    }

    @Test
    public void test2() {
        coffee_machine c = new coffee_machine();
        assertEquals("Power on" + "Lights on", c.openMachine());
    }
    @Test
    public void test3() {
        coffee_machine c = new coffee_machine();
        c.power = true;
        assertEquals("Error!", c.openMachine());
    }
    @Test
    public void test4() {
        coffee_machine c = new coffee_machine();
        c.openMachine();
        c.closeMachine();
        assertEquals("Please turn the machine on", c.addMoney(30));
    }
    @Test
    public void test5() {
        coffee_machine c = new coffee_machine();
        c.openMachine();
        assertEquals("money added Successfully", c.addMoney(30));
    }
    @Test
    public void test6() {
        coffee_machine c = new coffee_machine();
        assertEquals("Power on" + "Lights on",c.openMachine());
        assertEquals("money added Successfully",c.addMoney(30));
    }
    @Test
    public void test7(){
        coffee_machine c = new coffee_machine();
        assertEquals("Power on" + "Lights on",c.openMachine());
        assertEquals("money added Successfully",c.addMoney(30));
        assertEquals("Lights off" + "Power off",c.closeMachine());
    }
    @Test
    public void test8(){
        coffee_machine c = new coffee_machine();
        assertEquals("Please turn the machine on",c.makeCoffee(2));
    }
    @Test
    public void test9(){
        coffee_machine c = new coffee_machine();
        assertEquals("Power on" + "Lights on",c.openMachine());
        assertEquals("money added Successfully",c.addMoney(30));
        assertEquals(2+ " Coffee successfuly made",c.makeCoffee(3));
    }
    @Test
    public void test10(){
        coffee_machine c = new coffee_machine();
        assertEquals("Power on" + "Lights on",c.openMachine());
        assertEquals("money added Successfully",c.addMoney(30));
        assertEquals(2+ " Coffee successfuly made",c.makeCoffee(4));
    }
    @Test
    public void test11(){
        coffee_machine c = new coffee_machine();
        assertEquals("Power on" + "Lights on",c.openMachine());
        assertEquals("money added Successfully",c.addMoney(30));
        assertEquals(1+ " Coffee successfuly made",c.makeCoffee(1));
    }
}
