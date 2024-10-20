package com.google.android.gms.usagereporting.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.ConsentInformation;
import com.google.android.gms.usagereporting.ElCapitanOptions;
import com.google.android.gms.usagereporting.SafetyOptions;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import defpackage.iax;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IUsageReportingCallbacks extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IUsageReportingCallbacks {
        static final int TRANSACTION_onCanLog = 8;
        static final int TRANSACTION_onCheckConsents = 15;
        static final int TRANSACTION_onGetAppWhitelist = 6;
        static final int TRANSACTION_onGetCheckboxSettingsPendingIntent = 10;
        static final int TRANSACTION_onGetElCapitanOptions = 12;
        static final int TRANSACTION_onGetOptInOptions = 2;
        static final int TRANSACTION_onGetPassedWhitelists = 9;
        static final int TRANSACTION_onGetSafetyOptions = 14;
        static final int TRANSACTION_onRegisterOptInOptionsChangedListener = 4;
        static final int TRANSACTION_onSetAppWhitelist = 7;
        static final int TRANSACTION_onSetElCapitanOptions = 11;
        static final int TRANSACTION_onSetOptInOptions = 3;
        static final int TRANSACTION_onSetSafetyOptions = 13;
        static final int TRANSACTION_onUnregisterOptInOptionsChangedListener = 5;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IUsageReportingCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks");
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
            public void onCanLog(Status status, boolean z, ConsentInformation consentInformation) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                iax.d(obtainAndWriteInterfaceToken, consentInformation);
                transactOneway(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
            public void onCheckConsents(Status status, ConsentInformation consentInformation) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, consentInformation);
                transactOneway(15, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
            public void onGetAppWhitelist(Status status, List<String> list) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeStringList(list);
                transactOneway(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
            public void onGetCheckboxSettingsPendingIntent(PendingIntent pendingIntent) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, pendingIntent);
                transactOneway(10, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
            public void onGetElCapitanOptions(Status status, ElCapitanOptions elCapitanOptions) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, elCapitanOptions);
                transactOneway(12, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
            public void onGetOptInOptions(Status status, UsageReportingOptInOptions usageReportingOptInOptions) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, usageReportingOptInOptions);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
            public void onGetPassedWhitelists(Status status, ConsentInformation consentInformation) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, consentInformation);
                transactOneway(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
            public void onGetSafetyOptions(Status status, SafetyOptions safetyOptions) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, safetyOptions);
                transactOneway(14, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
            public void onRegisterOptInOptionsChangedListener(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                transactOneway(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
            public void onSetAppWhitelist(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                transactOneway(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
            public void onSetElCapitanOptions(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                transactOneway(11, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
            public void onSetOptInOptions(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
            public void onSetSafetyOptions(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                transactOneway(13, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
            public void onUnregisterOptInOptionsChangedListener(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                transactOneway(5, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks");
        }

        public static IUsageReportingCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks");
            if (queryLocalInterface instanceof IUsageReportingCallbacks) {
                return (IUsageReportingCallbacks) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    Status status = (Status) iax.a(parcel, Status.CREATOR);
                    UsageReportingOptInOptions usageReportingOptInOptions = (UsageReportingOptInOptions) iax.a(parcel, UsageReportingOptInOptions.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetOptInOptions(status, usageReportingOptInOptions);
                    return true;
                case 3:
                    Status status2 = (Status) iax.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onSetOptInOptions(status2);
                    return true;
                case 4:
                    Status status3 = (Status) iax.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onRegisterOptInOptionsChangedListener(status3);
                    return true;
                case 5:
                    Status status4 = (Status) iax.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onUnregisterOptInOptionsChangedListener(status4);
                    return true;
                case 6:
                    Status status5 = (Status) iax.a(parcel, Status.CREATOR);
                    ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                    enforceNoDataAvail(parcel);
                    onGetAppWhitelist(status5, createStringArrayList);
                    return true;
                case 7:
                    Status status6 = (Status) iax.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onSetAppWhitelist(status6);
                    return true;
                case 8:
                    Status status7 = (Status) iax.a(parcel, Status.CREATOR);
                    boolean g = iax.g(parcel);
                    ConsentInformation consentInformation = (ConsentInformation) iax.a(parcel, ConsentInformation.CREATOR);
                    enforceNoDataAvail(parcel);
                    onCanLog(status7, g, consentInformation);
                    return true;
                case 9:
                    Status status8 = (Status) iax.a(parcel, Status.CREATOR);
                    ConsentInformation consentInformation2 = (ConsentInformation) iax.a(parcel, ConsentInformation.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetPassedWhitelists(status8, consentInformation2);
                    return true;
                case 10:
                    PendingIntent pendingIntent = (PendingIntent) iax.a(parcel, PendingIntent.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetCheckboxSettingsPendingIntent(pendingIntent);
                    return true;
                case 11:
                    Status status9 = (Status) iax.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onSetElCapitanOptions(status9);
                    return true;
                case 12:
                    Status status10 = (Status) iax.a(parcel, Status.CREATOR);
                    ElCapitanOptions elCapitanOptions = (ElCapitanOptions) iax.a(parcel, ElCapitanOptions.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetElCapitanOptions(status10, elCapitanOptions);
                    return true;
                case 13:
                    Status status11 = (Status) iax.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onSetSafetyOptions(status11);
                    return true;
                case 14:
                    Status status12 = (Status) iax.a(parcel, Status.CREATOR);
                    SafetyOptions safetyOptions = (SafetyOptions) iax.a(parcel, SafetyOptions.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetSafetyOptions(status12, safetyOptions);
                    return true;
                case 15:
                    Status status13 = (Status) iax.a(parcel, Status.CREATOR);
                    ConsentInformation consentInformation3 = (ConsentInformation) iax.a(parcel, ConsentInformation.CREATOR);
                    enforceNoDataAvail(parcel);
                    onCheckConsents(status13, consentInformation3);
                    return true;
                default:
                    return false;
            }
        }
    }

    void onCanLog(Status status, boolean z, ConsentInformation consentInformation);

    void onCheckConsents(Status status, ConsentInformation consentInformation);

    void onGetAppWhitelist(Status status, List<String> list);

    void onGetCheckboxSettingsPendingIntent(PendingIntent pendingIntent);

    void onGetElCapitanOptions(Status status, ElCapitanOptions elCapitanOptions);

    void onGetOptInOptions(Status status, UsageReportingOptInOptions usageReportingOptInOptions);

    void onGetPassedWhitelists(Status status, ConsentInformation consentInformation);

    void onGetSafetyOptions(Status status, SafetyOptions safetyOptions);

    void onRegisterOptInOptionsChangedListener(Status status);

    void onSetAppWhitelist(Status status);

    void onSetElCapitanOptions(Status status);

    void onSetOptInOptions(Status status);

    void onSetSafetyOptions(Status status);

    void onUnregisterOptInOptionsChangedListener(Status status);
}
