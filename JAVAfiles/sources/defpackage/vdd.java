package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vdd {
    public final String a;
    public final String b;

    public vdd() {
        throw null;
    }

    public static vdd a(String str) {
        return new vdd(str.concat(".Duration"), str.concat(".Status"));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vdd) {
            vdd vddVar = (vdd) obj;
            String str = this.a;
            if (str != null ? str.equals(vddVar.a) : vddVar.a == null) {
                String str2 = this.b;
                String str3 = vddVar.b;
                if (str2 != null ? str2.equals(str3) : str3 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ i;
    }

    public final String toString() {
        return "RpcRuntimeMetric{timeCounterName=" + this.a + ", statusCounterName=" + this.b + "}";
    }

    public vdd(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
