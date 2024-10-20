package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.ii;
import defpackage.ij;
import defpackage.im;
import defpackage.ix;
import defpackage.ktk;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements AdapterView.OnItemClickListener, ii, ix {
    private static final int[] a = {R.attr.background, R.attr.divider};
    private ij b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // defpackage.ix
    public final void a(ij ijVar) {
        this.b = ijVar;
    }

    @Override // defpackage.ii
    public final boolean b(im imVar) {
        throw null;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.b.z((im) getAdapter().getItem(i), 0);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        ktk A = ktk.A(context, attributeSet, a, i, 0);
        if (A.v(0)) {
            setBackgroundDrawable(A.p(0));
        }
        if (A.v(1)) {
            setDivider(A.p(1));
        }
        A.t();
    }
}
