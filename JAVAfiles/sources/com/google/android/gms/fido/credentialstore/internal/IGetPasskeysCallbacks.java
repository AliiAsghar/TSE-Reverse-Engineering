package com.google.android.gms.fido.credentialstore.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IGetPasskeysCallbacks extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IGetPasskeysCallbacks {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IGetPasskeysCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.credentialstore.internal.IGetPasskeysCallbacks");
            }

            @Override // com.google.android.gms.fido.credentialstore.internal.IGetPasskeysCallbacks
            public void onResult(Status status, ParcelFileDescriptor parcelFileDescriptor) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, parcelFileDescriptor);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.credentialstore.internal.IGetPasskeysCallbacks");
        }

        public static IGetPasskeysCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.credentialstore.internal.IGetPasskeysCallbacks");
            if (queryLocalInterface instanceof IGetPasskeysCallbacks) {
                return (IGetPasskeysCallbacks) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Status status = (Status) iax.a(parcel, Status.CREATOR);
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) iax.a(parcel, ParcelFileDescriptor.CREATOR);
                enforceNoDataAvail(parcel);
                onResult(status, parcelFileDescriptor);
                return true;
            }
            return false;
        }
    }

    void onResult(Status status, ParcelFileDescriptor parcelFileDescriptor);
}
