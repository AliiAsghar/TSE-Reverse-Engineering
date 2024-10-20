package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agmx {
    public final String a;
    public final String b;
    private final String c;

    public agmx() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agmx) {
            agmx agmxVar = (agmx) obj;
            if (this.a.equals(agmxVar.a) && this.b.equals(agmxVar.b) && this.c.equals(agmxVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "ConditionalIndexData{databaseHandle=" + this.a + ", conditionName=" + this.b + ", indexCreationSql=" + this.c + "}";
    }

    public agmx(String str) {
        this.a = "$primary";
        this.b = "work_queue_index_tag";
        this.c = str;
    }
}
