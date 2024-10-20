package j$.util.stream;

import java.util.Comparator;

/* loaded from: classes5.dex */
abstract class C2 extends AbstractC0162k2 {
    protected final Comparator b;
    protected boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2(InterfaceC0182o2 interfaceC0182o2, Comparator comparator) {
        super(interfaceC0182o2);
        this.b = comparator;
    }

    @Override // j$.util.stream.AbstractC0162k2, j$.util.stream.InterfaceC0182o2
    public final boolean n() {
        this.c = true;
        return false;
    }
}
