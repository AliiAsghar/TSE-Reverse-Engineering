package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvo {
    public static final Integer a = 0;
    public boolean b = true;
    public final HashMap c;
    public final HashMap d;
    public final HashMap e;
    public final dve f;
    public final ArrayList g;
    public final ArrayList h;
    public boolean i;
    public final dqv j;
    public long k;
    public qdq l;
    private int m;

    public dvo(dqv dqvVar) {
        HashMap hashMap = new HashMap();
        this.c = hashMap;
        this.d = new HashMap();
        this.e = new HashMap();
        dve dveVar = new dve(this);
        this.f = dveVar;
        this.m = 0;
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = true;
        Integer num = a;
        dveVar.a = num;
        hashMap.put(num, dveVar);
        this.j = dqvVar;
        this.k = dqt.l(0, 0, 15);
        drk drkVar = drk.a;
        this.l = new qdq(this);
    }

    public final int a(Object obj) {
        return Math.round(((Float) obj).floatValue());
    }

    public final dve b(Object obj) {
        dvl dvlVar = (dvl) this.c.get(obj);
        dvl dvlVar2 = dvlVar;
        if (dvlVar == null) {
            dve dveVar = new dve(this);
            this.c.put(obj, dveVar);
            dveVar.a = obj;
            dvlVar2 = dveVar;
        }
        if (dvlVar2 instanceof dve) {
            return (dve) dvlVar2;
        }
        return null;
    }

    public final dvw c() {
        return (dvw) h(1);
    }

    public final dvx d() {
        return (dvx) h(2);
    }

    public final void e(Object obj) {
        this.g.add(obj);
        this.i = true;
    }

    public final boolean f() {
        if (!this.b) {
            return true;
        }
        return false;
    }

    public final void g(Object obj, int i) {
        dve b = b(obj);
        dvs dvsVar = b.c;
        if (dvsVar == null || !(dvsVar instanceof dvv)) {
            dvv dvvVar = new dvv(this);
            dvvVar.b = i;
            dvvVar.f = obj;
            b.g(dvvVar);
        }
    }

    public final dvk h(int i) {
        dvk dvwVar;
        StringBuilder sb = new StringBuilder("__HELPER_KEY_");
        int i2 = this.m;
        this.m = i2 + 1;
        sb.append(i2);
        sb.append("__");
        String sb2 = sb.toString();
        dvk dvkVar = (dvk) this.d.get(sb2);
        if (dvkVar == null) {
            if (i - 1 != 0) {
                dvwVar = new dvx(this);
            } else {
                dvwVar = new dvw(this);
            }
            dvk dvkVar2 = dvwVar;
            dvkVar2.a = sb2;
            this.d.put(sb2, dvkVar2);
            return dvkVar2;
        }
        return dvkVar;
    }

    public dvo() {
        HashMap hashMap = new HashMap();
        this.c = hashMap;
        this.d = new HashMap();
        this.e = new HashMap();
        dve dveVar = new dve(this);
        this.f = dveVar;
        this.m = 0;
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = true;
        Integer num = a;
        dveVar.a = num;
        hashMap.put(num, dveVar);
    }
}
