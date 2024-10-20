package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongFunction;

/* renamed from: j$.util.stream.i0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C0150i0 extends AbstractC0157j2 {
    public final /* synthetic */ int b;
    final /* synthetic */ AbstractC0114b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0150i0(AbstractC0114b abstractC0114b, InterfaceC0182o2 interfaceC0182o2, int i) {
        super(interfaceC0182o2);
        this.b = i;
        this.c = abstractC0114b;
    }

    @Override // j$.util.stream.InterfaceC0177n2, java.util.function.LongConsumer
    public final void accept(long j) {
        switch (this.b) {
            case 0:
                this.a.accept((InterfaceC0182o2) ((LongFunction) ((C0218w) this.c).n).apply(j));
                return;
            default:
                ((LongConsumer) ((C0165l0) this.c).n).accept(j);
                this.a.accept(j);
                return;
        }
    }
}
