package decorator;

interface Subscription {
    String getDescription();
    double getPrice();
}

public class BasicSubscription implements Subscription {
    @Override
    public String getDescription() {
        return "Abonament de baza";
    }

    @Override
    public double getPrice() {
        return 10.0;
    }
}

abstract class SubscriptionDecorator implements Subscription {
    protected Subscription subscription;

    public SubscriptionDecorator(Subscription subscription) {
        this.subscription = subscription;
    }

    @Override
    public String getDescription() {
        return subscription.getDescription();
    }

    @Override
    public double getPrice() {
        return subscription.getPrice();
    }
}

// Decorator pentru adaugarea de optiune de vizionare offline
class OfflineViewingDecorator extends SubscriptionDecorator {

    public OfflineViewingDecorator(Subscription subscription) {
        super(subscription);
    }

    @Override
    public String getDescription() {
        return subscription.getDescription() + ", vizionare offline";
    }

    @Override
    public double getPrice() {
        return subscription.getPrice() + 5.0;
    }
}

// Decorator pentru adaugarea de optiune de vizionare in calitate HD
class HDStreamingDecorator extends SubscriptionDecorator {

    public HDStreamingDecorator(Subscription subscription) {
        super(subscription);
    }

    @Override
    public String getDescription() {
        return subscription.getDescription() + ", vizionare in calitate HD";
    }

    @Override
    public double getPrice() {
        return subscription.getPrice() + 3.0;
    }
}

class Main2 {
    public static void main(String[] args) {
        Subscription subscription = new BasicSubscription();
        subscription = new OfflineViewingDecorator(subscription);
        subscription = new HDStreamingDecorator(subscription);

        System.out.println("Descriere: " + subscription.getDescription());
        System.out.println("Pret: " + subscription.getPrice());
    }

}