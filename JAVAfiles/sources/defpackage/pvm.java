package defpackage;

import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pvm {
    private Object a;
    private Object b;

    public final pvp a() {
        Object obj;
        Object obj2 = this.a;
        if (obj2 != null && (obj = this.b) != null) {
            return new pvr((Duration) obj2, (Duration) obj, 0);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" rcsValidity");
        }
        if (this.b == null) {
            sb.append(" nonRcsValidity");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(Duration duration) {
        if (duration != null) {
            this.b = duration;
            return;
        }
        throw new NullPointerException("Null nonRcsValidity");
    }

    public final void c(Duration duration) {
        if (duration != null) {
            this.a = duration;
            return;
        }
        throw new NullPointerException("Null rcsValidity");
    }

    public final pub d() {
        Object obj;
        Object obj2 = this.b;
        if (obj2 != null && (obj = this.a) != null) {
            return new pub((String) obj2, (String) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" serviceId");
        }
        if (this.a == null) {
            sb.append(" version");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void e(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null serviceId");
    }

    public final void f(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null version");
    }

    public final pto g() {
        if (this.b != null && this.a != null) {
            return new ptk((ptz) this.b, (Instant) this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" rcsCapabilities");
        }
        if (this.a == null) {
            sb.append(" lastRefreshTimestamp");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void h(Instant instant) {
        if (instant != null) {
            this.a = instant;
            return;
        }
        throw new NullPointerException("Null lastRefreshTimestamp");
    }

    public final void i(ptz ptzVar) {
        if (ptzVar != null) {
            this.b = ptzVar;
            return;
        }
        throw new NullPointerException("Null rcsCapabilities");
    }
}
