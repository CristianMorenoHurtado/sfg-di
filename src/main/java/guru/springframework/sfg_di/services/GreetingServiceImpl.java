package guru.springframework.sfg_di.services;

public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGretting() {
        return "Hello World";
    }
}
