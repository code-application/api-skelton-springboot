# api-skelton-springboot

## 実行方法

### ビルド

```sh
./gradlew build
```

### サーバー起動

デフォルトでは`http://localhost:8080`で起動する

```sh
./gradlew bootRun
```

### テスト

#### 単体テスト

テスト結果を`build\reports\tests\test\index.html`に出力する

```sh
./gradlew test
```

#### API テスト

```sh
./gradlew apiTest
```

### テストカバレッジ出力

テストカバレッジを以下に出力する

- HTML: `build\reports\coverage\skelton\html\index.html`
- XML: `build\reports\coverage\skelton\jacocoTestReport.xml`

```sh
./gradlew jacocoTestReport
```
