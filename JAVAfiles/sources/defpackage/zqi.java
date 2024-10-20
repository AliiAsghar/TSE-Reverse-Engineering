package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.ui.contact.ContactListItemView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class zqi extends LinearLayout implements apxr {
    private apxm a;
    private boolean b;

    zqi(Context context) {
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
            kqs kqsVar = (kqs) aS();
            krv krvVar = kqsVar.a;
            apya apyaVar = krvVar.n;
            apya apyaVar2 = kqsVar.g;
            ((ContactListItemView) this).a = new jat(apyaVar, apyaVar2, krvVar.jC, krvVar.df, krvVar.ec, krvVar.jc, krvVar.dd, apyaVar2);
        }
    }

    public zqi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        c();
    }

    zqi(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        c();
    }

    zqi(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        c();
    }
}
