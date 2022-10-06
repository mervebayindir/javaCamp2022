public class Main {
    public static void main(String[] args) {
        /*
        int num1 = 10;
        int num2 = 20;
        num1 = num2;
        num2 = 20;
        System.out.println(num1);

         */

/*
        int[] nums1 = {1,2,3,};
        int[] nums2 = {10,20,30,};

        nums1 = nums2;

        nums2[0] = 1000;

        System.out.println(nums1[0]);

 */
        /*
        CreditManager creditManager = new CreditManager();
        creditManager.save();
        creditManager.calculate();

        Customer customer = new Person(1,"mert","topal","1111111","İstanbul"); //instance creation, örnek oluşturmak


        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.save(customer);

        CustomerManager customerManager1 = new CustomerManager(new Person(1,"mert","topal","111","ist"));
        customerManager1.save();

        Company company = new Company(customer);
        company.setTaxNumber("1231");

*/
        CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());

    }
}

