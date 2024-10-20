package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afgo {
    public final afgp a;
    public final boolean b;
    public final aeke c;
    private final afvc e;
    private final boolean d = false;
    private final boolean f = true;

    public afgo(aeke aekeVar, afvc afvcVar, afgp afgpVar, boolean z) {
        this.c = aekeVar;
        this.e = afvcVar;
        this.a = afgpVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afgo)) {
            return false;
        }
        afgo afgoVar = (afgo) obj;
        if (!d.F(this.c, afgoVar.c)) {
            return false;
        }
        boolean z = afgoVar.d;
        if (!d.F(this.e, afgoVar.e) || !d.F(this.a, afgoVar.a)) {
            return false;
        }
        boolean z2 = afgoVar.f;
        if (this.b == afgoVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        aeke aekeVar = this.c;
        if (aekeVar == null) {
            hashCode = 0;
        } else {
            hashCode = aekeVar.hashCode();
        }
        return (((((((((hashCode * 31) + a.v(false)) * 31) + this.e.hashCode()) * 31) + this.a.hashCode()) * 31) + a.v(true)) * 31) + a.v(this.b);
    }

    public final String toString() {
        return "CameraConfiguration(miniCameraMode=" + this.c + ", showFab=false, outputFileProvider=" + this.e + ", launcher=" + this.a + ", mirrorFrontFacingCameraHorizontally=true, enableMiniCameraLifecycleObserverFix=" + this.b + ")";
    }
}
