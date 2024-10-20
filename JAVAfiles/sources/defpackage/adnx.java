package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.rcs.engine.impl.RcsEngineProxyImpl;
import com.google.android.libraries.stickers.gallery.StickerGalleryActivity;
import com.google.android.material.snackbar.Snackbar;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adnx implements andy {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public adnx(int i) {
        this.b = i;
        this.a = "failed to update last seen time of params";
    }

    @Override // defpackage.andy
    public final void a(Throwable th) {
        advp advpVar;
        switch (this.b) {
            case 0:
                advr.s(th, "Failed to get rcsProvisioningProtoDataStorage.", new Object[0]);
                return;
            case 1:
                Object obj = this.a;
                advp advpVar2 = adeg.a;
                wda wdaVar = ((wdl) obj).f;
                if (wdaVar == null) {
                    wdaVar = wda.a;
                }
                advr.h(advpVar2, "[%s] Error while notifying operation completed: %s", wdaVar.c, th);
                return;
            case 2:
                adny adnyVar = (adny) this.a;
                adnyVar.d.f(adnyVar.c.l());
                albo.bR(((adny) this.a).d.a(), new adnx(this, 0), andi.a);
                return;
            case 3:
                advpVar = ((RcsEngineProxyImpl) this.a).B;
                advr.j(th, advpVar, "Failed retrieve RCS Configuration %s", th.getMessage());
                ((RcsEngineProxyImpl) this.a).onSimAbsentInternal();
                return;
            case 4:
                advr.h(advh.a, "failed to get User consent with cause %s", th.getMessage());
                return;
            case 5:
                ((alvg) ((alvg) ((alvg) aegy.a.i()).g(th)).h("com/google/android/libraries/communications/mobileconfiguration/api/MobileConfigurationApi$2", "onFailure", 218, "MobileConfigurationApi.java")).q((String) this.a);
                return;
            case 6:
                ((alvg) ((alvg) ((alvg) aeha.a.i()).g(th)).h("com/google/android/libraries/communications/mobileconfiguration/api/accessor/MobileConfigurationAccessor$1", "onFailure", 110, "MobileConfigurationAccessor.java")).q((String) this.a);
                return;
            case 7:
            case 8:
                return;
            case 9:
                ((agzo) this.a).a().execute(new agqd(th, 9));
                return;
            case 10:
                if (th instanceof CancellationException) {
                    ((alvg) ((alvg) ((alvg) aiea.a.h()).g(th)).h("com/google/android/libraries/privatetelemetry/mobalt/impl/MobaltPeriodicJobImpl$LogUploaderFinishCallback", "onFailure", (char) 193, "MobaltPeriodicJobImpl.java")).q("Mobalt: cancelled sending logs to the Cobalt Server");
                    aiea aieaVar = (aiea) this.a;
                    aieaVar.o.B(aieaVar.c, (int) aieaVar.d, "CANCELLED");
                    return;
                }
                ((alvg) ((alvg) ((alvg) aiea.a.h()).g(th)).h("com/google/android/libraries/privatetelemetry/mobalt/impl/MobaltPeriodicJobImpl$LogUploaderFinishCallback", "onFailure", (char) 198, "MobaltPeriodicJobImpl.java")).q("Mobalt: failed sending logs to the Cobalt Server");
                aiea aieaVar2 = (aiea) this.a;
                aieaVar2.o.B(aieaVar2.c, (int) aieaVar2.d, "FAILURE");
                return;
            case 11:
                Log.e("BrowseStickerPacksView", "Error fetching sticker packs", th);
                Object obj2 = this.a;
                if (((aiqr) obj2).b != null) {
                    Snackbar.p((View) obj2, R.string.get_sticker_packs_error_msg, -1).i();
                }
                ((aiqr) this.a).a();
                StickerGalleryActivity stickerGalleryActivity = ((aiqr) this.a).b;
                if (stickerGalleryActivity != null) {
                    stickerGalleryActivity.A();
                    return;
                }
                return;
            case 12:
                Log.e("FavoriteStickerPacksAda", "Failed to fetch sticker pack by pack name", th);
                return;
            case 13:
                Log.e("FavoritePacksViewContr", "Error determine whether to show stickers favorites prompt", th);
                return;
            case 14:
                Log.e("FavoritePacksViewContr", "Error fetching favorite sticker packs", th);
                return;
            case 15:
                if (th instanceof CancellationException) {
                    return;
                }
                Log.w("SearchStickerController", "Search failed", th);
                ((airc) this.a).a.m(Collections.emptyList());
                airc aircVar = (airc) this.a;
                aircVar.e.d(aircVar.d);
                ((airc) this.a).f.A();
                return;
            case 16:
                boolean z = th instanceof CancellationException;
                Object obj3 = this.a;
                if (z) {
                    Log.d("MetadataFetcher", "load() cancelled for cache key ".concat(String.valueOf(((airk) obj3).d)));
                } else {
                    Log.w("MetadataFetcher", "load() failed for cache key ".concat(String.valueOf(((airk) obj3).d)), th);
                }
                synchronized (((airk) obj3).a) {
                    ((airk) obj3).f = null;
                }
                return;
            case 17:
            case 18:
                return;
            case 19:
                ((alwl) ((alwl) ((alwl) ajca.a.i()).g(th)).h("com/google/android/libraries/tachyon/countrycode/CountryCodeFragment$1", "onFailure", 'f', "CountryCodeFragment.java")).q("Failed to load list of countries.");
                return;
            default:
                ((ance) this.a).setException(th);
                return;
        }
    }

    @Override // defpackage.andy
    public final /* synthetic */ void b(Object obj) {
        advp advpVar;
        advp advpVar2;
        switch (this.b) {
            case 0:
                ((adny) ((adnx) this.a).a).a((apkc) obj);
                return;
            case 1:
                Object obj2 = this.a;
                advp advpVar3 = adeg.a;
                wda wdaVar = ((wdl) obj2).f;
                if (wdaVar == null) {
                    wdaVar = wda.a;
                }
                advr.l(advpVar3, "[%s] Notification completed.", wdaVar.c);
                return;
            case 2:
                ((adny) this.a).a((apkc) obj);
                return;
            case 3:
                if (((Configuration) obj).m()) {
                    advpVar2 = ((RcsEngineProxyImpl) this.a).B;
                    advr.l(advpVar2, "Ignoring SIM removed, since we have valid RCS config", new Object[0]);
                    return;
                } else {
                    advpVar = ((RcsEngineProxyImpl) this.a).B;
                    advr.l(advpVar, "Handling SIM removed", new Object[0]);
                    ((RcsEngineProxyImpl) this.a).onSimAbsentInternal();
                    return;
                }
            case 4:
                adjw adjwVar = (adjw) obj;
                if (adjwVar == null) {
                    return;
                }
                if (adjwVar.b()) {
                    ((abno) this.a).c();
                    return;
                } else {
                    advr.d(advh.a, "skipped logging metric due to user logging consent preferences", new Object[0]);
                    return;
                }
            case 5:
                return;
            case 6:
                return;
            case 7:
                alog alogVar = (alog) obj;
                agvr agvrVar = ((agvz) ((agvu) this.a).a).y;
                if (agvrVar != null) {
                    agvrVar.K(alogVar);
                    return;
                }
                return;
            case 8:
                alog alogVar2 = (alog) obj;
                agvr agvrVar2 = ((agvz) this.a).y;
                if (agvrVar2 != null) {
                    agvrVar2.K(alogVar2);
                    return;
                }
                return;
            case 9:
                return;
            case 10:
                ((alvg) ((alvg) aiea.a.g()).h("com/google/android/libraries/privatetelemetry/mobalt/impl/MobaltPeriodicJobImpl$LogUploaderFinishCallback", "onSuccess", 205, "MobaltPeriodicJobImpl.java")).q("Mobalt: finish sending logs to the Cobalt Server successfully");
                aiea aieaVar = (aiea) this.a;
                aieaVar.o.B(aieaVar.c, (int) aieaVar.d, "SUCCESS");
                return;
            case 11:
                aiqq aiqqVar = ((aiqr) this.a).a;
                aiqqVar.e.clear();
                for (aova aovaVar : (List) obj) {
                    int aT = a.aT(aovaVar.c);
                    if (aT == 0) {
                        aT = 1;
                    }
                    if (aT - 2 == 1) {
                        aiqqVar.e.add(aovaVar);
                    } else {
                        throw new IllegalStateException("Loaded pack type should be Regular.");
                    }
                }
                if (aiqqVar.d) {
                    aiqqVar.e.add(aiqq.c);
                }
                aiqqVar.p();
                ((aiqr) this.a).a();
                return;
            case 12:
                aova aovaVar2 = (aova) obj;
                if (((aiqu) this.a).d.contains(aovaVar2.b)) {
                    ((aiqu) this.a).d.remove(aovaVar2.b);
                    ArrayList arrayList = new ArrayList();
                    for (aova aovaVar3 : ((aiqu) this.a).e) {
                        if (!((aiqu) this.a).d.contains(aovaVar3.b)) {
                            arrayList.add(aovaVar3.b);
                        }
                    }
                    ((agcp) ((aiqu) this.a).h.k).y(arrayList);
                    Object obj3 = this.a;
                    ((no) obj3).q(((aiqu) obj3).e.indexOf(aovaVar2));
                    return;
                }
                ((aiqu) this.a).e.add(aovaVar2);
                ((no) this.a).s(((aiqu) r6).e.size() - 1);
                return;
            case 13:
                Boolean bool = (Boolean) obj;
                aiqz aiqzVar = ((aira) this.a).d;
                if (aiqzVar != null && bool.booleanValue() && aiqzVar.e.getVisibility() != 0) {
                    aiqzVar.f.setVisibility(0);
                    return;
                }
                return;
            case 14:
                List list = (List) obj;
                aiqz aiqzVar2 = ((aira) this.a).d;
                if (aiqzVar2 != null) {
                    aiqu aiquVar = aiqzVar2.g;
                    aiquVar.e.clear();
                    aiquVar.e.addAll(list);
                    aiquVar.d.clear();
                    aiquVar.p();
                    if (list.isEmpty()) {
                        aiqzVar2.f();
                        return;
                    } else {
                        aiqzVar2.d();
                        return;
                    }
                }
                return;
            case 15:
                aoux aouxVar = (aoux) obj;
                if (aouxVar.b.size() > 0) {
                    ((airc) this.a).a.m(aouxVar.b);
                    airg airgVar = ((airc) this.a).e;
                    airgVar.f.setVisibility(0);
                    airgVar.g.setVisibility(8);
                    airgVar.h.setVisibility(8);
                    airgVar.i.setVisibility(8);
                    return;
                }
                ((airc) this.a).a.m(Collections.emptyList());
                airc aircVar = (airc) this.a;
                aircVar.e.d(aircVar.d);
                return;
            case 16:
                Log.d("MetadataFetcher", "load() succeeded with cache key ".concat(String.valueOf(((airk) this.a).d)));
                return;
            case 17:
                new File(((aixj) this.a).b.getDatabasePath((String) obj).getPath().concat(".bak")).delete();
                return;
            case 18:
                if (!new File(((SQLiteDatabase) obj).getPath()).exists()) {
                    synchronized (((aixj) this.a).h) {
                        ((aixj) this.a).d();
                    }
                    return;
                }
                return;
            case 19:
                List list2 = (List) obj;
                cj fe = ((ajca) this.a).fe();
                if (fe != null) {
                    fe.runOnUiThread(new ahnu(this, list2, 20, null));
                    return;
                }
                return;
            default:
                ((ance) this.a).set((alcc) obj);
                return;
        }
    }

    public adnx(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
