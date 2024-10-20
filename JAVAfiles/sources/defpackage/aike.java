package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aike extends aikb {
    public static final aikb f;
    private final String g;
    private final String h;
    private final String i;
    private final ailh j;
    private final aiki k;
    private final advp l;
    private final alog m;
    private final ahji n;

    static {
        aika aikaVar = new aika();
        ailh ailhVar = ailh.TCP;
        if (ailhVar != null) {
            advp advpVar = new advp("test");
            int i = alog.d;
            alog n = alog.n(alsx.a);
            ahji ahjiVar = new ahji();
            if (n != null) {
                f = new aikf("user", "domain", "stub", ailhVar, aikaVar, advpVar, n, ahjiVar);
                return;
            }
            throw new IllegalStateException("Missing required properties:".concat(" messageFilters"));
        }
        throw new NullPointerException("Null transportProtocol");
    }

    public aike() {
        throw null;
    }

    public static aikd x() {
        aikd aikdVar = new aikd();
        int i = alog.d;
        aikdVar.b(alsx.a);
        aikdVar.b = new ahji();
        return aikdVar;
    }

    @Override // defpackage.aikb
    public final advp c() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aike) {
            aike aikeVar = (aike) obj;
            if (this.g.equals(aikeVar.g) && this.h.equals(aikeVar.h) && this.i.equals(aikeVar.i) && this.j.equals(aikeVar.j) && this.k.equals(aikeVar.k) && this.l.equals(aikeVar.l) && alzz.at(this.m, aikeVar.m) && this.n.equals(aikeVar.n)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aikb
    public final aiki f() {
        return this.k;
    }

    @Override // defpackage.aikb
    public final ailh g() {
        return this.j;
    }

    public final int hashCode() {
        return ((((((((((((((this.g.hashCode() ^ 1000003) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode();
    }

    @Override // defpackage.aikb
    public final alog i() {
        return this.m;
    }

    @Override // defpackage.aikb
    public final String j() {
        return this.h;
    }

    @Override // defpackage.aikb
    public final String n() {
        return this.i;
    }

    @Override // defpackage.aikb
    public final String o() {
        return this.g;
    }

    public final String toString() {
        ahji ahjiVar = this.n;
        alog alogVar = this.m;
        advp advpVar = this.l;
        aiki aikiVar = this.k;
        return "SipStackImpl{user=" + this.g + ", domain=" + this.h + ", sipInstance=" + this.i + ", transportProtocol=" + String.valueOf(this.j) + ", sipTransactionLayer=" + String.valueOf(aikiVar) + ", logTag=" + String.valueOf(advpVar) + ", messageFilters=" + String.valueOf(alogVar) + ", addressFactory=" + String.valueOf(ahjiVar) + "}";
    }

    public aike(String str, String str2, String str3, ailh ailhVar, aiki aikiVar, advp advpVar, alog alogVar, ahji ahjiVar) {
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = ailhVar;
        this.k = aikiVar;
        this.l = advpVar;
        this.m = alogVar;
        this.n = ahjiVar;
    }

    @Override // defpackage.aikb
    public final void w() {
    }
}
