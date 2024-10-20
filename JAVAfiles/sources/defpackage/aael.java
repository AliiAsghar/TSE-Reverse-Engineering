package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aael extends aafk {
    public aael(Context context, ydc ydcVar, ksi ksiVar, yyb yybVar, ykw ykwVar, mho mhoVar, xnv xnvVar, armf armfVar, rgp rgpVar, apwt apwtVar, znp znpVar, aksr aksrVar, armf armfVar2, armf armfVar3) {
        super(context, ydcVar, ksiVar, yybVar, ykwVar, mhoVar, xnvVar, armfVar, rgpVar, znpVar, apwtVar, aksrVar, armfVar2, armfVar3);
    }

    @Override // defpackage.aafk
    public final int a() {
        if (((Boolean) ((utz) aaem.a.get()).e()).booleanValue()) {
            return R.dimen.rich_card_conversation_suggestion_button_horizontal_padding;
        }
        return R.dimen.rich_card_conversation_suggestion_horizontal_padding;
    }

    @Override // defpackage.aafk
    protected final int b() {
        return R.id.suggestion_rich_card_button_icon;
    }

    @Override // defpackage.aafk
    protected final int c() {
        return R.id.suggestion_rich_card_button_label;
    }

    @Override // defpackage.aafk
    protected final int d() {
        if (((Boolean) ((utz) aaem.a.get()).e()).booleanValue()) {
            return R.layout.conversation_suggestion_rich_card_button2;
        }
        return R.layout.conversation_suggestion_rich_card_button;
    }

    @Override // defpackage.aafk
    public final void e(aahj aahjVar, aafw aafwVar) {
        super.e(aahjVar, aafwVar);
        if (((Boolean) ((utz) aaem.a.get()).e()).booleanValue()) {
            aahjVar.e().a();
        }
    }

    @Override // defpackage.aafk
    protected final int f(aafw aafwVar) {
        return aahj.h(aafwVar);
    }

    @Override // defpackage.aafk
    protected final int g(aafw aafwVar) {
        return aahj.h(aafwVar);
    }
}
