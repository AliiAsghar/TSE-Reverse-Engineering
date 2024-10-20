package j$.util.stream;

import java.util.HashSet;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* loaded from: classes5.dex */
final class r extends AbstractC0162k2 {
    public final /* synthetic */ int b;
    Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(AbstractC0114b abstractC0114b, InterfaceC0182o2 interfaceC0182o2, int i) {
        super(interfaceC0182o2);
        this.b = i;
        this.c = abstractC0114b;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                if (!((HashSet) this.c).contains(obj)) {
                    ((HashSet) this.c).add(obj);
                    this.a.accept((InterfaceC0182o2) obj);
                    return;
                }
                return;
            case 1:
                ((Consumer) ((C0218w) this.c).n).accept(obj);
                this.a.accept((InterfaceC0182o2) obj);
                return;
            case 2:
                if (((Predicate) ((C0218w) this.c).n).test(obj)) {
                    this.a.accept((InterfaceC0182o2) obj);
                    return;
                }
                return;
            case 3:
                this.a.accept((InterfaceC0182o2) ((C0127d2) this.c).n.apply(obj));
                return;
            case 4:
                this.a.accept(((ToIntFunction) ((Y) this.c).n).applyAsInt(obj));
                return;
            case 5:
                this.a.accept(((ToLongFunction) ((C0165l0) this.c).n).applyAsLong(obj));
                return;
            default:
                this.a.accept(((ToDoubleFunction) ((C0223x) this.c).n).applyAsDouble(obj));
                return;
        }
    }

    @Override // j$.util.stream.AbstractC0162k2, j$.util.stream.InterfaceC0182o2
    public void k() {
        switch (this.b) {
            case 0:
                this.c = null;
                this.a.k();
                return;
            default:
                super.k();
                return;
        }
    }

    @Override // j$.util.stream.AbstractC0162k2, j$.util.stream.InterfaceC0182o2
    public void l(long j) {
        switch (this.b) {
            case 0:
                this.c = new HashSet();
                this.a.l(-1L);
                return;
            case 1:
            default:
                super.l(j);
                return;
            case 2:
                this.a.l(-1L);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(InterfaceC0182o2 interfaceC0182o2) {
        super(interfaceC0182o2);
        this.b = 0;
    }
}
