package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iiu extends nq {
    private final int a;
    private final int b;
    private final int c;
    private final wfh d;

    public iiu(Context context, wfh wfhVar) {
        this.d = wfhVar;
        this.a = context.getResources().getDimensionPixelSize(R.dimen.badge_in_group_margin);
        this.b = context.getResources().getDimensionPixelSize(R.dimen.badge_between_groups_margin);
        this.c = context.getResources().getDimensionPixelSize(R.dimen.badge_edge_margin);
    }

    private static boolean k(RecyclerView recyclerView, int i, int i2) {
        no noVar = recyclerView.l;
        nw nwVar = recyclerView.m;
        if (noVar != null && nwVar != null && noVar.b() > i2) {
            View U = nwVar.U(i);
            View U2 = nwVar.U(i2);
            if (U == null || U2 == null || ((ijd) recyclerView.j(U)).a().h == ((ijd) recyclerView.j(U2)).a().h) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.nq
    public final void a(Rect rect, View view, RecyclerView recyclerView, ol olVar) {
        int i;
        int i2;
        nw nwVar = recyclerView.m;
        int fW = recyclerView.fW(view);
        if (this.d.A()) {
            if (nwVar != null && fW == nwVar.av() - 1) {
                rect.left = this.c;
            }
            if (fW == 0) {
                rect.right = this.c;
                return;
            }
            if (k(recyclerView, fW, fW - 1)) {
                i2 = this.a;
            } else {
                i2 = this.b;
            }
            rect.right = i2;
            return;
        }
        if (nwVar != null && fW == nwVar.av() - 1) {
            rect.right = this.c;
        }
        if (fW == 0) {
            rect.left = this.c;
            return;
        }
        if (k(recyclerView, fW - 1, fW)) {
            i = this.a;
        } else {
            i = this.b;
        }
        rect.left = i;
    }
}
