<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<!-- saved from url=(0031)http://hongyuan.theme.yurl.vip/ -->
<html class="settings-main_background"><!--<![endif]-->
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <link rel="dns-prefetch" href="http://asset.ibanquan.com/">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="renderer" content="webkit">
    <title>BigLibrary</title>

    <meta name="keywords" content="content=" width=device-width, initial-scale=1.0">
    <meta name="description" content="content=" width=device-width, initial-scale=1.0">
    <meta name="viewport"
          content="initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no, width=device-width">
    <link rel="shortcut icon" href="http://asset.ibanquan.com/image/57acb51702282e3f00000003/s.ico?v=0"
          type="image/x-icon">
    <link href="${pageContext.request.contextPath}/css/base-160225.min.css" media="screen" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/css/yhsd-iconfont-151010.css" media="screen" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/css/yhsd-desktop-170719.min.css" media="screen" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/css/youpage.min.css" media="screen" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/css/iconfont.css" media="screen" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/css/main.css" media="screen" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/css/user.css" media="screen" rel="stylesheet" type="text/css">
    <script src="${pageContext.request.contextPath}/js/tracker-0.0.2.min.js.下载"></script>
    <script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js.下载" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/js/jssdk-0.0.18.min.js.下载" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/js/lazyload.min.js.下载" type="text/javascript"></script>


    <!-- 引入Bootstrap,js、css文件 -->
    <link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet">
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

    <!-- 社交分享信息 -->
    <meta property="og:title" content="content=" width=device-width, initial-scale=1.0">
    <meta property="og:description" content="content=" width=device-width, initial-scale=1.0">
    <meta property="og:image" content="//asset.ibanquan.com/image/57acb53a02282e3f00000007/s.png?v=0">

    <!-- End 社交分享信息 -->
    <style>
        .pre-qrcode-wrap {
            cursor: pointer;
            width: 130px;
            height: 46px;
            line-height: 46px;
            position: fixed;
            left: 0;
            right: 0;
            margin: auto;
            bottom: 50px;
            border-radius: 4px;
            background: #262626;
            font-size: 14px;
            color: #fff;
            box-sizing: border-box;
            background-image: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABIAAAAgCAYAAAAffCjxAAAAnElEQVRIie2WMQrCQBQFJ0HwAhYSG/Vw4n0svYaFwcaT2FhoY2MhBoJjEySIWWVTulO9hcfwuv2oE7VUK+O4qgvUbaSgzTFT78CQftSZavPIIiUC5D2XvEiiJEqiJEqiPxQNWtnO1g98W1QCU2AO7ELF9gf5iQI4NXkGHEKLqoDo0ZHfqXNgHyisgTEwAlaB3hm1UDfqLfISuajLJ7Lz7N/vt9gjAAAAAElFTkSuQmCC);
            background-repeat: no-repeat;
            background-position: 15px 7px;
            padding-left: 44px;
        }

        .pre-qrcode {
            position: absolute;
            top: 0;
            width: 129px;
            height: 129px;
            line-height: 130px;
            background: #fff;
            text-align: center;
            box-sizing: border-box;
            padding-top: 11px;
            border: 1px solid #d8d8d8;
            border-radius: 4px;
            margin-left: -44px;
            transition: all 0.6s;
            transform: translatey(-100px);
            opacity: 0;
            pointer-events: none;
        }

        .pre-qrcode:before {
            content: '';
            display: block;
            position: absolute;
            border-top: 10px solid #fff;
            border-right: 7px solid transparent;
            border-left: 7px solid transparent;
            bottom: -10px;
            left: 57px;
            z-index: 2;
        }

        .pre-qrcode:after {
            content: '';
            display: block;
            position: absolute;
            border-top: 11px solid #d8d8d8;
            border-right: 8px solid transparent;
            border-left: 8px solid transparent;
            bottom: -11px;
            left: 56px;
            z-index: 1;
        }

        .pre-qrcode-wrap:hover .pre-qrcode, .pre-qrcode.hover {
            opacity: 1;
            transform: translatey(-150px);
        }

        @media screen and (max-width: 768px) {
            .pre-qrcode-wrap {
                display: none;
            }
        }

    </style>
    <script src="${pageContext.request.contextPath}/js/jquery.qrcode.min.js.下载"></script>

    <script>
        window.productImage = '53f649ffe2931e0b91000007/noimage.png';
        window.vendorImage = '578fc93402282e4f18000003/noimage.png';
        window.iconImage = '57acb51702282e3f00000003/noimage.ico';
        window.shareImage = '57acb53a02282e3f00000007/noimage.png';
        window.assetPath = '//asset.ibanquan.com/image/';
        window.postImage = '581a3b0402282e2bcc000003/s.png';
        window.captchaPath = '//captcha.ibanquan.com';
        window.ajaxToken = '9dd5934c294149a8aaba5a3540d7f709';
    </script>
    <script>(function () {
        var yt = document.createElement('script');
        yt.src = '//asset.ibanquan.com/common/js/tracker-0.0.2.min.js?v=157';
        var s = document.getElementsByTagName('script')[0];
        s.parentNode.insertBefore(yt, s);
    })();</script>
    <style type="text/css">[responsive-image] > img, [data-responsive-image] {
        overflow: hidden;
        padding: 0;
    }

    [responsive-image] > img, [data-responsive-image] > img {
        width: 100%;
    }</style>
    <style>.lazyload_scope img {
        transition: opacity 0.618s ease;
        -moz-transform-style: preserve-3d;
        -webkit-transform-style: preserve-3d;
        transform-style: preserve-3d;
    }

    .lazyload_scope img.lazyload, .lazyload_scope img.loading {
        min-width: 20px;
        min-height: 20px;
        opacity: 0.5;
        background-repeat: no-repeat;
        background-position: center center;
        background-image: none;
        background-image: url("data:image/gif;base64,R0lGODlhEAALAPQAAP///5mZmfDw8Ozs7Pf395ycnJmZmaysrM3NzcDAwOTk5Kenp7e3t9DQ0MHBweXl5ampqZubm7i4uPX19e/v7/v7+7CwsPHx8fr6+uLi4tnZ2erq6vj4+JmZmZmZmZmZmSH5BAkLAAAAIf4aQ3JlYXRlZCB3aXRoIGFqYXhsb2FkLmluZm8AIf8LTkVUU0NBUEUyLjADAQAAACwAAAAAEAALAAAFLSAgjmRpnqSgCuLKAq5AEIM4zDVw03ve27ifDgfkEYe04kDIDC5zrtYKRa2WQgAh+QQJCwAAACwAAAAAEAALAAAFJGBhGAVgnqhpHIeRvsDawqns0qeN5+y967tYLyicBYE7EYkYAgAh+QQJCwAAACwAAAAAEAALAAAFNiAgjothLOOIJAkiGgxjpGKiKMkbz7SN6zIawJcDwIK9W/HISxGBzdHTuBNOmcJVCyoUlk7CEAAh+QQJCwAAACwAAAAAEAALAAAFNSAgjqQIRRFUAo3jNGIkSdHqPI8Tz3V55zuaDacDyIQ+YrBH+hWPzJFzOQQaeavWi7oqnVIhACH5BAkLAAAALAAAAAAQAAsAAAUyICCOZGme1rJY5kRRk7hI0mJSVUXJtF3iOl7tltsBZsNfUegjAY3I5sgFY55KqdX1GgIAIfkECQsAAAAsAAAAABAACwAABTcgII5kaZ4kcV2EqLJipmnZhWGXaOOitm2aXQ4g7P2Ct2ER4AMul00kj5g0Al8tADY2y6C+4FIIACH5BAkLAAAALAAAAAAQAAsAAAUvICCOZGme5ERRk6iy7qpyHCVStA3gNa/7txxwlwv2isSacYUc+l4tADQGQ1mvpBAAIfkECQsAAAAsAAAAABAACwAABS8gII5kaZ7kRFGTqLLuqnIcJVK0DeA1r/u3HHCXC/aKxJpxhRz6Xi0ANAZDWa+kEAA7"), none;
    }</style>
    <style>#img_zoom-box, .img_zoom--inner {
        text-align: center;
        white-space: nowrap
    }

    #img_zoom {
        display: none;
        position: fixed;
        top: 0;
        left: 0;
        width: 100%;
        height: 100%;
        box-sizing: border-box;
        background-color: #7d7d7d;
        background-color: rgba(0, 0, 0, .618);
        cursor: zoom-out;
        z-index: 1000
    }

    #img_zoom.active {
        display: block;
        -moz-animation: .5s opacity_in_out forwards;
        -webkit-animation: .5s opacity_in_out forwards;
        -ms-animation: .5s opacity_in_out forwards;
        animation: .5s opacity_in_out forwards
    }

    #img_zoom-box-img, #img_zoom-box.loading #img_zoom-box-loading {
        -moz-animation: .8s opacity_in_out forwards;
        -webkit-animation: .8s opacity_in_out forwards;
        -ms-animation: .8s opacity_in_out forwards
    }

    #img_zoom-box {
        display: inline;
        vertical-align: baseline
    }

    #img_zoom-box.loading #img_zoom-box-loading {
        display: inline-block;
        animation: .8s opacity_in_out forwards
    }

    #img_zoom-box-loading, #img_zoom-box.loading #img_zoom-box-img, #img_zoom-box.loading #img_zoom-box-src {
        opacity: 0;
        display: none
    }

    #img_zoom-box-loading {
        padding: 12px 10px;
        border-radius: 5px;
        background-color: #232323;
        background-color: rgba(0, 0, 0, .618);
        vertical-align: middle
    }

    #img_zoom-box-img {
        display: inline-block;
        max-width: 100%;
        max-height: 100%;
        animation: .8s opacity_in_out forwards;
        border-radius: 4px;
        vertical-align: middle
    }

    #img_zoom-box-src {
        display: block;
        -moz-animation: .8s opacity_in_out forwards;
        -webkit-animation: .8s opacity_in_out forwards;
        -ms-animation: .8s opacity_in_out forwards;
        animation: .8s opacity_in_out forwards;
        position: absolute;
        right: 20px;
        top: 20px;
        outline: 0;
        -webkit-tap-highlight-color: transparent;
        background-color: #ddd;
        background-color: rgba(0, 0, 0, .22);
        border-radius: 4px;
        padding: 9px 11px 6px 9px;
        line-height: 1em;
        font-size: 13px;
        color: #7d7d7d;
        text-decoration: none
    }

    #img_zoom-box-src img {
        width: 24px;
        height: 24px;
        border: 0
    }

    .img_zoom--inner {
        display: inline-block;
        position: relative;
        padding: 30px 20px;
        width: 100%;
        height: 100%;
        box-sizing: border-box
    }

    .img_zoom--inner:before {
        content: "";
        display: inline-block;
        height: 50%;
        width: 1px;
        margin-right: -1px
    }

    .img_zoom_scope img {
        cursor: zoom-in
    }

    .img_zoom_scope a img {
        cursor: auto
    }

    .ie9 #img_zoom-box-img, .ie9 #img_zoom-box-src, .ie9 #img_zoom-box.loading .ie9 #img_zoom-box-loading, .ie9 #img_zoom.active {
        opacity: 1
    }

    @-moz-keyframes opacity_in_out {
        from {
            opacity: 0
        }
        to {
            opacity: 1
        }
    }

    @-webkit-keyframes opacity_in_out {
        from {
            opacity: 0
        }
        to {
            opacity: 1
        }
    }

    @-o-keyframes opacity_in_out {
        from {
            opacity: 0
        }
        to {
            opacity: 1
        }
    }

    @keyframes opacity_in_out {
        from {
            opacity: 0
        }
        to {
            opacity: 1
        }
    }</style>
    <!-- 图片轮播 -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/pageSwitch.min.css">
    <style type="text/css">


        #picture {
            width: 73%;
            height: 530px;
            overflow: hidden;
            float: left;
        }

        .sections, .section {
            height: 100%;
        }

        #picture, .sections {
            position: relative;
        }

        .section {
            background-color: #000;
            background-size: cover;
            background-position: 50% 50%;
            text-align: center;
            color: white;
        }

        #section0 {
            background-image: url('${pageContext.request.contextPath}/img/index_slide_1.png');
        }

        #section1 {
            background-image: url('${pageContext.request.contextPath}/img/index_slide_2.png');
        }

        #section2 {
            background-image: url('${pageContext.request.contextPath}/img/index_slide_3.png');
        }

        #section3 {
            background-image: url('${pageContext.request.contextPath}/img/index_slide_4.png');
        }
    </style>
