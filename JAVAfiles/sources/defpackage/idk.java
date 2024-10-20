package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class idk implements ykz {
    private final Context a;
    private final ykw b;
    private final iew c;

    public idk(Context context, ykw ykwVar, iew iewVar) {
        this.a = context;
        this.b = ykwVar;
        this.c = iewVar;
    }

    @Override // defpackage.ykz
    public final boolean a(String str) {
        if (!str.equals(this.a.getString(R.string.rcs_tos_state_key)) && !str.equals(this.a.getString(R.string.should_show_google_tos_prompt_key))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [armf, java.lang.Object] */
    @Override // defpackage.aegp
    public final boolean b(String str) {
        Context context = this.a;
        boolean q = this.b.q(context.getString(R.string.enable_rcs_pref_key), context.getResources().getBoolean(R.bool.enable_rcs_pref_default));
        int d = this.b.d(this.a.getString(R.string.rcs_tos_state_key), 0);
        if (!q || d != 2) {
            return false;
        }
        iew iewVar = this.c;
        aozy createBuilder = amts.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amts amtsVar = (amts) createBuilder.b;
        amtsVar.d = 1;
        amtsVar.b = 2 | amtsVar.b;
        amts amtsVar2 = (amts) createBuilder.s();
        maq maqVar = (maq) iewVar.a.b();
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_SYSTEM_BACKUP_EVENT;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amtsVar2.getClass();
        amfrVar2.bn = amtsVar2;
        amfrVar2.g |= 32768;
        maqVar.k(amfqVar, amrs.BUGLE_SYSTEM_BACKUP_EVENT);
        return true;
    }
}
