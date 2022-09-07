
 <h1 class="curproject-name"> 悦跑校园API接口文档 </h1> 
 


# 订单层

## 查询所有订单
<a id=查询所有订单> </a>
### 基本信息

**Path：** /order/select

**Method：** GET

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| token  |   | 是  |   |  登录令牌 |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> status</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">状态码</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">消息</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">数据</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> orderId</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单id</span></td><td key=5></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> orderName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单名称</span></td><td key=5></td></tr><tr key=0-2-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> orderStatus</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单状态(0未接单,1已接单,2已完成,3已退款)</span></td><td key=5></td></tr><tr key=0-2-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> payId</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付id</span></td><td key=5></td></tr><tr key=0-2-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> pay</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付信息</span></td><td key=5></td></tr><tr key=0-2-4-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> payId</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付id</span></td><td key=5></td></tr><tr key=0-2-4-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> payMoney</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付价钱</span></td><td key=5></td></tr><tr key=0-2-4-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> payType</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付类型</span></td><td key=5></td></tr><tr key=0-2-4-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> payStatus</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付状态(0未支付,1已支付,2已退款)</span></td><td key=5></td></tr><tr key=0-2-4-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userId</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户id</span></td><td key=5></td></tr><tr key=0-2-4-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> user</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户信息</span></td><td key=5></td></tr><tr key=0-2-4-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> payTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付时间</span></td><td key=5></td></tr><tr key=0-2-4-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> refundTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">退款时间</span></td><td key=5></td></tr><tr key=0-2-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> userId</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户id</span></td><td key=5></td></tr><tr key=0-2-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> user</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户信息</span></td><td key=5></td></tr><tr key=0-2-6-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userId</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户id</span></td><td key=5></td></tr><tr key=0-2-6-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户名</span></td><td key=5></td></tr><tr key=0-2-6-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userPassword</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户密码</span></td><td key=5></td></tr><tr key=0-2-6-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userAvatar</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户头像</span></td><td key=5></td></tr><tr key=0-2-6-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userIdentity</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户身份</span></td><td key=5></td></tr><tr key=0-2-6-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userStatus</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户状态</span></td><td key=5></td></tr><tr key=0-2-6-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> createTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">创建时间</span></td><td key=5></td></tr><tr key=0-2-6-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> updateTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">修改时间</span></td><td key=5></td></tr><tr key=0-2-7><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> placeTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">下单时间</span></td><td key=5></td></tr><tr key=0-2-8><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> takeTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">接单时间</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 根据id值批量修改订单
<a id=根据id值批量修改订单> </a>
### 基本信息

**Path：** /order/update

**Method：** PUT

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |  JSON基本请求头 |
| token  |   | 是  |   |  登录令牌 |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> </span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> orderId</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单Id</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> orderName</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单名称</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> orderStatus</span></td><td key=1><span>integer</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单状态(0未接单,1已接单,2已完成,3已退款)</span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> payId</span></td><td key=1><span>integer</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付id</span></td><td key=5></td></tr><tr key=0-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> userId</span></td><td key=1><span>integer</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户id</span></td><td key=5></td></tr><tr key=0-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> placeTime</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">下单时间</span></td><td key=5></td></tr><tr key=0-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> takeTime</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">接单时间</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> status</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">状态码</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">消息</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">影响行数</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 根据id值批量删除订单
<a id=根据id值批量删除订单> </a>
### 基本信息

**Path：** /order/delete

**Method：** DELETE

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |  JSON基本请求头 |
| token  |   | 是  |   |  登录令牌 |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> </span></td><td key=1><span>number []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>number</span></p></td></tr><tr key=array-2327><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> </span></td><td key=1><span></span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单Id</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> status</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">状态码</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">消息</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">影响行数</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 根据id值批量查询订单
<a id=根据id值批量查询订单> </a>
### 基本信息

**Path：** /order/selectI

**Method：** GET

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| token  |   | 是  |   |  登录令牌 |
**Query**

