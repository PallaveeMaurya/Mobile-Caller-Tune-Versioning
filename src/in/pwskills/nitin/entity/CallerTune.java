package in.pwskills.nitin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="CALLERTUNE")
public class CallerTune {
	
	@Id
	@Column(name="ID")
	private Integer callerTuneId;
	
	@Column(name="CLRTUNE")
	private String callerTune;
	
	@Column(name="PROVIDER")
	private String provider;
	
	@Column(name="MOBNUM")
	private Long mobileNo;
	
	@Version
	@Column(name="COUNT")
	private Integer versionCount;

	public Integer getCallerTuneId() {
		return callerTuneId;
	}

	public void setCallerTuneId(Integer callerTuneId) {
		this.callerTuneId = callerTuneId;
	}

	public String getCallerTune() {
		return callerTune;
	}

	public void setCallerTune(String callerTune) {
		this.callerTune = callerTune;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Integer getVersionCount() {
		return versionCount;
	}

	public void setVersionCount(Integer versionCount) {
		this.versionCount = versionCount;
	}

	@Override
	public String toString() {
		return "CallerTune [callerTuneId=" + callerTuneId + ", callerTune=" + callerTune + ", provider=" + provider
				+ ", mobileNo=" + mobileNo + ", versionCount=" + versionCount + "]";
	}
	
	

}
