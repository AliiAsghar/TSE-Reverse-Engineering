package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IGoogleAccountDataService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IGoogleAccountDataService {
        static final int TRANSACTION_checkAccountName = 2;
        static final int TRANSACTION_checkFrpCompliance = 27;
        static final int TRANSACTION_checkPassword = 3;
        static final int TRANSACTION_checkRealName = 4;
        static final int TRANSACTION_clearFactoryResetChallenges = 29;
        static final int TRANSACTION_clearFre = 44;
        static final int TRANSACTION_clearToken = 19;
        static final int TRANSACTION_clearWorkAccountAppWhitelist = 35;
        static final int TRANSACTION_confirmCredentials = 10;
        static final int TRANSACTION_createAccount = 5;
        static final int TRANSACTION_createPlusProfile = 7;
        static final int TRANSACTION_getAccountChangeEvents = 23;
        static final int TRANSACTION_getAccountData = 1;
        static final int TRANSACTION_getAccountExportData = 16;
        static final int TRANSACTION_getAccountId = 25;
        static final int TRANSACTION_getAccountVisibilityRestriction = 42;
        static final int TRANSACTION_getAndAdvanceOtpCounter = 37;
        static final int TRANSACTION_getDeviceManagementInfo = 40;
        static final int TRANSACTION_getGoogleAccountData = 30;
        static final int TRANSACTION_getGoogleAccountId = 31;
        static final int TRANSACTION_getGplusInfo = 6;
        static final int TRANSACTION_getOtp = 24;
        static final int TRANSACTION_getToken = 8;
        static final int TRANSACTION_getTokenHandle = 38;
        static final int TRANSACTION_getWebSetupConfig = 18;
        static final int TRANSACTION_installAccountFromExportData = 17;
        static final int TRANSACTION_isTokenHandleValid = 39;
        static final int TRANSACTION_removeAccount = 20;
        static final int TRANSACTION_setAccountVisibilityRestriction = 41;
        static final int TRANSACTION_setFreUnlocked = 43;
        static final int TRANSACTION_setWorkAccountAppWhitelistFingerprint = 34;
        static final int TRANSACTION_signIn = 9;
        static final int TRANSACTION_updateCredentials = 11;
        static final int TRANSACTION_validateAccountCredentials = 36;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IGoogleAccountDataService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService");
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public AccountNameCheckResponse checkAccountName(AccountNameCheckRequest accountNameCheckRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, accountNameCheckRequest);
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
                AccountNameCheckResponse accountNameCheckResponse = (AccountNameCheckResponse) iax.a(transactAndReadException, AccountNameCheckResponse.CREATOR);
                transactAndReadException.recycle();
                return accountNameCheckResponse;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public CheckFactoryResetPolicyComplianceResponse checkFrpCompliance(CheckFactoryResetPolicyComplianceRequest checkFactoryResetPolicyComplianceRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, checkFactoryResetPolicyComplianceRequest);
                Parcel transactAndReadException = transactAndReadException(27, obtainAndWriteInterfaceToken);
                CheckFactoryResetPolicyComplianceResponse checkFactoryResetPolicyComplianceResponse = (CheckFactoryResetPolicyComplianceResponse) iax.a(transactAndReadException, CheckFactoryResetPolicyComplianceResponse.CREATOR);
                transactAndReadException.recycle();
                return checkFactoryResetPolicyComplianceResponse;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public PasswordCheckResponse checkPassword(PasswordCheckRequest passwordCheckRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, passwordCheckRequest);
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
                PasswordCheckResponse passwordCheckResponse = (PasswordCheckResponse) iax.a(transactAndReadException, PasswordCheckResponse.CREATOR);
                transactAndReadException.recycle();
                return passwordCheckResponse;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public CheckRealNameResponse checkRealName(CheckRealNameRequest checkRealNameRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, checkRealNameRequest);
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
                CheckRealNameResponse checkRealNameResponse = (CheckRealNameResponse) iax.a(transactAndReadException, CheckRealNameResponse.CREATOR);
                transactAndReadException.recycle();
                return checkRealNameResponse;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public void clearFactoryResetChallenges() {
                transactAndReadExceptionReturnVoid(29, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public void clearFre() {
                transactAndReadExceptionReturnVoid(44, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public ClearTokenResponse clearToken(ClearTokenRequest clearTokenRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, clearTokenRequest);
                Parcel transactAndReadException = transactAndReadException(19, obtainAndWriteInterfaceToken);
                ClearTokenResponse clearTokenResponse = (ClearTokenResponse) iax.a(transactAndReadException, ClearTokenResponse.CREATOR);
                transactAndReadException.recycle();
                return clearTokenResponse;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public boolean clearWorkAccountAppWhitelist() {
                Parcel transactAndReadException = transactAndReadException(35, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public TokenResponse confirmCredentials(ConfirmCredentialsRequest confirmCredentialsRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, confirmCredentialsRequest);
                Parcel transactAndReadException = transactAndReadException(10, obtainAndWriteInterfaceToken);
                TokenResponse tokenResponse = (TokenResponse) iax.a(transactAndReadException, TokenResponse.CREATOR);
                transactAndReadException.recycle();
                return tokenResponse;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public TokenResponse createAccount(GoogleAccountSetupRequest googleAccountSetupRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, googleAccountSetupRequest);
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken);
                TokenResponse tokenResponse = (TokenResponse) iax.a(transactAndReadException, TokenResponse.CREATOR);
                transactAndReadException.recycle();
                return tokenResponse;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public TokenResponse createPlusProfile(GoogleAccountSetupRequest googleAccountSetupRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, googleAccountSetupRequest);
                Parcel transactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken);
                TokenResponse tokenResponse = (TokenResponse) iax.a(transactAndReadException, TokenResponse.CREATOR);
                transactAndReadException.recycle();
                return tokenResponse;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public AccountChangeEventsResponse getAccountChangeEvents(AccountChangeEventsRequest accountChangeEventsRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, accountChangeEventsRequest);
                Parcel transactAndReadException = transactAndReadException(23, obtainAndWriteInterfaceToken);
                AccountChangeEventsResponse accountChangeEventsResponse = (AccountChangeEventsResponse) iax.a(transactAndReadException, AccountChangeEventsResponse.CREATOR);
                transactAndReadException.recycle();
                return accountChangeEventsResponse;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public GoogleAccountData getAccountData(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                GoogleAccountData googleAccountData = (GoogleAccountData) iax.a(transactAndReadException, GoogleAccountData.CREATOR);
                transactAndReadException.recycle();
                return googleAccountData;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public Bundle getAccountExportData(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = transactAndReadException(16, obtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) iax.a(transactAndReadException, Bundle.CREATOR);
                transactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public String getAccountId(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = transactAndReadException(25, obtainAndWriteInterfaceToken);
                String readString = transactAndReadException.readString();
                transactAndReadException.recycle();
                return readString;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public String[] getAccountVisibilityRestriction(Account account) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, account);
                Parcel transactAndReadException = transactAndReadException(42, obtainAndWriteInterfaceToken);
                String[] createStringArray = transactAndReadException.createStringArray();
                transactAndReadException.recycle();
                return createStringArray;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public GetAndAdvanceOtpCounterResponse getAndAdvanceOtpCounter(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = transactAndReadException(37, obtainAndWriteInterfaceToken);
                GetAndAdvanceOtpCounterResponse getAndAdvanceOtpCounterResponse = (GetAndAdvanceOtpCounterResponse) iax.a(transactAndReadException, GetAndAdvanceOtpCounterResponse.CREATOR);
                transactAndReadException.recycle();
                return getAndAdvanceOtpCounterResponse;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public DeviceManagementInfoResponse getDeviceManagementInfo(Account account) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, account);
                Parcel transactAndReadException = transactAndReadException(40, obtainAndWriteInterfaceToken);
                DeviceManagementInfoResponse deviceManagementInfoResponse = (DeviceManagementInfoResponse) iax.a(transactAndReadException, DeviceManagementInfoResponse.CREATOR);
                transactAndReadException.recycle();
                return deviceManagementInfoResponse;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public GoogleAccountData getGoogleAccountData(Account account) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, account);
                Parcel transactAndReadException = transactAndReadException(30, obtainAndWriteInterfaceToken);
                GoogleAccountData googleAccountData = (GoogleAccountData) iax.a(transactAndReadException, GoogleAccountData.CREATOR);
                transactAndReadException.recycle();
                return googleAccountData;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public String getGoogleAccountId(Account account) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, account);
                Parcel transactAndReadException = transactAndReadException(31, obtainAndWriteInterfaceToken);
                String readString = transactAndReadException.readString();
                transactAndReadException.recycle();
                return readString;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public GplusInfoResponse getGplusInfo(GplusInfoRequest gplusInfoRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, gplusInfoRequest);
                Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken);
                GplusInfoResponse gplusInfoResponse = (GplusInfoResponse) iax.a(transactAndReadException, GplusInfoResponse.CREATOR);
                transactAndReadException.recycle();
                return gplusInfoResponse;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public OtpResponse getOtp(OtpRequest otpRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, otpRequest);
                Parcel transactAndReadException = transactAndReadException(24, obtainAndWriteInterfaceToken);
                OtpResponse otpResponse = (OtpResponse) iax.a(transactAndReadException, OtpResponse.CREATOR);
                transactAndReadException.recycle();
                return otpResponse;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public TokenResponse getToken(TokenRequest tokenRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, tokenRequest);
                Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken);
                TokenResponse tokenResponse = (TokenResponse) iax.a(transactAndReadException, TokenResponse.CREATOR);
                transactAndReadException.recycle();
                return tokenResponse;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public String getTokenHandle(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = transactAndReadException(38, obtainAndWriteInterfaceToken);
                String readString = transactAndReadException.readString();
                transactAndReadException.recycle();
                return readString;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public WebSetupConfig getWebSetupConfig(WebSetupConfigRequest webSetupConfigRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, webSetupConfigRequest);
                Parcel transactAndReadException = transactAndReadException(18, obtainAndWriteInterfaceToken);
                WebSetupConfig webSetupConfig = (WebSetupConfig) iax.a(transactAndReadException, WebSetupConfig.CREATOR);
                transactAndReadException.recycle();
                return webSetupConfig;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public boolean installAccountFromExportData(String str, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(17, obtainAndWriteInterfaceToken);
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public boolean isTokenHandleValid(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_isTokenHandleValid, obtainAndWriteInterfaceToken);
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public AccountRemovalResponse removeAccount(AccountRemovalRequest accountRemovalRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, accountRemovalRequest);
                Parcel transactAndReadException = transactAndReadException(20, obtainAndWriteInterfaceToken);
                AccountRemovalResponse accountRemovalResponse = (AccountRemovalResponse) iax.a(transactAndReadException, AccountRemovalResponse.CREATOR);
                transactAndReadException.recycle();
                return accountRemovalResponse;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public boolean setAccountVisibilityRestriction(Account account, String[] strArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeStringArray(strArr);
                Parcel transactAndReadException = transactAndReadException(41, obtainAndWriteInterfaceToken);
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public void setFreUnlocked() {
                transactAndReadExceptionReturnVoid(43, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public boolean setWorkAccountAppWhitelistFingerprint(String str, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                Parcel transactAndReadException = transactAndReadException(34, obtainAndWriteInterfaceToken);
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public TokenResponse signIn(AccountSignInRequest accountSignInRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, accountSignInRequest);
                Parcel transactAndReadException = transactAndReadException(9, obtainAndWriteInterfaceToken);
                TokenResponse tokenResponse = (TokenResponse) iax.a(transactAndReadException, TokenResponse.CREATOR);
                transactAndReadException.recycle();
                return tokenResponse;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public TokenResponse updateCredentials(UpdateCredentialsRequest updateCredentialsRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, updateCredentialsRequest);
                Parcel transactAndReadException = transactAndReadException(11, obtainAndWriteInterfaceToken);
                TokenResponse tokenResponse = (TokenResponse) iax.a(transactAndReadException, TokenResponse.CREATOR);
                transactAndReadException.recycle();
                return tokenResponse;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public ValidateAccountCredentialsResponse validateAccountCredentials(AccountCredentials accountCredentials) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, accountCredentials);
                Parcel transactAndReadException = transactAndReadException(36, obtainAndWriteInterfaceToken);
                ValidateAccountCredentialsResponse validateAccountCredentialsResponse = (ValidateAccountCredentialsResponse) iax.a(transactAndReadException, ValidateAccountCredentialsResponse.CREATOR);
                transactAndReadException.recycle();
                return validateAccountCredentialsResponse;
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService");
        }

        public static IGoogleAccountDataService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService");
            if (queryLocalInterface instanceof IGoogleAccountDataService) {
                return (IGoogleAccountDataService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    String readString = parcel.readString();
                    enforceNoDataAvail(parcel);
                    GoogleAccountData accountData = getAccountData(readString);
                    parcel2.writeNoException();
                    iax.e(parcel2, accountData);
                    return true;
                case 2:
                    AccountNameCheckRequest accountNameCheckRequest = (AccountNameCheckRequest) iax.a(parcel, AccountNameCheckRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    AccountNameCheckResponse checkAccountName = checkAccountName(accountNameCheckRequest);
                    parcel2.writeNoException();
                    iax.e(parcel2, checkAccountName);
                    return true;
                case 3:
                    PasswordCheckRequest passwordCheckRequest = (PasswordCheckRequest) iax.a(parcel, PasswordCheckRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    PasswordCheckResponse checkPassword = checkPassword(passwordCheckRequest);
                    parcel2.writeNoException();
                    iax.e(parcel2, checkPassword);
                    return true;
                case 4:
                    CheckRealNameRequest checkRealNameRequest = (CheckRealNameRequest) iax.a(parcel, CheckRealNameRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    CheckRealNameResponse checkRealName = checkRealName(checkRealNameRequest);
                    parcel2.writeNoException();
                    iax.e(parcel2, checkRealName);
                    return true;
                case 5:
                    GoogleAccountSetupRequest googleAccountSetupRequest = (GoogleAccountSetupRequest) iax.a(parcel, GoogleAccountSetupRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    TokenResponse createAccount = createAccount(googleAccountSetupRequest);
                    parcel2.writeNoException();
                    iax.e(parcel2, createAccount);
                    return true;
                case 6:
                    GplusInfoRequest gplusInfoRequest = (GplusInfoRequest) iax.a(parcel, GplusInfoRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    GplusInfoResponse gplusInfo = getGplusInfo(gplusInfoRequest);
                    parcel2.writeNoException();
                    iax.e(parcel2, gplusInfo);
                    return true;
                case 7:
                    GoogleAccountSetupRequest googleAccountSetupRequest2 = (GoogleAccountSetupRequest) iax.a(parcel, GoogleAccountSetupRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    TokenResponse createPlusProfile = createPlusProfile(googleAccountSetupRequest2);
                    parcel2.writeNoException();
                    iax.e(parcel2, createPlusProfile);
                    return true;
                case 8:
                    TokenRequest tokenRequest = (TokenRequest) iax.a(parcel, TokenRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    TokenResponse token = getToken(tokenRequest);
                    parcel2.writeNoException();
                    iax.e(parcel2, token);
                    return true;
                case 9:
                    AccountSignInRequest accountSignInRequest = (AccountSignInRequest) iax.a(parcel, AccountSignInRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    TokenResponse signIn = signIn(accountSignInRequest);
                    parcel2.writeNoException();
                    iax.e(parcel2, signIn);
                    return true;
                case 10:
                    ConfirmCredentialsRequest confirmCredentialsRequest = (ConfirmCredentialsRequest) iax.a(parcel, ConfirmCredentialsRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    TokenResponse confirmCredentials = confirmCredentials(confirmCredentialsRequest);
                    parcel2.writeNoException();
                    iax.e(parcel2, confirmCredentials);
                    return true;
                case 11:
                    UpdateCredentialsRequest updateCredentialsRequest = (UpdateCredentialsRequest) iax.a(parcel, UpdateCredentialsRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    TokenResponse updateCredentials = updateCredentials(updateCredentialsRequest);
                    parcel2.writeNoException();
                    iax.e(parcel2, updateCredentials);
                    return true;
                case 12:
                case 13:
                case 14:
                case 15:
                case 21:
                case 22:
                case 26:
                case 28:
                case 32:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                default:
                    return false;
                case 16:
                    String readString2 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    Bundle accountExportData = getAccountExportData(readString2);
                    parcel2.writeNoException();
                    iax.e(parcel2, accountExportData);
                    return true;
                case 17:
                    String readString3 = parcel.readString();
                    Bundle bundle = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    boolean installAccountFromExportData = installAccountFromExportData(readString3, bundle);
                    parcel2.writeNoException();
                    parcel2.writeInt(installAccountFromExportData ? 1 : 0);
                    return true;
                case 18:
                    WebSetupConfigRequest webSetupConfigRequest = (WebSetupConfigRequest) iax.a(parcel, WebSetupConfigRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    WebSetupConfig webSetupConfig = getWebSetupConfig(webSetupConfigRequest);
                    parcel2.writeNoException();
                    iax.e(parcel2, webSetupConfig);
                    return true;
                case 19:
                    ClearTokenRequest clearTokenRequest = (ClearTokenRequest) iax.a(parcel, ClearTokenRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    ClearTokenResponse clearToken = clearToken(clearTokenRequest);
                    parcel2.writeNoException();
                    iax.e(parcel2, clearToken);
                    return true;
                case 20:
                    AccountRemovalRequest accountRemovalRequest = (AccountRemovalRequest) iax.a(parcel, AccountRemovalRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    AccountRemovalResponse removeAccount = removeAccount(accountRemovalRequest);
                    parcel2.writeNoException();
                    iax.e(parcel2, removeAccount);
                    return true;
                case 23:
                    AccountChangeEventsRequest accountChangeEventsRequest = (AccountChangeEventsRequest) iax.a(parcel, AccountChangeEventsRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    AccountChangeEventsResponse accountChangeEvents = getAccountChangeEvents(accountChangeEventsRequest);
                    parcel2.writeNoException();
                    iax.e(parcel2, accountChangeEvents);
                    return true;
                case 24:
                    OtpRequest otpRequest = (OtpRequest) iax.a(parcel, OtpRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    OtpResponse otp = getOtp(otpRequest);
                    parcel2.writeNoException();
                    iax.e(parcel2, otp);
                    return true;
                case 25:
                    String readString4 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    String accountId = getAccountId(readString4);
                    parcel2.writeNoException();
                    parcel2.writeString(accountId);
                    return true;
                case 27:
                    CheckFactoryResetPolicyComplianceRequest checkFactoryResetPolicyComplianceRequest = (CheckFactoryResetPolicyComplianceRequest) iax.a(parcel, CheckFactoryResetPolicyComplianceRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    CheckFactoryResetPolicyComplianceResponse checkFrpCompliance = checkFrpCompliance(checkFactoryResetPolicyComplianceRequest);
                    parcel2.writeNoException();
                    iax.e(parcel2, checkFrpCompliance);
                    return true;
                case 29:
                    clearFactoryResetChallenges();
                    parcel2.writeNoException();
                    return true;
                case 30:
                    Account account = (Account) iax.a(parcel, Account.CREATOR);
                    enforceNoDataAvail(parcel);
                    GoogleAccountData googleAccountData = getGoogleAccountData(account);
                    parcel2.writeNoException();
                    iax.e(parcel2, googleAccountData);
                    return true;
                case 31:
                    Account account2 = (Account) iax.a(parcel, Account.CREATOR);
                    enforceNoDataAvail(parcel);
                    String googleAccountId = getGoogleAccountId(account2);
                    parcel2.writeNoException();
                    parcel2.writeString(googleAccountId);
                    return true;
                case 34:
                    String readString5 = parcel.readString();
                    String readString6 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    boolean workAccountAppWhitelistFingerprint = setWorkAccountAppWhitelistFingerprint(readString5, readString6);
                    parcel2.writeNoException();
                    int i3 = iax.a;
                    parcel2.writeInt(workAccountAppWhitelistFingerprint ? 1 : 0);
                    return true;
                case 35:
                    boolean clearWorkAccountAppWhitelist = clearWorkAccountAppWhitelist();
                    parcel2.writeNoException();
                    int i4 = iax.a;
                    parcel2.writeInt(clearWorkAccountAppWhitelist ? 1 : 0);
                    return true;
                case 36:
                    AccountCredentials accountCredentials = (AccountCredentials) iax.a(parcel, AccountCredentials.CREATOR);
                    enforceNoDataAvail(parcel);
                    ValidateAccountCredentialsResponse validateAccountCredentials = validateAccountCredentials(accountCredentials);
                    parcel2.writeNoException();
                    iax.e(parcel2, validateAccountCredentials);
                    return true;
                case 37:
                    String readString7 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    GetAndAdvanceOtpCounterResponse andAdvanceOtpCounter = getAndAdvanceOtpCounter(readString7);
                    parcel2.writeNoException();
                    iax.e(parcel2, andAdvanceOtpCounter);
                    return true;
                case 38:
                    String readString8 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    String tokenHandle = getTokenHandle(readString8);
                    parcel2.writeNoException();
                    parcel2.writeString(tokenHandle);
                    return true;
                case TRANSACTION_isTokenHandleValid /* 39 */:
                    String readString9 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    boolean isTokenHandleValid = isTokenHandleValid(readString9);
                    parcel2.writeNoException();
                    int i5 = iax.a;
                    parcel2.writeInt(isTokenHandleValid ? 1 : 0);
                    return true;
                case 40:
                    Account account3 = (Account) iax.a(parcel, Account.CREATOR);
                    enforceNoDataAvail(parcel);
                    DeviceManagementInfoResponse deviceManagementInfo = getDeviceManagementInfo(account3);
                    parcel2.writeNoException();
                    iax.e(parcel2, deviceManagementInfo);
                    return true;
                case 41:
                    Account account4 = (Account) iax.a(parcel, Account.CREATOR);
                    String[] createStringArray = parcel.createStringArray();
                    enforceNoDataAvail(parcel);
                    boolean accountVisibilityRestriction = setAccountVisibilityRestriction(account4, createStringArray);
                    parcel2.writeNoException();
                    parcel2.writeInt(accountVisibilityRestriction ? 1 : 0);
                    return true;
                case 42:
                    Account account5 = (Account) iax.a(parcel, Account.CREATOR);
                    enforceNoDataAvail(parcel);
                    String[] accountVisibilityRestriction2 = getAccountVisibilityRestriction(account5);
                    parcel2.writeNoException();
                    parcel2.writeStringArray(accountVisibilityRestriction2);
                    return true;
                case 43:
                    setFreUnlocked();
                    parcel2.writeNoException();
                    return true;
                case 44:
                    clearFre();
                    parcel2.writeNoException();
                    return true;
            }
        }
    }

    AccountNameCheckResponse checkAccountName(AccountNameCheckRequest accountNameCheckRequest);

    CheckFactoryResetPolicyComplianceResponse checkFrpCompliance(CheckFactoryResetPolicyComplianceRequest checkFactoryResetPolicyComplianceRequest);

    PasswordCheckResponse checkPassword(PasswordCheckRequest passwordCheckRequest);

    CheckRealNameResponse checkRealName(CheckRealNameRequest checkRealNameRequest);

    void clearFactoryResetChallenges();

    @Deprecated
    void clearFre();

    ClearTokenResponse clearToken(ClearTokenRequest clearTokenRequest);

    boolean clearWorkAccountAppWhitelist();

    TokenResponse confirmCredentials(ConfirmCredentialsRequest confirmCredentialsRequest);

    TokenResponse createAccount(GoogleAccountSetupRequest googleAccountSetupRequest);

    TokenResponse createPlusProfile(GoogleAccountSetupRequest googleAccountSetupRequest);

    AccountChangeEventsResponse getAccountChangeEvents(AccountChangeEventsRequest accountChangeEventsRequest);

    GoogleAccountData getAccountData(String str);

    Bundle getAccountExportData(String str);

    String getAccountId(String str);

    String[] getAccountVisibilityRestriction(Account account);

    GetAndAdvanceOtpCounterResponse getAndAdvanceOtpCounter(String str);

    DeviceManagementInfoResponse getDeviceManagementInfo(Account account);

    GoogleAccountData getGoogleAccountData(Account account);

    String getGoogleAccountId(Account account);

    GplusInfoResponse getGplusInfo(GplusInfoRequest gplusInfoRequest);

    OtpResponse getOtp(OtpRequest otpRequest);

    TokenResponse getToken(TokenRequest tokenRequest);

    String getTokenHandle(String str);

    WebSetupConfig getWebSetupConfig(WebSetupConfigRequest webSetupConfigRequest);

    boolean installAccountFromExportData(String str, Bundle bundle);

    boolean isTokenHandleValid(String str);

    AccountRemovalResponse removeAccount(AccountRemovalRequest accountRemovalRequest);

    boolean setAccountVisibilityRestriction(Account account, String[] strArr);

    @Deprecated
    void setFreUnlocked();

    boolean setWorkAccountAppWhitelistFingerprint(String str, String str2);

    TokenResponse signIn(AccountSignInRequest accountSignInRequest);

    TokenResponse updateCredentials(UpdateCredentialsRequest updateCredentialsRequest);

    ValidateAccountCredentialsResponse validateAccountCredentials(AccountCredentials accountCredentials);
}
