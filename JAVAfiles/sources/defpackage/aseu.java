package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aseu {
    public static final asfn a = new asfn("UNDEFINED");
    public static final asfn b = new asfn("REUSABLE_CLAIMED");

    public static final void a(arpe arpeVar, Object obj) {
        aryq aryqVar;
        if (arpeVar instanceof aset) {
            aset asetVar = (aset) arpeVar;
            Object o = arro.o(obj);
            if (asetVar.a.ey(asetVar.u())) {
                asetVar.c = o;
                asetVar.e = 1;
                asetVar.a.a(asetVar.u(), asetVar);
                return;
            }
            boolean z = arwh.a;
            ThreadLocal threadLocal = aryl.a;
            arwx a2 = aryl.a();
            if (a2.p()) {
                asetVar.c = o;
                asetVar.e = 1;
                a2.n(asetVar);
                return;
            }
            a2.o(true);
            try {
                arxm arxmVar = (arxm) asetVar.u().get(arxm.c);
                if (arxmVar != null && !arxmVar.x()) {
                    asetVar.w(aqil.O(arxmVar.r()));
                } else {
                    arpe arpeVar2 = asetVar.b;
                    Object obj2 = asetVar.d;
                    arpi u = arpeVar2.u();
                    Object b2 = asfq.b(u, obj2);
                    if (b2 != asfq.a) {
                        aryqVar = arwa.c(arpeVar2, u, b2);
                    } else {
                        aryqVar = null;
                    }
                    try {
                        asetVar.b.w(obj);
                    } finally {
                        if (aryqVar == null || aryqVar.f()) {
                            asfq.c(u, b2);
                        }
                    }
                }
                do {
                } while (a2.r());
                return;
            } catch (Throwable th) {
                try {
                    asetVar.J(th);
                    return;
                } finally {
                    a2.m(true);
                }
            }
        }
        arpeVar.w(obj);
    }
}
