package defpackage;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aljv extends aljw {
    volatile long a;
    alke b;
    alke c;
    volatile long d;
    alke e;
    alke f;

    public aljv(ReferenceQueue referenceQueue, Object obj, int i, alke alkeVar) {
        super(referenceQueue, obj, i, alkeVar);
        this.a = Long.MAX_VALUE;
        int i2 = alkd.x;
        alji aljiVar = alji.a;
        this.b = aljiVar;
        this.c = aljiVar;
        this.d = Long.MAX_VALUE;
        alji aljiVar2 = alji.a;
        this.e = aljiVar2;
        this.f = aljiVar2;
    }

    @Override // defpackage.aljw, defpackage.alke
    public final long b() {
        return this.a;
    }

    @Override // defpackage.aljw, defpackage.alke
    public final long c() {
        return this.d;
    }

    @Override // defpackage.aljw, defpackage.alke
    public final alke f() {
        return this.b;
    }

    @Override // defpackage.aljw, defpackage.alke
    public final alke g() {
        return this.e;
    }

    @Override // defpackage.aljw, defpackage.alke
    public final alke h() {
        return this.c;
    }

    @Override // defpackage.aljw, defpackage.alke
    public final alke i() {
        return this.f;
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
    public final void m(alke alkeVar) {
        this.e = alkeVar;
    }

    @Override // defpackage.aljw, defpackage.alke
    public final void n(alke alkeVar) {
        this.c = alkeVar;
    }

    @Override // defpackage.aljw, defpackage.alke
    public final void o(alke alkeVar) {
        this.f = alkeVar;
    }

    @Override // defpackage.aljw, defpackage.alke
    public final void q(long j) {
        this.d = j;
    }
}