| 参数名称  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ |
| orderIds | 是  |  1 |  订单Id |
| orderIds | 否  |  2 |  订单Id |
| orderIds | 否  |  3 |  订单Id |
| orderIds | 否  |  4 |  订单Id |
| orderIds | 否  |  5 |  订单Id |
| orderIds | 否  |  6 |  订单Id |
| orderIds | 否  |  7 |  订单Id |
| orderIds | 否  |  8 |  订单Id |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> status</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">状态码</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">消息</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">数据</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> orderId</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单id</span></td><td key=5></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> orderName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单名称</span></td><td key=5></td></tr><tr key=0-2-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> orderStatus</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单状态(0未接单,1已接单,2已完成,3已退款)</span></td><td key=5></td></tr><tr key=0-2-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> payId</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付id</span></td><td key=5></td></tr><tr key=0-2-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> pay</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付信息</span></td><td key=5></td></tr><tr key=0-2-4-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> payId</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付编号</span></td><td key=5></td></tr><tr key=0-2-4-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> payMoney</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付的价格</span></td><td key=5></td></tr><tr key=0-2-4-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> payType</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付方式</span></td><td key=5></td></tr><tr key=0-2-4-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> payStatus</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付状态(0未支付,1已支付,2已退款)</span></td><td key=5></td></tr><tr key=0-2-4-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userId</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户编号</span></td><td key=5></td></tr><tr key=0-2-4-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> user</span></td><td key=1><span>null</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户信息</span></td><td key=5></td></tr><tr key=0-2-4-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> payTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付时间</span></td><td key=5></td></tr><tr key=0-2-4-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> refundTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">退款时间</span></td><td key=5></td></tr><tr key=0-2-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> userId</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户id</span></td><td key=5></td></tr><tr key=0-2-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> user</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户信息</span></td><td key=5></td></tr><tr key=0-2-6-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userId</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户编号</span></td><td key=5></td></tr><tr key=0-2-6-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户名</span></td><td key=5></td></tr><tr key=0-2-6-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userPassword</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户密码</span></td><td key=5></td></tr><tr key=0-2-6-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userAvatar</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户头像</span></td><td key=5></td></tr><tr key=0-2-6-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userIdentity</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户身份(0普通用户,1跑腿员,2管理员)</span></td><td key=5></td></tr><tr key=0-2-6-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userStatus</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户状态(0正常,1冻结)</span></td><td key=5></td></tr><tr key=0-2-6-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> createTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">创建时间</span></td><td key=5></td></tr><tr key=0-2-6-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> updateTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">修改时间</span></td><td key=5></td></tr><tr key=0-2-7><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> placeTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">下单时间</span></td><td key=5></td></tr><tr key=0-2-8><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> takeTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">接单时间</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 根据支付订单id值查询服务订单
<a id=根据支付订单id值查询服务订单> </a>
### 基本信息

**Path：** /selectP/{payId}

**Method：** GET

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| token  |   | 是  |   |  登录令牌 |
**路径参数**

