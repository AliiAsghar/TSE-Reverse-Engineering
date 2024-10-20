package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asny {
    public final asmf a;
    public final int b;
    public final String c;

    public asny(asmf asmfVar, int i, String str) {
        asmfVar.getClass();
        str.getClass();
        this.a = asmfVar;
        this.b = i;
        this.c = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.a == asmf.a) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.b);
        sb.append(' ');
        sb.append(this.c);
        return sb.toString();
    }
}
