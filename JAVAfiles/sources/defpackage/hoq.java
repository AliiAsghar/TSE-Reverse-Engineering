package defpackage;

import java.io.File;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class hoq implements hot, hnr {
    private final List a;
    private final hou b;
    private final hos c;
    private int d = -1;
    private hne e;
    private List f;
    private int g;
    private File h;
    private volatile kkc i;

    public hoq(List list, hou houVar, hos hosVar) {
        this.a = list;
        this.b = houVar;
        this.c = hosVar;
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
        kkc kkcVar = this.i;
        if (kkcVar != null) {
            kkcVar.b.eX();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, hns] */
    @Override // defpackage.hnr
    public final void b(Object obj) {
        this.c.d(this.e, obj, this.i.b, 3, this.e);
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, hns] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, hns] */
    @Override // defpackage.hot
    public final boolean c() {
        while (true) {
            boolean z = false;
            if (this.f != null && d()) {
                this.i = null;
                while (!z && d()) {
                    List list = this.f;
                    int i = this.g;
                    this.g = i + 1;
                    hse hseVar = (hse) list.get(i);
                    File file = this.h;
                    hou houVar = this.b;
                    this.i = hseVar.b(file, houVar.e, houVar.f, houVar.h);
                    if (this.i != null && this.b.g(this.i.b.a())) {
                        this.i.b.f(this.b.n, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 >= this.a.size()) {
                return false;
            }
            hne hneVar = (hne) this.a.get(this.d);
            hou houVar2 = this.b;
            File a = houVar2.c().a(new hor(hneVar, houVar2.m));
            this.h = a;
            if (a != null) {
                this.e = hneVar;
                this.f = this.b.f(a);
                this.g = 0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, hns] */
    @Override // defpackage.hnr
    public final void e(Exception exc) {
        this.c.b(this.e, exc, this.i.b, 3);
    }
}
