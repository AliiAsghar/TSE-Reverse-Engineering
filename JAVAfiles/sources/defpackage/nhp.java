package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.messaging.shared.audio.attachment.ui.AudioPlaybackSeekBar;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class nhp extends ku implements apxr {
    private apxm a;
    private boolean b;

    nhp(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        c();
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    @Override // defpackage.apxr
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final apxm aR() {
        if (this.a == null) {
            this.a = new apxm(this);
        }
        return this.a;
    }

    protected final void c() {
        if (!this.b) {
            this.b = true;
            ((AudioPlaybackSeekBar) this).a = (xnv) ((kqs) aS()).a.bV.b();
        }
    }

    public nhp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        c();
    }

    nhp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        c();
    }
}
