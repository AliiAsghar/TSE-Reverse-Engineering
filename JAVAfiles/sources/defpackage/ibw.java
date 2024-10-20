package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.audio.attachment.AudioAttachmentView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ibw extends LinearLayout implements apxr {
    private aklx a;
    private boolean b;

    ibw(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        j();
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    @Override // defpackage.apxr
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final aklx aR() {
        if (this.a == null) {
            this.a = new aklx(this);
        }
        return this.a;
    }

    protected final void j() {
        if (!this.b) {
            this.b = true;
            ((ibu) aS()).a((AudioAttachmentView) this);
        }
    }

    public ibw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        j();
    }

    ibw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        j();
    }

    ibw(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        j();
    }
}
