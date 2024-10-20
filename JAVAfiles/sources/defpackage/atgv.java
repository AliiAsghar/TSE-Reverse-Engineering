package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class atgv extends atgr {
    public static final atfw A;
    public static final atfw B;
    public static final atfw C;
    public static final atfw D;
    public static final atfw E;
    public static final atfw F;
    public static final atgd o;
    public static final atgd p;
    public static final atgd q;
    public static final atgd r;
    public static final atgd s;
    private static final long serialVersionUID = 8283225332206808863L;
    public static final atgd t;
    public static final atgd u;
    public static final atfw v;
    public static final atfw w;
    public static final atfw x;
    public static final atfw y;
    public static final atfw z;
    public final int G;
    private final transient atgu[] H;

    static {
        atgd atgdVar = athx.a;
        o = atgdVar;
        atib atibVar = new atib(atgf.k, 1000L);
        p = atibVar;
        atib atibVar2 = new atib(atgf.j, 60000L);
        q = atibVar2;
        atib atibVar3 = new atib(atgf.i, 3600000L);
        r = atibVar3;
        atib atibVar4 = new atib(atgf.h, 43200000L);
        s = atibVar4;
        atib atibVar5 = new atib(atgf.g, 86400000L);
        t = atibVar5;
        u = new atib(atgf.f, 604800000L);
        v = new athz(atfy.x, atgdVar, atibVar);
        w = new athz(atfy.w, atgdVar, atibVar5);
        x = new athz(atfy.v, atibVar, atibVar2);
        y = new athz(atfy.u, atibVar, atibVar5);
        z = new athz(atfy.t, atibVar2, atibVar3);
        A = new athz(atfy.s, atibVar2, atibVar5);
        athz athzVar = new athz(atfy.r, atibVar3, atibVar5);
        B = athzVar;
        athz athzVar2 = new athz(atfy.o, atibVar3, atibVar4);
        C = athzVar2;
        D = new atig(athzVar, atfy.q);
        E = new atig(athzVar2, atfy.p);
        F = new atgt();
    }

    public atgv(atfu atfuVar, int i) {
        super(atfuVar, null);
        this.H = new atgu[1024];
        this.G = i;
    }

    @Override // defpackage.atgr
    protected void M(atgq atgqVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int N(long j, int i, int i2) {
        return ((int) ((j - (ac(i) + ab(i, i2))) / 86400000)) + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int O(long j) {
        long j2;
        if (j >= 0) {
            j2 = j / 86400000;
        } else {
            j2 = (j - 86399999) / 86400000;
            if (j2 < -3) {
                return ((int) ((j2 + 4) % 7)) + 7;
            }
        }
        return ((int) ((j2 + 3) % 7)) + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int P(long j, int i) {
        return ((int) ((j - ac(i)) / 86400000)) + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int Q(long j) {
        int Y = Y(j);
        return R(Y, T(j, Y));
    }

    public abstract int R(int i, int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int S(long j) {
        if (j >= 0) {
            return (int) (j % 86400000);
        }
        return ((int) ((j + 1) % 86400000)) + 86399999;
    }

    public abstract int T(long j, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int U(long j) {
        return V(j, Y(j));
    }

    final int V(long j, int i) {
        long aa = aa(i);
        if (j < aa) {
            return W(i - 1);
        }
        if (j >= aa(i + 1)) {
            return 1;
        }
        return ((int) ((j - aa) / 604800000)) + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int W(int i) {
        return (int) ((aa(i + 1) - aa(i)) / 604800000);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int X(long j) {
        int Y = Y(j);
        int V = V(j, Y);
        if (V == 1) {
            return Y(j + 604800000);
        }
        if (V > 51) {
            return Y(j - 1209600000);
        }
        return Y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int Y(long j) {
        long j2 = j >> 1;
        long j3 = 31083597720000L + j2;
        if (j3 < 0) {
            j3 = 31067819244001L + j2;
        }
        int i = (int) (j3 / 15778476000L);
        long ac = ac(i);
        long j4 = j - ac;
        if (j4 < 0) {
            return i - 1;
        }
        long j5 = 31536000000L;
        if (j4 >= 31536000000L) {
            if (true == ag(i)) {
                j5 = 31622400000L;
            }
            if (ac + j5 <= j) {
                return i + 1;
            }
            return i;
        }
        return i;
    }

    public abstract long Z(int i);

    final long aa(int i) {
        long ac = ac(i);
        if (O(ac) > 8 - this.G) {
            return ac + ((8 - r8) * 86400000);
        }
        return ac - ((r8 - 1) * 86400000);
    }

    public abstract long ab(int i, int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long ac(int i) {
        atgu[] atguVarArr = this.H;
        int i2 = i & 1023;
        atgu atguVar = atguVarArr[i2];
        if (atguVar == null || atguVar.a != i) {
            atgu atguVar2 = new atgu(i, Z(i));
            atguVarArr[i2] = atguVar2;
            atguVar = atguVar2;
        }
        return atguVar.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long ad(int i, int i2, int i3) {
        return ac(i) + ab(i, i2) + ((i3 - 1) * 86400000);
    }

    public abstract long ae(long j, int i);

    public boolean af(long j) {
        throw null;
    }

    public abstract boolean ag(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            atgv atgvVar = (atgv) obj;
            if (this.G == atgvVar.G && z().equals(atgvVar.z())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (getClass().getName().hashCode() * 11) + z().hashCode() + this.G;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(60);
        String name = getClass().getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            name = name.substring(lastIndexOf + 1);
        }
        sb.append(name);
        sb.append('[');
        atgc z2 = z();
        if (z2 != null) {
            sb.append(z2.c);
        }
        if (this.G != 4) {
            sb.append(",mdfw=");
            sb.append(this.G);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // defpackage.atgr, defpackage.atfu
    public final atgc z() {
        atfu atfuVar = this.a;
        if (atfuVar != null) {
            return atfuVar.z();
        }
        return atgc.a;
    }
}
