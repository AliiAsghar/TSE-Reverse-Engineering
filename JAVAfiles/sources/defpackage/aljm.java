package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aljm extends aljo {
    volatile long a;
    alke b;
    alke c;

    public aljm(Object obj, int i, alke alkeVar) {
        super(obj, i, alkeVar);
        this.a = Long.MAX_VALUE;
        int i2 = alkd.x;
        alji aljiVar = alji.a;
        this.b = aljiVar;
        this.c = aljiVar;
    }

    @Override // defpackage.alin, defpackage.alke
    public final long b() {
        return this.a;
    }

    @Override // defpackage.alin, defpackage.alke
    public final alke f() {
        return this.b;
    }

    @Override // defpackage.alin, defpackage.alke
    public final alke h() {
        return this.c;
    }

    @Override // defpackage.alin, defpackage.alke
    public final void k(long j) {
        this.a = j;
    }

    @Override // defpackage.alin, defpackage.alke
    public final void l(alke alkeVar) {
        this.b = alkeVar;
    }

    @Override // defpackage.alin, defpackage.alke
    public final void n(alke alkeVar) {
        this.c = alkeVar;
    }
}
