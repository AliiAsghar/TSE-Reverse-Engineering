package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeno {
    public final afzk a;
    public final CharSequence b;
    public final String c;
    public final Integer d;
    public final boolean e;
    public final aeor f;
    public final aenn g;

    public aeno(afzk afzkVar, CharSequence charSequence, String str, Integer num, boolean z, aeor aeorVar, aenn aennVar) {
        afzkVar.getClass();
        charSequence.getClass();
        str.getClass();
        this.a = afzkVar;
        this.b = charSequence;
        this.c = str;
        this.d = num;
        this.e = z;
        this.f = aeorVar;
        this.g = aennVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeno)) {
            return false;
        }
        aeno aenoVar = (aeno) obj;
        if (d.F(this.a, aenoVar.a) && d.F(this.b, aenoVar.b) && d.F(this.c, aenoVar.c) && d.F(this.d, aenoVar.d) && this.e == aenoVar.e && d.F(this.f, aenoVar.f) && d.F(this.g, aenoVar.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        Integer num = this.d;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int v = ((((hashCode2 * 31) + hashCode) * 31) + a.v(this.e)) * 31;
        aeor aeorVar = this.f;
        if (aeorVar != null) {
            i = aeorVar.hashCode();
        }
        return ((v + i) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "ComposeRowDraftTextUiData(hugoUiData=" + this.a + ", text=" + ((Object) this.b) + ", hint=" + this.c + ", maxLength=" + this.d + ", forcePlainText=" + this.e + ", counter=" + this.f + ", flags=" + this.g + ")";
    }

    public /* synthetic */ aeno(afzk afzkVar, CharSequence charSequence, String str, Integer num, boolean z, aenn aennVar, int i) {
        this(afzkVar, charSequence, str, (i & 8) != 0 ? null : num, ((i & 16) == 0) & z, (aeor) null, aennVar);
    }
}
