<template>
    <div>
        <h1 class="alert alert-info">FourthApp 입니다</h1>
        <div v-for="fruit in fruitArr" :key="fruit">
            <li>{{ fruit }}</li>
        </div>
        <br>
        <div v-for="info in infoArr" :key="info">
            <li>{{ info.id + " / " + info.user }}</li>
        </div>
    </div>
</template>

<script>
export default {
    setup() {

        const fruitArr = ['apple', 'banana', 'orange'];
        const infoArr = [
            { id: 0, user: '영수' },
            { id: 1, user: '영식' },
            { id: 2, user: '영철' },
            { id: 3, user: '영희' },
        ]

        return {
            fruitArr,
            infoArr
        }
    }
}
</script>

<style lang="scss" scoped></style>