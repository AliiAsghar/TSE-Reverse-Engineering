package defpackage;

import android.net.Uri;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ahce implements ancs {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ahce(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, aiwo] */
    /* JADX WARN: Type inference failed for: r0v40, types: [algk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        ListenableFuture listenableFuture;
        int i = 2;
        Object obj2 = null;
        switch (this.b) {
            case 0:
                List list = (List) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size + size);
                Iterator it = list.iterator();
                while (true) {
                    Object obj3 = this.a;
                    if (it.hasNext()) {
                        agrk agrkVar = (agrk) it.next();
                        try {
                            List a = ((ahcg) obj3).a(agrkVar.a.getClass());
                            List a2 = ((ahcg) obj3).a(ahci.class);
                            ArrayList arrayList2 = new ArrayList(a.size() + a2.size());
                            Iterator it2 = a.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(ahcg.c(agrkVar, (ahch) it2.next()));
                            }
                            Iterator it3 = a2.iterator();
                            while (it3.hasNext()) {
                                arrayList2.add(ahcg.c(agrkVar, (ahch) it3.next()));
                            }
                            arrayList.add(ancj.f(albo.bE(arrayList2), new algm(null), andi.a));
                            arrayList.add(agrkVar.b);
                        } catch (Throwable th) {
                            arrayList.add(albo.bH(th));
                        }
                    } else {
                        return albo.bX(arrayList).a(new aidu(obj2, 18), ((ahcg) obj3).a);
                    }
                }
            case 1:
                Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    ((alvg) ((alvg) aegy.a.i()).h("com/google/android/libraries/communications/mobileconfiguration/api/MobileConfigurationApi", "resetAllConfigValidities", 172, "MobileConfigurationApi.java")).q("MobileConfigurationApi: force sync aborted because failed to get parameters");
                    return aneh.a;
                }
                alor alorVar = (alor) optional.get();
                if (alorVar.isEmpty()) {
                    ((alvg) ((alvg) aegy.a.g()).h("com/google/android/libraries/communications/mobileconfiguration/api/MobileConfigurationApi", "resetAllConfigValidities", 178, "MobileConfigurationApi.java")).q("MobileConfigurationApi: force sync aborted because no parameters are stored");
                    return aneh.a;
                }
                alob alobVar = new alob();
                aluq listIterator = alorVar.entrySet().listIterator();
                while (true) {
                    Object obj4 = this.a;
                    int i2 = 1;
                    if (listIterator.hasNext()) {
                        Map.Entry entry = (Map.Entry) listIterator.next();
                        String str = (String) entry.getKey();
                        aehn aehnVar = (aehn) entry.getValue();
                        aotw aotwVar = aehnVar.d;
                        if (aotwVar == null) {
                            aotwVar = aotw.a;
                        }
                        aozy builder = aehnVar.toBuilder();
                        aozy builder2 = aotwVar.toBuilder();
                        aozn aoznVar = apdp.a;
                        if (!builder2.b.isMutable()) {
                            builder2.u();
                        }
                        aotw aotwVar2 = (aotw) builder2.b;
                        aoznVar.getClass();
                        aotwVar2.f = aoznVar;
                        aotwVar2.b = 1 | aotwVar2.b;
                        if (!builder.b.isMutable()) {
                            builder.u();
                        }
                        aehn aehnVar2 = (aehn) builder.b;
                        aotw aotwVar3 = (aotw) builder2.s();
                        aotwVar3.getClass();
                        aehnVar2.d = aotwVar3;
                        aehnVar2.b |= 2;
                        aegy aegyVar = (aegy) obj4;
                        ListenableFuture submit = aegyVar.b.submit(new xqt(obj4, str, builder.s(), 16));
                        alobVar.h(submit);
                        aegyVar.c(submit, "MobileConfigurationApi: force sync failed to store configs");
                    } else {
                        return albo.bV(alobVar.g()).a(new agug(i2), ((aegy) obj4).c);
                    }
                }
            case 2:
                algw algwVar = (algw) obj;
                if (algwVar.f()) {
                    ahiu.f("%s: CancelForegroundDownload future found for key = %s, cancelling...", "DownloaderImp", this.a);
                    ((ListenableFuture) algwVar.b()).cancel(false);
                }
                return aneh.a;
            case 3:
                return ((ahob) this.a).U((alog) obj);
            case 4:
                return ((akkw) this.a).e((ahvp) obj);
            case 5:
                ahty ahtyVar = (ahty) obj;
                int i3 = ahtyVar.a;
                if (i3 != 29501 && i3 != 29537 && i3 != 29538 && i3 != 29539 && i3 != 29540 && i3 != 29541 && i3 != 29542 && i3 != 29543) {
                    if (i3 == 29544) {
                        i3 = 29544;
                    }
                    return albo.bH(ahtyVar);
                }
                ahut ahutVar = (ahut) this.a;
                boolean f = ahutVar.h.f();
                String str2 = "Failed to commit due to stale snapshot for " + ahutVar.b + ". Experiments may be delayed til next app start. Error code: " + i3;
                if (!f) {
                    str2 = str2.concat(". Triggering flag update.");
                }
                Log.w("MobStoreFlagStore", str2);
                if (!f) {
                    ahutVar.b();
                }
                return albo.bH(ahtyVar);
            case 6:
                return ((akkw) this.a).e((ahvp) obj);
            case 7:
                return albo.bJ((ListenableFuture) ((ahvr) this.a).g.get());
            case 8:
                return ((aiea) this.a).g.c();
            case 9:
                return ((aiea) this.a).g.c();
            case 10:
                aiwp aiwpVar = (aiwp) this.a;
                return albo.bI(aiwpVar.f.a.a(new agrk(aiwpVar.e, aiwpVar.d), (apbt) obj));
            case 11:
                aiws aiwsVar = (aiws) this.a;
                aiwsVar.c((Uri) albo.bQ(aiwsVar.b), obj);
                return aneh.a;
            case 12:
                aiws aiwsVar2 = (aiws) this.a;
                return albo.bI(aiwsVar2.b((Uri) albo.bQ(aiwsVar2.b)));
            case 13:
                Uri uri = (Uri) obj;
                Uri ac = ahmc.ac(uri, ".bak");
                Object obj5 = this.a;
                try {
                    if (((aiws) obj5).g.u(ac)) {
                        ((aiws) obj5).g.t(ac, uri);
                    }
                    return aneh.a;
                } catch (IOException e) {
                    return albo.bH(e);
                }
            case 14:
                Object obj6 = this.a;
                synchronized (((aiws) obj6).e) {
                    listenableFuture = ((aiws) obj6).f;
                }
                return listenableFuture;
            case 15:
                return albo.bI(this.a.apply(obj));
            case 16:
                return ((aiwu) this.a).b.c();
            case 17:
                return ((aiwu) this.a).f.a();
            case 18:
                Object obj7 = this.a;
                ((IOException) obj7).addSuppressed((IOException) obj);
                throw ((Throwable) obj7);
            case 19:
                ((alvg) ((alvg) ((alvg) ajzg.a.h()).g((Throwable) obj)).h("com/google/apps/tiktok/account/data/AccountInvalidator", "invalidateAllAccounts", 70, "AccountInvalidator.java")).q("Account sync failed");
                ajzk ajzkVar = ((ajzg) this.a).b;
                return ((aiwu) ajzkVar.h).b(new ajyn(ajzkVar, 3), andi.a);
            default:
                Object obj8 = ((ajzk) this.a).d;
                alog alogVar = (alog) obj;
                akrh e2 = aktp.e("Sync Accounts");
                Object obj9 = ((ansy) obj8).b;
                try {
                    Object obj10 = ((akkd) obj9).c;
                    akul h = akul.g(((akkd) obj9).d((ahiy) obj10, new ajyn(alogVar, 7))).i(new ajzp(obj9, i), ((akkd) obj9).e).h(new algm(null), andi.a);
                    e2.b(h);
                    e2.close();
                    return h;
                } catch (Throwable th2) {
                    try {
                        e2.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
        }
    }
}
