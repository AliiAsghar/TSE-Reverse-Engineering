package defpackage;

import j$.time.Instant;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xka {
    public final xkk a;
    public final boolean b;
    public final int c;
    public final int d;
    public final Instant e;
    public final int f;
    public final int g;
    public final wyp h;

    public xka(xkk xkkVar, wyp wypVar, boolean z, int i, int i2, Instant instant, int i3, int i4) {
        xkkVar.getClass();
        this.a = xkkVar;
        this.h = wypVar;
        this.b = z;
        this.c = i;
        this.d = i2;
        this.e = instant;
        this.f = i3;
        this.g = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xka)) {
            return false;
        }
        xka xkaVar = (xka) obj;
        if (this.a == xkaVar.a && d.F(this.h, xkaVar.h) && this.b == xkaVar.b && this.c == xkaVar.c && this.d == xkaVar.d && d.F(this.e, xkaVar.e) && this.f == xkaVar.f && this.g == xkaVar.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() * 31) + this.h.hashCode();
        Instant instant = this.e;
        if (instant == null) {
            hashCode = 0;
        } else {
            hashCode = instant.hashCode();
        }
        return (((((((((((hashCode2 * 31) + a.v(this.b)) * 31) + this.c) * 31) + this.d) * 31) + hashCode) * 31) + this.f) * 31) + this.g;
    }

    public final String toString() {
        return "ScanResults(status=" + this.a + ", messagesToSync=" + this.h + ", syncComplete=" + this.b + ", messagesUpdatedCount=" + this.c + ", messagesSyncedCount=" + this.d + ", lastMessageTimestamp=" + this.e + ", remoteTotal=" + this.f + ", localTotal=" + this.g + ")";
    }

    public /* synthetic */ xka(xkk xkkVar) {
        this(xkkVar, new wyp((byte[]) null), false, 0, 0, null, 0, 0);
    }
}
