package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class is implements AdapterView.OnItemClickListener, iz, iv {
    public Rect g;

    /* JADX INFO: Access modifiers changed from: protected */
    public static ig v(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (ig) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (ig) listAdapter;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean w(ij ijVar) {
        int size = ijVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = ijVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int x(ListAdapter listAdapter, Context context, int i) {
        int i2;
        int i3 = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i4 = 0;
        int i5 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        while (i3 < count) {
            int itemViewType = listAdapter.getItemViewType(i3);
            if (itemViewType != i5) {
                i2 = itemViewType;
            } else {
                i2 = i5;
            }
            if (itemViewType != i5) {
                view = null;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i3, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i4) {
                i4 = measuredWidth;
            }
            i3++;
            i5 = i2;
        }
        return i4;
    }

    @Override // defpackage.iv
    public final boolean g(im imVar) {
        return false;
    }

    @Override // defpackage.iv
    public final boolean h(im imVar) {
        return false;
    }

    public abstract void j(ij ijVar);

    public abstract void l(View view);

    public abstract void m(boolean z);

    public abstract void n(int i);

    public abstract void o(int i);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int i2;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        ij ijVar = v(listAdapter).a;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        if (true != t()) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        ijVar.A(menuItem, this, i2);
    }

    public abstract void p(PopupWindow.OnDismissListener onDismissListener);

    public abstract void q(boolean z);

    public abstract void r(int i);

    protected boolean t() {
        return true;
    }

    @Override // defpackage.iv
    public final void b(Context context, ij ijVar) {
    }
}
