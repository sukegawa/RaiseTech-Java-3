# RaiseTech-Java-3 task
RaiseTechのJavaコース第3回の課題です。<br>

## 2023.7.28　READMEでコンフリクトが発生したため、解消しました。

## 2023.7.27　以下３点の修正を行いました。  
・ワイルドカードインポートになっていたため、適した個別のインポートにしました。  
・変数名を整理し、キャメルケースにしました。  
・例外処理(39-58)  
初回提出時にMapの値がnullだった場合の処理が条件分岐だったため、HashMapをCollections.unmodifiableMapで読み取り専用ビューを適用させ、  
そのビューに対してputさせることで例外（UnsupportedOperationException）を発生させ、それに対する処理を実装しました。  

## 2023.7.26　課題提出
・List(7-17)<br>
県名のArrayListインスタンス化<br>
要素内容と要素数の出力を行いました。<br>
・Map(21-30)<br>
県名と県庁所在地のHashMapインスタンス化<br>
県名をキーに県庁所在地を値としています。<br>
Entryインターフェースを用いてキーと値をセットで出力を行いました。<br>
・例外処理(33-43)<br>
ScannaerとSystemクラスを用いて入力を求め、その内容をキーとしてHashMapに値がなかった（null）だった場合、エラー文を表示するようにしました。<br>
（Javaふりがなプログラミングで学習したことを参考にしました）