| 参数名称 | 示例  | 备注  |
| ------------ | ------------ | ------------ |
| payId |  1 |  支付Id |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> status</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">状态码</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">消息</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">数据</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> orderId</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单id</span></td><td key=5></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> orderName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单名称</span></td><td key=5></td></tr><tr key=0-2-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> orderStatus</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单状态(0未接单,1已接单,2已完成,3已退款)</span></td><td key=5></td></tr><tr key=0-2-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> payId</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付id</span></td><td key=5></td></tr><tr key=0-2-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> pay</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付信息</span></td><td key=5></td></tr><tr key=0-2-4-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> payId</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付编号</span></td><td key=5></td></tr><tr key=0-2-4-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> payMoney</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付的价格</span></td><td key=5></td></tr><tr key=0-2-4-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> payType</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付方式</span></td><td key=5></td></tr><tr key=0-2-4-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> payStatus</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付状态(0未支付,1已支付,2已退款)</span></td><td key=5></td></tr><tr key=0-2-4-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userId</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户编号</span></td><td key=5></td></tr><tr key=0-2-4-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> user</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户信息</span></td><td key=5></td></tr><tr key=0-2-4-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> payTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付时间</span></td><td key=5></td></tr><tr key=0-2-4-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> refundTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">退款时间</span></td><td key=5></td></tr><tr key=0-2-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> userId</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户id</span></td><td key=5></td></tr><tr key=0-2-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> user</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户信息</span></td><td key=5></td></tr><tr key=0-2-6-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userId</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户编号</span></td><td key=5></td></tr><tr key=0-2-6-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户名</span></td><td key=5></td></tr><tr key=0-2-6-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userPassword</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户密码</span></td><td key=5></td></tr><tr key=0-2-6-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userAvatar</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户头像</span></td><td key=5></td></tr><tr key=0-2-6-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userIdentity</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户身份(0普通用户,1跑腿员,2管理员)</span></td><td key=5></td></tr><tr key=0-2-6-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userStatus</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户状态(0正常,1冻结)</span></td><td key=5></td></tr><tr key=0-2-6-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> createTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">创建时间</span></td><td key=5></td></tr><tr key=0-2-6-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> updateTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">修改时间</span></td><td key=5></td></tr><tr key=0-2-7><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> placeTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">下单时间</span></td><td key=5></td></tr><tr key=0-2-8><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> takeTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">接单时间</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 根据用户id查询订单
<a id=根据用户id查询订单> </a>
### 基本信息

**Path：** /order/selectU/{userId}

**Method：** GET

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| token  |   | 是  |   |  登录令牌 |
**路径参数**

| 参数名称 | 示例  | 备注  |
| ------------ | ------------ | ------------ |
| userId |  1 |  用户id |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> status</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">状态码</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">消息</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">数据</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> orderId</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单id</span></td><td key=5></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> orderName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单名称</span></td><td key=5></td></tr><tr key=0-2-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> orderStatus</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单状态(0未接单,1已接单,2已完成,3已退款)</span></td><td key=5></td></tr><tr key=0-2-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> payId</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付id</span></td><td key=5></td></tr><tr key=0-2-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> pay</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付信息</span></td><td key=5></td></tr><tr key=0-2-4-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> payId</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付编号</span></td><td key=5></td></tr><tr key=0-2-4-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> payMoney</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付的价格</span></td><td key=5></td></tr><tr key=0-2-4-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> payType</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付方式</span></td><td key=5></td></tr><tr key=0-2-4-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> payStatus</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付状态(0未支付,1已支付,2已退款)</span></td><td key=5></td></tr><tr key=0-2-4-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userId</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户编号</span></td><td key=5></td></tr><tr key=0-2-4-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> user</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户信息</span></td><td key=5></td></tr><tr key=0-2-4-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> payTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付时间</span></td><td key=5></td></tr><tr key=0-2-4-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> refundTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">退款时间</span></td><td key=5></td></tr><tr key=0-2-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> userId</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户id</span></td><td key=5></td></tr><tr key=0-2-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> user</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户信息</span></td><td key=5></td></tr><tr key=0-2-6-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userId</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户编号</span></td><td key=5></td></tr><tr key=0-2-6-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户名</span></td><td key=5></td></tr><tr key=0-2-6-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userPassword</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户密码</span></td><td key=5></td></tr><tr key=0-2-6-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userAvatar</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户头像</span></td><td key=5></td></tr><tr key=0-2-6-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userIdentity</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户身份(0普通用户,1跑腿员,2管理员)</span></td><td key=5></td></tr><tr key=0-2-6-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userStatus</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户状态(0正常,1冻结)</span></td><td key=5></td></tr><tr key=0-2-6-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> createTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">创建时间</span></td><td key=5></td></tr><tr key=0-2-6-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> updateTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">修改时间</span></td><td key=5></td></tr><tr key=0-2-7><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> placeTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">下单时间</span></td><td key=5></td></tr><tr key=0-2-8><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> takeTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">接单时间</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 添加一条订单
<a id=添加一条订单> </a>
### 基本信息

