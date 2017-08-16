# build-test
Jenkins自动化构建 整合测试 --- 简单demo  备注：这个项目只是简单的springBoot项目构建

具体流程：
1. 当git提交最新代码到master分支，触动触发器
2. Jenkins拉起最新代码 mvn打包
3. 通过脚本文件打成镜像到部署到docker容器
4. 发布访问


测试：

