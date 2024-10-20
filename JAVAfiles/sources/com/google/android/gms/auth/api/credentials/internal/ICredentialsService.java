package com.google.android.gms.auth.api.credentials.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ICredentialsService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ICredentialsService {
        static final int TRANSACTION_performCredentialsDeleteOperation = 3;
        static final int TRANSACTION_performCredentialsRequestOperation = 1;
        static final int TRANSACTION_performCredentialsSaveOperation = 2;
        static final int TRANSACTION_performDisableAutoSignInOperation = 4;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ICredentialsService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.ICredentialsService
            public void performCredentialsDeleteOperation(ICredentialsCallbacks iCredentialsCallbacks, DeleteRequest deleteRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iCredentialsCallbacks);
                iax.d(obtainAndWriteInterfaceToken, deleteRequest);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.ICredentialsService
            public void performCredentialsRequestOperation(ICredentialsCallbacks iCredentialsCallbacks, CredentialRequest credentialRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iCredentialsCallbacks);
                iax.d(obtainAndWriteInterfaceToken, credentialRequest);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.ICredentialsService
            public void performCredentialsSaveOperation(ICredentialsCallbacks iCredentialsCallbacks, SaveRequest saveRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iCredentialsCallbacks);
                iax.d(obtainAndWriteInterfaceToken, saveRequest);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.ICredentialsService
            public void performDisableAutoSignInOperation(ICredentialsCallbacks iCredentialsCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iCredentialsCallbacks);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        }

        public static ICredentialsService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
            if (queryLocalInterface instanceof ICredentialsService) {
                return (ICredentialsService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return false;
                        }
                        ICredentialsCallbacks asInterface = ICredentialsCallbacks.Stub.asInterface(parcel.readStrongBinder());
                        enforceNoDataAvail(parcel);
                        performDisableAutoSignInOperation(asInterface);
                    } else {
                        ICredentialsCallbacks asInterface2 = ICredentialsCallbacks.Stub.asInterface(parcel.readStrongBinder());
                        DeleteRequest deleteRequest = (DeleteRequest) iax.a(parcel, DeleteRequest.CREATOR);
                        enforceNoDataAvail(parcel);
                        performCredentialsDeleteOperation(asInterface2, deleteRequest);
                    }
                } else {
                    ICredentialsCallbacks asInterface3 = ICredentialsCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    SaveRequest saveRequest = (SaveRequest) iax.a(parcel, SaveRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    performCredentialsSaveOperation(asInterface3, saveRequest);
                }
            } else {
                ICredentialsCallbacks asInterface4 = ICredentialsCallbacks.Stub.asInterface(parcel.readStrongBinder());
                CredentialRequest credentialRequest = (CredentialRequest) iax.a(parcel, CredentialRequest.CREATOR);
                enforceNoDataAvail(parcel);
                performCredentialsRequestOperation(asInterface4, credentialRequest);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void performCredentialsDeleteOperation(ICredentialsCallbacks iCredentialsCallbacks, DeleteRequest deleteRequest);

    void performCredentialsRequestOperation(ICredentialsCallbacks iCredentialsCallbacks, CredentialRequest credentialRequest);

    void performCredentialsSaveOperation(ICredentialsCallbacks iCredentialsCallbacks, SaveRequest saveRequest);

    void performDisableAutoSignInOperation(ICredentialsCallbacks iCredentialsCallbacks);
}
