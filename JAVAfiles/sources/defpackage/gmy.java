package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gmy extends Drawable.ConstantState {
    private final Drawable.ConstantState a;

    public gmy(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        gmz gmzVar = new gmz();
        gmzVar.e = (VectorDrawable) this.a.newDrawable();
        return gmzVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        gmz gmzVar = new gmz();
        gmzVar.e = (VectorDrawable) this.a.newDrawable(resources);
        return gmzVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        gmz gmzVar = new gmz();
        gmzVar.e = (VectorDrawable) this.a.newDrawable(resources, theme);
        return gmzVar;
    }
}
