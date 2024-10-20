package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aetj implements aesg {
    public final String a;
    public final String b;
    public final arqg c;
    public final arqr d;
    public final int e;

    public aetj(String str, String str2, arqg arqgVar, arqr arqrVar, int i) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = arqgVar;
        this.d = arqrVar;
        this.e = i;
    }

    public static /* synthetic */ aetj a(aetj aetjVar, String str) {
        String str2 = aetjVar.a;
        arqg arqgVar = aetjVar.c;
        arqr arqrVar = aetjVar.d;
        int i = aetjVar.e;
        str.getClass();
        return new aetj(str2, str, arqgVar, arqrVar, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aetj)) {
            return false;
        }
        aetj aetjVar = (aetj) obj;
        if (d.F(this.a, aetjVar.a) && d.F(this.b, aetjVar.b) && d.F(this.c, aetjVar.c) && d.F(this.d, aetjVar.d) && this.e == aetjVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        int i = this.e;
        a.bm(i);
        return (hashCode * 31) + i;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TextFieldListItemUiData(hint=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", onTextCleared=");
        sb.append(this.c);
        sb.append(", onTextChange=");
        sb.append(this.d);
        sb.append(", keyboardType=");
        if (this.e != 1) {
            str = "TEXT";
        } else {
            str = "PHONE";
        }
        sb.append((Object) str);
        sb.append(")");
        return sb.toString();
    }
}
