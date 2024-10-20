package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asot extends asmv {
    final /* synthetic */ asou d;
    final /* synthetic */ aspp e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asot(String str, asou asouVar, aspp asppVar) {
        super(str);
        this.d = asouVar;
        this.e = asppVar;
    }

    @Override // defpackage.asmv
    public final long a() {
        long c;
        int i;
        aspj[] aspjVarArr;
        arsb arsbVar = new arsb();
        aspp asppVar = this.e;
        aspc aspcVar = this.d.a;
        synchronized (aspcVar.u) {
            synchronized (aspcVar) {
                aspp asppVar2 = aspcVar.r;
                aspp asppVar3 = new aspp();
                asppVar3.e(asppVar2);
                asppVar3.e(asppVar);
                arsbVar.a = asppVar3;
                c = ((aspp) arsbVar.a).c() - asppVar2.c();
                aspjVarArr = null;
                if (c != 0) {
                    if (!aspcVar.c.isEmpty()) {
                        aspjVarArr = (aspj[]) aspcVar.c.values().toArray(new aspj[0]);
                    }
                } else {
                    c = 0;
                }
                aspp asppVar4 = (aspp) arsbVar.a;
                asppVar4.getClass();
                aspcVar.r = asppVar4;
                aspcVar.k.f(new asoq(hht.h(aspcVar.d, " onSettings"), aspcVar, arsbVar));
            }
            try {
                aspcVar.u.a((aspp) arsbVar.a);
            } catch (IOException e) {
                aspcVar.c(e);
            }
        }
        if (aspjVarArr != null) {
            for (aspj aspjVar : aspjVarArr) {
                synchronized (aspjVar) {
                    aspjVar.c(c);
                }
            }
            return -1L;
        }
        return -1L;
    }
}
