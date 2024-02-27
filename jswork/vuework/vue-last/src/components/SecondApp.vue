<template>
    <div>
        <h1 class="alert alert-info">SecondApp 입니다</h1>
        <h3>{{ cnt }}</h3>
        <button v-on:click="cntIncre">증가</button>

        <h3>{{ msg }}</h3>
        <button @click="msgIncre">증가</button>

    </div>
</template>

<script>
import { ref } from 'vue';

export default {
    setup() {
        const cnt = ref(0);
        const cntIncre = () => {
            cnt.value++;
        }

        const msg = ref("안녕 뷰 재밌냐");
        const msgIncre = () => {
            msg.value = msg.value + "?";
        }

        return {
            cnt,
            cntIncre,
            msg,
            msgIncre
        }
    }
}
</script>

<style lang="scss" scoped></style>