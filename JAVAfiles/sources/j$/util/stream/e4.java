package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* loaded from: classes5.dex */
final class e4 extends g4 implements IntConsumer, j$.util.Y {
    final IntPredicate e;
    int f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(j$.util.Y y, IntPredicate intPredicate, int i) {
        super(y);
        this.g = i;
        this.e = intPredicate;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.d = (this.d + 1) & 63;
        this.f = i;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.g4
    final Spliterator c(Spliterator spliterator) {
        switch (this.g) {
            case 0:
                return new e4((j$.util.Y) spliterator, this, 0);
            default:
                return new e4((j$.util.Y) spliterator, this, 1);
        }
    }

    @Override // j$.util.stream.g4, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Q.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.Q.f(this, consumer);
    }

    @Override // j$.util.stream.g4, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.f0 trySplit() {
        switch (this.g) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
    
        if (r0 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0060, code lost:
    
        r6.b.set(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
    
        r7.accept(r6.f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return r2;
     */
    @Override // j$.util.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean tryAdvance(java.util.function.IntConsumer r7) {
        /*
            r6 = this;
            int r0 = r6.g
            switch(r0) {
                case 0: goto L37;
                default: goto L5;
            }
        L5:
            boolean r0 = r6.c
            r1 = 1
            if (r0 == 0) goto L2a
            boolean r0 = r6.b()
            if (r0 == 0) goto L2a
            j$.util.Spliterator r0 = r6.a
            j$.util.Y r0 = (j$.util.Y) r0
            boolean r0 = r0.tryAdvance(r6)
            if (r0 == 0) goto L2a
            java.util.function.IntPredicate r0 = r6.e
            int r2 = r6.f
            boolean r0 = r0.test(r2)
            if (r0 == 0) goto L2b
            int r0 = r6.f
            r7.accept(r0)
            goto L36
        L2a:
            r0 = 1
        L2b:
            r7 = 0
            r6.c = r7
            if (r0 != 0) goto L35
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.b
            r0.set(r1)
        L35:
            r1 = 0
        L36:
            return r1
        L37:
            boolean r0 = r6.c
            j$.util.Spliterator r1 = r6.a
            if (r0 == 0) goto L6b
            r0 = 0
            r6.c = r0
        L40:
            r2 = r1
            j$.util.Y r2 = (j$.util.Y) r2
            boolean r2 = r2.tryAdvance(r6)
            r3 = 1
            if (r2 == 0) goto L5c
            boolean r4 = r6.b()
            if (r4 == 0) goto L5c
            java.util.function.IntPredicate r4 = r6.e
            int r5 = r6.f
            boolean r4 = r4.test(r5)
            if (r4 == 0) goto L5c
            r0 = 1
            goto L40
        L5c:
            if (r2 == 0) goto L71
            if (r0 == 0) goto L65
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.b
            r0.set(r3)
        L65:
            int r0 = r6.f
            r7.accept(r0)
            goto L71
        L6b:
            j$.util.Y r1 = (j$.util.Y) r1
            boolean r2 = r1.tryAdvance(r7)
        L71:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.e4.tryAdvance(java.util.function.IntConsumer):boolean");
    }

    @Override // j$.util.stream.g4, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.g) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(j$.util.Y y, e4 e4Var, int i) {
        super(y, e4Var);
        this.g = i;
        this.e = e4Var.e;
    }

    @Override // j$.util.f0
    public final void forEachRemaining(IntConsumer intConsumer) {
        do {
        } while (tryAdvance(intConsumer));
    }

    @Override // j$.util.stream.g4, j$.util.Spliterator
    public j$.util.Y trySplit() {
        switch (this.g) {
            case 1:
                if (this.b.get()) {
                    return null;
                }
                return (j$.util.Y) super.trySplit();
            default:
                return super.trySplit();
        }
    }
}
