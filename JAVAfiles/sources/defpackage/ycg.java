package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ycg {
    public static final ycg a;
    public static final String[] b;
    public final long c;
    private final String d;

    static {
        ycf ycfVar = new ycf();
        ycfVar.b(0L);
        a = ycfVar.a();
        b = new String[]{"_id", "displayName"};
    }

    public ycg() {
        throw null;
    }

    public static alog a() {
        return alog.u(0L, 1L, 1000000000L, 1000000001L);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ycg) {
            ycg ycgVar = (ycg) obj;
            if (this.c == ycgVar.c) {
                String str = this.d;
                String str2 = ycgVar.d;
                if (str != null ? str.equals(str2) : str2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j = this.c;
        return hashCode ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ContactsDirectory{id=" + this.c + ", displayName=" + this.d + "}";
    }

    public ycg(long j, String str) {
        this.c = j;
        this.d = str;
    }
}
