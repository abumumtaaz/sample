/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listCollection;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Properties;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author ABU-MUMTAAZ
 */
public class ArrayListTest {

    static List<String> list1, list2, list3;

    private void start() {
        list1 = new ArrayList<>();
        list2 = new LinkedList<>();
        Iterator<String> iterator = list1.iterator();
        PriorityQueue<String> queue = new PriorityQueue<>();
        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();
        SortedSet<String> sortedSet1 = new TreeSet<>();

    }

    private static void properties() {
        try {
            Properties props = new Properties();
            props.setProperty("Name", "Adeola");
            props.setProperty("City", "Ogbomoso");
            props.setProperty("DOB", "2015");
//            FileOutputStream fos = new FileOutputStream("prop2.uuk");
//            props.save(fos, "Initial Properties");

            Properties p = new Properties();
            FileInputStream fis = new FileInputStream("prop2.uuk");
            p.load(fis);
            Set<Object> set = p.keySet();
            for (Object set1 : set) {
                System.out.println(set1.toString() + "=" + p.getProperty(set1.toString()));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        properties();
    }
}
