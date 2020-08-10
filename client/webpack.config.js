const VueLoaderPlugin = require('vue-loader/lib/plugin')

module.exports = {
	module: {
    rules: [
    {
      test: /\.vue$/,
      loader: 'vue-loader',
      options: {
        hotReload: true
      }
    },
    {
      test: /\.js$/,
      loader: 'babel-loader',
      options: {
        hotReload: true
      }
    },
    {
      test: /\.css$/,
      use: [
        'vue-style-loader',
        'css-loader'
      ],
      options: {
        hotReload: true
      }
    }
  ]},
  plugins: [
    new VueLoaderPlugin()
  ]
};
