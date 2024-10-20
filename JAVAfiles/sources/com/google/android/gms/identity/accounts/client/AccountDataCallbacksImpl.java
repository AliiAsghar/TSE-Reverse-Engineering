package com.google.android.gms.identity.accounts.client;

import com.google.android.gms.identity.accounts.api.AccountData;
import com.google.android.gms.identity.accounts.service.IAccountDataCallbacks;
import defpackage.abhg;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AccountDataCallbacksImpl extends IAccountDataCallbacks.Stub implements AccountDataCallbacks {
    private final CountDownLatch a = new CountDownLatch(1);
    private AccountData b;
    private byte[] c;

    @Override // com.google.android.gms.identity.accounts.client.AccountDataCallbacks
    public void await() {
        this.a.await();
    }

    @Override // com.google.android.gms.identity.accounts.client.AccountDataCallbacks
    public AccountData getAccountData() {
        boolean z;
        if (this.a.getCount() == 0) {
            z = true;
        } else {
            z = false;
        }
        abhg.i(z, "Call await() before this method.");
        return this.b;
    }

    @Override // com.google.android.gms.identity.accounts.client.AccountDataCallbacks
    public byte[] getEncryptedBytes() {
        boolean z;
        if (this.a.getCount() == 0) {
            z = true;
        } else {
            z = false;
        }
        abhg.i(z, "Call await() before this method.");
        return this.c;
    }

    @Override // com.google.android.gms.identity.accounts.service.IAccountDataCallbacks
    public void onAccountDataDecrypted(AccountData accountData) {
        this.b = accountData;
        this.a.countDown();
    }

    @Override // com.google.android.gms.identity.accounts.service.IAccountDataCallbacks
    public void onAccountDataEncrypted(byte[] bArr) {
        this.c = bArr;
        this.a.countDown();
    }
}
