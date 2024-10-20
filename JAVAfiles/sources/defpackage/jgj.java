package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jgj {
    public final boolean a;
    public final int b;
    private final aflw c;

    public jgj(aflw aflwVar, int i, boolean z) {
        this.c = aflwVar;
        this.b = i;
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jgj)) {
            return false;
        }
        jgj jgjVar = (jgj) obj;
        if (d.F(this.c, jgjVar.c) && this.b == jgjVar.b && this.a == jgjVar.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        int i = this.b;
        a.bm(i);
        return ((hashCode + i) * 31) + a.v(this.a);
    }

    public final String toString() {
        String str;
        CharSequence be = yyb.be(this.c.a());
        StringBuilder sb = new StringBuilder("EmojiUsage(emoji=");
        sb.append((Object) be);
        sb.append(", source=");
        int i = this.b;
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        str = "EXTERNAL";
                    } else {
                        str = "GBOARD";
                    }
                } else {
                    str = "SEARCH";
                }
            } else {
                str = "COLLECTION";
            }
        } else {
            str = "RECENTS";
        }
        sb.append((Object) str);
        sb.append(", fromVariantPicker=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
