package defpackage;

import j$.util.Collection;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class unu {
    public final String a;
    public final int b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final alog g;
    private final long h;
    private final long i;

    public unu() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static unu a(String str, alog alogVar) {
        String str2;
        int i = 0;
        upr uprVar = (upr) alogVar.get(0);
        String o = uprVar.o();
        int indexOf = o.indexOf("-");
        int i2 = 1;
        if (indexOf > 0) {
            str2 = o.substring(indexOf + 1);
        } else {
            str2 = "";
        }
        alog alogVar2 = (alog) Collection.EL.stream(alogVar).map(new unt(i2)).collect(alls.a);
        long longValue = ((Long) Collection.EL.stream(alogVar).map(new unt(i)).min(new lvh(11)).orElse(0L)).longValue();
        String p = uprVar.p();
        if (true == str2.isEmpty()) {
            str2 = null;
        }
        return new unu(str, p, str2, uprVar.o(), uprVar.m(), uprVar.h(), alogVar2, uprVar.k(), longValue);
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof unu) {
            unu unuVar = (unu) obj;
            if (this.c.equals(unuVar.c) && this.a.equals(unuVar.a) && ((str = this.d) != null ? str.equals(unuVar.d) : unuVar.d == null) && this.e.equals(unuVar.e) && ((str2 = this.f) != null ? str2.equals(unuVar.f) : unuVar.f == null) && this.b == unuVar.b && alzz.at(this.g, unuVar.g) && this.h == unuVar.h && this.i == unuVar.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((this.c.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
        String str = this.d;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = ((((hashCode2 * 1000003) ^ hashCode) * 1000003) ^ this.e.hashCode()) * 1000003;
        String str2 = this.f;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int hashCode4 = (((((hashCode3 ^ i) * 1000003) ^ this.b) * 1000003) ^ this.g.hashCode()) * 1000003;
        long j = this.h;
        long j2 = this.i;
        return ((hashCode4 ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "WorkHandlerProcessingMetaData{src=" + this.c + ", type=" + this.a + ", subQueue=" + this.d + ", queue=" + this.e + ", cancellationTag=" + this.f + ", attemptCount=" + this.b + ", attemptCounts=" + this.g.toString() + ", idForLogging=" + this.h + ", potentiallyMisleadingEarliestScheduledExecutionTimeMs=" + this.i + "}";
    }

    public unu(String str, String str2, String str3, String str4, String str5, int i, alog alogVar, long j, long j2) {
        this.c = str;
        if (str2 == null) {
            throw new NullPointerException("Null type");
        }
        this.a = str2;
        this.d = str3;
        if (str4 != null) {
            this.e = str4;
            this.f = str5;
            this.b = i;
            if (alogVar != null) {
                this.g = alogVar;
                this.h = j;
                this.i = j2;
                return;
            }
            throw new NullPointerException("Null attemptCounts");
        }
        throw new NullPointerException("Null queue");
    }
}
