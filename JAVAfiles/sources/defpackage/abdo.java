package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.google.android.apps.messaging.wearable.WearableBindService;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.libraries.performance.primes.transmitter.LifeboatReceiver;
import j$.nio.file.Files;
import j$.nio.file.StandardCopyOption;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class abdo implements algk {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ abdo(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [j$.nio.file.Path, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [algk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v54, types: [agnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v70, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        acld acldVar;
        InputStream inputStream;
        switch (this.c) {
            case 0:
                WearableBindService wearableBindService = (WearableBindService) this.a;
                boolean h = ((yjf) wearableBindService.j.b()).h();
                alwl alwlVar = (alwl) WearableBindService.a.g();
                alwlVar.X(ydl.M, "WearableBindService");
                alwl alwlVar2 = (alwl) alwlVar.h("com/google/android/apps/messaging/wearable/WearableBindService", "onMessageReceivedInner", 416, "WearableBindService.java");
                MessageEventParcelable messageEventParcelable = (MessageEventParcelable) this.b;
                String str = messageEventParcelable.b;
                alwlVar2.E("#onMessageReceived path: %s, hasRequiredPermissions: %s", str, h);
                ((ywf) wearableBindService.r.b()).a(str);
                String h2 = yyb.h(ackf.c(messageEventParcelable.c), "39");
                ywh ywhVar = (ywh) wearableBindService.s.b();
                str.getClass();
                if (ywhVar.b()) {
                    ywh.d(ywhVar, 3, str, h2, ywh.b);
                }
                wearableBindService.e(str, ackf.c(messageEventParcelable.c), messageEventParcelable.d);
                return null;
            case 1:
                File file = (File) obj;
                Object obj2 = this.b;
                if (true == albo.ah((String) obj2)) {
                    obj2 = "png";
                }
                Object obj3 = this.a;
                Uri d = uhl.d((String) obj2, (Context) ((zoh) obj3).c);
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        Uri e = ydk.e((Context) ((zoh) obj3).c, fileInputStream, d);
                        fileInputStream.close();
                        if (e == null) {
                            return Uri.EMPTY;
                        }
                        return e;
                    } finally {
                    }
                } catch (IOException unused) {
                    return Uri.EMPTY;
                }
            case 2:
                acka ackaVar = (acka) obj;
                ?? r0 = this.b;
                Object obj4 = this.a;
                try {
                    acldVar = ackaVar.a;
                } catch (IOException e2) {
                    alwl alwlVar3 = (alwl) ((alwl) WearableBindService.a.i()).g(e2);
                    alwlVar3.X(ydl.M, "WearableBindService");
                    ((alwl) alwlVar3.h("com/google/android/apps/messaging/wearable/WearableBindService", "saveMediaFileToPath", 353, "WearableBindService.java")).t("Failed to get asset from %s. Sending voice message stopped.", r0);
                }
                if (!acldVar.c) {
                    if (acldVar.a == null) {
                        inputStream = null;
                    } else {
                        if (acldVar.b == null) {
                            acldVar.b = new ParcelFileDescriptor.AutoCloseInputStream(acldVar.a);
                        }
                        inputStream = acldVar.b;
                    }
                    try {
                        Files.copy(inputStream, r0, StandardCopyOption.REPLACE_EXISTING);
                        ((abrc) ((WearableBindService) obj4).e.b()).s(new Uri.Builder().scheme("wear").path("/bugle/attachments/").build());
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        return null;
                    } finally {
                    }
                }
                throw new IllegalStateException("Cannot access the input stream after release().");
            case 3:
                ((adka) this.a).g.d();
                return this.b;
            case 4:
                ((adlk) this.b).a.V(adjj.MSG_SET_CONSENT_API_SUCCESS, new adkb((wfo) this.a, (String) obj));
                return null;
            case 5:
                adlk adlkVar = (adlk) this.b;
                Exception exc = (Exception) obj;
                adlkVar.a.D.f(exc, "googleToSConsentApi.setConsent %s failed", this.a);
                adlkVar.a.V(adjj.MSG_SET_CONSENT_API_ERROR, exc);
                return null;
            case 6:
                apkc apkcVar = (apkc) obj;
                if ((apkcVar.b & 4) != 0) {
                    apkcVar = ((adnt) this.a).c(apkcVar);
                }
                aozy builder = apkcVar.toBuilder();
                aozy createBuilder = apjy.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                Object obj5 = this.b;
                apjy apjyVar = (apjy) createBuilder.b;
                apjyVar.c = ((apjx) obj5).y;
                apjyVar.b |= 1;
                apjy apjyVar2 = (apjy) createBuilder.s();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                apkc apkcVar2 = (apkc) builder.b;
                apjyVar2.getClass();
                apkcVar2.e = apjyVar2;
                apkcVar2.b |= 4;
                return (apkc) builder.s();
            case 7:
                apkc apkcVar3 = (apkc) obj;
                if (apkcVar3 != null) {
                    return (apkc) this.b.apply(apkcVar3);
                }
                advr.g("Failed to read RcsProvisioningProtoDataStorage for sim %s", advq.SIM_ID.c(((adnt) this.a).f));
                return null;
            case 8:
                ThreadLocal threadLocal = agoz.a;
                return ((agpw) obj).b((agpo) this.a, this.b);
            case 9:
                Object obj6 = this.a;
                Consumer consumer = ((agmc) obj6).e;
                if (consumer != null) {
                    consumer.q(Pair.create(this.b, obj6));
                }
                return null;
            case 10:
                return ((agpw) obj).b((agpo) this.a, this.b);
            case 11:
                return Integer.valueOf(((agpr) this.b).p(this.a));
            case 12:
                return ((ahny) this.a).b((asgz) this.b, (algw) obj);
            case 13:
                ((ahob) this.a).V((alog) this.b, (Void) obj);
                return null;
            case 14:
                apaa apaaVar = (apaa) ((ahsb) obj).toBuilder();
                if (!apaaVar.b.isMutable()) {
                    apaaVar.u();
                }
                Object obj7 = this.b;
                Object obj8 = this.a;
                ahsb ahsbVar = (ahsb) apaaVar.b;
                obj7.getClass();
                ahsbVar.c = (asjt) obj7;
                ahsbVar.b |= 1;
                ahsb ahsbVar2 = (ahsb) apaaVar.s();
                akkw akkwVar = (akkw) obj8;
                String[] strArr = {akkwVar.e.getClass().getName()};
                Intent intent = new Intent();
                Context context = (Context) akkwVar.d;
                intent.setComponent(new ComponentName(context, (Class<?>) LifeboatReceiver.class));
                intent.setPackage(context.getPackageName());
                intent.putExtra("Transmitters", strArr);
                intent.putExtra("MetricSnapshot", ahsbVar2.toByteArray());
                context.sendBroadcast(intent);
                return null;
            case 15:
                return (ahur) ((ahus) this.b).a.d.get(new algx((String) obj, ((abno) this.a).i));
            case 16:
                ahup ahupVar = (ahup) obj;
                ConcurrentMap concurrentMap = ahux.a;
                ahun ahunVar = ahun.a;
                apbo apboVar = ahupVar.b;
                Object obj9 = this.a;
                if (apboVar.containsKey(obj9)) {
                    ahunVar = (ahun) apboVar.get(obj9);
                }
                Object obj10 = this.b;
                aozy builder2 = ahunVar.toBuilder();
                if (!DesugarCollections.unmodifiableList(((ahun) builder2.b).c).contains(obj10)) {
                    builder2.at((String) obj10);
                }
                aozy builder3 = ahupVar.toBuilder();
                if (!builder2.b.isMutable()) {
                    builder2.u();
                }
                ahun ahunVar2 = (ahun) builder2.b;
                ahunVar2.b |= 1;
                ahunVar2.d = (String) obj10;
                builder3.au((String) obj9, (ahun) builder2.s());
                return (ahup) builder3.s();
            case 17:
                ajza ajzaVar = (ajza) obj;
                ajwt ajwtVar = ajzaVar.a;
                ajzb ajzbVar = ajzaVar.b;
                ajyz ajyzVar = (ajyz) this.b;
                albo.U(ajyzVar.a, "Trying to propagate AccountInfo for invalid account.");
                return new ajxc(ajwtVar, ajzbVar, ajyzVar, null, (ajxb) this.a);
            case 18:
                Object obj11 = this.a;
                Object obj12 = this.b;
                akrh e3 = aktp.e("AccountUiService useAccount");
                try {
                    ajxc ajxcVar = new ajxc((ajwt) obj11, ajzb.a, null, null, (ajxb) obj12);
                    e3.close();
                    return ajxcVar;
                } catch (Throwable th) {
                    try {
                        e3.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 19:
                alog alogVar = (alog) obj;
                int size = alogVar.size();
                for (int i = 0; i < size; i++) {
                    Object obj13 = this.a;
                    Object obj14 = this.b;
                    ajzb ajzbVar2 = (ajzb) alogVar.get(i);
                    albo.aa(((String) obj14).equals(ajzbVar2.i), "AccountProvider %s provides account(s) of different type from the declared one. Declared type: %s provided type: %s", obj13, obj14, ajzbVar2.i);
                }
                return alogVar;
            default:
                Iterator it = DesugarCollections.unmodifiableMap(((ajzw) obj).d).values().iterator();
                while (true) {
                    Object obj15 = this.a;
                    if (it.hasNext()) {
                        ajzz ajzzVar = (ajzz) it.next();
                        ajzb ajzbVar3 = ajzzVar.d;
                        if (ajzbVar3 == null) {
                            ajzbVar3 = ajzb.a;
                        }
                        if (ajzbVar3.i.equals(obj15)) {
                            ajzb ajzbVar4 = ajzzVar.d;
                            if (ajzbVar4 == null) {
                                ajzbVar4 = ajzb.a;
                            }
                            if (ajzbVar4.c.equals(this.b)) {
                                return ajwt.a(ajzzVar.c);
                            }
                        }
                    } else {
                        throw new ajzn("No account is found for ".concat((String) obj15));
                    }
                }
        }
    }

    public /* synthetic */ abdo(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ abdo(String str, int i) {
        this.c = i;
        this.a = str;
        this.b = "";
    }

    public /* synthetic */ abdo(String str, String str2, int i) {
        this.c = i;
        this.a = "pseudonymous";
        this.b = "pseudonymous";
    }
}
