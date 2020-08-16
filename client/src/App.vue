<template>
  <div id="app" >
		<b-navbar toggleable="lg" type="dark" variant="info" style="height:90px">
		</b-navbar>
		<Slide>
      <a id="app" href="#/">
        <span>Home</span>
      </a>
      <a id="menu" href="#/menu">
        <span>Menu</span>
      </a>
      <a id="account" href="#/account">
        <span>Cuenta</span>
        <b-avatar variant="dark" style="background-color: #3f3f41"></b-avatar>
      </a>
    </Slide>
		<Home></Home>
	</div>

</template>

<script>
import Home from './components/Home.vue'
import { Slide } from 'vue-burger-menu'

export default {
  name: 'App',
  components: {
    Home,
    Slide
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

.container {
  display: inline-block;
  cursor: pointer;
}

.bar1, .bar2, .bar3 {
  width: 35px;
  height: 5px;
  background-color: #333;
  margin: 6px 0;
  transition: 0.4s;
}

.change .bar1 {
  -webkit-transform: rotate(-45deg) translate(-9px, 6px);
  transform: rotate(-45deg) translate(-9px, 6px);
}

.change .bar2 {opacity: 0;}

.change .bar3 {
  -webkit-transform: rotate(45deg) translate(-8px, -8px);
  transform: rotate(45deg) translate(-8px, -8px);
}
</style>
