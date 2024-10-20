package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aljq extends aljo {
    volatile long a;
    alke b;
    alke c;

    public aljq(Object obj, int i, alke alkeVar) {
        super(obj, i, alkeVar);
        this.a = Long.MAX_VALUE;
        int i2 = alkd.x;
        alji aljiVar = alji.a;
        this.b = aljiVar;
        this.c = aljiVar;
    }

    @Override // defpackage.alin, defpackage.alke
    public final long c() {
        return this.a;
    }

    @Override // defpackage.alin, defpackage.alke
    public final alke g() {
        return this.b;
    }

    @Override // defpackage.alin, defpackage.alke
    public final alke i() {
        return this.c;
    }

    @Override // defpackage.alin, defpackage.alke
    public final void m(alke alkeVar) {
        this.b = alkeVar;
    }

    @Override // defpackage.alin, defpackage.alke
    public final void o(alke alkeVar) {
        this.c = alkeVar;
    }

    @Override // defpackage.alin, defpackage.alke
    public final void q(long j) {
        this.a = j;
    }
}
