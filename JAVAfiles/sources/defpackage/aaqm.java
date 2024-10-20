package defpackage;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.CategoryToggleView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aaqm extends aaqd implements aaqp {
    public final int a;
    public RecyclerView b;
    private final yti c;
    private LinearLayoutManager d;

    /* JADX INFO: Access modifiers changed from: protected */
    public aaqm(yti ytiVar, int i, int i2) {
        super(i);
        this.c = ytiVar;
        this.a = i2;
    }

    @Override // defpackage.aaqd
    public void e(View view) {
        super.e(view);
        this.b = (RecyclerView) view.findViewById(R.id.c2o_category_recycler_view);
        if (this.a == 1) {
            view.getContext();
            this.d = new LinearLayoutManager(0);
        } else {
            view.getContext();
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this.a, 0);
            gridLayoutManager.g = k();
            this.d = gridLayoutManager;
        }
        this.b.aj(this.d);
        s().d = this;
        this.b.ag(r());
        this.b.aL(x());
        int j = j();
        xyl.k(true);
        this.b.setContentDescription(view.getResources().getString(j));
    }

    protected abstract int j();

    protected mr k() {
        return new mp();
    }

    @Override // defpackage.aaqd
    public int m() {
        return R.layout.compose2o_category_recycler_view_m2;
    }

    protected abstract aapy r();

    protected abstract aapz s();

    @Override // defpackage.aaqp
    public final List t() {
        if (r() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = r().c.iterator();
        while (it.hasNext()) {
            arrayList.add(((oo) it.next()).a);
        }
        return arrayList;
    }

    @Override // defpackage.aaqp
    public final void u(int i, int i2) {
        LinearLayoutManager linearLayoutManager = this.d;
        if (linearLayoutManager != null) {
            linearLayoutManager.ad(i, i2);
            CategoryToggleView categoryToggleView = this.i;
            if (categoryToggleView != null) {
                categoryToggleView.getHandler().postDelayed(new aaqk(this, 0), 200L);
            }
        }
    }

    public final void v() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null && this.i != null) {
            if (this.c.c(recyclerView, false)) {
                this.i.c();
            } else {
                this.i.d();
            }
        }
    }

    public final boolean w() {
        if (this.b.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    protected nq x() {
        return new aaql(this);
    }
}
