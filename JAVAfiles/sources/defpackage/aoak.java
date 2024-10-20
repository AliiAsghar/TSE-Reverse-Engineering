package defpackage;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoak implements antz {
    public static final aoak a = new aoak();
    public static final antv b = new antv(antf.class, annk.class, (antu) new anux(14));

    @Override // defpackage.antz
    public final Class a() {
        return annk.class;
    }

    @Override // defpackage.antz
    public final Class b() {
        return annk.class;
    }

    @Override // defpackage.antz
    public final /* bridge */ /* synthetic */ Object c(atii atiiVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = atiiVar.f().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                arrayList.add((annk) ((anty) it2.next()).a);
            }
        }
        Object obj = atiiVar.d;
        if (obj != null) {
            return new aoaj(arrayList, (annk) ((anty) obj).a);
        }
        throw new GeneralSecurityException("No primary set");
    }
}
