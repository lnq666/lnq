<template>
  <div>
    <h1 align="center">欢迎登录</h1>

    <div class="login">
      <el-form :model="ruleForm" status-icon :rules="rules" ref="ruleForm" label-width="100px" size="small"
               class="demo-ruleForm">
        <el-form-item label="用户名" prop="userName">
          <el-input v-model="ruleForm.userName"></el-input>
        </el-form-item>
        <el-form-item label="密码" prop="password">
          <el-input type="password" v-model="ruleForm.password" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" class="btn1" @click="submitForm('ruleForm')">立即登录</el-button>
          <el-button @click="doRegister" class="btn2">注册账号</el-button>
        </el-form-item>
      </el-form>
    </div>

  </div>
</template>

<script>
  export default {
    name: "Login",
    data() {
      var validateUserName = (rule, value, callback) => {
        if (value === '') {
          return callback(new Error('用户名不能为空'));
        } else {
          callback();
        }

      };
      var validatePassword = (rule, value, callback) => {
        if (value === '') {
          callback(new Error('请输入密码'));
        } else {
          callback();
        }
      };
      return {
        ruleForm: {
          userName: '',
          password: ''
        },
        rules: {
          userName: [
            {validator: validateUserName, trigger: 'blur'}
          ],
          password: [
            {validator: validatePassword, trigger: 'blur'}
          ]
        }
      };
    },
    methods: {
      submitForm(formName) {
        this.$refs[formName].validate((valid) => {
          if (valid) {
            this.$message({
              message: "登录成功",
              type: "success"
            });
            this.$router.push({name: "home", params: {userName: this.ruleForm.userName}});
          } else {
            console.log('error login!!!');
            return false;
          }
        });
      },
      doRegister() {
        this.$router.push({name: "register"});
      }
    }
  }
</script>

<style scoped>
  .login {
    width: 60%;
    height: 50%;
    position: absolute;
    margin-top: 50px;
    margin-left: 210px;
  }

  .btn1 {
    position: relative;
    left: 200px;
  }

  .btn2 {
    position: relative;
    left: 250px;
  }
</style>
