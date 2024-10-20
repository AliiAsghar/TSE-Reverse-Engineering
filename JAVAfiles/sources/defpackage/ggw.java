package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggw implements oa, ghg {
    public boolean a = false;
    public final adfg b;
    private final ghj c;
    private final ggp d;
    private final ghw e;

    public ggw(ghj ghjVar, ghw ghwVar, ggp ggpVar, adfg adfgVar) {
        d.s(true);
        d.s(true);
        d.s(true);
        d.s(true);
        d.s(true);
        this.c = ghjVar;
        this.e = ghwVar;
        this.d = ggpVar;
        this.b = adfgVar;
    }

    private final void c() {
        this.a = false;
        this.d.a();
        adfg adfgVar = this.b;
        synchronized (adfgVar.d) {
            int i = adfgVar.a;
            if (i == 0) {
                return;
            }
            int i2 = i - 1;
            adfgVar.a = i2;
            if (i2 == 0) {
                adfgVar.i();
            }
        }
    }

    @Override // defpackage.ghg
    public final void a() {
        this.a = false;
        this.d.a();
    }

    @Override // defpackage.ghg
    public final boolean b() {
        return this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        if (r10.getY() > r4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0077, code lost:
    
        if (r10.getY() > r4) goto L27;
     */
    @Override // defpackage.oa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(android.support.v7.widget.RecyclerView r9, android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ggw.e(android.support.v7.widget.RecyclerView, android.view.MotionEvent):void");
    }

    @Override // defpackage.oa
    public final boolean k(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.a) {
            e(recyclerView, motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1 && actionMasked != 2) {
            return false;
        }
        return this.a;
    }

    @Override // defpackage.oa
    public final void d(boolean z) {
    }
}
