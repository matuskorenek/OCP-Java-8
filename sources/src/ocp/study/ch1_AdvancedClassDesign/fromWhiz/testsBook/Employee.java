package ocp.study.ch1_AdvancedClassDesign.fromWhiz.testsBook;

/**
 * @Author matus.korenek
 * @Date 7.1.2018
 */
public class Employee {
      public int employeeId;
      public String firstName, lastName;
      public int yearStarted;

      @Override
      public int hashCode() {
            return employeeId;
      }

      //this is not override from Object
      public boolean equals(Employee e) {
            return this.employeeId == e.employeeId;
      }
      public static void main(String[] args) {

      }
}
