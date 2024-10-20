package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahnv implements ahlx {
    public final String a;
    private final int b;

    public ahnv() {
        throw null;
    }

    @Override // defpackage.ahlx
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.ahlx
    public final boolean b() {
        if (this.b == 1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ahnv)) {
            return false;
        }
        ahnv ahnvVar = (ahnv) obj;
        int i = this.b;
        int i2 = ahnvVar.b;
        if (i != 0) {
            if (i2 == 1 && this.a.equals(ahnvVar.a)) {
                return true;
            }
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        a.aS(this.b);
        return (this.a.hashCode() ^ (-722379962)) * 1000003;
    }

    public final String toString() {
        return "ApplicationExitConfigurations{enablement=" + ahly.a(this.b) + ", reportingProcessShortName=" + this.a + ", metricExtensionProvider=null}";
    }

    public ahnv(byte[] bArr) {
        this.b = 1;
        this.a = "";
    }
}
