package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.BaseSignInCallbacks;
import com.google.android.gms.signin.internal.SignInResponse;
import defpackage.aanh;
import defpackage.aaxu;
import defpackage.abhg;
import defpackage.abqt;
import defpackage.abre;
import defpackage.abrf;
import defpackage.abtg;
import defpackage.abua;
import defpackage.achv;
import defpackage.achw;
import defpackage.achx;
import defpackage.d;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SignInCoordinator extends BaseSignInCallbacks implements abre, abrf {
    private static abqt a = achv.a;
    private final Context b;
    private final Handler c;
    private final abqt d;
    private Set e;
    private abua f;
    private achw g;
    private abtg h;

    /* renamed from: -$$Nest$msignInComplete */
    public static /* bridge */ /* synthetic */ void m203$$Nest$msignInComplete(SignInCoordinator signInCoordinator, SignInResponse signInResponse) {
        ConnectionResult connectionResult = signInResponse.b;
        if (connectionResult.b()) {
            ResolveAccountResponse resolveAccountResponse = signInResponse.c;
            abhg.m(resolveAccountResponse);
            ConnectionResult connectionResult2 = resolveAccountResponse.c;
            if (!connectionResult2.b()) {
                String valueOf = String.valueOf(String.valueOf(connectionResult2));
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                signInCoordinator.h.b(connectionResult2);
                signInCoordinator.g.n();
                return;
            }
            signInCoordinator.h.c(resolveAccountResponse.a(), signInCoordinator.e);
        } else {
            signInCoordinator.h.b(connectionResult);
        }
        signInCoordinator.g.n();
    }

    public SignInCoordinator(Context context, Handler handler, abua abuaVar) {
        this(context, handler, abuaVar, a);
    }

    public static void setBuilderForTest(abqt<? extends achw, achx> abqtVar) {
        a = abqtVar;
    }

    public achw getSignInClient() {
        return this.g;
    }

    @Override // defpackage.absf
    public void onConnected(Bundle bundle) {
        this.g.f(this);
    }

    @Override // defpackage.abtc
    public void onConnectionFailed(ConnectionResult connectionResult) {
        this.h.b(connectionResult);
    }

    @Override // defpackage.absf
    public void onConnectionSuspended(int i) {
        this.h.d(i);
    }

    @Override // com.google.android.gms.signin.internal.BaseSignInCallbacks, com.google.android.gms.signin.internal.ISignInCallbacks
    public void onSignInComplete(SignInResponse signInResponse) {
        this.c.post(new aanh(this, signInResponse, 19));
    }

    public void startSignIn(abtg abtgVar) {
        achw achwVar = this.g;
        if (achwVar != null) {
            achwVar.n();
        }
        this.f.h = Integer.valueOf(System.identityHashCode(this));
        abqt abqtVar = this.d;
        Context context = this.b;
        Looper looper = this.c.getLooper();
        abua abuaVar = this.f;
        this.g = (achw) abqtVar.w(context, looper, abuaVar, abuaVar.g, this, this);
        this.h = abtgVar;
        Set set = this.e;
        if (set != null && !set.isEmpty()) {
            this.g.e();
        } else {
            this.c.post(new aaxu(this, 19, null));
        }
    }

    public void stopSignIn() {
        achw achwVar = this.g;
        if (achwVar != null) {
            achwVar.n();
        }
    }

    public SignInCoordinator(Context context, Handler handler, abua abuaVar, abqt<? extends achw, achx> abqtVar) {
        this.b = context;
        this.c = handler;
        d.aC(abuaVar, "ClientSettings must not be null");
        this.f = abuaVar;
        this.e = abuaVar.b;
        this.d = abqtVar;
    }
}
