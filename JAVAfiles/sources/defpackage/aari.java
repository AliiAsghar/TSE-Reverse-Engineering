package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.messaging.ui.mediapicker.c2o.expressivesticker.ExpressiveStickerContentItemView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.selectable.SelectableContentItemView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aari extends SelectableContentItemView {
    private boolean a;

    public aari(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            c();
        }
    }

    @Override // defpackage.aaul
    public final void c() {
        if (!this.a) {
            this.a = true;
            ExpressiveStickerContentItemView expressiveStickerContentItemView = (ExpressiveStickerContentItemView) this;
            kqs kqsVar = (kqs) aS();
            expressiveStickerContentItemView.d = (yai) kqsVar.a.a.ey.b();
            expressiveStickerContentItemView.b = (zmr) kqsVar.J.au.b();
            expressiveStickerContentItemView.a = (aksr) kqsVar.a.at.b();
        }
    }
}
