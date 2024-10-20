package defpackage;

import com.google.android.rcs.client.messaging.data.RcsDestinationId;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajts extends algf {
    public ajts() {
        super(null);
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        RcsDestinationId rcsDestinationId = (RcsDestinationId) obj;
        if (rcsDestinationId.b() - 1 != 0) {
            aozy createBuilder = wcz.a.createBuilder();
            aozy createBuilder2 = wed.a.createBuilder();
            String a = rcsDestinationId.a();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            wed wedVar = (wed) createBuilder2.b;
            wedVar.b = 1 | wedVar.b;
            wedVar.c = a;
            wed wedVar2 = (wed) createBuilder2.s();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wcz wczVar = (wcz) createBuilder.b;
            wedVar2.getClass();
            wczVar.c = wedVar2;
            wczVar.b = 2;
            return (wcz) createBuilder.s();
        }
        aozy createBuilder3 = wcz.a.createBuilder();
        aozy createBuilder4 = wcx.a.createBuilder();
        String a2 = rcsDestinationId.a();
        if (!createBuilder4.b.isMutable()) {
            createBuilder4.u();
        }
        wcx wcxVar = (wcx) createBuilder4.b;
        wcxVar.b |= 1;
        wcxVar.c = a2;
        wcx wcxVar2 = (wcx) createBuilder4.s();
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        wcz wczVar2 = (wcz) createBuilder3.b;
        wcxVar2.getClass();
        wczVar2.c = wcxVar2;
        wczVar2.b = 1;
        return (wcz) createBuilder3.s();
    }

    @Override // defpackage.algf
    protected final /* synthetic */ Object b(Object obj) {
        wcx wcxVar;
        wed wedVar;
        wcz wczVar = (wcz) obj;
        int k = wch.k(wczVar.b);
        if (k != 0) {
            int i = k - 1;
            if (i != 0) {
                if (i == 1) {
                    atkv atkvVar = new atkv((byte[]) null);
                    atkvVar.k(2);
                    if (wczVar.b == 2) {
                        wedVar = (wed) wczVar.c;
                    } else {
                        wedVar = wed.a;
                    }
                    atkvVar.j(wedVar.c);
                    return atkvVar.i();
                }
                throw new IllegalArgumentException("No valid destination case value set in from.");
            }
            atkv atkvVar2 = new atkv((byte[]) null);
            atkvVar2.k(1);
            if (wczVar.b == 1) {
                wcxVar = (wcx) wczVar.c;
            } else {
                wcxVar = wcx.a;
            }
            atkvVar2.j(wcxVar.c);
            return atkvVar2.i();
        }
        throw null;
    }
}
