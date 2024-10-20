package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class czx extends czu {
    public static czx b;
    private static final dqh e = dqh.b;
    private static final dqh f = dqh.a;
    public diy c;
    public dhe d;

    public czx() {
        new Rect();
    }

    private final int e(int i, dqh dqhVar) {
        int f2;
        diy diyVar = this.c;
        diy diyVar2 = null;
        if (diyVar == null) {
            arro.b("layoutResult");
            diyVar = null;
        }
        int i2 = diyVar.i(i);
        diy diyVar3 = this.c;
        if (diyVar3 == null) {
            arro.b("layoutResult");
            diyVar3 = null;
        }
        if (dqhVar != diyVar3.q(i2)) {
            diy diyVar4 = this.c;
            if (diyVar4 == null) {
                arro.b("layoutResult");
            } else {
                diyVar2 = diyVar4;
            }
            return diyVar2.i(i);
        }
        diy diyVar5 = this.c;
        if (diyVar5 == null) {
            arro.b("layoutResult");
        } else {
            diyVar2 = diyVar5;
        }
        f2 = diyVar2.f(i, false);
        return f2 - 1;
    }

    @Override // defpackage.czz
    public final int[] c(int i) {
        int e2;
        diy diyVar = null;
        if (a().length() > 0 && i < a().length()) {
            try {
                dhe dheVar = this.d;
                if (dheVar == null) {
                    arro.b("node");
                    dheVar = null;
                }
                cjp b2 = dheVar.b();
                int round = Math.round(b2.e - b2.c);
                int r = arrn.r(0, i);
                diy diyVar2 = this.c;
                if (diyVar2 == null) {
                    arro.b("layoutResult");
                    diyVar2 = null;
                }
                int g = diyVar2.g(r);
                diy diyVar3 = this.c;
                if (diyVar3 == null) {
                    arro.b("layoutResult");
                    diyVar3 = null;
                }
                float d = diyVar3.d(g) + round;
                diy diyVar4 = this.c;
                if (diyVar4 == null) {
                    arro.b("layoutResult");
                    diyVar4 = null;
                }
                diy diyVar5 = this.c;
                if (diyVar5 == null) {
                    arro.b("layoutResult");
                    diyVar5 = null;
                }
                if (d < diyVar4.d(diyVar5.e() - 1)) {
                    diy diyVar6 = this.c;
                    if (diyVar6 == null) {
                        arro.b("layoutResult");
                    } else {
                        diyVar = diyVar6;
                    }
                    e2 = diyVar.h(d);
                } else {
                    diy diyVar7 = this.c;
                    if (diyVar7 == null) {
                        arro.b("layoutResult");
                    } else {
                        diyVar = diyVar7;
                    }
                    e2 = diyVar.e();
                }
                return b(r, e(e2 - 1, f) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.czz
    public final int[] d(int i) {
        int i2;
        diy diyVar = null;
        if (a().length() > 0 && i > 0) {
            try {
                dhe dheVar = this.d;
                if (dheVar == null) {
                    arro.b("node");
                    dheVar = null;
                }
                cjp b2 = dheVar.b();
                int round = Math.round(b2.e - b2.c);
                int s = arrn.s(a().length(), i);
                diy diyVar2 = this.c;
                if (diyVar2 == null) {
                    arro.b("layoutResult");
                    diyVar2 = null;
                }
                int g = diyVar2.g(s);
                diy diyVar3 = this.c;
                if (diyVar3 == null) {
                    arro.b("layoutResult");
                    diyVar3 = null;
                }
                float d = diyVar3.d(g) - round;
                if (d > brg.a) {
                    diy diyVar4 = this.c;
                    if (diyVar4 == null) {
                        arro.b("layoutResult");
                    } else {
                        diyVar = diyVar4;
                    }
                    i2 = diyVar.h(d);
                } else {
                    i2 = 0;
                }
                if (s == a().length() && i2 < g) {
                    i2++;
                }
                return b(e(i2, e), s);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }
}
