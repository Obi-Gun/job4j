package ru.job4j.tracker;

import org.junit.Test;

import java.util.Objects;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class for "Реализовать класс Tracker [#396]" task.
 * В этом классе шло освоение материала по созданию класса обёртки над массивом заявок item.
 * @author Alexandr Sakhatyr (alexandr.010@yandex.ru)
 * @since 01.09.2019
 */
public class TrackerTest {

    /**
     * Tests for public Item add(Item item).
     */
    @Test
    public void whenAddItemThenItemIsAdded() {
        Item[] testItems = new Item[100];
        Item testItem = new Item("Test");
        testItems[0] = testItem;

        Tracker tracker = new Tracker();
        tracker.add(testItem);
        assertThat(tracker.getItems()[0].getName(), is(testItems[0].getName()));
    }
    @Test
    public void whenAddItemsThenItemsAreAdded() {
        Item testItem = new Item("Test");

        Tracker tracker = new Tracker();
        tracker.add(testItem);
        tracker.add(testItem);
        assertThat(tracker.getItems()[1].getName(), is(testItem.getName()));
    }
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    /**
     * Test for public boolean replace(String id, Item item).
     */
    @Test
    public void whenReplaceTest1toTest2ThenTest2() {
        Tracker tracker = new Tracker();
        Item testItem = new Item("Test1");
        tracker.add(testItem);
        String id = tracker.getItems()[0].getId();
        Item testItem2 = new Item("Test2");
        tracker.replace(id, testItem2);
        String result = tracker.getItems()[0].getName();
        String expect = "Test2";
        assertThat(result, is(expect));
    }
    @Test
    public void whenCantFindIdThenTest1WasntReplaced() {
        Tracker tracker = new Tracker();
        Item testItem = new Item("Test1");
        tracker.add(testItem);
        String id = "10001000100";
        Item testItem2 = new Item("Test2");
        tracker.replace(id, testItem2);
        String result = tracker.getItems()[0].getName();
        String expect = "Test1";
        assertThat(result, is(expect));
    }
    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1");
        // Добавляем заявку в трекер. Теперь в объект проинициализирован id.
        tracker.add(previous);
        // Создаем новую заявку.
        Item next = new Item("test2");
        // Проставляем старый id из previous, который был сгенерирован выше.
        next.setId(previous.getId());
        // Обновляем заявку в трекере.
        tracker.replace(previous.getId(), next);
        // Проверяем, что заявка с таким id имеет новые имя test2.
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    /**
     * Tests for public boolean delete(String id)
     */
    @Test
    public void whenDeleteFirstElSecondWillBeFirst() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("First"));
        tracker.add(new Item("Second"));
        tracker.add(new Item("Third"));
        tracker.add(new Item("Fourth"));

        assertThat(tracker.getItems()[0].getName(), is("First"));
        assertThat(tracker.getPosition(), is(4));

        assertThat(tracker.delete(tracker.getItems()[0].getId()), is(true));
        assertThat(tracker.getItems()[0].getName(), is("Second"));
        assertThat(tracker.getPosition(), is(3));

        assertThat(tracker.delete(tracker.getItems()[0].getId()), is(true));
        assertThat(tracker.getItems()[0].getName(), is("Third"));
        assertThat(tracker.getPosition(), is(2));

        assertThat(tracker.delete(tracker.getItems()[0].getId()), is(true));
        assertThat(tracker.getItems()[0].getName(), is("Fourth"));
        assertThat(tracker.getPosition(), is(1));

        assertThat(tracker.delete(tracker.getItems()[0].getId()), is(true));
        assertThat(Objects.isNull(tracker.getItems()[0]), is(true));
        assertThat(tracker.getPosition(), is(0));
        assertThat(tracker.getItems().length, is(100));
    }
    @Test
    public void whenDoesNotFindElByIdThenTrue() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("First"));
        tracker.add(new Item("Second"));
        tracker.add(new Item("Third"));
        String id = "1";
        assertThat(tracker.getItems()[2].getName(), is("Third"));
        assertThat(tracker.getPosition(), is(3));
        assertThat(tracker.delete(id), is(false));
        assertThat(tracker.getItems()[2].getName(), is("Third"));
        assertThat(tracker.getPosition(), is(3));
        assertThat(tracker.getItems().length, is(100));
    }

    /**
     * Tests for public Item[] findAll().
     */
    @Test
    public void ifAdd2ItemsThenThereAre2ItemsInside() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("Test1");
        Item item2 = new Item("Test2");
        tracker.add(item1);
        tracker.add(item2);
        int result = tracker.findAll().length;
        int expect = 2;
        assertThat(result, is(expect));
    }

    /**
     * Tests for public Item[] findByName(String key)
     */
    @Test
    public void ifWasFound3ElementsByNameThen3() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("Test1");
        Item item2 = new Item("Test2");
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 10; i++) {
                tracker.add(item1);
            }
            tracker.add(item2);
        }

        int result = tracker.findByName("Test2").length;
        int expect = 3;
        assertThat(result, is(expect));
    }

    /**
     * Tests for public Item findById(String id).
     */
    @Test
    public void ifSearchingIsFourthThenTrue() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("Test1");
        Item item2 = new Item("Test2");
        Item item3 = new Item("Test3");
        Item item4 = new Item("Searching");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);

        String id = tracker.getItems()[3].getId();
        String result = tracker.findById(id).getName();
        String expect = "Searching";
        assertThat(result, is(expect));
    }
    @Test
    public void ifSearchingWasNotFound() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("Test1");
        Item item2 = new Item("Test2");
        Item item3 = new Item("Test3");
        Item item4 = new Item("Test4");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);

        String id = "111000111";
        Item result = tracker.findById(id);
        Item expect = null;
        assertThat(result, is(expect));
    }
}
