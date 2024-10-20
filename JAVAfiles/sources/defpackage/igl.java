package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class igl implements igp {
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

    public igl(Context context, arwe arweVar, arpi arpiVar, lkd lkdVar, armf armfVar, ifb ifbVar) {
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
        this.i = yyb.bs(context);
        String string = context.getString(R.string.action_report_spam);
        string.getClass();
        this.j = string;
        this.d = new aesh(string, "", arnv.a, false, false, null, null, 0, 248);
        this.e = new aeqa("", arnv.a, null, null, null, null, null, 124);
    }

    @Override // defpackage.igp
    public final aeqg a(lrc lrcVar, iha ihaVar) {
        String string;
        String string2;
        String string3;
        if (ihaVar.a != null) {
            int i = ihaVar.c;
            int i2 = i - 1;
            if (i2 != 0) {
                if (i2 == 3) {
                    string = this.h.getString(R.string.rbm_report_spam_checkbox_body, this.i);
                } else {
                    throw new IllegalStateException("Unexpected dialog type (" + ((Object) hld.f(i)) + ") in BlockAndReportDialog2BlockUiAdapter");
                }
            } else {
                string = this.h.getString(R.string.report_spam_checkbox_body_2024_05_10, this.i);
            }
            String str = string;
            str.getClass();
            aesh aeshVar = this.d;
            Object e = igx.f.e();
            e.getClass();
            String str2 = this.i;
            str2.getClass();
            int T = arsd.T(str, str2, 0, 6);
            str2.getClass();
            List y = aqjn.y(new aeif((String) e, T, arsd.T(str, str2, 0, 6) + this.i.length(), new gsh(this, 9), 24));
            Object e2 = igx.e.e();
            e2.getClass();
            this.d = aesh.a(aeshVar, null, str, y, ((Boolean) e2).booleanValue(), new bp(this, ihaVar, lrcVar, 9, null), 209);
            aeqa aeqaVar = this.e;
            Context context = this.h;
            ResolvedRecipient resolvedRecipient = ihaVar.a;
            resolvedRecipient.getClass();
            String string4 = context.getString(R.string.block_dialog_title_2024_05_10, wfh.y(resolvedRecipient.r(true)));
            string4.getClass();
            int i3 = ihaVar.c;
            int i4 = i3 - 1;
            if (i4 != 0) {
                if (i4 == 3) {
                    string2 = this.h.getString(R.string.rbm_block_dialog_body);
                } else {
                    throw new IllegalStateException("Unexpected dialog type (" + ((Object) hld.f(i3)) + ") in BlockAndReportDialog2BlockUiAdapter");
                }
            } else {
                string2 = this.h.getString(R.string.block_dialog_body_2024_05_10);
            }
            String str3 = string2;
            str3.getClass();
            int i5 = ihaVar.c;
            int i6 = i5 - 1;
            if (i6 != 0) {
                if (i6 == 3) {
                    string3 = this.h.getString(R.string.rbm_block_dialog_positive_button_label);
                } else {
                    throw new IllegalStateException("Unexpected dialog type (" + ((Object) hld.f(i5)) + ") in BlockAndReportDialog2BlockUiAdapter");
                }
            } else {
                string3 = this.h.getString(R.string.block_spam_dialog_positive_button_label);
            }
            String str4 = string3;
            str4.getClass();
            aewr aewrVar = new aewr(str4, new bp(this, ihaVar, lrcVar, 8, null));
            String string5 = this.h.getString(android.R.string.cancel);
            string5.getClass();
            aewr aewrVar2 = new aewr(string5, new ifa(lrcVar, 4));
            ResolvedRecipient resolvedRecipient2 = ihaVar.a;
            resolvedRecipient2.getClass();
            aeqa b = aeqa.b(aeqaVar, string4, b(resolvedRecipient2.E().A()), str3, aewrVar, aewrVar2, new ifa(lrcVar, 5), 8);
            this.e = b;
            return b;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final List b(boolean z) {
        if (z) {
            return arnv.a;
        }
        return aqjn.y(this.d);
    }
}
