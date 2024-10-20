package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public class aljo extends alin {
    final Object g;
    final int h;
    final alke i;
    volatile aljs j = alkd.b;

    public aljo(Object obj, int i, alke alkeVar) {
        this.g = obj;
        this.h = i;
        this.i = alkeVar;
    }

    @Override // defpackage.alin, defpackage.alke
    public final int a() {
        return this.h;
    }

    @Override // defpackage.alin, defpackage.alke
    public final aljs d() {
        return this.j;
    }

    @Override // defpackage.alin, defpackage.alke
    public final alke e() {
        return this.i;
    }

    @Override // defpackage.alin, defpackage.alke
    public final Object j() {
        return this.g;
    }

    @Override // defpackage.alin, defpackage.alke
    public final void p(aljs aljsVar) {
        this.j = aljsVar;
    }
}
