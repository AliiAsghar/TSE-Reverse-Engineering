package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afrx extends afry<aftm, afrx> {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;

    public afrx() {
        this(null);
    }

    @Override // defpackage.afry
    public final /* bridge */ /* synthetic */ boolean a(afru afruVar) {
        d.F((aftm) afruVar, afti.a);
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afrx)) {
            return false;
        }
        afrx afrxVar = (afrx) obj;
        boolean z = afrxVar.a;
        boolean z2 = afrxVar.b;
        boolean z3 = afrxVar.c;
        boolean z4 = afrxVar.d;
        return true;
    }

    public final int hashCode() {
        return (((((a.v(true) * 31) + a.v(true)) * 31) + a.v(true)) * 31) + a.v(false);
    }

    public final String toString() {
        return "Video(supportsVP8=true, supportsVP9=true, supportsHEVC=true, supportsAV1=false)";
    }

    public /* synthetic */ afrx(byte[] bArr) {
        this.a = true;
        this.b = true;
        this.c = true;
        this.d = false;
    }
}
