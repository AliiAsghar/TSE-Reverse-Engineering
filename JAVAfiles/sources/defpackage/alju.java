package defpackage;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alju extends aljw {
    volatile long a;
    alke b;
    alke c;

    public alju(ReferenceQueue referenceQueue, Object obj, int i, alke alkeVar) {
        super(referenceQueue, obj, i, alkeVar);
        this.a = Long.MAX_VALUE;
        int i2 = alkd.x;
        alji aljiVar = alji.a;
        this.b = aljiVar;
        this.c = aljiVar;
    }

    @Override // defpackage.aljw, defpackage.alke
    public final long b() {
        return this.a;
    }

    @Override // defpackage.aljw, defpackage.alke
    public final alke f() {
        return this.b;
    }

    @Override // defpackage.aljw, defpackage.alke
    public final alke h() {
        return this.c;
    }

    @Override // defpackage.aljw, defpackage.alke
    public final void k(long j) {
        this.a = j;
    }

    @Override // defpackage.aljw, defpackage.alke
    public final void l(alke alkeVar) {
        this.b = alkeVar;
    }

    @Override // defpackage.aljw, defpackage.alke
    public final void n(alke alkeVar) {
        this.c = alkeVar;
    }
}
