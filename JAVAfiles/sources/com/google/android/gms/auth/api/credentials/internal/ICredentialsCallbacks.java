package com.google.android.gms.auth.api.credentials.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ICredentialsCallbacks extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ICredentialsCallbacks {
        static final int TRANSACTION_onCredentialResult = 1;
        static final int TRANSACTION_onStatusResult = 2;
        static final int TRANSACTION_onStringResult = 3;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ICredentialsCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks
            public void onCredentialResult(Status status, Credential credential) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, credential);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks
            public void onStatusResult(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks
            public void onStringResult(Status status, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
        }

        public static ICredentialsCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
            if (queryLocalInterface instanceof ICredentialsCallbacks) {
                return (ICredentialsCallbacks) queryLocalInterface;
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
                    Status status = (Status) iax.a(parcel, Status.CREATOR);
                    String readString = parcel.readString();
                    enforceNoDataAvail(parcel);
                    onStringResult(status, readString);
                } else {
                    Status status2 = (Status) iax.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onStatusResult(status2);
                }
            } else {
                Status status3 = (Status) iax.a(parcel, Status.CREATOR);
                Credential credential = (Credential) iax.a(parcel, Credential.CREATOR);
                enforceNoDataAvail(parcel);
                onCredentialResult(status3, credential);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onCredentialResult(Status status, Credential credential);

    void onStatusResult(Status status);

    void onStringResult(Status status, String str);
}
