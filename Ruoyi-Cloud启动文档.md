# Ruoyi-Cloud  启动文档笔记

#### 介绍
开源项目：https://gitee.com/y_project/RuoYi-Cloud.git

#### 软件架构
![RUNOOB 图标](https://oscimg.oschina.net/oscnet/up-aaa2d885b0fba37e52b56f0948edde1c4fe.png)

#### 安装教程(本人环境)
    ~~~   
    1. JDK       - java version "1.8.0_191"
    2. MySql     - 8.0.13
    3. Redis     - 3.2
    4. Maven     - Apache Maven 3.5.4 npm
    5. Node      - 6.12.0
    6. Nacos     - 1.3(官方最新的)

#### 安装教程（什么环境，拉代码这些自行补脑）
1. 创建数据库ry-cloud，ry-config并导入数据脚本ry_2020520.sql（必须），quartz.sql（可选）
2. Nacos 官方文档：https://nacos.io/en-us/docs/quick-start.html
3. 下载的文件解压出来，并修改\nacos\conf\application.properties 注意是： application.properties （这个文件）
4. 修改的具体内容是，17行到25行，前面的# 都删掉一个，一个，别删多了，然后修改上面的默认数据库信息为你自己的
5. 由于Nacos 不支持mysql 8版本，所以折腾了一下，下面这个路径没有创建吧，nacos\plugins\mysql\ ，然后把 mysql-connector-java-8.0.11.jar 驱动包丢进去，再启动即可
6. 登录后你会看到 ruoyi-****.yml这个列表文件，看到后面有几个选项，点击编辑，然后去修改自己对应的 mysql 和 redis 配置信息，点击右下角发布即可
7. 进入idea 里面去启动项目吧，不区分先后顺序了（能看到这个项目，我相信启动这个都会吧，不会就去补基础）
8. 进入 ruoyi-ui文件夹下面开始启动前端页面了（当然了，安装中我没有遇到什么错误，所以也就没有什么错误时处理了）
9. 1. npm install  
   2. npm install --registry=https://registry.npm.taobao.org
   3. npm install dev (此命令执行是启动项目)
   ~~~ 
    DONE  Compiled successfully in 15857ms                                                                                                                                                                                                                                                               下午2:01:03
   
     App running at:
     - Local:   http://localhost:80/
     - Network: http://192.168.0.215:80/
   
     Note that the development build is not optimized.
     To create a production build, run npm run build.
   看到这样的信息，恭喜你启动完成！

