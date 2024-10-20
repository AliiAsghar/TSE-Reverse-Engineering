package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.u2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0211u2 extends AbstractC0170m0 {
    final /* synthetic */ long m;
    final /* synthetic */ long n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0211u2(AbstractC0170m0 abstractC0170m0, int i, long j, long j2) {
        super(abstractC0170m0, i, 0);
        this.m = j;
        this.n = j2;
    }

    /* JADX WARN: Type inference failed for: r13v5, types: [j$.util.stream.J3, j$.util.Spliterator] */
    @Override // j$.util.stream.AbstractC0114b
    final I0 K(AbstractC0114b abstractC0114b, Spliterator spliterator, IntFunction intFunction) {
        Object invoke;
        long j;
        long j2;
        long j3;
        long C = abstractC0114b.C(spliterator);
        if (C > 0 && spliterator.hasCharacteristics(16384)) {
            return AbstractC0219w0.H(abstractC0114b, AbstractC0219w0.C(abstractC0114b.F(), spliterator, this.m, this.n), true);
        }
        if (EnumC0143g3.ORDERED.y(abstractC0114b.G())) {
            invoke = new C0231y2(this, abstractC0114b, spliterator, intFunction, this.m, this.n).invoke();
            return (I0) invoke;
        }
        j$.util.c0 c0Var = (j$.util.c0) abstractC0114b.T(spliterator);
        long j4 = this.m;
        long j5 = this.n;
        if (j4 <= C) {
            if (j5 >= 0) {
                j3 = Math.min(j5, C - j4);
            } else {
                j3 = C - j4;
            }
            j = j3;
            j2 = 0;
        } else {
            j = j5;
            j2 = j4;
        }
        return AbstractC0219w0.H(this, new J3(c0Var, j2, j), true);
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
            j$.util.c0 c0Var = (j$.util.c0) abstractC0114b.T(spliterator);
            long j4 = this.m;
            return new A3(c0Var, j4, AbstractC0219w0.B(j4, j3));
        }
        if (EnumC0143g3.ORDERED.y(abstractC0114b.G())) {
            invoke = new C0231y2(this, abstractC0114b, spliterator, new W(22), this.m, this.n).invoke();
            return ((I0) invoke).spliterator();
        }
        j$.util.c0 c0Var2 = (j$.util.c0) abstractC0114b.T(spliterator);
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
        return new J3(c0Var2, j2, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0114b
    public final InterfaceC0182o2 N(int i, InterfaceC0182o2 interfaceC0182o2) {
        return new C0206t2(this, interfaceC0182o2);
    }
}
