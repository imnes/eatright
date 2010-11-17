package com.eatrightapp.admin.client.ui;
 
import com.google.gwt.core.client.GWT;
import com.google.gwt.requestfactory.ui.client.LoginWidget;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class UserAccountsViewImpl extends Composite implements UserAccountsView {
	
	private static UserAccountsViewImplUiBinder uiBinder = GWT.create(UserAccountsViewImplUiBinder.class);
	
	private Presenter presenter;
	
	@UiField LoginWidget loginWidget;
	
	@UiTemplate("UserAccountsViewImpl.ui.xml")
	interface UserAccountsViewImplUiBinder extends UiBinder<Widget, UserAccountsViewImpl> {
	}
	
	public UserAccountsViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }
		
	public LoginWidget getLoginWidget() {
	    return loginWidget;
	}
	
}
