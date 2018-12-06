package br.com.udemy.entities.enuns;

public enum OrderStatus {
    PENDING_PAYMENT,
    PROCESSING,
    SHIPPED,
    DELIVERED;
	/*
	public static OrderStatus getInstance(String status) {

	       for (OrderStatus os : OrderStatus.values()) {
	           if (os.getStatus().equalsIgnoreCase(status) || enumSituacao.name().equalsIgnoreCase(codigo)) {
	               return enumSituacao;
	           }
	       }

	       return null;
	   }	*/
}
