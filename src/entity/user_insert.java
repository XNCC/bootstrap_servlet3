package entity;

import java.util.Date;

public class user_insert {

	private String projectno;// ��Ŀ����
	private String projectname;// ��Ŀ����
	private String hostid;// �����˵绰/////////////////////////////////
	private String hostname;// ������
	private String ktjbdm; // ���⼶��
	private String ktsxdm;// ��������
	private String ktlbdm;// �������
	private String ktfxdm;// ���ⷽ��
	private String xkfldm;// ѧ�Ʒ���
	private String jtfsdm; // ���ⷽʽ
	private String sbdwdm;// �걨��λ
	private String jflydm; // ������Դ
	private String bftjdm; // ����;��
	private Date pzsj;// ��׼ʱ��
	private Date wcsj; // �о�����
	private String menber1;// ������1
	private String menber2;
	private String menber3;
	private String menber4;
	private String menber5;
	private int sftj;// �Ƿ��ύ ����������ʱ�� �����ݱ��浽���ݿ⣬��ѯʱ����ʾ
	private int sflx;// �Ƿ�����
	private int zjf;

	public int getZjf() {
		return zjf;
	}

	public void setZjf(int zjf) {
		this.zjf = zjf;
	}

	public String getProjectno() {
		return projectno;
	}

	public void setProjectno(String projectno) {
		this.projectno = projectno;
	}

	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public String getHostid() {
		return hostid;
	}

	public void setHostid(String hostid) {
		this.hostid = hostid;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getKtjbdm() {
		return ktjbdm;
	}

	public void setKtjbdm(String ktjbdm) {
		this.ktjbdm = ktjbdm;
	}

	public String getKtsxdm() {
		return ktsxdm;
	}

	public void setKtsxdm(String ktsxdm) {
		this.ktsxdm = ktsxdm;
	}

	public String getKtlbdm() {
		return ktlbdm;
	}

	public void setKtlbdm(String ktlbdm) {
		this.ktlbdm = ktlbdm;
	}

	public String getKtfxdm() {
		return ktfxdm;
	}

	public void setKtfxdm(String ktfxdm) {
		this.ktfxdm = ktfxdm;
	}

	public String getXkfldm() {
		return xkfldm;
	}

	public void setXkfldm(String xkfldm) {
		this.xkfldm = xkfldm;
	}

	public String getJtfsdm() {
		return jtfsdm;
	}

	public void setJtfsdm(String jtfsdm) {
		this.jtfsdm = jtfsdm;
	}

	public String getSbdwdm() {
		return sbdwdm;
	}

	public void setSbdwdm(String sbdwdm) {
		this.sbdwdm = sbdwdm;
	}

	public String getJflydm() {
		return jflydm;
	}

	public void setJflydm(String jflydm) {
		this.jflydm = jflydm;
	}

	public String getBftjdm() {
		return bftjdm;
	}

	public void setBftjdm(String bftjdm) {
		this.bftjdm = bftjdm;
	}

	public Date getPzsj() {
		return pzsj;
	}

	public void setPzsj(Date pzsj) {
		this.pzsj = pzsj;
	}

	public Date getWcsj() {
		return wcsj;
	}

	public void setWcsj(Date wcsj) {
		this.wcsj = wcsj;
	}

	public String getMenber1() {
		return menber1;
	}

	public void setMenber1(String menber1) {
		this.menber1 = menber1;
	}

	public String getMenber2() {
		return menber2;
	}

	public void setMenber2(String menber2) {
		this.menber2 = menber2;
	}

	public String getMenber3() {
		return menber3;
	}

	public void setMenber3(String menber3) {
		this.menber3 = menber3;
	}

	public String getMenber4() {
		return menber4;
	}

	public void setMenber4(String menber4) {
		this.menber4 = menber4;
	}

	public String getMenber5() {
		return menber5;
	}

	public void setMenber5(String menber5) {
		this.menber5 = menber5;
	}

	public int getSftj() {
		return sftj;
	}

	public void setSftj(int sftj) {
		this.sftj = sftj;
	}

	public int getSflx() {
		return sflx;
	}

	public void setSflx(int sflx) {
		this.sflx = sflx;
	}

	@Override
	public String toString() {
		return "" + projectno + ", " + projectname + ", " + hostid + ", " + hostname + ", " + ktjbdm + ", " + ktsxdm
				+ ", " + ktlbdm + ", " + ktfxdm + ", " + xkfldm + ", " + jtfsdm + ", " + sbdwdm + ", " + jflydm + ","
				+ bftjdm + "," + pzsj + ", " + wcsj + ", " + menber1 + ", " + menber2 + "," + menber3 + ", " + menber4
				+ ", " + menber5 + ", " + sftj + "," + sflx + ", " + zjf + "?";
	}

}
