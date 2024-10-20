package j$.util.stream;

import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0218w extends AbstractC0137f2 {
    public final /* synthetic */ int m;
    final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0218w(AbstractC0114b abstractC0114b, int i, Object obj, int i2) {
        super(abstractC0114b, i, 1);
        this.m = i2;
        this.n = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0114b
    public final InterfaceC0182o2 N(int i, InterfaceC0182o2 interfaceC0182o2) {
        switch (this.m) {
            case 0:
                return new C0213v(this, interfaceC0182o2, 0);
            case 1:
                return new X(this, interfaceC0182o2, 0);
            case 2:
                return new C0150i0(this, interfaceC0182o2, 0);
            case 3:
                return new r(this, interfaceC0182o2, 1);
            default:
                return new r(this, interfaceC0182o2, 2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0218w(AbstractC0142g2 abstractC0142g2, Consumer consumer) {
        super(abstractC0142g2, 0, 1);
        this.m = 3;
        this.n = consumer;
    }
}
