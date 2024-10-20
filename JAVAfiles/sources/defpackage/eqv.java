package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eqv {
    public final long a;
    public final long b;
    public final long c = Long.MIN_VALUE;
    public final boolean d = false;
    public final boolean e = false;
    public final boolean f = false;

    static {
        new eqv(new vtk((byte[]) null));
        eul.M(0);
        eul.M(1);
        eul.M(2);
        eul.M(3);
        eul.M(4);
        eul.M(5);
        eul.M(6);
    }

    public eqv(vtk vtkVar) {
        this.a = eul.z(vtkVar.a);
        this.b = vtkVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqv)) {
            return false;
        }
        eqv eqvVar = (eqv) obj;
        if (this.b != eqvVar.b) {
            return false;
        }
        long j = eqvVar.c;
        boolean z = eqvVar.d;
        boolean z2 = eqvVar.e;
        boolean z3 = eqvVar.f;
        return true;
    }

    public final int hashCode() {
        long j = this.b;
        return ((((int) (j ^ (j >>> 32))) * 31) + ((int) (-9223372034707292160L))) * 29791;
    }
}
