package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import com.android.vcard.VCardConstants;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.action.GenericWorkerQueueAction;
import com.google.android.apps.messaging.shared.notification2o.NotificationsReceiver;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gif.GifContentItem;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.List;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class isn implements andy {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public isn(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r11v14, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r11v19, types: [mbm, java.lang.Object] */
    @Override // defpackage.andy
    public final void a(Throwable th) {
        switch (this.b) {
            case 0:
                if (th instanceof CancellationException) {
                    return;
                } else {
                    throw new IllegalArgumentException("ensure loaded failed.", th);
                }
            case 1:
                ((fwv) this.a).a.b(new fwo("Asset loader error", th, 2000));
                return;
            case 2:
                koi.a.q("Fail to get phenotype flag for isShakeToReportEnabled");
                return;
            case 3:
                if (th instanceof abra) {
                    if (((lej) this.a).b) {
                        return;
                    }
                    lek.a.n("Failed to get place by calling ReverseGeocode", th);
                    synchronized (lek.b) {
                        aaue aaueVar = (aaue) ((lej) this.a).a.c.get();
                        if (aaueVar != null) {
                            aaueVar.c(null);
                        }
                    }
                    return;
                }
                throw new alia(th);
            case 4:
                mfo.a.q("Failed to get last search time from ProtoDataStore.");
                return;
            case 5:
                synchronized (GenericWorkerQueueAction.a) {
                }
                return;
            case 6:
                this.a.run();
                return;
            case 7:
                alvg alvgVar = (alvg) ((alvg) ujc.a.i()).g(th);
                alvgVar.X(new alvz(VCardConstants.PROPERTY_URL, Uri.class, false, false), this.a);
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/richcard/RichCardMediaDownloadServiceDownloader$2", "onFailure", 313, "RichCardMediaDownloadServiceDownloader.java")).q("RBM media has been downloaded.");
                return;
            case 8:
                this.a.c();
                return;
            case 9:
                ((alwl) ((alwl) ((alwl) vic.a.h()).g(th)).h("com/google/android/apps/messaging/shared/notification/BugleNotificationManagerImpl$3", "onFailure", (char) 744, "BugleNotificationManagerImpl.java")).q("Auto-moved spam creation future failed");
                return;
            case 10:
                alwl alwlVar = (alwl) NotificationsReceiver.a.g();
                alwlVar.X(vjh.p, this.a);
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationsReceiver$1", "onFailure", 160, "NotificationsReceiver.java")).q("Failed to run action callback");
                return;
            case 11:
                ((alwl) ((alwl) ((alwl) NotificationsReceiver.a.i()).g(th)).h("com/google/android/apps/messaging/shared/notification2o/NotificationsReceiver$2", "onFailure", (char) 266, "NotificationsReceiver.java")).q("Failed to run callback");
                return;
            case 12:
                th.getClass();
                ((alwl) ((alwl) wva.a.i()).g(th)).q("Failed to run migration");
                Object obj = this.a;
                synchronized (obj) {
                    ((wva) obj).j = null;
                }
                return;
            case 13:
                if (th instanceof aecp) {
                    yqm yqmVar = (yqm) ((yqn) this.a).f.b();
                    int i = ((aecp) th).a;
                    int i2 = i - 1;
                    if (i != 0) {
                        yqmVar.b(i2);
                    } else {
                        throw null;
                    }
                } else {
                    ((yqm) ((yqn) this.a).f.b()).b(-1);
                }
                synchronized (yqn.c) {
                    yqn.a.r("Failed to initialize MoiraiApi.", th);
                    Object obj2 = this.a;
                    ((yqn) obj2).k = ((xnv) ((yqn) obj2).i.b()).f().toEpochMilli() + Math.round(((Integer) yqo.a.e()).intValue() * Math.pow(((Integer) yqo.b.e()).intValue(), ((yqn) obj2).j - 1));
                }
                boolean andSet = ((yqn) this.a).h.getAndSet(true);
                if (((Boolean) yqn.b.e()).booleanValue() && !andSet) {
                    ((mgv) ((yqn) this.a).e.b()).c(new ahka("Moirai API initialized"));
                    return;
                }
                return;
            case 14:
                xzb.i("Bugle", th, "Failed to update media compression notification!");
                return;
            case 15:
                return;
            case 16:
                alvw h = aabd.a.h();
                h.X(alwp.a, "Bugle");
                ((alvg) ((alvg) ((alvg) h).g(th)).h("com/google/android/apps/messaging/ui/conversation/emoji/ResourceBasedEmojiVariantService$2", "onFailure", (char) 245, "ResourceBasedEmojiVariantService.java")).q("Failed to cache emoji variant preferences.");
                ((aabd) this.a).h = 4;
                return;
            case 17:
                aark.f((aark) this.a);
                return;
            case 18:
                ((aats) this.a).g(false);
                xzb.i("Bugle", th, "Failed to fetch recent gifs from database");
                aats aatsVar = (aats) this.a;
                if (aatsVar.r) {
                    aatsVar.i();
                } else {
                    aatsVar.a.L(amqf.FAILED_TO_LOAD);
                }
                ((aats) this.a).r = false;
                return;
            case 19:
                return;
            default:
                advr.h(acnu.a, "failed to get User consent with cause %s", th.getMessage());
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v77, types: [mbm, java.lang.Object] */
    @Override // defpackage.andy
    public final /* synthetic */ void b(Object obj) {
        eqn eqnVar;
        boolean hasGainmap;
        int i = 8;
        int i2 = 6;
        int i3 = 4;
        int i4 = 15;
        byte[] bArr = null;
        int i5 = 0;
        switch (this.b) {
            case 0:
                ((itb) this.a).aB = false;
                ((itb) this.a).ao.ao(0);
                return;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                ((fwv) this.a).d = 50;
                eqm eqmVar = new eqm();
                eqmVar.u = bitmap.getHeight();
                eqmVar.t = bitmap.getWidth();
                eqmVar.b("image/raw");
                eqmVar.A = eqd.b;
                eqn eqnVar2 = new eqn(eqmVar);
                try {
                    if (((fwv) this.a).b && eul.a >= 34) {
                        hasGainmap = bitmap.hasGainmap();
                        if (hasGainmap) {
                            eqm eqmVar2 = new eqm(eqnVar2);
                            eqmVar2.b("image/jpeg_r");
                            eqnVar = new eqn(eqmVar2);
                            ((fwv) this.a).a.d(eqnVar2, 2);
                            ((fwv) this.a).c.submit(new faq((Object) this, bitmap, eqnVar, i));
                            return;
                        }
                    }
                    ((fwv) this.a).a.d(eqnVar2, 2);
                    ((fwv) this.a).c.submit(new faq((Object) this, bitmap, eqnVar, i));
                    return;
                } catch (RuntimeException e) {
                    Object obj2 = this.a;
                    ((fwv) obj2).a.b(new fwo("Asset loader error", e, 1000));
                    return;
                }
                eqnVar = eqnVar2;
                break;
            case 2:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                koi koiVar = (koi) this.a;
                koiVar.g = booleanValue;
                if (booleanValue) {
                    koh kohVar = (koh) koiVar.b.b();
                    if (kohVar.g == null) {
                        koh.a.o("The device does not support accelerometer sensor.");
                    } else {
                        kohVar.j = kohVar.k.submit(new gvk(kohVar, i4));
                        aktp.aa(kohVar.j, new rgi(kohVar, 1), kohVar.k);
                    }
                    koh kohVar2 = (koh) ((koi) this.a).b.b();
                    kohVar2.i.add(this.a);
                    return;
                }
                return;
            case 3:
                Optional optional = (Optional) obj;
                if (((lej) this.a).b) {
                    return;
                }
                synchronized (lek.b) {
                    aaue aaueVar = (aaue) ((lej) this.a).a.c.get();
                    if (aaueVar != null) {
                        if (optional.isPresent()) {
                            aaueVar.c((aiba) optional.get());
                        } else {
                            aaueVar.c(null);
                            lek.a.m("ReverseGeocode: place is null");
                        }
                    }
                }
                return;
            case 4:
                Long l = (Long) obj;
                if (l == null) {
                    mfo.a.q("Last search time on ProtoDataStore is null.");
                    return;
                }
                abau abauVar = (abau) ((mfo) this.a).A.b();
                aozy createBuilder = ammk.a.createBuilder();
                long longValue = l.longValue();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ammk ammkVar = (ammk) createBuilder.b;
                ammkVar.b = 1 | ammkVar.b;
                ammkVar.c = longValue;
                aktp.ai(new aakf(abauVar, (ammk) createBuilder.s(), i2, bArr), abauVar.e).k(qjc.a(new pum(8)), andi.a);
                return;
            case 5:
                synchronized (GenericWorkerQueueAction.a) {
                }
                return;
            case 6:
                this.a.run();
                return;
            case 7:
                alvg alvgVar = (alvg) ujc.a.g();
                alvgVar.X(new alvz(VCardConstants.PROPERTY_URL, Uri.class, false, false), this.a);
                alvgVar.X(new alvz("destination", Uri.class, false, false), (Uri) obj);
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/richcard/RichCardMediaDownloadServiceDownloader$2", "onSuccess", 304, "RichCardMediaDownloadServiceDownloader.java")).q("RBM media has been downloaded.");
                return;
            case 8:
                this.a.c();
                return;
            case 9:
                vhv vhvVar = (vhv) obj;
                if (vhvVar != null) {
                    if (((vic) this.a).P(vhvVar)) {
                        ((ynf) ((vic) this.a).c.b()).b(xih.i);
                        return;
                    }
                    return;
                }
                ((alwl) ((alwl) vic.a.h()).h("com/google/android/apps/messaging/shared/notification/BugleNotificationManagerImpl$3", "onSuccess", 737, "BugleNotificationManagerImpl.java")).q("No notification created for Auto-moved spam");
                return;
            case 10:
                alwl alwlVar = (alwl) NotificationsReceiver.a.g();
                alwlVar.X(vjh.p, this.a);
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationsReceiver$1", "onSuccess", 152, "NotificationsReceiver.java")).q("Successfully run action callback");
                return;
            case 11:
                alwl alwlVar2 = (alwl) NotificationsReceiver.a.g();
                alwlVar2.X(vjh.o, this.a);
                ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/notification2o/NotificationsReceiver$2", "onSuccess", 261, "NotificationsReceiver.java")).q("Successfully run callback");
                return;
            case 12:
                ((apbt) obj).getClass();
                wva.a.m().q("Migration is done");
                return;
            case 13:
                yqn.a.o("MoiraiApi was initialized");
                synchronized (yqn.c) {
                    ((yqn) this.a).g = true;
                }
                if (((Boolean) yqn.b.e()).booleanValue()) {
                    ((mgv) ((yqn) this.a).e.b()).c(new ahka("Moirai API initialized"));
                    return;
                }
                return;
            case 14:
                Object obj3 = this.a;
                ((zop) obj3).q.post(new yar(obj3, (String) obj, i4, bArr));
                return;
            case 15:
                ((zqk) this.a).a.g(4);
                return;
            case 16:
                aaaw aaawVar = (aaaw) obj;
                if (aaawVar == null) {
                    alvw h = aabd.a.h();
                    h.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) h).h("com/google/android/apps/messaging/ui/conversation/emoji/ResourceBasedEmojiVariantService$2", "onSuccess", 230, "ResourceBasedEmojiVariantService.java")).q("Failed to cache emoji variant preferences. Preferences are null.");
                    return;
                }
                Object obj4 = this.a;
                ((aabd) obj4).f.putAll(DesugarCollections.unmodifiableMap(aaawVar.b));
                alvw d = aabd.a.d();
                d.X(alwp.a, "Bugle");
                ((alvg) ((alvg) d).h("com/google/android/apps/messaging/ui/conversation/emoji/ResourceBasedEmojiVariantService$2", "onSuccess", 238, "ResourceBasedEmojiVariantService.java")).q("Finished caching emoji variant preferences.");
                ((aabd) this.a).h = 3;
                return;
            case 17:
                Boolean bool = (Boolean) obj;
                if (((aark) this.a).e()) {
                    aark.f((aark) this.a);
                    return;
                }
                if (bool.booleanValue()) {
                    ((aark) this.a).c();
                } else {
                    ((aark) this.a).a();
                }
                aark.f((aark) this.a);
                return;
            case 18:
                List<tfr> list = (List) obj;
                ((aats) this.a).g(false);
                aatu aatuVar = ((aats) this.a).h;
                aatuVar.d.clear();
                for (tfr tfrVar : list) {
                    List list2 = aatuVar.d;
                    Uri h2 = tfrVar.h();
                    if (h2 != null) {
                        Uri k = tfrVar.k();
                        String l2 = tfrVar.l();
                        String m = tfrVar.m();
                        tfrVar.ao(i3, "width");
                        int i6 = tfrVar.e;
                        tfrVar.ao(5, "height");
                        list2.add(new GifContentItem(h2, h2, k, l2, m, "", i6, tfrVar.f));
                        i3 = 4;
                    } else {
                        throw new IllegalStateException("Received invalid content item null with URL");
                    }
                }
                aatuVar.c = true;
                aatuVar.p();
                if (((aats) this.a).r && list.isEmpty()) {
                    ((aats) this.a).i();
                } else {
                    Object obj5 = this.a;
                    ((aats) obj5).a.L(amqf.LOADED);
                }
                ((aats) this.a).r = false;
                return;
            case 19:
                if (!((Boolean) obj).booleanValue()) {
                    ((aats) this.a).h(true);
                    Object obj6 = this.a;
                    aats aatsVar = (aats) obj6;
                    if (aatsVar.m == null) {
                        ajgi ajgiVar = new ajgi(aatsVar.a);
                        ajgiVar.x(R.string.c2o_gif_no_connection_alert_title);
                        ajgiVar.m(R.string.c2o_gif_no_connection_alert_message);
                        ajgiVar.t(R.string.c2o_gif_error_alert_ok, new aajo(obj6, i2));
                        ajgiVar.r(new aatr(obj6, i5));
                        aatsVar.m = ajgiVar.create();
                    }
                    if (!aatsVar.m.isShowing()) {
                        aatsVar.m.show();
                    }
                    Object obj7 = this.a;
                    ((aats) obj7).a.L(amqf.FAILED_TO_LOAD);
                    return;
                }
                return;
            default:
                adjw adjwVar = (adjw) obj;
                if (adjwVar == null) {
                    return;
                }
                if (adjwVar.b()) {
                    ((abno) this.a).c();
                    return;
                } else {
                    advr.d(acnu.a, "skipped logging metric due to user logging consent preferences", new Object[0]);
                    return;
                }
        }
    }
}
