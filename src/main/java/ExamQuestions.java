import java.util.List;

import javax.sql.rowset.FilteredRowSet;


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
        if(firstNode.getItem() == null){
            throw new IllegalArgumentException();
        }
        Node newNode = firstNode;
        int count = 1;
        while(newNode.getNext() != null){
            count++;
            newNode = newNode.getNext();
        }
        if(count < 3){
            throw new IllegalArgumentException();
        }
        else if(count == 3){
            firstNode = firstNode.getNext();
            firstNode.setNext(null);
        }
        else{
            count = count/2;
            while(count-- > 1){
                firstNode = firstNode.getNext();
            }
            firstNode.setNext(firstNode.getNext().getNext());
        }



    }
}
