package defpackage;

import android.content.Context;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ioy implements afkr {
    public final mci a;
    public final armf b;
    public alog c;
    private final Context d;
    private amqj e;
    private ampa f;

    public ioy(Context context, mci mciVar, armf armfVar) {
        int i = alog.d;
        this.c = alsx.a;
        this.d = context;
        this.a = mciVar;
        this.b = armfVar;
    }

    private final void e(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            ((uvi) this.b.b()).b(th);
        }
    }

    private final void f(int i, afnr afnrVar) {
        e(new qq(this, afnrVar, i, 9, (char[]) null));
    }

    public final amoq a(afnr afnrVar) {
        aozy createBuilder = amoq.a.createBuilder();
        aozy createBuilder2 = amox.a.createBuilder();
        afwv afwvVar = afnrVar.e;
        if (afwvVar == afnp.a) {
            amov amovVar = amov.a;
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            amox amoxVar = (amox) createBuilder2.b;
            amovVar.getClass();
            amoxVar.d = amovVar;
            amoxVar.c = 103;
        } else if (afwvVar == afnn.a) {
            amot amotVar = amot.a;
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            amox amoxVar2 = (amox) createBuilder2.b;
            amotVar.getClass();
            amoxVar2.d = amotVar;
            amoxVar2.c = 102;
        } else if (afwvVar == afno.a) {
            amou amouVar = amou.a;
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            amox amoxVar3 = (amox) createBuilder2.b;
            amouVar.getClass();
            amoxVar3.d = amouVar;
            amoxVar3.c = 101;
        } else if (afwvVar instanceof afnq) {
            amow amowVar = amow.a;
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            amox amoxVar4 = (amox) createBuilder2.b;
            amowVar.getClass();
            amoxVar4.d = amowVar;
            amoxVar4.c = 104;
        }
        if (afnrVar.e != afno.a) {
            boolean z = afnrVar.d;
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            amox amoxVar5 = (amox) createBuilder2.b;
            amoxVar5.b |= 1;
            amoxVar5.e = z;
        }
        amox amoxVar6 = (amox) createBuilder2.s();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amoq amoqVar = (amoq) createBuilder.b;
        amoxVar6.getClass();
        amoqVar.f = amoxVar6;
        amoqVar.e = BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED;
        int i = 2;
        if (afnrVar.e != afno.a) {
            if (this.e == null) {
                aozy createBuilder3 = amqj.a.createBuilder();
                amqh amqhVar = amqh.EMOJI;
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                apag apagVar = createBuilder3.b;
                amqj amqjVar = (amqj) apagVar;
                amqjVar.c = amqhVar.v;
                amqjVar.b |= 1;
                amqi amqiVar = amqi.EXPANDED;
                if (!apagVar.isMutable()) {
                    createBuilder3.u();
                }
                amqj amqjVar2 = (amqj) createBuilder3.b;
                amqjVar2.d = amqiVar.e;
                amqjVar2.b |= 2;
                this.e = (amqj) createBuilder3.s();
            }
            amqj amqjVar3 = this.e;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amoq amoqVar2 = (amoq) createBuilder.b;
            amqjVar3.getClass();
            amoqVar2.d = amqjVar3;
            amoqVar2.c = 101;
        } else {
            if (this.f == null) {
                int E = lgb.E(this.d);
                aozy createBuilder4 = ampa.a.createBuilder();
                if (E != 3) {
                    i = 1;
                }
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                ampa ampaVar = (ampa) createBuilder4.b;
                ampaVar.c = i - 1;
                ampaVar.b |= 1;
                this.f = (ampa) createBuilder4.s();
            }
            ampa ampaVar2 = this.f;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amoq amoqVar3 = (amoq) createBuilder.b;
            ampaVar2.getClass();
            amoqVar3.d = ampaVar2;
            amoqVar3.c = 102;
        }
        return (amoq) createBuilder.s();
    }

    @Override // defpackage.afkr
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        f(2, (afnr) obj);
    }

    @Override // defpackage.afkr
    public final void c(List list) {
        e(new irs(this, list, 1, null));
    }

    @Override // defpackage.afkr
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        f(4, (afnr) obj);
    }
}
