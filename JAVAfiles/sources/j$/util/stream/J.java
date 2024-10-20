package j$.util.stream;

import j$.util.Optional;

/* loaded from: classes5.dex */
final class J extends K {
    static final F c;
    static final F d;

    static {
        EnumC0148h3 enumC0148h3 = EnumC0148h3.REFERENCE;
        c = new F(true, enumC0148h3, Optional.empty(), new C0169m(24), new C0159k(18));
        d = new F(false, enumC0148h3, Optional.empty(), new C0169m(24), new C0159k(18));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return Optional.of(this.b);
        }
        return null;
    }
}
