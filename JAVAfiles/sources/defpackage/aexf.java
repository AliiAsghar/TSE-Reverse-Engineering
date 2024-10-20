package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aexf implements aexg {
    public final int a;
    private final aexn b;

    public aexf(aexn aexnVar, int i) {
        this.b = aexnVar;
        this.a = i;
    }

    @Override // defpackage.aexg
    public final aexn a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aexf)) {
            return false;
        }
        aexf aexfVar = (aexf) obj;
        if (d.F(this.b, aexfVar.b) && this.a == aexfVar.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        int i = this.a;
        a.bm(i);
        return hashCode + i;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("VerticalRichCardMedia(media=");
        sb.append(this.b);
        sb.append(", size=");
        int i = this.a;
        if (i != 112) {
            if (i != 168) {
                if (i != 264) {
                    str = "null";
                } else {
                    str = "Tall";
                }
            } else {
                str = "Medium";
            }
        } else {
            str = "Short";
        }
        sb.append((Object) str);
        sb.append(")");
        return sb.toString();
    }
}
