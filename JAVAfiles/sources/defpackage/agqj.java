package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agqj {
    public static final agqn a = new agqn();
    public final agqn b;
    public final agqo c;
    private final agqi d;

    public agqj(String str, agqn agqnVar) {
        agqo agqoVar = new agqo(str);
        agqi agqiVar = new agqi();
        this.c = agqoVar;
        this.b = agqnVar;
        this.d = agqiVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof agqj) {
            agqj agqjVar = (agqj) obj;
            if (this.c.equals(agqjVar.c) && this.b.equals(agqjVar.b) && this.d.equals(agqjVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return hyv.e(this.c, hyv.e(this.b, this.d.hashCode()));
    }

    public final String toString() {
        agqi agqiVar = this.d;
        agqn agqnVar = this.b;
        return "FifeModel{fifeUrl='" + this.c.toString() + "', fifeUrlOptions='" + String.valueOf(agqnVar) + "', accountInfo='" + agqiVar.toString() + "'}";
    }
}
