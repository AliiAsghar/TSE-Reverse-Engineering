package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.GalleryContentItemView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.selectable.SelectableContentItemView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aasq extends SelectableContentItemView {
    private boolean a;

    public aasq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            c();
        }
    }

    @Override // defpackage.aaul
    public final void c() {
        if (!this.a) {
            this.a = true;
            GalleryContentItemView galleryContentItemView = (GalleryContentItemView) this;
            kqs kqsVar = (kqs) aS();
            galleryContentItemView.d = (yai) kqsVar.a.a.ey.b();
            galleryContentItemView.c = (aksr) kqsVar.a.at.b();
        }
    }
}
