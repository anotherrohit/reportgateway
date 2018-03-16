package com.openDJ.util;

public enum FaultEnum {
	
	SYSTEM_ERROR("SYSTEM",1004, "A System error occurred, retry or contact tech support"),
	REQUEST_ERROR("SYSTEM",1005, "The request is syntactically incorrect"),
	TOKEN_EXPIRED(1006, "Session expired"),
	TOKEN_MISSING(1007, "Please login again"),
	STR_LEN(1009, "Reserved for text length validation"),
	
	INVALID_LOCATION_CODE(2001, "location code is invalid"),
	LOCATION_NOT_AVAILABLE(2002, "locations not available"),
	PROVIDE_PINCODE(2003,"Provide Pincode"),
	PROVIDE_LOCATION(2004,"Provide Location"),
	PROVIDE_CITY(2005,"Provide City"),
	PROVIDE_STATE(2006,"Provide State"),
	PROVIDE_COUNTRY(2007,"Provide Country"),
	PROVIDE_LOCATION_CODE(2008,"Provide Location Code"),
	PROVIDE_SEARCH_KEYWORD(2009,"Provide Serach Keyword"),
	PROVIDE_DEVICE_IDENTIFIER(2010,"Provide Device Identifier"),
	PROVIDE_LOCATION_ID(2011,"Provide Location Id"),
	
	INVALID_MOBILE_NUMBER(3001, "mobile number is invalid"),
	PROVIDE_OTP_CODE(3002, "provide OTP code"),
	INVALID_DEVICE(3003,"Invalid Device"),
	INVALID_APP_KEY(3004,"Invalid Application Key"),
	INVALID_OTP_CODE(3005,"Invalid OTP Code"),
	EXPIRED_OTP_CODE(3006,"Expired OTP Code"),
	
	INVALID_USER(4001,"Invalid User"),
	PROVIDE_USERNAME(4002,"Provide Username"),
	PROVIDE_PASSWORD(4003,"Provide Password"),
	PROVIDE_EMAIL_ID(4003,"Provide email-id"),
	NO_RESULTS_FOUND(4004,"No results found"),
	
	PROVIDE_RESTAURANT_NAME(5001,"Provide Restaurant name"),
	PROVIDE_RESTAURANT_ADDRESS(5002,"Provide Restaurant Address"),
	PROVIDE_CONTACT_NUMBER(5003,"Provide Contact number"),
	PROVIDE_IMAGE_URL(5004,"Provide Image"),
	PROVIDE_ICON_URL(5005,"Provide Icon"),
	PROVIDE_DELIVERY_OR_PICKUP(5006,"Provide Delivery or Pickup"),
	INVALID_RESTAURANT_CODE(5007, "Restaurant code is invalid"),
	RESTAURANT_NOT_AVAILABLE(5008, "Restaurant not available"),
	PROVIDE_RESTAURANT_CODE(5009,"Provide Restaurant code"),
	PROVIDE_RESTAURANT_ADMIN(5010,"Provide Restaurant admin"),
	RESTAURANT_MEAL_CATEGORY_NOT_AVAILABLE(5011, "Restaurant Meal Category not available"),
	INVALID_RESTAURANT_MEAL_CATEGORY_ID(5012, "Invalid Restaurant Meal Category ID"),
	PROVIDE_FIRST_NAME(5013,"Provide First Name"),
	PROVIDE_LAST_NAME(5014,"Provide Last Name"),
	PROVIDE_HOLIDAY_DATE(5015,"Provide Restaurant Holiday Date"),
	PROVIDE_DELIVERY_CHARGE(5016,"Provide Delivery Charge"),
	INVALID_DELIVERY_CHARGE(5017,"Invalid Delivery Charge"),
	
	PROVIDE_USER_ID(6001, "Provide User Id"),
	ADDRESS_NOT_AVAILABLE(6002, "Address not available"),
	PROVIDE_ADDRESS_ID(6003, "Provide Address Id"),
	INVALID_ADDRESS_ID(6004, "Invalid Address Id"),
	PROVIDE_ADDRESS_TYPE(6005, "Provide Address Type"),
	PROVIDE_ADDRESS_LINE1(6006, "Provide Address Line1"),
	PROVIDE_ADDRESS_LINE2(6007, "Provide Address Line2"),
	PROVIDE_NAME(6008, "Provide Name"),
	PROVIDE_VALID_ADDRESS(6009,"Provide Valid Address"),
	
	PROVIDE_UUID(7001, "Provide uuid"),
	INVALID_UUID(7002, "Invalid uuid"),
	PROVIDE_ACCESS_TOKEN(7001, "Provide access token"),
	
