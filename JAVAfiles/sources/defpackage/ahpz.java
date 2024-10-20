package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahpz implements ahlx {
    public final algw a;
    public final algw b;
    private final int c;

    public ahpz() {
        throw null;
    }

    @Override // defpackage.ahlx
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.ahlx
    public final boolean b() {
        if (this.c == 1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ahpz)) {
            return false;
        }
        ahpz ahpzVar = (ahpz) obj;
        int i = this.c;
        int i2 = ahpzVar.c;
        if (i != 0) {
            if (i2 == 1 && this.a.equals(ahpzVar.a) && this.b.equals(ahpzVar.b)) {
                return true;
            }
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        a.aS(this.c);
        return 395873938;
    }

    public final String toString() {
        algw algwVar = this.b;
        return "StartupConfigurations{enablement=" + ahly.a(this.c) + ", metricExtensionProvider=" + String.valueOf(this.a) + ", customTimestampProvider=" + String.valueOf(algwVar) + "}";
    }

    public ahpz(algw algwVar, algw algwVar2) {
        this.c = 1;
        this.a = algwVar;
        this.b = algwVar2;
    }
}
