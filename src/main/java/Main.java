import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //北関東にある県のリストを作成
        List<String> nKantou = new ArrayList<>();
        nKantou.add("茨城県");
        nKantou.add("群馬県");
        nKantou.add("栃木県");

        //リスト内容と要素数を出力
        System.out.println("北関東は、");
        for (String ken : nKantou) {
            System.out.println(ken);
        }
        System.out.println("の" + nKantou.size() + "県です。");


        //県名をキーに県庁所在地の値を登録する
        Map<String, String> kentyou = new HashMap<>();
        kentyou.put("茨城県", "水戸市");
        kentyou.put("群馬県", "前橋市");
        kentyou.put("栃木県", "宇都宮市");

        //県名と県庁所在地を出力
        System.out.println("北関東の県庁所在地は");
        for (Map.Entry<String, String> kenEntry : kentyou.entrySet()) {
            System.out.println(kenEntry.getKey() + "：" + kenEntry.getValue());
        }

        //kentyouを変更不可能なビューで返す
        Map<String, String> unmodifinableMap = Collections.unmodifiableMap(kentyou);

        try {
            //県名の入力を求める
            System.out.println("登録する県名を入力してください。");
            Scanner scanner1 = new Scanner(System.in);
            String kenName = scanner1.nextLine();

            //県名の入力を求める
            System.out.println("登録する県庁所在地を入力してください。");
            Scanner scanner2 = new Scanner(System.in);
            String townName = scanner2.nextLine();

            //変更不可能なビューのマップに追加（例外）
            unmodifinableMap.put(kenName, townName);

            //例外処理
        } catch (UnsupportedOperationException e) {
            System.out.println("このリストの変更はできません。");
        }
    }
}