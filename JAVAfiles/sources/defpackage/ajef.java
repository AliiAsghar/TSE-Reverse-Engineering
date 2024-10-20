package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajef {
    public int a;
    public boolean b;
    public final /* synthetic */ BottomSheetBehavior c;
    private final Runnable d = new ahsa(this, 20);

    public ajef(BottomSheetBehavior bottomSheetBehavior) {
        this.c = bottomSheetBehavior;
    }

    public final void a(int i) {
        WeakReference weakReference = this.c.A;
        if (weakReference != null && weakReference.get() != null) {
            this.a = i;
            if (!this.b) {
                ((View) this.c.A.get()).postOnAnimation(this.d);
                this.b = true;
            }
        }
    }
}
