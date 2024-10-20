package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kbv {
    public final miz a;
    public final mym b;
    public final boolean c;
    public final kap d;
    public final boolean e;
    public final tqc f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final int j;

    public kbv(miz mizVar, mym mymVar, boolean z, kap kapVar, boolean z2, tqc tqcVar, int i, String str, boolean z3, boolean z4) {
        this.a = mizVar;
        this.b = mymVar;
        this.c = z;
        this.d = kapVar;
        this.e = z2;
        this.f = tqcVar;
        this.j = i;
        this.g = str;
        this.h = z3;
        this.i = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbv)) {
            return false;
        }
        kbv kbvVar = (kbv) obj;
        if (d.F(this.a, kbvVar.a) && d.F(this.b, kbvVar.b) && this.c == kbvVar.c && d.F(this.d, kbvVar.d) && this.e == kbvVar.e && this.f == kbvVar.f && this.j == kbvVar.j && d.F(this.g, kbvVar.g) && this.h == kbvVar.h && this.i == kbvVar.i) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() * 31) + this.b.hashCode();
        kap kapVar = this.d;
        if (kapVar == null) {
            hashCode = 0;
        } else {
            hashCode = kapVar.hashCode();
        }
        int v = ((((((((hashCode2 * 31) + a.v(this.c)) * 31) + hashCode) * 31) + a.v(this.e)) * 31) + this.f.hashCode()) * 31;
        int i = this.j;
        a.bm(i);
        return ((((((v + i) * 31) + this.g.hashCode()) * 31) + a.v(this.h)) * 31) + a.v(this.i);
    }

    public final String toString() {
        return "MessageBubbleContentArgs(message=" + this.a + ", content=" + this.b + ", isHighlighted=" + this.c + ", searchData=" + this.d + ", isGroupConversation=" + this.e + ", archiveStatus=" + this.f + ", horizontalAlignment=" + ((Object) adcx.ct(this.j)) + ", contentDescription=" + this.g + ", hasBottomSheetAction=" + this.h + ", isSpatulaSettingsEnabled=" + this.i + ")";
    }

    public /* synthetic */ kbv(miz mizVar, mym mymVar, boolean z, kap kapVar, boolean z2, tqc tqcVar, int i, String str) {
        this(mizVar, mymVar, z, kapVar, z2, tqcVar, i, str, false, false);
    }
}
