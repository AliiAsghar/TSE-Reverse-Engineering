package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.auth.api.internal.IAuthService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ablr extends abug {
    private final Bundle a;

    public ablr(Context context, Looper looper, abua abuaVar, abll abllVar, absf absfVar, abtc abtcVar) {
        super(context, looper, 16, abuaVar, absfVar, abtcVar);
        if (abllVar == null) {
            this.a = new Bundle();
            return;
        }
        throw null;
    }

    @Override // defpackage.abug, com.google.android.gms.common.internal.BaseGmsClient, defpackage.abqz
    public final int a() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return IAuthService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean gn() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final Bundle i() {
        return this.a;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, defpackage.abqz
    public final boolean j() {
        String str;
        abua abuaVar = ((abug) this).u;
        Account account = abuaVar.a;
        if (account != null) {
            str = account.name;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            if (((zfj) abuaVar.d.get(ablk.a)) == null) {
                if (!abuaVar.b.isEmpty()) {
                    return true;
                }
                return false;
            }
            throw null;
        }
        return false;
    }
}
