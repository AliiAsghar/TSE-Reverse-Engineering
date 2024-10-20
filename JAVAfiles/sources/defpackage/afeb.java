package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afeb implements afdz {
    private final arml a;
    private final arml b;

    public afeb(alpt alptVar, alpt alptVar2) {
        alptVar.getClass();
        this.a = armd.a(new aetz(alptVar, 14));
        this.b = armd.a(new aetz(alptVar2, 13));
    }

    public static final String[] b(Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = ((afds) it.next()).k;
            if (str != null) {
                arrayList.add(str);
            }
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        strArr.getClass();
        return strArr;
    }

    @Override // defpackage.afdz
    public final String[] a(afdy afdyVar) {
        afdyVar.getClass();
        int ordinal = afdyVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return ((afdx) this.b.a()).a;
            }
            throw new armm();
        }
        return ((afdx) this.a.a()).a;
    }
}
