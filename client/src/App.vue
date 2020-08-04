<template>
  <div id="app">
    <b-navbar toggleable="lg">
      <b-button v-b-toggle.my-sidebar variant="primary">
				Menu
      </b-button>
    </b-navbar>
    <b-sidebar id="my-sidebar" title="Sidebar" >
      <div class="px-3 py-2">
        in, egestas eget quam. Morbi leo risus, porta ac consectetur ac, vestibulum at eros.
      </div>
    </b-sidebar>
  </div>
</template>

<script>

export default {
  name: 'App',
  components: {

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
@import'~bootstrap/dist/css/bootstrap.css'
</style>
