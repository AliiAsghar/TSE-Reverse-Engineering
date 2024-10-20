package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class czw extends czu {
    public static czw b;
    private static final dqh d = dqh.b;
    private static final dqh e = dqh.a;
    public diy c;

    private final int e(int i, dqh dqhVar) {
        int f;
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
        f = diyVar2.f(i, false);
        return f - 1;
    }

    @Override // defpackage.czz
    public final int[] c(int i) {
        int i2;
        if (a().length() > 0 && i < a().length()) {
            if (i < 0) {
                diy diyVar = this.c;
                if (diyVar == null) {
                    arro.b("layoutResult");
                    diyVar = null;
                }
                i2 = diyVar.g(0);
            } else {
                diy diyVar2 = this.c;
                if (diyVar2 == null) {
                    arro.b("layoutResult");
                    diyVar2 = null;
                }
                int g = diyVar2.g(i);
                if (e(g, d) == i) {
                    i2 = g;
                } else {
                    i2 = g + 1;
                }
            }
            diy diyVar3 = this.c;
            if (diyVar3 == null) {
                arro.b("layoutResult");
                diyVar3 = null;
            }
            if (i2 < diyVar3.e()) {
                return b(e(i2, d), e(i2, e) + 1);
            }
        }
        return null;
    }

    @Override // defpackage.czz
    public final int[] d(int i) {
        int i2;
        if (a().length() > 0 && i > 0) {
            if (i > a().length()) {
                diy diyVar = this.c;
                if (diyVar == null) {
                    arro.b("layoutResult");
                    diyVar = null;
                }
                i2 = diyVar.g(a().length());
            } else {
                diy diyVar2 = this.c;
                if (diyVar2 == null) {
                    arro.b("layoutResult");
                    diyVar2 = null;
                }
                int g = diyVar2.g(i);
                if (e(g, e) + 1 == i) {
                    i2 = g;
                } else {
                    i2 = g - 1;
                }
            }
            if (i2 >= 0) {
                return b(e(i2, d), e(i2, e) + 1);
            }
        }
        return null;
    }
}
