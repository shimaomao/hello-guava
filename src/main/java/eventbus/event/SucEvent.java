package eventbus.event;
/***成功事件 
 ** @Author JosonLiu
 ** @Date 2016年9月7日
 ** @Version 1.0
 **/
public class SucEvent {
	private Integer code ;
	private String value ;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}

