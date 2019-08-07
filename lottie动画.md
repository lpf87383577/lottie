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
