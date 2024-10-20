package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IGmsCallbacks extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IGmsCallbacks {
        static final int TRANSACTION_onAccountValidationComplete = 2;
        static final int TRANSACTION_onPostInitComplete = 1;
        static final int TRANSACTION_onPostInitCompleteWithConnectionInfo = 3;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IGmsCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
            }

            @Override // com.google.android.gms.common.internal.IGmsCallbacks
            public void onAccountValidationComplete(int i, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.common.internal.IGmsCallbacks
            public void onPostInitComplete(int i, IBinder iBinder, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeStrongBinder(iBinder);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.common.internal.IGmsCallbacks
            public void onPostInitCompleteWithConnectionInfo(int i, IBinder iBinder, ConnectionInfo connectionInfo) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeStrongBinder(iBinder);
                iax.d(obtainAndWriteInterfaceToken, connectionInfo);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        public static IGmsCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
            if (queryLocalInterface instanceof IGmsCallbacks) {
                return (IGmsCallbacks) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    int readInt = parcel.readInt();
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    ConnectionInfo connectionInfo = (ConnectionInfo) iax.a(parcel, ConnectionInfo.CREATOR);
                    enforceNoDataAvail(parcel);
                    onPostInitCompleteWithConnectionInfo(readInt, readStrongBinder, connectionInfo);
                } else {
                    int readInt2 = parcel.readInt();
                    Bundle bundle = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onAccountValidationComplete(readInt2, bundle);
                }
            } else {
                int readInt3 = parcel.readInt();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                Bundle bundle2 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                onPostInitComplete(readInt3, readStrongBinder2, bundle2);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onAccountValidationComplete(int i, Bundle bundle);

    void onPostInitComplete(int i, IBinder iBinder, Bundle bundle);

    void onPostInitCompleteWithConnectionInfo(int i, IBinder iBinder, ConnectionInfo connectionInfo);
}
