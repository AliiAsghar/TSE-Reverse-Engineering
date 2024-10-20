package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxk {
    public static final int a(cya cyaVar, csh cshVar) {
        int a;
        cya K = cyaVar.K();
        if (K == null) {
            csg.c(a.cc(cyaVar, "Child of ", " cannot be null when calculating alignment line"));
        }
        if (cyaVar.H().m().containsKey(cshVar)) {
            Integer num = (Integer) cyaVar.H().m().get(cshVar);
            if (num == null) {
                return Integer.MIN_VALUE;
            }
            return num.intValue();
        }
        int ei = K.ei(cshVar);
        if (ei == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        K.j = true;
        cyaVar.k = true;
        cyaVar.O();
        K.j = false;
        cyaVar.k = false;
        if (cshVar instanceof cta) {
            a = dre.b(K.F());
        } else {
            a = dre.a(K.F());
        }
        return ei + a;
    }
}
