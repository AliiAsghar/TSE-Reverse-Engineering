package com.google.android.gms.identity.accounts.client;

import com.google.android.gms.identity.accounts.api.AccountData;
import com.google.android.gms.identity.accounts.service.IAccountDataCallbacks;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface AccountDataCallbacks extends IAccountDataCallbacks {
    void await();

    AccountData getAccountData();

    byte[] getEncryptedBytes();
}
