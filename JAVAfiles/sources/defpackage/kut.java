package defpackage;

import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.rcsmigration.RcsStateProvider;
import j$.util.Optional;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kut implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kut(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 8;
        int i2 = 2;
        switch (this.b) {
            case 0:
                Object obj = this.a;
                akrh e = aktp.e("GlideInitManager#doInitWork");
                try {
                    ((aquq) ((kor) obj).b.b()).h().s(Integer.valueOf(R.drawable.ic_check_circle));
                    e.close();
                    return;
                } catch (Throwable th) {
                    try {
                        e.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 1:
                ((uyg) ((kpx) this.a).d.get()).a();
                return;
            case 2:
                ((lqm) ((Optional) ((kvw) this.a).ax.b()).get()).f();
                return;
            case 3:
                kuy.a.o("Start chat button clicked");
                kvw kvwVar = (kvw) this.a;
                if (kvwVar.aY.a()) {
                    kvwVar.bn.g(yci.h, 0);
                }
                kvwVar.bn.g(mgv.G, 0);
                ijp.e((ijp) kvwVar.Z.b(), 2, 0, 2, 10);
                kvwVar.aG.j();
                return;
            case 4:
                ((kvw) this.a).o();
                return;
            case 5:
                Object obj2 = this.a;
                kvw kvwVar2 = (kvw) obj2;
                ((abfh) kvwVar2.Q.b()).b(kvwVar2.b, new kva(obj2, i2));
                return;
            case 6:
                zxy zxyVar = (zxy) ((rae) this.a).a;
                ((ykw) zxyVar.b).g(((Resources) zxyVar.c).getString(R.string.link_preview_enabled_pref_key), true);
                if (zxyVar.i() == -1) {
                    zxyVar.l(((xnv) zxyVar.e).f().toEpochMilli());
                }
                zxyVar.v();
                return;
            case 7:
                ((arqg) this.a).a();
                return;
            case 8:
                ((RcsStateProvider) this.a).m190x2b266856();
                return;
            case 9:
                lta ltaVar = (lta) this.a;
                ltaVar.d.n();
                ((lqn) ltaVar.b.b()).d();
                return;
            case 10:
                long n = luz.n((UUID) this.a);
                tit titVar = new tit();
                titVar.b(new ilg(n, i));
                titVar.d();
                return;
            case 11:
                long n2 = luz.n((UUID) this.a);
                tit titVar2 = new tit();
                titVar2.b(new ilg(n2, 7));
                titVar2.d();
                return;
            case 12:
                ((lzq) this.a).a();
                return;
            case 13:
                Object obj3 = this.a;
                lzq lzqVar = (lzq) obj3;
                lzqVar.p.b();
                ((utt) lzqVar.o.b()).d(lzqVar.c);
                ((mbl) lzqVar.e.b()).i();
                ((mce) lzqVar.f.b()).j();
                ((mce) lzqVar.g.b()).j();
                ((mce) lzqVar.h.b()).j();
                ((mho) lzqVar.i.b()).l();
                ((trh) lzqVar.j.b()).a();
                mdw mdwVar = (mdw) lzqVar.k.b();
                aiut.b();
                boolean i3 = ((yep) mdwVar.c.b()).i("bugle_enable_analytics", true);
                if (i3) {
                    mdwVar.b = (maq) mdwVar.a.b();
                }
                mdwVar.d.set(i3);
                ((yep) lzqVar.d.b()).g(new kut(obj3, 12));
                lzqVar.a();
                boolean e2 = ((yjv) lzqVar.l.b()).e();
                Optional S = ((znj) lzqVar.q.b()).S();
                if (e2 && S.isPresent()) {
                    xzb.l("BugleDatabase", "full sync request on startup for reason [" + S.get().toString() + "]");
                    ((wzp) lzqVar.m.b()).k((amvm) S.get());
                }
                if (yhx.l.get()) {
                    ((mbl) lzqVar.e.b()).c("Bugle.OsUtil.GetProcessName.Failure.Count");
                    if (((Boolean) ((utz) lzq.b.get()).e()).booleanValue()) {
                        ((alwl) ((alwl) ((alwl) ((alwo) lzq.a.get()).i()).g((Throwable) yhx.m.get())).h("com/google/android/apps/messaging/shared/SharedAsyncAppCreateStartupTask", "run", 160, "SharedAsyncAppCreateStartupTask.java")).q("Failure detected retrieving process name from in process data.");
                        return;
                    }
                    return;
                }
                return;
            case 14:
                mah mahVar = (mah) this.a;
                mahVar.a.c();
                mahVar.b.c();
                return;
            case 15:
                hin hinVar = (hin) this.a;
                hinVar.a = 3;
                if (hinVar.e != null) {
                    gvf.Q("Unbinding from service.");
                    hinVar.b.unbindService(hinVar.e);
                    hinVar.e = null;
                }
                hinVar.d = null;
                return;
            case 16:
                mii miiVar = (mii) this.a;
                ((lpg) miiVar.b.get()).q(1L, miiVar.a());
                return;
            case 17:
                ((mls) this.a).q.y(new mcw(11), "BugleConversationPropertiesSupplier::Notify");
                return;
            case 18:
                mvx mvxVar = (mvx) this.a;
                mvxVar.a.a(alzz.aZ(mvxVar.b));
                return;
            case 19:
                ((mwf) this.a).x.y(new mqr(6), "ComposeConstraints::Notify");
                return;
            default:
                ((mxc) this.a).h.y(new mqr(i), "ActiveComposersNotify");
                return;
        }
    }
}
