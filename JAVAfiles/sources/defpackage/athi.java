package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class athi extends atgy {
    private static final long serialVersionUID = -861407383323710522L;
    private static final ConcurrentHashMap I = new ConcurrentHashMap();
    public static final athi H = ah(atgc.a);

    private athi(atfu atfuVar, int i) {
        super(atfuVar, i);
    }

    public static athi ah(atgc atgcVar) {
        return ai(atgcVar, 4);
    }

    public static athi ai(atgc atgcVar, int i) {
        athi athiVar;
        if (atgcVar == null) {
            atgcVar = atgc.j();
        }
        ConcurrentHashMap concurrentHashMap = I;
        athi[] athiVarArr = (athi[]) concurrentHashMap.get(atgcVar);
        if (athiVarArr == null) {
            athiVarArr = new athi[7];
            athi[] athiVarArr2 = (athi[]) concurrentHashMap.putIfAbsent(atgcVar, athiVarArr);
            if (athiVarArr2 != null) {
                athiVarArr = athiVarArr2;
            }
        }
        int i2 = i - 1;
        try {
            athi athiVar2 = athiVarArr[i2];
            if (athiVar2 == null) {
                synchronized (athiVarArr) {
                    athiVar2 = athiVarArr[i2];
                    if (athiVar2 == null) {
                        atgc atgcVar2 = atgc.a;
                        if (atgcVar == atgcVar2) {
                            athiVar = new athi(null, i);
                        } else {
                            athiVar = new athi(atho.N(ai(atgcVar2, i), atgcVar), i);
                        }
                        athiVarArr[i2] = athiVar;
                        athiVar2 = athiVar;
                    }
                }
            }
            return athiVar2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException(a.bV(i, "Invalid min days in first week: "));
        }
    }

    private Object readResolve() {
        int i = ((atgv) this).G;
        if (i == 0) {
            i = 4;
        }
        atfu atfuVar = this.a;
        if (atfuVar == null) {
            return ai(atgc.a, i);
        }
        return ai(atfuVar.z(), i);
    }

    @Override // defpackage.atgv, defpackage.atgr
    protected final void M(atgq atgqVar) {
        atfy p;
        if (this.a == null) {
            atgqVar.a = atgv.o;
            atgqVar.b = atgv.p;
            atgqVar.c = atgv.q;
            atgqVar.d = atgv.r;
            atgqVar.e = atgv.s;
            atgqVar.f = atgv.t;
            atgqVar.g = atgv.u;
            atgqVar.m = atgv.v;
            atgqVar.n = atgv.w;
            atgqVar.o = atgv.x;
            atgqVar.p = atgv.y;
            atgqVar.q = atgv.z;
            atgqVar.r = atgv.A;
            atgqVar.s = atgv.B;
            atgqVar.u = atgv.C;
            atgqVar.t = atgv.D;
            atgqVar.v = atgv.E;
            atgqVar.w = atgv.F;
            atgqVar.E = new athc(this);
            atgqVar.F = new athh(atgqVar.E, this);
            atfw atfwVar = atgqVar.F;
            if (atfwVar == null) {
                p = null;
            } else {
                p = atfwVar.p();
            }
            atgqVar.H = new athu(new athy(atfwVar, p, 99), atfy.d);
            atgqVar.k = atgqVar.H.q();
            athu athuVar = (athu) atgqVar.H;
            atgqVar.G = new athy(new atic(athuVar, athuVar.g), atfy.e);
            atgqVar.I = new athe(this);
            atgqVar.x = new athd(this, atgqVar.f);
            atgqVar.y = new atgw(this, atgqVar.f);
            atgqVar.z = new atgx(this, atgqVar.f);
            atgqVar.D = new athg(this);
            atgqVar.B = new athb(this);
            atgqVar.A = new atha(this, atgqVar.g);
            atgqVar.C = new athy(new atic(atgqVar.B, atgqVar.k, atfy.j), atfy.j);
            atgqVar.j = atgqVar.E.q();
            atgqVar.i = atgqVar.D.q();
            atgqVar.h = atgqVar.B.q();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (ag(r7) != false) goto L5;
     */
    @Override // defpackage.atgv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long Z(int r7) {
        /*
            r6 = this;
            int r0 = r7 / 100
            if (r7 >= 0) goto L11
            int r1 = r7 + 3
            int r1 = r1 >> 2
            int r1 = r1 - r0
            int r0 = r0 + 3
            int r0 = r0 >> 2
            int r1 = r1 + r0
        Le:
            int r1 = r1 + (-1)
            goto L1e
        L11:
            int r1 = r7 >> 2
            int r1 = r1 - r0
            int r0 = r0 >> 2
            boolean r2 = r6.ag(r7)
            int r1 = r1 + r0
            if (r2 == 0) goto L1e
            goto Le
        L1e:
            long r2 = (long) r7
            r7 = -719527(0xfffffffffff50559, float:NaN)
            int r1 = r1 + r7
            r4 = 365(0x16d, double:1.803E-321)
            long r2 = r2 * r4
            long r0 = (long) r1
            long r2 = r2 + r0
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 * r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.athi.Z(int):long");
    }

    @Override // defpackage.atfu
    public final atfu a() {
        return H;
    }

    @Override // defpackage.atgv
    public final boolean ag(int i) {
        if ((i & 3) != 0) {
            return false;
        }
        if (i % 100 == 0 && i % 400 != 0) {
            return false;
        }
        return true;
    }

    @Override // defpackage.atfu
    public final atfu b(atgc atgcVar) {
        if (atgcVar == z()) {
            return this;
        }
        return ah(atgcVar);
    }
}
