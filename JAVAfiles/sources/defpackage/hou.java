package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hou {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public hlf c;
    public Object d;
    public int e;
    public int f;
    public Class g;
    public hnj h;
    public Map i;
    public Class j;
    public boolean k;
    public boolean l;
    public hne m;
    public hlh n;
    public hpb o;
    public boolean p;
    public boolean q;
    public hpd r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final hnn a(Class cls) {
        hnn hnnVar = (hnn) this.i.get(cls);
        if (hnnVar == null) {
            Iterator it = this.i.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    hnnVar = (hnn) entry.getValue();
                    break;
                }
            }
        }
        if (hnnVar == null) {
            if (this.i.isEmpty() && this.p) {
                throw new IllegalArgumentException(hht.b(cls, "Missing transformation for ", ". If you wish to ignore unknown resource types, use the optional transformation methods."));
            }
            return hsz.b;
        }
        return hnnVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r7v0, types: [ecf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [ecf, java.lang.Object] */
    public final hpr b(Class cls) {
        hpr hprVar;
        hpr hprVar2;
        hpr hprVar3;
        mgu b = this.c.b();
        Object obj = b.d;
        hwt hwtVar = (hwt) obj;
        AtomicReference atomicReference = hwtVar.c;
        Class cls2 = this.g;
        Class cls3 = this.j;
        hyt hytVar = (hyt) atomicReference.getAndSet(null);
        if (hytVar == null) {
            hytVar = new hyt();
        }
        hytVar.a(cls, cls2, cls3);
        synchronized (hwtVar.b) {
            hprVar = (hpr) ((hwt) obj).b.get(hytVar);
        }
        hwtVar.c.set(hytVar);
        Object obj2 = b.d;
        if (hwt.a.equals(hprVar)) {
            return null;
        }
        if (hprVar == null) {
            ArrayList arrayList = new ArrayList();
            for (Class cls4 : ((ico) b.c).b(cls, cls2)) {
                for (Class cls5 : ((hgj) b.b).d(cls4, cls3)) {
                    arrayList.add(new hox(cls, cls4, cls5, ((ico) b.c).a(cls, cls4), ((hgj) b.b).c(cls4, cls5), b.h));
                }
            }
            if (arrayList.isEmpty()) {
                hprVar2 = null;
            } else {
                hprVar2 = new hpr(cls, cls2, cls3, arrayList, b.h);
            }
            Object obj3 = b.d;
            synchronized (((hwt) obj3).b) {
                tm tmVar = ((hwt) obj3).b;
                hyt hytVar2 = new hyt(cls, cls2, cls3);
                if (hprVar2 != null) {
                    hprVar3 = hprVar2;
                } else {
                    hprVar3 = hwt.a;
                }
                tmVar.put(hytVar2, hprVar3);
            }
            return hprVar2;
        }
        return hprVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final hqp c() {
        return this.r.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List, java.lang.Object] */
    public final List d() {
        if (!this.l) {
            this.l = true;
            this.b.clear();
            List e = e();
            int size = e.size();
            for (int i = 0; i < size; i++) {
                kkc kkcVar = (kkc) e.get(i);
                if (!this.b.contains(kkcVar.c)) {
                    this.b.add(kkcVar.c);
                }
                for (int i2 = 0; i2 < kkcVar.a.size(); i2++) {
                    if (!this.b.contains(kkcVar.a.get(i2))) {
                        this.b.add((hne) kkcVar.a.get(i2));
                    }
                }
            }
        }
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List e() {
        if (!this.k) {
            this.k = true;
            this.a.clear();
            List r = this.c.b().r(this.d);
            int size = r.size();
            for (int i = 0; i < size; i++) {
                kkc b = ((hse) r.get(i)).b(this.d, this.e, this.f, this.h);
                if (b != null) {
                    this.a.add(b);
                }
            }
        }
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List f(File file) {
        return this.c.b().r(file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g(Class cls) {
        if (b(cls) != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final hqh h() {
        return this.c.f;
    }
}
