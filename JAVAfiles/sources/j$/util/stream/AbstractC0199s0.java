package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.s0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
abstract class AbstractC0199s0 implements InterfaceC0182o2 {
    boolean a;
    boolean b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0199s0(EnumC0204t0 enumC0204t0) {
        boolean z;
        z = enumC0204t0.b;
        this.b = !z;
    }

    @Override // j$.util.stream.InterfaceC0182o2
    public /* synthetic */ void accept(double d) {
        AbstractC0219w0.a();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0182o2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC0182o2
    public final /* synthetic */ void l(long j) {
    }

    @Override // j$.util.stream.InterfaceC0182o2
    public final boolean n() {
        return this.a;
    }

    @Override // j$.util.stream.InterfaceC0182o2
    public /* synthetic */ void accept(int i) {
        AbstractC0219w0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0182o2, j$.util.stream.InterfaceC0177n2, java.util.function.LongConsumer
    public /* synthetic */ void accept(long j) {
        AbstractC0219w0.l();
        throw null;
    }
}
