package defpackage;

import android.app.Application;
import java.io.IOException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class akok implements algk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ akok(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r9v29, types: [java.lang.Object, amax] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                amai amaiVar = (amai) obj;
                                Object obj2 = amaiVar.a;
                                Object obj3 = amaiVar.b;
                                Object g = this.a.g(obj2);
                                g.getClass();
                                return g;
                            }
                            return new aksm((aksr) this.a, (Application.ActivityLifecycleCallbacks) obj);
                        }
                        alvg alvgVar = (alvg) ((alvg) akpc.a.d()).h("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerPeriodicScheduler", "scheduleWorker", 179, "SyncWorkManagerPeriodicScheduler.java");
                        akou akouVar = (akou) this.a;
                        alvgVar.C("Scheduled worker: %s at %s", akouVar.a, akouVar.b);
                        return null;
                    }
                    alvg alvgVar2 = (alvg) ((alvg) akpb.a.d()).h("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerOneTimeScheduler", "scheduleWorker", 119, "SyncWorkManagerOneTimeScheduler.java");
                    akou akouVar2 = (akou) this.a;
                    alvgVar2.C("Scheduled worker: %s at %s", akouVar2.a, akouVar2.b);
                    return null;
                }
                ((akos) this.a).i((Set) obj);
                return null;
            }
            ajza ajzaVar = (ajza) obj;
            if (ajzaVar.b.i.equals("pseudonymous")) {
                return new aokd(null, "pseudonymous");
            }
            if (ajzaVar.b.i.equals("incognito")) {
                return new aokd(null, "incognito");
            }
            if (!ajzaVar.b.i.equals("google")) {
                ajzb ajzbVar = ajzaVar.b;
                String str = ajzbVar.d;
                String str2 = ajzbVar.i;
                d.t(!d.am(str2), "Custom AuthContext type must not be empty");
                albo.N(!str2.equals("google"), "Custom AuthContext type must not be '%s'", "google");
                albo.N(!str2.equals("pseudonymous"), "Custom AuthContext type must not be '%s'", "pseudonymous");
                albo.N(!str2.equals("incognito"), "Custom AuthContext type must not be '%s'", "incognito");
                return new aokd(str, str2);
            }
            Object obj4 = this.a;
            albo.U(false, "OAuth authentication failed because no @GcoreAccountType was bound");
            albo.Z(((String) ((algw) obj4).b()).equals(ajzaVar.b.i), "OAuth authentication failed because account type did not match the @GcoreAccountType that was bound, @GcoreAccountType: %s, account: %s", ajzaVar, obj4);
            throw new IllegalStateException("Attempting to get context for unrecognized account type: ".concat(String.valueOf(ajzaVar.b.i)));
        }
        Long l = (Long) obj;
        tm tmVar = new tm();
        akpk akpkVar = akpk.a;
        Object obj5 = this.a;
        try {
            for (akpj akpjVar : ((akom) obj5).a().d) {
                long j = akpjVar.e;
                akpm akpmVar = akpjVar.c;
                if (akpmVar == null) {
                    akpmVar = akpm.a;
                }
                akot akotVar = new akot(akpmVar);
                if (j <= 0) {
                    j = l.longValue();
                }
                tmVar.put(akotVar, Long.valueOf(j));
            }
        } catch (IOException e) {
            ((akom) obj5).f(e);
        }
        return tmVar;
    }
}
