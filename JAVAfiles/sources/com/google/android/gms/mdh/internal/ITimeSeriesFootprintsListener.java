package com.google.android.gms.mdh.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.mdh.SyncStatus;
import com.google.android.gms.mdh.TimeSeriesFootprintsSubscriptionFilter;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ITimeSeriesFootprintsListener extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ITimeSeriesFootprintsListener {
        static final int TRANSACTION_onFootprintsDeleted = 3;
        static final int TRANSACTION_onFootprintsUpdate = 2;
        static final int TRANSACTION_onSnapshot = 1;
        static final int TRANSACTION_onSyncComplete = 4;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ITimeSeriesFootprintsListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.mdh.internal.ITimeSeriesFootprintsListener");
            }

            @Override // com.google.android.gms.mdh.internal.ITimeSeriesFootprintsListener
            public void onFootprintsDeleted(IStatusCallback iStatusCallback, long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeLong(j);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.ITimeSeriesFootprintsListener
            public void onFootprintsUpdate(IStatusCallback iStatusCallback, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, mdhFootprintListSafeParcelable);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.ITimeSeriesFootprintsListener
            public void onSnapshot(IStatusCallback iStatusCallback, TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, timeSeriesFootprintsSubscriptionFilter);
                iax.d(obtainAndWriteInterfaceToken, mdhFootprintListSafeParcelable);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.ITimeSeriesFootprintsListener
            public void onSyncComplete(IStatusCallback iStatusCallback, SyncStatus syncStatus) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, syncStatus);
                transactOneway(4, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.mdh.internal.ITimeSeriesFootprintsListener");
        }

        public static ITimeSeriesFootprintsListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdh.internal.ITimeSeriesFootprintsListener");
            if (queryLocalInterface instanceof ITimeSeriesFootprintsListener) {
                return (ITimeSeriesFootprintsListener) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return false;
                        }
                        IStatusCallback asInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                        SyncStatus syncStatus = (SyncStatus) iax.a(parcel, SyncStatus.CREATOR);
                        enforceNoDataAvail(parcel);
                        onSyncComplete(asInterface, syncStatus);
                    } else {
                        IStatusCallback asInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                        long readLong = parcel.readLong();
                        enforceNoDataAvail(parcel);
                        onFootprintsDeleted(asInterface2, readLong);
                    }
                } else {
                    IStatusCallback asInterface3 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable = (MdhFootprintListSafeParcelable) iax.a(parcel, MdhFootprintListSafeParcelable.CREATOR);
                    enforceNoDataAvail(parcel);
                    onFootprintsUpdate(asInterface3, mdhFootprintListSafeParcelable);
                }
            } else {
                IStatusCallback asInterface4 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter = (TimeSeriesFootprintsSubscriptionFilter) iax.a(parcel, TimeSeriesFootprintsSubscriptionFilter.CREATOR);
                MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable2 = (MdhFootprintListSafeParcelable) iax.a(parcel, MdhFootprintListSafeParcelable.CREATOR);
                enforceNoDataAvail(parcel);
                onSnapshot(asInterface4, timeSeriesFootprintsSubscriptionFilter, mdhFootprintListSafeParcelable2);
            }
            return true;
        }
    }

    void onFootprintsDeleted(IStatusCallback iStatusCallback, long j);

    void onFootprintsUpdate(IStatusCallback iStatusCallback, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable);

    void onSnapshot(IStatusCallback iStatusCallback, TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable);

    void onSyncComplete(IStatusCallback iStatusCallback, SyncStatus syncStatus);
}
