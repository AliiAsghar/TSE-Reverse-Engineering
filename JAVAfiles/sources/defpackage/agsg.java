package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agsg extends de {
    private final List a;
    private int b;

    public agsg(da daVar, List list, int i) {
        super(daVar);
        this.b = 0;
        if (list != null) {
            this.a = list;
            this.b = i;
            return;
        }
        throw new NullPointerException("Questions were missing!");
    }

    public static int m(cg cgVar) {
        return cgVar.m.getInt("QuestionIndex", -1);
    }

    @Override // defpackage.de
    public final cg b(int i) {
        cg agryVar;
        aocl aoclVar = (aocl) this.a.get(i);
        int i2 = aoclVar.d;
        int T = a.T(i2);
        if (T == 0) {
            T = 1;
        }
        int i3 = T - 2;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        int T2 = a.T(i2);
                        if (T2 == 0) {
                            T2 = 1;
                        }
                        throw new AssertionError(String.format("Attempted to build fragment for unsupported Question type %s.  Note this should never happen as it's invalid to create a Question type that does not have a matching fragment.", Integer.toString(a.am(T2))));
                    }
                    int i4 = this.b;
                    agryVar = new agsc();
                    agryVar.ak(agsc.a(aoclVar, i4, i));
                } else {
                    int i5 = this.b;
                    agryVar = new agsa();
                    agryVar.ak(agsa.a(aoclVar, i5, i));
                }
            } else {
                int i6 = this.b;
                agryVar = new agrz();
                agryVar.ak(agrz.a(aoclVar, i6, i));
            }
        } else {
            int i7 = this.b;
            agryVar = new agry();
            agryVar.ak(agry.a(aoclVar, i7, i));
        }
        agryVar.m.putInt("QuestionIndex", i);
        return agryVar;
    }

    @Override // defpackage.gnd
    public final int j() {
        return this.a.size();
    }
}
