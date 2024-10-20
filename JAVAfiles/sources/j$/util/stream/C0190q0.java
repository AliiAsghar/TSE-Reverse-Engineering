package j$.util.stream;

import java.util.function.Predicate;

/* renamed from: j$.util.stream.q0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C0190q0 extends AbstractC0199s0 {
    final /* synthetic */ EnumC0204t0 c;
    final /* synthetic */ Predicate d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0190q0(EnumC0204t0 enumC0204t0, Predicate predicate) {
        super(enumC0204t0);
        this.c = enumC0204t0;
        this.d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        boolean z;
        boolean z2;
        if (!this.a) {
            boolean test = this.d.test(obj);
            EnumC0204t0 enumC0204t0 = this.c;
            z = enumC0204t0.a;
            if (test == z) {
                this.a = true;
                z2 = enumC0204t0.b;
                this.b = z2;
            }
        }
    }
}
