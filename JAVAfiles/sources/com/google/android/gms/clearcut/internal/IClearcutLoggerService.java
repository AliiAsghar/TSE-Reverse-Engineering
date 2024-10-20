package com.google.android.gms.clearcut.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IClearcutLoggerService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IClearcutLoggerService {
        static final int TRANSACTION_forceUpload = 2;
        static final int TRANSACTION_getCollectForDebugExpiryTime = 5;
        static final int TRANSACTION_getLogEventParcelables = 6;
        static final int TRANSACTION_getLogEventParcelablesAndClear = 7;
        static final int TRANSACTION_logError = 8;
        static final int TRANSACTION_logEvent = 1;
        static final int TRANSACTION_startCollectForDebug = 3;
        static final int TRANSACTION_stopCollectForDebug = 4;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IClearcutLoggerService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.clearcut.internal.IClearcutLoggerService");
            }

            @Override // com.google.android.gms.clearcut.internal.IClearcutLoggerService
            public void forceUpload(IClearcutLoggerCallbacks iClearcutLoggerCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iClearcutLoggerCallbacks);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.clearcut.internal.IClearcutLoggerService
            public void getCollectForDebugExpiryTime(IClearcutLoggerCallbacks iClearcutLoggerCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iClearcutLoggerCallbacks);
                transactOneway(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.clearcut.internal.IClearcutLoggerService
            public void getLogEventParcelables(IClearcutLoggerCallbacks iClearcutLoggerCallbacks, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iClearcutLoggerCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                transactOneway(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.clearcut.internal.IClearcutLoggerService
            public void getLogEventParcelablesAndClear(IClearcutLoggerCallbacks iClearcutLoggerCallbacks, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iClearcutLoggerCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                transactOneway(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.clearcut.internal.IClearcutLoggerService
            public void logError(IClearcutLoggerCallbacks iClearcutLoggerCallbacks, BatchedLogErrorParcelable batchedLogErrorParcelable) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iClearcutLoggerCallbacks);
                iax.d(obtainAndWriteInterfaceToken, batchedLogErrorParcelable);
                transactOneway(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.clearcut.internal.IClearcutLoggerService
            public void logEvent(IClearcutLoggerCallbacks iClearcutLoggerCallbacks, LogEventParcelable logEventParcelable) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iClearcutLoggerCallbacks);
                iax.d(obtainAndWriteInterfaceToken, logEventParcelable);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.clearcut.internal.IClearcutLoggerService
            public void startCollectForDebug(IClearcutLoggerCallbacks iClearcutLoggerCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iClearcutLoggerCallbacks);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.clearcut.internal.IClearcutLoggerService
            public void stopCollectForDebug(IClearcutLoggerCallbacks iClearcutLoggerCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iClearcutLoggerCallbacks);
                transactOneway(4, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        }

        public static IClearcutLoggerService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
            if (queryLocalInterface instanceof IClearcutLoggerService) {
                return (IClearcutLoggerService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IClearcutLoggerCallbacks asInterface = IClearcutLoggerCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    LogEventParcelable logEventParcelable = (LogEventParcelable) iax.a(parcel, LogEventParcelable.CREATOR);
                    enforceNoDataAvail(parcel);
                    logEvent(asInterface, logEventParcelable);
                    return true;
                case 2:
                    IClearcutLoggerCallbacks asInterface2 = IClearcutLoggerCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    forceUpload(asInterface2);
                    return true;
                case 3:
                    IClearcutLoggerCallbacks asInterface3 = IClearcutLoggerCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    startCollectForDebug(asInterface3);
                    return true;
                case 4:
                    IClearcutLoggerCallbacks asInterface4 = IClearcutLoggerCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    stopCollectForDebug(asInterface4);
                    return true;
                case 5:
                    IClearcutLoggerCallbacks asInterface5 = IClearcutLoggerCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getCollectForDebugExpiryTime(asInterface5);
                    return true;
                case 6:
                    IClearcutLoggerCallbacks asInterface6 = IClearcutLoggerCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getLogEventParcelables(asInterface6, readString);
                    return true;
                case 7:
                    IClearcutLoggerCallbacks asInterface7 = IClearcutLoggerCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString2 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getLogEventParcelablesAndClear(asInterface7, readString2);
                    return true;
                case 8:
                    IClearcutLoggerCallbacks asInterface8 = IClearcutLoggerCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    BatchedLogErrorParcelable batchedLogErrorParcelable = (BatchedLogErrorParcelable) iax.a(parcel, BatchedLogErrorParcelable.CREATOR);
                    enforceNoDataAvail(parcel);
                    logError(asInterface8, batchedLogErrorParcelable);
                    return true;
                default:
                    return false;
            }
        }
    }

    void forceUpload(IClearcutLoggerCallbacks iClearcutLoggerCallbacks);

    @Deprecated
    void getCollectForDebugExpiryTime(IClearcutLoggerCallbacks iClearcutLoggerCallbacks);

    void getLogEventParcelables(IClearcutLoggerCallbacks iClearcutLoggerCallbacks, String str);

    void getLogEventParcelablesAndClear(IClearcutLoggerCallbacks iClearcutLoggerCallbacks, String str);

    void logError(IClearcutLoggerCallbacks iClearcutLoggerCallbacks, BatchedLogErrorParcelable batchedLogErrorParcelable);

    void logEvent(IClearcutLoggerCallbacks iClearcutLoggerCallbacks, LogEventParcelable logEventParcelable);

    @Deprecated
    void startCollectForDebug(IClearcutLoggerCallbacks iClearcutLoggerCallbacks);

    @Deprecated
    void stopCollectForDebug(IClearcutLoggerCallbacks iClearcutLoggerCallbacks);
}
