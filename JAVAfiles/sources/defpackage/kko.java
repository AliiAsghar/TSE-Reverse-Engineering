package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kko {
    public Bundle a;
    private boolean b;
    private boolean c;
    private double d;
    private alog e;
    private byte f;

    public final kkp a() {
        alog alogVar;
        Bundle bundle;
        boolean z = true;
        if (this.f == 15 && (alogVar = this.e) != null && (bundle = this.a) != null) {
            kkp kkpVar = new kkp(this.b, this.c, this.d, alogVar, bundle);
            kkpVar.d.getClass();
            double d = kkpVar.c;
            if (d < 0.0d || d > 1.0d) {
                z = false;
            }
            d.s(z);
            return kkpVar;
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f & 1) == 0) {
            sb.append(" includePersonalMessages");
        }
        if ((this.f & 2) == 0) {
            sb.append(" includeMessagesFromContacts");
        }
        if ((this.f & 4) == 0) {
            sb.append(" includeSentMessages");
        }
        if ((this.f & 8) == 0) {
            sb.append(" normalizedEditDistanceThreshold");
        }
        if (this.e == null) {
            sb.append(" redactors");
        }
        if (this.a == null) {
            sb.append(" intentExtras");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b() {
        this.f = (byte) (this.f | 2);
    }

    public final void c(boolean z) {
        this.b = z;
        this.f = (byte) (this.f | 1);
    }

    public final void d(boolean z) {
        this.c = z;
        this.f = (byte) (this.f | 4);
    }

    public final void e(double d) {
        this.d = d;
        this.f = (byte) (this.f | 8);
    }

    public final void f(alog alogVar) {
        if (alogVar != null) {
            this.e = alogVar;
            return;
        }
        throw new NullPointerException("Null redactors");
    }
}
