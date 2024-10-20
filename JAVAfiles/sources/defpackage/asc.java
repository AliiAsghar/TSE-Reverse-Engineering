package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asc implements asb, cuh {
    private final arq a;
    private final cvn b;
    private final ars c;
    private final tx d = new tx((byte[]) null);

    /* JADX WARN: Type inference failed for: r1v2, types: [ars, java.lang.Object] */
    public asc(arq arqVar, cvn cvnVar) {
        this.a = arqVar;
        this.b = cvnVar;
        this.c = arqVar.b.a();
    }

    @Override // defpackage.asb
    public final List a(int i, long j) {
        List list = (List) this.d.a(i);
        if (list == null) {
            Object g = this.c.g(i);
            List a = this.b.a(g, this.a.b(i, g, this.c.f(i)));
            int size = a.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((cuc) a.get(i2)).e(j));
            }
            this.d.f(i, arrayList);
            return arrayList;
        }
        return list;
    }

    @Override // defpackage.dqv
    public final float ec() {
        return this.b.ec();
    }

    @Override // defpackage.drc
    public final float ed() {
        return this.b.ed();
    }

    @Override // defpackage.drc
    public final float ef(long j) {
        return this.b.ef(j);
    }

    @Override // defpackage.dqv
    public final float eg(float f) {
        return this.b.eg(f);
    }

    @Override // defpackage.asb, defpackage.dqv
    public final float eh(int i) {
        return this.b.eh(i);
    }

    @Override // defpackage.dqv
    public final float el(long j) {
        return this.b.el(j);
    }

    @Override // defpackage.dqv
    public final float em(float f) {
        return this.b.em(f);
    }

    @Override // defpackage.dqv
    public final int en(long j) {
        return this.b.en(j);
    }

    @Override // defpackage.dqv
    public final int eo(float f) {
        return this.b.eo(f);
    }

    @Override // defpackage.dqv
    public final long ep(long j) {
        return this.b.ep(j);
    }

    @Override // defpackage.dqv
    public final long eq(long j) {
        return this.b.eq(j);
    }

    @Override // defpackage.drc
    public final long er(float f) {
        return this.b.er(f);
    }

    @Override // defpackage.dqv
    public final long es(float f) {
        return this.b.es(f);
    }

    @Override // defpackage.cuh
    public final cuf et(int i, int i2, Map map, arqr arqrVar) {
        return this.b.et(i, i2, map, arqrVar);
    }

    @Override // defpackage.cuh
    public final cuf eu(int i, int i2, Map map, arqr arqrVar, arqr arqrVar2) {
        return this.b.eu(i, i2, map, arqrVar, arqrVar2);
    }

    @Override // defpackage.ctd
    public final boolean ev() {
        return this.b.ev();
    }

    @Override // defpackage.ctd
    public final drk q() {
        return this.b.q();
    }
}
