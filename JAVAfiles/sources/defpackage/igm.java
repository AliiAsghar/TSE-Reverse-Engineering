package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class igm implements igp {
    public final arwe a;
    public final arpi b;
    public final armf c;
    public final lkd d;
    public final ifb e;
    private final Context f;

    public igm(Context context, arwe arweVar, arpi arpiVar, lkd lkdVar, armf armfVar, ifb ifbVar) {
        context.getClass();
        arweVar.getClass();
        arpiVar.getClass();
        lkdVar.getClass();
        armfVar.getClass();
        ifbVar.getClass();
        this.f = context;
        this.a = arweVar;
        this.b = arpiVar;
        this.d = lkdVar;
        this.c = armfVar;
        this.e = ifbVar;
    }

    @Override // defpackage.igp
    public final aeqg a(lrc lrcVar, iha ihaVar) {
        String bs = yyb.bs(this.f);
        String string = this.f.getString(R.string.report_group_spam_body_2024_05_10, bs);
        string.getClass();
        Object e = igx.b.e();
        e.getClass();
        bs.getClass();
        aeif aeifVar = new aeif((String) e, arsd.T(string, bs, 0, 6), arsd.T(string, bs, 0, 6) + bs.length(), new gsh(this, 10), 24);
        String string2 = this.f.getString(R.string.spam_dialog_title_2024_05_10);
        List y = aqjn.y(aeifVar);
        String string3 = this.f.getString(R.string.block_spam_dialog_positive_button_label);
        string3.getClass();
        aewr aewrVar = new aewr(string3, new gqx(this, ihaVar, 10, null));
        String string4 = this.f.getString(android.R.string.cancel);
        string4.getClass();
        return new aepx(string, y, null, string2, false, false, aewrVar, new aewr(string4, gqj.k), null, 308);
    }
}
