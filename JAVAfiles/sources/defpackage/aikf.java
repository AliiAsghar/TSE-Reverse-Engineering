package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aikf extends aikb {
    private final String f;
    private final int g;
    private final String h;
    private final int i;
    private final String j;
    private final String k;
    private final String l;
    private final ailh m;
    private final aiki n;
    private final advp o;
    private final alog p;
    private final ahji q;

    public aikf(String str, String str2, String str3, ailh ailhVar, aiki aikiVar, advp advpVar, alog alogVar, ahji ahjiVar) {
        this.f = "127.0.0.1";
        this.g = 5600;
        this.h = "127.0.0.1";
        this.i = 5600;
        this.j = "user";
        this.k = "domain";
        this.l = "stub";
        this.m = ailhVar;
        this.n = aikiVar;
        this.o = advpVar;
        this.p = alogVar;
        this.q = ahjiVar;
    }

    @Override // defpackage.aikb
    public final int a() {
        return this.g;
    }

    @Override // defpackage.aikb
    public final int b() {
        return this.i;
    }

    @Override // defpackage.aikb
    public final advp c() {
        return this.o;
    }

    @Override // defpackage.aikb
    public final aikh d(aiom aiomVar, aikm aikmVar) {
        throw new aild("Can't send message - Stub SIP Stack");
    }

    @Override // defpackage.aikb
    public final aikh e(aiom aiomVar) {
        throw new aild("Can't send message - Stub SIP Stack");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aikf) {
            aikf aikfVar = (aikf) obj;
            if (this.j.equals(aikfVar.j) && this.k.equals(aikfVar.k) && this.l.equals(aikfVar.l) && this.m.equals(aikfVar.m) && this.n.equals(aikfVar.n) && this.o.equals(aikfVar.o) && alzz.at(this.p, aikfVar.p) && this.q.equals(aikfVar.q)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aikb
    public final aiki f() {
        return this.n;
    }

    @Override // defpackage.aikb
    public final ailh g() {
        return this.m;
    }

    public final int hashCode() {
        return ((((((((((((((this.j.hashCode() ^ 1000003) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode()) * 1000003) ^ this.q.hashCode();
    }

    @Override // defpackage.aikb
    public final alog i() {
        return this.p;
    }

    @Override // defpackage.aikb
    public final String j() {
        return this.k;
    }

    @Override // defpackage.aikb
    public final String k() {
        return this.f;
    }

    @Override // defpackage.aikb
    public final String l() {
        return this.h;
    }

    @Override // defpackage.aikb
    public final String m() {
        return "UDP";
    }

    @Override // defpackage.aikb
    public final String n() {
        return this.l;
    }

    @Override // defpackage.aikb
    public final String o() {
        return this.j;
    }

    @Override // defpackage.aikb
    public final void r(aiom aiomVar) {
        throw new aild("Can't send message - Stub SIP Stack");
    }

    public final String toString() {
        ahji ahjiVar = this.q;
        alog alogVar = this.p;
        advp advpVar = this.o;
        aiki aikiVar = this.n;
        return "SipStackStub{user=" + this.j + ", domain=" + this.k + ", sipInstance=" + this.l + ", transportProtocol=" + String.valueOf(this.m) + ", sipTransactionLayer=" + String.valueOf(aikiVar) + ", logTag=" + String.valueOf(advpVar) + ", messageFilters=" + String.valueOf(alogVar) + ", addressFactory=" + String.valueOf(ahjiVar) + "}";
    }

    @Override // defpackage.aikb
    public final boolean u() {
        return true;
    }

    public aikf() {
        this.f = "127.0.0.1";
        this.g = 5600;
        this.h = "127.0.0.1";
        this.i = 5600;
    }

    @Override // defpackage.aikb
    public final void w() {
    }
}
