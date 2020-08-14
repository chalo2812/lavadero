const webpack = require('webpack');

module.exports = {
  devServer: {
    compress: true,
    disableHostCheck: true
  },
  publicPath: './',
  productionSourceMap: false
};
