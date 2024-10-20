package defpackage;

import java.util.List;

/* compiled from: PG */
@armg
/* loaded from: classes.dex */
public abstract class gap extends fzz {
    public gap() {
        super(3);
    }

    @Override // defpackage.fzz
    public final Object a(Object obj) {
        return d(obj);
    }

    @Override // defpackage.fzz
    public final Object c(hkr hkrVar, arpe arpeVar) {
        int ordinal = ((gbb) hkrVar.d).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    Object obj = hkrVar.c;
                    obj.getClass();
                    atal atalVar = new atal(obj, hkrVar.a, (byte[]) null);
                    arvp arvpVar = new arvp(arhi.i(arpeVar), 1);
                    arvpVar.A();
                    g(atalVar, new gao(arvpVar, this));
                    return arvpVar.l();
                }
                throw new armm();
            }
            Object obj2 = hkrVar.c;
            obj2.getClass();
            atal atalVar2 = new atal(obj2, hkrVar.a, (byte[]) null);
            arvp arvpVar2 = new arvp(arhi.i(arpeVar), 1);
            arvpVar2.A();
            h(atalVar2, new gao(arvpVar2, this));
            return arvpVar2.l();
        }
        atal atalVar3 = new atal(hkrVar.c, hkrVar.b, (byte[]) null);
        arvp arvpVar3 = new arvp(arhi.i(arpeVar), 1);
        arvpVar3.A();
        i(atalVar3, new gan(arvpVar3, this));
        return arvpVar3.l();
    }

    public abstract Object d(Object obj);

    public final Object e(List list) {
        Object ad = aqjn.ad(list);
        if (ad != null) {
            return d(ad);
        }
        return null;
    }

    public final Object f(List list) {
        Object Z = aqjn.Z(list);
        if (Z != null) {
            return d(Z);
        }
        return null;
    }

    public abstract void g(atal atalVar, gam gamVar);

    public abstract void h(atal atalVar, gam gamVar);

    public abstract void i(atal atalVar, gan ganVar);
}
