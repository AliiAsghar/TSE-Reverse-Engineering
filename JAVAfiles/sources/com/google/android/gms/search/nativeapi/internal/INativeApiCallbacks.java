package com.google.android.gms.search.nativeapi.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.search.nativeapi.GetNativeApiInfoCall$Response;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface INativeApiCallbacks extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements INativeApiCallbacks {
        static final int TRANSACTION_onGetNativeApiInfoResponse = 2;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements INativeApiCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.search.nativeapi.internal.INativeApiCallbacks");
            }

            @Override // com.google.android.gms.search.nativeapi.internal.INativeApiCallbacks
            public void onGetNativeApiInfoResponse(GetNativeApiInfoCall$Response getNativeApiInfoCall$Response) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getNativeApiInfoCall$Response);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.search.nativeapi.internal.INativeApiCallbacks");
        }

        public static INativeApiCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.nativeapi.internal.INativeApiCallbacks");
            if (queryLocalInterface instanceof INativeApiCallbacks) {
                return (INativeApiCallbacks) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                GetNativeApiInfoCall$Response getNativeApiInfoCall$Response = (GetNativeApiInfoCall$Response) iax.a(parcel, GetNativeApiInfoCall$Response.CREATOR);
                enforceNoDataAvail(parcel);
                onGetNativeApiInfoResponse(getNativeApiInfoCall$Response);
                return true;
            }
            return false;
        }
    }

    void onGetNativeApiInfoResponse(GetNativeApiInfoCall$Response getNativeApiInfoCall$Response);
}
