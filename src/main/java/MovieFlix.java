import java.util.Scanner;
import com.movieflix.domain.Customer;
import com.movieflix.domain.PaymentType;
import com.movieflix.domain.UPIPayment;
import com.movieflix.domain.service.Payment;

public class MovieFlix {
    public static void main(String[] args) {
        interactWithUser();
    }

    static void interactWithUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n#-----------Movieflix subscription plan-----------#");
        System.out.println("Supported plan : BASIC\nSupported Payment: UPI \n");
        System.out.println("Enter yes to subscribe");
        String userOption = sc.nextLine();
        if ("yes".equals(userOption)) {
            Customer customer = getCustomerDetails();
            PaymentType paymentType = new UPIPayment();
            Payment payment = new Payment();
            double planCharges = payment.calculateCharge(customer, paymentType);
            System.out.println("Plan charge :" + planCharges);
        }
        else {
            System.out.println("Thank you please enter yes to subscribe");
        }
    }

    static Customer getCustomerDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter registered email id");
        String customerEmail = sc.nextLine();
        System.out.println("Enter yes if premium customer");
        boolean isPremiumSubscription = "yes".equalsIgnoreCase(sc.nextLine());
        return new Customer(customerEmail, isPremiumSubscription);
    }
}
