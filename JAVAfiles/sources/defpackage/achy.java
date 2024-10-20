package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.ISignInCallbacks;
import com.google.android.gms.signin.internal.ISignInService;
import com.google.android.gms.signin.internal.SignInRequest;
import com.google.android.gms.signin.internal.SignInResponse;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class achy extends abug implements achw {
    private final boolean a;
    private final abua v;
    private final Bundle w;
    private final Integer x;

    public achy(Context context, Looper looper, abua abuaVar, Bundle bundle, abre abreVar, abrf abrfVar) {
        super(context, looper, 44, abuaVar, abreVar, abrfVar);
        this.a = true;
        this.v = abuaVar;
        this.w = bundle;
        this.x = abuaVar.h;
    }

    @Override // defpackage.abug, com.google.android.gms.common.internal.BaseGmsClient, defpackage.abqz
    public final int a() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return ISignInService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // defpackage.achw
    public final void e() {
        m(new abtx(this));
    }

    @Override // defpackage.achw
    public final void f(ISignInCallbacks iSignInCallbacks) {
        GoogleSignInAccount googleSignInAccount;
        try {
            Account account = this.v.a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            if ("<<default account>>".equals(account.name)) {
                googleSignInAccount = abmg.c(this.b).a();
            } else {
                googleSignInAccount = null;
            }
            Integer num = this.x;
            abhg.m(num);
            ((ISignInService) w()).signIn(new SignInRequest(1, new ResolveAccountRequest(2, account, num.intValue(), googleSignInAccount)), iSignInCallbacks);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                iSignInCallbacks.onSignInComplete(new SignInResponse(1, new ConnectionResult(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final Bundle i() {
        if (!this.b.getPackageName().equals(this.v.e)) {
            this.w.putString("com.google.android.gms.signin.internal.realClientPackageName", this.v.e);
        }
        return this.w;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, defpackage.abqz
    public final boolean j() {
        return this.a;
    }
}
