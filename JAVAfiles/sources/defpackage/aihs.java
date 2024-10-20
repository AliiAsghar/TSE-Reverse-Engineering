package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aihs implements Consumer {
    private final /* synthetic */ int a;

    public /* synthetic */ aihs(int i) {
        this.a = i;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        int i = this.a;
        boolean z = false;
        if (i != 0) {
            if (i != 1) {
                ((aiiy) obj).countDown();
                return;
            }
            advp advpVar = aihw.a;
            if (((Integer) obj).intValue() >= 0) {
                z = true;
            }
            d.t(z, "expected retries >= 0");
            return;
        }
        advp advpVar2 = aihw.a;
        if (((Integer) obj).intValue() > 0) {
            z = true;
        }
        d.t(z, "expected timeout greater than 0");
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
            return Consumer$CC.$default$andThen(this, consumer);
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
