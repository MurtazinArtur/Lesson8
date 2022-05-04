package lesson_10_11.task_5;

public class Test {
    public static void main(String[] args) {
        for (Season s : Season.values())
            System.out.println(s);
    }

    enum Season {
        WINTER("Зима"), SPRING("Весна"), SUMMER("Лето"), FALL("Осень");
        private String value;

        Season(String value) {
            this.value = value;
        }

        public String getValue() {
            switch (value){
                case "WINTER":{
                    value = "Зима";
                    break;
                }
                case "SPRING":{
                    value = "Весна";
                    break;
                }
                case "SUMMER":{
                    value = "Лето";
                    break;
                }
                case "FALL":{
                    value = "Осень";
                    break;
                }
            }
            return value;
        }

        @Override
        public String toString() {
            return this.getValue();
        }
    }
}
