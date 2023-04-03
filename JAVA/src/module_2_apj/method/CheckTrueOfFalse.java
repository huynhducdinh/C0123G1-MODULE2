package module_2_apj.method;

import module_2_apj.molel.person.Employee;
import module_2_apj.repositroy.employee.EmployeeRepo;
import module_2_apj.repositroy.employee.IEmployeeRepo;
import module_2_apj.service.employee.EmployeeServiceIml;
import module_2_apj.util.regex.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckTrueOfFalse {
    static Scanner sc = new Scanner(System.in);
    static boolean check;

    public static String checkCodeVl() {
        System.out.print("Enter the correct service code according to the requirements of each service (For example SVVL-0001)-->");
        String id;
        do {
            check = false;
            id = sc.next();
            if (Regex.checkCodeVl(id)) {
            } else {
                System.out.print("Hi Hi re-enter");
                check = true;
            }
        } while (check);
        return id;
    }

    public static String checkCodeHo() {
        System.out.print("Enter the correct service code according to the requirements of each service (For example SVHO-0001)-->");
        String id;
        do {
            check = false;
            id = sc.next();
            if (Regex.checkCodeHo(id)) {
            } else {
                System.out.print("Hi Hi re-enter");
                check = true;
            }
        } while (check);
        return id;
    }

    public static String checkCodeRo() {
        System.out.print("Enter the correct service code according to the requirements of each service (For example SVRO-0001)-->");
        String id;
        do {
            check = false;
            id = sc.next();
            if (Regex.checkCodeRo(id)) {
            } else {
                System.out.print("Hi Hi re-enter");
                check = true;
            }
        } while (check);
        return id;
    }

    public static String checkName() {
        System.out.print("Enter name (For example Huynh Duc Dinh)--> ");
        String namee;
        do {
            check = false;
            namee = sc.nextLine();
            if (Regex.checkName(namee)) {
            } else {
                System.out.print("Hi Hi re-enter");
                check = true;
            }
        } while (check);
        return namee;
    }

    public static String checkNameService() {
        System.out.print("Enter service name (For example Villa)--> ");
        String namee;
        do {
            check = false;
            namee = sc.next();
            if (Regex.checkNameService(namee)) {
            } else {
                System.out.print("Hi Hi re-enter");
                check = true;
            }
        } while (check);
        return namee;
    }

    public static String checkBrith() {
        String brith;
        System.out.print("Enter date of birth (For example 09-08-2002 // 09/08/2002)--> ");
        do {
            check = false;
            brith = sc.nextLine();
            if (Regex.checkBirth(brith)) {
            } else {
                System.out.print("Hi Hi re-enter");
                check = true;
            }
        } while (check);
        return brith;

    }

    public static String checkNumberPhone() {
        String isnumber;
        do {
            check = false;
            System.out.print("Enter your phone number (For example 0379754891)-->");

            isnumber = sc.nextLine();
            if (Regex.checkPhoneNumber(isnumber)) {
            } else {
                System.out.print("Hi Hi re-enter");
                check = true;
            }
        } while (check);
        return isnumber;
    }

    public static String checkCitizen() {
        String citizen;
        do {
            check = false;
            System.out.print("Enter CMND/CCCD(For example 206379735)--> ");
            citizen = sc.nextLine();
            if (Regex.checkCmnd(citizen)) {
            } else {
                System.out.print("Hi Hi re-enter");
                check = true;
            }
        } while (check);
        return citizen;
    }

    public static String checkEmail() {
        String email;
        do {
            check = false;
            System.out.print("Nhập Email (For example heeyeon098@gmail.com)-->");
            email = sc.nextLine();
            if (Regex.checkEmail(email)) {
            } else {
                System.out.print("Hi Hi re-enter");
                check = true;
            }
        } while (check);
        return email;
    }

    public static double checkWage() {
        double wage;
        do {
            check = false;
            System.out.print("Enter employee's salary -->");
            wage = sc.nextDouble();
            if (wage > 0) {
            } else {
                System.out.print("Salary is not a negative number");
                check = true;
            }
        } while (check);
        return wage;
    }

    public static String inputId() {
        String id;
        do {
            check = false;
            System.out.print("Insert code (For example MV-01)-->");
            id = sc.nextLine();
            if (Regex.checkId(id)) {
            } else {
                System.out.print("Hi Hi re-enter");
                check = true;
            }
        } while (check);
        return id;
    }

    public static String checkLeases() {
        String lease;
        do {
            check = false;
            System.out.print("Enter rental type by year, month, day, hour.(For example 12/02/2023-15h:30)-->");
            lease = sc.next();
            if (Regex.checkLease(lease)) {
            } else {
                System.out.print("Hi Hi re-enter ");
                check = true;
            }
        } while (check);
        return lease;
    }

    public static String checkAddresse() {
        String address;
        do {
            check = false;
            System.out.print("Enter address (For example Quang Nam)-->");
            address = sc.nextLine();
            if (Regex.checkAddress(address)) {
            } else {
                System.out.print("Hi Hi re-enter");
                check = true;
            }
        } while (check);
        return address;
    }

    public static String level() {
        System.out.println("Select your level" + "\n1.Intermediate" + "\n2.College" + "\n3.University" + "\n4.Postgraduate"+"Enter Employee Qualification-->");
        String poss = sc.nextLine();
        switch (poss) {
            case "1":
                return "Intermediate";
            case "2":
                return "College";
            case "3":
                return "University";
            case "4":
                return "Graduate";
        }

        return poss;
    }

    public static String location() {
        System.out.println("Select your Job" + "\n1.Receptionist" + "\n2.service" + "\n3.expert" + "\n4.supervisor" + "\n5. manager" + "\n6 .director");
        System.out.print("Choose what you do at Furama");
        String pos = sc.nextLine();
        switch(pos) {
            case "1":
                return "Reception";
            case "2":
                return "Service";
            case "3":
                return "Expert";
            case "4":
                return "Supervisor";
            case "5":
                return "Management";
            case "6":
                return "Director";
        }
        return pos;
    }

    public static String checkGender() {
        System.out.println("Select your gender" + "\n1. Male" + "\n2. Female" + "\n3.Other");
        System.out.print("Please select a gender");
        String choss = sc.nextLine();
        switch (choss) {
            case "1":
                return "Male";
            case "2":
                return "Female";
            case "3":
                return "Other";
        }
        return choss;
    }

    public static double checkAcreage() {
        double acreage;
        do {
            check = false;
            System.out.println("Area in here (Land use / pool eg (<30)");
            acreage = sc.nextDouble();
            if (acreage >= 30) {
            } else {
                System.out.print("Hi Hi, then re-enter");
                check = true;
            }
        } while (check);
        return acreage;
    }
    public static double checkExpense() {
        double expense;
        do {
            check = false;
            System.out.println("Enter rental cost eg (money)");
            expense = sc.nextDouble();
            if (expense > 0) {
            } else {
                System.out.print("Hi Hi the rental cost is not negative");
                check = true;
            }
        } while (check);
        return expense;
    }

    public static int checkPeople() {
        int people;
        do {
            check = false;
            System.out.println("Enter number of people to travel");
            people = sc.nextInt();
            if (people > 0 && people < 20) {
            } else {
                System.out.print("Hi Hi number of people traveling <0>20");
                check = true;
            }
        } while (check);
        return people;
    }

    public static int checkNumberOfFloors() {
        int number;
        do {
            check = false;
            System.out.println("Enter number of floors");
            number = sc.nextInt();
            if (number > 0) {
            } else {
                System.out.print("Hi Hi number of floors without negative floors");
                check = true;
            }
        } while (check);
        return number;
    }

    public static String checkStandard() {
        System.out.println("Select your Room Standard" +
                "\n1. VIP Room" +
                "\n2. Normal room" +
                "\n3.Room with Single Bed" +
                "\n4.Double Room");
        System.out.print("Please select the Room Standard you want to stay in");
        String poss = sc.next();
        switch (poss) {
            case "1":
                return "Vip Room";
            case "2":
                return "Regular Room";
            case "3":
                return "Room with Single Bed";
            case "4":
                return "Room with Double Bed";
        }
        return poss;
    }

    public static String rank() {
        System.out.println("Select guest type" +
                "\n 1.Diamond" +
                "\n 2.Platinum" +
                "\n 3.Gold" +
                "\n 4.Silver" +
                "\n 5.Member");
        System.out.print("Please choose");
        String poss = sc.nextLine();
        switch (poss) {
            case "1":
                return "Diamonds";
            case "2":
                return "Platinum";
            case "3":
                return "Gold";
            case "4":
                return "Silver";
            case "5":
                return "Member";
        }
        return poss;
    }

    public static String checkServiceName() {
        System.out.println("Select the type of service you want to use" +
                "\n1.Clothes laundry service." +
                "\n2.Airport shuttle service." +
                "\n3.Cafe Service" +
                "\n4.Restaurant." +
                "\n5.Meeting services, offices." +
                "\n6.Bars." +
                "\n7.Spa Services.");
        System.out.print("Please select the Room Standard you want to stay in");
        String poss = sc.next();
        switch (poss) {
            case "1":
                return "Clothes laundry service";
            case "2":
                return "Airport shuttle service";
            case "3":
                return "Cafe Service";
            case "4":
                return "Restaurant";
            case "5":
                return "Meeting and office services";
            case "6":
                return "Bar";
            case "":
                return "Spa Services";
        }
        return poss;
    }

}