</head>
<body class=" ">
<!-- 社交分享图 (300x300) -->
<img class="you_share_img" src="${pageContext.request.contextPath}/img/s.png" alt="BigLibrary">
<!-- End 社交分享图 -->
<div class="page settings-body_background yhsd_free_scope">
    <div class="wrapper wrapper-header settings-top_background">
        <div class="cont-nav settings-top_background clearfix">
            <div class="mod logo settings-text_color">
                <strong>
                    <a class="logo-link settings-h1_color"
                       href="${pageContext.request.contextPath}/index.action">

                        <img src="${pageContext.request.contextPath}/img/mainlogo.png" alt="BigLibrary">
                    </a>
                </strong>
            </div>
            <div class="nav-inner">
                <!-- 一级菜单 -->
                <ul id="top-nav-link" class="nav-link">
                    <li>
                        <a class="txt-overflow settings-navLink_color settings-nav_border settings-navLinkHover_border"
                           id="navlink_905781"
                           href="${pageContext.request.contextPath }/index.action">首页</a>

                        <!-- 二级菜单 -->

                    </li>
                    <li>
                        <a class="txt-overflow settings-navLink_color settings-nav_border settings-navLinkHover_border"
                           id="navlink_905782" href="听书.html">听书</a>

                        <!-- 二级菜单 -->

                    </li>
                    <li>
                        <a class="txt-overflow settings-navLink_color settings-nav_border settings-navLinkHover_border"
                           id="navlink_905783" href="电子书与商城.html">商城</a>

                        <!-- 二级菜单 -->

                    </li>
                    <li class="">
                        <a class="txt-overflow settings-navLink_color settings-nav_border settings-navLinkHover_border"
                           id="navlink_905784" href="电子书与商城.html">电子书</a>

                        <!-- 二级菜单 -->

                    </li>
                    <li>
                        <a class="txt-overflow settings-navLink_color settings-nav_border settings-navLinkHover_border"
                           id="navlink_905785" href="专栏订阅.html">订阅专刊</a>

                        <!-- 二级菜单 -->

                    </li>
                    <li>
                        <a class="txt-overflow settings-navLink_color settings-nav_border settings-navLinkHover_border"
                           id="navlink_905786" href="#">个人中心</a>

                        <!-- 二级菜单 -->

                    </li>
                </ul>
                <a id="nav_mobile" class="nav-link-mobile icon-comiiscaidan iconfont settings-top_color"
                   href="javascript:void(0);">
                </a>
            </div>
            <div class="mod header">
                <a id="yhsd-header-search" href="javascript:void(0);" class="header-search-ico pc-show">
                    <span class="main-ico main-ico-search iconfont icon-sousuo settings-top_color"></span>
                </a>

                <div id="yhsd-header-search-ipt" class="header-search pc-show">
                    <input class="search-ipt settings-ipt_border" type="text" placeholder="搜索全站">
                </div>
                <!-- 点击登录 -->
                <a id="customer-item3" class="header-link settings-top_color icon-ziyuan iconfont"
                   href="${pageContext.request.contextPath}/user_loginPage.action"></a>

                <div id="yhsd_topCart_show" class="header-cart">
                    <span class="main-ico main-ico-cart icon-gouwuche iconfont"></span><span
                        class="topCart-quantity settings-top_color" id="yhsd_topCart_quantityTitle">0</span>
                </div>

                <!--            <a id="customer-item1" class="header-link settings-top_color pc-show" href="/account/login">登录</a>
                           <a id="customer-item2" class="header-link settings-top_color pc-show" href="/account/register" >注册</a> -->
                <!-- .顶部购物车 -->
                <div class="topCart settings-body_background settings-main_border" id="yhsd_topCart">
                    <ul id="yhsd_topCart_list"></ul>
                    <div class="topCart-summary">
                        <p class="topCart-total settings-text_color"><span
                                id="yhsd_topCart_quantity">0</span>件商品　总计:<span class="settings-price_color">￥<span
                                id="yhsd_topCart_totalPrice">0</span></span></p>
                        <a class="topCart-submit settings-buyBtn_color settings-buyBtn_background"
                           href="http://hongyuan.theme.yurl.vip/cart">去结算</a>
                    </div>
                </div>
            </div>

        </div>
    </div>


    <div class="wrapper wrapper-slide">
        <div class="cont clearfix">
            <!-- 自己加的图片轮播-->
            <div id="picture">
                <div class="sections">
                    <div class="section" id="section0"></div>
                    <div class="section" id="section1"></div>
                    <div class="section" id="section2"></div>
                    <div class="section" id="section3"></div>
                </div>
            </div>

            <!-- 右部分的两张图片-->
            <div class="mod slide_pics">
                <a href="javascript:void(0);">
                    <img src="${pageContext.request.contextPath }/img/wrapper_slide_1.png" alt=""/></a>
                <a href="javascript:void(0);">
                    <img src="${pageContext.request.contextPath }/img/wrapper_slide_2.png" alt=""/></a>
            </div>
        </div>
    </div>

	<!-- 热门音频 -->
    <div class="wrapper wrapper-proList index-proList">
        <div class="cont">
            <div class="mod proList">
                <h4 class="prolist_title">听书の心情</h4>

                <div class="proList-inner">

                    <ul class="proList-ul clearfix proList-count-4 lazyload_scope">

                        <!-- 热门音频 -->
                    	<s:iterator var="hotAudio" value="hotAudioList">
						<li>
                            <a class="proList-img settings-proPic_border txt-overflow"
                               href="" target="_blank">
                                <img width="200px" height="300px" class=" " src="${pageContext.request.contextPath}/<s:property value="#hotAudio.audioImage"/>"
                                     data-src="//asset.ibanquan.com/image/590af70e3f8f90450300011f/s_w330h330.png?v=1493890830"
                                     alt="<s:property value="#hotAudio.audioName"/>" data-yhsdimgload="true">
                            </a>
                            <a class="proList-name settings-proTitle_color txt-overflow"
                               href="" target="_blank"><s:property value="#hotAudio.audioName"/></a>

                            <div class="proList-desc">
                                <span class="proList-price settings-price_color"><s:property value="#hotAudio.audioDesc"/></span>
                            </div>
                        </li>
                        </s:iterator>

                    </ul>
                    <a class="mobi-show mobi-products-more" href="http://hongyuan.theme.yurl.vip/products">more</a>

                </div>
            </div>
        </div>
    </div>

    <!--热门图书-->
    <div class="container">
        <div class="row row-offcanvas row-offcanvas-right">

            <div class="col-xs-12 col-sm-12">
                <h4 class="prolist_title">电子书の免费</h4>
                <div class="row">
                    <div class="col-xs-6 col-lg-4">
                        <h2>Heading</h2>

                        <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo,
                            tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem
                            malesuada magna mollis euismod. Donec sed odio dui. </p>

                        <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
                    </div>
                    <!--/.col-xs-6.col-lg-4-->
                    <div class="col-xs-6 col-lg-4">
                        <h2>Heading</h2>

                        <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo,
                            tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem
                            malesuada magna mollis euismod. Donec sed odio dui. </p>

                        <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
                    </div>
                    <!--/.col-xs-6.col-lg-4-->
                    <div class="col-xs-6 col-lg-4">
                        <h2>Heading</h2>

                        <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo,
                            tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem
                            malesuada magna mollis euismod. Donec sed odio dui. </p>

                        <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
                    </div>

                    <!--/.col-xs-6.col-lg-4-->
                </div>
                <!--/row-->
            </div>
            <!--/.col-xs-12.col-sm-9-->
        </div>
    </div>
    <!--/row-->

    <br>  <br>

	<!-- 热门专栏 -->
    <div class="wrapper wrapper_third">
        <div class="cont">
            <div class="mod">
                <ul class="clearfix">
                    <h4 class="prolist_title">订阅专栏の成长感想</h4>
                    <li><a href="javascript:void(0);">
                        <div class="wrapper_third_img">
                            <img src="${pageContext.request.contextPath }/img/wrapper_third_1.png" alt="">
                        </div>
                        <div>
                            <p class="third_title">听一个有趣的人生观</p>

                            <p class="third_subtitle">站在巨人的肩膀上入门</p>
                        </div>
                    </a></li>
                    <li><a href="javascript:void(0);">
                        <div class="pc-show1">
                            <p class="third_title third_title_m">与专栏来场约会</p>

                            <p class="third_subtitle third_subtitle_m">夏日小清新的视听洗礼</p>
                        </div>
                        <div class="wrapper_third_img">
                            <img src="${pageContext.request.contextPath }/img/wrapper_third_2.png" alt="">
                        </div>
                        <div class="mobi-show">
                            <p class="third_title third_title_m">别以为买好书多难</p>

                            <p class="third_subtitle third_subtitle_m">这里全都是带来头脑风暴的好书</p>
                        </div>
                    </a></li>
                    <li><a href="javascript:void(0);">
                        <div class="wrapper_third_img">
                            <img src="${pageContext.request.contextPath }/img/wrapper_third_3.png" alt="">
                        </div>
                        <div>
                            <p class="third_title">人生怎么会没有点波澜</p>

                            <p class="third_subtitle">风平浪静与波澜四起的生活</p>
                        </div>
                    </a></li>
                </ul>
            </div>
        </div>
    </div>

    <!--暂加的电子书与商城模块-->
    <div class="wrapper wrapper-proList index-proList">
        <div class="cont">
            <div class="mod proList">
                <h4 class="prolist_title">商城の遇见惊喜</h4>

                <div class="proList-inner">

                    <ul class="proList-ul clearfix proList-count-4 lazyload_scope">

                        <li>
                            <a class="proList-img settings-proPic_border txt-overflow"
                               href="爱读书的你.html" target="_blank" title="爱咖啡的你">
                                <img class=" " src="${pageContext.request.contextPath}/img/s_w330h330.png"
                                     data-src="//asset.ibanquan.com/image/590af70e3f8f90450300011f/s_w330h330.png?v=1493890830"
                                     alt="爱咖啡的你" data-yhsdimgload="true">
                            </a>
                            <a class="proList-name settings-proTitle_color txt-overflow"
                               href="爱读书的你.html" title="爱咖啡的你" target="_blank">《爱读书的你》</a>

                            <div class="proList-desc">

                                <span class="proList-price settings-price_color">￥265.00</span>

                            </div>
                        </li>

                        <li>
                            <a class="proList-img settings-proPic_border txt-overflow"
                               href="爱读书的你.html" target="_blank" title="粉色少女之约">
                                <img class=" " src="${pageContext.request.contextPath}/img/s_w330h330(1).png"
                                     data-src="//asset.ibanquan.com/image/590af5749bedc42522000117/s_w330h330.png?v=1493890420"
                                     alt="粉色少女之约" data-yhsdimgload="true">
                            </a>
                            <a class="proList-name settings-proTitle_color txt-overflow"
                               href="爱读书的你.html" title="粉色少女之约" target="_blank">《十年之约》</a>

                            <div class="proList-desc">

                                <span class="proList-price settings-price_color">￥325.00</span>

                            </div>
                        </li>


                        <li>
                            <a class="proList-img settings-proPic_border txt-overflow"
                               href="爱读书的你.html" target="_blank" title="金色的回忆">
                                <img class=" " src="${pageContext.request.contextPath}/img/s_w330h330(2).png"
                                     data-src="//asset.ibanquan.com/image/590af7fab1b9572553000154/s_w330h330.png?v=1493891066"
                                     alt="金色的回忆" data-yhsdimgload="true">
                            </a>
                            <a class="proList-name settings-proTitle_color txt-overflow"
                               href="爱读书的你.html" title="大学的回忆" target="_blank">《大学的回忆》</a>

                            <div class="proList-desc">

                                <span class="proList-price settings-price_color">￥359.00</span>

                            </div>
                        </li>


                        <li>
                            <a class="proList-img settings-proPic_border txt-overflow"
                               href="爱读书的你.html" target="_blank" title="你是人间四月天">
                                <img class=" " src="${pageContext.request.contextPath}/img/s_w330h330(3).png"
                                     data-src="//asset.ibanquan.com/image/590af6ca3f8f904503000118/s_w330h330.png?v=1493890763"
                                     alt="你是人间四月天" data-yhsdimgload="true">
                            </a>
                            <a class="proList-name settings-proTitle_color txt-overflow"
                               href="爱读书的你.html" title="你是人间四月天" target="_blank">《天才在左疯子在右》</a>

                            <div class="proList-desc">

                                <span class="proList-price settings-price_color">￥399.00</span>

                            </div>
                        </li>
                    </ul>
                    <a class="mobi-show mobi-products-more" href="http://hongyuan.theme.yurl.vip/products">more</a>

                </div>
            </div>
        </div>
    </div>



    <div class="wrapper wrapper_fourth">
        <div class="cont">
            <div class="mod clearfix">
                <a href="#">
                    <img src="${pageContext.request.contextPath }/img/wrapper_fourth_1.png" alt="" class="wrapper_fourth_img_1"></a>
                <a href="#">
                    <img src="${pageContext.request.contextPath }/img/wrapper_fourth_2.png" alt="" class="wrapper_fourth_img_2.png"></a>
            </div>
        </div>
    </div>


    <script src="${pageContext.request.contextPath}/js/jquery.slides.min.js.下载" type="text/javascript"></script>
    <script>
        $(function () {

            $('#slides_prev').hide();
            $('#slides_next').hide();
            $("#slides").slidesjs({
                width: "900",
                height: "530",
                play: {
                    active: true,
// [boolean] Generate the play and stop buttons.
// You cannot use your own buttons. Sorry.
                    effect: "slide",
// [string] Can be either "slide" or "fade".
                    interval: 5000,
// [number] Time spent on each slide in milliseconds.
                    auto: true,
// [boolean] Start playing the slideshow on load.
                    swap: false,
// [boolean] show/hide stop and play buttons
                    pauseOnHover: true,
// [boolean] pause a playing slideshow on hover
                    restartDelay: 2500
// [number] restart delay on inactive slideshow
                },
                navigation: {
                    active: false,
                    effect: "slide"
                },
                pagination: {
                    active: true
                }
            });

        });
    </script>
    <div id="tracecode"></div>

    <div class="wrapper wrapper-footer settings-main_background">
        <div class="cont settings-main_background">
            <div class="mod footer">
                <div class="footer-logo">
                    <a class="logo-link settings-h1_color" href="http://hongyuan.theme.yurl.vip/">

                        <img src="${pageContext.request.contextPath}/img/logo.png" alt="BigLibrary">

                    </a>
                </div>
                <div class="footer-nav">

                    <a class="footer-link settings-footerLink_color" href="http://hongyuan.theme.yurl.vip/">关于我们</a>

                    <a class="footer-link settings-footerLink_color" href="http://hongyuan.theme.yurl.vip/">友情链接</a>

                    <a class="footer-link settings-footerLink_color" href="http://hongyuan.theme.yurl.vip/">联系我们</a>

                </div>
                <div class="footer-payment settings-footer_payment_icon_color pc-show">

                    <i class="footer-payment-icon yhsd-iconfont yhsd-iconfont-wechat_pay" title="微信支付"></i>


                    <i class="footer-payment-icon yhsd-iconfont yhsd-iconfont-alipay" title="支付宝"></i>


                    <i class="footer-payment-icon yhsd-iconfont yhsd-iconfont-baifubao" title="百度钱包"></i>


                    <i class="footer-payment-icon yhsd-iconfont yhsd-iconfont-tenpay" title="财付通"></i>


                    <i class="footer-payment-icon yhsd-iconfont yhsd-iconfont-99bill" title="快钱"></i>


                    <i class="footer-payment-icon yhsd-iconfont yhsd-iconfont-offline_pay" title="货到付款"></i>


                    <i class="footer-payment-icon yhsd-iconfont yhsd-iconfont-card_pay" title="银行卡"></i>

                </div>

                <div class="footer-copyright settings-footer_color">
                    By 吉首大学创新创业工作室 © 2017 BigLibrary.com
                </div>
                <div class="footer-payment settings-footer_payment_icon_color mobi-show">

                    <i class="footer-payment-icon yhsd-iconfont yhsd-iconfont-wechat_pay" title="微信支付"></i>


                    <i class="footer-payment-icon yhsd-iconfont yhsd-iconfont-alipay" title="支付宝"></i>


                    <i class="footer-payment-icon yhsd-iconfont yhsd-iconfont-baifubao" title="百度钱包"></i>


                    <i class="footer-payment-icon yhsd-iconfont yhsd-iconfont-tenpay" title="财付通"></i>


                    <i class="footer-payment-icon yhsd-iconfont yhsd-iconfont-99bill" title="快钱"></i>


                    <i class="footer-payment-icon yhsd-iconfont yhsd-iconfont-offline_pay" title="货到付款"></i>


                    <i class="footer-payment-icon yhsd-iconfont yhsd-iconfont-card_pay" title="银行卡"></i>

                </div>
            </div>
        </div>
    </div>


    <div class="wrapper wrapper-mobile_nav" id="mobile_menu">
        <div class="cont">
            <div class="mod mobile_nav">

                <!-- -->
                <div class="mobile_nav_menu settings-nav_background">
                    <div class="mobile_nav_top">
                        <a class="logo-link mobile_nav_logo settings-h1_color" href="http://hongyuan.theme.yurl.vip/">

                            <img src="${pageContext.request.contextPath }/img/logo.png" alt="BigLibrary">

                        </a>
                        <span class="mobile_nav_close iconfont icon-guanbi"></span>
                    </div>
                    <div class="mobile_nav_middle">
                        <a id="yhsd-header-search1" href="javascript:void(0);" class="header-search-ico">
                            <span class="main-ico main-ico-search iconfont icon-sousuo settings-top_color"></span>
                            <span class="settings-top_color" style="margin-left:5px;"></span>
                        </a>

                        <div id="yhsd-header-search-ipt1" class="header-search">
                            <input class="search-ipt settings-ipt_border" type="text" placeholder="搜索全店">
                        </div>
                    </div>
                    <!-- 一级菜单 -->
                    <ul class="nav-link clearfix">

                        <li>
                            <a class="txt-overflow settings-navLink_color" href="http://hongyuan.theme.yurl.vip/">首页</a>
                            <!-- 二级菜单 -->

                        </li>

                        <li>
                            <a class="txt-overflow settings-navLink_color"
                               href="http://hongyuan.theme.yurl.vip/products">鲜花订购</a>
                            <!-- 二级菜单 -->

                        </li>

                        <li>
                            <a class="txt-overflow settings-navLink_color"
                               href="http://hongyuan.theme.yurl.vip/pages/g000002">品牌故事</a>
                            <!-- 二级菜单 -->

                        </li>

                        <li>
                            <a class="txt-overflow settings-navLink_color" href="http://hongyuan.theme.yurl.vip/blogs">博客</a>
                            <!-- 二级菜单 -->

                        </li>

                        <li>
                            <a class="txt-overflow settings-navLink_color" href="http://hongyuan.theme.yurl.vip/posts">最新动态</a>
                            <!-- 二级菜单 -->

                        </li>

                    </ul>
                </div>
                <div class="mobile_nav_bg" id="mobile_bg"></div>
                <!-- -->
            </div>
        </div>
    </div>

    <div class="wrapper wrapper-popup" id="yhsd-popup-wrap">
        <div class="cont">
            <div class="mod popup settings-body_background" id="yhsd-popup">
                <div class="popup-cont" id="yhsd-popup-cont"></div>
                <div class="popup-btn" id="yhsd-popup-btn"></div>
                <a class="popup-close" id="yhsd-popupClose" href="javascript:void(0)"><span
                        class="aIco aIco-close"></span></a>
            </div>
            <div class="mask"></div>
        </div>
    </div>


