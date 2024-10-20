package com.google.android.gms.auth.api.identity.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.CallingAppInfoCompat;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.internal.IAggregateOneTapZuulOptOutStateCallback;
import com.google.android.gms.auth.api.identity.internal.ICompleteSignInCallback;
import com.google.android.gms.auth.api.identity.internal.IFetchAccountLinkingConsentPageUrlCallback;
import com.google.android.gms.auth.api.identity.internal.IFetchAccountsWithZuulKeyRetrievalIntentsCallback;
import com.google.android.gms.auth.api.identity.internal.IFetchChromeOptionsCallback;
import com.google.android.gms.auth.api.identity.internal.IFetchGoogleIdTokenCredentialCallback;
import com.google.android.gms.auth.api.identity.internal.IFetchVerifiedPhoneNumbersForAccountCallback;
import com.google.android.gms.auth.api.identity.internal.IGetCachedSaveAccountLinkingTokenRequestCallback;
import com.google.android.gms.auth.api.identity.internal.IGetDefaultAccountCallback;
import com.google.android.gms.auth.api.identity.internal.IGetPasswordAndPasskeyCallback;
import com.google.android.gms.auth.api.identity.internal.IHasDisplayedWarmWelcomeCallback;
import com.google.android.gms.auth.api.identity.internal.IIsAutoSelectEnabledForAppCallback;
import com.google.android.gms.auth.api.identity.internal.IIsOptedInForAutoSelectCallback;
import com.google.android.gms.auth.api.identity.internal.IListPasskeyCredentialsCallback;
import com.google.android.gms.auth.api.identity.internal.IListSignInCredentialsCallback;
import com.google.android.gms.auth.api.identity.internal.IMatchPasswordCallback;
import com.google.android.gms.auth.api.identity.internal.ISortAccountsByLastUsedForCreatePasswordPasskeyCallback;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import defpackage.iax;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IIdentityGisInternalService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IIdentityGisInternalService {
        static final int TRANSACTION_aggregateOneTapZuulOptOutState = 25;
        static final int TRANSACTION_completeSaveAccountLinkingToken = 10;
        static final int TRANSACTION_completeSignIn = 2;
        static final int TRANSACTION_depositIdToken = 13;
        static final int TRANSACTION_fetchAccountLinkingConsentPageUrl = 17;
        static final int TRANSACTION_fetchAccountsWithZuulKeyRetrievalIntents = 23;
        static final int TRANSACTION_fetchAccountsWithZuulKeyRetrievalIntentsOptedInForOneTap = 24;
        static final int TRANSACTION_fetchChromeOptions = 33;
        static final int TRANSACTION_fetchGoogleIdTokenCredential = 27;
        static final int TRANSACTION_fetchVerifiedPhoneNumbersForAccount = 21;
        static final int TRANSACTION_getCachedSaveAccountLinkingTokenRequest = 11;
        static final int TRANSACTION_getDefaultAccount = 9;
        static final int TRANSACTION_getPasswordAndPasskey = 29;
        static final int TRANSACTION_hasDisplayedWarmWelcome = 19;
        static final int TRANSACTION_isAutoSelectEnabledForApp = 14;
        static final int TRANSACTION_isOptedInForAutoSelect = 12;
        static final int TRANSACTION_listPasskeyCredentials = 28;
        static final int TRANSACTION_listSignInCredentials = 1;
        static final int TRANSACTION_matchPassword = 7;
        static final int TRANSACTION_recordCancelledSignIn = 5;
        static final int TRANSACTION_recordCreatePasswordPasskey = 31;
        static final int TRANSACTION_recordGrants = 3;
        static final int TRANSACTION_resetSignInCancellationCounter = 6;
        static final int TRANSACTION_resetWarmWelcomeDisplayed = 20;
        static final int TRANSACTION_savePassword = 8;
        static final int TRANSACTION_setAutoSelectEnabledForApp = 15;
        static final int TRANSACTION_setNeverSaveForApp = 16;
        static final int TRANSACTION_setWarmWelcomeDisplayed = 18;
        static final int TRANSACTION_sortAccountsByLastUsedForCreatePasswordPasskey = 32;
        static final int TRANSACTION_updateDefaultAccount = 4;
        static final int TRANSACTION_updateOneTapZuulOptOutState = 26;
        static final int TRANSACTION_updatePasswordLastUsedTime = 30;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IIdentityGisInternalService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService");
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void aggregateOneTapZuulOptOutState(IAggregateOneTapZuulOptOutStateCallback iAggregateOneTapZuulOptOutStateCallback, List<Account> list, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iAggregateOneTapZuulOptOutStateCallback);
                obtainAndWriteInterfaceToken.writeTypedList(list);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(25, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void completeSaveAccountLinkingToken(IStatusCallback iStatusCallback, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest, String str, String str2, Account account, String str3) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, saveAccountLinkingTokenRequest);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                iax.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeString(str3);
                transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void completeSignIn(ICompleteSignInCallback iCompleteSignInCallback, String str, String str2, String str3, String str4, InternalSignInCredentialWrapper internalSignInCredentialWrapper, String str5, String str6, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iCompleteSignInCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeString(str4);
                iax.d(obtainAndWriteInterfaceToken, internalSignInCredentialWrapper);
                obtainAndWriteInterfaceToken.writeString(str5);
                obtainAndWriteInterfaceToken.writeString(str6);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void depositIdToken(IStatusCallback iStatusCallback, Account account, List<Scope> list, String str, BeginSignInRequest beginSignInRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeTypedList(list);
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, beginSignInRequest);
                transactAndReadExceptionReturnVoid(13, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void fetchAccountLinkingConsentPageUrl(IFetchAccountLinkingConsentPageUrlCallback iFetchAccountLinkingConsentPageUrlCallback, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest, Account account, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iFetchAccountLinkingConsentPageUrlCallback);
                iax.d(obtainAndWriteInterfaceToken, saveAccountLinkingTokenRequest);
                iax.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(17, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void fetchAccountsWithZuulKeyRetrievalIntents(IFetchAccountsWithZuulKeyRetrievalIntentsCallback iFetchAccountsWithZuulKeyRetrievalIntentsCallback, String str, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iFetchAccountsWithZuulKeyRetrievalIntentsCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(23, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void fetchAccountsWithZuulKeyRetrievalIntentsOptedInForOneTap(IFetchAccountsWithZuulKeyRetrievalIntentsCallback iFetchAccountsWithZuulKeyRetrievalIntentsCallback, String str, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iFetchAccountsWithZuulKeyRetrievalIntentsCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(24, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void fetchChromeOptions(IFetchChromeOptionsCallback iFetchChromeOptionsCallback, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iFetchChromeOptionsCallback);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                transactAndReadExceptionReturnVoid(33, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void fetchGoogleIdTokenCredential(IFetchGoogleIdTokenCredentialCallback iFetchGoogleIdTokenCredentialCallback, Account account, String str, String str2, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iFetchGoogleIdTokenCredentialCallback);
                iax.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(27, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void fetchVerifiedPhoneNumbersForAccount(IFetchVerifiedPhoneNumbersForAccountCallback iFetchVerifiedPhoneNumbersForAccountCallback, Account account, String str, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iFetchVerifiedPhoneNumbersForAccountCallback);
                iax.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(21, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void getCachedSaveAccountLinkingTokenRequest(IGetCachedSaveAccountLinkingTokenRequestCallback iGetCachedSaveAccountLinkingTokenRequestCallback, String str, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iGetCachedSaveAccountLinkingTokenRequestCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void getDefaultAccount(IGetDefaultAccountCallback iGetDefaultAccountCallback, String str, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iGetDefaultAccountCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void getPasswordAndPasskey(IGetPasswordAndPasskeyCallback iGetPasswordAndPasskeyCallback, Bundle bundle, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iGetPasswordAndPasskeyCallback);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(29, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void hasDisplayedWarmWelcome(IHasDisplayedWarmWelcomeCallback iHasDisplayedWarmWelcomeCallback, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iHasDisplayedWarmWelcomeCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(19, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void isAutoSelectEnabledForApp(IIsAutoSelectEnabledForAppCallback iIsAutoSelectEnabledForAppCallback, String str, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iIsAutoSelectEnabledForAppCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(14, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void isOptedInForAutoSelect(IIsOptedInForAutoSelectCallback iIsOptedInForAutoSelectCallback, Account account, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iIsOptedInForAutoSelectCallback);
                iax.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(12, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void listPasskeyCredentials(IListPasskeyCredentialsCallback iListPasskeyCredentialsCallback, String str, String str2, String str3, List<PublicKeyCredentialDescriptor> list) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iListPasskeyCredentialsCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeList(list);
                transactAndReadExceptionReturnVoid(28, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void listSignInCredentials(IListSignInCredentialsCallback iListSignInCredentialsCallback, String str, BeginSignInRequest beginSignInRequest, boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iListSignInCredentialsCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, beginSignInRequest);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void matchPassword(IMatchPasswordCallback iMatchPasswordCallback, SavePasswordRequest savePasswordRequest, String str, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iMatchPasswordCallback);
                iax.d(obtainAndWriteInterfaceToken, savePasswordRequest);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void recordCancelledSignIn(IStatusCallback iStatusCallback, String str, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void recordCreatePasswordPasskey(IStatusCallback iStatusCallback, Account account) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, account);
                transactAndReadExceptionReturnVoid(31, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void recordGrants(IStatusCallback iStatusCallback, String str, String str2, Account account, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                iax.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void resetSignInCancellationCounter(IStatusCallback iStatusCallback, String str, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void resetWarmWelcomeDisplayed(IStatusCallback iStatusCallback, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(20, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void savePassword(IStatusCallback iStatusCallback, SavePasswordRequest savePasswordRequest, List<Account> list, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, savePasswordRequest);
                obtainAndWriteInterfaceToken.writeTypedList(list);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void setAutoSelectEnabledForApp(IStatusCallback iStatusCallback, String str, boolean z, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                obtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(15, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void setNeverSaveForApp(IStatusCallback iStatusCallback, Account account, String str, boolean z, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                obtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(16, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void setWarmWelcomeDisplayed(IStatusCallback iStatusCallback, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(18, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void sortAccountsByLastUsedForCreatePasswordPasskey(ISortAccountsByLastUsedForCreatePasswordPasskeyCallback iSortAccountsByLastUsedForCreatePasswordPasskeyCallback, List<Account> list, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iSortAccountsByLastUsedForCreatePasswordPasskeyCallback);
                obtainAndWriteInterfaceToken.writeTypedList(list);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(32, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void updateDefaultAccount(IStatusCallback iStatusCallback, String str, String str2, Account account) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                iax.d(obtainAndWriteInterfaceToken, account);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void updateOneTapZuulOptOutState(IStatusCallback iStatusCallback, List<Account> list, int i, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeTypedList(list);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(26, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void updatePasswordLastUsedTime(IStatusCallback iStatusCallback, InternalSignInCredentialWrapper internalSignInCredentialWrapper, CallingAppInfoCompat callingAppInfoCompat, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, internalSignInCredentialWrapper);
                iax.d(obtainAndWriteInterfaceToken, callingAppInfoCompat);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(30, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService");
        }

        public static IIdentityGisInternalService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService");
            if (queryLocalInterface instanceof IIdentityGisInternalService) {
                return (IIdentityGisInternalService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IListSignInCredentialsCallback asInterface = IListSignInCredentialsCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString = parcel.readString();
                    BeginSignInRequest beginSignInRequest = (BeginSignInRequest) iax.a(parcel, BeginSignInRequest.CREATOR);
                    boolean g = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    listSignInCredentials(asInterface, readString, beginSignInRequest, g);
                    break;
                case 2:
                    ICompleteSignInCallback asInterface2 = ICompleteSignInCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    InternalSignInCredentialWrapper internalSignInCredentialWrapper = (InternalSignInCredentialWrapper) iax.a(parcel, InternalSignInCredentialWrapper.CREATOR);
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    int readInt = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    completeSignIn(asInterface2, readString2, readString3, readString4, readString5, internalSignInCredentialWrapper, readString6, readString7, readInt);
                    break;
                case 3:
                    IStatusCallback asInterface3 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString8 = parcel.readString();
                    String readString9 = parcel.readString();
                    Account account = (Account) iax.a(parcel, Account.CREATOR);
                    int readInt2 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    recordGrants(asInterface3, readString8, readString9, account, readInt2);
                    break;
                case 4:
                    IStatusCallback asInterface4 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString10 = parcel.readString();
                    String readString11 = parcel.readString();
                    Account account2 = (Account) iax.a(parcel, Account.CREATOR);
                    enforceNoDataAvail(parcel);
                    updateDefaultAccount(asInterface4, readString10, readString11, account2);
                    break;
                case 5:
                    IStatusCallback asInterface5 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString12 = parcel.readString();
                    String readString13 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    recordCancelledSignIn(asInterface5, readString12, readString13);
                    break;
                case 6:
                    IStatusCallback asInterface6 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString14 = parcel.readString();
                    String readString15 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    resetSignInCancellationCounter(asInterface6, readString14, readString15);
                    break;
                case 7:
                    IMatchPasswordCallback asInterface7 = IMatchPasswordCallback.Stub.asInterface(parcel.readStrongBinder());
                    SavePasswordRequest savePasswordRequest = (SavePasswordRequest) iax.a(parcel, SavePasswordRequest.CREATOR);
                    String readString16 = parcel.readString();
                    String readString17 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    matchPassword(asInterface7, savePasswordRequest, readString16, readString17);
                    break;
                case 8:
                    IStatusCallback asInterface8 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    SavePasswordRequest savePasswordRequest2 = (SavePasswordRequest) iax.a(parcel, SavePasswordRequest.CREATOR);
                    ArrayList createTypedArrayList = parcel.createTypedArrayList(Account.CREATOR);
                    String readString18 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    savePassword(asInterface8, savePasswordRequest2, createTypedArrayList, readString18);
                    break;
                case 9:
                    IGetDefaultAccountCallback asInterface9 = IGetDefaultAccountCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString19 = parcel.readString();
                    String readString20 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getDefaultAccount(asInterface9, readString19, readString20);
                    break;
                case 10:
                    IStatusCallback asInterface10 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) iax.a(parcel, SaveAccountLinkingTokenRequest.CREATOR);
                    String readString21 = parcel.readString();
                    String readString22 = parcel.readString();
                    Account account3 = (Account) iax.a(parcel, Account.CREATOR);
                    String readString23 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    completeSaveAccountLinkingToken(asInterface10, saveAccountLinkingTokenRequest, readString21, readString22, account3, readString23);
                    break;
                case 11:
                    IGetCachedSaveAccountLinkingTokenRequestCallback asInterface11 = IGetCachedSaveAccountLinkingTokenRequestCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString24 = parcel.readString();
                    String readString25 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getCachedSaveAccountLinkingTokenRequest(asInterface11, readString24, readString25);
                    break;
                case 12:
                    IIsOptedInForAutoSelectCallback asInterface12 = IIsOptedInForAutoSelectCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account4 = (Account) iax.a(parcel, Account.CREATOR);
                    String readString26 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    isOptedInForAutoSelect(asInterface12, account4, readString26);
                    break;
                case 13:
                    IStatusCallback asInterface13 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account5 = (Account) iax.a(parcel, Account.CREATOR);
                    ArrayList createTypedArrayList2 = parcel.createTypedArrayList(Scope.CREATOR);
                    String readString27 = parcel.readString();
                    BeginSignInRequest beginSignInRequest2 = (BeginSignInRequest) iax.a(parcel, BeginSignInRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    depositIdToken(asInterface13, account5, createTypedArrayList2, readString27, beginSignInRequest2);
                    break;
                case 14:
                    IIsAutoSelectEnabledForAppCallback asInterface14 = IIsAutoSelectEnabledForAppCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString28 = parcel.readString();
                    String readString29 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    isAutoSelectEnabledForApp(asInterface14, readString28, readString29);
                    break;
                case 15:
                    IStatusCallback asInterface15 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString30 = parcel.readString();
                    boolean g2 = iax.g(parcel);
                    String readString31 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    setAutoSelectEnabledForApp(asInterface15, readString30, g2, readString31);
                    break;
                case 16:
                    IStatusCallback asInterface16 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account6 = (Account) iax.a(parcel, Account.CREATOR);
                    String readString32 = parcel.readString();
                    boolean g3 = iax.g(parcel);
                    String readString33 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    setNeverSaveForApp(asInterface16, account6, readString32, g3, readString33);
                    break;
                case 17:
                    IFetchAccountLinkingConsentPageUrlCallback asInterface17 = IFetchAccountLinkingConsentPageUrlCallback.Stub.asInterface(parcel.readStrongBinder());
                    SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest2 = (SaveAccountLinkingTokenRequest) iax.a(parcel, SaveAccountLinkingTokenRequest.CREATOR);
                    Account account7 = (Account) iax.a(parcel, Account.CREATOR);
                    String readString34 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    fetchAccountLinkingConsentPageUrl(asInterface17, saveAccountLinkingTokenRequest2, account7, readString34);
                    break;
                case 18:
                    IStatusCallback asInterface18 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString35 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    setWarmWelcomeDisplayed(asInterface18, readString35);
                    break;
                case 19:
                    IHasDisplayedWarmWelcomeCallback asInterface19 = IHasDisplayedWarmWelcomeCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString36 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    hasDisplayedWarmWelcome(asInterface19, readString36);
                    break;
                case 20:
                    IStatusCallback asInterface20 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString37 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    resetWarmWelcomeDisplayed(asInterface20, readString37);
                    break;
                case 21:
                    IFetchVerifiedPhoneNumbersForAccountCallback asInterface21 = IFetchVerifiedPhoneNumbersForAccountCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account8 = (Account) iax.a(parcel, Account.CREATOR);
                    String readString38 = parcel.readString();
                    String readString39 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    fetchVerifiedPhoneNumbersForAccount(asInterface21, account8, readString38, readString39);
                    break;
                case 22:
                default:
                    return false;
                case 23:
                    IFetchAccountsWithZuulKeyRetrievalIntentsCallback asInterface22 = IFetchAccountsWithZuulKeyRetrievalIntentsCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString40 = parcel.readString();
                    String readString41 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    fetchAccountsWithZuulKeyRetrievalIntents(asInterface22, readString40, readString41);
                    break;
                case 24:
                    IFetchAccountsWithZuulKeyRetrievalIntentsCallback asInterface23 = IFetchAccountsWithZuulKeyRetrievalIntentsCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString42 = parcel.readString();
                    String readString43 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    fetchAccountsWithZuulKeyRetrievalIntentsOptedInForOneTap(asInterface23, readString42, readString43);
                    break;
                case 25:
                    IAggregateOneTapZuulOptOutStateCallback asInterface24 = IAggregateOneTapZuulOptOutStateCallback.Stub.asInterface(parcel.readStrongBinder());
                    ArrayList createTypedArrayList3 = parcel.createTypedArrayList(Account.CREATOR);
                    String readString44 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    aggregateOneTapZuulOptOutState(asInterface24, createTypedArrayList3, readString44);
                    break;
                case 26:
                    IStatusCallback asInterface25 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    ArrayList createTypedArrayList4 = parcel.createTypedArrayList(Account.CREATOR);
                    int readInt3 = parcel.readInt();
                    String readString45 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    updateOneTapZuulOptOutState(asInterface25, createTypedArrayList4, readInt3, readString45);
                    break;
                case 27:
                    IFetchGoogleIdTokenCredentialCallback asInterface26 = IFetchGoogleIdTokenCredentialCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account9 = (Account) iax.a(parcel, Account.CREATOR);
                    String readString46 = parcel.readString();
                    String readString47 = parcel.readString();
                    int readInt4 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    fetchGoogleIdTokenCredential(asInterface26, account9, readString46, readString47, readInt4);
                    break;
                case 28:
                    IListPasskeyCredentialsCallback asInterface27 = IListPasskeyCredentialsCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString48 = parcel.readString();
                    String readString49 = parcel.readString();
                    String readString50 = parcel.readString();
                    ArrayList b = iax.b(parcel);
                    enforceNoDataAvail(parcel);
                    listPasskeyCredentials(asInterface27, readString48, readString49, readString50, b);
                    break;
                case 29:
                    IGetPasswordAndPasskeyCallback asInterface28 = IGetPasswordAndPasskeyCallback.Stub.asInterface(parcel.readStrongBinder());
                    Bundle bundle = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    String readString51 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getPasswordAndPasskey(asInterface28, bundle, readString51);
                    break;
                case 30:
                    IStatusCallback asInterface29 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    InternalSignInCredentialWrapper internalSignInCredentialWrapper2 = (InternalSignInCredentialWrapper) iax.a(parcel, InternalSignInCredentialWrapper.CREATOR);
                    CallingAppInfoCompat callingAppInfoCompat = (CallingAppInfoCompat) iax.a(parcel, CallingAppInfoCompat.CREATOR);
                    String readString52 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    updatePasswordLastUsedTime(asInterface29, internalSignInCredentialWrapper2, callingAppInfoCompat, readString52);
                    break;
                case 31:
                    IStatusCallback asInterface30 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account10 = (Account) iax.a(parcel, Account.CREATOR);
                    enforceNoDataAvail(parcel);
                    recordCreatePasswordPasskey(asInterface30, account10);
                    break;
                case 32:
                    ISortAccountsByLastUsedForCreatePasswordPasskeyCallback asInterface31 = ISortAccountsByLastUsedForCreatePasswordPasskeyCallback.Stub.asInterface(parcel.readStrongBinder());
                    ArrayList createTypedArrayList5 = parcel.createTypedArrayList(Account.CREATOR);
                    String readString53 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    sortAccountsByLastUsedForCreatePasswordPasskey(asInterface31, createTypedArrayList5, readString53);
                    break;
                case 33:
                    IFetchChromeOptionsCallback asInterface32 = IFetchChromeOptionsCallback.Stub.asInterface(parcel.readStrongBinder());
                    Bundle bundle2 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    fetchChromeOptions(asInterface32, bundle2);
                    break;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void aggregateOneTapZuulOptOutState(IAggregateOneTapZuulOptOutStateCallback iAggregateOneTapZuulOptOutStateCallback, List<Account> list, String str);

    void completeSaveAccountLinkingToken(IStatusCallback iStatusCallback, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest, String str, String str2, Account account, String str3);

    void completeSignIn(ICompleteSignInCallback iCompleteSignInCallback, String str, String str2, String str3, String str4, InternalSignInCredentialWrapper internalSignInCredentialWrapper, String str5, String str6, int i);

    void depositIdToken(IStatusCallback iStatusCallback, Account account, List<Scope> list, String str, BeginSignInRequest beginSignInRequest);

    void fetchAccountLinkingConsentPageUrl(IFetchAccountLinkingConsentPageUrlCallback iFetchAccountLinkingConsentPageUrlCallback, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest, Account account, String str);

    void fetchAccountsWithZuulKeyRetrievalIntents(IFetchAccountsWithZuulKeyRetrievalIntentsCallback iFetchAccountsWithZuulKeyRetrievalIntentsCallback, String str, String str2);

    void fetchAccountsWithZuulKeyRetrievalIntentsOptedInForOneTap(IFetchAccountsWithZuulKeyRetrievalIntentsCallback iFetchAccountsWithZuulKeyRetrievalIntentsCallback, String str, String str2);

    void fetchChromeOptions(IFetchChromeOptionsCallback iFetchChromeOptionsCallback, Bundle bundle);

    void fetchGoogleIdTokenCredential(IFetchGoogleIdTokenCredentialCallback iFetchGoogleIdTokenCredentialCallback, Account account, String str, String str2, int i);

    void fetchVerifiedPhoneNumbersForAccount(IFetchVerifiedPhoneNumbersForAccountCallback iFetchVerifiedPhoneNumbersForAccountCallback, Account account, String str, String str2);

    void getCachedSaveAccountLinkingTokenRequest(IGetCachedSaveAccountLinkingTokenRequestCallback iGetCachedSaveAccountLinkingTokenRequestCallback, String str, String str2);

    void getDefaultAccount(IGetDefaultAccountCallback iGetDefaultAccountCallback, String str, String str2);

    void getPasswordAndPasskey(IGetPasswordAndPasskeyCallback iGetPasswordAndPasskeyCallback, Bundle bundle, String str);

    void hasDisplayedWarmWelcome(IHasDisplayedWarmWelcomeCallback iHasDisplayedWarmWelcomeCallback, String str);

    void isAutoSelectEnabledForApp(IIsAutoSelectEnabledForAppCallback iIsAutoSelectEnabledForAppCallback, String str, String str2);

    void isOptedInForAutoSelect(IIsOptedInForAutoSelectCallback iIsOptedInForAutoSelectCallback, Account account, String str);

    void listPasskeyCredentials(IListPasskeyCredentialsCallback iListPasskeyCredentialsCallback, String str, String str2, String str3, List<PublicKeyCredentialDescriptor> list);

    void listSignInCredentials(IListSignInCredentialsCallback iListSignInCredentialsCallback, String str, BeginSignInRequest beginSignInRequest, boolean z);

    void matchPassword(IMatchPasswordCallback iMatchPasswordCallback, SavePasswordRequest savePasswordRequest, String str, String str2);

    void recordCancelledSignIn(IStatusCallback iStatusCallback, String str, String str2);

    void recordCreatePasswordPasskey(IStatusCallback iStatusCallback, Account account);

    void recordGrants(IStatusCallback iStatusCallback, String str, String str2, Account account, int i);

    void resetSignInCancellationCounter(IStatusCallback iStatusCallback, String str, String str2);

    void resetWarmWelcomeDisplayed(IStatusCallback iStatusCallback, String str);

    void savePassword(IStatusCallback iStatusCallback, SavePasswordRequest savePasswordRequest, List<Account> list, String str);

    void setAutoSelectEnabledForApp(IStatusCallback iStatusCallback, String str, boolean z, String str2);

    void setNeverSaveForApp(IStatusCallback iStatusCallback, Account account, String str, boolean z, String str2);

    void setWarmWelcomeDisplayed(IStatusCallback iStatusCallback, String str);

    void sortAccountsByLastUsedForCreatePasswordPasskey(ISortAccountsByLastUsedForCreatePasswordPasskeyCallback iSortAccountsByLastUsedForCreatePasswordPasskeyCallback, List<Account> list, String str);

    void updateDefaultAccount(IStatusCallback iStatusCallback, String str, String str2, Account account);

    void updateOneTapZuulOptOutState(IStatusCallback iStatusCallback, List<Account> list, int i, String str);

    void updatePasswordLastUsedTime(IStatusCallback iStatusCallback, InternalSignInCredentialWrapper internalSignInCredentialWrapper, CallingAppInfoCompat callingAppInfoCompat, String str);
}
