package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rez {
    public final boolean a;
    public final Optional b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;
    private final long i;

    public rez() {
        throw null;
    }

    public static rez a() {
        rey reyVar = new rey(null);
        reyVar.b(false);
        reyVar.a = Optional.empty();
        reyVar.b = "";
        reyVar.d(-1);
        reyVar.e(-1);
        reyVar.c = "";
        reyVar.d = "";
        reyVar.f(-1L);
        reyVar.c("");
        return reyVar.a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rez) {
            rez rezVar = (rez) obj;
            if (this.a == rezVar.a && this.b.equals(rezVar.b) && this.c.equals(rezVar.c) && this.d == rezVar.d && this.e == rezVar.e && this.f.equals(rezVar.f) && this.g.equals(rezVar.g) && this.i == rezVar.i && this.h.equals(rezVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (true != this.a) {
            i = 1237;
        } else {
            i = 1231;
        }
        int hashCode = ((((((((((((i ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
        long j = this.i;
        return (((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        return "VerifiedSmsEligibilityResult{eligible=" + this.a + ", senderMessagingIdentity=" + String.valueOf(this.b) + ", messageBody=" + this.c + ", mcc=" + this.d + ", mnc=" + this.e + ", existingBrandId=" + this.f + ", existingBrandVersionToken=" + this.g + ", startTimeMs=" + this.i + ", imsi=" + this.h + "}";
    }

    public rez(boolean z, Optional optional, String str, int i, int i2, String str2, String str3, long j, String str4) {
        this.a = z;
        this.b = optional;
        this.c = str;
        this.d = i;
        this.e = i2;
        this.f = str2;
        this.g = str3;
        this.i = j;
        this.h = str4;
    }
}
