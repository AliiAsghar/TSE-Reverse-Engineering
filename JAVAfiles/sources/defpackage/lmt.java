package defpackage;

import android.content.Context;
import android.content.Intent;
import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lmt implements lju {
    private static final alwo a = alwo.o("BugleLinkify");
    private final Context b;
    private final xce c;
    private final abbu d;

    public lmt(Context context, xce xceVar, abbu abbuVar) {
        abbuVar.getClass();
        this.b = context;
        this.c = xceVar;
        this.d = abbuVar;
    }

    @Override // defpackage.lju
    public final /* bridge */ /* synthetic */ Object a(lkf lkfVar, arpe arpeVar) {
        lms lmsVar = (lms) lkfVar;
        Intent intent = new Intent("android.intent.action.VIEW", lmsVar.a);
        intent.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        if (this.c.a()) {
            intent.addFlags(4096);
        }
        intent.putExtra("com.android.browser.application_id", this.b.getPackageName());
        ((alwl) a.g()).t("Navigating to uri: %s", yyb.bj(lmsVar.a));
        this.d.p(this.b, intent);
        return arnb.a;
    }
}
