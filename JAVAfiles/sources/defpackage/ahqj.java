package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahqj implements ahlx {
    public final algw a;
    private final int b;

    public ahqj() {
        throw null;
    }

    public static final akia c() {
        akia akiaVar = new akia(null, null);
        akiaVar.a = (byte) 1;
        akiaVar.c = alfd.a;
        akiaVar.b = 1;
        return akiaVar;
    }

    @Override // defpackage.ahlx
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.ahlx
    public final boolean b() {
        int i = this.b;
        if (i == 3 || i == 1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ahqj)) {
            return false;
        }
        ahqj ahqjVar = (ahqj) obj;
        int i = this.b;
        int i2 = ahqjVar.b;
        if (i != 0) {
            if (i == i2 && this.a.equals(ahqjVar.a)) {
                return true;
            }
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.b;
        a.aS(i);
        return ((((i ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "StorageConfigurations{enablement=" + ahly.a(this.b) + ", manualCapture=false, dirStatsConfigurations=" + String.valueOf(this.a) + "}";
    }

    public ahqj(int i, algw algwVar) {
        this.b = i;
        this.a = algwVar;
    }
}
