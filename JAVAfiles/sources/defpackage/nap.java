package defpackage;

import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class nap implements mzu {
    public final /* synthetic */ agnq a;
    private final /* synthetic */ int b;

    public /* synthetic */ nap(agnq agnqVar, int i) {
        this.b = i;
        this.a = agnqVar;
    }

    @Override // defpackage.mzu
    public final Object a(Consumer consumer) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return new nbo(this.a, new lnn(consumer, 16));
                }
                return new nav(this.a, new lnn(consumer, 15));
            }
            return new mvx(this.a, new lnn(consumer, 10));
        }
        return new nao(this.a, new lnn(consumer, 14));
    }
}
