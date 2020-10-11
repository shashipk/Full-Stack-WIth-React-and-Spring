const path = require("path")
const HtmlWebpackPlugin = require("html-webpack-plugin")
const autoPrefixer = require("autoprefixer")

module.exports = {
    entry: path.join(__dirname, "/src/index.js"),
    output: {
        path: path.join(__dirname, "/dist"),
        filename: "index_bundle.js"
    },
    module: {
        rules: [
            {
                test: /\.js$/,
                exclude: /node_modules/,
                use: ["babel-loader"]
            },
            {
                test: /\.css$/,
                exclude: /node_modules/,
                use: ["style-loader", "css-loader", {
                    loader: "postcss-loader"
                    // options: {
                    //     plugins: () => [autoPrefixer()]
                    // }
                }]
            }
        ]
    },
    plugins: [
        new HtmlWebpackPlugin({
            template: path.join(__dirname, "/src/index.html")
        })
    ]
}