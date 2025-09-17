package CoSoVatChat;

class Ghe extends CoSoVatChat{
	private boolean coTuaGhe;

	public Ghe(String ma, KichCo kichCo, ChatLieu chatLieu, int soChan, boolean coTuaGhe) {
		super(ma, chatLieu,kichCo, soChan);
		this.coTuaGhe = coTuaGhe;
	}
	@Override
	public double canNang() {
		double nangNangCuaTuaGhe = coTuaGhe ? 20 : 0;
		return soChan*10 + nangNangCuaTuaGhe;
	}
	public boolean isCoTuGhe() {
		return coTuaGhe;
	}

	public void setCoTuGhe(boolean coTuGhe) {
		this.coTuaGhe = coTuGhe;
	}
	
	
	

}