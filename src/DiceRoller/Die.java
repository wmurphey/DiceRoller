package DiceRoller;
public class Die {

 int faceValue;

public int roll( int numFaces){
    if (numFaces == 100){
        faceValue = (int)(Math.random() * 10) +1;
        faceValue = faceValue * 10;
    }
    else{
        faceValue = (int)(Math.random() * numFaces) +1;
    }
    return faceValue;
} 
public int getFaceValue(){
    return faceValue;
}
    

}
