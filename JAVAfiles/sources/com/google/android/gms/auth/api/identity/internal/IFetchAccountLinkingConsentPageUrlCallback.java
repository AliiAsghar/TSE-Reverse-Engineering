package com.google.android.gms.auth.api.identity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IFetchAccountLinkingConsentPageUrlCallback extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IFetchAccountLinkingConsentPageUrlCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IFetchAccountLinkingConsentPageUrlCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.identity.internal.IFetchAccountLinkingConsentPageUrlCallback");
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IFetchAccountLinkingConsentPageUrlCallback
            public void onResult(Status status, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeString(str);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.identity.internal.IFetchAccountLinkingConsentPageUrlCallback");
        }

        public static IFetchAccountLinkingConsentPageUrlCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IFetchAccountLinkingConsentPageUrlCallback");
            if (queryLocalInterface instanceof IFetchAccountLinkingConsentPageUrlCallback) {
                return (IFetchAccountLinkingConsentPageUrlCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Status status = (Status) iax.a(parcel, Status.CREATOR);
                String readString = parcel.readString();
                enforceNoDataAvail(parcel);
                onResult(status, readString);
                return true;
            }
            return false;
        }
    }

    void onResult(Status status, String str);
}
