# spring + kotlin でクリーンアーキテクチャ

## 構成
以下のようにプロジェクトを定義

* Enterprise Business Rules ⇒ domain  
  Entityの定義なんかを入れる
  
* Application Business Rules ⇒ application  
  use caseなんかはここいわゆるservice

* Interface Adapters ⇒ adapter  
  controller系

* Frameworks & Drivers ⇒ drivers  
  DBなんかはここ