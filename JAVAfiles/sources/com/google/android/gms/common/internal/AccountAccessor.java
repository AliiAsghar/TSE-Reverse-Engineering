package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.IAccountAccessor;
import defpackage.abvk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AccountAccessor extends IAccountAccessor.Stub {
    private final Account a;
    private final Context b;
    int mGmsCoreUid = -1;

    public AccountAccessor(Context context, Account account) {
        this.b = context.getApplicationContext();
        this.a = account;
    }

    public static AccountAccessor fromGoogleAccountName(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new AccountAccessor(context, new Account(str, "com.google"));
    }

    public static Account getAccountBinderSafe(IAccountAccessor iAccountAccessor) {
        Account account = null;
        if (iAccountAccessor != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                try {
                    account = iAccountAccessor.getAccount();
                } catch (RemoteException unused) {
                    Log.w("AccountAccessor", "Remote account accessor probably died");
                }
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return account;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountAccessor)) {
            return false;
        }
        return this.a.equals(((AccountAccessor) obj).a);
    }

    @Override // com.google.android.gms.common.internal.IAccountAccessor
    public Account getAccount() {
        int callingUid = Binder.getCallingUid();
        if (callingUid == this.mGmsCoreUid) {
            return this.a;
        }
        if (abvk.k(this.b, callingUid)) {
            this.mGmsCoreUid = callingUid;
            return this.a;
        }
        throw new SecurityException("Caller is not GooglePlayServices");
    }
}
