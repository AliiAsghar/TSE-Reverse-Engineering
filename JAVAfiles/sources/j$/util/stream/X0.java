package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class X0 extends R2 implements C0, InterfaceC0224x0 {
    @Override // j$.util.stream.InterfaceC0224x0, j$.util.stream.A0
    public final C0 a() {
        return this;
    }

    @Override // j$.util.stream.InterfaceC0182o2
    public final /* synthetic */ void accept(int i) {
        AbstractC0219w0.k();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.I0
    public final /* bridge */ /* synthetic */ I0 b(int i) {
        b(i);
        throw null;
    }

    @Override // j$.util.stream.X2, j$.util.stream.H0
    public final Object d() {
        return (double[]) super.d();
    }

    @Override // j$.util.stream.X2, j$.util.stream.H0
    public final void e(Object obj) {
        super.e((DoubleConsumer) obj);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ I0 h(long j, long j2, IntFunction intFunction) {
        return AbstractC0219w0.t(this, j, j2);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ void i(Object[] objArr, int i) {
        AbstractC0219w0.n(this, (Double[]) objArr, i);
    }

    @Override // j$.util.stream.InterfaceC0182o2
    public final void k() {
    }

    @Override // j$.util.stream.InterfaceC0182o2
    public final void l(long j) {
        clear();
        A(j);
    }

    @Override // j$.util.stream.InterfaceC0182o2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ Object[] p(IntFunction intFunction) {
        return AbstractC0219w0.m(this, intFunction);
    }

    @Override // j$.util.stream.InterfaceC0167l2
    public final /* synthetic */ void q(Double d) {
        AbstractC0219w0.e(this, d);
    }

    @Override // j$.util.stream.R2, java.lang.Iterable, j$.lang.a, j$.util.Collection
    public final j$.util.f0 spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ int t() {
        return 0;
    }

    @Override // j$.util.stream.X2, j$.util.stream.H0
    public final void u(int i, Object obj) {
        super.u(i, (double[]) obj);
    }

    @Override // j$.util.stream.A0
    public final I0 a() {
        return this;
    }

    @Override // j$.util.stream.InterfaceC0182o2, j$.util.stream.InterfaceC0177n2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        AbstractC0219w0.l();
        throw null;
    }

    @Override // j$.util.stream.H0, j$.util.stream.I0
    public final H0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.R2, java.lang.Iterable, j$.lang.a, j$.util.Collection
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void q(Object obj) {
        q((Double) obj);
    }
}
