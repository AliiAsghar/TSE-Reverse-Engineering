package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arwa {
    public static final arpi a(arpi arpiVar, arpi arpiVar2) {
        if (!e(arpiVar2)) {
            return arpiVar.plus(arpiVar2);
        }
        return d(arpiVar, arpiVar2, false);
    }

    public static final arpi b(arwe arweVar, arpi arpiVar) {
        arpi arpiVar2;
        arpi d = d(arweVar.b(), arpiVar, true);
        if (arwh.a) {
            arpiVar2 = d.plus(new arwc(arwh.c.incrementAndGet()));
        } else {
            arpiVar2 = d;
        }
        if (d != arws.a && d.get(arpf.k) == null) {
            return arpiVar2.plus(arws.a);
        }
        return arpiVar2;
    }

    public static final aryq c(arpe arpeVar, arpi arpiVar, Object obj) {
        aryq aryqVar = null;
        if (!(arpeVar instanceof arpt)) {
            return null;
        }
        if (arpiVar.get(aryr.a) != null) {
            arpt arptVar = (arpt) arpeVar;
            while (true) {
                if ((arptVar instanceof arwp) || (arptVar = arptVar.dJ()) == null) {
                    break;
                }
                if (arptVar instanceof aryq) {
                    aryqVar = (aryq) arptVar;
                    break;
                }
            }
            if (aryqVar != null) {
                aryqVar.e(arpiVar, obj);
            }
        }
        return aryqVar;
    }

    private static final arpi d(arpi arpiVar, arpi arpiVar2, boolean z) {
        boolean e = e(arpiVar);
        boolean e2 = e(arpiVar2);
        if (!e && !e2) {
            return arpiVar.plus(arpiVar2);
        }
        arsb arsbVar = new arsb();
        arsbVar.a = arpiVar2;
        arpi arpiVar3 = (arpi) arpiVar.fold(arpj.a, new aerv(arsbVar, z, 3));
        if (e2) {
            arsbVar.a = ((arpi) arsbVar.a).fold(arpj.a, afup.q);
        }
        return arpiVar3.plus((arpi) arsbVar.a);
    }

    private static final boolean e(arpi arpiVar) {
        return ((Boolean) arpiVar.fold(false, afup.r)).booleanValue();
    }
}
