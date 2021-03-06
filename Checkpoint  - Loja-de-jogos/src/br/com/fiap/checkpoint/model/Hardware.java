package br.com.fiap.checkpoint.model;

public class Hardware extends Produtos {

	// Atributos
	private String drive;
	private String memoriaRam;
	private String placaMae;
	private String processador;
	private String ssd;

	// Construtor
	public Hardware(String nome, int quantidade, int estoque, int entrega, String drive, String memoriaRam,
			String placaMae, String processador, String ssd) {
		super(nome, quantidade, estoque, entrega);
		this.drive = drive;
		this.memoriaRam = memoriaRam;
		this.placaMae = placaMae;
		this.processador = processador;
		this.ssd = ssd;
	}

	// Getters and Setters
	public String getDrive() {
		return drive;
	}

	public void setDrive(String drive) {
		this.drive = drive;
	}

	public String getMemoriaRam() {
		return memoriaRam;
	}

	public void setMemoriaRam(String memoriaRam) {
		this.memoriaRam = memoriaRam;
	}

	public String getPlacaMae() {
		return placaMae;
	}

	public void setPlacaMae(String placaMae) {
		this.placaMae = placaMae;
	}

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

	public String getSsd() {
		return ssd;
	}

	public void setSsd(String ssd) {
		this.ssd = ssd;
	}

}
