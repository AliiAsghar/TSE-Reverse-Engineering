package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.y1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0230y1 extends CountedCompleter {
    protected final I0 a;
    protected final int b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0230y1(I0 i0) {
        this.a = i0;
        this.b = 0;
    }

    abstract void a();

    abstract AbstractC0230y1 b(int i, int i2);

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        AbstractC0230y1 abstractC0230y1 = this;
        while (abstractC0230y1.a.t() != 0) {
            AbstractC0175n0.s(abstractC0230y1, abstractC0230y1.a.t() - 1);
            int i = 0;
            int i2 = 0;
            while (i < abstractC0230y1.a.t() - 1) {
                AbstractC0230y1 b = abstractC0230y1.b(i, abstractC0230y1.b + i2);
                i2 = (int) (i2 + b.a.count());
                b.fork();
                i++;
            }
            abstractC0230y1 = abstractC0230y1.b(i, abstractC0230y1.b + i2);
        }
        abstractC0230y1.a();
        AbstractC0175n0.r(abstractC0230y1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0230y1(AbstractC0230y1 abstractC0230y1, I0 i0, int i) {
        super(abstractC0230y1);
        this.a = i0;
        this.b = i;
    }
}
