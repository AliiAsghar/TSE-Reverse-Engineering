package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class igo implements igp {
    public final arwe a;
    public final arpi b;
    public final armf c;
    public aesh d;
    public aeqa e;
    public final lkd f;
    public final ifb g;
    private final Context h;
    private final String i;
    private final String j;
    private final aeif k;
    private final String l;

    public igo(Context context, arwe arweVar, arpi arpiVar, lkd lkdVar, armf armfVar, ifb ifbVar) {
        context.getClass();
        arweVar.getClass();
        arpiVar.getClass();
        lkdVar.getClass();
        armfVar.getClass();
        ifbVar.getClass();
        this.h = context;
        this.a = arweVar;
        this.b = arpiVar;
        this.f = lkdVar;
        this.c = armfVar;
        this.g = ifbVar;
        String bs = yyb.bs(context);
        bs.getClass();
        this.i = bs;
        String string = context.getString(R.string.spam_dialog_body_2024_05_10, bs);
        string.getClass();
        this.j = string;
        Object e = igx.f.e();
        e.getClass();
        aeif aeifVar = new aeif((String) e, arsd.T(string, bs, 0, 6), arsd.T(string, bs, 0, 6) + bs.length(), new gsh(this, 11), 24);
        this.k = aeifVar;
        String string2 = context.getString(R.string.block_spam_dialog_positive_button_label);
        string2.getClass();
        this.l = string2;
        this.d = new aesh("", context.getString(R.string.spam_dialog_block_checkbox_body), null, false, false, null, null, 0, 252);
        String string3 = context.getString(R.string.spam_dialog_title_2024_05_10);
        string3.getClass();
        this.e = new aeqa(string3, arnv.a, string, aqjn.y(aeifVar), null, null, null, 112);
    }

    @Override // defpackage.igp
    public final aeqg a(lrc lrcVar, iha ihaVar) {
        ResolvedRecipient resolvedRecipient = ihaVar.a;
        if (resolvedRecipient != null) {
            aesh aeshVar = this.d;
            String string = this.h.getString(R.string.spam_dialog_block_checkbox_title, resolvedRecipient.f().G(true).toString());
            string.getClass();
            this.d = aesh.a(aeshVar, string, null, null, false, new bp(this, lrcVar, ihaVar, 13), 222);
            aeqa aeqaVar = this.e;
            ResolvedRecipient resolvedRecipient2 = ihaVar.a;
            resolvedRecipient2.getClass();
            List c = c(resolvedRecipient2.t());
            aewr b = b(lrcVar, ihaVar);
            String string2 = this.h.getString(android.R.string.cancel);
            string2.getClass();
            aeqa b2 = aeqa.b(aeqaVar, null, c, null, b, new aewr(string2, new ifa(lrcVar, 6)), new ifa(lrcVar, 7), 13);
            this.e = b2;
            return b2;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final aewr b(lrc lrcVar, iha ihaVar) {
        return new aewr(this.l, new bp(this, ihaVar, lrcVar, 12, null));
    }

    public final List c(boolean z) {
        if (z) {
            return arnv.a;
        }
        return aqjn.y(this.d);
    }
}
