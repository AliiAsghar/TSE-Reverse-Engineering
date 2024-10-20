package com.google.android.gms.auth.api.identity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
import com.google.android.gms.common.api.Status;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ISaveAccountLinkingTokenCallback extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ISaveAccountLinkingTokenCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ISaveAccountLinkingTokenCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISaveAccountLinkingTokenCallback");
            }

            @Override // com.google.android.gms.auth.api.identity.internal.ISaveAccountLinkingTokenCallback
            public void onResult(Status status, SaveAccountLinkingTokenResult saveAccountLinkingTokenResult) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, saveAccountLinkingTokenResult);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.identity.internal.ISaveAccountLinkingTokenCallback");
        }

        public static ISaveAccountLinkingTokenCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISaveAccountLinkingTokenCallback");
            if (queryLocalInterface instanceof ISaveAccountLinkingTokenCallback) {
                return (ISaveAccountLinkingTokenCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Status status = (Status) iax.a(parcel, Status.CREATOR);
                SaveAccountLinkingTokenResult saveAccountLinkingTokenResult = (SaveAccountLinkingTokenResult) iax.a(parcel, SaveAccountLinkingTokenResult.CREATOR);
                enforceNoDataAvail(parcel);
                onResult(status, saveAccountLinkingTokenResult);
                return true;
            }
            return false;
        }
    }

    void onResult(Status status, SaveAccountLinkingTokenResult saveAccountLinkingTokenResult);
}
