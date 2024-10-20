package com.google.android.gms.mdisync.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IMdiSyncCallbacks extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IMdiSyncCallbacks {
        static final int TRANSACTION_onSyncComplete = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IMdiSyncCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.mdisync.internal.IMdiSyncCallbacks");
            }

            @Override // com.google.android.gms.mdisync.internal.IMdiSyncCallbacks
            public void onSyncComplete(Status status, SyncResult syncResult) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, syncResult);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.mdisync.internal.IMdiSyncCallbacks");
        }

        public static IMdiSyncCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdisync.internal.IMdiSyncCallbacks");
            if (queryLocalInterface instanceof IMdiSyncCallbacks) {
                return (IMdiSyncCallbacks) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Status status = (Status) iax.a(parcel, Status.CREATOR);
                SyncResult syncResult = (SyncResult) iax.a(parcel, SyncResult.CREATOR);
                enforceNoDataAvail(parcel);
                onSyncComplete(status, syncResult);
                return true;
            }
            return false;
        }
    }

    void onSyncComplete(Status status, SyncResult syncResult);
}
