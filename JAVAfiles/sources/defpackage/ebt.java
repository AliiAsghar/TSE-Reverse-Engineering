package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebt implements ecd {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ebt(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.ecd
    public final /* synthetic */ void accept(Object obj) {
        if (this.b != 0) {
            atal atalVar = (atal) obj;
            if (atalVar == null) {
                atalVar = new atal(-3, (char[]) null);
            }
            ((fvq) this.a).G(atalVar);
            return;
        }
        atal atalVar2 = (atal) obj;
        synchronized (ebu.c) {
            ArrayList arrayList = (ArrayList) ebu.d.get(this.a);
            if (arrayList == null) {
                return;
            }
            ebu.d.remove(this.a);
            for (int i = 0; i < arrayList.size(); i++) {
                ((ecd) arrayList.get(i)).accept(atalVar2);
            }
        }
    }
}
