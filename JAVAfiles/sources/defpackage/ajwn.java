package defpackage;

import android.content.Context;
import android.graphics.PointF;
import com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajwn extends mz {
    final /* synthetic */ SpannedGridLayoutManager f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajwn(SpannedGridLayoutManager spannedGridLayoutManager, Context context) {
        super(context);
        this.f = spannedGridLayoutManager;
    }

    @Override // defpackage.ok
    public final PointF m(int i) {
        return new PointF(brg.a, this.f.a.d(i) - this.f.e);
    }
}
