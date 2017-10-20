public class AnimationArrayList {
    private static MyArrayList<Integer> list = new MyArrayList<Integer>();
    public static MyArrayList<Integer> getUsers(){
        return list;
    }
    public static void setUsers(MyArrayList<Integer> list){
        AnimationArrayList.list = list;
    }
}
