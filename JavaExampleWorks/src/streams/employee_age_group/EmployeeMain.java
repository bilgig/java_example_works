package streams.employee_age_group;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {
    List<Employee> employeeList= Arrays.asList(
    new Employee("Bilgi",30,"Developer"),
    new Employee("Gökay",30,"Software Engineer"),
    new Employee("Fatih", 25,"Director"),
    new Employee("Doğa", 25,"Cto Chef"));

    Map<Integer, List<Employee>> employeeMap= employeeList.stream()
            .collect(Collectors.groupingBy(Employee::getAge));
       employeeMap.forEach((age,List) -> {
                        System.out.println("Yaşı "+age+" olan çalışanlar: ");
                        List.forEach(employee -> System.out.println("Adı: "+employee.getName()+", Yaşı: "+employee.getAge()+" Pozisyonu: "+employee.getPosition()));
       });


    }
}
