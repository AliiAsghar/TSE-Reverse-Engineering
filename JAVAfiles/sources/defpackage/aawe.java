package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aawe extends nq {
    @Override // defpackage.nq
    public final void a(Rect rect, View view, RecyclerView recyclerView, ol olVar) {
        aawd aawdVar;
        super.a(rect, view, recyclerView, olVar);
        no noVar = recyclerView.l;
        if (noVar instanceof aawd) {
            aawdVar = (aawd) noVar;
        } else {
            aawdVar = null;
        }
        if (aawdVar == null) {
            return;
        }
        if (recyclerView.fV(view) != 0) {
            throw null;
        }
        throw null;
    }
}
