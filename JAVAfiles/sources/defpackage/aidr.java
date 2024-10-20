package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aidr {
    private final int a;
    private final long b;

    public aidr() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aidr) {
            aidr aidrVar = (aidr) obj;
            if (this.a == aidrVar.a && this.b == aidrVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        return ((int) (j ^ (j >>> 32))) ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ProjectId{customerId=" + this.a + ", projectId=" + this.b + "}";
    }

    public aidr(int i, long j) {
        this.a = i;
        this.b = j;
    }
}
