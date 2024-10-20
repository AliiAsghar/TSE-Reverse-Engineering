package defpackage;

import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kve implements pz {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public kve(fv fvVar, int i) {
        this.b = i;
        this.a = fvVar;
    }

    @Override // defpackage.pz
    public final boolean a(MenuItem menuItem) {
        if (this.b != 0) {
            return ((fv) this.a).a.onMenuItemSelected(0, menuItem);
        }
        return ((kvw) this.a).C(menuItem);
    }

    public /* synthetic */ kve(kvw kvwVar, int i) {
        this.b = i;
        this.a = kvwVar;
    }
}
