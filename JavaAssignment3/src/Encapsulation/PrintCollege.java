package Encapsulation;

import java.util.*;

public class PrintCollege {

    public static void main(String[] args) {
        Map<Object,Object> mapObj = new HashMap<>();
        //Map<Object,Object> mapObj = new LinkedHashMap<>();
        //College 1
        CollegeEncapsulation college1 = new CollegeEncapsulation();
        college1.setterCollege("SASTRA");
        college1.setterDepartment(Arrays.asList("IT","CSE","MECH","ECE","AERO","AUTO","EI"));
        mapObj.put(college1.getterCollege(),college1.getterDepartment());

        //College 2
        CollegeEncapsulation college2 = new CollegeEncapsulation();
        college2.setterCollege("VIT");
        college2.setterDepartment(Arrays.asList("Biotech","BioInformatics","BioEngineering","DataScience"));
        mapObj.put(college2.getterCollege(),college2.getterDepartment());


        //College 3
        CollegeEncapsulation college3 = new CollegeEncapsulation();
        college3.setterCollege("NIT Trichy");
        college3.setterDepartment(Arrays.asList("CSE","IT","ECE","EEE","MECH"));
        mapObj.put(college3.getterCollege(),college3.getterDepartment());

        //College 4
        CollegeEncapsulation college4 = new CollegeEncapsulation();
        college4.setterCollege("PSG Tech");
        college4.setterDepartment(Arrays.asList("CSE","Textile tech","Production Engg","Biotech","MCA"));
        mapObj.put(college4.getterCollege(),college4.getterDepartment());

        //College 5
        CollegeEncapsulation college5 = new CollegeEncapsulation();
        college5.setterCollege("PES University");
        college5.setterDepartment(Arrays.asList("IT","AUTO","Mech","Mechatronics","Aeronautical"));
        mapObj.put(college5.getterCollege(),college5.getterDepartment());



        for(Map.Entry i : mapObj.entrySet()){
            System.out.println(i.getKey()+ " : " +i.getValue());
        }

    }


}

