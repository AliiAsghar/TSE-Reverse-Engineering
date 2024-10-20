package j$.util.stream;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.e0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0130e0 extends AbstractC0135f0 {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC0130e0(AbstractC0114b abstractC0114b, int i, int i2) {
        super(abstractC0114b, i);
        this.l = i2;
    }

    @Override // j$.util.stream.AbstractC0114b
    final boolean M() {
        switch (this.l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.AbstractC0114b, j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    public final /* bridge */ /* synthetic */ IntStream parallel() {
        switch (this.l) {
            case 0:
                parallel();
                return this;
            default:
                parallel();
                return this;
        }
    }

    @Override // j$.util.stream.AbstractC0114b, j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    public final /* bridge */ /* synthetic */ IntStream sequential() {
        switch (this.l) {
            case 0:
                sequential();
                return this;
            default:
                sequential();
                return this;
        }
    }
}
