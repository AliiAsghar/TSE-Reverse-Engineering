package com.google.android.gms.mobstore;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IMobStoreFileCallbacks extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IMobStoreFileCallbacks {
        static final int TRANSACTION_onFileDeleted = 2;
        static final int TRANSACTION_onFileDescriptorOpened = 1;
        static final int TRANSACTION_onRenamed = 3;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IMobStoreFileCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.mobstore.IMobStoreFileCallbacks");
            }

            @Override // com.google.android.gms.mobstore.IMobStoreFileCallbacks
            public void onFileDeleted(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mobstore.IMobStoreFileCallbacks
            public void onFileDescriptorOpened(Status status, OpenFileDescriptorResponse openFileDescriptorResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, openFileDescriptorResponse);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mobstore.IMobStoreFileCallbacks
            public void onRenamed(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.mobstore.IMobStoreFileCallbacks");
        }

        public static IMobStoreFileCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mobstore.IMobStoreFileCallbacks");
            if (queryLocalInterface instanceof IMobStoreFileCallbacks) {
                return (IMobStoreFileCallbacks) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    Status status = (Status) iax.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onRenamed(status);
                } else {
                    Status status2 = (Status) iax.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onFileDeleted(status2);
                }
            } else {
                Status status3 = (Status) iax.a(parcel, Status.CREATOR);
                OpenFileDescriptorResponse openFileDescriptorResponse = (OpenFileDescriptorResponse) iax.a(parcel, OpenFileDescriptorResponse.CREATOR);
                enforceNoDataAvail(parcel);
                onFileDescriptorOpened(status3, openFileDescriptorResponse);
            }
            return true;
        }
    }

    void onFileDeleted(Status status);

    void onFileDescriptorOpened(Status status, OpenFileDescriptorResponse openFileDescriptorResponse);

    void onRenamed(Status status);
}