</div>

<div id="go_top" class="clearfix go_top go_top-style-1">

    <a class="go_top-service" href="http://wpa.qq.com/msgrd?v=3&amp;uin=&amp;site=qq&amp;menu=yes" title="联系客服"
       target="_blank">
        <i class="iconfont icon-qq"></i>
        <span>QQ客服</span>
    </a>


    <a class=" go_top-service go_top-service-weixin" title="微信客服">
        <i class="iconfont icon-weixin"></i>
        <span>微信客服</span>
    </a>

    <a id="go_top-go" class="go_top-btn go_top-go iconfont icon-huidaodingbu" href="javascript:void(0);"
       style="display: none;"></a>
</div>
<div class="weixin_sercice">
    <img src="${pageContext.request.contextPath }/img/weixin_sercice.png" alt="微信客服二维码">

</div>

<script>
    (function () {

        // 滚动监听
        var _elem = $(document);    // 滚动条所在元素
        var elem = _elem[0]
        var _eTop = $('#go_top-go');   // Top 元素
        var _bodyOrHtml = $('html, body');
        var _weixinSercice = $('.weixin_sercice');

        // 兼容性
        if (navigator.userAgent.indexOf('Trident') > -1 || navigator.userAgent.indexOf('Firefox') > -1) {
            _elem = $(window)
            elem = _elem[0]
            _bodyOrHtml = $('html')
        }

        // 显示处理
        var eventFn = function (e) {
            if (_elem.scrollTop() >= 1) {
                _eTop.fadeIn();
            } else {
                _eTop.fadeOut();
            }
        };
        // 微信二维码悬浮
        $('.go_top-service-weixin').hover(function () {
            _weixinSercice.addClass('weixin_sercice_hover');
        }, function () {
            _weixinSercice.removeClass('weixin_sercice_hover');
        });
        // 显示处理
        var eventFn = function (e) {
            if (_elem.scrollTop() >= 1) {
                _weixinSercice.addClass('weixin_sercice_position');
                _eTop.fadeIn();
            }
            else {
                _weixinSercice.removeClass('weixin_sercice_position');
                _eTop.fadeOut();
            }
            ;
        };


        // 绑定滚动事件
        _elem.scroll(eventFn);

        // 判断页面
        var isIndex = false;
        if ($('.index').size() > 0) {
            isIndex = true;
        }
        ;
        var isMobile = $('body').hasClass('is_mobile')

        // Top 按钮 绑定
        $('#go_top-go').click(function (e) {

            e.preventDefault();
            if (isIndex && !isMobile) {
                wheel.set(1);
            } else {
                _bodyOrHtml.animate({scrollTop: 0}, 618);
            }
        });
    })();
</script>


<script src="${pageContext.request.contextPath}/js/yhsd-desktop-170719.min.js.下载" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/js/youpage.min.js.下载" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/js/main.js.下载" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/js/user.js.下载" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/js/img_zoom.min.js.下载" type="text/javascript"></script>


<!--图片轮播部分代码-->
<script src="${pageContext.request.contextPath}/js/jquery-1.11.0.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/js/pageSwitch.min.js"></script>
<script>
    $("#picture").PageSwitch({
        direction: 'horizontal',
        easing: 'ease-in',
        duration: 1000,
        autoPlay: true,
        loop: 'false'
    });
</script>
</body>
</html>