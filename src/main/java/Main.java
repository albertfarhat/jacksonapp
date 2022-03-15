import com.fasterxml.jackson.databind.ObjectMapper;
import entities.Employee;

public class Main {

    public static void main(String[] args){
        String jsonString = "{\"id\":\"123456654\",\"firstName\":\"firstName\",\"lastName\":\"lastName\"}";
        try
        {
            ObjectMapper objectMapper = new ObjectMapper();
            var employee = objectMapper.readValue(jsonString, Employee.class);

            System.out.println(employee.toString());

        }catch (Exception ex){
            ex.printStackTrace();
            System.out.println(ex);
        }

    }
}
