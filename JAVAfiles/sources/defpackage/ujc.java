package defpackage;

import android.net.Uri;
import com.android.vcard.VCardConstants;
import com.google.android.apps.messaging.shared.api.messaging.message.BugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ujc implements uiz {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/richcard/RichCardMediaDownloadServiceDownloader");
    public final anen b;
    public final agnq c;
    public final obm d;
    public final uli e;
    private final anen f;
    private final anen g;
    private final uiy h;
    private final zai i;

    public ujc(uiy uiyVar, zai zaiVar, anen anenVar, anen anenVar2, anen anenVar3, uli uliVar, agnq agnqVar, obm obmVar) {
        this.h = uiyVar;
        this.i = zaiVar;
        this.f = anenVar;
        this.g = anenVar2;
        this.b = anenVar3;
        this.e = uliVar;
        this.c = agnqVar;
        this.d = obmVar;
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v7, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [armf, java.lang.Object] */
    private final Set c(ConversationIdType conversationIdType, BugleMessageId bugleMessageId, uji[] ujiVarArr) {
        Set<uji> O = alzz.O();
        Collections.addAll(O, ujiVarArr);
        String valueOf = String.valueOf(bugleMessageId.b());
        for (uji ujiVar : O) {
            if ((ujiVar instanceof ujh) && ((ujh) ujiVar).e.equals(valueOf)) {
                return O;
            }
        }
        alvg alvgVar = (alvg) a.g();
        alvgVar.X(ydl.p, conversationIdType);
        alvgVar.X(ydl.c, bugleMessageId);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/richcard/RichCardMediaDownloadServiceDownloader", "withDatabaseHandler", 287, "RichCardMediaDownloadServiceDownloader.java")).q("Adding database handler for downloaded media part.");
        zai zaiVar = this.i;
        MessageIdType c = bugleMessageId.c();
        anen anenVar = (anen) zaiVar.b.b();
        anenVar.getClass();
        agnq agnqVar = (agnq) zaiVar.a.b();
        agnqVar.getClass();
        ujg ujgVar = (ujg) zaiVar.d.b();
        ujgVar.getClass();
        obm obmVar = (obm) zaiVar.c.b();
        obmVar.getClass();
        conversationIdType.getClass();
        c.getClass();
        valueOf.getClass();
        O.add(new ujh(anenVar, zaiVar.e, agnqVar, ujgVar, obmVar, conversationIdType, c, valueOf));
        return O;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final void a(Uri uri) {
        alvg alvgVar = (alvg) a.g();
        boolean z = false;
        alvgVar.X(new alvz(VCardConstants.PROPERTY_URL, Uri.class, false, false), uri);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/richcard/RichCardMediaDownloadServiceDownloader", "cancelDownload", 210, "RichCardMediaDownloadServiceDownloader.java")).q("Cancelling a download.");
        uiy uiyVar = this.h;
        String str = (String) uiyVar.e.a.remove(uri);
        if (str != null) {
            Uri fromFile = Uri.fromFile(uiyVar.f.af(uiyVar.c, str));
            xyo c = uiy.a.c();
            c.H("Cancelling download");
            c.M(VCardConstants.PROPERTY_URL, uri);
            c.M("file", fromFile);
            c.q();
            uiyVar.d.e(fromFile.toString());
        } else {
            xyo c2 = uiy.a.c();
            c2.H("No download to cancel");
            c2.M(VCardConstants.PROPERTY_URL, uri);
            c2.q();
        }
        xyo c3 = uiy.a.c();
        c3.x("remainingDownloads", uiyVar.e.a.size());
        c3.q();
        if (str != null) {
            z = true;
        }
        aktp.aa(aktp.ag(Boolean.valueOf(z)), new vbr(this, uri, 1, null), this.f);
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final void b(ConversationIdType conversationIdType, BugleMessageId bugleMessageId, Uri uri, long j, uji... ujiVarArr) {
        algw i;
        Uri uri2;
        String str;
        ahio ahioVar;
        alog alogVar;
        String str2;
        aoyo aoyoVar;
        ujd ujdVar = (ujd) this.e.a.get(uri);
        if (ujdVar != null) {
            alvg alvgVar = (alvg) a.g();
            alvgVar.X(new alvz(VCardConstants.PROPERTY_URL, Uri.class, false, false), uri);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/richcard/RichCardMediaDownloadServiceDownloader", "downloadMediaAndUpdateMessagePart", 120, "RichCardMediaDownloadServiceDownloader.java")).q("Adding callback to existing download.");
            ujdVar.a(c(conversationIdType, bugleMessageId, ujiVarArr));
            return;
        }
        ujd ujdVar2 = new ujd(this.g, this.f);
        ujd ujdVar3 = (ujd) this.e.a.putIfAbsent(uri, ujdVar2);
        if (ujdVar3 != null) {
            alvg alvgVar2 = (alvg) a.g();
            alvgVar2.X(new alvz(VCardConstants.PROPERTY_URL, Uri.class, false, false), uri);
            ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/datamodel/richcard/RichCardMediaDownloadServiceDownloader", "downloadMediaAndUpdateMessagePart", 136, "RichCardMediaDownloadServiceDownloader.java")).q("Concurrent addition, adding callback to existing set of callbacks.");
            ujdVar3.a(c(conversationIdType, bugleMessageId, ujiVarArr));
            return;
        }
        alvg alvgVar3 = (alvg) a.g();
        alvgVar3.X(new alvz(VCardConstants.PROPERTY_URL, Uri.class, false, false), uri);
        alvgVar3.X(new alvz("numberOfAttachedCallbacks", Integer.class, false, false), Integer.valueOf(ujdVar2.b.size()));
        ((alvg) alvgVar3.h("com/google/android/apps/messaging/shared/datamodel/richcard/RichCardMediaDownloadServiceDownloader", "downloadMediaAndUpdateMessagePart", 148, "RichCardMediaDownloadServiceDownloader.java")).q("Creating a new ongoing download.");
        ujdVar2.a(c(conversationIdType, bugleMessageId, ujiVarArr));
        uiy uiyVar = this.h;
        int i2 = (int) j;
        String valueOf = String.valueOf(String.valueOf(UUID.randomUUID()));
        Object obj = uiyVar.f.c;
        ?? r3 = uiyVar.e.a;
        String concat = ((String) obj).concat(valueOf);
        String str3 = (String) r3.putIfAbsent(uri, concat);
        if (str3 != null) {
            concat = str3;
        }
        Uri.Builder builder = new Uri.Builder();
        wpp wppVar = uiyVar.f;
        Uri build = builder.authority((String) wppVar.b).scheme("content").appendPath(concat).build();
        File af = wppVar.af(uiyVar.c, concat);
        xyo c = uiy.a.c();
        c.H("Starting MDD download for");
        c.M(VCardConstants.PROPERTY_URL, uri);
        c.M("destinationFile", af);
        c.z("destinationUri", build);
        c.x("expectedSize", i2);
        c.x("remainingDownloads", uiyVar.e.a.size());
        c.q();
        xyo c2 = uiy.a.c();
        c2.H("Starting download...");
        c2.M(VCardConstants.PROPERTY_URL, uri);
        c2.q();
        byte[] bArr = null;
        try {
            Iterator it = ujdVar2.b.iterator();
            while (it.hasNext()) {
                ujdVar2.c(new ryv((uji) it.next(), uri, 17, bArr));
            }
        } catch (RuntimeException e) {
            xyo b = uiy.a.b();
            b.H("Callback error: #onStart");
            b.r(e);
        }
        uix uixVar = new uix(uiyVar, ujdVar2, uri, build, i2);
        ahiz ahizVar = new ahiz(null);
        ahizVar.e = -1;
        ahizVar.m = (byte) (ahizVar.m | 1);
        int i3 = alog.d;
        alog alogVar2 = alsx.a;
        if (alogVar2 != null) {
            ahizVar.f = alogVar2;
            ahizVar.a(0);
            ahizVar.b(true);
            aoyo aoyoVar2 = aoyo.a;
            if (aoyoVar2 != null) {
                ahizVar.l = aoyoVar2;
                Uri fromFile = Uri.fromFile(af);
                if (fromFile != null) {
                    ahizVar.a = fromFile;
                    String uri3 = uri.toString();
                    if (uri3 != null) {
                        ahizVar.b = uri3;
                        ahizVar.a(i2);
                        ahio ahioVar2 = ahio.b;
                        if (ahioVar2 != null) {
                            ahizVar.c = ahioVar2;
                            ahizVar.b(false);
                            ahizVar.d = algw.i(uixVar);
                            String str4 = ahizVar.h;
                            if (str4 == null) {
                                i = alfd.a;
                            } else {
                                i = algw.i(str4);
                            }
                            if (!i.f()) {
                                String str5 = ahizVar.b;
                                if (str5 != null) {
                                    ahizVar.h = str5;
                                } else {
                                    throw new IllegalStateException("Property \"urlToDownload\" has not been set");
                                }
                            }
                            if (ahizVar.m == 7 && (uri2 = ahizVar.a) != null && (str = ahizVar.b) != null && (ahioVar = ahizVar.c) != null && (alogVar = ahizVar.f) != null && (str2 = ahizVar.h) != null && (aoyoVar = ahizVar.l) != null) {
                                ahja ahjaVar = new ahja(uri2, str, ahioVar, ahizVar.d, ahizVar.e, alogVar, ahizVar.g, str2, ahizVar.i, ahizVar.j, ahizVar.k, aoyoVar);
                                adec adecVar = uiyVar.d;
                                ahiu.c("%s: download for Uri = %s", "DownloaderImp", ahjaVar.a.toString());
                                Uri uri4 = ahjaVar.a;
                                int i4 = ambp.a;
                                ambl f = ambn.a.f();
                                f.l(uri4.toString());
                                f.l("|");
                                ahit ahitVar = new ahit(f.q().toString());
                                akul i5 = akul.g(aktp.Z(adecVar.d(ahitVar.a), new xrd(adecVar, ahjaVar, ahitVar, 11), adecVar.d)).i(new tsz(build, 15), uiyVar.b);
                                byte[] bArr2 = null;
                                aktp.aa(i5.f(Exception.class, new twe(this, uri, 4, bArr2), this.f).h(new raw(this, uri, 16, bArr2), this.f), new isn(uri, 7), this.f);
                                return;
                            }
                            StringBuilder sb = new StringBuilder();
                            if (ahizVar.a == null) {
                                sb.append(" destinationFileUri");
                            }
                            if (ahizVar.b == null) {
                                sb.append(" urlToDownload");
                            }
                            if (ahizVar.c == null) {
                                sb.append(" downloadConstraints");
                            }
                            if ((ahizVar.m & 1) == 0) {
                                sb.append(" trafficTag");
                            }
                            if (ahizVar.f == null) {
                                sb.append(" extraHttpHeaders");
                            }
                            if ((ahizVar.m & 2) == 0) {
                                sb.append(" fileSizeBytes");
                            }
                            if (ahizVar.h == null) {
                                sb.append(" notificationContentTitle");
                            }
                            if ((ahizVar.m & 4) == 0) {
                                sb.append(" showDownloadedNotification");
                            }
                            if (ahizVar.l == null) {
                                sb.append(" customDownloaderMetadata");
                            }
                            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                        }
                        throw new NullPointerException("Null downloadConstraints");
                    }
                    throw new NullPointerException("Null urlToDownload");
                }
                throw new NullPointerException("Null destinationFileUri");
            }
            throw new NullPointerException("Null customDownloaderMetadata");
        }
        throw new NullPointerException("Null extraHttpHeaders");
    }
}
