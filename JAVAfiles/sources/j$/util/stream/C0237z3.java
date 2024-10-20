package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.z3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0237z3 extends A3 implements j$.util.c0 {
    /* JADX WARN: Type inference failed for: r10v0, types: [j$.util.stream.C3, j$.util.Spliterator] */
    @Override // j$.util.stream.C3
    protected final Spliterator a(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new C3((j$.util.c0) spliterator, j, j2, j3, j4);
    }

    @Override // j$.util.stream.A3
    protected final Object b() {
        return new F0(1);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Q.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.Q.g(this, consumer);
    }
}
