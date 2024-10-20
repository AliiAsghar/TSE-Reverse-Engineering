package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nf extends mh {
    final int c;
    final int d;
    public ne e;
    private MenuItem f;

    public nf(Context context, boolean z) {
        super(context, z);
        int i;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        if (layoutDirection == 1) {
            i = 21;
        } else {
            i = 22;
        }
        this.c = i;
        this.d = layoutDirection == 1 ? 22 : 21;
    }

    @Override // defpackage.mh, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        ig igVar;
        int i;
        im imVar;
        ne neVar;
        ne neVar2;
        int pointToPosition;
        int i2;
        if (this.e != null) {
            ListAdapter adapter = getAdapter();
            int i3 = 0;
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                igVar = (ig) headerViewListAdapter.getWrappedAdapter();
            } else {
                igVar = (ig) adapter;
                i = 0;
            }
            apuv apuvVar = null;
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < igVar.getCount()) {
                imVar = igVar.getItem(i2);
            } else {
                imVar = null;
            }
            MenuItem menuItem = this.f;
            if (menuItem != imVar) {
                ij ijVar = igVar.a;
                if (menuItem != null && (neVar2 = ((ng) this.e).b) != null) {
                    ((ic) neVar2).a.a.removeCallbacksAndMessages(ijVar);
                }
                this.f = imVar;
                if (imVar != null && (neVar = ((ng) this.e).b) != null) {
                    ic icVar = (ic) neVar;
                    icVar.a.a.removeCallbacksAndMessages(null);
                    int size = icVar.a.b.size();
                    while (true) {
                        if (i3 < size) {
                            if (ijVar == ((apuv) icVar.a.b.get(i3)).b) {
                                break;
                            }
                            i3++;
                        } else {
                            i3 = -1;
                            break;
                        }
                    }
                    if (i3 != -1) {
                        int i4 = i3 + 1;
                        if (i4 < icVar.a.b.size()) {
                            apuvVar = (apuv) icVar.a.b.get(i4);
                        }
                        icVar.a.a.postAtTime(new eex(icVar, apuvVar, (MenuItem) imVar, ijVar, 1), ijVar, SystemClock.uptimeMillis() + 200);
                    }
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ig igVar;
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.c) {
            if (listMenuItemView.isEnabled() && listMenuItemView.a.hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView != null && i == this.d) {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                igVar = (ig) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            } else {
                igVar = (ig) adapter;
            }
            igVar.a.i(false);
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }
}
