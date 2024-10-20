package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aexy implements aexz {
    public final String a;
    public final String b;
    public final aeye c;

    public aexy(String str, String str2, aeye aeyeVar) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = aeyeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aexy)) {
            return false;
        }
        aexy aexyVar = (aexy) obj;
        if (d.F(this.a, aexyVar.a) && d.F(this.b, aexyVar.b) && d.F(this.c, aexyVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() * 31) + this.b.hashCode();
        aeye aeyeVar = this.c;
        if (aeyeVar == null) {
            hashCode = 0;
        } else {
            hashCode = aeyeVar.hashCode();
        }
        return (hashCode2 * 31) + hashCode;
    }

    public final String toString() {
        return "Full(title=" + this.a + ", description=" + this.b + ", thumbnail=" + this.c + ")";
    }

    public /* synthetic */ aexy(String str, String str2) {
        this(str, str2, null);
    }
}
