package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IRevocationService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IRevocationService {
        static final int TRANSACTION_cleanupClientState = 2;
        static final int TRANSACTION_revokeAccess = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IRevocationService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.signin.internal.IRevocationService");
            }

            @Override // com.google.android.gms.auth.api.signin.internal.IRevocationService
            public void cleanupClientState() {
                transactOneway(2, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.auth.api.signin.internal.IRevocationService
            public void revokeAccess() {
                transactOneway(1, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
        }

        public static IRevocationService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.IRevocationService");
            if (queryLocalInterface instanceof IRevocationService) {
                return (IRevocationService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                cleanupClientState();
            } else {
                revokeAccess();
            }
            return true;
        }
    }

    void cleanupClientState();

    void revokeAccess();
}
