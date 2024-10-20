package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adqv {
    public static final adqv a;
    public static final adqv b;
    public static final adqv c;
    public static final adqv d;
    public static final adqv e;
    public final int f;
    public final int g;
    public final Duration h;

    static {
        ajps a2 = a();
        a2.h(1);
        a = a2.e();
        ajps a3 = a();
        a3.h(2);
        b = a3.e();
        ajps a4 = a();
        a4.h(3);
        c = a4.e();
        ajps a5 = a();
        a5.h(4);
        d = a5.e();
        ajps a6 = a();
        a6.h(5);
        e = a6.e();
        ajps a7 = a();
        a7.h(6);
        a7.e();
    }

    public adqv() {
        throw null;
    }

    public static ajps a() {
        ajps ajpsVar = new ajps();
        ajpsVar.f(0);
        ajpsVar.g(Duration.ZERO);
        return ajpsVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adqv) {
            adqv adqvVar = (adqv) obj;
            if (this.f == adqvVar.f && this.g == adqvVar.g && this.h.equals(adqvVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f ^ 1000003) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        return "InstantMessageError{type=" + this.f + ", reason=" + this.g + ", retryAfter=" + String.valueOf(this.h) + "}";
    }

    public adqv(int i, int i2, Duration duration) {
        this.f = i;
        this.g = i2;
        this.h = duration;
    }
}
