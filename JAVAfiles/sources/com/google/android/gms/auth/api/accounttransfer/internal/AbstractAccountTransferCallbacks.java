package com.google.android.gms.auth.api.accounttransfer.internal;

import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AbstractAccountTransferCallbacks extends IAccountTransferCallbacks.Stub {
    @Override // com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks
    public void onAccountTransferResult(Status status, AuthenticatorTransferInfo authenticatorTransferInfo) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks
    public void onAccountTransferSetupResult(Status status, AccountTransferMsg accountTransferMsg) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks
    public void onDeviceMetaDataResult(DeviceMetaData deviceMetaData) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks
    public void onFailure(Status status) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks
    public void onResult() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks
    public void onRetrieveDataResult(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks
    public void onStatusResult(Status status) {
        throw new UnsupportedOperationException();
    }
}
