package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hsg implements hns, hnr {
    private final List a;
    private final ecf b;
    private int c;
    private hlh d;
    private hnr e;
    private List f;
    private boolean g;

    public hsg(List list, ecf ecfVar) {
        this.b = ecfVar;
        hwr.h(list);
        this.a = list;
        this.c = 0;
    }

    private final void h() {
        if (this.g) {
            return;
        }
        if (this.c < this.a.size() - 1) {
            this.c++;
            f(this.d, this.e);
        } else {
            hwr.i(this.f);
            this.e.e(new hpp("Fetch failed", new ArrayList(this.f)));
        }
    }

    @Override // defpackage.hns
    public final Class a() {
        return ((hns) this.a.get(0)).a();
    }

    @Override // defpackage.hnr
    public final void b(Object obj) {
        if (obj != null) {
            this.e.b(obj);
        } else {
            h();
        }
    }

    @Override // defpackage.hns
    public final void d() {
        List list = this.f;
        if (list != null) {
            this.b.b(list);
        }
        this.f = null;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((hns) it.next()).d();
        }
    }

    @Override // defpackage.hnr
    public final void e(Exception exc) {
        List list = this.f;
        hwr.i(list);
        list.add(exc);
        h();
    }

    @Override // defpackage.hns
    public final void eX() {
        this.g = true;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((hns) it.next()).eX();
        }
    }

    @Override // defpackage.hns
    public final void f(hlh hlhVar, hnr hnrVar) {
        this.d = hlhVar;
        this.e = hnrVar;
        this.f = (List) this.b.a();
        ((hns) this.a.get(this.c)).f(hlhVar, this);
        if (this.g) {
            eX();
        }
    }

    @Override // defpackage.hns
    public final int g() {
        return ((hns) this.a.get(0)).g();
    }
}
