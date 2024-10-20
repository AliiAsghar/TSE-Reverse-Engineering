package defpackage;

import defpackage.bwj;
import defpackage.bxd;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzf implements bzz, bze {
    public int a;
    public bzi b;
    public bwa c;
    public arqv d;
    public int e;
    public uv f;
    public ve g;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public static final void a(cae caeVar, List list, bzi bziVar) {
            Object obj;
            bzf bzfVar;
            if (!list.isEmpty()) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    int a = caeVar.a((bwa) list.get(i));
                    int n = caeVar.n(caeVar.b, caeVar.h(a));
                    if (n < caeVar.c(caeVar.b, caeVar.h(a + 1))) {
                        obj = caeVar.c[caeVar.d(n)];
                    } else {
                        obj = bwj.a.a;
                    }
                    if (obj instanceof bzf) {
                        bzfVar = (bzf) obj;
                    } else {
                        bzfVar = null;
                    }
                    if (bzfVar != null) {
                        bzfVar.b = bziVar;
                    }
                }
            }
        }
    }

    public bzf(bzi bziVar) {
        this.b = bziVar;
    }

    public static final boolean p(bxe bxeVar, ve veVar) {
        bxeVar.getClass();
        caj d = bxeVar.d();
        if (d == null) {
            d = cav.a;
        }
        if (!d.a(((bxd.a) bxeVar.c()).e, veVar.a(bxeVar))) {
            return true;
        }
        return false;
    }

    @Override // defpackage.bze
    public final void a() {
        bzi bziVar = this.b;
        if (bziVar != null) {
            bziVar.a(this, null);
        }
    }

    public final bxu b(Object obj) {
        bxu a2;
        bzi bziVar = this.b;
        if (bziVar != null && (a2 = bziVar.a(this, obj)) != null) {
            return a2;
        }
        return bxu.a;
    }

    public final void c() {
        bzi bziVar = this.b;
        if (bziVar != null) {
            bziVar.u();
        }
        this.b = null;
        this.f = null;
        this.g = null;
    }

    public final void d(boolean z) {
        int i;
        if (z) {
            i = this.a | 4;
        } else {
            i = this.a & (-5);
        }
        this.a = i;
    }

    public final void e(boolean z) {
        int i;
        if (z) {
            i = this.a | 8;
        } else {
            i = this.a & (-9);
        }
        this.a = i;
    }

    public final void f(boolean z) {
        int i;
        if (z) {
            i = this.a | 32;
        } else {
            i = this.a & (-33);
        }
        this.a = i;
    }

    public final void g(boolean z) {
        int i;
        if (z) {
            i = this.a | 512;
        } else {
            i = this.a & (-513);
        }
        this.a = i;
    }

    public final void h(boolean z) {
        int i;
        if (z) {
            i = this.a | 16;
        } else {
            i = this.a & (-17);
        }
        this.a = i;
    }

    public final void i(int i) {
        this.e = i;
        h(false);
    }

    public final boolean j() {
        if ((this.a & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if ((this.a & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.a & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        bwa bwaVar;
        if (this.b != null && (bwaVar = this.c) != null && bwaVar.a()) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        if (this.g != null) {
            return true;
        }
        return false;
    }

    public final void o() {
        this.a |= 1;
    }
}
