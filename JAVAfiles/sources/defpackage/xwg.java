package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xwg {
    private static final xze a = xze.g("Bugle", "MemoryReclaimerImpl");
    private final armf b;
    private final armf c;

    public xwg(armf armfVar, armf armfVar2) {
        this.b = armfVar;
        this.c = armfVar2;
    }

    public final void a(int i, int i2) {
        a.p("Reclaiming memory");
        Iterator it = ((Set) this.b.b()).iterator();
        while (it.hasNext()) {
            ((xzh) it.next()).l(i);
        }
        int releaseMemory = SQLiteDatabase.releaseMemory();
        a.p("MemoryReclaimerImpl.reclaimMemory:SQLiteDatabase.releaseMemory freed " + releaseMemory + " bytes");
        if (i2 != 1) {
            if (i2 == 2) {
                ((mbl) this.c.b()).e("Bugle.App.OnTrimMemory.Count", i);
                return;
            }
            return;
        }
        System.gc();
    }
}
