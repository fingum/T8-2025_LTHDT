package CoSoVatChat;

class Ban extends CoSoVatChat {
	private double doRong;
	private double doDai;
	public Ban(String ma, ChatLieu chatLieu,KichCo kichCo, int soChan, double doRong, double doDai) {
		super(ma, chatLieu, kichCo, soChan);	
		this.doRong = doRong;
		this.doDai = doDai;
	}
	public double getDoRong() {
		return doRong;
	}
	public void setDoRong(double doRong) {
		this.doRong = doRong;
	}
	public double getDoDai() {
		return doDai;
	}
	public void setDoDai(double doDai) {
		this.doDai = doDai;
	}
	public void in() {
		System.out.println(doDai);
	}
	@Override
	public double canNang(){
		return soChan*10 + doRong*doDai*10;
	}
	

}