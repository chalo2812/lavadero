<template>
  <div id="app">
		<b-navbar toggleable="lg" type="dark" variant="info">
			<b-navbar-brand href="#">
				<b-avatar variant="secondary"></b-avatar>
			</b-navbar-brand>

			<b-collapse id="nav-collapse" is-nav>
				<b-navbar-nav class="ml-auto">
					<b-img thumbnail fluid src="https://picsum.photos/64/64/?image=1"></b-img>
				</b-navbar-nav>
				<b-navbar-nav class="ml-auto">
					<b-nav-item-dropdown right>
						<b-dropdown-item href="/login">
							<b-avatar variant="secondary"></b-avatar>
						</b-dropdown-item>
						<b-dropdown-item href="#">Sign Out</b-dropdown-item>
					</b-nav-item-dropdown>
				</b-navbar-nav>
			</b-collapse>
		</b-navbar>
	</div>
</template>

<script>
export default {
  name: 'App',
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
