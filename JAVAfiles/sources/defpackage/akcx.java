package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akcx {
    public final Class a;
    public final gsf b;
    public final algw c;
    public final akcv d;
    public final algw e;
    public final gsi f;
    public final algw g;
    public final algw h;
    public final alpt i;
    public final algw j;
    public final algw k;
    public final algw l;

    public akcx() {
        throw null;
    }

    public static akct a(Class cls) {
        akct akctVar = new akct((byte[]) null);
        akctVar.a = cls;
        akctVar.b(gsf.a);
        akctVar.d = new akcv(0L, TimeUnit.SECONDS);
        akctVar.d(altg.a);
        akctVar.f = new hgi((char[]) null).j();
        return akctVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akcx) {
            akcx akcxVar = (akcx) obj;
            if (this.a.equals(akcxVar.a) && this.b.equals(akcxVar.b) && this.c.equals(akcxVar.c) && this.d.equals(akcxVar.d) && this.e.equals(akcxVar.e) && this.f.equals(akcxVar.f) && this.g.equals(akcxVar.g) && this.h.equals(akcxVar.h) && this.i.equals(akcxVar.i) && this.j.equals(akcxVar.j) && this.k.equals(akcxVar.k) && this.l.equals(akcxVar.l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode();
    }

    public final String toString() {
        algw algwVar = this.l;
        algw algwVar2 = this.k;
        algw algwVar3 = this.j;
        alpt alptVar = this.i;
        algw algwVar4 = this.h;
        algw algwVar5 = this.g;
        gsi gsiVar = this.f;
        algw algwVar6 = this.e;
        akcv akcvVar = this.d;
        algw algwVar7 = this.c;
        gsf gsfVar = this.b;
        return "TikTokWorkSpec{workerClass=" + String.valueOf(this.a) + ", constraints=" + String.valueOf(gsfVar) + ", expedited=" + String.valueOf(algwVar7) + ", initialDelay=" + String.valueOf(akcvVar) + ", nextScheduleTimeOverride=" + String.valueOf(algwVar6) + ", inputData=" + String.valueOf(gsiVar) + ", periodic=" + String.valueOf(algwVar5) + ", unique=" + String.valueOf(algwVar4) + ", tags=" + String.valueOf(alptVar) + ", backoffPolicy=" + String.valueOf(algwVar3) + ", backoffDelayDuration=" + String.valueOf(algwVar2) + ", targetProcess=" + String.valueOf(algwVar) + "}";
    }

    public akcx(Class cls, gsf gsfVar, algw algwVar, akcv akcvVar, algw algwVar2, gsi gsiVar, algw algwVar3, algw algwVar4, alpt alptVar, algw algwVar5, algw algwVar6, algw algwVar7) {
        this.a = cls;
        this.b = gsfVar;
        this.c = algwVar;
        this.d = akcvVar;
        this.e = algwVar2;
        this.f = gsiVar;
        this.g = algwVar3;
        this.h = algwVar4;
        this.i = alptVar;
        this.j = algwVar5;
        this.k = algwVar6;
        this.l = algwVar7;
    }
}
