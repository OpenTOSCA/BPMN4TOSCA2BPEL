package org.eclipse.winery.bpmn2bpel.planwriter;

public interface TemplateDefaultValues {

public static final String PLAN_NAMESPACE = "http://iaas.uni-stuttgart.de/bpmn4tosca";

	public static final String PLAN_NAME = "ManagementPlan";

	public static final String PLAN_WSDL_NAME = "managementplan.wsdl";

	public static final String PLT_CLIENT_NAME = "tns:PLT_ManagementPlan";

	public static final String PL_CLIENT_NAME = "client";

	public static final String PL_CLIENT_MY_ROLE = "PlanProvider";

	public static final String PL_CLIENT_PARTNER_ROLE = "PlanRequester";

	public static final String PLAN_INPUT_VAR_MSG_TYPE = "tns:PlanRequestMessage";

	public static final String PLAN_INPUT_VAR_NAME = "input";

	public static final String PLAN_INIT_RCV_NAME = "initiatePlan";

	public static final String PLAN_INIT_RCV_OPERATION = "initiate";

	public static final String PLAN_INIT_RCV_PORT_TYPE = "tns:ManagementPlanPT";

	public static final String PLAN_OUTPUT_VAR_NAME = "output";

	public static final String PLAN_OUTPUT_VAR_MSG_TYPE = "tns:PlanResponseMessage";

	public static final String PLAN_END_INV_NAME = "callbackClient";

	public static final String PLAN_END_INV_OPERATION = "onResult";

	public static final String PLAN_END_INV_PORT_TYPE = "tns:ManagementPlanCallbackPT";

	public static final String SERVICE_INVOKER_WSDL = "service_invoker.wsdl";

	public static final String SERVICE_INVOKER_XSD = "service_invoker.xsd";



}
