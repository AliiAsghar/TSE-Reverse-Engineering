package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asmy {
    public static final asmy a = new asmy(new asuo(new asms(String.valueOf(asmt.f).concat(" TaskRunner"), true)));
    public static final Logger b;
    public boolean c;
    public long d;
    public final asuo h;
    private int i = 10000;
    public final List e = new ArrayList();
    public final List f = new ArrayList();
    public final Runnable g = new arer(this, 16);

    static {
        Logger logger = Logger.getLogger(asmy.class.getName());
        logger.getClass();
        b = logger;
    }

    public asmy(asuo asuoVar) {
        this.h = asuoVar;
    }

    public final asmx a() {
        int i;
        synchronized (this) {
            i = this.i;
            this.i = i + 1;
        }
        return new asmx(this, a.bV(i, "Q"));
    }

    public final void b(asmv asmvVar, long j) {
        byte[] bArr = asmt.a;
        asmx asmxVar = asmvVar.b;
        asmxVar.getClass();
        if (asmxVar.d == asmvVar) {
            boolean z = asmxVar.f;
            asmxVar.f = false;
            asmxVar.d = null;
            this.e.remove(asmxVar);
            if (j != -1 && !z && !asmxVar.c) {
                asmxVar.d(asmvVar, j, true);
            }
            if (!asmxVar.e.isEmpty()) {
                this.f.add(asmxVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final void c(asmx asmxVar) {
        byte[] bArr = asmt.a;
        if (asmxVar.d == null) {
            if (!asmxVar.e.isEmpty()) {
                List list = this.f;
                if (!list.contains(asmxVar)) {
                    list.add(asmxVar);
                }
            } else {
                this.f.remove(asmxVar);
            }
        }
        if (this.c) {
            notify();
        } else {
            this.h.g(this.g);
        }
    }
}
