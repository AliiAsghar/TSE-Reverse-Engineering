package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agld {
    public final int a;
    public final long b;
    private final String c;
    private final String d;

    public agld() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agld) {
            agld agldVar = (agld) obj;
            if (this.a == agldVar.a && this.b == agldVar.b && this.c.equals(agldVar.c) && this.d.equals(agldVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        int i = (int) (j ^ (j >>> 32));
        return ((((i ^ ((this.a ^ 1000003) * 1000003)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        return "ThreadIdentifier{tid=" + this.a + ", id=" + this.b + ", name=" + this.c + ", threadPoolName=" + this.d + "}";
    }

    public agld(int i, long j, String str, String str2) {
        this.a = i;
        this.b = j;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.c = str;
        this.d = str2;
    }
}
