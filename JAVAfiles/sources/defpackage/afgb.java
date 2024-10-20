package defpackage;

import android.database.ContentObserver;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afgb extends ContentObserver {
    public final afij a;
    public final agea b;
    private final afgd c;
    private final RecyclerView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afgb(Handler handler, afgd afgdVar, afij afijVar, RecyclerView recyclerView) {
        super(handler);
        recyclerView.getClass();
        this.c = afgdVar;
        this.a = afijVar;
        this.d = recyclerView;
        this.b = afzv.q(recyclerView);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        this.c.e();
        if ((this.d.m instanceof SpannedGridLayoutManager) && !this.b.g()) {
            RecyclerView recyclerView = this.d;
            nw nwVar = recyclerView.m;
            if (nwVar instanceof SpannedGridLayoutManager) {
                recyclerView.aL(new afga(this, nwVar));
                return;
            }
            throw new IllegalStateException("Check failed.");
        }
        this.a.G();
    }
}
