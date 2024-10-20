package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jvo {
    public final afrs a;
    public final int b;
    public final int c;
    public final ascv d;
    public final ascv e;
    private final arwe f;
    private final ascg g;
    private final ascv h;

    public jvo(arwe arweVar, ascg ascgVar) {
        afrs afrsVar;
        int i;
        int i2;
        arweVar.getClass();
        ascgVar.getClass();
        this.f = arweVar;
        this.g = ascgVar;
        if (((Boolean) nhr.a.e()).booleanValue()) {
            afrsVar = afrl.a;
        } else {
            afrsVar = afrk.a;
        }
        this.a = afrsVar;
        if (((Boolean) nhr.a.e()).booleanValue()) {
            Object e = nhr.e.e();
            e.getClass();
            i = ((Number) e).intValue();
        } else {
            i = 12200;
        }
        this.b = i;
        if (((Boolean) nhr.a.e()).booleanValue()) {
            Object e2 = nhr.d.e();
            e2.getClass();
            i2 = ((Number) e2).intValue();
        } else {
            i2 = 8000;
        }
        this.c = i2;
        asai a = asar.a(new jtf(new jtf(ascgVar, 8), 9));
        int i3 = ascp.a;
        ascv T = arrn.T(a, arweVar, asco.a, null);
        this.d = T;
        ascv T2 = arrn.T(asar.a(new jtf(new jtf(ascgVar, 10), 11)), arweVar, asco.a, false);
        this.h = T2;
        this.e = arrn.T(asar.a(new jdn(T2, T, new jdu(this, (arpe) null, 5), 17, null)), arweVar, asco.a, null);
    }

    public static final Duration a(Duration duration, Duration duration2) {
        return duration2.multipliedBy(duration.dividedBy(duration2));
    }
}
