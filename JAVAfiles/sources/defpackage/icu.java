package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class icu {
    public final int a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;

    public icu(long j, long j2, long j3, long j4, int i) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icu)) {
            return false;
        }
        icu icuVar = (icu) obj;
        if (this.b == icuVar.b && this.c == icuVar.c && this.d == icuVar.d && this.e == icuVar.e && this.a == icuVar.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        if (i == 0) {
            i = 0;
        } else {
            a.bm(i);
        }
        long j = this.e;
        long j2 = this.d;
        return (((((((a.A(this.b) * 31) + a.A(this.c)) * 31) + a.A(j2)) * 31) + a.A(j)) * 31) + i;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("MessagesVersionCheckResult(targetMessagesVersion=");
        sb.append(this.b);
        sb.append(", sourceMessagesVersion=");
        sb.append(this.c);
        sb.append(", minTargetMessagesVersion=");
        sb.append(this.d);
        sb.append(", minSourceMessagesVersion=");
        sb.append(this.e);
        sb.append(", failureReason=");
        int i = this.a;
        if (i != 0) {
            str = akec.P(i);
        } else {
            str = "null";
        }
        sb.append((Object) str);
        sb.append(")");
        return sb.toString();
    }
}
