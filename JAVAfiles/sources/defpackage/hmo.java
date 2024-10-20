package defpackage;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmo implements hxq, hxb {
    public volatile hmu a;
    public final List b;
    public final hld c;
    private volatile hwx d;
    private volatile Object e;
    private final arzu f;

    public hmo(arzu arzuVar, hld hldVar) {
        arzuVar.getClass();
        this.f = arzuVar;
        this.c = hldVar;
        this.b = new ArrayList();
        if (hldVar instanceof hmr) {
            this.a = ((hmr) hldVar).a;
        } else {
            if (hldVar instanceof hmn) {
                arrn.J(arzuVar, null, null, new eig(this, (arpe) null, 10), 3);
                return;
            }
            throw new armm();
        }
    }

    @Override // defpackage.hxq
    public final void a(Drawable drawable) {
        this.f.c(new hms(hmv.d, drawable));
    }

    @Override // defpackage.hxq
    public final void b(Object obj, hxz hxzVar) {
        hmv hmvVar;
        this.e = obj;
        hwx hwxVar = this.d;
        if (hwxVar != null && hwxVar.l()) {
            hmvVar = hmv.c;
        } else {
            hmvVar = hmv.b;
        }
        this.f.c(new hmt(hmvVar, obj));
    }

    @Override // defpackage.hxq
    public final hwx c() {
        return this.d;
    }

    @Override // defpackage.hxq
    public final void d(hxp hxpVar) {
        hmu hmuVar = this.a;
        if (hmuVar != null) {
            hxpVar.g(hmuVar.a, hmuVar.b);
            return;
        }
        synchronized (this) {
            hmu hmuVar2 = this.a;
            if (hmuVar2 != null) {
                hxpVar.g(hmuVar2.a, hmuVar2.b);
            } else {
                this.b.add(hxpVar);
            }
        }
    }

    @Override // defpackage.hxq
    public final void e(Drawable drawable) {
        this.e = null;
        this.f.c(new hms(hmv.a, drawable));
    }

    @Override // defpackage.hxb
    public final boolean eV(hpp hppVar, Object obj) {
        Object obj2 = this.e;
        hwx hwxVar = this.d;
        if (obj2 != null && hwxVar != null && !hwxVar.l() && !hwxVar.n()) {
            this.f.c(new hmt(hmv.d, obj2));
            return false;
        }
        return false;
    }

    @Override // defpackage.hxb
    public final boolean eW(Object obj, Object obj2) {
        return false;
    }

    @Override // defpackage.hxq
    public final void f(Drawable drawable) {
        this.e = null;
        this.f.c(new hms(hmv.b, drawable));
    }

    @Override // defpackage.hxq
    public final void g(hxp hxpVar) {
        synchronized (this) {
            this.b.remove(hxpVar);
        }
    }

    @Override // defpackage.hxq
    public final void h(hwx hwxVar) {
        this.d = hwxVar;
    }

    @Override // defpackage.hwb
    public final void k() {
    }

    @Override // defpackage.hwb
    public final void l() {
    }

    @Override // defpackage.hwb
    public final void m() {
    }
}
