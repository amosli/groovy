/**
 * Created by amosli on 14-9-14.
 */
class ListDemo {
    static void main(args) {

        //range
        def range = 0..4;
        println(range.class);//class groovy.lang.IntRange
        assert range instanceof List;

        //Collection
        def personGroovy = ["name", "age", "address"];
        println(personGroovy.class);//class java.util.ArrayList
        assert personGroovy instanceof Collection;
        assert personGroovy instanceof ArrayList;

        //java
        Collection<String> personJava = new ArrayList<String>();
        personJava.add("name");
        personJava.add("age");
        personJava.add("address");
        println(personJava.class);//class java.util.ArrayList

        personJava.add("hobby");
        personJava << "gender";
        personJava[5] = "country";

        assert personJava[1] == "age";

        //Map
        Map<String, String> map = new HashMap<String, String>();
        map.put("name", "Andy");
        map.put("VPN-#", "45");

        def hash = [name: "Andy", "VPN-#": 45]
        assert hash.getClass() == java.util.LinkedHashMap;


        hash.put("id", 23)
        assert hash.get("name") == "Andy"
        hash.dob = "01/29/76"

        assert hash.dob == "01/29/76"

        //Iterator
        def acoll = ["Groovy", "Java", "Ruby"]

        for (Iterator iter = acoll.iterator(); iter.hasNext();) {
            println iter.next()
        }

        acoll = ["Groovy", "Java", "Ruby"];

        acoll.each {
            println it
        }


    }
}
