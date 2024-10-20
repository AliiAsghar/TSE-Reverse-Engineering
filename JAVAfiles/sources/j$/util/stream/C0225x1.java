package j$.util.stream;

/* renamed from: j$.util.stream.x1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
class C0225x1 extends AbstractC0230y1 {
    public final /* synthetic */ int c;
    private final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0225x1(I0 i0, Object obj, int i) {
        super(i0);
        this.c = i;
        this.d = obj;
    }

    @Override // j$.util.stream.AbstractC0230y1
    final void a() {
        switch (this.c) {
            case 0:
                ((H0) this.a).u(this.b, this.d);
                return;
            default:
                this.a.i((Object[]) this.d, this.b);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC0230y1
    final AbstractC0230y1 b(int i, int i2) {
        switch (this.c) {
            case 0:
                return new C0225x1(this, ((H0) this.a).b(i), i2);
            default:
                return new C0225x1(this, this.a.b(i), i2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0225x1(C0225x1 c0225x1, I0 i0, int i) {
        super(c0225x1, i0, i);
        this.c = 1;
        this.d = (Object[]) c0225x1.d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0225x1(C0225x1 c0225x1, H0 h0, int i) {
        super(c0225x1, h0, i);
        this.c = 0;
        this.d = c0225x1.d;
    }
}
