
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class SkilledEmployee extends Employee{
    
    public ArrayList skillList = new ArrayList();
    
    public void setSkill(String skill) throws InvalidSkillException{
        
//        if(skill.substring(0,4).equals("COMP")){
//            skillList.add(skill);
//        }else {
//            throw new InvalidSkillException("Invalid skill");
//            //erro
//        }
        
        
        if( filterSkill( skill ) ){
            skillList.add(skill);
        }
       
    }
    
    public ArrayList getSkills(){
        return skillList;
    }
    public void print(){   
    	  super.print();
        System.out.println("Employee has the following skills: ");
        for(Object obj : skillList){
            System.out.println("\t"+ obj);
        }
    }

    //PREFIX COMP:xxxxx
//    private boolean filterSkill(String skill) {
//        try {
//            if(skill.substring(0,4).equals("COMP")){
//                return true;
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        return false;
//    }

     private boolean filterSkill(String skill) throws InvalidSkillException{
        
         if(skill.substring(0,4).equals("COMP")){
            return true;
        }
            throw new InvalidSkillException("Invalid skill");
//        return false;
    }

}
