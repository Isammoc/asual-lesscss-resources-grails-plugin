# Asual less CSS Resource plugin

## Installation

**TODO**

## Usage

An Example of using both .less and .css files together in a bundle

    'style' {
        resource url:'less/test.less',attrs:[rel: "stylesheet/less", type:'css'], bundle:'bundle_style'
        resource url:'css/normal.css'
        resource url:'css/normal2.css'
    }

### Import

LESS supports importing of other less/css files. This is supported in asual-lesscss-resources.

   @import "imported_style.less";

### Options

**TODO**

## License

See [LICENSE](LICENSE)

## Other

This plugin is based upon work done in [less-resources plugin](http://grails.org/plugin/less-resources)
And the compiler is [lesscss-engine from Asual](https://github.com/asual/lesscss-engine)