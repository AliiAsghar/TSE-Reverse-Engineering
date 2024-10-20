package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Chronometer;
import com.google.android.apps.messaging.shared.audio.attachment.ui.PausableChronometer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class nhq extends Chronometer implements apxr {
    private apxm a;
    private boolean b;

    nhq(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    @Override // defpackage.apxr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final apxm aR() {
        if (this.a == null) {
            this.a = new apxm(this);
        }
        return this.a;
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    protected final void b() {
        if (!this.b) {
            this.b = true;
            ((PausableChronometer) this).a = (xnv) ((kqs) aS()).a.bV.b();
        }
    }

    public nhq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    nhq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    nhq(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        b();
    }
}
