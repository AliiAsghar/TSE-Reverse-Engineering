package defpackage;

import defpackage.dli;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbs {
    public dqv a;
    public diy b;
    private dhv c;
    private dje d;
    private dli.a e;
    private int f;
    private boolean g;
    private int h;
    private List i;
    private dic k;
    private drk l;
    private long j = bbq.a;
    private int m = -1;
    private int n = -1;

    public /* synthetic */ bbs(dhv dhvVar, dje djeVar, dli.a aVar, int i, boolean z, int i2, List list) {
        this.c = dhvVar;
        this.d = djeVar;
        this.e = aVar;
        this.f = i;
        this.g = z;
        this.h = i2;
        this.i = list;
    }

    private final void h() {
        this.k = null;
        this.b = null;
        this.n = -1;
        this.m = -1;
    }

    public final int a(int i, drk drkVar) {
        int i2 = this.m;
        int i3 = this.n;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        int a = ayr.a(b(dqt.d(0, i, 0, Integer.MAX_VALUE), drkVar).d);
        this.m = i;
        this.n = a;
        return a;
    }

    public final dia b(long j, drk drkVar) {
        dic c = c(drkVar);
        long b = bbr.b(j, this.g, this.f, c.a());
        boolean z = this.g;
        int i = this.f;
        return new dia(c, b, bbr.a(z, i, this.h), i);
    }

    public final dic c(drk drkVar) {
        dic dicVar = this.k;
        if (dicVar == null || drkVar != this.l || dicVar.c()) {
            this.l = drkVar;
            dhv dhvVar = this.c;
            dje a = djf.a(this.d, drkVar);
            dqv dqvVar = this.a;
            dqvVar.getClass();
            dli.a aVar = this.e;
            List list = this.i;
            if (list == null) {
                list = arnv.a;
            }
            dicVar = new dic(dhvVar, a, list, dqvVar, aVar);
        }
        this.k = dicVar;
        return dicVar;
    }

    public final diy d() {
        diy diyVar = this.b;
        if (diyVar != null) {
            return diyVar;
        }
        throw new IllegalStateException("You must call layoutWithConstraints first");
    }

    public final diy e(drk drkVar, long j, dia diaVar) {
        float min = Math.min(diaVar.a.a(), diaVar.c);
        dhv dhvVar = this.c;
        dje djeVar = this.d;
        List list = this.i;
        if (list == null) {
            list = arnv.a;
        }
        int i = this.h;
        boolean z = this.g;
        int i2 = this.f;
        dqv dqvVar = this.a;
        dqvVar.getClass();
        return new diy(new dix(dhvVar, djeVar, list, i, z, i2, dqvVar, drkVar, this.e, j), diaVar, dqt.e(j, (ayr.a(min) << 32) | (ayr.a(diaVar.d) & 4294967295L)));
    }

    public final void f(dqv dqvVar) {
        long j;
        dqv dqvVar2 = this.a;
        if (dqvVar != null) {
            j = bbq.a(dqvVar);
        } else {
            j = bbq.a;
        }
        if (dqvVar2 == null) {
            this.a = dqvVar;
            this.j = j;
        } else {
            if (dqvVar != null && a.bB(this.j, j)) {
                return;
            }
            this.a = dqvVar;
            this.j = j;
            h();
        }
    }

    public final void g(dhv dhvVar, dje djeVar, dli.a aVar, int i, boolean z, int i2, List list) {
        this.c = dhvVar;
        this.d = djeVar;
        this.e = aVar;
        this.f = i;
        this.g = z;
        this.h = i2;
        this.i = list;
        h();
    }
}
