package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzs {
    private static final String a = gsy.b("EnqueueRunnable");

    public static void a(gup gupVar) {
        int i;
        if (!gup.e(gupVar, new HashSet())) {
            gvd gvdVar = gupVar.a;
            WorkDatabase workDatabase = gvdVar.e;
            workDatabase.l();
            try {
                gsb gsbVar = gvdVar.d;
                workDatabase.getClass();
                gsbVar.getClass();
                int i2 = 0;
                List D = aqjn.D(gupVar);
                int i3 = 0;
                while (!D.isEmpty()) {
                    gup gupVar2 = (gup) aqjn.N(D);
                    List list = gupVar2.d;
                    list.getClass();
                    if (list.isEmpty()) {
                        i = 0;
                    } else {
                        Iterator it = list.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            if (((gys) ((kkc) it.next()).b).l.b() && (i = i + 1) < 0) {
                                aqjn.F();
                            }
                        }
                    }
                    i3 += i;
                    List list2 = gupVar2.g;
                    if (list2 != null) {
                        D.addAll(list2);
                    }
                }
                if (i3 != 0) {
                    gyt A = workDatabase.A();
                    gid gidVar = ((gzn) A).a;
                    gih a2 = gih.a("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)", 0);
                    gidVar.k();
                    Cursor bC = gvf.bC(((gzn) A).a, a2, false);
                    try {
                        if (bC.moveToFirst()) {
                            i2 = bC.getInt(0);
                        }
                        bC.close();
                        a2.j();
                        if (i2 + i3 > 8) {
                            throw new IllegalArgumentException("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: 8;\nalready enqueued count: " + i2 + ";\ncurrent enqueue operation count: " + i3 + ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.");
                        }
                    } catch (Throwable th) {
                        bC.close();
                        a2.j();
                        throw th;
                    }
                }
                boolean b = b(gupVar);
                workDatabase.o();
                if (b) {
                    gvd gvdVar2 = gupVar.a;
                    guh.a(gvdVar2.d, gvdVar2.e, gvdVar2.f);
                    return;
                }
                return;
            } finally {
                workDatabase.m();
            }
        }
        throw new IllegalStateException(a.cc(gupVar, "WorkContinuation has cycles (", ")"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e9  */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.Set, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean b(defpackage.gup r23) {
        /*
            Method dump skipped, instructions count: 761
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gzs.b(gup):boolean");
    }
}
