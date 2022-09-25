<template>
    <div>
        <h1 align="center">欢迎注册</h1>
        <div class="regs">
            <el-form :model="ruleForm" status-icon :rules="rules" ref="ruleForm" label-width="100px" size="small" class="demo-ruleForm">
              <el-form-item label="用户名" prop="userName">
                <el-input v-model="ruleForm.userName"></el-input>
              </el-form-item>
              <el-form-item label="密码" prop="pass">
              <el-input type="password" v-model="ruleForm.pass" autocomplete="off"></el-input>
              </el-form-item>
              <el-form-item label="确认密码" prop="checkPass">
                <el-input type="password" v-model="ruleForm.checkPass" autocomplete="off"></el-input>
              </el-form-item>
              <el-form-item>
                <el-button type="primary" class="btn1" @click="submitForm('ruleForm')">立即注册</el-button>
                <el-button @click="resetForm('ruleForm')" class="btn2">重置密码</el-button>
              </el-form-item>
            </el-form>
        </div>
    </div>
</template>

<script>
    export default {
        name: "Register",
        data() {
          var validateUserName = (rule, value, callback) => {
            if (value === '') {
              return callback(new Error('用户名不能为空'));
            }else{
                callback();
            }

          };
          var validatePass = (rule, value, callback) => {
            if (value === '') {
              callback(new Error('请输入密码'));
            } else {
              if (this.ruleForm.checkPass !== '') {
                this.$refs.ruleForm.validateField('checkPass');
              }
              callback();
            }
          };
          var validatePass2 = (rule, value, callback) => {
            if (value === '') {
              callback(new Error('请再次输入密码'));
            } else if (value !== this.ruleForm.pass) {
              callback(new Error('两次输入密码不一致!'));
            } else {
              callback();
            }
          };
          return {
            ruleForm: {
              userName: '',
              pass: '',
              checkPass: ''
            },
            rules: {
              userName:[
                { validator: validateUserName, trigger: 'blur' }
              ],
              pass: [
                { validator: validatePass, trigger: 'blur' }
              ],
              checkPass: [
                { validator: validatePass2, trigger: 'blur' }
              ]
            }
          };
        },
        methods: {
          submitForm(formName) {
            this.$refs[formName].validate((valid) => {
              if (valid) {
                this.$message({
                  message:"注册成功",
                  type:"success"
                });
               this.$router.push({name:"login",params:{userName:this.ruleForm.userName}});
              } else {
                console.log('error register!!');
                return false;
              }
            });
          },
          resetForm(formName) {
            this.$refs[formName].resetFields();
          }
        }
    }
</script>

<style scoped>
.regs{
  width: 60%;
  height: 50%;
  position: absolute;
  margin-top: 50px;
  margin-left: 210px;
}
.btn1{
  position: relative;
  left: 200px;
}.btn2{
  position: relative;
  left: 250px;
}
</style>
