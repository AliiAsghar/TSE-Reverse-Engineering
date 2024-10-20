package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xtt implements xtl {
    private final armf a;
    private final /* synthetic */ int b;

    public xtt(armf armfVar, int i, byte[] bArr) {
        this.b = i;
        armfVar.getClass();
        this.a = armfVar;
    }

    @Override // defpackage.xtl
    public final Object a(Set set, arpe arpeVar) {
        if (this.b != 0) {
            vsz vszVar = (vsz) this.a.b();
            apli apliVar = apli.RCS_TRANSPORT_TYPE_DUAL_REGISTRATION;
            ArrayList arrayList = new ArrayList(aqjn.J(set, 10));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(new Integer(((xtq) it.next()).b));
            }
            Object F = arro.F(vszVar.c(apliVar, arrayList), arpeVar);
            if (F == arpl.a) {
                return F;
            }
            return arnb.a;
        }
        vsz vszVar2 = (vsz) this.a.b();
        apli apliVar2 = apli.RCS_TRANSPORT_TYPE_SINGLE_REGISTRATION;
        ArrayList arrayList2 = new ArrayList(aqjn.J(set, 10));
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new Integer(((xtq) it2.next()).b));
        }
        Object F2 = arro.F(vszVar2.c(apliVar2, arrayList2), arpeVar);
        if (F2 == arpl.a) {
            return F2;
        }
        return arnb.a;
    }

    @Override // defpackage.xtl
    public final Object b(xtq xtqVar, arpe arpeVar) {
        if (this.b != 0) {
            Object F = arro.F(((vsz) this.a.b()).b(apli.RCS_TRANSPORT_TYPE_DUAL_REGISTRATION, xtqVar.b), arpeVar);
            if (F == arpl.a) {
                return F;
            }
            return arnb.a;
        }
        Object F2 = arro.F(((vsz) this.a.b()).b(apli.RCS_TRANSPORT_TYPE_SINGLE_REGISTRATION, xtqVar.b), arpeVar);
        if (F2 == arpl.a) {
            return F2;
        }
        return arnb.a;
    }

    @Override // defpackage.xtl
    public final boolean c(xtq xtqVar) {
        if (this.b != 0) {
            xtqVar.getClass();
            return true;
        }
        xtqVar.getClass();
        return xtqVar.a.c().B;
    }

    public xtt(armf armfVar, int i) {
        this.b = i;
        armfVar.getClass();
        this.a = armfVar;
    }
}
