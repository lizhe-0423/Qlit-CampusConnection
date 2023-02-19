# 工程简介
基于高校搭建平台📕

该项目前期由我个人完成 后期可能会寻找合作伙伴📣


# 下面我将介绍我每天完成情况

## 2/17 确定了我的技术选型 引入了Nacos 、MP 、Swagger 、SpringSecurity
1. 数据库表设计 使用sql-father简化设计 设计了user表
2. 引入Nacos Nacos需要官网下载 将他放入我们的项目目录下 使用命令启动nacos
3. 引入MP 使用了MP的代码生成功能 自动引申出了 Swagger 
4. 项目最开始spring创建集成导入security 测试 登录可使用 security登录
5. swagger 被 security 拦截 配置security 放行swagger
6. 引入了security的密码加密，校验失败的 通过配置异常处理器 返回错误信息
7. 引入了全局异常处理@ControllerAdvice

## 2/18 今日完成
1. 使用MP user 表 增删改查
2. 前端编写了简单简单的登录/注册页面 （目前没有采用前后端分离）写了一个简单的主页
3. 完成登录、注册功能 注意 thymeleaf生成的页面 发送的请求不是json 而有可能是form-data 接收的时使用@RequestParam而不是@RequestBody
4. SpringSecurity的加密 明文 - 暗文 比较数据库中暗文 一致则放权 数据库中存储的永远是暗文
5. [bug] swagger 还是无法访问到页面 怀疑spring security原因！！！
6. 引入MP 乐观锁 
7. 使用UUID 定义唯一id 

## 2/19 今日完成
1. 引入hutool工具类 uuid使用它来替换
2. hutool编写jwt jwt 通过消息头/消息体方式返回前端
3. jwt的校验 则通过spring security 集合jwt进行校验
4. 引入Redisson 初使用 将课表（entity）->json 存入
5. 课程表这里其实很细 比如每门课具有有效期（起始结束时间）？ 挂科重修（版本号） ？ 需不需要用户标识 ？
6. 突然想到MP的单表操作就在自动生成的controller层就好 因为后续引入gateway 这种前后交互 都会由Gateway进行




# 延伸阅读

