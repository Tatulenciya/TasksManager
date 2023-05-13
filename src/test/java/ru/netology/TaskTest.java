package ru.netology;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class TaskTest {

    @Test
    public void searchSimpleTaskIfTrue() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("родител");

        Assertions.assertTrue(actual);
    }

    @Test
    public void searchSimpleTaskIfFalse() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Маме");

        Assertions.assertFalse(actual);
    }

    @Test
    public void searchEpicIfTrue() {
        String[] subtasks = { "Молоко", "Яйца", "Хлеб" };
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Яйца");

        Assertions.assertTrue(actual);
    }

    @Test
    public void searchEpicIfFalse() {
        String[] subtasks = { "Молоко", "Яйца", "Хлеб" };
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Маме");

        Assertions.assertFalse(actual);
    }

    @Test
    public void searchMeetingIfTrueTwoCondition() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение новой версии НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual = meeting.matches("версии");

        Assertions.assertTrue(actual);
    }

    @Test
    public void searchMeetingIfTrueOneCondition() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение новой версии НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual = meeting.matches("НетоБанк");

        Assertions.assertTrue(actual);
    }

    @Test
    public void searchMeetingIfFalse() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение новой версии НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual = meeting.matches("вторник");

        Assertions.assertFalse(actual);
    }


}