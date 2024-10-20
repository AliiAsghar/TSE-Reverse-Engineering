package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajhs extends ecl {
    final /* synthetic */ CheckableImageButton a;

    public ajhs(CheckableImageButton checkableImageButton) {
        this.a = checkableImageButton;
    }

    @Override // defpackage.ecl
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.a.a);
    }

    @Override // defpackage.ecl
    public final void c(View view, efx efxVar) {
        super.c(view, efxVar);
        efxVar.o(this.a.b);
        efxVar.p(this.a.a);
    }
}
