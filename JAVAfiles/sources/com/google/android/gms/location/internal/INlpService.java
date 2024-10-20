package com.google.android.gms.location.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.location.NlpLocationRequest;
import com.google.android.gms.location.internal.ILocationStatusCallback;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface INlpService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements INlpService {
        static final int TRANSACTION_getCellBasedLocation = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements INlpService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.location.internal.INlpService");
            }

            @Override // com.google.android.gms.location.internal.INlpService
            public void getCellBasedLocation(NlpLocationRequest nlpLocationRequest, ILocationStatusCallback iLocationStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, nlpLocationRequest);
                iax.f(obtainAndWriteInterfaceToken, iLocationStatusCallback);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.location.internal.INlpService");
        }

        public static INlpService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.INlpService");
            if (queryLocalInterface instanceof INlpService) {
                return (INlpService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                NlpLocationRequest nlpLocationRequest = (NlpLocationRequest) iax.a(parcel, NlpLocationRequest.CREATOR);
                ILocationStatusCallback asInterface = ILocationStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                getCellBasedLocation(nlpLocationRequest, asInterface);
                parcel2.writeNoException();
                return true;
            }
            return false;
        }
    }

    void getCellBasedLocation(NlpLocationRequest nlpLocationRequest, ILocationStatusCallback iLocationStatusCallback);
}