	PROVIDE_MEAL_CATEGORY_CODE(8001,"Provide Meal Category Code"),
	PROVIDE_MEAL_CATEGORY_NAME(8002,"Provide Meal Category"),
	PROVIDE_MEAL_CATEGORY_ICON(8003,"Provide Meal Category icon"),
	INVALID_MEAL_CATEGORY_CODE(8004,"Invalid Meal Category code"),
	MEAL_CATEGORY_NOT_AVAILABLE(8005,"Meal Category not available"),
	MEAL_CATEGORY_AUDIT_NOT_AVAILABLE(8006,"Meal Category audit not available"),
	PROVIDE_MEAL_END_TIME(8007,"Provide Meal End Time"),
	PROVIDE_MEAL_START_TIME(8008,"Provide Meal Start Time"),
	INVALID_START_END_TIME(8010,"End Time must greater then Start Time"),
	ALREADY_EXISTS(8009,"Already Exists!!"),
	
	PROVIDE_DATE(9001,"Provide Date"),
	ORDER_LIST_NOT_AVAILABLE(9002,"Order List Not Available"),
	
	PROVIDE_RESTAURANT_DISH_ID(10001,"Provide Restaurant Dish Id"),
	INVALID_RESTAURANT_DISH_ID(10002,"Invalid Restaurant Dish Id"),
	PROVIDE_DISH_RATING(10003,"Provide Dish Rating"),
	
	PROVIDE_APP_KEY(11001,"Provide Application key"),
	
	CUISINE_TYPE_NOT_AVAILABLE(1101, "Cuisine type not available"), 
	INVALID_CUISINE_TYPE_ID(1102, "Invalid Cuisine type"),
	PROVIDE_CUISINE_TYPE_ID(1103,"Provide Cuisine type Id"),
	PROVIDE_CUISINE_TYPE_NAME(1104,"Provide Cuisine type"),
	RESTAURANT_CUISINE_TYPE_NOT_AVAILABLE(1105, "Restaurant Cuisine type not available"),
	INVALID_RESTAURANT_CUISINE_TYPE_ID(1106, "Invalid Restaurant Cuisine type"),
	PROVIDE_RESTAURANT_CUISINE_TYPE_ID(1107,"Provide Restaurant Cuisine type Id"),
	
	ATTRIBUTE_NOT_AVAILABLE(1201, "Attributes not available"), 
	INVALID_ATTRIBUTE_ID(1202, "Invalid attribute Id"),
	PROVIDE_ATTRIBUTE_ID(1203,"Provide Attribute Id"),
	PROVIDE_ATTRIBUTE_NAME(1204,"Provide Attribute"),
	
	ITEM_TYPE_NOT_AVAILABLE(1301, "Item type not available"),
	INVALID_ITEM_TYPE_ID(1302, "Item type not available"),
	PROVIDE_ITEM_TYPE_ID(1303,"Provide Item type Id"),
	PROVIDE_ITEM_TYPE(1304,"Provide Item type"),
	
	UNIT_NOT_AVAILABLE(1401, "Unit not available"),
	INVALID_UNIT_ID(1402, "Invalid unit Id"),
	PROVIDE_UNIT(1403,"Provide Unit"),
	PROVIDE_UNIT_ID(1404,"Provide Unit Id"),
	
	PROVIDE_DISH_LIST(14001, "Provide Dish List"),
	PROVIDE_RESTAURANT_DISH_ITEM(14002, "Provide Restaurant Dish Item"),
	INVALID_PROMOTIONAL_CODE(14003, "Invalid Promotional Code"),
	PROMOTIONAL_CODE_EXPIRED(14004, "Promotional Code Expired"),
	PROMOTIONAL_CODE_FOR_FIRST_ORDER(14005, "Promotional Code is only applicable on your first order"),
	PROVIDE_PROMOTIONAL_CODE(14006, "Provide Promotional Code"),
	NO_CART_FOUND(14006, "No cart found"),
	NO_PROMOTED_DISHES(14007, "Promoted dish is not in cart"),
	MIN_PURCHASE_PRICE(14008, "Price is below minimum purchase price"),
	NO_PROMO_CODE_FOUND(14009, "No promo code found"),
	PROMOTIONAL_OFFER_NOT_AVAILABLE(14010, "Promotional offer not available"),
	PROVIDE_MEAL_CATEGORY(14011, "Provide meal category"),
	NO_DISH_FOUND(14012, "No dish found"),
	PROVIDE_DELIVERY_DATE(14013, "Provide delivery date"),
	INVALID_DELIVERY_DATE(14014, "Invalid delivery date"),
	INVALID_MEAL_CATEGORY(14015, "Invalid meal category"),
	DELIVERY_DATE_EXPIRED(14016, "Delivery date expired"),
	INVALID_RESTAURANT_DISH_ITEM_ID(14017, "Invalid restaurant dish item id"),
	ORDER_NOT_FOUND(14018,"Order not found"),
	ADD_TO_CART(14019,""),
	INVALID_RESTAURANT_DISH_ITEM(14020,"Invalid restaurant dish item"),
	PROVIDE_CART_DISH(14021,"Provide cart dish"),
	DISH_NOT_ORDERABLE(14022,"Dish is not orderable"),
	PROVIDE_CART_DETAIL(14023,"Provide cart detail"),
	MULTIPLE_RESTAURANT_NOT_ALLOWED(14024,"Multiple restaurant not allowed in single order"),
	
