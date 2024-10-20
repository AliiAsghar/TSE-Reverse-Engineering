package defpackage;

import android.text.Spanned;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kkr {
    public final String a;
    public final String b;
    public final Spanned c;
    public final long d;
    public final boolean e;

    public kkr() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kkr) {
            kkr kkrVar = (kkr) obj;
            if (this.a.equals(kkrVar.a) && this.b.equals(kkrVar.b) && this.c.equals(kkrVar.c) && this.d == kkrVar.d && this.e == kkrVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        if (true != this.e) {
            i = 1237;
        } else {
            i = 1231;
        }
        long j = this.d;
        return (((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ i;
    }

    public final String toString() {
        return "Message{normalizedDestination=" + this.a + ", displayDestination=" + this.b + ", textContent=" + String.valueOf(this.c) + ", timestamp=" + this.d + ", isIncoming=" + this.e + "}";
    }

    public kkr(String str, String str2, Spanned spanned, long j, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = spanned;
        this.d = j;
        this.e = z;
    }
}
