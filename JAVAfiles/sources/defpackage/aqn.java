package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqn {
    public boolean a;
    public Object b;
    public final ash c;
    private final byk d;
    private final byk e;

    public aqn() {
        this(0, 0);
    }

    public final int a() {
        return this.d.b();
    }

    public final int b() {
        return this.e.b();
    }

    public final void c(int i) {
        this.d.d(i);
    }

    public final void d(int i) {
        this.e.d(i);
    }

    public final void e(int i, int i2) {
        if (i < brg.a) {
            aju.c("Index should be non-negative");
        }
        c(i);
        this.c.c(i);
        d(i2);
    }

    public aqn(int i, int i2) {
        this.d = new bys(i);
        this.e = new bys(i2);
        this.c = new ash(i, 90, BasePaymentResult.ERROR_REQUEST_FAILED);
    }
}
