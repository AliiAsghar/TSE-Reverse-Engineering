package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes5.dex */
abstract class K implements Q3 {
    boolean a;
    Object b;

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

    @Override // java.util.function.Consumer
    /* renamed from: accept, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void q(Object obj) {
        if (this.a) {
            return;
        }
        this.a = true;
        this.b = obj;
    }
}
