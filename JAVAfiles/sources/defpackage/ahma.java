package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahma implements ahlx {
    public final ahmb a;
    private final int b;

    public ahma() {
        throw null;
    }

    public static final akia c() {
        akia akiaVar = new akia();
        akiaVar.g(new ahmb() { // from class: ahlz
            @Override // defpackage.ahmb
            public final ashu d() {
                return null;
            }
        });
        akiaVar.b = 1;
        akiaVar.a = (byte) 1;
        return akiaVar;
    }

    @Override // defpackage.ahlx
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.ahlx
    public final boolean b() {
        if (this.b == 3) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ahma)) {
            return false;
        }
        ahma ahmaVar = (ahma) obj;
        int i = this.b;
        int i2 = ahmaVar.b;
        if (i != 0) {
            if (i == i2 && this.a.equals(ahmaVar.a)) {
                return true;
            }
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.b;
        a.aS(i);
        return ((((i ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "BatteryConfigurations{enablement=" + ahly.a(this.b) + ", chargeCounterEnabled=false, metricExtensionProvider=" + String.valueOf(this.a) + "}";
    }

    public ahma(int i, ahmb ahmbVar) {
        this.b = i;
        this.a = ahmbVar;
    }
}
