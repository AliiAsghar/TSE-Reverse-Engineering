package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public class aljw extends WeakReference implements alke {
    final int g;
    final alke h;
    volatile aljs i;

    public aljw(ReferenceQueue referenceQueue, Object obj, int i, alke alkeVar) {
        super(obj, referenceQueue);
        this.i = alkd.b;
        this.g = i;
        this.h = alkeVar;
    }

    @Override // defpackage.alke
    public final int a() {
        return this.g;
    }

    public long b() {
        throw new UnsupportedOperationException();
    }

    public long c() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.alke
    public final aljs d() {
        return this.i;
    }

    @Override // defpackage.alke
    public final alke e() {
        return this.h;
    }

    public alke f() {
        throw new UnsupportedOperationException();
    }

    public alke g() {
        throw new UnsupportedOperationException();
    }

    public alke h() {
        throw new UnsupportedOperationException();
    }

    public alke i() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.alke
    public final Object j() {
        return get();
    }

    public void k(long j) {
        throw new UnsupportedOperationException();
    }

    public void l(alke alkeVar) {
        throw new UnsupportedOperationException();
    }

    public void m(alke alkeVar) {
        throw new UnsupportedOperationException();
    }

    public void n(alke alkeVar) {
        throw new UnsupportedOperationException();
    }

    public void o(alke alkeVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.alke
    public final void p(aljs aljsVar) {
        this.i = aljsVar;
    }

    public void q(long j) {
        throw new UnsupportedOperationException();
    }
}
