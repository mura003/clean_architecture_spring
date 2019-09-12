# spring + kotlin でクリーンアーキテクチャ

## 構成
以下のようにプロジェクトを定義

* Enterprise Business Rules ⇒ domain
  * Entityの定義なんかを入れる
  
* Application Business Rules ⇒ application  
  * usecaseなんかはここいわゆるservice
    * 実装もここにただしビジネスロジックのみでデータのcrudなんかはインテーフェース越し

* Interface Adapters ⇒ adapter   
  * controller
    * フロントからの受け口
  * gateway
    * DBとかメモリとかへのアクセスゲートウェイ
  * presenter
    * 表示ロジック

## 所管
クラス多い！！  
あと、gatewayとusecaseの関連がよくわからなかった  
presenterもフロントエンドと疎結合にするときに必要か？  
APIサーバーのときのJSONレスポンスに必要？  
でも疎結合なのはいいことね。  