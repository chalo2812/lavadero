<template>
  <div id="app">
    <b-navbar toggleable="lg">
      <b-button v-b-toggle.my-sidebar variant="primary">
				<b-icon class="fa fa-bars" aria-hidden="true"></b-icon>
      </b-button>
    </b-navbar>
    <b-sidebar id="my-sidebar" style="no-border">
			<router-link to="/hello">Go to Hello World</router-link><br>
      <router-link to="/">Go to Bar</router-link>
    </b-sidebar>
  </div>
</template>

<script>

export default {
  name: 'Menu',
  components: {}
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
</style>
