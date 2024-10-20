package defpackage;

import defpackage.dhv;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcb {
    public static final boolean a(dhv dhvVar) {
        int a = dhvVar.a();
        List list = dhvVar.a;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            dhv.c cVar = (dhv.c) list.get(i);
            if ((cVar.a instanceof dhz) && dhw.a(0, a, cVar.b, cVar.c)) {
                return true;
            }
        }
        return false;
    }
}
