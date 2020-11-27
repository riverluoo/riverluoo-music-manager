### 分支管理规范

master 分支代码部署在 DEV、QA 环境；DEV 环境用于开发调试，QA 环境用于 QA 功能验收。

release 分支部署在 UAT、PROD 环境。UAT 环境用于上线前测试，PROD 环境为正式生产环境。

master 分支为主干分支，长期存在。release 分支为最近线上代码分支。feature 分支可选，在合并至 master 分支后删除。


**一般开发流程**

直接在 master 分支上开发新功能
```sh
➜ (master) git add .
➜ (master) git commit -m 'FEAT: [SET2H-123] add factory management api'
```

也可基于 feature 分支开发新功能，然后通过 rebase 合并到 master 分支
```sh
➜ (master) git checkout -b feature-name
➜ (feature-name) git add .
➜ (feature-name) git commit -m 'FEAT: [SET2H-123] add factory management api'
➜ (feature-name) git rebase master
# 此时可能会冲突，需手动解决冲后执行 git add . && git rebase --continue 完成 rebase
➜ (feature-name) git checkout master
➜ (master) git merge feature-name
```

同步远程仓库代码
```sh
➜ (master) git pull -r # 通过 rebase 的方式更新远程仓库代码
➜ (master) git push
```

**发布修复流程**

发布流程
```sh
➜ (master) git checkout release
➜ (release) git pull -r
➜ (release) git merge master
➜ (release) git push
```

修复流程
```sh
➜ (master) git checkout release
➜ (release) git pull -r
➜ (release) git cherry-pick -x commit-id
➜ (release) git push
```
**注意事项** 
1. 在 pull 代码和从 feature 分支合并代码时，必需通过 rebase 的方式。这样可以保证 master 分支提交干净，防止出现类似 `Merge branch 'feature-name' into master` 的提交信息。
2. 在 master 分支上修复线上问题，然后 `cherry-pick` 到 release 分支上。禁止从 release 分支直接合并代码到 master 分支，特殊情况可在两边同时手动提交。

### Git 提交规范

```

提交信息格式：
> TYPE: <TASK_ID> MESSAGE

**TYPE** 只能为下面四种类型：
- FEAT：功能变动，包括新增修改功能的代码及测试。
- HOTFIX：修复已上线功能的问题。
- DOCS：新增或修改 README、第三方接口对接文档等。仅存放文本格式文档，其它格式文档请放在 Google Docs 上。
- TECH：重构代码、调整脚本、变动代码风格等不影响功能的改动。

**TASK_ID** 非必填，建议有对应 JIRA 卡号时，都加上。方便后续跟踪任务详情

**MESSAGE**：消息简明扼要，表达概括的意思，不需要描述过于细节

提交消息示例：
```
FEAT: [SET2H-123] add factory management api
HOTFIX: [SET2H-123] fix delivery order status update error
DOCS: add get gsap order api doc
TECH: refactor order service
FEAT: [SET2H-123] revert add factory management api
```
