## 安卓工程交接

1. 启动流程

   <img src="/Users/lovarunlee/Desktop/Android-交接/卫士通安卓启动流程图.jpg" alt="卫士通安卓启动流程图" style="zoom:50%;" />

2. 目录结构

   <img src="/Users/lovarunlee/Desktop/Android-交接/代码目录结构1@2x.png" alt="代码目录结构1@2x" style="zoom:33%;" />

   ---

   

   <img src="/Users/lovarunlee/Desktop/Android-交接/代码目录结构2@2x.png" alt="代码目录结构2@2x" style="zoom:33%;" />

   ---

   <img src="/Users/lovarunlee/Desktop/Android-交接/代码组织结构3.png" alt="代码组织结构3" style="zoom:50%;" />

   ---

3. 事件分发流程的2种实现

   - 第一种，事件总线的方式

     ![事件分发方式1](/Users/lovarunlee/Desktop/事件分发方式1.png)

     ---

     

   - 第二种，响应式的方式

     ![事件回调方式图1](/Users/lovarunlee/Desktop/事件回调方式图1.png)

     ![事件回调方式-图2](/Users/lovarunlee/Desktop/事件回调方式-图2.png)


     ---


​     

4. 分包、打包流程

   分包调试配置：

   ![分渠道调试环境切换方法](/Users/lovarunlee/Desktop/Android-交接/分渠道调试环境切换方法.png)

   ---

   打包配置：

   ![分渠道打包方法打包](/Users/lovarunlee/Desktop/Android-交接/分渠道打包方法打包.png)

    打包后apk路径在CloudDisk-Android/app/build/outputs/apk/...
   ---

5. 注意事项

   - 当前密码中间件需要在ndk中添加支持不同CPU的配置，与使用的TBS预览插件冲突，导致无法预览，暂未解决（关联人员：梁海军）

6. 相关对接工程、人员

   - APP加固：

   使用的是卫士通北京团队的加固方式，只需将需要加固的apk包发给他们，半个小时即可加固完成。联系：张长平，微信号：changping_ren。

   - 电科集成：

   集成查看相关文档，电科集成联系人：余耀明，微信号：yymao930326。