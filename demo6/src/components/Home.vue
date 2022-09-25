<template>
    <div id="aaa">
      <el-descriptions title="个人信息列表" :column="3" border>
        <el-descriptions-item label="用户名" label-class-name="my-label" content-class-name="my-content">{{this.$route.params.userName}}</el-descriptions-item>
        <el-descriptions-item label="手机号">12345678910</el-descriptions-item>
        <el-descriptions-item label="居住地">南昌市</el-descriptions-item>
        <el-descriptions-item label="备注">
          <el-tag size="small">学生</el-tag>
        </el-descriptions-item>
        <el-descriptions-item label="联系地址" :contentStyle="{'text-align': 'center'}">江西省南昌市东湖区</el-descriptions-item>
      </el-descriptions>
    </div>

</template>

<script>
    export default {

    }
</script>

<style scoped>

  .my-label {
    background: #E1F3D8;
  }

  .my-content {
    background: #FDE2E2;
  }
</style>
