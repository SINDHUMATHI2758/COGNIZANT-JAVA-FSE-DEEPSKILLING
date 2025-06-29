public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerById(String customerId) {

        return "Customer ID: " + customerId + ", Name: Arjun R, Status: Active";
    }
}
