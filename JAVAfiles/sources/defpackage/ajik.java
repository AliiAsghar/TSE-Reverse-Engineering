package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ajik extends ImageButton {
    public int d;

    public ajik(Context context) {
        this(context, null);
    }

    public final void g(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.d = i;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void setVisibility(int i) {
        g(i, true);
    }

    public ajik(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ajik(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = getVisibility();
    }
}
