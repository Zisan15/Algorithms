package BigO;

//Array ne kadar büyük olursa olsun , algoritmanın çalıştırılma süresi hep sabit kalacaktır


public class O1 {// O(1) ---> Constant Complexity

    public static void main(String[] args) {

        int[] arr = {10, 2, 5, 34, 56, 546546, 568790, 65413};
        //arrayin son elemanını ekrana yazdıralim
        System.out.println(arr[arr.length-1]);


    }


}
