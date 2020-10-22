import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ExamQuestionsTest {
 
    @Test
    public void getMiddleItemTest(){
        List<Integer> theList = Arrays.asList(7, 4, 18, 6, 12, 5, 9);
        assertEquals(6, ExamQuestions.getMiddleItem(theList));

        theList = Arrays.asList(7, 4, 18, 6, 12, 5);
        assertEquals(6, ExamQuestions.getMiddleItem(theList));

        theList = Arrays.asList(7, 4);
        assertEquals(4, ExamQuestions.getMiddleItem(theList));

        theList = Arrays.asList(7);
        assertEquals(7, ExamQuestions.getMiddleItem(theList));

        assertThrows(IllegalArgumentException.class, () -> {
            List<Integer> emptyList = new ArrayList<>();
            ExamQuestions.getMiddleItem(emptyList);
        });
    }

    @Test
    public void removeThirdItemArrayTest(){
        String[] arr1 = {"a", "b", "c", "d", "e", null};

        ExamQuestions.removeThirdItem(arr1);
        String[] arr1Expected = {"a", "b", "d", "e", null, null};
        assertArrayEquals(arr1Expected, arr1);

        ExamQuestions.removeThirdItem(arr1);
        String[] arr2Expected = {"a", "b", "e", null, null, null};
        assertArrayEquals(arr2Expected, arr1);

        ExamQuestions.removeThirdItem(arr1);
        String[] arr3Expected = {"a", "b", null, null, null, null};
        assertArrayEquals(arr3Expected, arr1);

        assertThrows(IllegalArgumentException.class, () -> {
            ExamQuestions.removeThirdItem(arr1);
        });

        String[] arr2 = {"a", "b", "c"};
        ExamQuestions.removeThirdItem(arr2);
        String[] arr4Expected = {"a", "b", null};
        assertArrayEquals(arr4Expected, arr2);

        String[] arr3 = {"a", "b"};
        assertThrows(IllegalArgumentException.class, () -> {
            ExamQuestions.removeThirdItem(arr3);
        });
    }

    @Test
    public void removeThirdItemNodeTest(){
        Node list1 = new Node("a", new Node("b", new Node("c", new Node("d", new Node("e")))));

        ExamQuestions.removeThirdItem(list1);
        Node list1Expected = new Node("a", new Node("b", new Node("d", new Node("e"))));
        assertEquals(list1Expected, list1);

        ExamQuestions.removeThirdItem(list1);
        Node list2Expected = new Node("a", new Node("b", new Node("e")));
        assertEquals(list2Expected, list1);

        ExamQuestions.removeThirdItem(list1);
        Node list3Expected = new Node("a", new Node("b"));
        assertEquals(list3Expected, list1);

        assertThrows(IllegalArgumentException.class, () -> {
            ExamQuestions.removeThirdItem(list1);
        });
    }

}
