# Yava
a process manager for android 

## 生成一个key.store文件用于打包签名
keytool -genkey -v -keystore yava.keystore -alias yava -keyalg RSA -keysize 2048 -validity 10000
## Fragment 充分利用屏幕
典型应用是在Activity中嵌套Fragment 嵌套方式布局随着屏幕的变化而变化。
Fragment的使用 在layout下建立 fragment对应的布局的xml 同时建立对应的Fragment类，这个类要继承extend Fragment 类，并覆写onCtreateView 方法