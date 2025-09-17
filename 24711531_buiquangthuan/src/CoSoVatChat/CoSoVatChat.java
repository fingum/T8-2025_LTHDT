package CoSoVatChat;

abstract class CoSoVatChat {
	protected String ma;
	protected ChatLieu chatLieu;
	public enum ChatLieu{
		 GO, 
		 NHUA, 
		 KIMLOAI
	}
	protected KichCo kichCo;
	public enum KichCo{
		NHO,
		VUA,
		LON
	}
	protected int soChan;

	public CoSoVatChat(String ma, ChatLieu chatLieu, KichCo kichCo, int soChan) {
		this.ma = ma;
		this.chatLieu = chatLieu;
		this.kichCo = kichCo;
		this.soChan = soChan;
	}

	abstract double canNang();
	
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		if(ma == null || ma.isEmpty()) {
			throw new IllegalArgumentException("Ma khong hop le !");
		}
		this.ma = ma;
	}
	public ChatLieu getChatlieu() {
		return chatLieu;
	}
	public void setChatlieu(ChatLieu chatlieu) {
		this.chatLieu = chatlieu;
	}
	public KichCo getKichCo() {
		return kichCo;
	}
	public void setKichCo(KichCo kichCo) {
		if (!(kichCo instanceof KichCo)) {
			throw new IllegalArgumentException("Kich co hong hop le !");
		}
		this.kichCo = kichCo;
	}
	public int getSoChan() {
		return soChan;
	}
	public void setSoChan(int soChan) {
		this.soChan = soChan;
	}
	
}