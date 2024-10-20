package defpackage;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aljy extends aljw {
    volatile long a;
    alke b;
    alke c;

    public aljy(ReferenceQueue referenceQueue, Object obj, int i, alke alkeVar) {
        super(referenceQueue, obj, i, alkeVar);
        this.a = Long.MAX_VALUE;
        int i2 = alkd.x;
        alji aljiVar = alji.a;
        this.b = aljiVar;
        this.c = aljiVar;
    }

    @Override // defpackage.aljw, defpackage.alke
    public final long c() {
        return this.a;
    }

    @Override // defpackage.aljw, defpackage.alke
    public final alke g() {
        return this.b;
    }

    @Override // defpackage.aljw, defpackage.alke
    public final alke i() {
        return this.c;
    }

    @Override // defpackage.aljw, defpackage.alke
    public final void m(alke alkeVar) {
        this.b = alkeVar;
    }

    @Override // defpackage.aljw, defpackage.alke
    public final void o(alke alkeVar) {
        this.c = alkeVar;
    }

    @Override // defpackage.aljw, defpackage.alke
    public final void q(long j) {
        this.a = j;
    }
}
