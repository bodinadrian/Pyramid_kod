package Package_1; 

import javax.swing.*; //import av standard funktioner i standardpacketet javax som ingår i Netbeans IDE mjukvara

public class Konvertera_C_Kod {

public static void main(String [] args){

int i, j, k; //heltals variabler
    
int empty_spaces;
int number_of_rows = 0; 

boolean go=true;

while(go){ //while-loop START

String input1 = JOptionPane.showInputDialog("How many rows of '#' do you want?\n");
number_of_rows = Integer.parseInt(input1);

if(number_of_rows==23){
JOptionPane.showMessageDialog(null, "Wrong number of rows, please fill in again");
go=true;
}

if(number_of_rows>0 && number_of_rows<=23){
go=false;
}

} //while-loop END

empty_spaces= number_of_rows;

System.out.println("Height: " + number_of_rows);

for(i=2; i<=number_of_rows+1; i++){ //For each row
    
for(j=1; j<empty_spaces; j++){ 
System.out.print(" "); //Fill empty spaces in each row
}

empty_spaces--; //Decrease empty spaces in each row

for(k=1; k<=i; k++){ //Fill with "#" for each row
System.out.print("# ");
}
 
System.out.println();

}

System.exit(0);

}

}
