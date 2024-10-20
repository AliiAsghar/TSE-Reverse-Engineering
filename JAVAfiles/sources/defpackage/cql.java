package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cql {
    public final uj a;
    public final cre b;
    public boolean c;

    public cql(uj ujVar, cre creVar) {
        this.a = ujVar;
        this.b = creVar;
    }

    public final boolean a(long j) {
        Object obj;
        List list = this.b.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i < size) {
                obj = list.get(i);
                if (a.bB(((crf) obj).a, j)) {
                    break;
                }
                i++;
            } else {
                obj = null;
                break;
            }
        }
        crf crfVar = (crf) obj;
        if (crfVar == null) {
            return false;
        }
        return crfVar.h;
    }
}
