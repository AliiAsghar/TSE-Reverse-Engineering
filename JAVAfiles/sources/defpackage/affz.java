package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class affz extends hd {
    private final RecyclerView a;

    public affz(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // defpackage.hd
    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        nw nwVar;
        ((aftr) obj).getClass();
        ((aftr) obj2).getClass();
        RecyclerView recyclerView = this.a;
        if (recyclerView != null) {
            nwVar = recyclerView.m;
        } else {
            nwVar = null;
        }
        if (!(nwVar instanceof SpannedGridLayoutManager)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.hd
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        aftr aftrVar = (aftr) obj;
        aftr aftrVar2 = (aftr) obj2;
        aftrVar.getClass();
        aftrVar2.getClass();
        return d.F(aftrVar.i(), aftrVar2.i());
    }
}
