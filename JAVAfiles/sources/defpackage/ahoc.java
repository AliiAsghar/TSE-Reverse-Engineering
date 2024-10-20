package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahoc implements ahlx {
    private final int a;

    public ahoc() {
        throw null;
    }

    @Override // defpackage.ahlx
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.ahlx
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ahoc)) {
            return false;
        }
        int i = this.a;
        int i2 = ((ahoc) obj).a;
        if (i != 0) {
            if (i == i2) {
                return true;
            }
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.a;
        a.aS(i);
        return i ^ (-721379959);
    }

    public final String toString() {
        return "CuiConfigurations{metricExtensionProvider=null, enablement=" + ahly.a(this.a) + "}";
    }

    public ahoc(byte[] bArr) {
        this.a = 2;
    }
}
