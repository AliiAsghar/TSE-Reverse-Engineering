package com.google.android.gms.fido.targetdevice.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.targetdevice.internal.IStartDirectTransferCallbacks;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ITargetDirectTransferService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ITargetDirectTransferService {
        static final int TRANSACTION_cancelDirectTransfer = 2;
        static final int TRANSACTION_startDirectTransfer = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ITargetDirectTransferService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.targetdevice.internal.ITargetDirectTransferService");
            }

            @Override // com.google.android.gms.fido.targetdevice.internal.ITargetDirectTransferService
            public void cancelDirectTransfer(IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.targetdevice.internal.ITargetDirectTransferService
            public void startDirectTransfer(IStartDirectTransferCallbacks iStartDirectTransferCallbacks, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStartDirectTransferCallbacks);
                iax.d(obtainAndWriteInterfaceToken, publicKeyCredentialRequestOptions);
                iax.d(obtainAndWriteInterfaceToken, parcelFileDescriptor);
                iax.d(obtainAndWriteInterfaceToken, parcelFileDescriptor2);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.targetdevice.internal.ITargetDirectTransferService");
        }

        public static ITargetDirectTransferService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.targetdevice.internal.ITargetDirectTransferService");
            if (queryLocalInterface instanceof ITargetDirectTransferService) {
                return (ITargetDirectTransferService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                IStatusCallback asInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                cancelDirectTransfer(asInterface);
            } else {
                IStartDirectTransferCallbacks asInterface2 = IStartDirectTransferCallbacks.Stub.asInterface(parcel.readStrongBinder());
                PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) iax.a(parcel, PublicKeyCredentialRequestOptions.CREATOR);
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) iax.a(parcel, ParcelFileDescriptor.CREATOR);
                ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) iax.a(parcel, ParcelFileDescriptor.CREATOR);
                enforceNoDataAvail(parcel);
                startDirectTransfer(asInterface2, publicKeyCredentialRequestOptions, parcelFileDescriptor, parcelFileDescriptor2);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void cancelDirectTransfer(IStatusCallback iStatusCallback);

    void startDirectTransfer(IStartDirectTransferCallbacks iStartDirectTransferCallbacks, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2);
}
