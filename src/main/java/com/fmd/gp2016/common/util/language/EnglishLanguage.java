/**
 * @author  Neama Fouad
 * Created On : Nov 30, 2015 11:27:58 AM
 */
package com.fmd.gp2016.common.util.language;

import javax.faces.bean.ApplicationScoped;

/**
 * @author mohamed265
 * @author Neama Fouad
 * @autor Amany Mohamed
 */

@ApplicationScoped
public class EnglishLanguage implements Language {

	private String SIGNUP_PAGE_NAME = "Registration Page";
	private String SIGNIN_PAGE_NAME = "Login Page";
	private String USER_DEVICES_PAGE_NAME = "Devices Page";
	private String UPDATE_PROFILE_PAGE_NAME = "Profile Page";
	private String DOWNLOAD_PAGE_NAME = "Downloads Page";

	private String DOWNLOAD_LINK = "Download link";
	private String OUTPUTTEXT_NAME = "Name";
	private String PLACEHOLDER_NAME = "Enter your Name ";
	private String OUTPUTTEXT_MOBILE = "Mobile Number";
	private String PLACEHOLDER_MOBILE = "Enter Your Mobile Number";
	private String OUTPUTTEXT_EMAIL = "Email ";
	private String PLACEHOLDER_EMAIL = "Enter your Email";
	private String OUTPUTTEXT_USERNAME = "Username ";
	private String PLACEHOLDER_USERNAME = "Enter your username";
	private String OUTPUTTEXT_PASSWORD = "Password ";
	private String PLACEHOLDER_PASSWORD = "Enter your password";
	private String OUTPUTTEXT_CONFIRMPASSWORD = "Confirm Password ";
	private String PLACEHOLDER_CONFIRMPASSWORD = "Confirm password";
	private String SUCCESSFUL_MESSAGE = "Successful operation";
	private String ERROR_MESSAGE = "Error in this operation";
	private String ERROR_PASSWORD_MATCHING = "Please make sure that the two passwords matches each other";
	private String ERROR_UNIQUE_USERNAME = "Please change username because it is related to another user";
	private String ERROR_UNIQUE_EMAIL = "Please change email because it is related to another user";
	private String ERROR_UNIQUE_PHONE = "Please change mobile number because it is related to another user";
	private String ERROR_SIGNUP = "There is an error in registeration process";
	private String ERROR_LOGIN = "There is an error in login process";
	private String EMPTY_DEVICES = "There is no devices";
	private String ALL_DEVICES = "All your devices";
	private String DEVICE_CONTROL = "Control";
	private String DEVICE_DELETE = "Delete";
	private String UPDATE_PROFILE_VALUE = "Edit Profile";

	private String MODEL_HEADER = "operation for device";
	private String DEVICE_PASSWORD = "Enter the password of these device";
	private String dir = "ltr";

	private String DEVICE_NAME = "Device Name";
	private String DEVICE_LASTACTIVEDATE = "Last Active Date";
	private String DEVICE_TYPE = "Device Type";
	private String DEVICE_OPERATINS = "Operations on Device";
	
	private String deviceSettingPage="Device Setting";

	@Override
	public String getDOWNLOAD_PAGE_NAME() {
		return DOWNLOAD_PAGE_NAME;
	}

	@Override
	public String getDOWNLOAD_LINK() {
		return DOWNLOAD_LINK;
	}

	@Override
	public String getDEVICE_NAME() {
		return DEVICE_NAME;
	}

	@Override
	public String getDEVICE_LASTACTIVEDATE() {
		return DEVICE_LASTACTIVEDATE;
	}

	@Override
	public String getDEVICE_TYPE() {
		return DEVICE_TYPE;
	}

	@Override
	public String getDEVICE_OPERATINS() {
		return DEVICE_OPERATINS;
	}

	@Override
	public String getUPDATE_PROFILE_PAGE_NAME() {
		return UPDATE_PROFILE_PAGE_NAME;
	}

	@Override
	public String getDEVICE_CONTROL() {
		return DEVICE_CONTROL;
	}

	@Override
	public String getDEVICE_DELETE() {
		return DEVICE_DELETE;
	}

	@Override
	public String getEMPTY_DEVICES() {
		return EMPTY_DEVICES;
	}

	@Override
	public String getALL_DEVICES() {
		return ALL_DEVICES;
	}

	@Override
	public String getSIGNIN_PAGE_NAME() {
		return SIGNIN_PAGE_NAME;
	}

	@Override
	public String getUSER_DEVICES_PAGE_NAME() {
		return USER_DEVICES_PAGE_NAME;
	}

	@Override
	public String getERROR_MESSAGE() {
		return ERROR_MESSAGE;
	}

