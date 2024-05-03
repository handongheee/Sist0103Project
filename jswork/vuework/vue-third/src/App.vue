<template>
  <div>
    <div class="menu">
      <!-- <a v-for="header in 3" :key="header">Home</a> -->
      <a v-for="menu in menus" :key="menu">{{ menu }}</a>
    </div>

    <div class="ani" v-for="(agency, key) in agencys" :key="key">
      <img :src="agency.imgSrc">
      <h3>{{ agency.name }}</h3>
      <p>{{ agency.movie }}</p>
      <button @click="onClickLikes(key)">좋아요</button>
      <span>좋아요:{{ agency.likes }}</span>
    </div>

    <!--
    <div class="ani">
      <h3>{{ celeb[1] }}</h3>
      <p>영화: 하울의 움직이는 성</p>
      <button @click="likes++">좋아요</button>
      <span>좋아요:{{ likes }}</span>
    </div>

    <div class="ani">
      <h3>{{ celeb[2] }}</h3>
      <p>영화: 센과 치히로의 행방불명</p>
    </div>

    <div class="ani">
      <h3>{{ celeb[3] }}</h3>
      <p>영화: 이웃집 토토로</p>
    </div>
    -->

  </div>
</template>

<script>
export default {
  data() {


    return {
      menus: ['Home', 'Animation', 'About'],
      agencys: [
        { name: '사슴', movie: '원령공주', likes: 0, imgSrc: require('./assets/images/12.png') },
        { name: '하울', movie: '하울의 움직이는 성', likes: 0, imgSrc: require('./assets/images/13.png') },
        { name: '하쿠', movie: '센과 치히로의 행방불명', likes: 0, imgSrc: require('./assets/images/14.png') },
        { name: '가오나시', movie: '센과 치히로의 행방불명', likes: 0, imgSrc: require('./assets/images/15.png') },
        { name: '토토로', movie: '이웃집 토토로', likes: 0, imgSrc: require('./assets/images/16.png') }
      ]

      // ani: ['사슴', '하울', '하쿠', '가오나시', '토토로'],
      // likes:0

    }
  },
  methods:{
    onClickLikes(num){
     this.agencys[num].likes++;
    }
  }

}
</script>

<style lang="css" scoped>
.menu {
  background-color: lightgreen;
  padding: 10px;
  border-radius: 5px;
}

.menu>a {
  color: black;
  padding: 10px;
}

.ani>img {
  width: 200px;
  border-radius: 30px;
}
</style>