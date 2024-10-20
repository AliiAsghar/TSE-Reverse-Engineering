package com.google.android.gms.auth.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IAuthCallbacks extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IAuthCallbacks {
        static final int TRANSACTION_handleProxyResponse = 1;
        static final int TRANSACTION_handleSpatulaHeader = 2;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IAuthCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.internal.IAuthCallbacks");
            }

            @Override // com.google.android.gms.auth.api.internal.IAuthCallbacks
            public void handleProxyResponse(ProxyResponse proxyResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, proxyResponse);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.internal.IAuthCallbacks
            public void handleSpatulaHeader(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
        }

        public static IAuthCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthCallbacks");
            if (queryLocalInterface instanceof IAuthCallbacks) {
                return (IAuthCallbacks) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                String readString = parcel.readString();
                enforceNoDataAvail(parcel);
                handleSpatulaHeader(readString);
            } else {
                ProxyResponse proxyResponse = (ProxyResponse) iax.a(parcel, ProxyResponse.CREATOR);
                enforceNoDataAvail(parcel);
                handleProxyResponse(proxyResponse);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void handleProxyResponse(ProxyResponse proxyResponse);

    void handleSpatulaHeader(String str);
}
