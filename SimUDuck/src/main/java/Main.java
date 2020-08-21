import service.DuckService;

public class Main {
    public static void main(String[] args) {
        DuckService duckService = new DuckService();
        duckService.callMallardDuck();
        duckService.callModelDuck();
        duckService.callRubberDuck();
        duckService.callRedHeadDuck();
        duckService.callCyberDuck();
    }
}
