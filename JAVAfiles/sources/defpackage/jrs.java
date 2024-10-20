package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jrs implements jrt {
    public final int a;
    private final Throwable b;

    public jrs(int i, Throwable th) {
        this.a = i;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jrs)) {
            return false;
        }
        jrs jrsVar = (jrs) obj;
        if (this.a == jrsVar.a && d.F(this.b, jrsVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = this.a;
        a.bm(i);
        Throwable th = this.b;
        if (th == null) {
            hashCode = 0;
        } else {
            hashCode = th.hashCode();
        }
        return (i * 31) + hashCode;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PreparationFailure(reason=");
        switch (this.a) {
            case 1:
                str = "COMPOSE_DISABLED";
                break;
            case 2:
                str = "SELF_IDENTITY_UNAVAILABLE";
                break;
            case 3:
                str = "TRANSPORT_UNAVAILABLE";
                break;
            case 4:
                str = "CONTENT_UNSUPPORTED";
                break;
            case 5:
                str = "CONTENT_SIZE_EXCEEDED";
                break;
            case 6:
                str = "CONTAINS_PENDING_ATTACHMENT";
                break;
            default:
                str = "DOWNLOAD_FAILED";
                break;
        }
        sb.append((Object) str);
        sb.append(", cause=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ jrs(int i) {
        this(i, null);
    }
}
