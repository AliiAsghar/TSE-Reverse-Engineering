package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwb {
    public int b;
    public boolean c;
    public final dwc d;
    public dwb e;
    public duq h;
    public final int i;
    public HashSet a = null;
    public int f = 0;
    int g = Integer.MIN_VALUE;

    public dwb(dwc dwcVar, int i) {
        this.d = dwcVar;
        this.i = i;
    }

    public final int a() {
        if (!this.c) {
            return 0;
        }
        return this.b;
    }

    public final int b() {
        dwb dwbVar;
        if (this.d.ar == 8) {
            return 0;
        }
        int i = this.g;
        if (i != Integer.MIN_VALUE && (dwbVar = this.e) != null && dwbVar.d.ar == 8) {
            return i;
        }
        return this.f;
    }

    public final dwb c() {
        int i = this.i - 1;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return null;
                    }
                    return this.d.U;
                }
                return this.d.T;
            }
            return this.d.W;
        }
        return this.d.V;
    }

    public final void d(int i, ArrayList arrayList, dwx dwxVar) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ef.m(((dwb) it.next()).d, i, arrayList, dwxVar);
            }
        }
    }

    public final void e() {
        HashSet hashSet;
        dwb dwbVar = this.e;
        if (dwbVar != null && (hashSet = dwbVar.a) != null) {
            hashSet.remove(this);
            if (this.e.a.size() == 0) {
                this.e.a = null;
            }
        }
        this.a = null;
        this.e = null;
        this.f = 0;
        this.g = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void f(int i) {
        this.b = i;
        this.c = true;
    }

    public final void g(int i) {
        if (j()) {
            this.g = i;
        }
    }

    public final boolean h() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((dwb) it.next()).c().j()) {
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        HashSet hashSet = this.a;
        if (hashSet == null || hashSet.size() <= 0) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        if (this.e != null) {
            return true;
        }
        return false;
    }

    public final boolean k(dwb dwbVar) {
        boolean z;
        if (dwbVar == null) {
            return false;
        }
        int i = this.i;
        int i2 = dwbVar.i;
        if (i2 == i) {
            if (i == 6 && (!dwbVar.d.P || !this.d.P)) {
                return false;
            }
            return true;
        }
        int i3 = 9;
        int i4 = 4;
        int i5 = 2;
        switch (i - 1) {
            case 1:
            case 3:
                i3 = 8;
                break;
            case 2:
            case 4:
                i5 = 3;
                i4 = 5;
                break;
            case 5:
                if (i2 == 2 || i2 == 4) {
                    return false;
                }
                return true;
            case 6:
                if (i2 == 6 || i2 == 8 || i2 == 9) {
                    return false;
                }
                return true;
            default:
                return false;
        }
        if (i2 != i5 && i2 != i4) {
            z = false;
        } else {
            z = true;
        }
        if (dwbVar.d instanceof dwg) {
            if (!z && i2 != i3) {
                return false;
            }
            return true;
        }
        return z;
    }

    public final void l(dwb dwbVar, int i) {
        n(dwbVar, i, Integer.MIN_VALUE, false);
    }

    public final void m() {
        duq duqVar = this.h;
        if (duqVar == null) {
            this.h = new duq(1);
        } else {
            duqVar.c();
        }
    }

    public final void n(dwb dwbVar, int i, int i2, boolean z) {
        if (dwbVar == null) {
            e();
            return;
        }
        if (!z && !k(dwbVar)) {
            return;
        }
        this.e = dwbVar;
        if (dwbVar.a == null) {
            dwbVar.a = new HashSet();
        }
        HashSet hashSet = this.e.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f = i;
        this.g = i2;
    }

    public final String toString() {
        return this.d.as + ":" + a.c(this.i);
    }
}
