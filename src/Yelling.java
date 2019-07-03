/**
 * Joao Rebelo
 * C0706998
 */
import java.util.ArrayList;
public class Yelling {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
	}*/
	
	public String scream(ArrayList<String> name) {
		Boolean isUpperCase = true;
		if(name == null) { //if null
			
			return "Nobody is yelling";
			
		}else if(name.get(0).equals("")) { //if empty
			
			return "Nobody is yelling";
			
		}else if(name.size() == 1) {	//if 1 parameter
			
			char[] charArray = name.get(0).toCharArray();
			//verify if the letter in that name are uppercase
	        for(int i=0; i < charArray.length; i++){
	            if( !Character.isUpperCase( charArray[i] ))
	            	isUpperCase = false;
	        }
	        
	        if(isUpperCase) {
	        	return name.get(0).concat(" IS YELLING");
	        }else {
	        	return name.get(0).concat(" is yelling");
	        }
			
		}else if(name.size() == 2) { //if 2 parameters
			int positionUppercase = 0;
			boolean hasUpperCase = true;

			// verify position of uppercase name
			for (int i = 0; i < name.size(); i++) {
				char[] charArray = name.get(i).toCharArray();
		        for(int j=0; j < charArray.length; j++){
		            if( Character.isUpperCase( charArray[j] )) {
		            	hasUpperCase = true;
		            }else {
		            	hasUpperCase = false;
		            }
		        }
		        
		        if(hasUpperCase) {
		        	positionUppercase = i; 
		        	break;
		        }
		    }

			if (!hasUpperCase) {
				String finalOutput = "";
				finalOutput = name.get(0) + " and " + name.get(1) + " are yelling";
				return finalOutput;
			}else {
				return (positionUppercase == 0) ?
						name.get(1) + " is yelling. SO IS " + name.get(0) + "!":
						name.get(0) + " is yelling. SO IS " + name.get(1) + "!";
			}
			
			
		}else if(name.size() > 2) { //if more than 2 parameters
			int positionUppercase = 0;
			boolean hasUpperCase = true;
			String finalOutput = "";
			
			// verify position of uppercase name
			for (int i = 0; i < name.size(); i++) {
				char[] charArray = name.get(i).toCharArray();
		        for(int j=0; j < charArray.length; j++){
		            if( Character.isUpperCase( charArray[j] )) {
		            	hasUpperCase = true;
		            }else {
		            	hasUpperCase = false;
		            }
		        }
		        if(hasUpperCase) {
		        	positionUppercase = i; 
		        	break;
		        }
		    }
			
			
			if (!hasUpperCase) {
				for (int i = 0; i < name.size(); i++) {
			      if(i == (name.size()-1)) {
			    	  finalOutput =  finalOutput + "and " + name.get(i);
			      }else {
			    	  finalOutput =  finalOutput + name.get(i) + ", ";
			      }
			    }
				
				finalOutput = finalOutput + " are yelling";
				return finalOutput;
			}else {
				int peopleCount = name.size();
				for (int i = 0; i < name.size(); i++) {
					if (i == positionUppercase) {
						continue;
					}else if(peopleCount == 3) {
						if (name.size() < 4) {
							finalOutput =  finalOutput + name.get(i) + " ";
						}else { // to work the last input
							finalOutput =  finalOutput + name.get(i) + ", ";
						}
						
					}else if(peopleCount == 2) {
						finalOutput =  finalOutput + "and " + name.get(i);
					}else {
				    	finalOutput =  finalOutput + name.get(i) + ", ";
				    }
					peopleCount--;
				}
				
				finalOutput = finalOutput + " are yelling. SO IS " + name.get(positionUppercase) + "!";
				
				return finalOutput;
			}
			
			
			
			
			
		}else {
			return "An error ocurred!";
		}
	}
}