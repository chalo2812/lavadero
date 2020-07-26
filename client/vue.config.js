const webpack = require('webpack');

module.exports = {
  devServer: {
    public: 'http://127.0.0.1:1337'
  },
  publicPath: './',
  productionSourceMap: false
};
