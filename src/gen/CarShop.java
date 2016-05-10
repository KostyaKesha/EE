package gen;


public class CarShop {
    public static void main(String[] args) {
        Executor<Car> carExecut = new Execut<>();

        Task<Car> task1 = new Task<String>() {
            @Override
            public void execute() {

            }

            @Override
            public String getResult() {
                return null;
            }

            Task<Car> task2 = new Task<String>() {
                @Override
                public void execute() {

                }

                @Override
                public String getResult() {
                    return null;
                }

                Task<Car> task3 = new Task<String>() {
                    @Override
                    public void execute() {

                    }

                    @Override
                    public String getResult() {
                    }
                }
            }
        }
                        System.out.println("Valid results:");
                        for (Car car : carExecut.getValidResults()) {
                            System.out.println(car);
                        }
                        System.out.println();

                        System.out.println("Invalid results:");
                        for (Car car : carExecut.getInvalidResults()) {
                            System.out.println(car);
                        }
                    }
                }

