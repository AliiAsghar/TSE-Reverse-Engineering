package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.messaging.shared.ui.AsyncImageView;
import com.google.android.apps.messaging.shared.ui.RoundedImageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class xud extends RoundedImageView implements apxr {
    private apxm a;
    private boolean b;

    public xud(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        o();
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    @Override // defpackage.apxr
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final apxm aR() {
        if (this.a == null) {
            this.a = new apxm(this);
        }
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void o() {
        if (!this.b) {
            this.b = true;
            AsyncImageView asyncImageView = (AsyncImageView) this;
            kqs kqsVar = (kqs) aS();
            asyncImageView.e = (yai) kqsVar.a.a.ey.b();
            asyncImageView.f = (uga) kqsVar.a.ne.b();
            asyncImageView.g = (ahmn) kqsVar.J.aJ.b();
        }
    }

    public xud(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        o();
    }
}
