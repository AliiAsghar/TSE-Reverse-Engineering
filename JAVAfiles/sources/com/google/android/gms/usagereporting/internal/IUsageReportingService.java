package com.google.android.gms.usagereporting.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.usagereporting.ConsentInformation;
import com.google.android.gms.usagereporting.ElCapitanOptions;
import com.google.android.gms.usagereporting.SafetyOptions;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks;
import com.google.android.gms.usagereporting.internal.IUsageReportingOptInOptionsChangedListener;
import defpackage.iax;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IUsageReportingService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IUsageReportingService {
        static final int TRANSACTION_canLog = 8;
        static final int TRANSACTION_checkConsents = 16;
        static final int TRANSACTION_getAppWhitelist = 6;
        static final int TRANSACTION_getCheckboxSettingsPendingIntent = 11;
        static final int TRANSACTION_getElCapitanOptions = 13;
        static final int TRANSACTION_getOptInOptions = 2;
        static final int TRANSACTION_getPassedWhitelists = 9;
        static final int TRANSACTION_getSafetyOptions = 15;
        static final int TRANSACTION_registerOptInOptionsChangedListener = 4;
        static final int TRANSACTION_setAppWhitelist = 7;
        static final int TRANSACTION_setElCapitanOptions = 12;
        static final int TRANSACTION_setOptInOptions = 3;
        static final int TRANSACTION_setSafetyOptions = 14;
        static final int TRANSACTION_unregisterOptInOptionsChangedListener = 5;
        static final int TRANSACTION_unregisterOptInOptionsChangedListenerConnectionless = 10;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IUsageReportingService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.usagereporting.internal.IUsageReportingService");
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingService
            public void canLog(String str, IUsageReportingCallbacks iUsageReportingCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.f(obtainAndWriteInterfaceToken, iUsageReportingCallbacks);
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingService
            public void checkConsents(String str, IUsageReportingCallbacks iUsageReportingCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.f(obtainAndWriteInterfaceToken, iUsageReportingCallbacks);
                transactAndReadExceptionReturnVoid(16, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingService
            public void getAppWhitelist(int i, IUsageReportingCallbacks iUsageReportingCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                iax.f(obtainAndWriteInterfaceToken, iUsageReportingCallbacks);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingService
            public void getCheckboxSettingsPendingIntent(IUsageReportingCallbacks iUsageReportingCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iUsageReportingCallbacks);
                transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingService
            public void getElCapitanOptions(IUsageReportingCallbacks iUsageReportingCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iUsageReportingCallbacks);
                transactAndReadExceptionReturnVoid(13, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingService
            public void getOptInOptions(IUsageReportingCallbacks iUsageReportingCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iUsageReportingCallbacks);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingService
            public void getPassedWhitelists(String str, ConsentInformation consentInformation, IUsageReportingCallbacks iUsageReportingCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, consentInformation);
                iax.f(obtainAndWriteInterfaceToken, iUsageReportingCallbacks);
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingService
            public void getSafetyOptions(IUsageReportingCallbacks iUsageReportingCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iUsageReportingCallbacks);
                transactAndReadExceptionReturnVoid(15, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingService
            public void registerOptInOptionsChangedListener(IUsageReportingOptInOptionsChangedListener iUsageReportingOptInOptionsChangedListener, IUsageReportingCallbacks iUsageReportingCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iUsageReportingOptInOptionsChangedListener);
                iax.f(obtainAndWriteInterfaceToken, iUsageReportingCallbacks);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingService
            public void setAppWhitelist(int i, List<String> list, IUsageReportingCallbacks iUsageReportingCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeStringList(list);
                iax.f(obtainAndWriteInterfaceToken, iUsageReportingCallbacks);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingService
            public void setElCapitanOptions(ElCapitanOptions elCapitanOptions, IUsageReportingCallbacks iUsageReportingCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, elCapitanOptions);
                iax.f(obtainAndWriteInterfaceToken, iUsageReportingCallbacks);
                transactAndReadExceptionReturnVoid(12, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingService
            public void setOptInOptions(UsageReportingOptInOptions usageReportingOptInOptions, IUsageReportingCallbacks iUsageReportingCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, usageReportingOptInOptions);
                iax.f(obtainAndWriteInterfaceToken, iUsageReportingCallbacks);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingService
            public void setSafetyOptions(SafetyOptions safetyOptions, IUsageReportingCallbacks iUsageReportingCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, safetyOptions);
                iax.f(obtainAndWriteInterfaceToken, iUsageReportingCallbacks);
                transactAndReadExceptionReturnVoid(14, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingService
            public void unregisterOptInOptionsChangedListener(IUsageReportingOptInOptionsChangedListener iUsageReportingOptInOptionsChangedListener, IUsageReportingCallbacks iUsageReportingCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iUsageReportingOptInOptionsChangedListener);
                iax.f(obtainAndWriteInterfaceToken, iUsageReportingCallbacks);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingService
            public void unregisterOptInOptionsChangedListenerConnectionless(IUsageReportingOptInOptionsChangedListener iUsageReportingOptInOptionsChangedListener, IUsageReportingCallbacks iUsageReportingCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iUsageReportingOptInOptionsChangedListener);
                iax.f(obtainAndWriteInterfaceToken, iUsageReportingCallbacks);
                transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.usagereporting.internal.IUsageReportingService");
        }

        public static IUsageReportingService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingService");
            if (queryLocalInterface instanceof IUsageReportingService) {
                return (IUsageReportingService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    IUsageReportingCallbacks asInterface = IUsageReportingCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getOptInOptions(asInterface);
                    break;
                case 3:
                    UsageReportingOptInOptions usageReportingOptInOptions = (UsageReportingOptInOptions) iax.a(parcel, UsageReportingOptInOptions.CREATOR);
                    IUsageReportingCallbacks asInterface2 = IUsageReportingCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setOptInOptions(usageReportingOptInOptions, asInterface2);
                    break;
                case 4:
                    IUsageReportingOptInOptionsChangedListener asInterface3 = IUsageReportingOptInOptionsChangedListener.Stub.asInterface(parcel.readStrongBinder());
                    IUsageReportingCallbacks asInterface4 = IUsageReportingCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    registerOptInOptionsChangedListener(asInterface3, asInterface4);
                    break;
                case 5:
                    IUsageReportingOptInOptionsChangedListener asInterface5 = IUsageReportingOptInOptionsChangedListener.Stub.asInterface(parcel.readStrongBinder());
                    IUsageReportingCallbacks asInterface6 = IUsageReportingCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    unregisterOptInOptionsChangedListener(asInterface5, asInterface6);
                    break;
                case 6:
                    int readInt = parcel.readInt();
                    IUsageReportingCallbacks asInterface7 = IUsageReportingCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getAppWhitelist(readInt, asInterface7);
                    break;
                case 7:
                    int readInt2 = parcel.readInt();
                    ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                    IUsageReportingCallbacks asInterface8 = IUsageReportingCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setAppWhitelist(readInt2, createStringArrayList, asInterface8);
                    break;
                case 8:
                    String readString = parcel.readString();
                    IUsageReportingCallbacks asInterface9 = IUsageReportingCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    canLog(readString, asInterface9);
                    break;
                case 9:
                    String readString2 = parcel.readString();
                    ConsentInformation consentInformation = (ConsentInformation) iax.a(parcel, ConsentInformation.CREATOR);
                    IUsageReportingCallbacks asInterface10 = IUsageReportingCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getPassedWhitelists(readString2, consentInformation, asInterface10);
                    break;
                case 10:
                    IUsageReportingOptInOptionsChangedListener asInterface11 = IUsageReportingOptInOptionsChangedListener.Stub.asInterface(parcel.readStrongBinder());
                    IUsageReportingCallbacks asInterface12 = IUsageReportingCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    unregisterOptInOptionsChangedListenerConnectionless(asInterface11, asInterface12);
                    break;
                case 11:
                    IUsageReportingCallbacks asInterface13 = IUsageReportingCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getCheckboxSettingsPendingIntent(asInterface13);
                    break;
                case 12:
                    ElCapitanOptions elCapitanOptions = (ElCapitanOptions) iax.a(parcel, ElCapitanOptions.CREATOR);
                    IUsageReportingCallbacks asInterface14 = IUsageReportingCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setElCapitanOptions(elCapitanOptions, asInterface14);
                    break;
                case 13:
                    IUsageReportingCallbacks asInterface15 = IUsageReportingCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getElCapitanOptions(asInterface15);
                    break;
                case 14:
                    SafetyOptions safetyOptions = (SafetyOptions) iax.a(parcel, SafetyOptions.CREATOR);
                    IUsageReportingCallbacks asInterface16 = IUsageReportingCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setSafetyOptions(safetyOptions, asInterface16);
                    break;
                case 15:
                    IUsageReportingCallbacks asInterface17 = IUsageReportingCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getSafetyOptions(asInterface17);
                    break;
                case 16:
                    String readString3 = parcel.readString();
                    IUsageReportingCallbacks asInterface18 = IUsageReportingCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    checkConsents(readString3, asInterface18);
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void canLog(String str, IUsageReportingCallbacks iUsageReportingCallbacks);

    void checkConsents(String str, IUsageReportingCallbacks iUsageReportingCallbacks);

    void getAppWhitelist(int i, IUsageReportingCallbacks iUsageReportingCallbacks);

    void getCheckboxSettingsPendingIntent(IUsageReportingCallbacks iUsageReportingCallbacks);

    void getElCapitanOptions(IUsageReportingCallbacks iUsageReportingCallbacks);

    void getOptInOptions(IUsageReportingCallbacks iUsageReportingCallbacks);

    void getPassedWhitelists(String str, ConsentInformation consentInformation, IUsageReportingCallbacks iUsageReportingCallbacks);

    void getSafetyOptions(IUsageReportingCallbacks iUsageReportingCallbacks);

    void registerOptInOptionsChangedListener(IUsageReportingOptInOptionsChangedListener iUsageReportingOptInOptionsChangedListener, IUsageReportingCallbacks iUsageReportingCallbacks);

    void setAppWhitelist(int i, List<String> list, IUsageReportingCallbacks iUsageReportingCallbacks);

    void setElCapitanOptions(ElCapitanOptions elCapitanOptions, IUsageReportingCallbacks iUsageReportingCallbacks);

    void setOptInOptions(UsageReportingOptInOptions usageReportingOptInOptions, IUsageReportingCallbacks iUsageReportingCallbacks);

    void setSafetyOptions(SafetyOptions safetyOptions, IUsageReportingCallbacks iUsageReportingCallbacks);

    void unregisterOptInOptionsChangedListener(IUsageReportingOptInOptionsChangedListener iUsageReportingOptInOptionsChangedListener, IUsageReportingCallbacks iUsageReportingCallbacks);

    void unregisterOptInOptionsChangedListenerConnectionless(IUsageReportingOptInOptionsChangedListener iUsageReportingOptInOptionsChangedListener, IUsageReportingCallbacks iUsageReportingCallbacks);
}
