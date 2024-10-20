package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.ContainerContentView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aaqc extends aaqd {
    protected FrameLayout e;
    protected final View.AccessibilityDelegate f;
    public final ContentGridView g;

    public aaqc(ContentGridView contentGridView, int i) {
        super(i);
        this.f = new aaqb(this);
        this.g = contentGridView;
    }

    @Override // defpackage.aaqd
    public void e(View view) {
        super.e(view);
        this.e = (FrameLayout) view.findViewById(R.id.c2o_category_container);
        if (view instanceof ContainerContentView) {
            ((ContainerContentView) view).a = this;
        }
    }

    @Override // defpackage.aaqd
    public final int m() {
        return R.layout.compose2o_category_container_m2;
    }
}
