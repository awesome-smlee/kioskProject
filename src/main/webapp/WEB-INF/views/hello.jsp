<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>키오스크 프로젝트</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
<div class="menu-container">
    <div class="header">
<%--        <button>home</button>--%>
        <h1>INCO KIOSK</h1>
    </div>
    <div class="menu-list-container">
        <div class="menu">
            <img src="${pageContext.request.contextPath}/image/img1.jpg" />
            <p>아메리카노</p>
            <p>10,000원</p>
        </div>
        <div class="menu">
            <img src="${pageContext.request.contextPath}/image/img1.jpg" />
            <p>아메리카노</p>
            <p>10,000원</p>
        </div>
        <div class="menu">
            <img src="${pageContext.request.contextPath}/image/img1.jpg" />
            <p>아메리카노</p>
            <p>10,000원</p>
        </div>
        <div class="menu">
            <img src="${pageContext.request.contextPath}/image/img1.jpg" />
            <p>아메리카노</p>
            <p>10,000원</p>
        </div>
        <div class="menu">
            <img src="${pageContext.request.contextPath}/image/img1.jpg" />
            <p>아메리카노</p>
            <p>10,000원</p>
        </div>
        <div class="menu">
            <img src="${pageContext.request.contextPath}/image/img1.jpg" />
            <p>아메리카노</p>
            <p>10,000원</p>
        </div>
        <div class="menu">
            <img src="${pageContext.request.contextPath}/image/img1.jpg" />
            <p>아메리카노</p>
            <p>10,000원</p>
        </div>
        <div class="menu">
            <img src="${pageContext.request.contextPath}/image/img1.jpg" />
            <p>아메리카노</p>
            <p>10,000원</p>
        </div>
    </div>

    <div class="payment-container">
        <div class="cart-wrap">
            <div class="cart-area">선택한 아이템 영역</div>
        </div>
        <div class="right-wrap">
            <div class="time">
                <p>남은 시간</p>
                <span>26초</span>
            </div>
            <div class="btn-wrap">
                <button class="all-remove-btn">전체삭제</button>
                <button class="payment-btn">결제하기</button>
            </div>
        </div>

    </div>

<%--    Menu.builder().menuId("M001").menuName("아메리카노").menuPrice(10000).menuDesc("음료 설명").menuCategory("음료").build(),--%>
<%--    Menu.builder().menuId("M002").menuName("카페라떼").menuPrice(20000).menuDesc("음료 설명").menuCategory("음료").build(),--%>
<%--    Menu.builder().menuId("M003").menuName("카푸치노").menuPrice(30000).menuDesc("음료 설명").menuCategory("음료").build(),--%>
<%--    Menu.builder().menuId("M004").menuName("치즈케익").menuPrice(40000).menuDesc("디저트 설명").menuCategory("디저트").build(),--%>
<%--    Menu.builder().menuId("M005").menuName("케익초").menuPrice(50000).menuDesc("기타 설명").menuCategory("기타").build()--%>
</div>
</body>
</html>
