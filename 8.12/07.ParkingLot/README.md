1. 创建停车场类

含有属性：车位数量，每个车位停车的车类的对象 
创建方法：车辆入库，车辆出库
当出库方法被调用后将通知所有的汽车类，有新的车位

创建方法：
查询当前停车场的剩余车位方法

根据车牌号查询汽车对象的方法

给定一个车位编号，查询这个车位编号是否停车的方法

打印每个车位的停车信息的方法
```
车位1： 牌照12345
车位2： 空
车位3： 空
```


2. 创建汽车类，继承Thread

具有属性车牌号

run方法中，调用停车场对象的入库方法，进行入库，
如果停车场没有车位，则等待直到停车场有空闲车位。汽车类入库后，睡眠小于10s的随机时间，然后出库。
出库后，run方法结束。


3. 创建一个汽车生成的线程，每隔5s生成一个汽车类对象的线程并且启动。所有的汽车对象共享一个停车场对象
当车位满了之后，停止生成汽车，直到有汽车出库，再继续生成汽车线程

4. 创建一个线程，每隔10s，打印一下停车场的车位信息

5. 扩展功能，扩展停车场的类，让停车场可以记录每个车位的车已经停了多久，打印信息如下
```
车位1: 牌照1234  停车时长 5秒
车位2: 空
车位3：空
```
