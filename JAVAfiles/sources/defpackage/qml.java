package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qml {
    public final long a;
    public final String b;

    public qml(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qml)) {
            return false;
        }
        qml qmlVar = (qml) obj;
        if (this.a == qmlVar.a && d.F(this.b, qmlVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (a.A(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Cp2ThirdPartyService(rowId=" + this.a + ", mimeType=" + this.b + ")";
    }
}
