package defpackage;

import android.content.Intent;
import android.widget.TextView;
import com.google.android.apps.messaging.navigation.targets.DirectSendResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aawv extends rg {
    final /* synthetic */ aaww a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aawv(aaww aawwVar) {
        super(true);
        this.a = aawwVar;
    }

    @Override // defpackage.rg
    public final void b() {
        aaxa aaxaVar;
        String charSequence;
        aaww aawwVar = this.a;
        aaxa aaxaVar2 = aawwVar.c;
        if (aaxaVar2 != null) {
            aaxaVar2.E();
        }
        aawwVar.d.h(false);
        if (aawwVar.e && (aaxaVar = aawwVar.c) != null) {
            aaxd E = aaxaVar.E();
            albo.T(E.M);
            TextView textView = E.y;
            textView.getClass();
            CharSequence text = textView.getText();
            if (text == null) {
                charSequence = null;
            } else {
                charSequence = text.toString();
            }
            aawwVar.a.setResult(-1, new Intent("android.intent.action.SEND").putExtra("direct_send_result", new DirectSendResult.Discard(albo.af(charSequence))));
        }
        aawwVar.a.c().d();
    }
}
