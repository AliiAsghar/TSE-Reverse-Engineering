package com.google.android.gms.clearcut.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IClearcutLoggerCallbacks extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IClearcutLoggerCallbacks {
        static final int TRANSACTION_onForceUpload = 2;
        static final int TRANSACTION_onGetCollectForDebugExpiryTime = 5;
        static final int TRANSACTION_onGetLogEventParcelables = 6;
        static final int TRANSACTION_onGetLogEventParcelablesDataBuffer = 7;
        static final int TRANSACTION_onLogError = 8;
        static final int TRANSACTION_onLogEvent = 1;
        static final int TRANSACTION_onStartCollectForDebug = 3;
        static final int TRANSACTION_onStopCollectForDebug = 4;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IClearcutLoggerCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
            }

            @Override // com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks
            public void onForceUpload(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks
            public void onGetCollectForDebugExpiryTime(Status status, long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeLong(j);
                transactOneway(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks
            public void onGetLogEventParcelables(Status status, LogEventParcelable[] logEventParcelableArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeTypedArray(logEventParcelableArr, 0);
                transactOneway(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks
            public void onGetLogEventParcelablesDataBuffer(DataHolder dataHolder) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, dataHolder);
                transactOneway(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks
            public void onLogError(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                transactOneway(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks
            public void onLogEvent(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks
            public void onStartCollectForDebug(Status status, long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeLong(j);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks
            public void onStopCollectForDebug(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                transactOneway(4, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
        }

        public static IClearcutLoggerCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
            if (queryLocalInterface instanceof IClearcutLoggerCallbacks) {
                return (IClearcutLoggerCallbacks) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    Status status = (Status) iax.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onLogEvent(status);
                    return true;
                case 2:
                    Status status2 = (Status) iax.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onForceUpload(status2);
                    return true;
                case 3:
                    Status status3 = (Status) iax.a(parcel, Status.CREATOR);
                    long readLong = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    onStartCollectForDebug(status3, readLong);
                    return true;
                case 4:
                    Status status4 = (Status) iax.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onStopCollectForDebug(status4);
                    return true;
                case 5:
                    Status status5 = (Status) iax.a(parcel, Status.CREATOR);
                    long readLong2 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    onGetCollectForDebugExpiryTime(status5, readLong2);
                    return true;
                case 6:
                    Status status6 = (Status) iax.a(parcel, Status.CREATOR);
                    LogEventParcelable[] logEventParcelableArr = (LogEventParcelable[]) parcel.createTypedArray(LogEventParcelable.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetLogEventParcelables(status6, logEventParcelableArr);
                    return true;
                case 7:
                    DataHolder dataHolder = (DataHolder) iax.a(parcel, DataHolder.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetLogEventParcelablesDataBuffer(dataHolder);
                    return true;
                case 8:
                    Status status7 = (Status) iax.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onLogError(status7);
                    return true;
                default:
                    return false;
            }
        }
    }

    void onForceUpload(Status status);

    void onGetCollectForDebugExpiryTime(Status status, long j);

    void onGetLogEventParcelables(Status status, LogEventParcelable[] logEventParcelableArr);

    void onGetLogEventParcelablesDataBuffer(DataHolder dataHolder);

    void onLogError(Status status);

    void onLogEvent(Status status);

    void onStartCollectForDebug(Status status, long j);

    void onStopCollectForDebug(Status status);
}
