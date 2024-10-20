package defpackage;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class in extends eco implements ActionProvider.VisibilityListener {
    public static final /* synthetic */ int c = 0;
    public final ActionProvider a;
    final /* synthetic */ ir b;
    private ecn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in(ir irVar, Context context, ActionProvider actionProvider) {
        super(context);
        this.b = irVar;
        this.a = actionProvider;
    }

    @Override // defpackage.eco
    public final boolean hasSubMenu() {
        return this.a.hasSubMenu();
    }

    @Override // defpackage.eco
    public final boolean isVisible() {
        return this.a.isVisible();
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        ecn ecnVar = this.d;
        if (ecnVar != null) {
            ecnVar.a();
        }
    }

    @Override // defpackage.eco
    public final View onCreateActionView() {
        return this.a.onCreateActionView();
    }

    @Override // defpackage.eco
    public final boolean onPerformDefaultAction() {
        return this.a.onPerformDefaultAction();
    }

    @Override // defpackage.eco
    public final void onPrepareSubMenu(SubMenu subMenu) {
        this.a.onPrepareSubMenu(this.b.b(subMenu));
    }

    @Override // defpackage.eco
    public final boolean overridesItemVisibility() {
        return this.a.overridesItemVisibility();
    }

    @Override // defpackage.eco
    public final void refreshVisibility() {
        this.a.refreshVisibility();
    }

    @Override // defpackage.eco
    public final void setVisibilityListener(ecn ecnVar) {
        in inVar;
        this.d = ecnVar;
        if (ecnVar != null) {
            inVar = this;
        } else {
            inVar = null;
        }
        this.a.setVisibilityListener(inVar);
    }

    @Override // defpackage.eco
    public final View onCreateActionView(MenuItem menuItem) {
        return this.a.onCreateActionView(menuItem);
    }
}
