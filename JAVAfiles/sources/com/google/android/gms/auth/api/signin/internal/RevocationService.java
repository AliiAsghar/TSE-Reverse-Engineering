package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.IRevocationService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import defpackage.abhg;
import defpackage.abls;
import defpackage.ablv;
import defpackage.ablz;
import defpackage.abmb;
import defpackage.abmd;
import defpackage.abme;
import defpackage.abmg;
import defpackage.abrg;
import defpackage.abrj;
import defpackage.abrm;
import defpackage.abti;
import defpackage.abvk;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RevocationService extends IRevocationService.Stub {
    private final Context a;

    public RevocationService(Context context) {
        this.a = context;
    }

    private final void a() {
        if (abvk.k(this.a, Binder.getCallingUid())) {
            return;
        }
        throw new SecurityException("Calling UID " + Binder.getCallingUid() + " is not Google Play services.");
    }

    @Override // com.google.android.gms.auth.api.signin.internal.IRevocationService
    public void cleanupClientState() {
        a();
        abme.a(this.a).b();
    }

    @Override // com.google.android.gms.auth.api.signin.internal.IRevocationService
    public void revokeAccess() {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        a();
        abmg c = abmg.c(this.a);
        GoogleSignInAccount a = c.a();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.e;
        if (a != null) {
            googleSignInOptions = c.b();
        }
        Context context = this.a;
        abhg.m(googleSignInOptions);
        abls ablsVar = new abls(context, googleSignInOptions);
        if (a != null) {
            abrg abrgVar = ablsVar.i;
            Context context2 = ablsVar.c;
            int a2 = ablsVar.a();
            abmd.a.k("Revoking access", new Object[0]);
            String d = abmg.c(context2).d("refreshToken");
            abmd.a(context2);
            if (a2 == 3) {
                if (d == null) {
                    Status status = new Status(4);
                    d.t(!status.c(), "Status code must not be SUCCESS");
                    basePendingResult2 = new abrj(status);
                    basePendingResult2.j(status);
                } else {
                    ablv ablvVar = new ablv(d);
                    new Thread(ablvVar).start();
                    basePendingResult2 = ablvVar.a;
                }
            } else {
                abmb abmbVar = new abmb(abrgVar);
                abrgVar.c(abmbVar);
                basePendingResult2 = abmbVar;
            }
            abhg.o(basePendingResult2);
            return;
        }
        abrg abrgVar2 = ablsVar.i;
        Context context3 = ablsVar.c;
        int a3 = ablsVar.a();
        abmd.a.k("Signing out", new Object[0]);
        abmd.a(context3);
        if (a3 == 3) {
            abrm abrmVar = Status.a;
            BasePendingResult abtiVar = new abti(abrgVar2);
            abtiVar.j(abrmVar);
            basePendingResult = abtiVar;
        } else {
            ablz ablzVar = new ablz(abrgVar2);
            abrgVar2.c(ablzVar);
            basePendingResult = ablzVar;
        }
        abhg.o(basePendingResult);
    }
}
