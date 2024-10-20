package defpackage;

import android.support.v7.view.menu.ActionMenuItemView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hy extends ml {
    final /* synthetic */ ActionMenuItemView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.a = actionMenuItemView;
    }

    @Override // defpackage.ml
    public final iz a() {
        jm jmVar;
        qdq qdqVar = this.a.c;
        if (qdqVar != null && (jmVar = ((jq) qdqVar.a).j) != null) {
            return jmVar.a();
        }
        return null;
    }

    @Override // defpackage.ml
    public final boolean b() {
        iz a;
        ActionMenuItemView actionMenuItemView = this.a;
        ii iiVar = actionMenuItemView.b;
        if (iiVar == null || !iiVar.b(actionMenuItemView.a) || (a = a()) == null || !a.u()) {
            return false;
        }
        return true;
    }
}
