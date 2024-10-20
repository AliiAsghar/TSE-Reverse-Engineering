package j$.util.stream;

import j$.util.Collection;
import j$.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
final class K2 extends C2 {
    private ArrayList d;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.d.add(obj);
    }

    @Override // j$.util.stream.AbstractC0162k2, j$.util.stream.InterfaceC0182o2
    public final void k() {
        List.EL.sort(this.d, this.b);
        long size = this.d.size();
        InterfaceC0182o2 interfaceC0182o2 = this.a;
        interfaceC0182o2.l(size);
        if (!this.c) {
            Collection.EL.forEach(this.d, new C0109a(5, interfaceC0182o2));
        } else {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (interfaceC0182o2.n()) {
                    break;
                } else {
                    interfaceC0182o2.accept((InterfaceC0182o2) next);
                }
            }
        }
        interfaceC0182o2.k();
        this.d = null;
    }

    @Override // j$.util.stream.AbstractC0162k2, j$.util.stream.InterfaceC0182o2
    public final void l(long j) {
        ArrayList arrayList;
        if (j < 2147483639) {
            if (j >= 0) {
                arrayList = new ArrayList((int) j);
            } else {
                arrayList = new ArrayList();
            }
            this.d = arrayList;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
