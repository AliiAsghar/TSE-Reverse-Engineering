package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ajql implements Consumer {
    private final /* synthetic */ int a;

    public /* synthetic */ ajql(int i) {
        this.a = i;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        int i = this.a;
        boolean z = false;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            ((akxm) obj).e();
                            return;
                        } else {
                            ((aksx) obj).a();
                            return;
                        }
                    }
                    int i2 = akqu.c;
                    ((aksx) obj).a();
                    return;
                }
                ((aknf) obj).a();
                return;
            }
            if (((Double) obj).doubleValue() >= 0.0d) {
                z = true;
            }
            albo.U(z, "Radius must be non-negative.");
            return;
        }
        if (((Double) obj).doubleValue() >= 0.0d) {
            z = true;
        }
        albo.U(z, "Radius must be non-negative.");
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                    return Consumer$CC.$default$andThen(this, consumer);
                }
                return Consumer$CC.$default$andThen(this, consumer);
            }
            return Consumer$CC.$default$andThen(this, consumer);
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
