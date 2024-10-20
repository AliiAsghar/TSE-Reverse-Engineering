package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fge extends ffv {
    private final HashMap d = new HashMap();
    private Handler e;
    private ewc f;

    /* JADX WARN: Type inference failed for: r1v3, types: [fgw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [fgx, java.lang.Object] */
    @Override // defpackage.ffv
    protected final void e() {
        for (kkc kkcVar : this.d.values()) {
            kkcVar.a.d(kkcVar.b);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [fgw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [fgx, java.lang.Object] */
    @Override // defpackage.ffv
    protected final void g() {
        for (kkc kkcVar : this.d.values()) {
            kkcVar.a.f(kkcVar.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ffv
    public void i(ewc ewcVar) {
        this.f = ewcVar;
        this.e = eul.C();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r1v3, types: [fdq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [fgx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [fgx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [fgx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [fgw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [fhb, java.lang.Object] */
    @Override // defpackage.ffv
    public void l() {
        for (kkc kkcVar : this.d.values()) {
            kkcVar.a.k(kkcVar.b);
            kkcVar.a.n(kkcVar.c);
            kkcVar.a.m(kkcVar.c);
        }
        this.d.clear();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [fgx, java.lang.Object] */
    @Override // defpackage.fgx
    public void t() {
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            ((kkc) it.next()).a.t();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public fgv x(Object obj, fgv fgvVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void y(Object obj, fgx fgxVar, erz erzVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void z(final Object obj, fgx fgxVar) {
        d.s(!this.d.containsKey(obj));
        fgw fgwVar = new fgw() { // from class: fgc
            @Override // defpackage.fgw
            public final void a(fgx fgxVar2, erz erzVar) {
                fge.this.y(obj, fgxVar2, erzVar);
            }
        };
        fgd fgdVar = new fgd(this, obj);
        this.d.put(obj, new kkc(fgxVar, fgwVar, (Object) fgdVar));
        Handler handler = this.e;
        dzg.g(handler);
        fgxVar.c(handler, fgdVar);
        Handler handler2 = this.e;
        dzg.g(handler2);
        fgxVar.b(handler2, fgdVar);
        fgxVar.h(fgwVar, this.f, a());
        if (!this.a.isEmpty()) {
            return;
        }
        fgxVar.d(fgwVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void A(Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void B(Object obj) {
    }
}
