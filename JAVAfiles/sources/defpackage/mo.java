package defpackage;

import android.os.Trace;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mo implements Runnable {
    public static final ThreadLocal a = new ThreadLocal();
    static final Comparator b = new mm(0);
    long d;
    public long e;
    public final ArrayList c = new ArrayList();
    private final ArrayList f = new ArrayList();

    private static final oo b(RecyclerView recyclerView, int i, long j) {
        int b2 = recyclerView.g.b();
        for (int i2 = 0; i2 < b2; i2++) {
            oo k = RecyclerView.k(recyclerView.g.e(i2));
            if (k.c == i && !k.t()) {
                return null;
            }
        }
        od odVar = recyclerView.e;
        if (j == Long.MAX_VALUE) {
            try {
                if (ebl.a()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } finally {
                recyclerView.V(false);
                Trace.endSection();
            }
        }
        recyclerView.T();
        oo q = odVar.q(i, j);
        if (q != null) {
            if (q.s() && !q.t()) {
                odVar.l(q.a);
            } else {
                odVar.d(q, false);
            }
        }
        return q;
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.p && this.d == 0) {
            this.d = RecyclerView.aC();
            recyclerView.post(this);
        }
        mn mnVar = recyclerView.L;
        mnVar.a = i;
        mnVar.b = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d2, code lost:
    
        continue;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mo.run():void");
    }
}
