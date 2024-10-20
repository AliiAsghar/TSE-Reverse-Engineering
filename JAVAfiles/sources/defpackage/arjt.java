package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arjt {
    static {
        Logger.getLogger(arjt.class.getName());
    }

    private arjt() {
    }

    public static byte[][] a(List list) {
        int size = list.size();
        byte[][] bArr = new byte[size + size];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            arkj arkjVar = (arkj) it.next();
            bArr[i] = arkjVar.f.k();
            bArr[i + 1] = arkjVar.g.k();
            i += 2;
        }
        return arht.b(bArr);
    }
}
