package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import androidx.emoji.widget.EmojiAppCompatTextView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aadg extends EmojiAppCompatTextView implements apxr {
    private aklx a;
    private boolean b;

    public aadg(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    @Override // defpackage.apxr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aklx aR() {
        if (this.a == null) {
            this.a = new aklx(this);
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
            ((aacg) aS()).E();
        }
    }

    public aadg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    public aadg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        b();
    }
}
