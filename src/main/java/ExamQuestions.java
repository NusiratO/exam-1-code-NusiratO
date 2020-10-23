import java.util.List;

import org.graalvm.compiler.hotspot.stubs.OutOfBoundsExceptionStub;

public class ExamQuestions {

    public static int getMiddleItem(List<Integer> aList){
        if(aList.size() == 0){
            throw new IllegalArgumentException();
      }
        int middleItem = aList.size();
        middleItem = middleItem/2;
        return aList.get(middleItem);


    }

    public static void removeThirdItem(String[] anArray){
        if (anArray.length < 3){
            throw new IllegalArgumentException(); 
        }
        else if(anArray[2] == null){
            throw new IllegalArgumentException();
        }
            int index = 2; 
            for (int i = 2; i < anArray.length - 1; i++){
                if(anArray[i+1] == null){
                    anArray[i] = null;
                }
                else{
                    anArray[i] = anArray[i + 1];
                }
            }
            anArray[anArray.length-1] = null;     
    }

    public static void removeThirdItem(Node firstNode){
        Node current = firstNode;
        int count = 1;
        if(firstNode.getItem() == null){
            throw new IllegalArgumentException();
        }
        if(firstNode.getNext() == null){
            firstNode.setNext(null);
        }
        while(current.getNext() != null || count != 3){
            count++;
            current = current.getNext();
        }



    }
}
