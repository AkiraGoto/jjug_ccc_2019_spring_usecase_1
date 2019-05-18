# jjug_ccc_2019_spring_usecase_1

[JJUG CCC 2019 Spring](http://www.java-users.jp/ccc2019spring/#/)で発表した、[今日から始めるカジュアルなソースコード解析](https://speakerdeck.com/akiragoto/jjug-ccc-2019-spring)という発表の中身で説明したユースケースの詳細版です。

指定されたフォルダ配下にあるJavaファイルを検索して、Switch式に変換できるSwitch文を検索します

## 実行方法

[Mainクラスのexecメソッド実行箇所](https://github.com/AkiraGoto/jjug_ccc_2019_spring_usecase_1/blob/master/src/main/java/jjug_ccc_2019_spring/usecase_1/Main.java#L13)に検索対象が入ったフォルダを指定してください。

Gradleコマンドで実行するとresultフォルダ配下に結果が出力されます。

```
gradle run
```

