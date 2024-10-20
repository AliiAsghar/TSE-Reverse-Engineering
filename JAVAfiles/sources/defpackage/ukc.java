package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ukc implements agnq {
    private static final xze b = xze.g("BugleDataModel", "TransactionManagerImpl");
    public final armf a;

    public ukc(armf armfVar) {
        this.a = armfVar;
    }

    @Override // defpackage.agnq
    public final Object a(String str, agno agnoVar) {
        ukb ukbVar = new ukb(this, this.a);
        try {
            return c(str, new ubu(agnoVar, ukbVar, 8, null));
        } catch (uka unused) {
            return ukbVar.a;
        }
    }

    @Override // defpackage.agnq
    public final Object b(alhr alhrVar) {
        return ((agnw) this.a.b()).q(alhrVar);
    }

    @Override // defpackage.agnq
    public final Object c(String str, alhr alhrVar) {
        try {
            akrh e = aktp.e(str);
            try {
                xze xzeVar = b;
                xyo a = xzeVar.a();
                a.H("tx: ");
                a.H(str);
                a.H(" started");
                a.q();
                Object s = ((agnw) this.a.b()).s(str, alhrVar);
                e.close();
                xyo a2 = xzeVar.a();
                a2.H("tx: ");
                a2.H(str);
                a2.H(" ended");
                a2.q();
                return s;
            } finally {
            }
        } catch (Throwable th) {
            xyo a3 = b.a();
            a3.H("tx: ");
            a3.H(str);
            a3.H(" ended");
            a3.q();
            throw th;
        }
    }

    @Override // defpackage.agnq
    public final void d(Runnable runnable) {
        e("unnamed transaction", runnable);
    }

    @Override // defpackage.agnq
    public final void e(String str, Runnable runnable) {
        try {
            akrh e = aktp.e(str);
            try {
                xze xzeVar = b;
                xyo a = xzeVar.a();
                a.H("tx: ");
                a.H(str);
                a.H(" started");
                a.q();
                ((agnw) this.a.b()).A(str, runnable);
                e.close();
                xyo a2 = xzeVar.a();
                a2.H("tx: ");
                a2.H(str);
                a2.H(" ended");
                a2.q();
            } finally {
            }
        } catch (Throwable th) {
            xyo a3 = b.a();
            a3.H("tx: ");
            a3.H(str);
            a3.H(" ended");
            a3.q();
            throw th;
        }
    }

    @Override // defpackage.agnq
    public final void f(Uri uri) {
        ((agnw) this.a.b()).B(uri);
    }

    @Override // defpackage.agnq
    public final void g(Uri uri, String str) {
        ((agnw) this.a.b()).C(uri, str);
    }

    @Override // defpackage.agnq
    public final /* synthetic */ void h(agnp agnpVar, String str, Runnable runnable) {
        agkx.e(this, agnpVar, str, runnable, agnt.NO_TXN);
    }

    @Override // defpackage.agnq
    public final /* synthetic */ void i(agnp agnpVar, String str, Runnable runnable, agnt agntVar) {
        agkx.e(this, agnpVar, str, runnable, agntVar);
    }

    @Override // defpackage.agnq
    public final boolean j() {
        return ((agnw) this.a.b()).G();
    }

    @Override // defpackage.agnq
    public final void k(alhr alhrVar) {
        c("unnamed transaction", alhrVar);
    }
}
