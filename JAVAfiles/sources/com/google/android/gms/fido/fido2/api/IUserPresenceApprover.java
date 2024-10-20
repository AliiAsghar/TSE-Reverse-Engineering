package com.google.android.gms.fido.fido2.api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IUserPresenceApprover extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IUserPresenceApprover {
        static final int TRANSACTION_approve = 1;
        static final int TRANSACTION_reject = 2;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IUserPresenceApprover {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.fido2.api.IUserPresenceApprover");
            }

            @Override // com.google.android.gms.fido.fido2.api.IUserPresenceApprover
            public void approve() {
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.fido.fido2.api.IUserPresenceApprover
            public void reject() {
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.fido2.api.IUserPresenceApprover");
        }

        public static IUserPresenceApprover asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.api.IUserPresenceApprover");
            if (queryLocalInterface instanceof IUserPresenceApprover) {
                return (IUserPresenceApprover) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                reject();
            } else {
                approve();
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void approve();

    void reject();
}
