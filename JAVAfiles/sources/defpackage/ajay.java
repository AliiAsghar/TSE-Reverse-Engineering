package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajay implements ViewTreeObserver.OnScrollChangedListener {
    final /* synthetic */ cg a;
    private final /* synthetic */ int b;

    public ajay(cg cgVar, int i) {
        this.b = i;
        this.a = cgVar;
    }

    private static final void b(View view, float f) {
        if (view != null) {
            view.setElevation(f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (r1 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00db, code lost:
    
        if (r1 != false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(int r8) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajay.a(int):void");
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        if (this.b != 0) {
            a(((agse) this.a).ak.getHeight());
            return;
        }
        ahnz ahnzVar = aizp.c;
        if (aizp.b(aqql.c(aizp.b)) && !((ajaz) this.a).aO()) {
            return;
        }
        a(((ajaz) this.a).aj.getHeight());
    }
}
