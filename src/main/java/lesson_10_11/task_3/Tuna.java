package lesson_10_11.task_3;

interface Fish  { int getNumberOfScales(); }
interface Piano { int getNumberOfScales(); }
class Tuna implements Fish, Piano {
    public int getNumberOfScales() { return 91; }
}
