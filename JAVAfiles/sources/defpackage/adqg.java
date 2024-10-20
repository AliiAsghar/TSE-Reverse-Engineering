package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import android.util.LruCache;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageNotification;
import com.google.android.rcs.client.messaging.data.TraceId;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Map;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adqg {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public adqg(aduu aduuVar, adih adihVar, adxs adxsVar) {
        this.b = new Object();
        this.c = aduuVar;
        this.a = adihVar;
        this.d = adxsVar;
    }

    public static void h(addo addoVar, wcs wcsVar) {
        wcu wcuVar;
        wcv wcvVar;
        wcw wcwVar;
        wcr wcrVar = addoVar.b;
        wbk wbkVar = wcrVar.e;
        if (wbkVar == null) {
            wbkVar = wbk.a;
        }
        wcy wcyVar = wbkVar.e;
        if (wcyVar == null) {
            wcyVar = wcy.a;
        }
        String str = wcyVar.c;
        apct apctVar = wcrVar.f;
        if (apctVar == null) {
            apctVar = apct.a;
        }
        Instant l = aotl.l(apctVar);
        apct apctVar2 = wcsVar.f;
        if (apctVar2 == null) {
            apctVar2 = apct.a;
        }
        long millis = Duration.between(l, aotl.l(apctVar2)).toMillis();
        int i = wcrVar.c;
        if (i == 2) {
            wcr wcrVar2 = addoVar.b;
            if (wcrVar2.c == 2) {
                wcvVar = (wcv) wcrVar2.d;
            } else {
                wcvVar = wcv.a;
            }
            wca wcaVar = wcvVar.e;
            if (wcaVar == null) {
                wcaVar = wca.b;
            }
            wda wdaVar = wcaVar.d;
            if (wdaVar == null) {
                wdaVar = wda.a;
            }
            String str2 = wdaVar.c;
            if (wcsVar.c == 2) {
                wcwVar = (wcw) wcsVar.d;
            } else {
                wcwVar = wcw.a;
            }
            wdf b = wdf.b(wcwVar.c);
            if (b == null) {
                b = wdf.RESPONSE_STATUS_UNKNOWN;
            }
            advr.k("[conversationId:%s, messageId:%s]: Notification for message failed permanently with result: %s, tries: %d, after: %d ms. Notification is removed from the queue.", str, str2, b, Integer.valueOf(wcrVar.h), Long.valueOf(millis));
            return;
        }
        if (i == 3) {
            if (wcsVar.c == 3) {
                wcuVar = (wcu) wcsVar.d;
            } else {
                wcuVar = wcu.a;
            }
            wdf b2 = wdf.b(wcuVar.c);
            if (b2 == null) {
                b2 = wdf.RESPONSE_STATUS_UNKNOWN;
            }
            advr.k("[conversationId:%s]: Notification for group failed permanently with result: %s, tries: %d, after: %d ms. Notification is removed from the queue.", str, b2, Integer.valueOf(wcrVar.h), Long.valueOf(millis));
        }
    }

    public static void i(addo addoVar, wcs wcsVar) {
        wcu wcuVar;
        wcv wcvVar;
        wcw wcwVar;
        wcr wcrVar = addoVar.b;
        wbk wbkVar = wcrVar.e;
        if (wbkVar == null) {
            wbkVar = wbk.a;
        }
        wcy wcyVar = wbkVar.e;
        if (wcyVar == null) {
            wcyVar = wcy.a;
        }
        String str = wcyVar.c;
        apct apctVar = wcrVar.f;
        if (apctVar == null) {
            apctVar = apct.a;
        }
        Instant l = aotl.l(apctVar);
        apct apctVar2 = wcsVar.f;
        if (apctVar2 == null) {
            apctVar2 = apct.a;
        }
        long millis = Duration.between(l, aotl.l(apctVar2)).toMillis();
        int i = wcrVar.c;
        if (i == 2) {
            wcr wcrVar2 = addoVar.b;
            if (wcrVar2.c == 2) {
                wcvVar = (wcv) wcrVar2.d;
            } else {
                wcvVar = wcv.a;
            }
            wca wcaVar = wcvVar.e;
            if (wcaVar == null) {
                wcaVar = wca.b;
            }
            wda wdaVar = wcaVar.d;
            if (wdaVar == null) {
                wdaVar = wda.a;
            }
            String str2 = wdaVar.c;
            if (wcsVar.c == 2) {
                wcwVar = (wcw) wcsVar.d;
            } else {
                wcwVar = wcw.a;
            }
            wdf b = wdf.b(wcwVar.c);
            if (b == null) {
                b = wdf.RESPONSE_STATUS_UNKNOWN;
            }
            advr.k("[conversationId:%s, messageId:%s]: Notification for message succeeded with result:  %s, tries: %d, after: %d ms", str, str2, b, Integer.valueOf(wcrVar.h), Long.valueOf(millis));
            return;
        }
        if (i == 3) {
            if (wcsVar.c == 3) {
                wcuVar = (wcu) wcsVar.d;
            } else {
                wcuVar = wcu.a;
            }
            wdf b2 = wdf.b(wcuVar.c);
            if (b2 == null) {
                b2 = wdf.RESPONSE_STATUS_UNKNOWN;
            }
            advr.k("[conversationId:%s]: Notification for group succeeded with result:  %s, tries: %d, after: %d ms", str, b2, Integer.valueOf(wcrVar.h), Long.valueOf(millis));
        }
    }

    public static String m(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public static String n(String str, String str2) {
        return a.co(str2, str, "|S|");
    }

    private static final String t(String str) {
        return String.valueOf(str).concat("|T|496232013492|GCM");
    }

    private static final String u(String str) {
        return String.valueOf(str).concat("|T-timestamp|496232013492|GCM");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    public final adxu a(String str, adxo adxoVar, adxn adxnVar) {
        adxu adxuVar = (adxu) this.b.b();
        adxt adxtVar = (adxt) this.c.b();
        adxtVar.a = adxoVar;
        adxuVar.b = adxtVar;
        adxuVar.c = adxnVar;
        adxuVar.d = new adxp(str);
        return adxuVar;
    }

    public final adoz b(String str, adoz adozVar) {
        for (adoz adozVar2 : ((ConcurrentHashMap) this.c).values()) {
            if (adozVar2 != adozVar && adwf.A(str, adozVar2.y())) {
                return adozVar2;
            }
        }
        return null;
    }

    public final List c(adou adouVar) {
        List list = (List) ((advn) this.d).get(adouVar);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    public final void d(adoz adozVar) {
        boolean remove;
        adou adouVar = adozVar.i;
        adouVar.getClass();
        advn advnVar = (advn) this.d;
        List list = (List) advnVar.get(adouVar);
        if (list != null) {
            boolean z = false;
            do {
                remove = list.remove(adozVar);
                z |= remove;
            } while (remove);
            if (list.size() == 0) {
                advnVar.remove(adouVar);
            }
            if (z) {
                return;
            }
        }
        advr.q("Unable to remove session: %s", adozVar);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, anen] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void e() {
        adrh adrhVar = (adrh) ((adov) this.c).a(adrh.class);
        if (Objects.isNull(adrhVar)) {
            advr.c("Skipping Chat API flag change detection: InstantMessagingService not configured.", new Object[0]);
        } else {
            albo.bR(anee.o(this.a.submit(new adhc(this, adrhVar, 2, null))), new adoa(0), this.a);
        }
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, aegu] */
    public final boolean f(TraceId traceId, Conversation conversation, Message message) {
        synchronized (this.b) {
            if (!albo.ah(message.h()) && ((LruCache) this.c).get(message.h()) != null) {
                advr.k("Messages queue: deduplicate message, messageId:{%s}, conversationId:{%s}.", message.h(), conversation.b());
                return false;
            }
            ((LruCache) this.c).put(message.h(), true);
            aoad e = MessageNotification.e();
            e.u(conversation);
            e.w(message);
            e.x(traceId);
            if (aczf.v()) {
                e.v(Instant.ofEpochMilli(this.a.a()));
            }
            this.d.add(e.t());
            advr.c("Messages queue: push operation, messageId:{%s}, conversationId:{%s}, queueSize:{%s}.", message.h(), conversation.b(), Integer.valueOf(this.d.size()));
            return true;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    public final ListenableFuture g(wcr wcrVar) {
        wbk wbkVar = wcrVar.e;
        if (wbkVar == null) {
            wbkVar = wbk.a;
        }
        wcy wcyVar = wbkVar.e;
        if (wcyVar == null) {
            wcyVar = wcy.a;
        }
        addm addmVar = (addm) Map.EL.computeIfAbsent(this.b, wcyVar.c, new aaky(this, 19));
        addo addoVar = new addo(wcrVar);
        addmVar.a.add(addoVar);
        addmVar.b();
        return addoVar.a;
    }

    public final void j() {
        synchronized (this.b) {
            ((aduu) this.c).m();
            ((Context) ((adih) this.a).b).deleteFile("capabilities-pidf.xml");
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [armf, java.lang.Object] */
    public final acsu k(acti actiVar, actk actkVar, actk actkVar2, armf armfVar, armf armfVar2, acsv acsvVar) {
        afxz afxzVar = (afxz) this.c.b();
        adea adeaVar = (adea) this.a.b();
        adqg adqgVar = (adqg) this.b.b();
        acob acobVar = (acob) this.d.b();
        actiVar.getClass();
        return new acsu(afxzVar, adeaVar, adqgVar, acobVar, actiVar, actkVar, actkVar2, armfVar, armfVar2, acsvVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.Map, java.lang.Object] */
    public final synchronized acbn l(String str) {
        acbn g;
        acbn acbnVar = (acbn) this.b.get(str);
        if (acbnVar != null) {
            return acbnVar;
        }
        try {
            Object obj = this.c;
            Object obj2 = this.a;
            g = ((abmt) obj).h((Context) obj2, str);
            if (g == null) {
                g = ((abmt) obj).g((Context) obj2, str);
            }
        } catch (acbo unused) {
            Log.w("InstanceID/Store", "Stored data is corrupt, generating new identity");
            acbm.a((Context) this.a, this);
            g = ((abmt) this.c).g((Context) this.a, str);
        }
        this.b.put(str, g);
        return g;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void o() {
        this.b.clear();
        File[] listFiles = abmt.i((Context) this.a).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.getName().startsWith("com.google.InstanceId")) {
                    file.delete();
                }
            }
        }
        this.d.edit().clear().commit();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized String p() {
        return this.d.getString("appVersion", null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized String q(String str) {
        return this.d.getString(t(str), null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized long r(String str) {
        return this.d.getLong(u(str), -1L);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void s(String str, String str2, String str3) {
        SharedPreferences.Editor edit = this.d.edit();
        edit.putString(t(str), str2);
        edit.putLong(u(str), System.currentTimeMillis());
        edit.putString("appVersion", str3);
        edit.commit();
    }

    public adqg(aduw aduwVar, anen anenVar, adba adbaVar, armf armfVar) {
        this.b = aduwVar;
        this.d = anenVar;
        this.c = adbaVar;
        this.a = armfVar;
    }

    public adqg(armf armfVar, armf armfVar2, armf armfVar3, adaz adazVar) {
        this.a = armfVar;
        this.b = armfVar2;
        this.c = armfVar3;
        this.d = adazVar;
    }

    public adqg(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, byte[] bArr) {
        this.c = armfVar;
        this.d = armfVar2;
        this.b = armfVar3;
        this.a = armfVar4;
    }

    public adqg(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, byte[] bArr, byte[] bArr2) {
        this.c = armfVar;
        this.a = armfVar2;
        this.b = armfVar3;
        this.d = armfVar4;
    }

    public adqg(aczs aczsVar) {
        this.a = aczsVar.f("download_timeout_seconds", 60);
        this.b = aczsVar.f("upload_timeout_seconds", 180);
        this.d = aczsVar.i("enable_domain_logging", false);
        this.c = aczsVar.i("enable_reconfiguration_on_forbidden", false);
    }

    public adqg(Context context) {
        abmt abmtVar = new abmt();
        this.b = new tm();
        this.a = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.d = sharedPreferences;
        this.c = abmtVar;
        File noBackupFilesDir = context.getNoBackupFilesDir();
        abmt abmtVar2 = accg.a;
        File file = new File(abmt.f(noBackupFilesDir, "com.google.android.gms.appid-no-backup"));
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || sharedPreferences.getAll().isEmpty()) {
                return;
            }
            Log.i("InstanceID/Store", "App restored, clearing state");
            Context context2 = context;
            acbm.a(context, this);
        } catch (IOException e) {
            if (Log.isLoggable("InstanceID/Store", 3)) {
                Log.d("InstanceID/Store", "Error creating file in no backup dir: ".concat(String.valueOf(e.getMessage())));
            }
        }
    }

    public adqg(aneo aneoVar, armf armfVar, aegu aeguVar) {
        this.b = new ConcurrentHashMap();
        this.a = aneoVar;
        this.d = armfVar;
        this.c = aeguVar;
    }

    public adqg(aegu aeguVar) {
        this.b = new Object();
        this.d = new ArrayDeque();
        this.c = new LruCache(((Integer) aczf.o().a.m.a()).intValue());
        this.a = aeguVar;
    }

    public adqg(adab adabVar) {
        this.a = adabVar.i("enable_sms_sharing", false);
        this.d = adabVar.i("force_env_support", false);
        this.c = adabVar.i("process_incoming_file_transfer_link", false);
        this.b = adabVar.i("process_incoming_geolocation_link", false);
    }

    public adqg(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        armfVar.getClass();
        this.d = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.a = armfVar3;
        armfVar4.getClass();
        this.c = armfVar4;
    }

    public adqg(adac adacVar) {
        this.c = adacVar.g("tls_socket_read_timeout_millis", 60000L);
        this.b = adacVar.h("tls_exclusively_enabled_protocols", "");
        this.a = adacVar.h("tls_explicitly_disabled_protocols", "");
        this.d = adacVar.h("tls_explicitly_disabled_ciphers", "");
    }

    public adqg(adov adovVar, aduw aduwVar, anen anenVar) {
        this.b = new AtomicReference(adob.UNKNOWN);
        this.c = adovVar;
        this.d = aduwVar;
        this.a = anenVar;
    }

    public adqg() {
        this.c = new ConcurrentHashMap();
        this.d = new advn();
        this.b = new Timer(true);
        this.a = new ConcurrentHashMap();
    }
}
