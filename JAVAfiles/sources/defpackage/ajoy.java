package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajoy extends ajpr {
    private final ajpq a;
    private final String b;
    private final Instant c;
    private final String d;

    public ajoy(ajpq ajpqVar, String str, Instant instant, String str2) {
        this.a = ajpqVar;
        this.b = str;
        this.c = instant;
        this.d = str2;
    }

    @Override // defpackage.ajpr
    public final ajpq a() {
        return this.a;
    }

    @Override // defpackage.ajpr
    public final Instant b() {
        return this.c;
    }

    @Override // defpackage.ajpr
    public final String c() {
        return this.b;
    }

    @Override // defpackage.ajpr
    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajpr) {
            ajpr ajprVar = (ajpr) obj;
            if (this.a.equals(ajprVar.a()) && this.b.equals(ajprVar.c()) && this.c.equals(ajprVar.b()) && this.d.equals(ajprVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        Instant instant = this.c;
        return "MessageReceipt{type=" + this.a.toString() + ", messageId=" + this.b + ", timestamp=" + instant.toString() + ", status=" + this.d + "}";
    }
}
