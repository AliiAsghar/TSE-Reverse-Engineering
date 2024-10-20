package com.google.android.gms.mdd;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IMddFileGroupCallback extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IMddFileGroupCallback {
        static final int TRANSACTION_onFilesRetrieved = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IMddFileGroupCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.mdd.IMddFileGroupCallback");
            }

            @Override // com.google.android.gms.mdd.IMddFileGroupCallback
            public void onFilesRetrieved(Status status, FileGroupResponse fileGroupResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, fileGroupResponse);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.mdd.IMddFileGroupCallback");
        }

        public static IMddFileGroupCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdd.IMddFileGroupCallback");
            if (queryLocalInterface instanceof IMddFileGroupCallback) {
                return (IMddFileGroupCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Status status = (Status) iax.a(parcel, Status.CREATOR);
                FileGroupResponse fileGroupResponse = (FileGroupResponse) iax.a(parcel, FileGroupResponse.CREATOR);
                enforceNoDataAvail(parcel);
                onFilesRetrieved(status, fileGroupResponse);
                return true;
            }
            return false;
        }
    }

    void onFilesRetrieved(Status status, FileGroupResponse fileGroupResponse);
}
