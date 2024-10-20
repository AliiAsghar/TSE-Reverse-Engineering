package defpackage;

import android.view.ViewParent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class eep extends arrm implements arqr {
    public static final eep a = new eep();

    public eep() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return ((ViewParent) obj).getParent();
    }
}
