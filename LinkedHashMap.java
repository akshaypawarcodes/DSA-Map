public class LinkedHashMap {
    public static void main(String[] args) {

        //creating a LinkedHashMap
        java.util.LinkedHashMap<String,Integer> lmap=new java.util.LinkedHashMap<>();
        ///puting the value in linked hashmap
        lmap.put("Akshay",4);
        lmap.put("Aashita",1);
        lmap.put("Sagar",11);
        lmap.put("Paras",10);
        System.out.println(lmap);
        System.out.println("the size of lmap is "+lmap.size());//size of LMap
        lmap.put("Paras",12);//update Paras
        lmap.put("spidy",14);//add spidy
        System.out.println(lmap);
        System.out.println("the size of lmap is "+lmap.size());
        lmap.remove("spidy");//remove spidy key
        //print lmap
        System.out.println(lmap);
        //print all values
        System.out.println(lmap.values());
        //print all keys
        System.out.println(lmap.keySet());
        System.out.println();
        //get id of given key
        System.out.println("the value for key 'sagar' is "+lmap.get("Sagar"));
        //contain method
        System.out.println("is it have key 'Aashita'? "+lmap.containsKey("Aashita"));
        System.out.println();
        System.out.println("is it have key 'vinod'? "+lmap.containsKey("vinod"));
        System.out.println();
        System.out.println("is it have value '55'? "+lmap.containsValue(55));
        System.out.println();
        System.out.println("is it have value '11'? "+lmap.containsValue(11));

    }
}