	INVALID_PROMOTIONAL_OFFER_ID(5007, "Promotional offer ID is invalid"),
	RESTAURANT_DISH_ALREADY_ADDED(5008, "Restaurant dish already added"),
	PROVIDE_CART_DISH_ID(5009, "Provide cart dish id"),
	PROVIDE_DISH_QUANTITY(5010, "Provide dish quantity"),
	INVALID_DISH_QUANTITY(5011, "Invalid dish quantity"),
	INVALID_CART_DISH_ID(5012, "Invalid cart dish id"),
	EMPTY_CART(5013, "Cart is empty"),
	INVALID_PROMOTIONAL_OFFER_CODE(5014, "Promotional offer Code is already running"),
	INVALID_DISH_ID(5015, "Invalid dish id"),
	
	PROMOTIONAL_CODE_NOT_AVAILABLE(15001,"Promotional Offers not available"),
	PROVIDE_DISCOUNTABLE_AMOUNT(15003,"Provide discountable amount"),
	PROVIDE_PERCENTAGE_OR_NOT(15004,"Provide percentage or not"),
	PROVIDE_START_DATE(15005,"Provide start date"),
	PROVIDE_END_DATE(15006,"Provide end date"),
	PROVIDE_VALID_END_DATE(15007,"End date must greater than start date"),
	PROVIDE_MAX_DISCOUNT_VALUE(15008,"End date must greater than start date"),
	PROVIDE_IS_APPLICABLE_ON_CART(15008,"Provide is applicable on cart or not"),
	PROVIDE_MIN_CART_VALUE(15008,"Provide minumum cart value"),
	PROVIDE_IS_FIRST_ORDER_DISCOUNT(15008,"Provide is first order discount or not"),
	PROVIDE_PROMOCODE_APPLICATION(15009,"Provide on which item promo code is applicable"),
	
	PROMOTED_RESTAURANT_NOT_AVAILABLE(15002,"Promoted Restaurant not available"),
	
	NO_DISH_AVAILABLE(16001, "No dish available"),
	
	NO_RESTAURANT_CUISINE_TYPE_FOUNT(17001,"No restaurant cuisine type found"),
	
	PROVIDE_DISH_NAME(18001, "Provide dish name"), 
	PROVIDE_ACTUAL_PRICE(18002, "Provide actual price"),
	PROVIDE_MAX_ALLOW(18003, "Provide max allow"), 
	PROVIDE_DISH_TYPE(18004, "Provide dish type"), 
	PROVIDE_DISH_ACTIVE_STATUS(18005, "Provide dish active status"), 
	PROVIDE_ORDER_BEFORE_HOURS(18006, "Provide order before hours"),
	PROVIDE_SUBSCRIPTION_STATUS(18007, "Provide subscription status"), 
	PROVIDE_IMAGE(18008, "Provide image"), 
	PROVIDE_ICON(18009, "Provide icon"), 
	PROVIDE_DISH_ITEM(18010, "Provide dish item"), 
	PROVIDE_CHEF(18011, "Provide chef"), 
	PROVIDE_CUISINE_TYPE(18012, "Provide cuisine type"), 
	PROVIDE_RESTAURANT(18013, "Provide restaurant"),
	PROVIDE_QUANTITY(18014, "Provide quantity"), 
	PROVIDE_RESTAURANT_ITEM(18015, "Provide restaurant item"),
	PROVIDE_DISH(18016, "Provide Dish"),
	NO_EXTRA_ITEMS_FOUND(18017, "Extra items not available"),
	INVALID_DISCOUNTED_PRICE(18018, "Discounted price must less then or equal to actual price"),
	INVALID_ACTUAL_PRICE(18019, "Invalid actual price"),
	
	
	PROVIDE_ORDER_CODE(19001,"provide Order Code"),
	INVALID_ORDER(19002,"Invalid Order"),
	INVALID_USER_FOR_ORDER(19003,"Invalid user for this Order"),
	ORDER_NOT_AVAILABLE(19004,"Order not available"),
	ORDER_QUERY_NOT_AVAILABLE(19005,"Order query not available"),
	
