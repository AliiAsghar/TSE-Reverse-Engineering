package com.google.android.gms.wallet.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.firstparty.GetClientTokenResponse;
import defpackage.acit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class WalletClientImpl$GetClientTokenCompletionSourceCallback extends WalletClientImpl$BaseWalletServiceCallbacks {
    private final acit a;

    public WalletClientImpl$GetClientTokenCompletionSourceCallback(acit<byte[]> acitVar) {
        this.a = acitVar;
    }

    @Override // com.google.android.gms.wallet.internal.WalletClientImpl$BaseWalletServiceCallbacks, com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public void onClientTokenReceived(Status status, GetClientTokenResponse getClientTokenResponse, Bundle bundle) {
        this.a.b(getClientTokenResponse.a);
    }
}