	@Override
	public String getSUCCESSFUL_MESSAGE() {
		return SUCCESSFUL_MESSAGE;
	}

	@Override
	public String getERROR_SIGNUP() {
		return ERROR_SIGNUP;
	}

	@Override
	public String getERROR_LOGIN() {
		return ERROR_LOGIN;
	}

	@Override
	public String getERROR_UNIQUE_EMAIL() {
		return ERROR_UNIQUE_EMAIL;
	}

	@Override
	public String getERROR_UNIQUE_USERNAME() {
		return ERROR_UNIQUE_USERNAME;
	}

	@Override
	public String getERROR_PASSWORD_MATCHING() {
		return ERROR_PASSWORD_MATCHING;
	}

	@Override
	public String getOUTPUTTEXT_NAME() {
		return OUTPUTTEXT_NAME;
	}

	public String getPLACEHOLDER_NAME() {
		return PLACEHOLDER_NAME;
	}

	@Override
	public String getSIGNUP_PAGE_NAME() {
		return SIGNUP_PAGE_NAME;
	}

	@Override
	public String getOUTPUTTEXT_MOBILE() {
		return OUTPUTTEXT_MOBILE;
	}

	@Override
	public String getPLACEHOLDER_MOBILE() {
		return PLACEHOLDER_MOBILE;
	}

	@Override
	public String getOUTPUTTEXT_EMAIL() {
		return OUTPUTTEXT_EMAIL;
	}

	@Override
	public String getPLACEHOLDER_EMAIL() {
		return PLACEHOLDER_EMAIL;
	}

	@Override
	public String getOUTPUTTEXT_USERNAME() {
		return OUTPUTTEXT_USERNAME;
	}

	@Override
	public String getPLACEHOLDER_USERNAME() {
		return PLACEHOLDER_USERNAME;
	}

	@Override
	public String getOUTPUTTEXT_PASSWORD() {
		return OUTPUTTEXT_PASSWORD;
	}

	@Override
	public String getERROR_UNIQUE_PHONE() {
		return ERROR_UNIQUE_PHONE;
	}

	@Override
	public String getPLACEHOLDER_PASSWORD() {
		return PLACEHOLDER_PASSWORD;
	}

	@Override
	public String getOUTPUTTEXT_CONFIRMPASSWORD() {
		return OUTPUTTEXT_CONFIRMPASSWORD;
	}

	@Override
	public String getPLACEHOLDER_CONFIRMPASSWORD() {
		return PLACEHOLDER_CONFIRMPASSWORD;
	}

	@Override
	public String getDir() {
		return dir;
	}

	@Override
	public String getArabicLanguageName() {

		return "Arabic";
	}

	@Override
	public String getEnglishLanguageName() {

		return "English";
	}

	@Override
	public String getSignupName() {

		return "Sign up";
	}

	@Override
	public String getLoginLink() {

		return "Already have an account";
	}

	@Override
	public String getSignLink() {

		return "New User ?";
	}

	@Override
	public String getLoginName() {

		return "Login";
	}

	@Override
	public String getUPDATE_PROFILE_VALUE() {
		return UPDATE_PROFILE_VALUE;
	}

	@Override
	public String getDEVICE_PASSWORD() {
		return DEVICE_PASSWORD;
	}

	@Override
	public String getMODEL_HEADER() {
		return MODEL_HEADER;
	}


	@Override
	public String getDeviceSettingPage() {

		return deviceSettingPage;
	}


	@Override
	public String getDeviceDetails() {
		return "Device Details";
	}

	
	@Override
	public String getChangeDevicePassword() {
		return "Change Device Password";
	}


	@Override
	public String getChangeDeviceName() {
		return "Change Device Name";
	}

	@Override
	public String getHomePageName() {
		return "Home";
	}


	@Override
	public String getprofileName() {
		return "Profile";
	}

	/* (non-Javadoc)
	 * @see com.fmd.gp2016.common.util.language.Language#getDownloadName()
	 */
	@Override
	public String getDownloadName() {
		// TODO Auto-generated method stub
		return "Downloads";
	}

	/* (non-Javadoc)
	 * @see com.fmd.gp2016.common.util.language.Language#getUserManualName()
	 */
	@Override
	public String getUserManualName() {
		// TODO Auto-generated method stub
		return "User Manual";
	}

	/* (non-Javadoc)
	 * @see com.fmd.gp2016.common.util.language.Language#getAboutUsName()
	 */
	@Override
	public String getAboutUsName() {
		// TODO Auto-generated method stub
		return "About Us";
	}

	/* (non-Javadoc)
	 * @see com.fmd.gp2016.common.util.language.Language#getlogOutName()
	 */
	@Override
	public String getlogOutName() {
		return "logout";
	}

}
