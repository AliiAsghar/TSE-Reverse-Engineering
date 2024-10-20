package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaaa {
    public final aaaj a;
    public final zyz b;
    public final aaag c;
    public final zym d;
    public final zyc e;
    public final zyf f;
    public final zyi g;
    public final asai h;
    public final zzp i;
    public final aaaf j;

    public aaaa(aaaj aaajVar, zyz zyzVar, aaag aaagVar, zym zymVar, zyc zycVar, zyf zyfVar, zyi zyiVar, asai asaiVar, zzp zzpVar, aaaf aaafVar) {
        aaajVar.getClass();
        zyzVar.getClass();
        zycVar.getClass();
        zyiVar.getClass();
        this.a = aaajVar;
        this.b = zyzVar;
        this.c = aaagVar;
        this.d = zymVar;
        this.e = zycVar;
        this.f = zyfVar;
        this.g = zyiVar;
        this.h = asaiVar;
        this.i = zzpVar;
        this.j = aaafVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aaaa)) {
            return false;
        }
        aaaa aaaaVar = (aaaa) obj;
        if (d.F(this.a, aaaaVar.a) && d.F(this.b, aaaaVar.b) && d.F(this.c, aaaaVar.c) && d.F(this.d, aaaaVar.d) && d.F(this.e, aaaaVar.e) && d.F(this.f, aaaaVar.f) && d.F(this.g, aaaaVar.g) && d.F(this.h, aaaaVar.h) && d.F(this.i, aaaaVar.i) && d.F(this.j, aaaaVar.j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.a.hashCode() * 31) + this.b.hashCode();
        if (this.c == null) {
            int i = hashCode3 * 961;
            zym zymVar = this.d;
            int i2 = 0;
            if (zymVar == null) {
                hashCode = 0;
            } else {
                hashCode = zymVar.hashCode();
            }
            int hashCode4 = (((i + hashCode) * 31) + this.e.hashCode()) * 31;
            zyf zyfVar = this.f;
            if (zyfVar == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = zyfVar.hashCode();
            }
            int hashCode5 = (((((hashCode4 + hashCode2) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31;
            zzp zzpVar = this.i;
            if (zzpVar != null) {
                i2 = zzpVar.hashCode();
            }
            return ((hashCode5 + i2) * 31) + this.j.hashCode();
        }
        throw null;
    }

    public final String toString() {
        return "ConversationDetailsUiData(topbar=" + this.a + ", header=" + this.b + ", search=" + this.c + ", encryption=" + this.d + ", actions=" + this.e + ", activeSimUiData=" + this.f + ", descriptionItems=" + this.g + ", groupMembers=" + this.h + ", photoSelector=" + this.i + ", flags=" + this.j + ")";
    }
}
