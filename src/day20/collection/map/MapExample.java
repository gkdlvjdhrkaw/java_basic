package day20.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


class Student {
    String name;
    int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}


public class MapExample {

    public static void main(String[] args) {

        // Map 은 key, value 쌍으로 데이터를 관리 key 는 중복불가, value 는 중복가능능
       Map<String, Student> students = new HashMap<>();

        // put(k, v) : 맵에 데이터를 추가
        students.put("짹짹이", new Student("김철수", 3));
        students.put("냥냥이", new Student("도우너", 5));
        students.put("멍멍이", new Student("고길동", 1));

        System.out.println(students);

        System.out.println(students.size());

        // 중복된 key 를 넣으면 value 가 수정됩니다.
        students.put("냥냥이", new Student("홍길동", 6));
        System.out.println(students);

        // get(key) : map 에 저장된 객체 참조
        Student student = students.get("멍멍이");
        System.out.println("student = " + student);
        System.out.println(student.name);

        int g = students.get("냥냥이").grade;


        // containKey(key) : map 에 해당 key 가 존재하는지 유무 확인.
        System.out.println(students.containsKey("깩깩이"));
        System.out.println(students.containsKey("짹짹이"));
        
        // map 의 반복문 처리
        Set<String> keySet = students.keySet();
        System.out.println("keySet = " + keySet);

        System.out.println("====================================");
        for (String key : keySet) {
            System.out.println(students.get(key));
        }

        // remove(key) : key 에 해당하는 데이터셋(Entry) 삭제
        students.remove("냥냥이");
        System.out.println(students);

        students.clear();
        System.out.println(students.isEmpty());


    } // main end
}
