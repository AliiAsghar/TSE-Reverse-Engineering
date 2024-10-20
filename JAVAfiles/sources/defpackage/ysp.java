package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ysp {
    public final boolean a;
    public final long b;
    public final long c;
    public final List d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final String i;
    private final List j;

    public ysp(boolean z, long j, long j2, List list, List list2, int i, int i2, int i3, int i4, String str) {
        str.getClass();
        this.a = z;
        this.b = j;
        this.c = j2;
        this.j = list;
        this.d = list2;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ysp)) {
            return false;
        }
        ysp yspVar = (ysp) obj;
        if (this.a == yspVar.a && this.b == yspVar.b && this.c == yspVar.c && d.F(this.j, yspVar.j) && d.F(this.d, yspVar.d) && this.e == yspVar.e && this.f == yspVar.f && this.g == yspVar.g && this.h == yspVar.h && d.F(this.i, yspVar.i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int v = a.v(this.a);
        List list = this.j;
        return (((((((((((((((((v * 31) + a.A(this.b)) * 31) + a.A(this.c)) * 31) + list.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i.hashCode();
    }

    public final String toString() {
        return "TachyonSpamMetadata(isContact=" + this.a + ", earliestIncomingTimestamp=" + this.b + ", earliestOutgoingTimestamp=" + this.c + ", suspectedSpamSource=" + this.j + ", latestSpamDetectionBySource=" + this.d + ", messagesFromReporterCount=" + this.e + ", messagesFromReportedCount=" + this.f + ", totalMessagesCount=" + this.g + ", otherParticipantCount=" + this.h + ", rcsGroupId=" + this.i + ")";
    }
}
