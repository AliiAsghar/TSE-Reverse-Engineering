package com.google.android.gms.mdh.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.SyncStatus;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ILatestFootprintListener extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ILatestFootprintListener {
        static final int TRANSACTION_onFootprintsDeleted = 3;
        static final int TRANSACTION_onFootprintsUpdate = 2;
        static final int TRANSACTION_onSnapshot = 1;
        static final int TRANSACTION_onSyncCompleteWithStatus = 5;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ILatestFootprintListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.mdh.internal.ILatestFootprintListener");
            }

            @Override // com.google.android.gms.mdh.internal.ILatestFootprintListener
            public void onFootprintsDeleted(IStatusCallback iStatusCallback, byte[] bArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.ILatestFootprintListener
            public void onFootprintsUpdate(IStatusCallback iStatusCallback, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, mdhFootprintListSafeParcelable);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.ILatestFootprintListener
            public void onSnapshot(IStatusCallback iStatusCallback, LatestFootprintFilter latestFootprintFilter, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, latestFootprintFilter);
                iax.d(obtainAndWriteInterfaceToken, mdhFootprintListSafeParcelable);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.ILatestFootprintListener
            public void onSyncCompleteWithStatus(IStatusCallback iStatusCallback, SyncStatus syncStatus) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, syncStatus);
                transactOneway(5, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.mdh.internal.ILatestFootprintListener");
        }

        public static ILatestFootprintListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdh.internal.ILatestFootprintListener");
            if (queryLocalInterface instanceof ILatestFootprintListener) {
                return (ILatestFootprintListener) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 5) {
                            return false;
                        }
                        IStatusCallback asInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                        SyncStatus syncStatus = (SyncStatus) iax.a(parcel, SyncStatus.CREATOR);
                        enforceNoDataAvail(parcel);
                        onSyncCompleteWithStatus(asInterface, syncStatus);
                    } else {
                        IStatusCallback asInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                        byte[] createByteArray = parcel.createByteArray();
                        enforceNoDataAvail(parcel);
                        onFootprintsDeleted(asInterface2, createByteArray);
                    }
                } else {
                    IStatusCallback asInterface3 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable = (MdhFootprintListSafeParcelable) iax.a(parcel, MdhFootprintListSafeParcelable.CREATOR);
                    enforceNoDataAvail(parcel);
                    onFootprintsUpdate(asInterface3, mdhFootprintListSafeParcelable);
                }
            } else {
                IStatusCallback asInterface4 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                LatestFootprintFilter latestFootprintFilter = (LatestFootprintFilter) iax.a(parcel, LatestFootprintFilter.CREATOR);
                MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable2 = (MdhFootprintListSafeParcelable) iax.a(parcel, MdhFootprintListSafeParcelable.CREATOR);
                enforceNoDataAvail(parcel);
                onSnapshot(asInterface4, latestFootprintFilter, mdhFootprintListSafeParcelable2);
            }
            return true;
        }
    }

    void onFootprintsDeleted(IStatusCallback iStatusCallback, byte[] bArr);

    void onFootprintsUpdate(IStatusCallback iStatusCallback, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable);

    void onSnapshot(IStatusCallback iStatusCallback, LatestFootprintFilter latestFootprintFilter, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable);

    void onSyncCompleteWithStatus(IStatusCallback iStatusCallback, SyncStatus syncStatus);
}
