package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zaj {
    public final boolean a;
    public final arqg b;

    public zaj() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zaj)) {
            return false;
        }
        zaj zajVar = (zaj) obj;
        if (this.a == zajVar.a && d.F(this.b, zajVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (a.v(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ChatbotDirectoryUiData(shouldDisplay=" + this.a + ", onMessageToBusinessButtonClicked=" + this.b + ")";
    }

    public zaj(boolean z, arqg arqgVar) {
        this.a = z;
        this.b = arqgVar;
    }

    public /* synthetic */ zaj(byte[] bArr) {
        this(false, yyo.e);
    }
}
