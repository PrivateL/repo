/**
 * Created by PC-A on 2017/10/15.
 * 验证用户名、密码以及验证码是否为空并且正确的js代码
 */

function createCode(){
    var code = "" ;
    var codeLength = 4 ;
    var codeChars = new Array(0,1,2,3,4,5,6,7,8,9,
        'a','b','c','d','e','f','g',
        'h','i','j','k','l','m','n',
        'o','p','q','r','s','t','u',
        'v','w','x','y','z',
        'A','B','C','D','E','F','G',
        'H','I','J','K','L','M','N',
        'O','P','Q','R','S','T','U',
        'V','W','X','Y','Z' );
    for(var i = 0 ; i < codeLength ; i++){
        var charNum = Math.floor(Math.random() * 52 ) ;
        code += codeChars [charNum] ;
    }
    return code ;
}
//将产生的验证码字符串赋值给验证码标签（codeE）
$(function(){
    $('#codeE').text(createCode) ;//页面加载完全后，动态生成验证码标签内容
    $('#aChangeCode').click(function() {//点击“换一张”链接，动态生成验证码标签内容
        $('#codeE').text(createCode) ;
    });
});

/**
 * 判断输入框是否为空函数
 * @param{Object} val 输入框ID值
 * @param{Object} tip 输入框为空的提示信息
 */

function checkNull(val,tip){
    var uName  = $(val).val();
    if(uName.length == 0){
        //如果输入框为空，使用Bootstrap提示框组件显示相应提示信息
        $(val).tooltip({title:tip,placement:'auto'});
        $(val).tooltip('show');
        return false ;
    }else{//如果输入框不为空，设置Bootstrap提示框组件信息为"空字符串"
        $(val).tooltip({title:'',placement:'auto'});
        return  false ;
    }
}

/**
 * 判断验证码输入框输入值与动态生成验证码标签内容是否一致
 */
function matchCode(){
    var buildCode = $('#codeE').text();//动态生成验证码标签内容
    var inputCode = $('#login-Code').val();//验证码输入框输入值
    if( buildCode != inputCode ){//如果验证码不一致，使用Bootstrap提示框组件显示相应提示信息
        $('#login-Code').tooltip({title:'验证码输入不正确',placement:'auto'});
        $('#login-Code').tooltip('show');
        return false ;
    }
    else {
        $('#login-Code').tooltip({title:'',placement:'auto'});
        return true ;
    }
}
/**
 * 定义好表单验证函数之后，接下来就是调用验证函数，实现表单验证
 */
$(function(){
    $('#myLogin').submit(function(){/*点击用户登录按钮进行表单验证*/
        checkNull('#login-User','用户名不能为空！');
        checkNull('#login-Pwd','密码不能为空！');
        mathCode();
    });
    $('#login-User').blur(function(){/*焦点离开用户名输入框验证用户名是否为空*/
        checkNull('#login-User','用户名不能为空！');
    });
    $('#login-Pwd').blur(function(){/*焦点离开密码输入框验证密码是否为空*/
        checkNull('#login-Pwd','密码不能为空！');
    });
    $('#login-Code').blur(matchCode);/*焦点离开验证码输入框检查验证码是否一致*/
})



