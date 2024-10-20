package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akag implements ajye, ajyf {
    public final String a;
    public final algw b;
    public final aiwu c;
    public final ansy d;

    public akag(Context context, aiwu aiwuVar, ansy ansyVar, algw algwVar) {
        this.c = aiwuVar;
        this.a = context.getPackageName();
        this.d = ansyVar;
        this.b = algwVar;
    }

    @Override // defpackage.ajye, defpackage.ajyd
    public final ListenableFuture a(ajyi ajyiVar) {
        akrh e = aktp.e("Get Default Account");
        try {
            ListenableFuture d = d();
            e.b(d);
            e.close();
            return d;
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

    public final ListenableFuture d() {
        return ancj.f(this.c.a(), akto.a(new ajyn(this, 10)), andi.a);
    }
}
