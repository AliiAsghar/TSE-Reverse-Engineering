package defpackage;

import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ung implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ung(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v63, types: [vrl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v81, types: [armf, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        agnw d;
        agnw d2;
        Object apply;
        Object apply2;
        Integer valueOf;
        Integer valueOf2;
        boolean test;
        int i = 19;
        int i2 = 3;
        byte[] bArr = null;
        boolean z = false;
        switch (this.c) {
            case 0:
                ((uni) this.a).b.set(this.b);
                return;
            case 1:
                shp shpVar = new shp(shr.a);
                shpVar.w("CmsDeletedMessagesBufferPersister#insertDeletedMessageEntry");
                if (shpVar.b().i() == ((ukv) this.b).d) {
                    shp shpVar2 = new shp(shr.a);
                    shpVar2.w("CmsDeletedMessagesBufferPersister#evictOldestMessageDeletedEntry#getEntry");
                    shpVar2.z((String) DesugarArrays.stream(new atkn[]{new atkn(shr.c.d, true)}).map(new sho(0 == true ? 1 : 0)).collect(Collectors.joining(", ")));
                    shpVar2.u(1);
                    shpVar2.q();
                    shk shkVar = (shk) shpVar2.b().m((agmh) shr.c.d);
                    try {
                        alob alobVar = new alob();
                        while (shkVar.moveToNext()) {
                            shkVar.f();
                            alobVar.h(Long.valueOf(shkVar.f()));
                        }
                        alog g = alobVar.g();
                        shkVar.close();
                        Long l = (Long) g.get(0);
                        shl shlVar = new shl();
                        shlVar.f("CmsDeletedMessagesBufferPersister#evictOldestMessageDeletedEntry#deleteEntry");
                        apply = new uje(l, 13).apply(new shq());
                        shlVar.a = new agpw((shq) apply);
                        shlVar.d();
                    } catch (Throwable th) {
                        try {
                            shkVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                shh a = ((shi) this.a).a(new shg(2));
                d = agnc.d("$primary");
                d2 = agnc.d("$primary");
                agnc.a(d2, "cms_deleted_messages_buffer", a, new ryu(d, i), new rug(a, 16));
                return;
            case 2:
                Object obj = this.b;
                obj.getClass();
                unj unjVar = (unj) this.a;
                upr uprVar = (upr) obj;
                uni a2 = unjVar.a(uprVar);
                unjVar.f(uprVar, upm.d());
                unjVar.e(uprVar.k());
                a2.b();
                a2.a();
                return;
            case 3:
                Object obj2 = this.b;
                obj2.getClass();
                Object obj3 = this.a;
                obj3.getClass();
                String o = ((upr) obj3).o();
                o.getClass();
                uqr uqrVar = ((uqo) obj2).b;
                synchronized (uqrVar.a) {
                    uqrVar.b.remove(o);
                    if (uqrVar.b.isEmpty()) {
                        arvv arvvVar = uqrVar.d;
                        if (arvvVar != null) {
                            arvvVar.T(arnb.a);
                        }
                        uqrVar.d = null;
                    }
                }
                return;
            case 4:
                sqn sqnVar = new sqn();
                sqnVar.aj("markFlaggedMessagesAsNotified");
                apply2 = new tux(this.b, this.a, 14, bArr).apply(new sqo());
                sqnVar.Z(new agpw((sqo) apply2));
                valueOf = Integer.valueOf(a.bp().c());
                int intValue = valueOf.intValue();
                valueOf2 = Integer.valueOf(a.bp().c());
                int intValue2 = valueOf2.intValue();
                if (intValue2 < 46030) {
                    agnc.t("flagged_message_notified", intValue2);
                }
                if (intValue >= 46030) {
                    sqnVar.a.put("flagged_message_notified", (Boolean) true);
                }
                sqnVar.a().e();
                return;
            case 5:
                uxv uxvVar = (uxv) this.b;
                aiut.b();
                szy szyVar = new szy();
                szyVar.f("ParentDisallowedConversationDatabaseOperations#markConversationsAsAllowed");
                tab tabVar = new tab();
                alob alobVar2 = new alob();
                uxr uxrVar = (uxr) this.a;
                Iterator it = uxrVar.b.iterator();
                while (it.hasNext()) {
                    alobVar2.h(String.valueOf(ruy.a((ConversationIdType) it.next())));
                }
                tabVar.U(new agmf("parent_disallowed_conversations.conversation_id", 3, tab.X(alobVar2.g()), true));
                szyVar.b(tabVar);
                szyVar.d();
                Set set = uxrVar.a;
                aiut.b();
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    lpg.y((ConversationIdType) it2.next());
                }
                return;
            case 6:
                ((mgv) ((uzv) this.a).e.b()).e((ahka) this.b);
                return;
            case 7:
                var varVar = (var) this.a;
                aegz aegzVar = (aegz) ((Optional) varVar.a.b()).get();
                String str = (String) this.b;
                Optional a3 = aegzVar.a(str);
                if (a3.isPresent()) {
                    varVar.g(str, (aotw) a3.get());
                }
                varVar.f(str);
                return;
            case 8:
                Object obj4 = this.a;
                int threadStatsTag = TrafficStats.getThreadStatsTag();
                TrafficStats.setThreadStatsTag(((vho) obj4).a());
                try {
                    this.b.run();
                    return;
                } finally {
                    TrafficStats.setThreadStatsTag(threadStatsTag);
                }
            case 9:
                if (!yhx.d) {
                    return;
                }
                vjy vjyVar = (vjy) this.a;
                String str2 = vjyVar.a;
                if (!TextUtils.isEmpty(str2)) {
                    vkl vklVar = (vkl) this.b;
                    if (!vklVar.h.isEmpty()) {
                        if (qrl.a()) {
                            z = ((Boolean) vjyVar.f.map(new vil(8)).orElse(false)).booleanValue();
                        }
                        ShortcutInfo a4 = ((xzu) vklVar.h.get()).a(vklVar.b, vjyVar.c, vjyVar.d, (msh) vjyVar.f.orElse(null), vjyVar.h, str2, vjyVar.g, z);
                        if (a4 == null) {
                            ((alwl) ((alwl) vkl.a.g()).h("com/google/android/apps/messaging/shared/notification2o/NotificationBuilder", "pushShortcutForConversation", 445, "NotificationBuilder.java")).q("Shortcut is null, not pushing shortcut");
                            return;
                        } else {
                            ead$$ExternalSyntheticApiModelOutline0.m343m(vklVar.b.getSystemService(ead$$ExternalSyntheticApiModelOutline0.m())).pushDynamicShortcut(a4);
                            return;
                        }
                    }
                }
                ((alwl) ((alwl) vkl.a.g()).h("com/google/android/apps/messaging/shared/notification2o/NotificationBuilder", "pushShortcutForConversation", 418, "NotificationBuilder.java")).q("Shortcut id is empty or util not present, not pushing shortcut");
                return;
            case 10:
                Toast.makeText((Context) this.a, (CharSequence) this.b, 1).show();
                return;
            case 11:
                ((vrj) this.a).e((vrk) this.b, false);
                return;
            case 12:
                ?? r0 = this.a;
                Object obj5 = this.b;
                akrh e = aktp.e("notifyListener");
                try {
                    r0.am((vrm) obj5);
                    e.close();
                    return;
                } catch (Throwable th3) {
                    try {
                        e.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            case 13:
                ((vrj) this.a).d((vrm) this.b);
                return;
            case 14:
                ((vrj) this.a).g((vrk) this.b);
                return;
            case 15:
                ((vrj) this.a).d((vrm) this.b);
                return;
            case 16:
                ((vrt) this.b).a((vrm) this.a);
                return;
            case 17:
                alwo alwoVar = vtx.a;
                Object obj6 = this.a;
                smr a5 = sni.a((ConversationIdType) obj6);
                if (a5 == null) {
                    return;
                }
                vtk a6 = a5.D().a();
                aluq listIterator = vtx.b.entrySet().listIterator();
                while (listIterator.hasNext()) {
                    Object obj7 = this.b;
                    Map.Entry entry = (Map.Entry) listIterator.next();
                    test = fo$$ExternalSyntheticApiModelOutline0.m394m(entry.getKey()).test(obj7);
                    if (test) {
                        a6.c((vtl) entry.getValue());
                    } else {
                        a6.b((vtl) entry.getValue());
                    }
                }
                sng sngVar = new sng();
                sngVar.aj("updateRcsGroupCapabilities");
                sngVar.X(new vte(obj6, i2));
                sngVar.J(a6.a());
                sngVar.a().e();
                return;
            case 18:
                ((vum) this.b).g.d((ConversationIdType) this.a);
                return;
            case 19:
                ((maq) ((zap) this.a).e.b()).j((amfq) ((apag) this.b).toBuilder());
                return;
            default:
                snf e2 = sni.e();
                e2.w("RcsGroupRecovery");
                smu smuVar = sni.c;
                e2.c(smuVar.a, smuVar.O, smuVar.ao, smuVar.N);
                BugleConversationId bugleConversationId = ((DefaultConversation) this.a).a;
                e2.h(new vte(bugleConversationId, i));
                alog t = e2.b().t();
                if (t.isEmpty()) {
                    ((alwl) vxa.a.m().h("com/google/android/apps/messaging/shared/rcs/groups/recovery/MapiRecoverDisabledRcsGroupConversationOpenedListener", "recoverRcsGroup", 76, "MapiRecoverDisabledRcsGroupConversationOpenedListener.java")).t("Recover disabled RCS group disabled because conversation[%s] does not exist.", bugleConversationId.b());
                    return;
                }
                smr smrVar = (smr) alzz.aP(t);
                if (!tvu.e(smrVar.h())) {
                    ((alwl) vxa.a.m().h("com/google/android/apps/messaging/shared/rcs/groups/recovery/MapiRecoverDisabledRcsGroupConversationOpenedListener", "recoverRcsGroup", 85, "MapiRecoverDisabledRcsGroupConversationOpenedListener.java")).D("Recover disabled RCS group disabled because conversation[%s][%s] is not a RCS group", bugleConversationId.b(), tvu.b(smrVar.h()));
                    return;
                } else {
                    ((vxa) this.b).b.a(smrVar.x(), smrVar.l(), smrVar.H());
                    return;
                }
        }
    }

    public /* synthetic */ ung(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
