package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IFileDescriptorReceiver extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IFileDescriptorReceiver {
        static final int TRANSACTION_setFileDescriptor = 2;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IFileDescriptorReceiver {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.wearable.internal.IFileDescriptorReceiver");
            }

            @Override // com.google.android.gms.wearable.internal.IFileDescriptorReceiver
            public void setFileDescriptor(ParcelFileDescriptor parcelFileDescriptor) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, parcelFileDescriptor);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.wearable.internal.IFileDescriptorReceiver");
        }

        public static IFileDescriptorReceiver asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IFileDescriptorReceiver");
            if (queryLocalInterface instanceof IFileDescriptorReceiver) {
                return (IFileDescriptorReceiver) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) iax.a(parcel, ParcelFileDescriptor.CREATOR);
                enforceNoDataAvail(parcel);
                setFileDescriptor(parcelFileDescriptor);
                return true;
            }
            return false;
        }
    }

    void setFileDescriptor(ParcelFileDescriptor parcelFileDescriptor);
}
