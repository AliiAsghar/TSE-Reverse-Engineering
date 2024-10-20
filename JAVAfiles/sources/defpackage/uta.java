package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uta {
    public final String a;
    public final String b;
    public final Duration c;
    public final String d;
    public final andy e;
    public final ahjj f;

    public uta() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uta) {
            uta utaVar = (uta) obj;
            String str = this.a;
            if (str != null ? str.equals(utaVar.a) : utaVar.a == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(utaVar.b) : utaVar.b == null) {
                    Duration duration = this.c;
                    if (duration != null ? duration.equals(utaVar.c) : utaVar.c == null) {
                        String str3 = this.d;
                        if (str3 != null ? str3.equals(utaVar.d) : utaVar.d == null) {
                            andy andyVar = this.e;
                            if (andyVar != null ? andyVar.equals(utaVar.e) : utaVar.e == null) {
                                ahjj ahjjVar = this.f;
                                ahjj ahjjVar2 = utaVar.f;
                                if (ahjjVar != null ? ahjjVar.equals(ahjjVar2) : ahjjVar2 == null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        String str = this.a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        String str2 = this.b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = hashCode ^ 1000003;
        Duration duration = this.c;
        if (duration == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = duration.hashCode();
        }
        int i3 = ((((i2 * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003;
        String str3 = this.d;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i4 = (i3 ^ hashCode4) * 1000003;
        andy andyVar = this.e;
        if (andyVar == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = andyVar.hashCode();
        }
        int i5 = (i4 ^ hashCode5) * 1000003;
        ahjj ahjjVar = this.f;
        if (ahjjVar != null) {
            i = ahjjVar.hashCode();
        }
        return i5 ^ i;
    }

    public final String toString() {
        ahjj ahjjVar = this.f;
        andy andyVar = this.e;
        return "WorkRequestExtras{subQueue=" + this.a + ", deduplicationTag=" + this.b + ", initialDelay=" + String.valueOf(this.c) + ", cancellationTag=" + this.d + ", callback=" + String.valueOf(andyVar) + ", workQueueCallback=" + String.valueOf(ahjjVar) + "}";
    }

    public uta(String str, String str2, Duration duration, String str3, andy andyVar, ahjj ahjjVar) {
        this.a = str;
        this.b = str2;
        this.c = duration;
        this.d = str3;
        this.e = andyVar;
        this.f = ahjjVar;
    }
}
