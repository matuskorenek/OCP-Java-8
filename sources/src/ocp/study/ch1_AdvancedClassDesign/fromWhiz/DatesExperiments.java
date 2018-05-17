package ocp.study.ch1_AdvancedClassDesign.fromWhiz;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author matus.korenek
 * @Date 18.2.2018
 */
public class DatesExperiments {

      public static void main(String[] args) {
            LocalDate ld1 = LocalDate.of(2015, 11, 25);
            Year year = Year.of(2014);
            System.out.println(ld1.adjustInto(year.atDay(1)));

            System.out.println("-------------------------------------");

            List<Number> list = new ArrayList<>();
            int i = 10;
            list.add(10);
            list.add(1.2);
            System.out.println(list);

            System.out.println("-------------------------------------");

            LocalDate localDate = LocalDate.of(2018, 1, 20);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/uuuu");
            String sql_date = localDate.format(formatter);
            System.out.println("sql_date: " + sql_date);

            System.out.println("-------------------------------------");

            Date date = new Date(2017, 10, 15);

            String dep_date =  new SimpleDateFormat("yyyy-mm-dd").format(date);
//            String dep_date =  new SimpleDateFormat("dd.MM.yyyy").format(date);
            System.out.println("deprecated date: " + dep_date);
            System.out.println("date - 60 days: " + new Date(date.getTime() - 60L*24*60*60*1000));


            //new SimpleDateFormat("dd-MM-yyyy").format($P{reportDate})
            //$P{reportDate}.format(DateTimeFormatter.ofPattern("d/MM/uuuu"))
            //java.sql.Date.valueOf($P{reportDate})
      }
}
