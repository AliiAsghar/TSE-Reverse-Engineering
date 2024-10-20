package defpackage;

import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asls extends asmk {
    private static final aslz a;
    private final List b;
    private final List c;

    static {
        Pattern pattern = aslz.a;
        a = aotl.an("application/x-www-form-urlencoded");
    }

    public asls(List list, List list2) {
        this.b = asmt.n(list);
        this.c = asmt.n(list2);
    }

    private final long d(asqv asqvVar, boolean z) {
        asqu q;
        if (z) {
            q = new asqu();
        } else {
            asqvVar.getClass();
            q = asqvVar.q();
        }
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                q.M(38);
            }
            q.Z((String) this.b.get(i));
            q.M(61);
            q.Z((String) this.c.get(i));
        }
        if (z) {
            long j = q.b;
            q.z();
            return j;
        }
        return 0L;
    }

    @Override // defpackage.asmk
    public final long a() {
        return d(null, true);
    }

    @Override // defpackage.asmk
    public final aslz b() {
        return a;
    }

    @Override // defpackage.asmk
    public final void c(asqv asqvVar) {
        d(asqvVar, false);
    }
}
