package j$.util.stream;

import j$.util.Spliterator;

/* renamed from: j$.util.stream.v0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C0214v0 extends AbstractC0119c {
    private final C0209u0 j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0214v0(C0209u0 c0209u0, AbstractC0114b abstractC0114b, Spliterator spliterator) {
        super(abstractC0114b, spliterator);
        this.j = c0209u0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0129e
    public final Object a() {
        boolean z;
        AbstractC0114b abstractC0114b = this.a;
        AbstractC0199s0 abstractC0199s0 = (AbstractC0199s0) this.j.b.get();
        abstractC0114b.R(this.b, abstractC0199s0);
        boolean z2 = abstractC0199s0.b;
        z = this.j.a.b;
        if (z2 == z) {
            j$.util.concurrent.n.a(this.h, null, Boolean.valueOf(z2));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0129e
    public final AbstractC0129e e(Spliterator spliterator) {
        return new C0214v0(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0119c
    protected final Object j() {
        boolean z;
        z = this.j.a.b;
        return Boolean.valueOf(!z);
    }

    C0214v0(C0214v0 c0214v0, Spliterator spliterator) {
        super(c0214v0, spliterator);
        this.j = c0214v0.j;
    }
}
