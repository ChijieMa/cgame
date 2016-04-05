var Checkbox, GL_CQSSC, List, ListItem, MenuItem, OrderChaseList, RaisedButton, React, SelectField, TextField, TotalWagers, injectTapEventPlugin;

React = require("react");

injectTapEventPlugin = require("react-tap-event-plugin");

SelectField = require('material-ui/lib/select-field');

MenuItem = require('material-ui/lib/menus/menu-item');

TextField = require('material-ui/lib/text-field');

RaisedButton = require('material-ui/lib/raised-button');

List = require('material-ui/lib/lists/list');

ListItem = require('material-ui/lib/lists/list-item');

Checkbox = require('material-ui/lib/checkbox');

OrderChaseList = require("./OrderChaseList.js");

GL_CQSSC = require('../libs/gl_CQSSC.js');

TotalWagers = React.createClass({
  getInitialState: function() {
    return {
      zhuihao: false,
      totalWagerCount: 0,
      totalWagerMoney: 0,
      WagerMoneyOnce: 0
    };
  },
  handleClickZhuihao: function(e) {
    console.log("handleClickZhuihao:" + e.currentTarget.value);
    return this.setState({
      zhuihao: !this.state.zhuihao
    });
  },
  handleClickZhuihaoStop: function(e) {
    return console.log("handleClickZhuihaoStop:" + e.currentTarget.checked);
  },
  handleUpdateHeader: function() {
    console.log("handleUpdateHeader");
    return this.refs["chaselist"].updateHeaderInfo();
  },
  handleSubmitWagers: function() {
    var confirmitems, currentPeroid, itemcom, items, key, title, v;
    if (this.state.zhuihao) {
      console.log("handleSubmitWagers.追号");
      title = "您";
    } else {
      confirmitems = this.props.getConfirmItems();
      itemcom = (function() {
        var results;
        results = [];
        for (key in confirmitems) {
          v = confirmitems[key];
          results.push(React.createElement("div", {
            "className": "row item",
            "key": key
          }, " ", "[" + v[0] + "]" + v[1] + " ;  ￥" + v[3] + "元"));
        }
        return results;
      })();
      currentPeroid = GL_CQSSC.GameState("currentPeroid");
      title = React.createElement("div", {
        "className": "diagtitle"
      }, " 是否将如下选号投入:", React.createElement("b", null, " ", currentPeroid, " "), " 期? ");
      items = React.createElement("div", {
        "className": "msgwageritems"
      }, itemcom);
    }
    return this.props.handleDiagOpen(items, title, {
      padding: "10px 10px 10px 20px"
    });
  },
  render: function() {
    var WagerMoneyOnce, comZhuiHao, styles, totalWagerMoney;
    styles = {
      listcs: {
        width: "100%",
        color: "whiteSmoke",
        fontSize: "13px",
        padding: "0px 0px 0px 23px"
      },
      checkbox: {
        width: "16px",
        height: "16px",
        fill: "whiteSmoke",
        top: "-16px",
        left: "5px"
      },
      checkboxi: {
        width: "16px",
        fill: "whiteSmoke"
      },
      confirmbtn: {
        float: "right",
        height: "36px"
      }
    };
    totalWagerMoney = parseFloat(this.state.totalWagerMoney).toFixed(4);
    WagerMoneyOnce = parseFloat(this.state.WagerMoneyOnce).toFixed(4);
    console.log("change wagerMoney:" + totalWagerMoney);
    if (this.state.zhuihao) {
      comZhuiHao = React.createElement("div", {
        "className": "col-sm-12"
      }, React.createElement(OrderChaseList, {
        "ref": "chaselist",
        "totalWagerCount": this.state.totalWagerCount,
        "totalWagerMoney": totalWagerMoney,
        "WagerMoneyOnce": WagerMoneyOnce
      }), " ");
    } else {
      comZhuiHao = React.createElement("div", null);
    }
    return React.createElement("div", {
      "className": "wagertotal col-sm-12"
    }, React.createElement("div", {
      "className": "col-sm-12"
    }, React.createElement("div", {
      "className": "col-sm-9"
    }, "您已确认 ", React.createElement("b", null, this.state.totalWagerCount), " 注, 总金额 ", React.createElement("b", {
      "id": "money_total"
    }, totalWagerMoney), " 元\n", React.createElement(ListItem, {
      "style": styles.listcs,
      "leftCheckbox": React.createElement(Checkbox, {
        "checked": this.state.zhuihao,
        "onCheck": this.handleClickZhuihao,
        "style": styles.checkbox,
        "iconStyle": styles.checkboxi
      }),
      "primaryText": "发起追号"
    }), React.createElement(ListItem, {
      "style": styles.listcs,
      "leftCheckbox": React.createElement(Checkbox, {
        "disabled": !this.state.zhuihao,
        "onCheck": this.handleClickZhuihaoStop,
        "style": styles.checkbox,
        "iconStyle": styles.checkboxi
      }),
      "primaryText": "中奖后停止追号"
    })), React.createElement("div", {
      "className": "row col-sm-3",
      "style": {
        marginBottom: "10px"
      }
    }, React.createElement(RaisedButton, {
      "label": "提交注单",
      "style": styles.confirmbtn,
      "primary": true,
      "onTouchTap": this.handleSubmitWagers
    }))), React.createElement("div", {
      "className": "zhuihao col-md-12"
    }, comZhuiHao));
  }
});

module.exports = TotalWagers;
