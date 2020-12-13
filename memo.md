Gradle + Spring Boot + Eclipse
============================

- 参考文献
 1. [Gradle Install](https://gradle.org/install/)
 2. [Eclipse環境でGradleビルドするJavaアプリケーションの開発tips] https://www.geekfeed.co.jp/geekblog/tips-of-java-gradle-eclipse
 3. https://qiita.com/You_name_is_YU/items/ead77e2e00c120058ce8
 4. https://fintan-contents.github.io/spring-crib-notes/latest/html/web/view/thymeleaf-page-layout.html
 5. https://dev.classmethod.jp/articles/spring-boot_log_output/
 6. https://learning-collection.com/springboot-%E3%83%AD%E3%82%B0%E3%82%A4%E3%83%B3%E7%94%BB%E9%9D%A2%E4%BD%9C%E6%88%90/
 7. https://confrage.jp/spring-boot-mybatis%E3%81%A7sql%E3%83%AD%E3%82%B0%E3%82%92%E5%87%BA%E5%8A%9B%E3%81%99%E3%82%8B%E6%96%B9%E6%B3%95/
 8. https://qiita.com/kenhori/items/9941a159285f9360e877
 9. https://spring.io/guides/gs/validating-form-input/
 10. https://kojion.com/posts/831
 
## Gradle Install
 
### Macの場合

brewでインストールはしない

以下より、バイナリを取得
> https://gradle.org/next-steps/?version=6.7.1&format=bin

展開して配置

> $ sudo mkdir /opt/gradle
> $ sudo unzip -d /opt/gradle gradle-6.7.1-bin.zip
> $ ls /opt/gradle/gradle-6.7.1
> LICENSE  NOTICE  bin  getting-started.html  init.d  lib  media

> $ echo "export PATH=$PATH:/opt/gradle/gradle-6.7.1/bin" >> ~/.bash_profile

>  $ gradle -v


## Eclipse に Gradle 



### プロジェクト作成

プロジェクトの作成

> gradle init
 
build.gradleに以下を追記

'''build.gradle
apply plugin: 'java'
apply plugin: 'eclipse'
'''

以下のコマンドを実行すると、Eclipseの管理ファイルが作成される

> gradle eclipse
> 

### Gradle IDE Packプラグインインストール

EclipseのHelpメニュー > Eclipse Marketplace..から"gradle"で検索して、Gradle IDE Packをインストールする


## アプリをつくっていみる

https://qiita.com/j-work/items/8c6c161b0f0baaaf2c3f




## 方針

CSSやJSの置き場は?
main/resource/static にする




