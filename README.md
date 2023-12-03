官方demo: [https://cn.dubbo.apache.org/en/docs3-v2/java-sdk/quick-start/spring-boot/][https://cn.dubbo.apache.org/en/docs3-v2/java-sdk/quick-start/spring-boot/]
准备工作:
1. zookeeper下载地址：[https://archive.apache.org/dist/zookeeper/][https://archive.apache.org/dist/zookeeper/]，
选择版本，下载带有 -bin（已经编译） 的压缩包
2. 解压zk，修改zk的默认配置，进入 conf 目录，执行: mv zoo_sample.cfg zoo.cfg
3. zk 需要 Java 环境，启动前需要修改 bin 目录下的 zkEnv.sh 里的 java 启动配置
```
if [[ -n "$JAVA_HOME" ]] && [[ -x "$JAVA_HOME/bin/java" ]];  then
    JAVA="$JAVA_HOME/bin/java"
elif type -p java; then
    JAVA={自己的 JAVA_HOME 目录（可以通过 echo $JAVA_HOME 命令查看）}/bin/java
```
4. 启动zk，进入 bin 目录，./zkServer.sh start 启动 zk
5. 执行 ps -ef | grep zookeeper 判断是否启动成功

NOTE:
 1. 过程中没有出现权限拒绝等错误，命令前加 sudo，出现无权修改文件，修改文件权限 sudo chmod 777 fileName
 2. 步骤 3 也可以通过配置 JAVA_HOME 来避免修改文件 [https://blog.csdn.net/qq_40337206/article/details/100062612][https://blog.csdn.net/qq_40337206/article/details/100062612]
