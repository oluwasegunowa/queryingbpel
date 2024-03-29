/**
 * 
 */
package de.uni.stuttgart.bpelSearching.GraphMapping.nodes;

/**
 * This class represents Receive Activity Node.
 * @author luwei
 *
 */
public class ActivityReceiveNode extends ActivityNode {
	
	private String partnerLink;
	private String portType;
	private String operation;
	private String variable;
	
	/**
	 * @param activityID
	 * @param activityName
	 * @param activityType
	 * @param containerId
	 */
	public ActivityReceiveNode(String activityID, String activityName,
			int activityType, String containerId) {
		super(activityID, activityName, activityType, containerId);
		// TODO Auto-generated constructor stub
		this.partnerLink = "";
		this.portType = "";
		this.operation = "";
		this.variable = "";
	}


	/**
	 * @param activityID
	 * @param activityName
	 * @param activityType
	 */
	public ActivityReceiveNode(String activityID, String activityName,
			int activityType) {
		super(activityID, activityName, activityType);
		// TODO Auto-generated constructor stub
		this.partnerLink = "";
		this.portType = "";
		this.operation = "";
		this.variable = "";
	}

	/**
	 * Creates a new receive node and assign values to the corresponding attributes of receive activity.
	 * 
	 * @param activityID
	 * @param activityName
	 * @param activityType
	 * @param containerId
	 * @param partnerLink
	 * @param portType
	 * @param operation
	 * @param variable
	 */
	public ActivityReceiveNode(String activityID, String activityName,
			int activityType, String containerId, String partnerLink, 
			String portType, String operation, String variable) {
		super(activityID, activityName, activityType, containerId);
		this.partnerLink = partnerLink;
		this.portType = portType;
		this.operation = operation;
		this.variable = variable;
	}
	
	
	public String getPartnerLink() {
		return partnerLink;
	}
	public void setPartnerLink(String partnerLink) {
		this.partnerLink = partnerLink;
	}
	public String getPortType() {
		return portType;
	}
	public void setPortType(String portType) {
		this.portType = portType;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public String getVariable() {
		return variable;
	}
	public void setVariable(String variable) {
		this.variable = variable;
	}

}
