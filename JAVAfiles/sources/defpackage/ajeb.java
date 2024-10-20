package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajeb implements egi {
    final /* synthetic */ int a;
    final /* synthetic */ BottomSheetBehavior b;

    public ajeb(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.a = i;
        this.b = bottomSheetBehavior;
    }

    @Override // defpackage.egi
    public final boolean a(View view) {
        this.b.V(this.a);
        return true;
    }
}
