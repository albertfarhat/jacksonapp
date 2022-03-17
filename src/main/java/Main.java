import com.fasterxml.jackson.databind.ObjectMapper;
import entities.City;
import entities.Distance;
import entities.Employee;

import java.net.URL;
import java.util.List;

public class Main {

    public static void main(String[] args){
        String jsonString = "{\"id\":\"123456654\",\"firstName\":\"firstName\",\"lastName\":\"lastName\"}";
        try
        {
            ObjectMapper objectMapper = new ObjectMapper();
            var employee = objectMapper.readValue(jsonString, Employee.class);
            System.out.println(employee.toString());

            var employees = objectMapper
                    .readValue(new URL("file:src/main/resources/data/employees.json"), List.class);
            System.out.println(employees.toString());

            String mile = new ObjectMapper().writeValueAsString(Distance.values());
            System.out.println(mile);

            String json = "{\"distance\":0,\"name\":\"Beirut\"}";
            City city = new ObjectMapper().readValue(json, City.class);
            System.out.println(city.toString());

        }catch (Exception ex){
            ex.printStackTrace();
            System.out.println(ex);
        }

    }
}
