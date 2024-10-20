package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akfa {
    public static final akfa a = new akfa(null, Instant.EPOCH, false);
    private final Object b;
    private final aqyx c;

    private akfa(Object obj, Instant instant, boolean z) {
        boolean z2;
        this.b = obj;
        if (obj != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.c = new aqyx(instant, z2, z);
    }

    public static akfa a(Object obj, Instant instant) {
        obj.getClass();
        return new akfa(obj, instant, true);
    }

    public static akfa b(Object obj) {
        obj.getClass();
        return new akfa(obj, Instant.EPOCH, false);
    }

    public final akfa c(algk algkVar) {
        akfa akfaVar = a;
        if (this == akfaVar) {
            return akfaVar;
        }
        if (g()) {
            return a(algkVar.apply(e()), d());
        }
        return b(algkVar.apply(e()));
    }

    public final Instant d() {
        albo.U(f(), "Cannot get timestamp for a CacheResult that does not have content");
        albo.U(g(), "Cannot get timestamp for an invalid CacheResult");
        return (Instant) this.c.c;
    }

    public final Object e() {
        albo.U(f(), "Cannot get data for a CacheResult that does not have content");
        return this.b;
    }

    public final boolean f() {
        return this.c.a;
    }

    public final boolean g() {
        albo.U(f(), "Cannot call isValid() for a CacheResult that does not have content");
        return this.c.b;
    }

    public final String toString() {
        aqyx aqyxVar = this.c;
        if (!aqyxVar.a) {
            return "CacheResult.cacheMiss";
        }
        if (!aqyxVar.b) {
            return "CacheResult.cacheInvalid{data=" + String.valueOf(this.b) + "}";
        }
        Object obj = this.b;
        Object obj2 = aqyxVar.c;
        return "CacheResult.cacheHit{data=" + String.valueOf(obj) + ", timestamp=" + obj2.toString() + "}";
    }
}
