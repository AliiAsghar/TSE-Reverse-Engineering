package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rpo {
    public final String a;
    public final agpj b;

    public rpo(String str) {
        this.a = str;
        this.b = new agpk("$V", new Object[]{str});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof rpo) && d.F(this.a, ((rpo) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TableNameExpression(tableName=" + this.a + ")";
    }
}
