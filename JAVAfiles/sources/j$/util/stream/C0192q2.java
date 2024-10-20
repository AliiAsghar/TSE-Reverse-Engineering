package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.q2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0192q2 extends AbstractC0137f2 {
    final /* synthetic */ long m;
    final /* synthetic */ long n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0192q2(AbstractC0142g2 abstractC0142g2, int i, long j, long j2) {
        super(abstractC0142g2, i, 0);
        this.m = j;
        this.n = j2;
    }

    /* JADX WARN: Type inference failed for: r13v4, types: [j$.util.stream.J3, j$.util.Spliterator] */
    @Override // j$.util.stream.AbstractC0114b
    final I0 K(AbstractC0114b abstractC0114b, Spliterator spliterator, IntFunction intFunction) {
        Object invoke;
        long j;
        long j2;
        long j3;
        long C = abstractC0114b.C(spliterator);
        if (C > 0 && spliterator.hasCharacteristics(16384)) {
            return AbstractC0219w0.E(abstractC0114b, AbstractC0219w0.C(abstractC0114b.F(), spliterator, this.m, this.n), true, intFunction);
        }
        if (EnumC0143g3.ORDERED.y(abstractC0114b.G())) {
            invoke = new C0231y2(this, abstractC0114b, spliterator, intFunction, this.m, this.n).invoke();
            return (I0) invoke;
        }
        Spliterator T = abstractC0114b.T(spliterator);
        long j4 = this.m;
        long j5 = this.n;
        if (j4 <= C) {
            if (j5 >= 0) {
                j3 = Math.min(j5, C - j4);
            } else {
                j3 = C - j4;
            }
            j2 = j3;
            j = 0;
        } else {
            j = j4;
            j2 = j5;
        }
        return AbstractC0219w0.E(this, new J3(T, j, j2), true, intFunction);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.stream.J3, j$.util.Spliterator] */
    @Override // j$.util.stream.AbstractC0114b
    final Spliterator L(AbstractC0114b abstractC0114b, Spliterator spliterator) {
        Object invoke;
        long j;
        long j2;
        long C = abstractC0114b.C(spliterator);
        long j3 = this.n;
        if (C > 0 && spliterator.hasCharacteristics(16384)) {
            Spliterator T = abstractC0114b.T(spliterator);
            long j4 = this.m;
            return new B3(T, j4, AbstractC0219w0.B(j4, j3));
        }
        if (EnumC0143g3.ORDERED.y(abstractC0114b.G())) {
            invoke = new C0231y2(this, abstractC0114b, spliterator, new W(19), this.m, this.n).invoke();
            return ((I0) invoke).spliterator();
        }
        Spliterator T2 = abstractC0114b.T(spliterator);
        long j5 = this.m;
        if (j5 <= C) {
            long j6 = C - j5;
            if (j3 >= 0) {
                j6 = Math.min(j3, j6);
            }
            j = j6;
            j2 = 0;
        } else {
            j = j3;
            j2 = j5;
        }
        return new J3(T2, j2, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0114b
    public final InterfaceC0182o2 N(int i, InterfaceC0182o2 interfaceC0182o2) {
        return new C0187p2(this, interfaceC0182o2);
    }
}