**Path：** /order/insert

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> orderId</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单Id</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> orderName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单名称</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> orderStatus</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单状态(0未接单,1已接单,2已完成,3已退款)</span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> payId</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付id</span></td><td key=5></td></tr><tr key=0-4><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> userId</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户id</span></td><td key=5></td></tr><tr key=0-5><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> placeTime</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">下单时间</span></td><td key=5></td></tr><tr key=0-6><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> takeTime</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">接单时间</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> status</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">状态码</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">消息</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">影响行数</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
# 支付层

## 查询所有支付订单
<a id=查询所有支付订单> </a>
### 基本信息

**Path：** /pay/select

**Method：** GET

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| token  |   | 是  |   |  登录令牌 |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> status</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">状态码</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">消息</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">数据</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> payId</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付Id</span></td><td key=5></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> payMoney</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付的价格</span></td><td key=5></td></tr><tr key=0-2-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> payType</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付方式</span></td><td key=5></td></tr><tr key=0-2-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> payStatus</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付状态(0未支付,1已支付,2已退款)</span></td><td key=5></td></tr><tr key=0-2-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> userId</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户编号</span></td><td key=5></td></tr><tr key=0-2-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> user</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户信息</span></td><td key=5></td></tr><tr key=0-2-5-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userId</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户Id</span></td><td key=5></td></tr><tr key=0-2-5-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户名</span></td><td key=5></td></tr><tr key=0-2-5-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userPassword</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户密码</span></td><td key=5></td></tr><tr key=0-2-5-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userAvatar</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户头像</span></td><td key=5></td></tr><tr key=0-2-5-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userIdentity</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户身份(0普通用户,1跑腿员,2管理员)</span></td><td key=5></td></tr><tr key=0-2-5-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userStatus</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户状态(0正常,1冻结)</span></td><td key=5></td></tr><tr key=0-2-5-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> createTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">创建时间</span></td><td key=5></td></tr><tr key=0-2-5-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> updateTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">修改时间</span></td><td key=5></td></tr><tr key=0-2-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> payTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付时间</span></td><td key=5></td></tr><tr key=0-2-7><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> refundTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">退款时间</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 根据id值批量删除支付订单
<a id=根据id值批量删除支付订单> </a>
### 基本信息

**Path：** /pay/delete

**Method：** DELETE

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |  JSON基本的请求头 |
| token  |   | 是  |   |  登录令牌 |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> </span></td><td key=1><span>number []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>number</span></p></td></tr><tr key=array-2328><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> </span></td><td key=1><span></span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单Id</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody">
               </tbody>
              </table>
            
## 根据id值查询支付订单
<a id=根据id值查询支付订单> </a>
### 基本信息

**Path：** /pay/selectI

**Method：** GET

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| token  |   | 是  |   |  登录令牌 |
**Query**

