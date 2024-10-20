package defpackage;

import android.database.sqlite.SQLiteConstraintException;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Map;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rwj {
    private static final alwo a = alwo.o("Bugle");
    private final armf b;
    private final armf c;
    private final armf d;

    public rwj(armf armfVar, armf armfVar2, armf armfVar3) {
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final alog a(MessageIdType messageIdType) {
        alog g;
        swi swiVar = new swi(swk.a);
        swiVar.w("getMessageSendReceiveAttemptForMessage");
        swiVar.c(new rwb(messageIdType, 13));
        swiVar.d(new atkn((agmh) swk.c.h));
        alog t = swiVar.b().t();
        if (t.isEmpty()) {
            g = alsx.a;
        } else {
            alob alobVar = new alob();
            int i = ((alsx) t).c;
            for (int i2 = 0; i2 < i; i2++) {
                swd swdVar = (swd) t.get(i2);
                swdVar.ao(4, "message_protocol");
                tqs tqsVar = swdVar.e;
                swdVar.ao(5, "current_sim_network_country");
                String str = swdVar.f;
                swdVar.ao(6, "current_sim_country");
                String str2 = swdVar.g;
                swdVar.ao(8, "settings_country");
                String str3 = swdVar.i;
                swdVar.ao(9, "default_sms_sim_country");
                String str4 = swdVar.j;
                swdVar.ao(10, "locale_country");
                String str5 = swdVar.k;
                swdVar.ao(11, "default_sms_sim_network_country");
                alobVar.h(new rwl(tqsVar, str, str2, str3, str4, str5, swdVar.l));
            }
            g = alobVar.g();
        }
        if (g.isEmpty()) {
            return alsx.a;
        }
        alob alobVar2 = new alob();
        int i3 = ((alsx) g).c;
        for (int i4 = 0; i4 < i3; i4++) {
            rwl rwlVar = (rwl) g.get(i4);
            alok alokVar = new alok();
            alokVar.h("CURRENT_SIM_NETWORK_COUNTRY", albo.ag(rwlVar.b));
            alokVar.h("CURRENT_SIM_COUNTRY", albo.ag(rwlVar.c));
            alokVar.h("SETTINGS_COUNTRY", albo.ag(rwlVar.d));
            alokVar.h("DEFAULT_SMS_SIM_COUNTRY", albo.ag(rwlVar.e));
            alokVar.h("LOCALE_COUNTRY", albo.ag(rwlVar.f));
            alokVar.h("DEFAULT_SMS_SIM_NETWORK_COUNTRY", albo.ag(rwlVar.g));
            alobVar2.h(new rwh(rwlVar.a, alokVar.b()));
        }
        return alobVar2.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map b(MessageIdType messageIdType) {
        Object apply;
        alog g;
        HashMap hashMap = new HashMap();
        swi swiVar = new swi(swk.a);
        swiVar.w("getAllDestinationsForMessage-messageSendReceiveAttempt");
        swiVar.c(new rwb(messageIdType, 14));
        swiVar.d(new atkn((agmh) swk.c.h));
        swiVar.u(1);
        swg swgVar = (swg) swiVar.b().m((agmh) swk.c.m);
        try {
            alob alobVar = new alob();
            while (swgVar.moveToNext()) {
                if (swgVar.p() != null) {
                    alobVar.h(swgVar.p());
                }
            }
            alog g2 = alobVar.g();
            swgVar.close();
            if (g2.isEmpty()) {
                g = alsx.a;
            } else {
                alob alobVar2 = new alob();
                UUID uuid = (UUID) g2.get(0);
                sug sugVar = new sug(sui.a);
                sugVar.w("getAllDestinationsForMessage-messageDestinations");
                apply = new rwb(uuid, 15).apply(new suh());
                sugVar.k(new agpw((suh) apply));
                alog t = sugVar.b().t();
                int i = ((alsx) t).c;
                for (int i2 = 0; i2 < i; i2++) {
                    suc sucVar = (suc) t.get(i2);
                    sucVar.ao(2, "message_destination_type");
                    tqk tqkVar = sucVar.c;
                    sucVar.ao(3, "message_destination_raw");
                    alobVar2.h(new rwk(tqkVar, sucVar.d));
                }
                g = alobVar2.g();
            }
            for (int i3 = 0; i3 < ((alsx) g).c; i3++) {
                rwk rwkVar = (rwk) g.get(i3);
                tqk tqkVar2 = rwkVar.a;
                Map.EL.putIfAbsent(hashMap, tqkVar2, new ArrayList());
                List list = (List) hashMap.get(tqkVar2);
                list.add(rwkVar.b);
                hashMap.put(tqkVar2, list);
            }
            return hashMap;
        } catch (Throwable th) {
            try {
                swgVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c(final UUID uuid, final MessageIdType messageIdType, final long j, final alog alogVar, final tqs tqsVar, int i) {
        if (messageIdType.a == -1) {
            alwl alwlVar = (alwl) a.i();
            alwlVar.X(ydl.a, messageIdType.toString());
            alwlVar.Z(alwk.FULL);
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/datamodel/data/message/MessageRecipientAuditor", "saveMessageRecipients", 164, "MessageRecipientAuditor.java")).q("Could not save receiving attempt - messageId was invalid");
            return;
        }
        final String n = ((yjy) this.d.b()).g().n();
        armf armfVar = ((yjy) this.d.b()).g().c;
        armfVar.getClass();
        final Optional ofNullable = Optional.ofNullable(albo.af(((yjo) armfVar.b()).b()));
        final ykb j2 = ((yjy) this.d.b()).j();
        final ykb h = ((yjy) this.d.b()).h(i);
        ((agnq) this.b.b()).e("ReceiveSmsMessageHelper#storeMessageSendingDetailsInBugle", new Runnable() { // from class: rwg
            @Override // java.lang.Runnable
            public final void run() {
                rwj.this.d(uuid, messageIdType, j, tqsVar, h, ofNullable, j2, n, alogVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void d(UUID uuid, MessageIdType messageIdType, long j, tqs tqsVar, ykb ykbVar, Optional optional, ykb ykbVar2, String str, alog alogVar) {
        agnw d;
        agnw d2;
        agnw d3;
        agnw d4;
        try {
            String r = ykbVar.r();
            String u = ykbVar.u();
            String str2 = (String) optional.orElse("");
            String u2 = ykbVar2.u();
            String ag = albo.ag(str);
            String r2 = ykbVar2.r();
            String[] strArr = swk.a;
            int i = svc.a;
            swe sweVar = new swe();
            sweVar.h(uuid);
            sweVar.j(messageIdType);
            sweVar.m(j);
            sweVar.k(1L);
            sweVar.n(tqsVar);
            sweVar.d(r);
            sweVar.c(u);
            sweVar.b("");
            sweVar.l(str2);
            sweVar.f(u2);
            sweVar.i(ag);
            sweVar.g(r2);
            sweVar.e("");
            swd a2 = sweVar.a(new svc(18));
            d = agnc.d("$primary");
            d2 = agnc.d("$primary");
            int i2 = 14;
            agnc.a(d2, "message_send_receive_attempt", a2, new spl(d, 14), new swb(0));
            alur it = alogVar.iterator();
            while (it.hasNext()) {
                rwi rwiVar = (rwi) it.next();
                tqk tqkVar = rwiVar.a;
                String str3 = rwiVar.b;
                tcs tcsVar = new tcs((byte[]) null);
                tcsVar.g(uuid);
                tcsVar.f(tqkVar);
                tcsVar.e(str3);
                suc d5 = tcsVar.d(new ssv(i2));
                d3 = agnc.d("$primary");
                d4 = agnc.d("$primary");
                agnc.a(d4, "message_destinations", d5, new spl(d3, 11), new smq(d5, 9));
                d5.ao(0, "_id");
                long j2 = d5.a;
            }
        } catch (SQLiteConstraintException unused) {
            alwl alwlVar = (alwl) a.i();
            alwlVar.X(ydl.a, messageIdType.toString());
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/datamodel/data/message/MessageRecipientAuditor", "saveMessageRecipients", 211, "MessageRecipientAuditor.java")).q("Could not save receiving attempt - SQLiteConstraintException was thrown");
        }
    }
}
