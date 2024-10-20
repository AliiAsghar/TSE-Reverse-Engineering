package com.google.android.gms.telephonyspam.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.telephonyspam.CallSpamOptions;
import com.google.android.gms.telephonyspam.LookupSpamSettingsOptions;
import com.google.android.gms.telephonyspam.LookupSpamStatusOptions;
import com.google.android.gms.telephonyspam.MessageSpamOptions;
import com.google.android.gms.telephonyspam.ReportAsNotSpamOptions;
import com.google.android.gms.telephonyspam.ReportAsSpamOptions;
import com.google.android.gms.telephonyspam.UpdateSpamSettingsOptions;
import com.google.android.gms.telephonyspam.internal.ITelephonySpamCallbacks;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ITelephonySpamService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ITelephonySpamService {
        static final int TRANSACTION_getSpamSettings = 5;
        static final int TRANSACTION_getSpamStatus = 2;
        static final int TRANSACTION_lookupSpamSettings = 10;
        static final int TRANSACTION_lookupSpamStatus = 7;
        static final int TRANSACTION_reportAsNotSpam = 9;
        static final int TRANSACTION_reportAsSpam = 8;
        static final int TRANSACTION_reportCallSpamStatus = 14;
        static final int TRANSACTION_reportMessageSpamStatus = 15;
        static final int TRANSACTION_reportNotSpam = 4;
        static final int TRANSACTION_reportSpam = 3;
        static final int TRANSACTION_setSpamSettings = 6;
        static final int TRANSACTION_updateSpamSettings = 11;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ITelephonySpamService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.telephonyspam.internal.ITelephonySpamService");
            }

            @Override // com.google.android.gms.telephonyspam.internal.ITelephonySpamService
            public void getSpamSettings(ITelephonySpamCallbacks iTelephonySpamCallbacks, int i, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iTelephonySpamCallbacks);
                obtainAndWriteInterfaceToken.writeInt(i);
                iax.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.telephonyspam.internal.ITelephonySpamService
            public void getSpamStatus(ITelephonySpamCallbacks iTelephonySpamCallbacks, String str, int i, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iTelephonySpamCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                iax.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.telephonyspam.internal.ITelephonySpamService
            public void lookupSpamSettings(ITelephonySpamCallbacks iTelephonySpamCallbacks, int i, LookupSpamSettingsOptions lookupSpamSettingsOptions, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iTelephonySpamCallbacks);
                obtainAndWriteInterfaceToken.writeInt(i);
                iax.d(obtainAndWriteInterfaceToken, lookupSpamSettingsOptions);
                iax.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.telephonyspam.internal.ITelephonySpamService
            public void lookupSpamStatus(ITelephonySpamCallbacks iTelephonySpamCallbacks, String str, int i, LookupSpamStatusOptions lookupSpamStatusOptions, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iTelephonySpamCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                iax.d(obtainAndWriteInterfaceToken, lookupSpamStatusOptions);
                iax.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.telephonyspam.internal.ITelephonySpamService
            public void reportAsNotSpam(IStatusCallback iStatusCallback, String str, int i, ReportAsNotSpamOptions reportAsNotSpamOptions, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                iax.d(obtainAndWriteInterfaceToken, reportAsNotSpamOptions);
                iax.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.telephonyspam.internal.ITelephonySpamService
            public void reportAsSpam(IStatusCallback iStatusCallback, String str, int i, ReportAsSpamOptions reportAsSpamOptions, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                iax.d(obtainAndWriteInterfaceToken, reportAsSpamOptions);
                iax.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.telephonyspam.internal.ITelephonySpamService
            public void reportCallSpamStatus(IStatusCallback iStatusCallback, String str, boolean z, CallSpamOptions callSpamOptions, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                iax.d(obtainAndWriteInterfaceToken, callSpamOptions);
                iax.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(14, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.telephonyspam.internal.ITelephonySpamService
            public void reportMessageSpamStatus(IStatusCallback iStatusCallback, String str, boolean z, MessageSpamOptions messageSpamOptions, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                iax.d(obtainAndWriteInterfaceToken, messageSpamOptions);
                iax.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(15, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.telephonyspam.internal.ITelephonySpamService
            public void reportNotSpam(IStatusCallback iStatusCallback, String str, int i, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                iax.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.telephonyspam.internal.ITelephonySpamService
            public void reportSpam(IStatusCallback iStatusCallback, String str, int i, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                iax.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.telephonyspam.internal.ITelephonySpamService
            public void setSpamSettings(IStatusCallback iStatusCallback, int i, boolean z, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                iax.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.telephonyspam.internal.ITelephonySpamService
            public void updateSpamSettings(IStatusCallback iStatusCallback, int i, boolean z, UpdateSpamSettingsOptions updateSpamSettingsOptions, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                iax.d(obtainAndWriteInterfaceToken, updateSpamSettingsOptions);
                iax.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.telephonyspam.internal.ITelephonySpamService");
        }

        public static ITelephonySpamService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.telephonyspam.internal.ITelephonySpamService");
            if (queryLocalInterface instanceof ITelephonySpamService) {
                return (ITelephonySpamService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    ITelephonySpamCallbacks asInterface = ITelephonySpamCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString = parcel.readString();
                    int readInt = parcel.readInt();
                    ApiMetadata apiMetadata = (ApiMetadata) iax.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getSpamStatus(asInterface, readString, readInt, apiMetadata);
                    break;
                case 3:
                    IStatusCallback asInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString2 = parcel.readString();
                    int readInt2 = parcel.readInt();
                    ApiMetadata apiMetadata2 = (ApiMetadata) iax.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    reportSpam(asInterface2, readString2, readInt2, apiMetadata2);
                    break;
                case 4:
                    IStatusCallback asInterface3 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString3 = parcel.readString();
                    int readInt3 = parcel.readInt();
                    ApiMetadata apiMetadata3 = (ApiMetadata) iax.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    reportNotSpam(asInterface3, readString3, readInt3, apiMetadata3);
                    break;
                case 5:
                    ITelephonySpamCallbacks asInterface4 = ITelephonySpamCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    int readInt4 = parcel.readInt();
                    ApiMetadata apiMetadata4 = (ApiMetadata) iax.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getSpamSettings(asInterface4, readInt4, apiMetadata4);
                    break;
                case 6:
                    IStatusCallback asInterface5 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    int readInt5 = parcel.readInt();
                    boolean g = iax.g(parcel);
                    ApiMetadata apiMetadata5 = (ApiMetadata) iax.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    setSpamSettings(asInterface5, readInt5, g, apiMetadata5);
                    break;
                case 7:
                    ITelephonySpamCallbacks asInterface6 = ITelephonySpamCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString4 = parcel.readString();
                    int readInt6 = parcel.readInt();
                    LookupSpamStatusOptions lookupSpamStatusOptions = (LookupSpamStatusOptions) iax.a(parcel, LookupSpamStatusOptions.CREATOR);
                    ApiMetadata apiMetadata6 = (ApiMetadata) iax.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    lookupSpamStatus(asInterface6, readString4, readInt6, lookupSpamStatusOptions, apiMetadata6);
                    break;
                case 8:
                    IStatusCallback asInterface7 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString5 = parcel.readString();
                    int readInt7 = parcel.readInt();
                    ReportAsSpamOptions reportAsSpamOptions = (ReportAsSpamOptions) iax.a(parcel, ReportAsSpamOptions.CREATOR);
                    ApiMetadata apiMetadata7 = (ApiMetadata) iax.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    reportAsSpam(asInterface7, readString5, readInt7, reportAsSpamOptions, apiMetadata7);
                    break;
                case 9:
                    IStatusCallback asInterface8 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString6 = parcel.readString();
                    int readInt8 = parcel.readInt();
                    ReportAsNotSpamOptions reportAsNotSpamOptions = (ReportAsNotSpamOptions) iax.a(parcel, ReportAsNotSpamOptions.CREATOR);
                    ApiMetadata apiMetadata8 = (ApiMetadata) iax.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    reportAsNotSpam(asInterface8, readString6, readInt8, reportAsNotSpamOptions, apiMetadata8);
                    break;
                case 10:
                    ITelephonySpamCallbacks asInterface9 = ITelephonySpamCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    int readInt9 = parcel.readInt();
                    LookupSpamSettingsOptions lookupSpamSettingsOptions = (LookupSpamSettingsOptions) iax.a(parcel, LookupSpamSettingsOptions.CREATOR);
                    ApiMetadata apiMetadata9 = (ApiMetadata) iax.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    lookupSpamSettings(asInterface9, readInt9, lookupSpamSettingsOptions, apiMetadata9);
                    break;
                case 11:
                    IStatusCallback asInterface10 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    int readInt10 = parcel.readInt();
                    boolean g2 = iax.g(parcel);
                    UpdateSpamSettingsOptions updateSpamSettingsOptions = (UpdateSpamSettingsOptions) iax.a(parcel, UpdateSpamSettingsOptions.CREATOR);
                    ApiMetadata apiMetadata10 = (ApiMetadata) iax.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    updateSpamSettings(asInterface10, readInt10, g2, updateSpamSettingsOptions, apiMetadata10);
                    break;
                case 12:
                case 13:
                default:
                    return false;
                case 14:
                    IStatusCallback asInterface11 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString7 = parcel.readString();
                    boolean g3 = iax.g(parcel);
                    CallSpamOptions callSpamOptions = (CallSpamOptions) iax.a(parcel, CallSpamOptions.CREATOR);
                    ApiMetadata apiMetadata11 = (ApiMetadata) iax.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    reportCallSpamStatus(asInterface11, readString7, g3, callSpamOptions, apiMetadata11);
                    break;
                case 15:
                    IStatusCallback asInterface12 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString8 = parcel.readString();
                    boolean g4 = iax.g(parcel);
                    MessageSpamOptions messageSpamOptions = (MessageSpamOptions) iax.a(parcel, MessageSpamOptions.CREATOR);
                    ApiMetadata apiMetadata12 = (ApiMetadata) iax.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    reportMessageSpamStatus(asInterface12, readString8, g4, messageSpamOptions, apiMetadata12);
                    break;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void getSpamSettings(ITelephonySpamCallbacks iTelephonySpamCallbacks, int i, ApiMetadata apiMetadata);

    void getSpamStatus(ITelephonySpamCallbacks iTelephonySpamCallbacks, String str, int i, ApiMetadata apiMetadata);

    void lookupSpamSettings(ITelephonySpamCallbacks iTelephonySpamCallbacks, int i, LookupSpamSettingsOptions lookupSpamSettingsOptions, ApiMetadata apiMetadata);

    void lookupSpamStatus(ITelephonySpamCallbacks iTelephonySpamCallbacks, String str, int i, LookupSpamStatusOptions lookupSpamStatusOptions, ApiMetadata apiMetadata);

    void reportAsNotSpam(IStatusCallback iStatusCallback, String str, int i, ReportAsNotSpamOptions reportAsNotSpamOptions, ApiMetadata apiMetadata);

    void reportAsSpam(IStatusCallback iStatusCallback, String str, int i, ReportAsSpamOptions reportAsSpamOptions, ApiMetadata apiMetadata);

    void reportCallSpamStatus(IStatusCallback iStatusCallback, String str, boolean z, CallSpamOptions callSpamOptions, ApiMetadata apiMetadata);

    void reportMessageSpamStatus(IStatusCallback iStatusCallback, String str, boolean z, MessageSpamOptions messageSpamOptions, ApiMetadata apiMetadata);

    void reportNotSpam(IStatusCallback iStatusCallback, String str, int i, ApiMetadata apiMetadata);

    void reportSpam(IStatusCallback iStatusCallback, String str, int i, ApiMetadata apiMetadata);

    void setSpamSettings(IStatusCallback iStatusCallback, int i, boolean z, ApiMetadata apiMetadata);

    void updateSpamSettings(IStatusCallback iStatusCallback, int i, boolean z, UpdateSpamSettingsOptions updateSpamSettingsOptions, ApiMetadata apiMetadata);
}
