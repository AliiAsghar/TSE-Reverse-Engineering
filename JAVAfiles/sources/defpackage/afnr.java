package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afnr {
    public final afnb a;
    public final aflw b;
    public final Integer c;
    public final boolean d;
    public final afwv e;

    public afnr(afnb afnbVar, aflw aflwVar, Integer num, afwv afwvVar, boolean z) {
        aflwVar.getClass();
        this.a = afnbVar;
        this.b = aflwVar;
        this.c = num;
        this.e = afwvVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afnr)) {
            return false;
        }
        afnr afnrVar = (afnr) obj;
        if (d.F(this.a, afnrVar.a) && d.F(this.b, afnrVar.b) && d.F(this.c, afnrVar.c) && d.F(this.e, afnrVar.e) && this.d == afnrVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() * 31) + this.b.hashCode();
        Integer num = this.c;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return (((((hashCode2 * 31) + hashCode) * 31) + this.e.hashCode()) * 31) + a.v(this.d);
    }

    public final String toString() {
        return "EmojiUsage(emojiSet=" + this.a + ", selectedEmoji=" + this.b + ", listPosition=" + this.c + ", source=" + this.e + ", fromVariantPicker=" + this.d + ")";
    }

    public /* synthetic */ afnr(afnb afnbVar, aflw aflwVar, Integer num, afwv afwvVar, boolean z, int i) {
        this(afnbVar, aflwVar, (i & 4) != 0 ? null : num, afwvVar, ((i & 16) == 0) & z);
    }
}
