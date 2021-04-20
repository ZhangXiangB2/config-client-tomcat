# config-client-tomcat

### 部署

- 使用 Tomcat8 部署此專案
須於 tomcat VM arguments 中設定以下兩參數
```
-Dspring.profiles.active=prod 
-Dencrypt.key=test
```

### 測試

- 可透過 Get 請求進行測試

```
測試取得一般參數
http://localhost:8080/config-client-tomcat/test

測試取得加密參數
http://localhost:8080/config-client-tomcat/password
```
