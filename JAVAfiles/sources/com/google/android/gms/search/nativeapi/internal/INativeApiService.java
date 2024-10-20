package com.google.android.gms.search.nativeapi.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.search.nativeapi.GetNativeApiInfoCall$Request;
import com.google.android.gms.search.nativeapi.internal.INativeApiCallbacks;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface INativeApiService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements INativeApiService {
        static final int TRANSACTION_getNativeApiInfo = 2;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements INativeApiService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.search.nativeapi.internal.INativeApiService");
            }

            @Override // com.google.android.gms.search.nativeapi.internal.INativeApiService
            public void getNativeApiInfo(GetNativeApiInfoCall$Request getNativeApiInfoCall$Request, INativeApiCallbacks iNativeApiCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getNativeApiInfoCall$Request);
                iax.f(obtainAndWriteInterfaceToken, iNativeApiCallbacks);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.search.nativeapi.internal.INativeApiService");
        }

        public static INativeApiService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.nativeapi.internal.INativeApiService");
            if (queryLocalInterface instanceof INativeApiService) {
                return (INativeApiService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                GetNativeApiInfoCall$Request getNativeApiInfoCall$Request = (GetNativeApiInfoCall$Request) iax.a(parcel, GetNativeApiInfoCall$Request.CREATOR);
                INativeApiCallbacks asInterface = INativeApiCallbacks.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                getNativeApiInfo(getNativeApiInfoCall$Request, asInterface);
                parcel2.writeNoException();
                return true;
            }
            return false;
        }
    }

    void getNativeApiInfo(GetNativeApiInfoCall$Request getNativeApiInfoCall$Request, INativeApiCallbacks iNativeApiCallbacks);
}
