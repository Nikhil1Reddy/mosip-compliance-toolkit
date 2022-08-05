package io.mosip.compliance.toolkit.dto.testcases;

import java.io.Serializable;
import java.util.ArrayList;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class TestCaseDto implements Serializable {
	private static final long serialVersionUID = -679461384553195804L;

	public String testCaseType;
    public String testId;
    public String specVersion;
    public String testName;
    public String testDescription;
    public int testOrderSequence;
    public String methodName;
    public Object requestSchema;
    public String responseSchema;
    public ArrayList<ValidatorDef> validatorDefs;
    public OtherAttributes otherAttributes;
    
    @Getter
    @Setter
    public static class ValidatorDef{
        public String name;
        public String description;
    }

    @Getter
    @Setter
    public static class OtherAttributes{
        public Object runtimeInput;
        public ArrayList<Object> purpose;
        public ArrayList<Object> biometricTypes;
        public ArrayList<Object> deviceSubTypes;
        public ArrayList<Object> segments;
        public ArrayList<Object> exceptions;
        public Object requestedScore;
        public String bioCount;
        public String deviceSubId;
        public ArrayList<String> modalities;
    }
}