	PROVIDE_TYPE(20001,"Provide item type Veg/Non-veg"),
	PROVIDE_IS_EXTRA(20002,"Provide is extra"),
	PROVIDE_IS_ACTIVE(20003,"Provide is active"),
	PROVIDE_RESTAURANT_ID(20004,"Provide restaurant id"),
	INVALID_RESTAURANT_ITEM_ATTRIBUTES(20005,"Restaurant item attributes can't be null"),
	PROVIDE_DESCRIPTION(20006,"Provide item description"),
	RESTAURANT_ITEM_NOT_AVAILABLE(20007,"Restaurant Item not available"),
	PROVIDE_RESTAURANT_ITEM_ID(20008,"Provide restaurant item id"),
	NO_REVIEW_RATING_AVAILABLE(20009,"No review/rating available for the requested restaurant"),
	EITHER_CODE_OR_ID(20010,"Please provide either restaurant code or dish id"),
	
	NO_DATE_AVAILABLE(30001, "No date available"),
	PROVIDE_RESTAURANT_DISH_DATE_ID(30002, "Provide restaurant dish date Id"),
	PROVIDE_RESTAURANT_MEAL_CATEGOTY(30003, "Provide restaurant meal category"), 
	INVALID_RESTAURANT_DISH_DATE_ID(30004, "Invalid restaurant dish date id"), 
	NO_DAYS_AVAILABLE(30005, "No days available"), 
	PROVIDE_RESTAURANT_DISH_DAY_ID(30006, "Provide restaurant dish day Id"),
	INVALID_RESTAURANT_DISH_DAY_ID(30007, "Invalid restaurant dish day id"), 
	PROVIDE_DAY(30008, "Provide day"), 
	NO_DATA_FOUND(30009, "No data found"), 
	PROVIDE_RESTAURANT_DISH_DAY_LIST(30010, "Provide restaurant dish day list"), 
	PROVIDE_RESTAURANT_DISH_DATE_LIST(30011, "Provide restaurant dish date list"),
	INVALID_RESTAURANT_DISH_OFFER_SCHEDULER_ID(30012, "Invalid restaurant dish offer scheduler id"),
	PROVIDE_RESTAURANT_DISH_OFFER_SCHEDULER_ID(30013, "Provide restaurant dish offer scheduler Id"),
	DATE_ALREADY_ADDED(30014, "Date already exists"),
	
	PROVIDE_RESTAURANT_HOLIDAY_ID(40001, "provide restaurant holiday Id"),
	
	INVALID_ORDER_CODE(50001, "Invalid order code"), 
	PROVIDE_ORDER_ID(50002, "Provide order id"),
	PROVIDE_ORDER_QUERY_ID(50003, "Provide order query id"),
	PROVIDE_ORDER_QUERY_STATUS(50004, "Provide order query status"),
	INVALID_ORDER_ID(50005, "Invalid order id"),
	PROVIDE_DISH_ORDER_STATUS(50006, "Provide dish order status"),
	PROVIDE_DISH_ID(50007, "Provide dish id"),
	
	INVALID_PROMOTED_RESTAURANT_ID(6007, "Promoted restaurant id is invalid"),
	UNAUTHORIZED(6008, "Unauthorized"),
	
	ORDERABLE_DISH_NOT_FOUND(60001, "No orderable dish found"),
	
	NO_AUDIT_FOUND(70001, "No audit found"),
	SAME_DELIVERY_CHARGE(70002, "No change in delivery charge");
	
	
	private final int faultCode;
	private final String faultType;
	private String faultMessage;
	
	FaultEnum(int faultCode, String defaultMessage) {
		this.faultType = "APPLICATION";
		this.faultCode = faultCode;
		this.faultMessage = defaultMessage;
	}
	
	FaultEnum(String faultType, int faultCode, String defaultMessage) {
		this.faultType = faultType;
		this.faultCode = faultCode;
		this.faultMessage = defaultMessage;
	}
	
	public int getFaultCode() {
		return faultCode;
	}
	public String getFaultType() {
		return faultType;
	}
	public String getFaultMessage() {
		return faultMessage;
	}

}
