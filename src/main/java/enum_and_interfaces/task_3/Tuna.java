package enum_and_interfaces.task_3;
interface Piano {
    int getNumberOfScales();
}

interface Fish {
    int getNumberOfScales();
}

public class Tuna implements Fish, Piano {
    public int getNumberOfScales() { return 91; }
}

