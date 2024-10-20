package defpackage;

import android.content.Context;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abxa extends abrc {
    public final Context a;
    private final alhr b;

    public abxa(Context context, alhr alhrVar) {
        super(context, abws.a, abqx.q, abrb.a);
        this.a = context;
        int i = abwu.a;
        albo.D(new ynw(context, 10));
        this.b = alhrVar;
    }

    public static boolean b(anhh anhhVar, anhg anhgVar) {
        if (anhhVar != null && new apaq(anhhVar.c, anhh.a).contains(anhgVar)) {
            return true;
        }
        return false;
    }

    public final acir a() {
        acit acitVar = new acit();
        abwt abwtVar = new abwt("wrapper");
        ajxp ajxpVar = new ajxp(null);
        ajxpVar.c = new abxb(1);
        ajxpVar.b = 12301;
        acir g = g(ajxpVar.b());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        d.t(true, "Timeout must be positive");
        d.aC(timeUnit, "TimeUnit must not be null");
        adae adaeVar = new adae(null, null);
        acit acitVar2 = new acit(adaeVar);
        acda acdaVar = new acda(Looper.getMainLooper());
        acdaVar.postDelayed(new acbq(acitVar2, 4), timeUnit.toMillis(5L));
        g.q(new abpl(acdaVar, acitVar2, adaeVar, 2));
        acir acirVar = (acir) acitVar2.a;
        acirVar.r(new vdn(abwtVar, acitVar, 5, null));
        acirVar.p((Executor) this.b.get(), new abwx(this, abwtVar, acitVar, 0));
        return (acir) acitVar.a;
    }
}
