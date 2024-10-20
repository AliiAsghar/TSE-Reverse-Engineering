package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ffv implements fgx {
    private Looper e;
    private erz f;
    private fbz g;
    private final ArrayList d = new ArrayList(1);
    public final HashSet a = new HashSet(1);
    public final apuv b = new apuv(new CopyOnWriteArrayList(), (fgv) null);
    public final apuv c = new apuv(new CopyOnWriteArrayList(), (fgv) null);

    /* JADX INFO: Access modifiers changed from: protected */
    public final fbz a() {
        fbz fbzVar = this.g;
        dzg.h(fbzVar);
        return fbzVar;
    }

    @Override // defpackage.fgx
    public final void b(Handler handler, fdq fdqVar) {
        ((CopyOnWriteArrayList) this.c.c).add(new fdx(handler, fdqVar));
    }

    @Override // defpackage.fgx
    public final void c(Handler handler, fhb fhbVar) {
        ((CopyOnWriteArrayList) this.b.c).add(new fvq(handler, fhbVar));
    }

    @Override // defpackage.fgx
    public final void d(fgw fgwVar) {
        boolean isEmpty = this.a.isEmpty();
        this.a.remove(fgwVar);
        if (!isEmpty && this.a.isEmpty()) {
            e();
        }
    }

    @Override // defpackage.fgx
    public final void f(fgw fgwVar) {
        dzg.g(this.e);
        HashSet hashSet = this.a;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(fgwVar);
        if (isEmpty) {
            g();
        }
    }

    @Override // defpackage.fgx
    public final void h(fgw fgwVar, ewc ewcVar, fbz fbzVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        boolean z = true;
        if (looper != null && looper != myLooper) {
            z = false;
        }
        d.s(z);
        this.g = fbzVar;
        erz erzVar = this.f;
        this.d.add(fgwVar);
        if (this.e == null) {
            this.e = myLooper;
            this.a.add(fgwVar);
            i(ewcVar);
        } else if (erzVar != null) {
            f(fgwVar);
            fgwVar.a(this, erzVar);
        }
    }

    protected abstract void i(ewc ewcVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void j(erz erzVar) {
        this.f = erzVar;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((fgw) arrayList.get(i)).a(this, erzVar);
        }
    }

    @Override // defpackage.fgx
    public final void k(fgw fgwVar) {
        this.d.remove(fgwVar);
        if (this.d.isEmpty()) {
            this.e = null;
            this.f = null;
            this.g = null;
            this.a.clear();
            l();
            return;
        }
        d(fgwVar);
    }

    protected abstract void l();

    @Override // defpackage.fgx
    public final void m(fdq fdqVar) {
        apuv apuvVar = this.c;
        Iterator it = ((CopyOnWriteArrayList) apuvVar.c).iterator();
        while (it.hasNext()) {
            fdx fdxVar = (fdx) it.next();
            if (fdxVar.a == fdqVar) {
                ((CopyOnWriteArrayList) apuvVar.c).remove(fdxVar);
            }
        }
    }

    @Override // defpackage.fgx
    public final void n(fhb fhbVar) {
        apuv apuvVar = this.b;
        Iterator it = ((CopyOnWriteArrayList) apuvVar.c).iterator();
        while (it.hasNext()) {
            fvq fvqVar = (fvq) it.next();
            if (fvqVar.a == fhbVar) {
                ((CopyOnWriteArrayList) apuvVar.c).remove(fvqVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final apuv r(fgv fgvVar) {
        return this.b.D(fgvVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final apuv s(fgv fgvVar) {
        return this.c.E(fgvVar);
    }

    protected void e() {
    }

    protected void g() {
    }

    @Override // defpackage.fgx
    public /* synthetic */ void p() {
    }

    @Override // defpackage.fgx
    public /* synthetic */ void q() {
    }

    @Override // defpackage.fgx
    public /* synthetic */ void o(ere ereVar) {
    }
}
