package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aezi {
    public final List a;
    public final long b;
    public final long c;
    public final List d;
    public final long e;
    public final long f;

    public aezi(List list, long j, long j2, List list2, long j3, long j4) {
        this.a = list;
        this.b = j;
        this.c = j2;
        this.d = list2;
        this.e = j3;
        this.f = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aezi)) {
            return false;
        }
        aezi aeziVar = (aezi) obj;
        if (d.F(this.a, aeziVar.a) && a.bB(this.b, aeziVar.b) && a.bB(this.c, aeziVar.c) && d.F(this.d, aeziVar.d) && a.bB(this.e, aeziVar.e) && a.bB(this.f, aeziVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + a.A(this.b)) * 31) + a.A(this.c)) * 31) + this.d.hashCode()) * 31) + a.A(this.e)) * 31) + a.A(this.f);
    }

    public final String toString() {
        long j = this.f;
        long j2 = this.e;
        long j3 = this.c;
        return "TextualBubbleColorData(normalBackgroundColor=" + this.a + ", normalTextColor=" + cku.g(this.b) + ", normalLinkColor=" + cku.g(j3) + ", highlightedBackgroundColors=" + this.d + ", highlightedTextColor=" + cku.g(j2) + ", highlightedLinkColor=" + cku.g(j) + ")";
    }
}
