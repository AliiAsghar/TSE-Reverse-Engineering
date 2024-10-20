package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.ui.conversation.suggestions.ConversationSuggestionsView;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aafm extends LinearLayout implements apxr {
    private apxm a;
    private boolean b;

    aafm(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        g();
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    @Override // defpackage.apxr
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final apxm aR() {
        if (this.a == null) {
            this.a = new apxm(this);
        }
        return this.a;
    }

    protected final void g() {
        if (!this.b) {
            this.b = true;
            ConversationSuggestionsView conversationSuggestionsView = (ConversationSuggestionsView) this;
            kqs kqsVar = (kqs) aS();
            conversationSuggestionsView.b = (lzv) kqsVar.a.yJ.b();
            conversationSuggestionsView.c = (ksm) kqsVar.a.a.fP.b();
            conversationSuggestionsView.d = (mho) kqsVar.a.gD.b();
            conversationSuggestionsView.e = kqsVar.a.oM;
            Context context = (Context) kqsVar.J.c.b();
            ydc ydcVar = (ydc) kqsVar.a.dU.b();
            ksi ksiVar = (ksi) kqsVar.a.ft.b();
            yyb yybVar = (yyb) kqsVar.a.a.cW.b();
            krv krvVar = kqsVar.a;
            apya apyaVar = krvVar.oB;
            ykw ykwVar = (ykw) krvVar.av.b();
            mho mhoVar = (mho) kqsVar.a.gD.b();
            xnv xnvVar = (xnv) kqsVar.a.bV.b();
            krv krvVar2 = kqsVar.a;
            conversationSuggestionsView.f = new aaff(context, ydcVar, ksiVar, yybVar, apyaVar, ykwVar, mhoVar, xnvVar, krvVar2.oO, (rgp) krvVar2.vi.b(), (znp) kqsVar.y.b(), (abdc) kqsVar.a.a.cX.b(), apxv.a(kqsVar.J.ao), (aksr) kqsVar.a.at.b(), kqsVar.z, kqsVar.A);
            krv krvVar3 = kqsVar.a;
            conversationSuggestionsView.g = (Optional) ((apxx) krvVar3.uF).a;
            conversationSuggestionsView.h = (kor) krvVar3.za.b();
        }
    }

    public aafm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        g();
    }

    aafm(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        g();
    }

    aafm(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        g();
    }
}
