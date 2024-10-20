package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aona implements alya {
    private static final alww a;
    private final armf b;

    static {
        int i = alog.d;
        a = new aomw("", alsx.a);
    }

    public aona(armf armfVar) {
        this.b = armfVar;
    }

    @Override // defpackage.alya
    public final alww a(String str) {
        Set set = (Set) this.b.b();
        int size = set.size();
        if (size != 0) {
            if (size != 1) {
                alob d = alog.d(size);
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    d.h(((alya) it.next()).a(str));
                }
                return new aomw(str, d.g());
            }
            return ((alya) set.iterator().next()).a(str);
        }
        return a;
    }
}