| 参数名称  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ |
| payIds | 是  |  1 |  支付Id |
| payIds | 否  |  2 |  支付Id |
| payIds | 否  |  3 |  支付Id |
| payIds | 否  |  4 |  支付Id |
| payIds | 否  |  5 |  支付Id |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> status</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">状态码</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">消息</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">数据</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> payId</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付Id</span></td><td key=5></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> payMoney</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付的价格</span></td><td key=5></td></tr><tr key=0-2-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> payType</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付方式</span></td><td key=5></td></tr><tr key=0-2-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> payStatus</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付状态(0未支付,1已支付,2已退款)</span></td><td key=5></td></tr><tr key=0-2-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> userId</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户编号</span></td><td key=5></td></tr><tr key=0-2-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> user</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户信息</span></td><td key=5></td></tr><tr key=0-2-5-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userId</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户Id</span></td><td key=5></td></tr><tr key=0-2-5-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户名</span></td><td key=5></td></tr><tr key=0-2-5-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userPassword</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户密码</span></td><td key=5></td></tr><tr key=0-2-5-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userAvatar</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户头像</span></td><td key=5></td></tr><tr key=0-2-5-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userIdentity</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户身份(0普通用户,1跑腿员,2管理员)</span></td><td key=5></td></tr><tr key=0-2-5-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userStatus</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户状态(0正常,1冻结)</span></td><td key=5></td></tr><tr key=0-2-5-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> createTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">创建时间</span></td><td key=5></td></tr><tr key=0-2-5-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> updateTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">修改时间</span></td><td key=5></td></tr><tr key=0-2-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> payTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付时间</span></td><td key=5></td></tr><tr key=0-2-7><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> refundTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">退款时间</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 根据支付id值修改账单
<a id=根据支付id值修改账单> </a>
### 基本信息

**Path：** /pay/update

**Method：** PUT

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |  JSON最基本的请求头 |
| token  |   | 是  |   |  登录令牌 |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> </span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> payId</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付Id</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> payMoney</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付的价格</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> payType</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付方式</span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> payStatus</span></td><td key=1><span>integer</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付状态(0未支付,1已支付,2已退款)</span></td><td key=5></td></tr><tr key=0-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> userId</span></td><td key=1><span>integer</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户编号</span></td><td key=5></td></tr><tr key=0-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> payTime</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付时间</span></td><td key=5></td></tr><tr key=0-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> refundTime</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">退款时间</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> status</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">状态码</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">消息</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">影响行数</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 根据用户id值查询支付订单
<a id=根据用户id值查询支付订单> </a>
### 基本信息

**Path：** /pay/select/{userId}

**Method：** GET

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| token  |   | 是  |   |  登录令牌 |
**路径参数**

| 参数名称 | 示例  | 备注  |
| ------------ | ------------ | ------------ |
| userId |   |  用户Id |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> status</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">状态码</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">消息</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">数据</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> payId</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付Id</span></td><td key=5></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> payMoney</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付的价格</span></td><td key=5></td></tr><tr key=0-2-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> payType</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付方式</span></td><td key=5></td></tr><tr key=0-2-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> payStatus</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付状态(0未支付,1已支付,2已退款)</span></td><td key=5></td></tr><tr key=0-2-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> userId</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户编号</span></td><td key=5></td></tr><tr key=0-2-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> user</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户信息</span></td><td key=5></td></tr><tr key=0-2-5-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userId</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户Id</span></td><td key=5></td></tr><tr key=0-2-5-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户名</span></td><td key=5></td></tr><tr key=0-2-5-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userPassword</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户密码</span></td><td key=5></td></tr><tr key=0-2-5-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userAvatar</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户头像</span></td><td key=5></td></tr><tr key=0-2-5-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userIdentity</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户身份(0普通用户,1跑腿员,2管理员)</span></td><td key=5></td></tr><tr key=0-2-5-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userStatus</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户状态(0正常,1冻结)</span></td><td key=5></td></tr><tr key=0-2-5-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> createTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">创建时间</span></td><td key=5></td></tr><tr key=0-2-5-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> updateTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">修改时间</span></td><td key=5></td></tr><tr key=0-2-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> payTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付时间</span></td><td key=5></td></tr><tr key=0-2-7><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> refundTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">退款时间</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 添加支付订单
<a id=添加支付订单> </a>
### 基本信息

**Path：** /pay/insert

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |  JSON基本的请求头 |
| token  |   | 是  |   |  登录令牌 |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> payMoney</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付价格</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> payType</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付方式</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> payStatus</span></td><td key=1><span>integer</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付状态(0未支付,1已支付,2已退款)</span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> userId</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户编号</span></td><td key=5></td></tr><tr key=0-4><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> payTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付时间</span></td><td key=5></td></tr><tr key=0-5><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> refundTime</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">退款时间</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> status</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">状态码</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">消息</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">影响行数</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
# 用户层

