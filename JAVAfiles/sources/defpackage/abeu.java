package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.wearable.action.CheckWearableAppVersionAction;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abeu extends unp {
    public static final alwo a = alwo.o("BugleWearable");
    static final uuf b = uuh.e(uuh.b, "sync_data_to_wearable_app_backoff_duration_ms", 500);
    public final Context c;
    public final armf d;
    public final armf e;
    public final anen f;
    public final armf g;
    public final anen h;
    public final armf i;
    public final armf j;
    public final armf k;
    public final abrc l;
    private final armf m;
    private final armf n;
    private final armf o;
    private final armf p;
    private final armf q;
    private final armf r;
    private ahqq s;

    public abeu(Context context, abrc abrcVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, anen anenVar, anen anenVar2, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12) {
        this.c = context;
        this.l = abrcVar;
        this.d = armfVar;
        this.e = armfVar2;
        this.m = armfVar3;
        this.n = armfVar4;
        this.o = armfVar5;
        this.p = armfVar6;
        this.f = anenVar;
        this.g = armfVar7;
        this.h = anenVar2;
        this.i = armfVar8;
        this.j = armfVar9;
        this.q = armfVar10;
        this.r = armfVar11;
        this.k = armfVar12;
    }

    public static ahle j(abra abraVar) {
        return new ahlg(yzc.f(abraVar));
    }

    public static ahle k(abra abraVar) {
        return new ahlg(yzc.e(abraVar.a()));
    }

    public static void l(Throwable th, String str) {
        alwl alwlVar = (alwl) ((alwl) a.i()).g(th);
        alwlVar.X(ydl.M, "SyncDataToWearableAppHandler");
        ((alwl) alwlVar.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandler", "logWarning", 693, "SyncDataToWearableAppHandler.java")).q(str);
    }

    private final boolean o() {
        return ((aagg) this.p.b()).c();
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        une a2 = unf.a();
        a2.d = Duration.ofMillis(((Integer) b.e()).intValue());
        return a2.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("SyncDataToWearableAppHandler");
    }

    @Override // defpackage.unp
    public final /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        boolean z;
        int i;
        akrh e;
        alwo alwoVar = a;
        alwl alwlVar = (alwl) alwoVar.g();
        alwlVar.X(ydl.M, "SyncDataToWearableAppHandler");
        ((alwl) alwlVar.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandler", "processPendingWorkItemAsync", 223, "SyncDataToWearableAppHandler.java")).q("Start syncing data to wearable devices");
        this.s = ((ahqr) this.r.b()).d();
        if (!o()) {
            alwl alwlVar2 = (alwl) alwoVar.f();
            alwlVar2.X(ydl.M, "SyncDataToWearableAppHandler");
            ((alwl) alwlVar2.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandler", "processPendingWorkItemAsync", 232, "SyncDataToWearableAppHandler.java")).q("Skip wear sync as the watch is not connected");
            m(7, ahqp.CANCEL);
            return aktp.ag(upm.d());
        }
        Context context = this.c;
        akrh e2 = aktp.e("SyncDataToWearableAppHandler#isWearableAppInstalled");
        try {
            int i2 = 0;
            if (context.getSharedPreferences("watch_protocol_version_file", 0).getInt("watch_protocol_version_key", 0) > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                alwl alwlVar3 = (alwl) alwoVar.g();
                alwlVar3.X(ydl.M, "SyncDataToWearableAppHandler");
                ((alwl) alwlVar3.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandler", "isWearableAppInstalled", 666, "SyncDataToWearableAppHandler.java")).q("WATCH_VERSION_KEY is not saved to SharedPreferences.");
            }
            e2.close();
            if (!z) {
                CheckWearableAppVersionAction.h();
            }
            akrh e3 = aktp.e("SyncDataToWearableAppHandler#sendPhoneDataToWearable");
            try {
                boolean y = ((yjr) this.o.b()).y();
                boolean h = ((yjf) this.m.b()).h();
                if (h) {
                    i = (y ? 1 : 0) | 2;
                } else {
                    i = y ? 1 : 0;
                }
                acak o = acak.o("/bugle/phone_config/");
                Object obj = o.b;
                ((ackf) obj).i("1", (byte) i);
                ((ackf) obj).l("2", 8);
                ((ackf) obj).l("3", ((xbf) this.n.b()).a(-1).g());
                try {
                    e = aktp.e("SyncDataToWearableAppHandler#sendPhoneDataToWearable#putDataItem");
                } catch (IllegalArgumentException e4) {
                    l(e4, "Failed to sync phone config to data client.");
                }
                try {
                    this.l.t(o.n()).o(this.f, new mih(3));
                    e.close();
                    if (!y) {
                        alwl alwlVar4 = (alwl) alwoVar.g();
                        alwlVar4.X(ydl.M, "SyncDataToWearableAppHandler");
                        ((alwl) alwlVar4.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandler", "sendPhoneDataToWearable", 368, "SyncDataToWearableAppHandler.java")).q("Android Messages is not the default SMS app; skipping wearable sync.");
                    } else if (!h) {
                        alwl alwlVar5 = (alwl) alwoVar.g();
                        alwlVar5.X(ydl.M, "SyncDataToWearableAppHandler");
                        ((alwl) alwlVar5.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandler", "sendPhoneDataToWearable", 375, "SyncDataToWearableAppHandler.java")).q("Does not have minimum required permissions; skipping wearable sync.");
                    } else {
                        e3.close();
                        akrh e5 = aktp.e("SyncDataToWearableAppHandler#getPreviouslySyncedConversations");
                        try {
                            abrg abrgVar = this.l.i;
                            acky ackyVar = new acky(abrgVar);
                            abrgVar.b(ackyVar);
                            akul h2 = akul.g(agkx.f(abhg.n(ackyVar, new acle(0)))).h(new abes(i2), this.f);
                            e5.b(h2);
                            e5.close();
                            return h2.h(new algk() { // from class: abet
                                @Override // defpackage.algk
                                public final Object apply(Object obj2) {
                                    abeu abeuVar = abeu.this;
                                    Map map = (Map) obj2;
                                    akrh e6 = aktp.e("SyncDataToWearableAppHandler#diffPreviouslySyncedAndRecentConversations");
                                    try {
                                        ArrayList arrayList = new ArrayList();
                                        akrh e7 = aktp.e("SyncDataToWearableAppHandler#broadcastMostRecentListOfConversations");
                                        try {
                                            akul e8 = ((abdx) abeuVar.g.b()).c(arrayList).i(new yui(abeuVar, arrayList, 14), abeuVar.f).h(new zms(19), abeuVar.h).e(abra.class, new zms(20), abeuVar.h).e(Throwable.class, new abes(1), abeuVar.h);
                                            e7.b(e8);
                                            e8.k(qiu.b(), abeuVar.h);
                                            e7.close();
                                            if (((okf) abeuVar.j.b()).a()) {
                                                akrh e9 = aktp.e("SyncDataToWearableAppHandler#queryConversationsAndBroadcastV2");
                                                try {
                                                    saw c = sak.c();
                                                    c.b = true;
                                                    c.h = 20;
                                                    saf safVar = (saf) c.c().a().n();
                                                    try {
                                                        rru rruVar = (rru) abeuVar.e.b();
                                                        while (safVar.moveToNext()) {
                                                            rruVar.U(safVar);
                                                            if (!rruVar.R() && !rruVar.o().booleanValue() && (!((orj) abeuVar.k.b()).a() || !rruVar.p().booleanValue())) {
                                                                ConversationIdType L = rruVar.L();
                                                                acak o2 = acak.o(a.cr(L, "/bugle/conversations/"));
                                                                ackf ackfVar = (ackf) map.remove(L);
                                                                ArrayList arrayList2 = new ArrayList();
                                                                yvy yvyVar = (yvy) abeuVar.d.b();
                                                                Object obj3 = o2.b;
                                                                Context context2 = abeuVar.c;
                                                                akrh e10 = aktp.e("WearableConversationBuilder#buildV2");
                                                                try {
                                                                    rru rruVar2 = (rru) yvyVar.a.b();
                                                                    rruVar2.U(safVar);
                                                                    yvx b2 = yvyVar.b((ackf) obj3, ackfVar, arrayList2, context2, rruVar2);
                                                                    e10.close();
                                                                    if (!arrayList2.isEmpty()) {
                                                                        ((yvy) abeuVar.d.b()).d(abeuVar.c, b2, arrayList2);
                                                                    }
                                                                    abeuVar.n(L, o2);
                                                                } catch (Throwable th) {
                                                                    try {
                                                                        e10.close();
                                                                        throw th;
                                                                    } catch (Throwable th2) {
                                                                        th.addSuppressed(th2);
                                                                        throw th;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        safVar.close();
                                                        e9.close();
                                                    } finally {
                                                    }
                                                } finally {
                                                }
                                            } else {
                                                akrh e11 = aktp.e("SyncDataToWearableAppHandler#queryConversationsAndBroadcastV1");
                                                try {
                                                    saw c2 = sax.c();
                                                    c2.b = true;
                                                    c2.h = 20;
                                                    sar sarVar = (sar) c2.a().a().n();
                                                    try {
                                                        rru rruVar3 = (rru) abeuVar.e.b();
                                                        while (sarVar.moveToNext()) {
                                                            rruVar3.V(sarVar);
                                                            if (!rruVar3.R() && !rruVar3.o().booleanValue() && (!((orj) abeuVar.k.b()).a() || !rruVar3.p().booleanValue())) {
                                                                ConversationIdType L2 = rruVar3.L();
                                                                acak o3 = acak.o(a.cr(L2, "/bugle/conversations/"));
                                                                ackf ackfVar2 = (ackf) map.remove(L2);
                                                                ArrayList arrayList3 = new ArrayList();
                                                                yvy yvyVar2 = (yvy) abeuVar.d.b();
                                                                Object obj4 = o3.b;
                                                                Context context3 = abeuVar.c;
                                                                akrh e12 = aktp.e("WearableConversationBuilder#buildV1");
                                                                try {
                                                                    rru rruVar4 = (rru) yvyVar2.a.b();
                                                                    rruVar4.V(sarVar);
                                                                    yvx b3 = yvyVar2.b((ackf) obj4, ackfVar2, arrayList3, context3, rruVar4);
                                                                    e12.close();
                                                                    if (!arrayList3.isEmpty()) {
                                                                        ((yvy) abeuVar.d.b()).d(abeuVar.c, b3, arrayList3);
                                                                    }
                                                                    abeuVar.n(L2, o3);
                                                                } catch (Throwable th3) {
                                                                    try {
                                                                        e12.close();
                                                                        throw th3;
                                                                    } catch (Throwable th4) {
                                                                        th3.addSuppressed(th4);
                                                                        throw th3;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        sarVar.close();
                                                        e11.close();
                                                    } finally {
                                                    }
                                                } finally {
                                                    try {
                                                        e11.close();
                                                        throw th;
                                                    } catch (Throwable th5) {
                                                        th.addSuppressed(th5);
                                                    }
                                                }
                                            }
                                            e7 = aktp.e("SyncDataToWearableAppHandler#cleanupOlderConversations");
                                            try {
                                                for (ConversationIdType conversationIdType : map.keySet()) {
                                                    abeuVar.l.s(new Uri.Builder().scheme("wear").path("/bugle/conversations/" + String.valueOf(conversationIdType)).build());
                                                }
                                                e7.close();
                                                e6.close();
                                                return null;
                                            } finally {
                                            }
                                        } finally {
                                            try {
                                                e7.close();
                                                throw th;
                                            } catch (Throwable th6) {
                                                th.addSuppressed(th6);
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }, this.f).h(new aald(this, 14), andi.a).e(IllegalStateException.class, new aald(this, 15), andi.a).e(abra.class, new aald(this, 12), andi.a).e(Throwable.class, new aald(this, 13), andi.a);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    e3.close();
                    m(6, ahqp.CANCEL);
                    return aktp.ag(upm.d());
                } catch (Throwable th2) {
                    try {
                        e.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } finally {
                try {
                    e3.close();
                } catch (Throwable th4) {
                    th.addSuppressed(th4);
                }
            }
        } catch (Throwable th5) {
            try {
                e2.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }

    @Override // defpackage.unx
    public final apca e() {
        return und.a.getParserForType();
    }

    @Override // defpackage.unp, defpackage.unx
    public final String f() {
        return "wear_sync_queue";
    }

    @Override // defpackage.unp, defpackage.unx
    public final /* synthetic */ boolean h(apbt apbtVar) {
        boolean z;
        akrh e = aktp.e("SyncDataToWearableAppHandler#preflight");
        try {
            if (o()) {
                z = true;
            } else {
                alvw n = a.n();
                n.X(ydl.M, "SyncDataToWearableAppHandler");
                ((alwl) n.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandler", "preflight", 180, "SyncDataToWearableAppHandler.java")).q("Skipping sync to wear devices.");
                ((mbl) this.q.b()).e("Bugle.Wear.SyncRunOnPhone", 4);
                z = false;
            }
            e.close();
            return z;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void m(int i, ahqp ahqpVar) {
        akrh e = aktp.e("SyncDataToWearableAppHandler#logWearSyncMetrics");
        try {
            ((mbl) this.q.b()).e("Bugle.Wear.SyncRunOnPhone", i - 1);
            ahqr ahqrVar = (ahqr) this.r.b();
            ahqq ahqqVar = this.s;
            ahqqVar.getClass();
            ahqrVar.f(ahqqVar, abew.a, null, ahqpVar);
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void n(ConversationIdType conversationIdType, acak acakVar) {
        akrh e;
        akrh e2 = aktp.e("SyncDataToWearableAppHandler#executeDataClientRequest");
        try {
            if (((Boolean) ywi.b.e()).booleanValue()) {
                e = aktp.e("SyncDataToWearableAppHandler#executeDataClientRequest#deleteDataItems");
                try {
                    this.l.s(acak.o("/bugle/rpc/conversation_deleted/" + conversationIdType.a()).m());
                    e.close();
                } finally {
                }
            }
            e = aktp.e("SyncDataToWearableAppHandler#executeDataClientRequest#putDataItem");
            try {
                this.l.t(acakVar.n()).o(this.f, new ktn(conversationIdType, 5));
                e.close();
                e2.close();
            } finally {
            }
        } catch (Throwable th) {
            try {
                e2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
