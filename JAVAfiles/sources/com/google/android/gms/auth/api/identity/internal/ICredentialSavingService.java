package com.google.android.gms.auth.api.identity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.internal.ISaveAccountLinkingTokenCallback;
import com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ICredentialSavingService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ICredentialSavingService {
        static final int TRANSACTION_saveAccountLinkingToken = 1;
        static final int TRANSACTION_savePassword = 2;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ICredentialSavingService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
            }

            @Override // com.google.android.gms.auth.api.identity.internal.ICredentialSavingService
            public void saveAccountLinkingToken(ISaveAccountLinkingTokenCallback iSaveAccountLinkingTokenCallback, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iSaveAccountLinkingTokenCallback);
                iax.d(obtainAndWriteInterfaceToken, saveAccountLinkingTokenRequest);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.ICredentialSavingService
            public void savePassword(ISavePasswordCallback iSavePasswordCallback, SavePasswordRequest savePasswordRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iSavePasswordCallback);
                iax.d(obtainAndWriteInterfaceToken, savePasswordRequest);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
        }

        public static ICredentialSavingService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
            if (queryLocalInterface instanceof ICredentialSavingService) {
                return (ICredentialSavingService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                ISavePasswordCallback asInterface = ISavePasswordCallback.Stub.asInterface(parcel.readStrongBinder());
                SavePasswordRequest savePasswordRequest = (SavePasswordRequest) iax.a(parcel, SavePasswordRequest.CREATOR);
                enforceNoDataAvail(parcel);
                savePassword(asInterface, savePasswordRequest);
            } else {
                ISaveAccountLinkingTokenCallback asInterface2 = ISaveAccountLinkingTokenCallback.Stub.asInterface(parcel.readStrongBinder());
                SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) iax.a(parcel, SaveAccountLinkingTokenRequest.CREATOR);
                enforceNoDataAvail(parcel);
                saveAccountLinkingToken(asInterface2, saveAccountLinkingTokenRequest);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void saveAccountLinkingToken(ISaveAccountLinkingTokenCallback iSaveAccountLinkingTokenCallback, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest);

    void savePassword(ISavePasswordCallback iSavePasswordCallback, SavePasswordRequest savePasswordRequest);
}
