package defpackage;

import j$.util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpu implements hot, hnr {
    private final hos a;
    private final hou b;
    private int c;
    private int d = -1;
    private hne e;
    private List f;
    private int g;
    private File h;
    private hpv i;
    private volatile kkc j;

    public hpu(hou houVar, hos hosVar) {
        this.b = houVar;
        this.a = hosVar;
    }

    private final boolean d() {
        if (this.g < this.f.size()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, hns] */
    @Override // defpackage.hot
    public final void a() {
        kkc kkcVar = this.j;
        if (kkcVar != null) {
            kkcVar.b.eX();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, hns] */
    @Override // defpackage.hnr
    public final void b(Object obj) {
        this.a.d(this.e, obj, this.j.b, 4, this.i);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, hns] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object, hns] */
    @Override // defpackage.hot
    public final boolean c() {
        List list;
        List d = this.b.d();
        boolean z = false;
        if (d.isEmpty()) {
            return false;
        }
        hou houVar = this.b;
        mgu b = houVar.c.b();
        Class<?> cls = houVar.d.getClass();
        Class cls2 = houVar.g;
        Class cls3 = houVar.j;
        Object obj = b.i;
        hyt hytVar = (hyt) ((AtomicReference) ((ico) obj).b).getAndSet(null);
        if (hytVar == null) {
            hytVar = new hyt(cls, cls2, cls3);
        } else {
            hytVar.a(cls, cls2, cls3);
        }
        synchronized (((ico) obj).a) {
            list = (List) ((vl) ((ico) obj).a).get(hytVar);
        }
        ((AtomicReference) ((ico) obj).b).set(hytVar);
        if (list == null) {
            list = new ArrayList();
            Iterator it = ((ico) b.g).p(cls).iterator();
            while (it.hasNext()) {
                for (Class cls4 : ((ico) b.c).b((Class) it.next(), cls2)) {
                    if (!((hgj) b.b).d(cls4, cls3).isEmpty() && !list.contains(cls4)) {
                        list.add(cls4);
                    }
                }
            }
            Object obj2 = b.i;
            List unmodifiableList = DesugarCollections.unmodifiableList(list);
            synchronized (((ico) obj2).a) {
                ((vl) ((ico) obj2).a).put(new hyt(cls, cls2, cls3), unmodifiableList);
            }
        }
        if (list.isEmpty()) {
            if (File.class.equals(this.b.j)) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + String.valueOf(this.b.d.getClass()) + " to " + String.valueOf(this.b.j));
        }
        while (true) {
            if (this.f != null && d()) {
                this.j = null;
                while (!z && d()) {
                    List list2 = this.f;
                    int i = this.g;
                    this.g = i + 1;
                    hse hseVar = (hse) list2.get(i);
                    File file = this.h;
                    hou houVar2 = this.b;
                    this.j = hseVar.b(file, houVar2.e, houVar2.f, houVar2.h);
                    if (this.j != null && this.b.g(this.j.b.a())) {
                        this.j.b.f(this.b.n, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 >= list.size()) {
                int i3 = this.c + 1;
                this.c = i3;
                if (i3 >= d.size()) {
                    return false;
                }
                this.d = 0;
            }
            hne hneVar = (hne) d.get(this.c);
            Class cls5 = (Class) list.get(this.d);
            hnn a = this.b.a(cls5);
            hqh h = this.b.h();
            hou houVar3 = this.b;
            this.i = new hpv(h, hneVar, houVar3.m, houVar3.e, houVar3.f, a, cls5, houVar3.h);
            File a2 = houVar3.c().a(this.i);
            this.h = a2;
            if (a2 != null) {
                this.e = hneVar;
                this.f = this.b.f(a2);
                this.g = 0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, hns] */
    @Override // defpackage.hnr
    public final void e(Exception exc) {
        this.a.b(this.i, exc, this.j.b, 4);
    }
}
