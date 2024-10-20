package defpackage;

import android.content.Intent;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akaj implements ajye, ajyf {
    public akaj() {
        Boolean bool = false;
        bool.getClass();
    }

    @Override // defpackage.ajye, defpackage.ajyd
    public final ListenableFuture a(ajyi ajyiVar) {
        ListenableFuture bI;
        akrh e = aktp.e("Get Intent Account");
        try {
            Intent intent = ajyiVar.a;
            ajwt ajwtVar = null;
            if (ajya.d(intent)) {
                int intExtra = intent.getIntExtra("account_id", -1);
                if (intExtra != -1 && !intent.getBooleanExtra("$tiktok$account_id_owned", false)) {
                    ((alvg) ((alvg) ajya.a.h()).h("com/google/apps/tiktok/account/api/controller/AccountIntents", "getAccount", 106, "AccountIntents.java")).q("AccountId was manually propagated. Use AccountIntents instead.");
                }
                if (intExtra != -1) {
                    ajwtVar = ajwt.a(intExtra);
                }
                bI = albo.bI(ajwtVar);
            } else {
                bI = albo.bI(null);
            }
            e.close();
            return bI;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajye
    public final ListenableFuture b(ajwt ajwtVar) {
        return albo.bI(null);
    }

    @Override // defpackage.ajye
    public final /* synthetic */ ListenableFuture c(ajwt ajwtVar) {
        return ajki.u(this, ajwtVar);
    }
}
