package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmp extends Drawable.ConstantState {
    private final Drawable.ConstantState a;

    public gmp(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        gmq gmqVar = new gmq();
        gmqVar.e = this.a.newDrawable();
        gmqVar.e.setCallback(gmqVar.d);
        return gmqVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        gmq gmqVar = new gmq();
        gmqVar.e = this.a.newDrawable(resources);
        gmqVar.e.setCallback(gmqVar.d);
        return gmqVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        gmq gmqVar = new gmq();
        gmqVar.e = this.a.newDrawable(resources, theme);
        gmqVar.e.setCallback(gmqVar.d);
        return gmqVar;
    }
}
