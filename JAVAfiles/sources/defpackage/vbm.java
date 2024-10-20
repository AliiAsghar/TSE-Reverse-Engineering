package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.io.ByteArrayOutputStream;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vbm {
    public static final alnr e;
    public static final alnr f;
    private final apwt A;
    private final Bitmap.CompressFormat B;
    private final armf D;
    private final armf E;
    private final armf F;
    private final ocr G;
    private final armf H;
    private final armf I;
    private ul J;
    private final lrf K;
    private final qya L;
    private final znj M;
    public final anen g;
    public final yfo h;
    public final apwt i;
    public final ydk j;
    public final vqu k;
    public final qsa l;
    private final Context o;
    private final anen p;
    private final apwt q;
    private final Optional r;
    private final xyt s;
    private final armf t;
    private final yjy u;
    private final nfx v;
    private final Optional w;
    private final armf y;
    private final trz z;
    public static final xze a = xze.g("BugleNetwork", "NetworkUtils");
    private static final alvi m = alvi.m("com/google/android/apps/messaging/shared/net/NetworkUtils");
    private static final utz n = uuh.e(uuh.b, "ditto_thumbnail_size", 100);
    static final utz b = uuh.e(uuh.b, "ditto_thumbnail_quality", 0);
    public static final utz c = uuh.e(uuh.b, "ditto_upload_thread_count", 3);
    public static final utz d = uuh.e(uuh.b, "ditto_download_thread_count", 5);
    private final Object C = new Object();
    private final alhr x = albo.D(new ubz(12));

    static {
        uuh.e(uuh.b, "ditto_last_fcm_downgrade_day_limit", 7);
        tqc tqcVar = tqc.UNARCHIVED;
        anft anftVar = anft.ACTIVE;
        tqc tqcVar2 = tqc.ARCHIVED;
        anft anftVar2 = anft.ARCHIVED;
        tqc tqcVar3 = tqc.KEEP_ARCHIVED;
        anft anftVar3 = anft.KEEP_ARCHIVED;
        tqc tqcVar4 = tqc.SPAM_FOLDER;
        anft anftVar4 = anft.SPAM_FOLDER;
        tqc tqcVar5 = tqc.BLOCKED_FOLDER;
        anft anftVar5 = anft.BLOCKED_FOLDER;
        tqc tqcVar6 = tqc.CROSS_COUNTRY_FOLDER;
        anft anftVar6 = anft.CROSS_COUNTRY_FOLDER;
        albo.v(tqcVar, anftVar);
        albo.v(tqcVar2, anftVar2);
        albo.v(tqcVar3, anftVar3);
        albo.v(tqcVar4, anftVar4);
        albo.v(tqcVar5, anftVar5);
        albo.v(tqcVar6, anftVar6);
        e = new alsw(new Object[]{tqcVar, anftVar, tqcVar2, anftVar2, tqcVar3, anftVar3, tqcVar4, anftVar4, tqcVar5, anftVar5, tqcVar6, anftVar6}, 6);
        alnp alnpVar = new alnp();
        alnpVar.c("image/jpeg", ange.IMAGE_JPEG);
        alnpVar.c("image/jpg", ange.IMAGE_JPG);
        alnpVar.c("image/png", ange.IMAGE_PNG);
        alnpVar.c("image/gif", ange.IMAGE_GIF);
        alnpVar.c("image/vnd.wap.wbmp", ange.IMAGE_WBMP);
        alnpVar.c("image/x-ms-bmp", ange.IMAGE_X_MS_BMP);
        alnpVar.c("video/mp4", ange.VIDEO_MP4);
        alnpVar.c("video/3gpp2", ange.VIDEO_3G2);
        alnpVar.c("video/3gpp", ange.VIDEO_3GPP);
        alnpVar.c("video/webm", ange.VIDEO_WEBM);
        alnpVar.c("video/x-matroska", ange.VIDEO_MKV);
        alnpVar.c("audio/aac", ange.AUDIO_AAC);
        alnpVar.c("audio/amr", ange.AUDIO_AMR);
        alnpVar.c("audio/mp3", ange.AUDIO_MP3);
        alnpVar.c("audio/mpeg", ange.AUDIO_MPEG);
        alnpVar.c("audio/mpg", ange.AUDIO_MPG);
        alnpVar.c("audio/mp4", ange.AUDIO_MP4);
        alnpVar.c("audio/mp4-latm", ange.AUDIO_MP4_LATM);
        alnpVar.c("audio/3gpp", ange.AUDIO_3GPP);
        alnpVar.c("application/ogg", ange.AUDIO_OGG);
        alnpVar.c("text/x-vCard".toLowerCase(Locale.US), ange.TEXT_VCARD);
        alnpVar.c("application/pdf", ange.APP_PDF);
        alnpVar.c("application/txt", ange.APP_TXT);
        alnpVar.c("application/html", ange.APP_HTML);
        alnpVar.c("application/msword", ange.APP_DOC);
        alnpVar.c("application/vnd.openxmlformats-officedocument.wordprocessingml.document", ange.APP_DOCX);
        alnpVar.c("application/vnd.openxmlformats-officedocument.presentationml.presentation", ange.APP_PPTX);
        alnpVar.c("application/vnd.ms-powerpoint", ange.APP_PPT);
        alnpVar.c("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", ange.APP_XLSX);
        alnpVar.c("application/vnd.ms-excel", ange.APP_XLS);
        alnpVar.c("application/vnd.android.package-archive", ange.APP_APK);
        alnpVar.c("application/zip", ange.APP_ZIP);
        alnpVar.c("application/java-archive", ange.APP_JAR);
        alnpVar.c("text/x-vCalendar", ange.CAL_TEXT_VCALENDAR);
        alnpVar.c("text/x-vcalendar", ange.CAL_TEXT_XVCALENDAR);
        alnpVar.c("text/calendar", ange.CAL_TEXT_CALENDAR);
        alnpVar.c("application/vcs", ange.CAL_APPLICATION_VCS);
        alnpVar.c("application/ics", ange.CAL_APPLICATION_ICS);
        alnpVar.c("application/hbs-vcs", ange.CAL_APPLICATION_HBSVCS);
        f = alnpVar.b();
    }

    public vbm(Context context, anen anenVar, anen anenVar2, yfo yfoVar, apwt apwtVar, apwt apwtVar2, Optional optional, qya qyaVar, xyt xytVar, ydk ydkVar, vqu vquVar, armf armfVar, yjy yjyVar, znj znjVar, nfx nfxVar, lrf lrfVar, Optional optional2, armf armfVar2, apwt apwtVar3, trz trzVar, qsa qsaVar, armf armfVar3, armf armfVar4, armf armfVar5, ocr ocrVar, armf armfVar6, armf armfVar7) {
        this.o = context;
        this.p = anenVar;
        this.g = anenVar2;
        this.h = yfoVar;
        this.q = apwtVar;
        this.i = apwtVar2;
        this.r = optional;
        this.L = qyaVar;
        this.s = xytVar;
        this.j = ydkVar;
        this.k = vquVar;
        this.t = armfVar;
        this.u = yjyVar;
        this.M = znjVar;
        this.v = nfxVar;
        this.K = lrfVar;
        this.w = optional2;
        this.A = apwtVar3;
        this.I = armfVar7;
        albo.D(new ubz(13));
        this.y = armfVar2;
        this.z = trzVar;
        this.D = armfVar3;
        this.F = armfVar5;
        this.B = Bitmap.CompressFormat.JPEG;
        context.getResources().getDimensionPixelSize(R.dimen.ditto_icon_size);
        this.l = qsaVar;
        this.E = armfVar4;
        this.G = ocrVar;
        this.H = armfVar6;
    }

    static aozb g(aozb aozbVar, rtq rtqVar) {
        d.t(!aozbVar.G(), "unencryptedData should not be null or empty");
        d.t(true, "keys should not be null");
        try {
            byte[] bArr = new byte[16];
            new SecureRandom().nextBytes(bArr);
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            byte[] bArr2 = rtqVar.d;
            bArr2.getClass();
            cipher.init(1, new SecretKeySpec(bArr2, "AES"), new IvParameterSpec(bArr));
            byte[] doFinal = cipher.doFinal(aozbVar.H());
            Mac mac = Mac.getInstance("HmacSHA256");
            byte[] bArr3 = rtqVar.e;
            bArr3.getClass();
            mac.init(new SecretKeySpec(bArr3, "HmacSHA256"));
            byte[] doFinal2 = mac.doFinal(albo.cE(doFinal, bArr));
            int length = doFinal2.length;
            xyl.a(length, 32);
            int length2 = doFinal.length;
            int i = length2 + 16;
            byte[] copyOf = Arrays.copyOf(doFinal, i + length);
            System.arraycopy(bArr, 0, copyOf, length2, 16);
            System.arraycopy(doFinal2, 0, copyOf, i, length);
            return aozb.w(copyOf);
        } catch (GeneralSecurityException e2) {
            a.n("Failed to encrypt request data", e2);
            throw e2;
        }
    }

    public static final aozb i(aozb aozbVar, aqfn aqfnVar) {
        rtq rtqVar;
        byte[] bArr;
        byte[] bArr2;
        if (aozbVar == null || aozbVar.G()) {
            return null;
        }
        String str = aqfnVar.c;
        synchronized (rtq.a) {
            if (str.equals(rtq.b)) {
                rtqVar = rtq.c;
            } else {
                rtqVar = null;
            }
        }
        if (rtqVar == null) {
            akrh e2 = aktp.e("DittoDesktops#getDesktopEncryptionKeys");
            try {
                soo a2 = sor.a();
                a2.w("getDesktopEncryptionKeys");
                a2.d(new tkg(aqfnVar, 17));
                sol solVar = (sol) a2.b().n();
                try {
                    if (solVar.moveToFirst()) {
                        rtq rtqVar2 = new rtq(solVar.x(), solVar.y());
                        solVar.close();
                        e2.close();
                        rtqVar = rtqVar2;
                    } else {
                        solVar.close();
                        e2.close();
                        rtqVar = null;
                    }
                    if (rtqVar != null) {
                        String str2 = aqfnVar.c;
                        synchronized (rtq.a) {
                            rtq.b = str2;
                            rtq.c = rtqVar;
                        }
                    }
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
        if (rtqVar != null && (bArr = rtqVar.d) != null && bArr.length == 32 && (bArr2 = rtqVar.e) != null && bArr2.length == 32) {
            return g(aozbVar, rtqVar);
        }
        a.o("No Ditto encryption key in database");
        return null;
    }

    private final angf m(rry rryVar, MessagePartCoreData messagePartCoreData, ange angeVar) {
        String lastPathSegment;
        Context context;
        aozy createBuilder = angf.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((angf) createBuilder.b).c = angeVar.a();
        String P = messagePartCoreData.P();
        if (!TextUtils.isEmpty(P) && !messagePartCoreData.aY()) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            angf angfVar = (angf) createBuilder.b;
            P.getClass();
            angfVar.d = P;
        }
        boolean aR = messagePartCoreData.aR();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((angf) createBuilder.b).i = aR;
        String S = messagePartCoreData.S();
        if (!TextUtils.isEmpty(S) && !messagePartCoreData.bb()) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            angf angfVar2 = (angf) createBuilder.b;
            S.getClass();
            angfVar2.j = S;
        }
        boolean aS = messagePartCoreData.aS();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((angf) createBuilder.b).k = aS;
        if (!TextUtils.isEmpty(messagePartCoreData.X())) {
            String X = messagePartCoreData.X();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            angf angfVar3 = (angf) createBuilder.b;
            X.getClass();
            angfVar3.e = X;
        } else {
            Uri v = messagePartCoreData.v();
            String str = "";
            if (v == null) {
                lastPathSegment = "";
            } else {
                lastPathSegment = v.getLastPathSegment();
            }
            if (!TextUtils.isEmpty(lastPathSegment)) {
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                angf angfVar4 = (angf) createBuilder.b;
                lastPathSegment.getClass();
                angfVar4.e = lastPathSegment;
            } else {
                Uri t = messagePartCoreData.t();
                if (t != null) {
                    str = t.getLastPathSegment();
                }
                if (!TextUtils.isEmpty(str)) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    angf angfVar5 = (angf) createBuilder.b;
                    str.getClass();
                    angfVar5.e = str;
                }
            }
        }
        if (uvl.n(messagePartCoreData.bF())) {
            byte[] bF = messagePartCoreData.bF();
            bF.getClass();
            aozb w = aozb.w(bF);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((angf) createBuilder.b).l = w;
        }
        if (uvl.n(messagePartCoreData.bE())) {
            byte[] bE = messagePartCoreData.bE();
            bE.getClass();
            aozb w2 = aozb.w(bE);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((angf) createBuilder.b).m = w2;
        }
        if (messagePartCoreData.bk() || messagePartCoreData.bz()) {
            int c2 = messagePartCoreData.c();
            int b2 = messagePartCoreData.b();
            Uri t2 = messagePartCoreData.t();
            if (messagePartCoreData.bk() && ((c2 < 0 || b2 < 0) && t2 != null)) {
                Rect g = this.h.g(t2, messagePartCoreData.U());
                int width = g.width();
                b2 = g.height();
                c2 = width;
            }
            if (c2 >= 0 && b2 >= 0) {
                aozy createBuilder2 = angu.a.createBuilder();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                long j = c2;
                apag apagVar = createBuilder2.b;
                ((angu) apagVar).b = j;
                if (!apagVar.isMutable()) {
                    createBuilder2.u();
                }
                ((angu) createBuilder2.b).c = b2;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                angf angfVar6 = (angf) createBuilder.b;
                angu anguVar = (angu) createBuilder2.s();
                anguVar.getClass();
                angfVar6.g = anguVar;
                angfVar6.b |= 1;
            }
            Uri t3 = messagePartCoreData.t();
            if (t3 == null) {
                t3 = messagePartCoreData.x();
            }
            aozb aozbVar = null;
            if (t3 != null) {
                int intValue = ((Integer) n.e()).intValue();
                hxa s = aktp.x(this.o).b().B(hpb.a).ac().b((hxc) new hxc().D(hts.a)).h(t3).s(intValue, intValue);
                try {
                    try {
                        Bitmap bitmap = (Bitmap) agkg.a(s);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        if (bitmap.compress(this.B, ((Integer) b.e()).intValue(), byteArrayOutputStream)) {
                            aozbVar = aozb.w(byteArrayOutputStream.toByteArray());
                        }
                        context = this.o;
                    } catch (InterruptedException | ExecutionException e2) {
                        a.r("exception getting thumbnail", e2);
                        context = this.o;
                    }
                    aktp.x(context).j(s);
                } catch (Throwable th) {
                    aktp.x(this.o).j(s);
                    throw th;
                }
            }
            if (aozbVar != null && aozbVar.d() > 0) {
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ((angf) createBuilder.b).h = aozbVar;
            }
        }
        if (messagePartCoreData.k() > -1) {
            long k = messagePartCoreData.k();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((angf) createBuilder.b).n = k;
        }
        if (messagePartCoreData.l() > 0) {
            long l = messagePartCoreData.l();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((angf) createBuilder.b).f = l;
        } else if (messagePartCoreData.p() > 0) {
            long p = messagePartCoreData.p();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((angf) createBuilder.b).f = p;
        } else if (rryVar.e.size() == 1) {
            long l2 = rryVar.l();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((angf) createBuilder.b).f = l2;
        }
        String U = messagePartCoreData.U();
        if (U != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((angf) createBuilder.b).o = U;
        }
        return (angf) createBuilder.s();
    }

    private final angz n(int i, String str) {
        ykb h = this.u.h(i);
        aozy createBuilder = angz.a.createBuilder();
        anha e2 = vht.e(i);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        angz angzVar = (angz) createBuilder.b;
        e2.getClass();
        angzVar.c = e2;
        boolean z = true;
        angzVar.b |= 1;
        if (i != this.u.c()) {
            z = false;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((angz) createBuilder.b).d = z;
        String f2 = vht.f(h.b());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        angz angzVar2 = (angz) createBuilder.b;
        f2.getClass();
        angzVar2.f = f2;
        int d2 = h.d();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((angz) createBuilder.b).g = d2;
        if (h.t() != null) {
            String t = h.t();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            angz angzVar3 = (angz) createBuilder.b;
            t.getClass();
            angzVar3.e = t;
        }
        angz angzVar4 = (angz) createBuilder.s();
        if (str == null) {
            return angzVar4;
        }
        aozy builder = angzVar4.toBuilder();
        if (!builder.b.isMutable()) {
            builder.u();
        }
        angz angzVar5 = (angz) builder.b;
        angzVar5.b |= 2;
        angzVar5.h = str;
        return (angz) builder.s();
    }

    final rsa a(ConversationIdType conversationIdType) {
        rsa rsaVar;
        rsa k;
        synchronized (this.C) {
            ul ulVar = this.J;
            if (ulVar != null) {
                rsaVar = (rsa) ulVar.b(conversationIdType);
            } else {
                rsaVar = null;
            }
        }
        if (rsaVar != null) {
            return rsaVar;
        }
        akrh e2 = aktp.e("NetworkUtils#getConversationParticipants_dsdrGroupsFlag");
        try {
            if (((okf) this.F.b()).a()) {
                k = this.L.k(alog.n(((rur) this.H.b()).f(conversationIdType)));
            } else {
                k = this.L.k(ush.i(conversationIdType).t());
            }
            e2.close();
            synchronized (this.C) {
                if (this.J == null) {
                    this.J = new ul(((Integer) trf.c.e()).intValue());
                }
            }
            return k;
        } catch (Throwable th) {
            try {
                e2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final akul b(rto rtoVar, alog alogVar) {
        akul ag;
        akul c2 = this.v.c(rtoVar.f());
        int i = 1;
        if (rtoVar.R()) {
            ag = aktp.ag(new vbb(4, false));
        } else if (rtoVar.G() == 2) {
            ag = aktp.ag(new vbb(4, false));
        } else if (rtoVar.G() == 1) {
            ag = aktp.ag(new vbb(3, false));
        } else if (rtoVar.G() == 0) {
            vqu vquVar = this.k;
            vquVar.getClass();
            ag = aktp.ai(new uvp(vquVar, 11), this.p).i(new vbl(this, rtoVar, i), this.g);
        } else {
            ag = aktp.ag(new vbb(3, false));
        }
        akul akulVar = ag;
        return aktp.ap(c2, akulVar).h(new kwr(this, rtoVar, alogVar, akulVar, c2, 3), this.p);
    }

    public final anfr c(ConversationIdType conversationIdType) {
        aozy createBuilder = anfr.a.createBuilder();
        String a2 = conversationIdType.a();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        a2.getClass();
        ((anfr) apagVar).c = a2;
        anft anftVar = anft.DELETED;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ((anfr) createBuilder.b).k = anftVar.a();
        return (anfr) createBuilder.s();
    }

    @Deprecated
    public final anfr d(rto rtoVar, alog alogVar) {
        vbb vbbVar;
        if (rtoVar.R()) {
            vbbVar = new vbb(4, false);
        } else if (rtoVar.G() == 2) {
            vbbVar = new vbb(4, false);
        } else {
            int i = 3;
            if (rtoVar.G() == 1) {
                vbbVar = new vbb(3, false);
            } else if (rtoVar.G() == 0) {
                if (!this.k.O()) {
                    vbbVar = new vbb(3, false);
                } else if (this.k.H()) {
                    vbbVar = new vbb(3, false);
                } else {
                    Optional n2 = rtoVar.n();
                    if (n2.isEmpty()) {
                        xyo e2 = a.e();
                        e2.H("Other participant normalized destination should not be empty for a 1-1 conversation.");
                        e2.z("conversation ID", rtoVar.L());
                        e2.q();
                        vbbVar = new vbb(3, false);
                    } else {
                        try {
                        } catch (psx e3) {
                            a.r("Capability lookup error for the recipient.", e3);
                        }
                        if (!((Boolean) ((psz) this.y.b()).g((msh) n2.get()).map(new vbi(i)).orElse(false)).booleanValue()) {
                            a.l("No RCS capabilities found on disk.");
                            vbbVar = new vbb(3, true);
                        } else {
                            vbbVar = new vbb(4, true);
                        }
                    }
                }
            } else {
                vbbVar = new vbb(3, false);
            }
        }
        return j(rtoVar, alogVar, vbbVar.a, Optional.empty());
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0301  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.angj e(defpackage.rry r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 2010
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vbm.e(rry, boolean):angj");
    }

    public final ango f(ParticipantsTable.BindData bindData, boolean z) {
        ProfilesTable.BindData bindData2;
        int i;
        d.t(!ryg.l(bindData), "Use getParticipantProtoFromSelfIdentity() for building self-identities");
        aozy createBuilder = angp.a.createBuilder();
        String M = bindData.M();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        angp angpVar = (angp) createBuilder.b;
        M.getClass();
        angpVar.d = M;
        String O = bindData.O();
        if (!TextUtils.isEmpty(O)) {
            if (true != vcp.j(bindData)) {
                i = 3;
            } else {
                i = 4;
            }
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((angp) createBuilder.b).b = a.an(i);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            angp angpVar2 = (angp) createBuilder.b;
            O.getClass();
            angpVar2.c = O;
        }
        int f2 = ((yje) this.t.b()).f(yyb.bz(bindData.O()));
        aozy createBuilder2 = ango.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        ango angoVar = (ango) createBuilder2.b;
        angp angpVar3 = (angp) createBuilder.s();
        angpVar3.getClass();
        angoVar.c = angpVar3;
        angoVar.b |= 1;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        ((ango) createBuilder2.b).g = false;
        String f3 = vht.f(f2);
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        ango angoVar2 = (ango) createBuilder2.b;
        f3.getClass();
        angoVar2.f = f3;
        anha e2 = vht.e(bindData.p());
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        ango angoVar3 = (ango) createBuilder2.b;
        e2.getClass();
        angoVar3.h = e2;
        angoVar3.b |= 4;
        int Z = a.Z(bindData.A().ordinal());
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        ((ango) createBuilder2.b).m = a.ak(Z);
        if (!TextUtils.isEmpty(bindData.J())) {
            String J = bindData.J();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            ango angoVar4 = (ango) createBuilder2.b;
            J.getClass();
            angoVar4.n = J;
        }
        if (((Boolean) this.D.b()).booleanValue()) {
            if (!bindData.as("profiles_table_join_tag")) {
                bindData2 = null;
            } else {
                bindData2 = (ProfilesTable.BindData) bindData.al("profiles_table_join_tag", ProfilesTable.BindData.class);
            }
            if (bindData2 != null) {
                aozy createBuilder3 = angr.a.createBuilder();
                if (!TextUtils.isEmpty(bindData2.l())) {
                    String l = bindData2.l();
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    angr angrVar = (angr) createBuilder3.b;
                    l.getClass();
                    angrVar.b = l;
                }
                if (!TextUtils.isEmpty(bindData2.m())) {
                    String m2 = bindData2.m();
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    angr angrVar2 = (angr) createBuilder3.b;
                    m2.getClass();
                    angrVar2.c = m2;
                }
                if (!TextUtils.isEmpty(bindData2.n())) {
                    String n2 = bindData2.n();
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    angr angrVar3 = (angr) createBuilder3.b;
                    n2.getClass();
                    angrVar3.d = n2;
                }
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                ango angoVar5 = (ango) createBuilder2.b;
                angr angrVar4 = (angr) createBuilder3.s();
                angrVar4.getClass();
                angoVar5.r = angrVar4;
                angoVar5.b |= 8;
            }
            Uri v = bindData.v();
            if (!TextUtils.isEmpty(bindData.N())) {
                String N = bindData.N();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                ango angoVar6 = (ango) createBuilder2.b;
                N.getClass();
                angoVar6.j = N;
            }
            if (v != null) {
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                ((ango) createBuilder2.b).t = true;
            }
        } else if (!TextUtils.isEmpty(bindData.N())) {
            String N2 = bindData.N();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            ango angoVar7 = (ango) createBuilder2.b;
            N2.getClass();
            angoVar7.j = N2;
            if (bindData.v() != null) {
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                ((ango) createBuilder2.b).t = true;
            }
        }
        if (!TextUtils.isEmpty(bindData.K())) {
            String K = bindData.K();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            ango angoVar8 = (ango) createBuilder2.b;
            K.getClass();
            angoVar8.d = K;
        }
        if (!TextUtils.isEmpty(bindData.L())) {
            String L = bindData.L();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            ango angoVar9 = (ango) createBuilder2.b;
            L.getClass();
            angoVar9.e = L;
        }
        boolean T = bindData.T();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        ((ango) createBuilder2.b).k = T;
        int m3 = bindData.m();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        ((ango) createBuilder2.b).l = m3;
        boolean R = bindData.R();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar = createBuilder2.b;
        ((ango) apagVar).o = R;
        if (!apagVar.isMutable()) {
            createBuilder2.u();
        }
        ((ango) createBuilder2.b).i = z;
        return (ango) createBuilder2.s();
    }

    public final boolean h() {
        return ((yaq) this.s.a()).m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:339:0x01eb, code lost:
    
        if (android.text.TextUtils.equals(r3, "EMERGENCY+SERVICE+PROVIDER+DEMO") == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0139, code lost:
    
        if (r20.C() == false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0645 A[Catch: all -> 0x07e6, TryCatch #0 {all -> 0x07e6, blocks: (B:206:0x063a, B:207:0x063f, B:209:0x0645, B:212:0x0655), top: B:205:0x063a }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0765 A[LOOP:5: B:243:0x06e2->B:250:0x0765, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0756 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.anfr j(defpackage.rto r20, defpackage.alog r21, int r22, j$.util.Optional r23) {
        /*
            Method dump skipped, instructions count: 2034
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vbm.j(rto, alog, int, j$.util.Optional):anfr");
    }

    public final ListenableFuture k(MessagePartCoreData messagePartCoreData, vba vbaVar) {
        xyo a2 = a.a();
        a2.H("Uploading attachment for part with current status (before upload):");
        a2.z("partId", messagePartCoreData.Z());
        a2.A("isBlobIdEmpty", TextUtils.isEmpty(messagePartCoreData.P()));
        a2.A("isBlobExpired", messagePartCoreData.aY());
        a2.y("BlobTimestamp", messagePartCoreData.d());
        a2.A("isCompressedBlobIdEmpty", TextUtils.isEmpty(messagePartCoreData.S()));
        a2.A("isCompressedBlobExpired", messagePartCoreData.bb());
        a2.y("compressedBlobTimestamp", messagePartCoreData.j());
        a2.q();
        if (vbaVar != null) {
            return aktp.Z(vbaVar.k(), new twe(this, messagePartCoreData, 20, null), (Executor) this.x.get());
        }
        return ancj.g(((vax) this.q.b()).q(), new vbl(this, messagePartCoreData, 0), (Executor) this.x.get());
    }

    public final ListenableFuture l(MessagePartCoreData messagePartCoreData, vba vbaVar) {
        if (vbaVar != null) {
            return aktp.Z(vbaVar.k(), new vbl(this, messagePartCoreData, 2), (Executor) this.x.get());
        }
        return ancj.g(((vax) this.q.b()).q(), new vbl(this, messagePartCoreData, 3), (Executor) this.x.get());
    }
}
