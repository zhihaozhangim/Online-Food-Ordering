package com.zhihao.sell.enums;

import lombok.Getter;

/**
 * Enum ResultEnum.
 */

@Getter
public enum ResultEnum {

  SUCCESS(0, "SUCCESS"),
  PARAM_ERROR(1, "WRONG PARAMS"),
  PRODUCT_NOT_EXIST(10, "PRODUCT NOT EXIST"),
  PRODUCT_STOCK_ERROR(11, "WRONG VALUE OF STOCK"),
  ORDER_NOT_EXIST(12, "ORDER NOT EXIST"),
  ORDERDETAIL_NOT_EXIST(13, "ORDER DETAIL NOT EXIST"),
  ORDER_STATUS_ERROR(14, "WRONG ORDER STATUS"),
  ORDER_UPDATE_FAIL(15, "ORDER UPDATE FAIL"),
  ORDER_DETAIL_EMPTY(16, "NO ORDER DETAIL"),
  ORDER_PAY_STATUS_ERROR(17, "WRONG PAY STATUS"),
  CART_EMPTY(18, "EMPTY CART"),
  ORDER_OWNER_ERROR(19, "THE ORDER DOESN'T BELONG TO THIS CUSTOMER"),
  ORDER_CANCEL_SUCCESS(22, "ORDER CANCEL SUCCESSFULLY"),
  ORDER_FINISH_SUCCESS(23, "ORDER FINISH SUCCESSFULLY"),
  PRODUCT_STATUS_ERROR(24, "WRONG PRODUCT STATUS");

  private Integer code;

  private String message;

  ResultEnum(Integer code, String message) {
    this.code = code;
    this.message = message;
  }

}