package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pzn {
    public final String a;
    public final pyz b;
    public final String c;

    public /* synthetic */ pzn(String str, pyz pyzVar, String str2, int i) {
        this.a = 1 == (i & 1) ? null : str;
        this.b = (i & 2) != 0 ? null : pyzVar;
        this.c = (i & 4) != 0 ? "" : str2;
    }

    public static final pzn a(String str, String str2) {
        str.getClass();
        str2.getClass();
        return new pzn(str, null, str2, 2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pzn)) {
            return false;
        }
        pzn pznVar = (pzn) obj;
        if (d.F(this.a, pznVar.a) && d.F(this.b, pznVar.b) && d.F(this.c, pznVar.c)) {
            return true;
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
        pyz pyzVar = this.b;
        if (pyzVar != null) {
            i = pyzVar.hashCode();
        }
        return (((hashCode * 31) + i) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "UploadIdentifiers(uploadId=" + this.a + ", processingId=" + this.b + ", transactionId=" + this.c + ")";
    }
}
