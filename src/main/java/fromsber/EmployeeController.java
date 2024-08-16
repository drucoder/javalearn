package fromsber;

import java.util.*;
import java.util.stream.Collectors;

//@RestController
public class EmployeeController {


    private List<Employee> employees;

    public EmployeeController() {
    }

    public Map<Status, List<Employee>> getListEmployee(List<Employee> employees) {
//        Map<Status, List<Employee>> map = new HashMap<>();
//
//        for (Employee employee : employees) {
//            ArrayList<Employee> emptyList = new ArrayList<>();
//            List<Employee> orDefault = map.getOrDefault(employee.getStatus(), emptyList);
//            orDefault.add(employee);
//            map.put(employee.getStatus(), orDefault);
//        }
//        return map;

        return employees.stream().collect(Collectors.groupingBy(Employee::getStatus));
    }

    public static void main(String[] args) {

        EmployeeController employeeController = new EmployeeController();
        List<Employee> employeeList = new ArrayList<>(
                Arrays.asList(
                        new Employee("Masha", Status.ACCEPTED),
                        new Employee("Nick", Status.ACCEPTED),
                        new Employee("Sasha", Status.NOT_ACCEPTED),
                        new Employee("Dasha", Status.ACCEPTED),
                        new Employee("Misha", Status.NOT_ACCEPTED)
                        )
        );


        System.out.println(employeeList.get(1).getStatus());
        Map<Status, List<Employee>> listEmployee = employeeController.getListEmployee(employeeList);

        System.out.println(listEmployee);
    }
}
