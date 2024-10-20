package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agny {
    public final String a;
    public final boolean b;
    public final agni c;
    public final String d;

    public agny() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agny) {
            agny agnyVar = (agny) obj;
            if (this.a.equals(agnyVar.a) && this.b == agnyVar.b && this.c.equals(agnyVar.c)) {
                String str = this.d;
                String str2 = agnyVar.d;
                if (str != null ? str.equals(str2) : str2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode;
        int hashCode2 = this.a.hashCode() ^ 1000003;
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        int hashCode3 = (((hashCode2 * 1000003) ^ i) * 1000003) ^ this.c.hashCode();
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (hashCode3 * 1000003) ^ hashCode;
    }

    public final String toString() {
        return "DeleteParameters{tableName=" + this.a + ", exemptFromQueryPlanChecking=" + this.b + ", loggingTag=" + String.valueOf(this.c) + ", databaseName=" + this.d + "}";
    }

    public agny(String str, boolean z, agni agniVar, String str2) {
        this.a = str;
        this.b = z;
        this.c = agniVar;
        this.d = str2;
    }
}
