==1.添加依赖==
```python
//没有使用Androidx的
compile 'com.airbnb.android:lottie:2.7.0'
//使用Androidx的
compile 'com.airbnb.android:lottie:2.8.0'
```
==2.引入必要的json文件==
在app\src\main\assets下新建一个json文件

==3.布局中使用==

```python
<com.airbnb.lottie.LottieAnimationView
    android:id="@+id/lottieAnimationView"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:lottie_fileName="lottie_data_origin.json"
    app:lottie_loop="true"
    app:lottie_autoPlay="true"/>
```
>lottie_fileName 指定json文件路径

>lottie_loop 是否循环

>lottie_autoPlay 是否自动播放

==4.监听动画==
```python
// 监听动画
animationView.addAnimatorUpdateListener((animation) -> {
    // Do something.
});

// 播放动画
animationView.playAnimation();

//控制进度（0-1之间float类型）
animationView.setProgress(f);
```
==5.适配==

lottie自带适配，适配原理很简单，解析json时，从json读取宽高之后会再乘以手机的密度。再在使用的时候判断适配后的宽高是否超过屏幕的宽高，如果超过则再进行缩放。以此保障 Lottie 在 Android 平台的显示效果.

==手机密度 = (√（1920^2 + 1080^2）)/5==

1920*1080手机像素
5手机尺寸