

package Encapsulation;

/* Encapsulation - Binding of data with methods;  way of accessing the variables is thru methods(getter and setter nethods
 *  Set the variables to private and access it thru methods . If we set the variables public anyone can access it.
 * */

import java.util.ArrayList;
import java.util.List;

public class CollegeEncapsulation {
        private String collegeName;
        private List<Object> departemt = new ArrayList<>();

    public void setterCollege(String collegeName){

        this.collegeName=collegeName;
    }
    public String getterCollege(){
        return collegeName;
    }

    public void setterDepartment(List<String> departmentList) {
        //add all items to array list = ArrayList.addAll()
        this.departemt.addAll(departmentList);
    }
    public List<Object> getterDepartment(){

            return departemt;
    }


}
