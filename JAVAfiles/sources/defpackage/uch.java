package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class uch {
    public final Thread a;
    public final agni b;

    public uch() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uch) {
            uch uchVar = (uch) obj;
            if (this.a.equals(uchVar.a) && this.b.equals(uchVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        agni agniVar = this.b;
        return "WriteLockHolder{thread=" + this.a.toString() + ", loggingTag=" + agniVar.toString() + "}";
    }

    public uch(Thread thread, agni agniVar) {
        this.a = thread;
        if (agniVar == null) {
            throw new NullPointerException("Null loggingTag");
        }
        this.b = agniVar;
    }
}
