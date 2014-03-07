package edu.sjsu.cmpe282.domain;

public class ProductInfo {

	private int prodInfoId;
	private String max_horizontal_resolution;
	private String memory_technology;
	private String installed_memory;
	private String processor_speed;
	private String processor;
	private String manufacturer;
	private String infrared;
	private String bluetooth;
	private String docking_station;
	private String port_replicator;
	private String fingerprint;
	private String subwoofer;
	private String external_battery;
	private String cdma;
	private String operating_system;
	private int warranty_days;
	private double price;
	
	public ProductInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getProdInfoId() {
		return prodInfoId;
	}

	public void setProdInfoId(int prodInfoId) {
		this.prodInfoId = prodInfoId;
	}

	public String getMax_horizontal_resolution() {
		return max_horizontal_resolution;
	}

	public void setMax_horizontal_resolution(String max_horizontal_resolution) {
		this.max_horizontal_resolution = max_horizontal_resolution;
	}

	public String getMemory_technology() {
		return memory_technology;
	}

	public void setMemory_technology(String memory_technology) {
		this.memory_technology = memory_technology;
	}

	public String getInstalled_memory() {
		return installed_memory;
	}

	public void setInstalled_memory(String installed_memory) {
		this.installed_memory = installed_memory;
	}

	public String getProcessor_speed() {
		return processor_speed;
	}

	public void setProcessor_speed(String processor_speed) {
		this.processor_speed = processor_speed;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getInfrared() {
		return infrared;
	}

	public void setInfrared(String infrared) {
		this.infrared = infrared;
	}

	public String getBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(String bluetooth) {
		this.bluetooth = bluetooth;
	}

	public String getDocking_station() {
		return docking_station;
	}

	public void setDocking_station(String docking_station) {
		this.docking_station = docking_station;
	}

	public String getPort_replicator() {
		return port_replicator;
	}

	public void setPort_replicator(String port_replicator) {
		this.port_replicator = port_replicator;
	}

	public String getFingerprint() {
		return fingerprint;
	}

	public void setFingerprint(String fingerprint) {
		this.fingerprint = fingerprint;
	}

	public String getSubwoofer() {
		return subwoofer;
	}

	public void setSubwoofer(String subwoofer) {
		this.subwoofer = subwoofer;
	}

	public String getExternal_battery() {
		return external_battery;
	}

	public void setExternal_battery(String external_battery) {
		this.external_battery = external_battery;
	}

	public String getCdma() {
		return cdma;
	}

	public void setCdma(String cdma) {
		this.cdma = cdma;
	}

	public String getOperating_system() {
		return operating_system;
	}

	public void setOperating_system(String operating_system) {
		this.operating_system = operating_system;
	}

	public int getWarranty_days() {
		return warranty_days;
	}

	public void setWarranty_days(int warranty_days) {
		this.warranty_days = warranty_days;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductInfo [prodInfoId=" + prodInfoId
				+ ", max_horizontal_resolution=" + max_horizontal_resolution
				+ ", memory_technology=" + memory_technology
				+ ", installed_memory=" + installed_memory
				+ ", processor_speed=" + processor_speed + ", processor="
				+ processor + ", manufacturer=" + manufacturer + ", infrared="
				+ infrared + ", bluetooth=" + bluetooth + ", docking_station="
				+ docking_station + ", port_replicator=" + port_replicator
				+ ", fingerprint=" + fingerprint + ", subwoofer=" + subwoofer
				+ ", external_battery=" + external_battery + ", cdma=" + cdma
				+ ", operating_system=" + operating_system + ", warranty_days="
				+ warranty_days + ", price=" + price + "]";
	}
	
	

}
