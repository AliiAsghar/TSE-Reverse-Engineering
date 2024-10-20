package defpackage;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfn extends ActionMode.Callback2 {
    private final dfp a;

    public dfn(dfp dfpVar) {
        this.a = dfpVar;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        int i = dfo.a.e;
        dfp dfpVar = this.a;
        if (itemId == i) {
            arqg arqgVar = dfpVar.c;
            if (arqgVar != null) {
                arqgVar.a();
            }
        } else if (itemId == dfo.b.e) {
            arqg arqgVar2 = dfpVar.d;
            if (arqgVar2 != null) {
                arqgVar2.a();
            }
        } else if (itemId == dfo.c.e) {
            arqg arqgVar3 = dfpVar.e;
            if (arqgVar3 != null) {
                arqgVar3.a();
            }
        } else if (itemId == dfo.d.e) {
            arqg arqgVar4 = dfpVar.f;
            if (arqgVar4 != null) {
                arqgVar4.a();
            }
        } else {
            return false;
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        if (menu != null) {
            if (actionMode != null) {
                dfp dfpVar = this.a;
                if (dfpVar.c != null) {
                    dfp.a(menu, dfo.a);
                }
                if (dfpVar.d != null) {
                    dfp.a(menu, dfo.b);
                }
                if (dfpVar.e != null) {
                    dfp.a(menu, dfo.c);
                }
                if (dfpVar.f != null) {
                    dfp.a(menu, dfo.d);
                    return true;
                }
                return true;
            }
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
        throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        arqg arqgVar = this.a.a;
        if (arqgVar != null) {
            arqgVar.a();
        }
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        cjp cjpVar = this.a.b;
        if (rect != null) {
            rect.set((int) cjpVar.b, (int) cjpVar.c, (int) cjpVar.d, (int) cjpVar.e);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        if (actionMode != null && menu != null) {
            dfp dfpVar = this.a;
            dfp.b(menu, dfo.a, dfpVar.c);
            dfp.b(menu, dfo.b, dfpVar.d);
            dfp.b(menu, dfo.c, dfpVar.e);
            dfp.b(menu, dfo.d, dfpVar.f);
            return true;
        }
        return false;
    }
}
