<template>
	<b-carousel id="carousel-1" v-model="slide" :interval="2000"
    controls indicators background="#ababab" img-width="1024"
    img-height="480" style="text-shadow: 1px 1px 2px #333;" >
    <b-carousel-slide caption="First slide" width="1024" height="480"
      text="Nulla vitae elit libero, a pharetra augue mollis interdum."
      img-src="https://picsum.photos/1024/480/?image=52"></b-carousel-slide>
    <b-carousel-slide width="1024" height="480"
      img-src="https://picsum.photos/1024/480/?image=54">
      <h1>Hello world!</h1>
    </b-carousel-slide>
    <b-carousel-slide width="1024" height="480"
      img-src="https://picsum.photos/1024/480/?image=58"></b-carousel-slide>

    <b-carousel-slide>
      <template v-slot:img>
        <img class="d-block img-fluid w-100" width="1024"
            height="480" src="https://picsum.photos/1024/480/?image=55"
            alt="image slot">
      </template>
    </b-carousel-slide>
  </b-carousel>
</template>

<script>
export default {
  name: 'Home'
}
</script>