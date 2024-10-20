package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import defpackage.aklx;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yyw extends yza implements akkh, apxq, akkf, aklk, akrw {
    private yyz a;
    private boolean ag;
    private Context d;
    private final eno e = new eno(this);

    @Deprecated
    public yyw() {
        aiut.c();
    }

    public static yyw a(ajwt ajwtVar) {
        yyw yywVar = new yyw();
        apxh.e(yywVar);
        aklw.b(yywVar, ajwtVar);
        return yywVar;
    }

    @Override // defpackage.akkh
    public final Class C() {
        return yyz.class;
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [armf, java.lang.Object] */
    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            aM(layoutInflater, viewGroup, bundle);
            yyz E = E();
            layoutInflater.getClass();
            ComposeView composeView = new ComposeView(((yyw) E.f.b()).y(), null, 0, 6, null);
            composeView.setFitsSystemWindows(true);
            composeView.setOnApplyWindowInsetsListener(new ivf(6));
            composeView.a(new cdj(400788083, true, new lfw(E, 14)));
            akqj.p();
            return composeView;
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cg, defpackage.enm
    public final enh N() {
        return this.e;
    }

    @Override // defpackage.yza, defpackage.aiuc, defpackage.cg
    public final void Y(Activity activity) {
        this.c.k();
        try {
            super.Y(activity);
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cg
    public final void aG(Intent intent) {
        if (akec.y(intent, x().getApplicationContext())) {
            akto.m(intent);
        }
        super.aG(intent);
    }

    @Override // defpackage.akkf
    @Deprecated
    public final Context aU() {
        if (this.d == null) {
            this.d = new aklm(this, super.x());
        }
        return this.d;
    }

    @Override // defpackage.aklf, defpackage.akrw
    public final aktr aW() {
        return this.c.a;
    }

    @Override // defpackage.aklk
    public final Locale aX() {
        return akec.q(this);
    }

    @Override // defpackage.aklf, defpackage.akrw
    public final void aY(aktr aktrVar, boolean z) {
        this.c.e(aktrVar, z);
    }

    @Override // defpackage.aklf, defpackage.akrw
    public final void aZ(aktr aktrVar) {
        this.c.b = aktrVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [armf, java.lang.Object] */
    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void aa() {
        aksa b = this.c.b();
        try {
            aQ();
            eea.c(((yyw) E().f.b()).F().getWindow(), true);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void af() {
        aksa b = this.c.b();
        try {
            bb();
            zen zenVar = (zen) E().b().b.b();
            synchronized (zenVar.c) {
                if (zenVar.d == zep.a && !zenVar.b.isEmpty()) {
                    zen.a.o("clearing 1-1 selection on resume");
                    zenVar.a();
                    zenVar.g(null, null);
                }
            }
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cg
    public final void ar(boolean z) {
        d.H(z);
    }

    @Override // defpackage.cg
    public final void au(Intent intent) {
        if (akec.y(intent, x().getApplicationContext())) {
            akto.m(intent);
        }
        aG(intent);
    }

    @Override // defpackage.akkh
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final yyz E() {
        yyz yyzVar = this.a;
        if (yyzVar != null) {
            if (!this.ag) {
                return yyzVar;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // defpackage.yza
    protected final /* bridge */ /* synthetic */ aklw e() {
        return new akls(this, false);
    }

    @Override // defpackage.yza, defpackage.aklf, defpackage.cg
    public final void f(Context context) {
        this.c.k();
        try {
            if (!this.ag) {
                super.f(context);
                if (this.a == null) {
                    try {
                        Object aS = aS();
                        apwt a = apxv.a(((kql) aS).cb);
                        apya apyaVar = ((kql) aS).dI;
                        kqh kqhVar = ((kql) aS).el;
                        apya apyaVar2 = kqhVar.G;
                        apya apyaVar3 = ((kql) aS).ek.k;
                        apya apyaVar4 = kqhVar.g;
                        apya apyaVar5 = kqhVar.l;
                        apya apyaVar6 = ((kql) aS).an;
                        apya apyaVar7 = kqhVar.L;
                        krx krxVar = ((kql) aS).a.a;
                        this.a = new yyz(a, apyaVar, apyaVar2, apyaVar3, apyaVar4, apyaVar5, apyaVar6, apyaVar7, krxVar.dR, kqhVar.J, krxVar.eq);
                        this.Z.c(new akli(this.c, this.e));
                    } catch (ClassCastException e) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                    }
                }
                akqj.p();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        r0.b().a(r0.d());
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [armf, java.lang.Object] */
    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(android.os.Bundle r4) {
        /*
            r3 = this;
            akqf r0 = r3.c
            r0.k()
            r3.aP(r4)     // Catch: java.lang.Throwable -> Lbc
            yyz r0 = r3.E()     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r1 = r0.f     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r1 = r1.b()     // Catch: java.lang.Throwable -> Lbc
            yyw r1 = (defpackage.yyw) r1     // Catch: java.lang.Throwable -> Lbc
            cj r1 = r1.F()     // Catch: java.lang.Throwable -> Lbc
            android.view.Window r1 = r1.getWindow()     // Catch: java.lang.Throwable -> Lbc
            r2 = 0
            defpackage.eea.c(r1, r2)     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r1 = r0.j     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r1 = r1.b()     // Catch: java.lang.Throwable -> Lbc
            j$.util.Optional r1 = (j$.util.Optional) r1     // Catch: java.lang.Throwable -> Lbc
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> Lbc
            if (r1 == 0) goto L39
            armf r1 = r0.a     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r1 = r1.b()     // Catch: java.lang.Throwable -> Lbc
            lkc r1 = (defpackage.lkc) r1     // Catch: java.lang.Throwable -> Lbc
            r1.b()     // Catch: java.lang.Throwable -> Lbc
        L39:
            armf r1 = r0.b     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r1 = r1.b()     // Catch: java.lang.Throwable -> Lbc
            zcu r1 = (defpackage.zcu) r1     // Catch: java.lang.Throwable -> Lbc
            if (r4 != 0) goto L4a
            ahqr r4 = r1.b     // Catch: java.lang.Throwable -> Lbc
            ahka r1 = defpackage.mgv.H     // Catch: java.lang.Throwable -> Lbc
            r4.e(r1)     // Catch: java.lang.Throwable -> Lbc
        L4a:
            java.lang.Object r4 = r0.m     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r4 = r4.b()     // Catch: java.lang.Throwable -> Lbc
            ozw r4 = (defpackage.ozw) r4     // Catch: java.lang.Throwable -> Lbc
            boolean r4 = r4.a()     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r1 = "Self-identity id is not provided."
            if (r4 == 0) goto L87
            com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r4 = r0.a()     // Catch: java.lang.Throwable -> Lbc
            boolean r2 = r0.c()     // Catch: java.lang.Throwable -> Lbc
            if (r2 == 0) goto L6d
            if (r4 == 0) goto L67
            goto L6d
        L67:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lbc
            r4.<init>(r1)     // Catch: java.lang.Throwable -> Lbc
            throw r4     // Catch: java.lang.Throwable -> Lbc
        L6d:
            if (r4 != 0) goto L7b
            com.google.android.apps.messaging.startchat.viewmodel.StartChatViewModel r4 = r0.b()     // Catch: java.lang.Throwable -> Lbc
            boolean r1 = r0.d()     // Catch: java.lang.Throwable -> Lbc
            r4.a(r1)     // Catch: java.lang.Throwable -> Lbc
            goto Lb0
        L7b:
            com.google.android.apps.messaging.startchat.viewmodel.StartChatViewModel r1 = r0.b()     // Catch: java.lang.Throwable -> Lbc
            boolean r2 = r0.d()     // Catch: java.lang.Throwable -> Lbc
            r1.b(r2, r4)     // Catch: java.lang.Throwable -> Lbc
            goto Lb0
        L87:
            boolean r4 = r0.c()     // Catch: java.lang.Throwable -> Lbc
            if (r4 == 0) goto La5
            com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r4 = r0.a()     // Catch: java.lang.Throwable -> Lbc
            if (r4 == 0) goto L9f
            com.google.android.apps.messaging.startchat.viewmodel.StartChatViewModel r1 = r0.b()     // Catch: java.lang.Throwable -> Lbc
            boolean r2 = r0.d()     // Catch: java.lang.Throwable -> Lbc
            r1.b(r2, r4)     // Catch: java.lang.Throwable -> Lbc
            goto Lb0
        L9f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lbc
            r4.<init>(r1)     // Catch: java.lang.Throwable -> Lbc
            throw r4     // Catch: java.lang.Throwable -> Lbc
        La5:
            com.google.android.apps.messaging.startchat.viewmodel.StartChatViewModel r4 = r0.b()     // Catch: java.lang.Throwable -> Lbc
            boolean r1 = r0.d()     // Catch: java.lang.Throwable -> Lbc
            r4.a(r1)     // Catch: java.lang.Throwable -> Lbc
        Lb0:
            java.lang.Object r4 = r0.k     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r4 = r4.b()     // Catch: java.lang.Throwable -> Lbc
            oit r4 = (defpackage.oit) r4     // Catch: java.lang.Throwable -> Lbc
            defpackage.akqj.p()
            return
        Lbc:
            r4 = move-exception
            defpackage.akqj.p()     // Catch: java.lang.Throwable -> Lc1
            goto Lc5
        Lc1:
            r0 = move-exception
            r4.addSuppressed(r0)
        Lc5:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yyw.g(android.os.Bundle):void");
    }

    @Override // defpackage.cg
    public final LayoutInflater gl(Bundle bundle) {
        this.c.k();
        try {
            LayoutInflater aD = aD();
            LayoutInflater cloneInContext = aD.cloneInContext(new aklx.a(aD, this));
            LayoutInflater cloneInContext2 = cloneInContext.cloneInContext(new aklm(this, cloneInContext));
            akqj.p();
            return cloneInContext2;
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiuc, defpackage.cg
    public final void i() {
        aksa a = this.c.a();
        try {
            aV();
            this.ag = true;
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.yza, defpackage.cg
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        return aU();
    }
}
