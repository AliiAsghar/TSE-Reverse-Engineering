package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jia implements jjj {
    public final long a;
    public final Duration b;
    public final int c;
    public final jjh d;
    public final jjf e;
    public final pcm f;
    public final obm g;
    public final jhz h;
    public final jji i;
    public final mjq j;
    public final mjq k;
    private final boolean l;
    private final arml m;

    public jia(long j, Duration duration, int i, boolean z, jjh jjhVar, jjf jjfVar, pcm pcmVar, obm obmVar, jhz jhzVar) {
        duration.getClass();
        jjhVar.getClass();
        jjfVar.getClass();
        jhzVar.getClass();
        this.a = j;
        this.b = duration;
        this.c = i;
        this.l = z;
        this.d = jjhVar;
        this.e = jjfVar;
        this.f = pcmVar;
        this.g = obmVar;
        this.h = jhzVar;
        this.i = jhzVar.c();
        this.m = armd.a(new ixz(this, 20));
        this.j = jhzVar.d();
        this.k = jhzVar.e();
    }

    public final jmt a() {
        return (jmt) this.m.a();
    }

    public final boolean b() {
        jhz jhzVar = this.h;
        if ((jhzVar instanceof jhv) && ((jhv) jhzVar).a.h) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jia)) {
            return false;
        }
        jia jiaVar = (jia) obj;
        if (this.a == jiaVar.a && d.F(this.b, jiaVar.b) && this.c == jiaVar.c && this.l == jiaVar.l && d.F(this.d, jiaVar.d) && d.F(this.e, jiaVar.e) && d.F(this.f, jiaVar.f) && d.F(this.g, jiaVar.g) && d.F(this.h, jiaVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int A = (a.A(this.a) * 31) + this.b.hashCode();
        jjh jjhVar = this.d;
        return (((((((((((((A * 31) + this.c) * 31) + a.v(this.l)) * 31) + jjhVar.hashCode()) * 31) + this.e.a) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "MapiTransportCapabilityDataImpl(maxMessageSizeBytes=" + this.a + ", maxVideoDuration=" + this.b + ", textLengthLimit=" + this.c + ", hasActiveSelfIdentity=" + this.l + ", sendIcon=" + this.d + ", directSendIcon=" + this.e + ", enableRbmSimPicker=" + this.f + ", enableRbmInConversation2=" + this.g + ", transportCapability=" + this.h + ")";
    }
}