## 查询所有用户
<a id=查询所有用户> </a>
### 基本信息

**Path：** /user/select

**Method：** GET

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| token  |   | 是  |   |  登录令牌 |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> </span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> userId</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户Id</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> userName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户名</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> userPassword</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户密码</span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> userAvatar</span></td><td key=1><span>string,null</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户头像</span></td><td key=5></td></tr><tr key=0-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> userIdentity</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户身份(0普通用户,1跑腿员,2管理员)</span></td><td key=5></td></tr><tr key=0-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> userStatus</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户状态(0正常,1冻结)</span></td><td key=5></td></tr><tr key=0-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> createTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">创建时间</span></td><td key=5></td></tr><tr key=0-7><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> updateTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">修改时间</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 根据id值修改用户
<a id=根据id值修改用户> </a>
### 基本信息

**Path：** /user/update

**Method：** PUT

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |  JSON最基本的请求头 |
| token  |   | 是  |   |  登录令牌 |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> </span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> userId</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户Id</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> userName</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户名</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> userPassword</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户密码</span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> userAvatar</span></td><td key=1><span>string,null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户头像</span></td><td key=5></td></tr><tr key=0-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> userIdentity</span></td><td key=1><span>integer</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户身份(0普通用户,1跑腿员,2管理员)</span></td><td key=5></td></tr><tr key=0-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> userStatus</span></td><td key=1><span>integer</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户状态(0正常,1冻结)</span></td><td key=5></td></tr><tr key=0-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> updateTime</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">修改时间</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> status</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">状态码</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">消息</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">影响行数</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 根据id值批量删除用户
<a id=根据id值批量删除用户> </a>
### 基本信息

**Path：** /user/delete

**Method：** DELETE

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |  JSON的基本请求头 |
| token  |   | 是  |   |  登录令牌 |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> </span></td><td key=1><span>integer []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>integer</span></p></td></tr><tr key=array-2329><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> </span></td><td key=1><span></span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户Id</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> status</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">状态码</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">消息</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">影响行数</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 根据id值批量查询用户信息
<a id=根据id值批量查询用户信息> </a>
### 基本信息

**Path：** /user/selectI

**Method：** GET

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |  JSON最基本的请求头 |
| token  |   | 是  |   |  登录令牌 |
**Query**

| 参数名称  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ |
| userIds | 是  |  1 |  用户Id |
| userIds | 是  |  2 |  用户Id |
| userIds | 是  |  3 |  用户Id |
| userIds | 是  |  4 |  用户Id |
| userIds | 是  |  5 |  用户Id |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> </span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> userId</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户Id</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> userName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户名</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> userPassword</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户密码</span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> userAvatar</span></td><td key=1><span>string,null</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户头像</span></td><td key=5></td></tr><tr key=0-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> userIdentity</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户身份(0普通用户,1跑腿员,2管理员)</span></td><td key=5></td></tr><tr key=0-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> userStatus</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户状态(0正常,1冻结)</span></td><td key=5></td></tr><tr key=0-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> createTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">创建时间</span></td><td key=5></td></tr><tr key=0-7><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> updateTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">修改时间</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 用户注册
<a id=用户注册> </a>
### 基本信息

**Path：** /user/register

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |  JSON最基本的请求头 |
**Query**

| 参数名称  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ |
| userName | 是  |   |  用户名 |
| userPassword | 是  |   |  密码 |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> status</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">状态码</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">消息</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">影响行数</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 用户登录
<a id=用户登录> </a>
### 基本信息

**Path：** /user/login

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |  JSON最基本的请求头 |
**Query**

| 参数名称  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ |
| userName | 是  |  root |  用户名 |
| userPassword | 是  |  12345678 |  密码 |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> status</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">状态码</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">消息</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">token令牌</span></td><td key=5></td></tr>
               </tbody>
              </table>
            