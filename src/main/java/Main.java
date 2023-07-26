import java.util.*;

public class Main {
    public static void main(String[] args) {

        //北関東にある県のリストを作成
        List<String> Nkantou = new ArrayList<>();
        Nkantou.add("茨城県");
        Nkantou.add("群馬県");
        Nkantou.add("栃木県");

        //リスト内容と要素数を出力
        System.out.println("北関東は、");
        for (String ken : Nkantou) {
            System.out.println(ken);
        }
        System.out.println("の" + Nkantou.size() + "県です。");


        //県名をキーに県庁所在地の値を登録する
        Map<String, String> kentyou = new HashMap<>();
        kentyou.put("茨城県", "水戸市");
        kentyou.put("群馬県", "前橋市");
        kentyou.put("栃木県", "宇都宮市");

        //県名と県庁所在地を出力
        System.out.println("北関東の県庁所在地は");
        for (Map.Entry<String, String> kenentry : kentyou.entrySet()) {
            System.out.println(kenentry.getKey() + "：" + kenentry.getValue());
        }

        //県名の入力を求める
        System.out.println("北関東の件名を漢字で入力してください。（○○県）");
        Scanner scanner = new Scanner(System.in);
        String kenname = scanner.nextLine();

        //入力された文字（キー）に値がなかったときの処理
        if (kentyou.get(kenname) == null) {
            System.out.println("北関東にある県名ではないか、入力内容が間違っています。");
        } else {
            //値があれば県名と県庁所在地を出力する
            System.out.println(kenname + "の県庁所在地は" + kentyou.get(kenname));
        }

    }
}

