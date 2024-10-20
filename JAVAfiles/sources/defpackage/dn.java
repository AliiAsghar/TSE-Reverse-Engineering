package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dn implements enb, gjz, eoz {
    public eno a = null;
    public ico b = null;
    private final cg c;
    private final Runnable d;
    private eov e;
    private final efu f;

    public dn(cg cgVar, efu efuVar, Runnable runnable) {
        this.c = cgVar;
        this.f = efuVar;
        this.d = runnable;
    }

    @Override // defpackage.enm
    public final enh N() {
        b();
        return this.a;
    }

    @Override // defpackage.enb
    public final eov P() {
        Application application;
        cg cgVar = this.c;
        eov P = cgVar.P();
        if (!P.equals(cgVar.ac)) {
            this.e = P;
            return P;
        }
        if (this.e == null) {
            Context applicationContext = this.c.y().getApplicationContext();
            while (true) {
                if (applicationContext instanceof ContextWrapper) {
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    }
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                } else {
                    application = null;
                    break;
                }
            }
            cg cgVar2 = this.c;
            this.e = new eoo(application, cgVar2, cgVar2.m);
        }
        return this.e;
    }

    @Override // defpackage.enb
    public final epd Q() {
        Application application;
        Context applicationContext = this.c.y().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        epe epeVar = new epe();
        if (application != null) {
            epeVar.b(eou.b, application);
        }
        epeVar.b(eol.a, this.c);
        epeVar.b(eol.b, this);
        Bundle bundle = this.c.m;
        if (bundle != null) {
            epeVar.b(eol.c, bundle);
        }
        return epeVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(enf enfVar) {
        this.a.e(enfVar);
    }

    @Override // defpackage.gjz
    public final iba aK() {
        b();
        return (iba) this.b.a;
    }

    @Override // defpackage.eoz
    public final efu aL() {
        b();
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        if (this.a == null) {
            this.a = new eno(this);
            ico bH = gvf.bH(this);
            this.b = bH;
            bH.v();
            this.d.run();
        }
    }
}
