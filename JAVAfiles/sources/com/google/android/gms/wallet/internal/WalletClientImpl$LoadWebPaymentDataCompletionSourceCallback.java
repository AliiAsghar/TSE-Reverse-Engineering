package com.google.android.gms.wallet.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.WebPaymentData;
import defpackage.acit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class WalletClientImpl$LoadWebPaymentDataCompletionSourceCallback extends WalletClientImpl$BaseWalletServiceCallbacks {
    private final acit a;

    public WalletClientImpl$LoadWebPaymentDataCompletionSourceCallback(acit<WebPaymentData> acitVar) {
        this.a = acitVar;
    }

    @Override // com.google.android.gms.wallet.internal.WalletClientImpl$BaseWalletServiceCallbacks, com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public void onWebPaymentDataLoaded(Status status, WebPaymentData webPaymentData, Bundle bundle) {
        this.a.b(webPaymentData);
    }
}
