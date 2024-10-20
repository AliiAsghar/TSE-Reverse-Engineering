package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.telephony.TelephonyManager;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.util.LruCache;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.DeviceData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.BackgroundLoadingMessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import com.google.android.rcs.client.profile.RcsProfileService;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ThreadLocalRandom;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mic implements mho {
    static final uuf f = uuh.q(147885739);
    static final uuf g = uuh.f(uuh.b, "compose_duration_logging_cap_millis", TimeUnit.SECONDS.toMillis(120));
    public static final alhr h = uuh.w("enable_sub_id_mismatch_logging");
    static final uuf i = uuh.i(uuh.b, "disable_logging_bugle_telephony_event", true);
    public static final long j = TimeUnit.DAYS.toMillis(1);
    public static final xze k = xze.g("BugleUsageStatistics", "UsageStatistics");
    public static final alvi l = alvi.m("com/google/android/apps/messaging/shared/analytics/statistics/UsageStatisticsImpl");
    public final anen A;
    public final Executor B;
    public akul C;
    public final armf E;
    public final armf F;
    public final armf G;
    public final armf H;
    public final armf I;
    public mbb J;
    public final hgj K;
    private final armf L;
    private final apwt M;
    private final armf N;
    private final armf O;
    private final armf P;
    private final armf Q;
    private final armf R;
    private final armf S;
    private final armf T;
    private final armf U;
    private final armf V;
    private final armf W;
    private final armf X;
    private final armf Y;
    private final armf Z;
    private final armf aa;
    private final armf ab;
    private final armf ac;
    private final apwt ad;
    private final apwt ae;
    private final anen af;
    private final armf ag;
    private final Context ah;
    private armf ai;
    private final aksr aj;
    private final apwt ak;
    private final armf al;
    private final armf am;
    private final armf an;
    private final orj ao;
    private final armf ap;
    private final armf aq;
    private final armf ar;
    private final armf as;
    private final armf at;
    private final armf au;
    private final armf av;
    private final armf aw;
    private final mgi ax;
    private final ibi ay;
    public final armf n;
    public final armf o;
    public final armf p;
    public final armf q;
    public final armf r;
    public final apwt s;
    public final apwt t;
    public final apwt u;
    public final xnv v;
    public final armf w;
    public maq x;
    public final apwt z;
    public final LruCache m = new LruCache(10);
    public final AtomicBoolean y = new AtomicBoolean(false);
    public final mgu D = new mgu();

    public mic(Context context, armf armfVar, armf armfVar2, apwt apwtVar, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14, armf armfVar15, armf armfVar16, apwt apwtVar2, apwt apwtVar3, armf armfVar17, armf armfVar18, armf armfVar19, armf armfVar20, armf armfVar21, apwt apwtVar4, armf armfVar22, armf armfVar23, xnv xnvVar, armf armfVar24, apwt apwtVar5, apwt apwtVar6, apwt apwtVar7, anen anenVar, anen anenVar2, aksr aksrVar, apwt apwtVar8, armf armfVar25, hgj hgjVar, armf armfVar26, armf armfVar27, ibi ibiVar, armf armfVar28, mgi mgiVar, armf armfVar29, armf armfVar30, orj orjVar, armf armfVar31, armf armfVar32, armf armfVar33, armf armfVar34, armf armfVar35, armf armfVar36, armf armfVar37, armf armfVar38, armf armfVar39, armf armfVar40, armf armfVar41) {
        this.ah = context;
        this.L = armfVar;
        this.n = armfVar2;
        this.M = apwtVar;
        this.o = armfVar3;
        this.N = armfVar4;
        this.p = armfVar5;
        this.O = armfVar6;
        this.R = armfVar9;
        this.P = armfVar7;
        this.Q = armfVar8;
        this.S = armfVar10;
        this.ai = armfVar11;
        this.T = armfVar12;
        this.U = armfVar13;
        this.V = armfVar14;
        this.q = armfVar15;
        this.r = armfVar16;
        this.s = apwtVar2;
        this.t = apwtVar3;
        this.W = armfVar17;
        this.X = armfVar18;
        this.Y = armfVar19;
        this.Z = armfVar20;
        this.aa = armfVar21;
        this.u = apwtVar4;
        this.ab = armfVar22;
        this.ac = armfVar23;
        this.v = xnvVar;
        this.w = armfVar24;
        this.ad = apwtVar5;
        this.ae = apwtVar6;
        this.z = apwtVar7;
        this.A = anenVar;
        this.af = anenVar2;
        this.aj = aksrVar;
        this.ak = apwtVar8;
        this.E = armfVar25;
        this.K = hgjVar;
        this.al = armfVar26;
        this.F = armfVar27;
        this.ay = ibiVar;
        this.B = new anew(anenVar);
        this.ag = armfVar28;
        this.ax = mgiVar;
        this.am = armfVar29;
        this.an = armfVar30;
        this.ao = orjVar;
        this.ap = armfVar31;
        this.G = armfVar32;
        this.aq = armfVar33;
        this.H = armfVar34;
        this.ar = armfVar35;
        this.as = armfVar36;
        this.at = armfVar37;
        this.au = armfVar38;
        this.I = armfVar39;
        this.av = armfVar40;
        this.aw = armfVar41;
    }

    private final void bA(int i2, int i3, int i4, long j2, int i5, int i6, long j3, boolean z, ConversationIdType conversationIdType) {
        amha amhaVar;
        if (!this.y.get()) {
            r();
            return;
        }
        aozy createBuilder = amje.a.createBuilder();
        int e = e();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amje amjeVar = (amje) createBuilder.b;
        amjeVar.b |= 1;
        amjeVar.c = e;
        String d = ((mie) this.F.b()).d();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amje amjeVar2 = (amje) createBuilder.b;
        d.getClass();
        amjeVar2.b |= 4;
        amjeVar2.e = d;
        amje amjeVar3 = (amje) createBuilder.s();
        amee t = ((lfl) this.r.b()).t(i2);
        amgz w = lgb.w(i3);
        amgl amglVar = (amgl) amgu.a.createBuilder();
        long a = ((lzz) this.q.b()).a(conversationIdType);
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar = (amgu) amglVar.b;
        amguVar.b |= 1073741824;
        amguVar.G = a;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar2 = (amgu) amglVar.b;
        amguVar2.b |= 128;
        amguVar2.n = j2;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar3 = (amgu) amglVar.b;
        amguVar3.g = 2;
        amguVar3.b |= 1;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar4 = (amgu) amglVar.b;
        amguVar4.h = 6;
        amguVar4.b = 2 | amguVar4.b;
        amhb x = ((lfl) this.s.b()).x(i2);
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar5 = (amgu) amglVar.b;
        amguVar5.i = x;
        amguVar5.b |= 4;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar6 = (amgu) amglVar.b;
        amguVar6.c |= 1;
        amguVar6.J = "NOT_AVAILABLE";
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar7 = (amgu) amglVar.b;
        amjeVar3.getClass();
        amguVar7.y = amjeVar3;
        amguVar7.b |= 4194304;
        int bs = bs(conversationIdType);
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar8 = (amgu) amglVar.b;
        amguVar8.x = bs - 1;
        amguVar8.b |= 2097152;
        amha bq = bq(w, i4, i3, i6, 0);
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar9 = (amgu) amglVar.b;
        bq.getClass();
        amguVar9.f = bq;
        amguVar9.e = 7;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar10 = (amgu) amglVar.b;
        t.getClass();
        amguVar10.U = t;
        amguVar10.c |= 65536;
        int i7 = xyp.a;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar11 = (amgu) amglVar.b;
        int i8 = i7 - 1;
        if (i7 != 0) {
            amguVar11.N = i8;
            amguVar11.c |= 512;
            ((mie) this.F.b()).k(amglVar, 3, 7, i2);
            amfq amfqVar = (amfq) amfr.a.createBuilder();
            amfp amfpVar = amfp.BUGLE_MESSAGE;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar = (amfr) amfqVar.b;
            amfrVar.i = amfpVar.dg;
            amfrVar.b |= 1;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar2 = (amfr) amfqVar.b;
            amgu amguVar12 = (amgu) amglVar.s();
            amguVar12.getClass();
            amfrVar2.k = amguVar12;
            amfrVar2.b |= 4;
            amgu amguVar13 = ((amfr) amfqVar.b).k;
            if (amguVar13 == null) {
                amguVar13 = amgu.a;
            }
            if (amguVar13.e == 7) {
                amhaVar = (amha) amguVar13.f;
            } else {
                amhaVar = amha.a;
            }
            bC(amhaVar, i4, t);
            this.J.a().b(amfqVar, mbt.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
            if (!z && i5 == 106) {
                bm(j3, "Bugle.Download.Failure.Attachment.Size.Bucket.Mms");
                ((mbl) this.S.b()).c("Bugle.DataModel.Action.Download.Failure.Count.Mms");
                return;
            }
            return;
        }
        throw null;
    }

    private final void bB(MessageCoreData messageCoreData, amem amemVar, boolean z) {
        aozy createBuilder = amgv.a.createBuilder();
        if (z) {
            long s = messageCoreData.s();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            amgv amgvVar = (amgv) apagVar;
            amgvVar.b |= 2;
            amgvVar.d = s;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            apag apagVar2 = createBuilder.b;
            amgv amgvVar2 = (amgv) apagVar2;
            amgvVar2.c = 3;
            amgvVar2.b = 1 | amgvVar2.b;
            if (!apagVar2.isMutable()) {
                createBuilder.u();
            }
            amgv amgvVar3 = (amgv) createBuilder.b;
            amemVar.getClass();
            amgvVar3.g = amemVar;
            amgvVar3.b |= 16;
        } else {
            long s2 = messageCoreData.s();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar3 = createBuilder.b;
            amgv amgvVar4 = (amgv) apagVar3;
            amgvVar4.b |= 2;
            amgvVar4.d = s2;
            if (!apagVar3.isMutable()) {
                createBuilder.u();
            }
            apag apagVar4 = createBuilder.b;
            amgv amgvVar5 = (amgv) apagVar4;
            amgvVar5.c = 1;
            amgvVar5.b = 1 | amgvVar5.b;
            if (!apagVar4.isMutable()) {
                createBuilder.u();
            }
            amgv amgvVar6 = (amgv) createBuilder.b;
            amemVar.getClass();
            amgvVar6.e = amemVar;
            amgvVar6.b |= 4;
        }
        bz(messageCoreData, (amgv) createBuilder.s());
    }

    private static void bC(amha amhaVar, int i2, amee ameeVar) {
        xyo a = k.a();
        a.H("MMS failed.");
        amgz b = amgz.b(amhaVar.c);
        if (b == null) {
            b = amgz.UNKNOWN_BUGLE_MMS_FAILURE_CODE;
        }
        a.z("failureCode", b);
        a.x("httpStatusCode", i2);
        a.q();
        amer amerVar = amhaVar.f;
        if (amerVar == null) {
            amerVar = amer.a;
        }
        bH(amerVar);
        bD(ameeVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void bD(defpackage.amee r3) {
        /*
            xze r0 = defpackage.mic.k
            xyo r0 = r0.a()
            java.lang.String r1 = "Network details."
            r0.H(r1)
            int r1 = r3.d
            int r1 = defpackage.a.U(r1)
            if (r1 != 0) goto L14
            goto L2c
        L14:
            r2 = 1
            if (r1 == r2) goto L2c
            r2 = 2
            if (r1 == r2) goto L29
            r2 = 3
            if (r1 == r2) goto L26
            r2 = 4
            if (r1 == r2) goto L23
            java.lang.String r1 = "TYPE_OTHER"
            goto L2e
        L23:
            java.lang.String r1 = "TYPE_WIMAX"
            goto L2e
        L26:
            java.lang.String r1 = "TYPE_WIFI"
            goto L2e
        L29:
            java.lang.String r1 = "TYPE_MOBILE_DATA"
            goto L2e
        L2c:
            java.lang.String r1 = "TYPE_UNKNOWN"
        L2e:
            java.lang.String r2 = "networkType"
            r0.z(r2, r1)
            int r1 = r3.e
            int r1 = defpackage.a.aM(r1)
            if (r1 != 0) goto L3c
            goto L66
        L3c:
            switch(r1) {
                case 1: goto L66;
                case 2: goto L63;
                case 3: goto L60;
                case 4: goto L5d;
                case 5: goto L5a;
                case 6: goto L57;
                case 7: goto L54;
                case 8: goto L51;
                case 9: goto L4e;
                case 10: goto L4b;
                case 11: goto L48;
                case 12: goto L45;
                case 13: goto L42;
                default: goto L3f;
            }
        L3f:
            java.lang.String r1 = "STATE_VERIFYING_POOR_LINK"
            goto L68
        L42:
            java.lang.String r1 = "STATE_SUSPENDED"
            goto L68
        L45:
            java.lang.String r1 = "STATE_SCANNING"
            goto L68
        L48:
            java.lang.String r1 = "STATE_OBTAINING_IPADDR"
            goto L68
        L4b:
            java.lang.String r1 = "STATE_IDLE"
            goto L68
        L4e:
            java.lang.String r1 = "STATE_FAILED"
            goto L68
        L51:
            java.lang.String r1 = "STATE_DISCONNECTING"
            goto L68
        L54:
            java.lang.String r1 = "STATE_DISCONNECTED"
            goto L68
        L57:
            java.lang.String r1 = "STATE_CONNECTING"
            goto L68
        L5a:
            java.lang.String r1 = "STATE_CONNECTED"
            goto L68
        L5d:
            java.lang.String r1 = "STATE_CAPTIVE_PORTAL_CHECK"
            goto L68
        L60:
            java.lang.String r1 = "STATE_BLOCKED"
            goto L68
        L63:
            java.lang.String r1 = "STATE_AUTHENTICATING"
            goto L68
        L66:
            java.lang.String r1 = "STATE_UNKNOWN"
        L68:
            java.lang.String r2 = "detailedState"
            r0.z(r2, r1)
            boolean r1 = r3.f
            java.lang.String r2 = "isRoaming"
            r0.A(r2, r1)
            int r1 = r3.g
            amnj r1 = defpackage.amnj.b(r1)
            if (r1 != 0) goto L7e
            amnj r1 = defpackage.amnj.UNKNOWN_SIGNAL_STRENGTH
        L7e:
            java.lang.String r2 = "signalStrength"
            java.lang.String r1 = r1.name()
            r0.z(r2, r1)
            boolean r1 = r3.h
            java.lang.String r2 = "airplaneModeOn"
            r0.A(r2, r1)
            boolean r3 = r3.i
            java.lang.String r1 = "mobileDataEnabled"
            r0.A(r1, r3)
            r0.q()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mic.bD(amee):void");
    }

    private static void bE(amgl amglVar, MessageCoreData messageCoreData) {
        if (messageCoreData.cn() && messageCoreData.E().k() && messageCoreData.D().k() && !messageCoreData.E().equals(messageCoreData.D())) {
            String f2 = messageCoreData.D().f();
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar = (amgu) amglVar.b;
            amgu amguVar2 = amgu.a;
            amguVar.c |= 32768;
            amguVar.T = f2;
        }
    }

    private final void bF(int i2, MessageCoreData messageCoreData) {
        String str;
        Object obj;
        boolean cD = messageCoreData.cD();
        String str2 = "receive";
        if (((Boolean) ((utz) h.get()).e()).booleanValue() && messageCoreData.cI() && !((vqu) this.ab.b()).J(i2)) {
            if (i2 == -1) {
                alvw i3 = l.i();
                i3.X(alwp.a, "BugleUsageStatistics");
                alvg alvgVar = (alvg) i3;
                alvgVar.Z(alwk.MEDIUM);
                alvg alvgVar2 = (alvg) alvgVar.h("com/google/android/apps/messaging/shared/analytics/statistics/UsageStatisticsImpl", "logRcsSubIdMismatchIfExists", 3643, "UsageStatisticsImpl.java");
                if (true != cD) {
                    obj = "receive";
                } else {
                    obj = "send";
                }
                alvgVar2.t("DEFAULT_SUB_ID used during RCS Message %s", new aomj(aomi.NO_USER_DATA, obj));
            } else {
                ((mbl) this.S.b()).c("Bugle.Multisim.ProvisionedSubIdAndMessageIdMismatch.Count");
            }
        }
        if (messageCoreData.cI()) {
            qwm e = ((ryg) this.Y.b()).e(messageCoreData.v());
            if (e == null) {
                alvw i4 = l.i();
                i4.X(alwp.a, "BugleUsageStatistics");
                alvg alvgVar3 = (alvg) i4;
                alvgVar3.Z(alwk.MEDIUM);
                ((alvg) alvgVar3.h("com/google/android/apps/messaging/shared/analytics/statistics/UsageStatisticsImpl", "shouldLogMismatch", 3704, "UsageStatisticsImpl.java")).q("Message subscription is null");
                return;
            }
            int e2 = e.e();
            if (e.e() < -1) {
                alvw i5 = l.i();
                i5.X(alwp.a, "BugleUsageStatistics");
                alvg alvgVar4 = (alvg) i5;
                alvgVar4.Z(alwk.MEDIUM);
                ((alvg) alvgVar4.h("com/google/android/apps/messaging/shared/analytics/statistics/UsageStatisticsImpl", "isValidSubscription", 3692, "UsageStatisticsImpl.java")).q("Message subId is invalid");
                ((mbl) this.S.b()).c("Bugle.Multisim.ProvisionedSubIdInvalid.Count");
                return;
            }
            if (!((adjc) this.am.b()).w(e2)) {
                mbl mblVar = (mbl) this.S.b();
                if (true != cD) {
                    str = "Bugle.Multisim.ProvisionedSubIdAndMessageIdMismatchDuringReceive.Count";
                } else {
                    str = "Bugle.Multisim.ProvisionedSubIdAndMessageIdMismatchDuringSend.Count";
                }
                mblVar.c(str);
                alvw i6 = l.i();
                i6.X(alwp.a, "BugleUsageStatistics");
                alvg alvgVar5 = (alvg) i6;
                alvgVar5.Z(alwk.MEDIUM);
                alvg alvgVar6 = (alvg) alvgVar5.h("com/google/android/apps/messaging/shared/analytics/statistics/UsageStatisticsImpl", "logRcsSubIdMismatchIfExists", 3661, "UsageStatisticsImpl.java");
                if (true == cD) {
                    str2 = "send";
                }
                alvgVar6.t("Message subId and the sender subId is mismatched for RCS Message %s", new aomj(aomi.NO_USER_DATA, str2));
            }
        }
    }

    private static void bG(amij amijVar, amee ameeVar) {
        xyo a = k.a();
        a.H("SMS failed.");
        a.x("errorCode", amijVar.c);
        amii b = amii.b(amijVar.e);
        if (b == null) {
            b = amii.PHONE_TYPE_NONE;
        }
        a.z("phoneType", b);
        a.q();
        amer amerVar = amijVar.d;
        if (amerVar == null) {
            amerVar = amer.a;
        }
        bH(amerVar);
        bD(ameeVar);
    }

    private static void bH(amer amerVar) {
        xyo a = k.a();
        a.H("XMS common failed details.");
        a.x("resultCode", amerVar.c);
        a.q();
    }

    @Deprecated
    private final void bI(String str, int i2, String str2, int i3, String str3, tqr tqrVar) {
        alog alogVar;
        msh t = ((msk) this.O.b()).t(str, i2);
        if (!this.y.get()) {
            r();
            return;
        }
        int i4 = 6;
        if (TextUtils.isEmpty(str3)) {
            int i5 = alog.d;
            alogVar = alsx.a;
        } else {
            SpannableString valueOf = SpannableString.valueOf(str3);
            if (!Linkify.addLinks(valueOf, 7)) {
                int i6 = alog.d;
                alogVar = alsx.a;
            } else {
                Stream map = DesugarArrays.stream((URLSpan[]) valueOf.getSpans(0, valueOf.length(), URLSpan.class)).map(new uvo(6));
                int i7 = alog.d;
                alogVar = (alog) map.collect(alls.a);
            }
        }
        alog g2 = ((alpt) Collection.EL.stream(alogVar).map(new mfk(i4)).collect(alls.b)).g();
        aozy createBuilder = amiy.a.createBuilder();
        amir amirVar = (amir) bg().getOrDefault(tqrVar, amir.UNKNOWN);
        if (t.m() != null) {
            String ag = albo.ag(t.m());
            if (amir.VERIFIED != amirVar) {
                ag = "pii(" + ag.length() + ")";
            }
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amiy amiyVar = (amiy) createBuilder.b;
            amiyVar.b |= 1;
            amiyVar.c = ag;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amiy amiyVar2 = (amiy) createBuilder.b;
        amiyVar2.e = amirVar.g;
        amiyVar2.b |= 4;
        long b = ((lzz) this.q.b()).b(str2);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amiy amiyVar3 = (amiy) createBuilder.b;
        amiyVar3.b |= 8;
        amiyVar3.f = b;
        amhb x = ((lfl) this.s.b()).x(i2);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amiy amiyVar4 = (amiy) apagVar;
        amiyVar4.d = x;
        amiyVar4.b |= 2;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        amiy amiyVar5 = (amiy) createBuilder.b;
        apao apaoVar = amiyVar5.g;
        if (!apaoVar.c()) {
            amiyVar5.g = apag.mutableCopy(apaoVar);
        }
        Iterator<E> it = g2.iterator();
        while (it.hasNext()) {
            amiyVar5.g.g(((amix) it.next()).f);
        }
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_BUSINESS_MESSAGING_EVENT;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        aozy createBuilder2 = amiz.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar2 = createBuilder2.b;
        amiz amizVar = (amiz) apagVar2;
        amizVar.c = i3 - 1;
        amizVar.b |= 1;
        if (!apagVar2.isMutable()) {
            createBuilder2.u();
        }
        amiz amizVar2 = (amiz) createBuilder2.b;
        amiy amiyVar6 = (amiy) createBuilder.s();
        amiyVar6.getClass();
        amizVar2.d = amiyVar6;
        amizVar2.b |= 2;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amiz amizVar3 = (amiz) createBuilder2.s();
        amizVar3.getClass();
        amfrVar2.ae = amizVar3;
        amfrVar2.d |= 16;
        this.x.n(amfqVar);
    }

    private final void bJ(int i2, int i3, amfp amfpVar) {
        if (!this.y.get()) {
            r();
            return;
        }
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        amfa amfaVar = (amfa) amfb.a.createBuilder();
        if (!amfaVar.b.isMutable()) {
            amfaVar.u();
        }
        amfb amfbVar = (amfb) amfaVar.b;
        int i4 = i2 - 1;
        if (i2 != 0) {
            amfbVar.d = i4;
            amfbVar.b |= 2;
            if (!amfaVar.b.isMutable()) {
                amfaVar.u();
            }
            amfb amfbVar2 = (amfb) amfaVar.b;
            amfbVar2.c = i3 - 1;
            amfbVar2.b |= 1;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar2 = (amfr) amfqVar.b;
            amfb amfbVar3 = (amfb) amfaVar.s();
            amfbVar3.getClass();
            amfrVar2.C = amfbVar3;
            amfrVar2.b |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
            this.x.j(amfqVar);
            return;
        }
        throw null;
    }

    private final void bK(final rve rveVar, final MessageCoreData messageCoreData, final int i2, final int i3, final amxb amxbVar, final amxo amxoVar) {
        if (!this.y.get()) {
            k.l("End to end logging disabled. Not logging IMDN.");
        } else {
            qiu.h(aktp.ah(new Runnable() { // from class: mhu
                @Override // java.lang.Runnable
                public final void run() {
                    int i4;
                    amgj amgjVar;
                    mic micVar = mic.this;
                    MessageCoreData messageCoreData2 = messageCoreData;
                    Optional ofNullable = Optional.ofNullable(amxoVar);
                    int bd = micVar.bd(messageCoreData2);
                    amwt bj = micVar.bj(bd);
                    amgl amglVar = (amgl) amgu.a.createBuilder();
                    int i5 = i2;
                    if (i5 != 1) {
                        if (i5 != 10) {
                            if (i5 == 25) {
                                i4 = 8;
                            } else {
                                throw new IllegalArgumentException(a.bV(i5, "notificationType does not correspond to IMDN: "));
                            }
                        } else {
                            i4 = 7;
                        }
                    } else {
                        i4 = 6;
                    }
                    if (!amglVar.b.isMutable()) {
                        amglVar.u();
                    }
                    amgu amguVar = (amgu) amglVar.b;
                    amguVar.g = i4 - 1;
                    amguVar.b |= 1;
                    if (!amglVar.b.isMutable()) {
                        amglVar.u();
                    }
                    amgu amguVar2 = (amgu) amglVar.b;
                    amguVar2.w = bj.E;
                    amguVar2.b |= 1048576;
                    String k2 = micVar.k(Optional.of(Integer.valueOf(bd)));
                    if (!amglVar.b.isMutable()) {
                        amglVar.u();
                    }
                    amgu amguVar3 = (amgu) amglVar.b;
                    k2.getClass();
                    amguVar3.c = 1 | amguVar3.c;
                    amguVar3.J = k2;
                    amhb x = ((lfl) micVar.s.b()).x(bd);
                    if (!amglVar.b.isMutable()) {
                        amglVar.u();
                    }
                    amgu amguVar4 = (amgu) amglVar.b;
                    amguVar4.i = x;
                    amguVar4.b |= 4;
                    int i6 = xyp.a;
                    if (!amglVar.b.isMutable()) {
                        amglVar.u();
                    }
                    amgu amguVar5 = (amgu) amglVar.b;
                    int i7 = i6 - 1;
                    if (i6 != 0) {
                        rve rveVar2 = rveVar;
                        amguVar5.N = i7;
                        amguVar5.c |= 512;
                        String str = rveVar2.b;
                        if (str != null) {
                            if (!amglVar.b.isMutable()) {
                                amglVar.u();
                            }
                            amgu amguVar6 = (amgu) amglVar.b;
                            amguVar6.b |= Integer.MIN_VALUE;
                            amguVar6.H = str;
                        }
                        if (messageCoreData2 != null) {
                            int bs = micVar.bs(messageCoreData2.z());
                            if (!amglVar.b.isMutable()) {
                                amglVar.u();
                            }
                            amgu amguVar7 = (amgu) amglVar.b;
                            amguVar7.x = bs - 1;
                            amguVar7.b |= 2097152;
                            ((mie) micVar.F.b()).g(messageCoreData2, amglVar);
                            if (i5 != 10 || !messageCoreData2.cn()) {
                                String f2 = messageCoreData2.E().f();
                                if (!amglVar.b.isMutable()) {
                                    amglVar.u();
                                }
                                amgu amguVar8 = (amgu) amglVar.b;
                                amguVar8.c |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
                                amguVar8.af = f2;
                            }
                        }
                        amgl amglVar2 = (amgl) ((amgu) amglVar.s()).toBuilder();
                        if (!amglVar2.b.isMutable()) {
                            amglVar2.u();
                        }
                        int i8 = i3;
                        amgu amguVar9 = (amgu) amglVar2.b;
                        amguVar9.h = i8 - 1;
                        amguVar9.b |= 2;
                        if (i8 == 3) {
                            amgjVar = amgj.INCOMING;
                        } else {
                            amgjVar = amgj.BUGLE_MESSAGE_SOURCE_NA;
                        }
                        if (!amglVar2.b.isMutable()) {
                            amglVar2.u();
                        }
                        amxb amxbVar2 = amxbVar;
                        amgu amguVar10 = (amgu) amglVar2.b;
                        amguVar10.m = amgjVar.w;
                        amguVar10.b |= 64;
                        ((mie) micVar.F.b()).i(messageCoreData2, amglVar2, ofNullable);
                        if (messageCoreData2 != null) {
                            if (messageCoreData2.y() != null) {
                                qiu.h(messageCoreData2.y().f().h(new mhz(micVar, messageCoreData2, i8, amxbVar2, amglVar2, 1), micVar.B));
                                return;
                            }
                        } else {
                            messageCoreData2 = null;
                        }
                        micVar.bu(messageCoreData2, i8, amxbVar2, amglVar2);
                        return;
                    }
                    throw null;
                }
            }, this.B));
        }
    }

    private final void bL(MessageCoreData messageCoreData, int i2, Optional optional, Optional optional2, mbh mbhVar) {
        if (!this.y.get()) {
            r();
            return;
        }
        long s = messageCoreData.s();
        aozy createBuilder = amje.a.createBuilder();
        int e = e();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amje amjeVar = (amje) createBuilder.b;
        int i3 = 1;
        amjeVar.b |= 1;
        amjeVar.c = e;
        String d = ((mie) this.F.b()).d();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amje amjeVar2 = (amje) createBuilder.b;
        d.getClass();
        amjeVar2.b |= 4;
        amjeVar2.e = d;
        amje amjeVar3 = (amje) createBuilder.s();
        int x = lgb.x(messageCoreData.d());
        amgl amglVar = (amgl) amgu.a.createBuilder();
        long a = ((lzz) this.q.b()).a(messageCoreData.z());
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar = (amgu) amglVar.b;
        amguVar.b |= 1073741824;
        amguVar.G = a;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar2 = (amgu) amglVar.b;
        amguVar2.b |= 128;
        amguVar2.n = s;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar3 = (amgu) amglVar.b;
        amguVar3.g = x - 1;
        amguVar3.b |= 1;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar4 = (amgu) amglVar.b;
        amguVar4.h = i2 - 1;
        int i4 = 2;
        amguVar4.b |= 2;
        amhb x2 = ((lfl) this.s.b()).x(-1);
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar5 = (amgu) amglVar.b;
        amguVar5.i = x2;
        amguVar5.b |= 4;
        String k2 = k(Optional.of(-1));
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar6 = (amgu) amglVar.b;
        k2.getClass();
        amguVar6.c |= 1;
        amguVar6.J = k2;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar7 = (amgu) amglVar.b;
        amjeVar3.getClass();
        amguVar7.y = amjeVar3;
        amguVar7.b |= 4194304;
        int bs = bs(messageCoreData.z());
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar8 = (amgu) amglVar.b;
        amguVar8.x = bs - 1;
        amguVar8.b |= 2097152;
        int i5 = xyp.a;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar9 = (amgu) amglVar.b;
        int i6 = i5 - 1;
        if (i5 != 0) {
            amguVar9.N = i6;
            amguVar9.c |= 512;
            if (true != messageCoreData.cn()) {
                i4 = 3;
            }
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar10 = (amgu) amglVar.b;
            amguVar10.S = i4 - 1;
            amguVar10.c |= 16384;
            if (messageCoreData.aF() != null) {
                atok aF = messageCoreData.aF();
                aF.getClass();
                if (!amglVar.b.isMutable()) {
                    amglVar.u();
                }
                amgu amguVar11 = (amgu) amglVar.b;
                amguVar11.o = aF;
                amguVar11.b |= 1024;
            }
            ((mie) this.F.b()).i(messageCoreData, amglVar, optional2);
            optional.ifPresent(new met(amglVar, 20));
            messageCoreData.E().g(new mht(amglVar, 1));
            ((mie) this.F.b()).e(amglVar, -1);
            ((mie) this.F.b()).g(messageCoreData, amglVar);
            amfq amfqVar = (amfq) amfr.a.createBuilder();
            amfp amfpVar = amfp.BUGLE_MESSAGE;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar = (amfr) amfqVar.b;
            amfrVar.i = amfpVar.dg;
            amfrVar.b |= 1;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar2 = (amfr) amfqVar.b;
            amgu amguVar12 = (amgu) amglVar.s();
            amguVar12.getClass();
            amfrVar2.k = amguVar12;
            amfrVar2.b |= 4;
            mar a2 = this.J.a();
            a2.g(mbhVar);
            a2.b(amfqVar, mbt.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
            amgu amguVar13 = (amgu) amglVar.b;
            long j2 = amguVar13.n;
            int aL = akec.aL(amguVar13.h);
            if (aL != 0) {
                i3 = aL;
            }
            lgb.y(j2, i3, mbhVar);
            return;
        }
        throw null;
    }

    private final void bM(aozy aozyVar, ConversationIdType conversationIdType) {
        qiu.h(((mie) this.F.b()).a(-1).h(new kxr(this, aozyVar, conversationIdType, 10), this.A));
    }

    private final void bN(int i2, ConversationIdType conversationIdType, int i3, amxo amxoVar, long j2) {
        String str;
        Optional empty = Optional.empty();
        aiut.b();
        if (!this.y.get()) {
            r();
            return;
        }
        int i4 = i2;
        if (i4 != 3) {
            i4 = 4;
        }
        d.t(true, "Download start logging is only possible for MMS and RCS messages.");
        mbl mblVar = (mbl) this.S.b();
        if (i4 == 3) {
            str = "Bugle.DataModel.Action.Download.Start.Count.Mms";
        } else {
            str = "Bugle.DataModel.Action.Download.Start.Count.Rcs";
        }
        mblVar.c(str);
        aozy createBuilder = amje.a.createBuilder();
        int e = e();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amje amjeVar = (amje) createBuilder.b;
        amjeVar.b |= 1;
        amjeVar.c = e;
        String d = ((mie) this.F.b()).d();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amje amjeVar2 = (amje) createBuilder.b;
        d.getClass();
        amjeVar2.b |= 4;
        amjeVar2.e = d;
        amje amjeVar3 = (amje) createBuilder.s();
        amgl amglVar = (amgl) amgu.a.createBuilder();
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar = (amgu) amglVar.b;
        amguVar.aa = amxoVar.h;
        amguVar.c |= 2097152;
        long a = ((lzz) this.q.b()).a(conversationIdType);
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar2 = (amgu) amglVar.b;
        amguVar2.b |= 1073741824;
        amguVar2.G = a;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar3 = (amgu) amglVar.b;
        amguVar3.g = i4 - 1;
        amguVar3.b |= 1;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar4 = (amgu) amglVar.b;
        amguVar4.h = 14;
        amguVar4.b |= 2;
        amhb x = ((lfl) this.s.b()).x(i3);
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar5 = (amgu) amglVar.b;
        amguVar5.i = x;
        amguVar5.b |= 4;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar6 = (amgu) amglVar.b;
        amjeVar3.getClass();
        amguVar6.y = amjeVar3;
        amguVar6.b |= 4194304;
        int bs = bs(conversationIdType);
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar7 = (amgu) amglVar.b;
        amguVar7.x = bs - 1;
        amguVar7.b |= 2097152;
        int i5 = xyp.a;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar8 = (amgu) amglVar.b;
        int i6 = i5 - 1;
        if (i5 != 0) {
            amguVar8.N = i6;
            amguVar8.c |= 512;
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar9 = (amgu) amglVar.b;
            amguVar9.b |= 128;
            amguVar9.n = j2;
            empty.isPresent();
            ((mie) this.F.b()).e(amglVar, i3);
            ((mie) this.F.b()).k(amglVar, i4, 15, i3);
            amfq amfqVar = (amfq) amfr.a.createBuilder();
            amfp amfpVar = amfp.BUGLE_MESSAGE;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar = (amfr) amfqVar.b;
            amfrVar.i = amfpVar.dg;
            amfrVar.b |= 1;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar2 = (amfr) amfqVar.b;
            amgu amguVar10 = (amgu) amglVar.s();
            amguVar10.getClass();
            amfrVar2.k = amguVar10;
            amfrVar2.b |= 4;
            this.J.a().b(amfqVar, mbt.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
            return;
        }
        throw null;
    }

    public static /* synthetic */ alor bg() {
        return alor.o(tqr.VERIFICATION_VERIFIED, amir.VERIFIED, tqr.VERIFICATION_UNVERIFIED, amir.UNVERIFIED, tqr.VERIFICATION_NA, amir.NA, tqr.VERIFICATION_IN_PROGRESS, amir.NOT_YET_VERIFIED);
    }

    public static /* synthetic */ alor bh() {
        return alor.p(yua.UNKNOWN_TYPE, amis.UNKNOWN_TYPE, yua.NOT_YET_KNOWN, amis.NOT_SET_YET, yua.RCS, amis.RCS, yua.C11N, amis.C11N, yua.C11N_RCS, amis.C11N_RCS);
    }

    public static amfr bi(amfh amfhVar) {
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_CONVERSATION;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amfhVar.getClass();
        amfrVar2.l = amfhVar;
        amfrVar2.b |= 8;
        return (amfr) amfqVar.s();
    }

    public static final amha bq(amgz amgzVar, int i2, int i3, int i4, int i5) {
        aozy createBuilder = amha.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amha amhaVar = (amha) apagVar;
        amhaVar.c = amgzVar.j;
        amhaVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        amha amhaVar2 = (amha) apagVar2;
        amhaVar2.b |= 2;
        amhaVar2.d = i2;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        amha amhaVar3 = (amha) createBuilder.b;
        amhaVar3.b |= 32;
        amhaVar3.e = i4;
        aozy createBuilder2 = amer.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        amer amerVar = (amer) createBuilder2.b;
        amerVar.b |= 1;
        amerVar.c = i3;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amha amhaVar4 = (amha) createBuilder.b;
        amer amerVar2 = (amer) createBuilder2.s();
        amerVar2.getClass();
        amhaVar4.f = amerVar2;
        amhaVar4.b |= 64;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amha amhaVar5 = (amha) createBuilder.b;
        amhaVar5.b |= 128;
        amhaVar5.g = i5;
        return (amha) createBuilder.s();
    }

    private final amii bx(int i2) {
        TelephonyManager telephonyManager = (TelephonyManager) this.ah.getSystemService("phone");
        if (telephonyManager != null) {
            telephonyManager = telephonyManager.createForSubscriptionId(i2);
        }
        if (telephonyManager != null) {
            return (amii) Optional.ofNullable(amii.b(telephonyManager.getPhoneType())).orElse(amii.PHONE_TYPE_NONE);
        }
        return amii.PHONE_TYPE_NONE;
    }

    private final void by(MessageCoreData messageCoreData, amgj amgjVar) {
        rto m;
        if (!messageCoreData.y().t() && (m = ((uie) this.N.b()).m(messageCoreData.z())) != null) {
            messageCoreData.bs(m.g(amgjVar, null, messageCoreData.n()));
        }
        this.D.e(messageCoreData);
    }

    private final void bz(MessageCoreData messageCoreData, amgv amgvVar) {
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amgl amglVar = (amgl) amgu.a.createBuilder();
        long a = ((lzz) this.q.b()).a(messageCoreData.z());
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar = (amgu) amglVar.b;
        amguVar.b |= 1073741824;
        amguVar.G = a;
        long j2 = amgvVar.d;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar2 = (amgu) amglVar.b;
        amguVar2.b |= 128;
        amguVar2.n = j2;
        int i2 = xyp.a;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar3 = (amgu) amglVar.b;
        int i3 = i2 - 1;
        if (i2 != 0) {
            amguVar3.N = i3;
            amguVar3.c |= 512;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar = (amfr) amfqVar.b;
            amgu amguVar4 = (amgu) amglVar.s();
            amguVar4.getClass();
            amfrVar.k = amguVar4;
            amfrVar.b |= 4;
            amfp amfpVar = amfp.BUGLE_ANNOTATION;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar2 = (amfr) amfqVar.b;
            amfrVar2.i = amfpVar.dg;
            amfrVar2.b |= 1;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar3 = (amfr) amfqVar.b;
            amgvVar.getClass();
            amfrVar3.y = amgvVar;
            amfrVar3.b |= 262144;
            this.x.j(amfqVar);
            return;
        }
        throw null;
    }

    @Override // defpackage.mho
    public final void A(rve rveVar, MessageCoreData messageCoreData, int i2, amxo amxoVar) {
        bK(rveVar, messageCoreData, i2, 8, null, amxoVar);
    }

    @Override // defpackage.mho
    public final void B(rve rveVar, MessageCoreData messageCoreData, int i2, amxo amxoVar) {
        if (messageCoreData != null) {
            by(messageCoreData, lgb.z(messageCoreData, 3));
        }
        bK(rveVar, messageCoreData, i2, 2, null, amxoVar);
    }

    @Override // defpackage.mho
    public final void C(rve rveVar, MessageCoreData messageCoreData, int i2, amxb amxbVar, amxo amxoVar) {
        bK(rveVar, messageCoreData, i2, 6, amxbVar, amxoVar);
    }

    @Override // defpackage.mho
    public final void D(MessageCoreData messageCoreData, amem amemVar) {
        if (!this.y.get()) {
            r();
        } else {
            bB(messageCoreData, amemVar, false);
        }
    }

    @Override // defpackage.mho
    public final void E(MessageCoreData messageCoreData, amem amemVar) {
        if (!this.y.get()) {
            r();
        } else {
            bB(messageCoreData, amemVar, true);
        }
    }

    @Override // defpackage.mho
    @Deprecated
    public final void F(MessageCoreData messageCoreData, String str) {
        new mhb(messageCoreData, str);
    }

    @Override // defpackage.mho
    @Deprecated
    public final void G(MessageCoreData messageCoreData, String str) {
        new mhc(messageCoreData, str);
    }

    @Override // defpackage.mho
    public final void H(MessageCoreData messageCoreData, Integer num, int i2, amgc amgcVar) {
        akul ag;
        akrh e = aktp.e("UsageStatisticsImpl::logMessageIdCreated");
        try {
            if (!this.y.get()) {
                r();
            } else if (anfi.a("bugle.log_remote_transport_type_on_created", "bugle")) {
                amgl amglVar = (amgl) amgu.a.createBuilder();
                if (messageCoreData.y() != null) {
                    ag = messageCoreData.y().f();
                } else {
                    ag = aktp.ag(null);
                }
                qiu.h(ag.i(new mhv(this, messageCoreData, amglVar, 0), andi.a).h(new mhw(this, messageCoreData, num, i2, amgcVar, amglVar, 1), this.B));
            } else if (messageCoreData.y() != null) {
                qiu.h(messageCoreData.y().f().h(new mhw(this, messageCoreData.U(), messageCoreData, num, i2, amgcVar, 0), this.B));
            } else {
                qiu.h(aktp.ah(new kkm(this, messageCoreData, num, i2, amgcVar, 2), this.B));
            }
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

    @Override // defpackage.mho
    public final void I(mgn mgnVar) {
        new mhi(mgnVar.a, mgnVar.c, mgnVar.d, mgnVar.e);
        if (!this.y.get()) {
            r();
        } else {
            qiu.h(aktp.ah(new irs(this, mgnVar, 17), this.B));
        }
    }

    @Override // defpackage.mho
    public final void J(MessageCoreData messageCoreData) {
        new mhg(messageCoreData);
    }

    @Override // defpackage.mho
    public final void K(MessageCoreData messageCoreData, int i2) {
        if (qkq.o()) {
            L(messageCoreData, i2, -1);
        } else {
            qiu.h(aktp.ah(new qq(this, messageCoreData, i2, 11, (char[]) null), this.B));
        }
    }

    @Override // defpackage.mho
    public final void L(final MessageCoreData messageCoreData, final int i2, final int i3) {
        akul ai;
        if (qkq.o()) {
            ai = aktp.aj(new ancr() { // from class: mhy
                @Override // defpackage.ancr
                public final ListenableFuture a() {
                    amgl amglVar = (amgl) amgu.a.createBuilder();
                    mic micVar = mic.this;
                    mie mieVar = (mie) micVar.F.b();
                    MessageCoreData messageCoreData2 = messageCoreData;
                    return mieVar.b(messageCoreData2, amglVar).h(new mtp(micVar, messageCoreData2, i2, i3, amglVar, 1), micVar.B);
                }
            }, this.af);
        } else {
            ai = aktp.ai(new Callable() { // from class: mia
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    mic.this.bn(messageCoreData, i2, i3, (amgl) amgu.a.createBuilder());
                    return null;
                }
            }, this.B);
        }
        qiu.h(ai);
    }

    @Override // defpackage.mho
    public final void M(MessageCoreData messageCoreData, int i2, amgl amglVar) {
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar = (amgu) amglVar.b;
        amgu amguVar2 = amgu.a;
        amguVar.Y = 0;
        amguVar.c |= 524288;
        N(messageCoreData, i2, this.v.f().toEpochMilli(), lgb.L(this.v), amglVar);
    }

    @Override // defpackage.mho
    public final void N(MessageCoreData messageCoreData, int i2, long j2, mbh mbhVar, amgl amglVar) {
        String a;
        ((mie) this.F.b()).h(messageCoreData, amglVar);
        int aL = akec.aL(((amgu) amglVar.b).h);
        if (aL == 0) {
            aL = 1;
        }
        int i3 = aL - 1;
        if (i3 != 1) {
            if (i3 == 2) {
                bF(i2, messageCoreData);
                new mhf(messageCoreData);
            }
        } else {
            bF(i2, messageCoreData);
            new mhh(messageCoreData);
        }
        yyb.aO(((mdt) this.z.b()).f(mbhVar.a), "BugleUsageStatistics", "Failed to update LastPassiveEventTimeMillis");
        if (!this.y.get()) {
            r();
            return;
        }
        d.t(!messageCoreData.N().equals(tqu.TRANSPORT_NOT_SELECTED), "XmsTransport must be selected at this stage");
        amgt amgtVar = (amgt) this.ax.fu(messageCoreData.N());
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar = (amgu) amglVar.b;
        amguVar.aq = amgtVar.h;
        amguVar.d |= 32;
        if (messageCoreData.aF() != null) {
            atok aF = messageCoreData.aF();
            aF.getClass();
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar2 = (amgu) amglVar.b;
            amguVar2.o = aF;
            amguVar2.b |= 1024;
        }
        xyo c = k.c();
        c.H("Logging message sent or received async");
        c.c(messageCoreData.B());
        c.g(messageCoreData.E());
        c.v(messageCoreData.s());
        c.q();
        aozy createBuilder = umi.a.createBuilder();
        if (messageCoreData.B().b()) {
            a = "-1";
        } else {
            a = messageCoreData.B().a();
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        umi umiVar = (umi) apagVar;
        a.getClass();
        umiVar.b = 1 | umiVar.b;
        umiVar.c = a;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        umi umiVar2 = (umi) apagVar2;
        umiVar2.b = 2 | umiVar2.b;
        umiVar2.d = i2;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apag apagVar3 = createBuilder.b;
        umi umiVar3 = (umi) apagVar3;
        umiVar3.b |= 4;
        umiVar3.e = j2;
        long j3 = mbhVar.a;
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        apag apagVar4 = createBuilder.b;
        umi umiVar4 = (umi) apagVar4;
        umiVar4.b |= 16;
        umiVar4.g = j3;
        long j4 = mbhVar.b;
        if (!apagVar4.isMutable()) {
            createBuilder.u();
        }
        apag apagVar5 = createBuilder.b;
        umi umiVar5 = (umi) apagVar5;
        umiVar5.b |= 32;
        umiVar5.h = j4;
        if (!apagVar5.isMutable()) {
            createBuilder.u();
        }
        umi umiVar6 = (umi) createBuilder.b;
        amgu amguVar3 = (amgu) amglVar.s();
        amguVar3.getClass();
        umiVar6.f = amguVar3;
        umiVar6.b |= 8;
        irs irsVar = new irs(this, (umi) createBuilder.s(), 18, null);
        akrh e = aktp.e("UsageStatisticsImpl::logMessageSentOrReceivedAsync");
        try {
            akul ah = aktp.ah(irsVar, this.B);
            e.b(ah);
            umz umzVar = (umz) this.aq.b();
            umzVar.f("Bugle.DataModel.Action.ProcessSentOrReceivedMessage.Logging.AttachingAndroidFutureWrapper.Count", umzVar.d(EnumSet.of(umy.WAKELOCK, umy.BACKGROUND_SERVICE), ah, new mcw(7)));
            qiu.h(ah);
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

    @Override // defpackage.mho
    public final void O(MessageCoreData messageCoreData, int i2, int i3, amgj amgjVar) {
        int i4;
        if (!this.y.get()) {
            r();
            return;
        }
        long a = ((lzz) this.q.b()).a(messageCoreData.z());
        int x = lgb.x(messageCoreData.d());
        amee t = ((lfl) this.r.b()).t(i2);
        aozy createBuilder = amig.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amig amigVar = (amig) createBuilder.b;
        amigVar.b |= 1;
        amigVar.c = i2;
        amig amigVar2 = (amig) createBuilder.s();
        amgl amglVar = (amgl) amgu.a.createBuilder();
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar = (amgu) amglVar.b;
        amigVar2.getClass();
        amguVar.l = amigVar2;
        amguVar.b |= 32;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar2 = (amgu) amglVar.b;
        amguVar2.b |= 1073741824;
        amguVar2.G = a;
        long s = messageCoreData.s();
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar3 = (amgu) amglVar.b;
        amguVar3.b |= 128;
        amguVar3.n = s;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar4 = (amgu) amglVar.b;
        amguVar4.g = x - 1;
        amguVar4.b |= 1;
        amgh amghVar = amgh.MISSING_SELF_IDENTITY;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar5 = (amgu) amglVar.b;
        amguVar5.v = amghVar.p;
        amguVar5.b |= 524288;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar6 = (amgu) amglVar.b;
        amguVar6.m = amgjVar.w;
        amguVar6.b |= 64;
        amfg v = lgb.v(Integer.valueOf(i3));
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar7 = (amgu) amglVar.b;
        amguVar7.r = v.f;
        amguVar7.b |= 16384;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar8 = (amgu) amglVar.b;
        t.getClass();
        amguVar8.U = t;
        amguVar8.c |= 65536;
        if (true != messageCoreData.cn()) {
            i4 = 3;
        } else {
            i4 = 2;
        }
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar9 = (amgu) amglVar.b;
        amguVar9.S = i4 - 1;
        amguVar9.c |= 16384;
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_MESSAGE;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amgu amguVar10 = (amgu) amglVar.s();
        amguVar10.getClass();
        amfrVar2.k = amguVar10;
        amfrVar2.b |= 4;
        this.J.a().a(amfqVar, mbt.LOG_SPEC_DSDR_EVENTS);
    }

    @Override // defpackage.mho
    public final void P(int i2, int i3, int i4, int i5, long j2, int i6, long j3, ConversationIdType conversationIdType) {
        bA(i2, i3, i4, j2, i6, i5, j3, false, conversationIdType);
    }

    @Override // defpackage.mho
    public final void Q(ConversationIdType conversationIdType, int i2, long j2) {
        bN(3, conversationIdType, i2, amxo.NOT_RCS, j2);
    }

    @Override // defpackage.mho
    public final void R(int i2) {
        ((mbl) this.S.b()).e("Bugle.Media.PhotoViewer.Launch.Counts", i2);
    }

    @Override // defpackage.mho
    public final void S(amlw amlwVar, amlx amlxVar) {
        int a;
        if (!this.y.get()) {
            r();
            return;
        }
        if (amlxVar == null) {
            amlxVar = amlx.b(((ykw) ((zxy) this.U.b()).b).d("provisioning_ui_type", 0));
        } else {
            ((ykw) ((zxy) this.U.b()).b).j("provisioning_ui_type", amlxVar.t);
        }
        aozy createBuilder = amly.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amly amlyVar = (amly) apagVar;
        amlyVar.c = amlwVar.U;
        amlyVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        amly amlyVar2 = (amly) createBuilder.b;
        amlyVar2.d = amlxVar.t;
        amlyVar2.b |= 4;
        if (amlwVar == amlw.RCS_PROVISIONING_PROMPT_SEEN) {
            a = ((xvu) this.ae.b()).a() + 1;
        } else {
            a = ((xvu) this.ae.b()).a();
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amly amlyVar3 = (amly) createBuilder.b;
        amlyVar3.b |= 8;
        amlyVar3.e = a;
        amly amlyVar4 = (amly) createBuilder.s();
        aozy createBuilder2 = amht.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar2 = createBuilder2.b;
        amht amhtVar = (amht) apagVar2;
        amhtVar.c = 11;
        amhtVar.b |= 1;
        if (!apagVar2.isMutable()) {
            createBuilder2.u();
        }
        amht amhtVar2 = (amht) createBuilder2.b;
        amlyVar4.getClass();
        amhtVar2.j = amlyVar4;
        amhtVar2.b |= 256;
        amjd b = advh.b(this.ah);
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        amht amhtVar3 = (amht) createBuilder2.b;
        b.getClass();
        amhtVar3.h = b;
        amhtVar3.b |= 64;
        String j2 = ((zxy) this.U.b()).j();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        amht amhtVar4 = (amht) createBuilder2.b;
        j2.getClass();
        amhtVar4.b |= 128;
        amhtVar4.i = j2;
        amht amhtVar5 = (amht) createBuilder2.s();
        lpg lpgVar = (lpg) this.ad.b();
        long longValue = agkx.W().longValue();
        if (!lpgVar.f().isPresent()) {
            ((ykw) lpgVar.a).k("first_rcs_provisioning_ui_event_time", longValue);
        }
        if (amlwVar.equals(amlw.RCS_PROVISIONING_PROMPT_DECLINED) || amlwVar.equals(amlw.RCS_PROVISIONING_RCS_PROMO_DECLINED)) {
            lpg lpgVar2 = (lpg) this.ad.b();
            long longValue2 = agkx.W().longValue();
            if (!lpgVar2.d().isPresent()) {
                ((ykw) lpgVar2.a).k("first_time_rcs_declined_millis", longValue2);
            }
        }
        if (amlwVar.equals(amlw.RCS_PROVISIONING_PROMPT_ACCEPTED) || amlwVar.equals(amlw.RCS_PROVISIONING_RCS_PROMO_ACCEPTED)) {
            lpg lpgVar3 = (lpg) this.ad.b();
            long longValue3 = agkx.W().longValue();
            if (!lpgVar3.c().isPresent()) {
                ((ykw) lpgVar3.a).k("first_time_rcs_accepted_millis", longValue3);
            }
        }
        if (amlxVar != null) {
            lpg lpgVar4 = (lpg) this.ad.b();
            if (!lpgVar4.b().isPresent()) {
                ((ykw) lpgVar4.a).j("first_provisioning_ui_event_ui_type", amlxVar.t);
            }
        }
        maq maqVar = this.x;
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amhtVar5.getClass();
        amfrVar.s = amhtVar5;
        amfrVar.b |= 4096;
        maqVar.k(amfqVar, amrs.UMA_RCS_PROVISIONING_UI_INTERACTION);
    }

    @Override // defpackage.mho
    public final void T(ConversationIdType conversationIdType, int i2, amxo amxoVar, long j2) {
        bN(4, conversationIdType, i2, amxoVar, j2);
    }

    @Override // defpackage.mho
    public final void U(MessageCoreData messageCoreData) {
        alvw i2 = l.i();
        i2.X(alwp.a, "BugleUsageStatistics");
        alvg alvgVar = (alvg) i2;
        alvgVar.X(ydl.b, messageCoreData.B());
        alvgVar.X(ydl.f, messageCoreData.E());
        ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/analytics/statistics/UsageStatisticsImpl", "logRcsMessageDeliveryFailed", 2004, "UsageStatisticsImpl.java")).q("Logging FAILED RCS DELIVERY");
        mzr mzrVar = new mzr();
        mzrVar.e(messageCoreData);
        mzrVar.f(amlg.UNDEFINED);
        V(mzrVar.d());
    }

    @Override // defpackage.mho
    public final void V(mgo mgoVar) {
        boolean z;
        if (lgb.x(mgoVar.a.d()) == 4) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        qiu.h(aktp.ah(new qq(this, mgoVar, bd(mgoVar.a), 12, (byte[]) null), this.B));
    }

    @Override // defpackage.mho
    public final void W(MessageCoreData messageCoreData, amih amihVar) {
        if (!this.y.get()) {
            r();
            return;
        }
        aozy createBuilder = amgv.a.createBuilder();
        long s = messageCoreData.s();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amgv amgvVar = (amgv) apagVar;
        amgvVar.b |= 2;
        amgvVar.d = s;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        amgv amgvVar2 = (amgv) apagVar2;
        amgvVar2.c = 2;
        amgvVar2.b |= 1;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        amgv amgvVar3 = (amgv) createBuilder.b;
        amihVar.getClass();
        amgvVar3.f = amihVar;
        amgvVar3.b |= 8;
        bz(messageCoreData, (amgv) createBuilder.s());
    }

    @Override // defpackage.mho
    public final void X(int i2, int i3) {
        amee t = ((lfl) this.r.b()).t(i3);
        amgl amglVar = (amgl) amgu.a.createBuilder();
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar = (amgu) amglVar.b;
        amguVar.g = 1;
        amguVar.b |= 1;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar2 = (amgu) amglVar.b;
        amguVar2.h = 15;
        amguVar2.b |= 2;
        amhb x = ((lfl) this.s.b()).x(i3);
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar3 = (amgu) amglVar.b;
        amguVar3.i = x;
        amguVar3.b |= 4;
        String k2 = k(Optional.of(Integer.valueOf(i3)));
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar4 = (amgu) amglVar.b;
        k2.getClass();
        amguVar4.c |= 1;
        amguVar4.J = k2;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar5 = (amgu) amglVar.b;
        t.getClass();
        amguVar5.U = t;
        amguVar5.c |= 65536;
        int i4 = xyp.a;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar6 = (amgu) amglVar.b;
        int i5 = i4 - 1;
        if (i4 != 0) {
            amguVar6.N = i5;
            amguVar6.c |= 512;
            aozy createBuilder = amij.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amij amijVar = (amij) createBuilder.b;
            amijVar.b |= 1;
            amijVar.c = -1;
            aozy createBuilder2 = amer.a.createBuilder();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            amer amerVar = (amer) createBuilder2.b;
            amerVar.b |= 1;
            amerVar.c = i2;
            amer amerVar2 = (amer) createBuilder2.s();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amij amijVar2 = (amij) createBuilder.b;
            amerVar2.getClass();
            amijVar2.d = amerVar2;
            amijVar2.b |= 2;
            amii bx = bx(i3);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amij amijVar3 = (amij) createBuilder.b;
            amijVar3.e = bx.e;
            amijVar3.b |= 4;
            amij amijVar4 = (amij) createBuilder.s();
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar7 = (amgu) amglVar.b;
            amijVar4.getClass();
            amguVar7.f = amijVar4;
            amguVar7.e = 41;
            amij amijVar5 = (amij) amguVar7.f;
            amee ameeVar = amguVar7.U;
            if (ameeVar == null) {
                ameeVar = amee.b;
            }
            bG(amijVar5, ameeVar);
            ((mie) this.F.b()).k(amglVar, 2, 16, i3);
            amfq amfqVar = (amfq) amfr.a.createBuilder();
            amfp amfpVar = amfp.BUGLE_MESSAGE;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar = (amfr) amfqVar.b;
            amfrVar.i = amfpVar.dg;
            amfrVar.b |= 1;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar2 = (amfr) amfqVar.b;
            amgu amguVar8 = (amgu) amglVar.s();
            amguVar8.getClass();
            amfrVar2.k = amguVar8;
            amfrVar2.b |= 4;
            this.J.a().b(amfqVar, mbt.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
            return;
        }
        throw null;
    }

    @Override // defpackage.mho
    public final void Y(amrs amrsVar, MessageCoreData messageCoreData, int i2) {
        int i3;
        int i4;
        if (!this.y.get()) {
            r();
            return;
        }
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        if (messageCoreData != null) {
            mae maeVar = (mae) this.R.b();
            Iterator it = messageCoreData.W().iterator();
            while (true) {
                i3 = 2;
                if (!it.hasNext()) {
                    break;
                }
                MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
                aozy aozyVar = maeVar.b;
                boolean bw = messagePartCoreData.bw();
                int aT = a.aT(((amfk) maeVar.b.b).h);
                if (aT == 0) {
                    aT = 2;
                }
                int a = mae.a(bw, aT);
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                amfk amfkVar = (amfk) aozyVar.b;
                amfkVar.h = a.an(a);
                amfkVar.b |= 32;
                boolean bk = messagePartCoreData.bk();
                int aT2 = a.aT(((amfk) maeVar.b.b).i);
                if (aT2 == 0) {
                    aT2 = 2;
                }
                int a2 = mae.a(bk, aT2);
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                amfk amfkVar2 = (amfk) aozyVar.b;
                amfkVar2.i = a.an(a2);
                amfkVar2.b |= 64;
                boolean aW = messagePartCoreData.aW();
                int aT3 = a.aT(((amfk) maeVar.b.b).j);
                if (aT3 == 0) {
                    aT3 = 2;
                }
                int a3 = mae.a(aW, aT3);
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                amfk amfkVar3 = (amfk) aozyVar.b;
                amfkVar3.j = a.an(a3);
                amfkVar3.b |= 128;
                boolean bz = messagePartCoreData.bz();
                int aT4 = a.aT(((amfk) maeVar.b.b).k);
                if (aT4 == 0) {
                    aT4 = 2;
                }
                int a4 = mae.a(bz, aT4);
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                amfk amfkVar4 = (amfk) aozyVar.b;
                amfkVar4.k = a.an(a4);
                amfkVar4.b |= 256;
                boolean bl = messagePartCoreData.bl();
                int aT5 = a.aT(((amfk) maeVar.b.b).l);
                if (aT5 == 0) {
                    aT5 = 2;
                }
                int a5 = mae.a(bl, aT5);
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                amfk amfkVar5 = (amfk) aozyVar.b;
                amfkVar5.l = a.an(a5);
                amfkVar5.b |= 512;
                boolean bo = messagePartCoreData.bo();
                int aT6 = a.aT(((amfk) maeVar.b.b).m);
                if (aT6 != 0) {
                    i3 = aT6;
                }
                int a6 = mae.a(bo, i3);
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                amfk amfkVar6 = (amfk) aozyVar.b;
                amfkVar6.m = a.an(a6);
                amfkVar6.b |= 1024;
            }
            if (((rtz) maeVar.a.b()).c(messageCoreData.z()) == 0) {
                i4 = 2;
            } else {
                i4 = 3;
            }
            aozy aozyVar2 = maeVar.b;
            if (!aozyVar2.b.isMutable()) {
                aozyVar2.u();
            }
            amfk amfkVar7 = (amfk) aozyVar2.b;
            amfk amfkVar8 = amfk.a;
            amfkVar7.n = i4 - 1;
            amfkVar7.b |= 2048;
            if (messageCoreData.cI()) {
                i3 = 4;
            } else if (messageCoreData.cB()) {
                i3 = 3;
            } else if (true != messageCoreData.cQ()) {
                i3 = 1;
            }
            aozy aozyVar3 = maeVar.b;
            if (!aozyVar3.b.isMutable()) {
                aozyVar3.u();
            }
            amfk amfkVar9 = (amfk) aozyVar3.b;
            amfkVar9.p = i3 - 1;
            amfkVar9.b |= 8192;
            aozy createBuilder = amgx.a.createBuilder();
            if (!messageCoreData.B().b()) {
                String a7 = messageCoreData.B().a();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amgx amgxVar = (amgx) createBuilder.b;
                a7.getClass();
                amgxVar.b = 1 | amgxVar.b;
                amgxVar.c = a7;
            }
            messageCoreData.E().g(new leq(createBuilder, 17));
            aozy aozyVar4 = maeVar.b;
            if (!aozyVar4.b.isMutable()) {
                aozyVar4.u();
            }
            amfk amfkVar10 = (amfk) aozyVar4.b;
            amgx amgxVar2 = (amgx) createBuilder.s();
            amgxVar2.getClass();
            amfkVar10.s = amgxVar2;
            amfkVar10.b |= 65536;
            maeVar.c(i2);
            String k2 = k(Optional.of(Integer.valueOf(i2)));
            aozy aozyVar5 = maeVar.b;
            if (!aozyVar5.b.isMutable()) {
                aozyVar5.u();
            }
            amfk amfkVar11 = (amfk) aozyVar5.b;
            k2.getClass();
            amfkVar11.b |= 32768;
            amfkVar11.r = k2;
            amfk b = maeVar.b();
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar = (amfr) amfqVar.b;
            b.getClass();
            amfrVar.u = b;
            amfrVar.b |= 16384;
        }
        this.x.k(amfqVar, amrsVar);
    }

    @Override // defpackage.mho
    @Deprecated
    public final void Z(String str, int i2, String str2) {
        msh t = ((msk) this.O.b()).t(str, i2);
        if (!this.y.get()) {
            r();
        } else {
            ((mbl) this.S.b()).c("Bugle.VerifiedSms.MessageUnverifiable.Counts");
            qjb.a(new mib(this, t, str2, i2, 1), this.A);
        }
    }

    @Override // defpackage.mho, defpackage.adtj
    public final void a(aphp aphpVar) {
        if (((Boolean) i.e()).booleanValue()) {
            return;
        }
        akrc b = this.aj.b("UsageStatistics dispatchPlatformEvent");
        try {
            if (!this.y.get()) {
                r();
            } else {
                amfq amfqVar = (amfq) amfr.a.createBuilder();
                amfp amfpVar = amfp.BUGLE_TELEPHONY_EVENT;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                amfr amfrVar = (amfr) amfqVar.b;
                amfrVar.i = amfpVar.dg;
                amfrVar.b |= 1;
                aozy createBuilder = aphw.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                aphw aphwVar = (aphw) createBuilder.b;
                aphpVar.getClass();
                aphwVar.c = aphpVar;
                aphwVar.b = 3;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                amfr amfrVar2 = (amfr) amfqVar.b;
                aphw aphwVar2 = (aphw) createBuilder.s();
                aphwVar2.getClass();
                amfrVar2.z = aphwVar2;
                amfrVar2.b |= 1048576;
                this.x.j(amfqVar);
            }
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.mho
    public final void aA(int i2, int i3) {
        if (!this.y.get()) {
            r();
            return;
        }
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_CONSENT;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        aozy createBuilder = amet.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amet ametVar = (amet) apagVar;
        ametVar.d = i3 - 1;
        ametVar.b |= 2;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        amet ametVar2 = (amet) createBuilder.b;
        ametVar2.c = i2 - 1;
        ametVar2.b |= 1;
        amez amezVar = amez.a;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amet ametVar3 = (amet) createBuilder.b;
        amezVar.getClass();
        ametVar3.f = amezVar;
        ametVar3.b |= 8;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amet ametVar4 = (amet) createBuilder.s();
        ametVar4.getClass();
        amfrVar2.I = ametVar4;
        amfrVar2.c |= 64;
        this.x.j(amfqVar);
    }

    @Override // defpackage.mho
    public final void aB(int i2) {
        if (!this.y.get()) {
            r();
            return;
        }
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_CONTACT_BANNER;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        aozy createBuilder = amfc.a.createBuilder();
        aozy createBuilder2 = amjg.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        amjg amjgVar = (amjg) createBuilder2.b;
        amjgVar.c = i2 - 1;
        amjgVar.b |= 1;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amfc amfcVar = (amfc) createBuilder.b;
        amjg amjgVar2 = (amjg) createBuilder2.s();
        amjgVar2.getClass();
        amfcVar.c = amjgVar2;
        amfcVar.b = 2;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amfc amfcVar2 = (amfc) createBuilder.s();
        amfcVar2.getClass();
        amfrVar2.E = amfcVar2;
        amfrVar2.b |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
        this.x.j(amfqVar);
    }

    @Override // defpackage.mho
    public final void aC(ConversationIdType conversationIdType, amfe amfeVar, int i2, int i3, boolean z, Boolean bool, boolean z2, boolean z3, int i4, List list, boolean z4, int i5, boolean z5, int i6) {
        int i7;
        int s;
        if (!this.y.get()) {
            r();
            return;
        }
        amrs amrsVar = amrs.UNKNOWN_BUGLE_EVENT_CODE;
        if (z) {
            amrsVar = amrs.ACTIVE_USER_ENTER_CONVERSATION_WITH_UNREAD_MESSAGE;
            ah(z2);
            if (z4) {
                ai();
            }
        }
        aozy createBuilder = amfh.a.createBuilder();
        long a = ((lzz) this.q.b()).a(conversationIdType);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amfh amfhVar = (amfh) apagVar;
        amfhVar.b |= 65536;
        amfhVar.r = a;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        amfh amfhVar2 = (amfh) apagVar2;
        int i8 = 1;
        amfhVar2.e = 1;
        amfhVar2.b |= 1;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apag apagVar3 = createBuilder.b;
        amfh amfhVar3 = (amfh) apagVar3;
        amfhVar3.f = amfeVar.t;
        int i9 = 2;
        amfhVar3.b |= 2;
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        apag apagVar4 = createBuilder.b;
        amfh amfhVar4 = (amfh) apagVar4;
        amfhVar4.b |= 4;
        amfhVar4.g = i2;
        if (!apagVar4.isMutable()) {
            createBuilder.u();
        }
        apag apagVar5 = createBuilder.b;
        amfh amfhVar5 = (amfh) apagVar5;
        amfhVar5.b |= 8;
        amfhVar5.h = i3;
        if (!apagVar5.isMutable()) {
            createBuilder.u();
        }
        apag apagVar6 = createBuilder.b;
        amfh amfhVar6 = (amfh) apagVar6;
        amfhVar6.b |= 32;
        amfhVar6.i = z;
        if (!apagVar6.isMutable()) {
            createBuilder.u();
        }
        apag apagVar7 = createBuilder.b;
        amfh amfhVar7 = (amfh) apagVar7;
        int i10 = i5 - 1;
        if (i5 != 0) {
            amfhVar7.A = i10;
            amfhVar7.b |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
            if (!apagVar7.isMutable()) {
                createBuilder.u();
            }
            amfh amfhVar8 = (amfh) createBuilder.b;
            int i11 = i6 - 1;
            if (i6 != 0) {
                amfhVar8.C = i11;
                amfhVar8.b |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
                if (!list.isEmpty()) {
                    if (list.size() > 1) {
                        s = 2;
                    } else {
                        s = lfl.s((amgg) list.get(0));
                    }
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amfh amfhVar9 = (amfh) createBuilder.b;
                    amfhVar9.p = s - 1;
                    amfhVar9.b |= 16384;
                    createBuilder.aH(list);
                }
                if (bool == null) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amfh amfhVar10 = (amfh) createBuilder.b;
                    amfhVar10.l = 0;
                    amfhVar10.b |= 1024;
                } else {
                    if (true != bool.booleanValue()) {
                        i7 = 3;
                    } else {
                        i7 = 2;
                    }
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amfh amfhVar11 = (amfh) createBuilder.b;
                    amfhVar11.l = i7 - 1;
                    amfhVar11.b |= 1024;
                }
                if (z2) {
                    i9 = 3;
                }
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amfh amfhVar12 = (amfh) createBuilder.b;
                amfhVar12.k = i9 - 1;
                amfhVar12.b |= 512;
                amfg v = lgb.v(Integer.valueOf(i4));
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amfh amfhVar13 = (amfh) createBuilder.b;
                amfhVar13.j = v.f;
                amfhVar13.b |= 256;
                if (((Boolean) ((utz) yig.Q.get()).e()).booleanValue()) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amfh amfhVar14 = (amfh) createBuilder.b;
                    amfhVar14.b |= 1073741824;
                    amfhVar14.F = z3;
                }
                if (z5) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amfh amfhVar15 = (amfh) createBuilder.b;
                    amfhVar15.B = 1;
                    amfhVar15.b |= VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
                }
                amfr bi = bi((amfh) createBuilder.s());
                xze xzeVar = k;
                xyo c = xzeVar.c();
                c.H("Create or Open Conversation UNREAD");
                c.I(z);
                c.q();
                xyo c2 = xzeVar.c();
                c2.H("Create or Open Conversation IS XMS FALLBACK");
                amfh amfhVar16 = bi.l;
                if (amfhVar16 == null) {
                    amfhVar16 = amfh.a;
                }
                int R = a.R(amfhVar16.l);
                if (R != 0) {
                    i8 = R;
                }
                c2.F(i8 - 1);
                c2.q();
                xyo c3 = xzeVar.c();
                c3.H("Create or Open Conversation Is RCS");
                c3.I(z2);
                c3.q();
                xyo c4 = xzeVar.c();
                c4.H("Create or Open conversation CONVERSATION TYPE");
                c4.F(i4);
                c4.q();
                this.x.k((amfq) bi.toBuilder(), amrsVar);
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // defpackage.mho
    public final void aD(ConversationIdType conversationIdType, int i2) {
        if (this.y.get()) {
            aozy createBuilder = amfh.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            amfh amfhVar = (amfh) apagVar;
            amfhVar.x = 1;
            amfhVar.b |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            amfh amfhVar2 = (amfh) createBuilder.b;
            amfhVar2.d = Integer.valueOf(i2 - 1);
            amfhVar2.c = 29;
            bM(createBuilder, conversationIdType);
            return;
        }
        r();
    }

    @Override // defpackage.mho
    @Deprecated
    public final void aE(int i2) {
        bJ(i2, 4, amfp.BUGLE_EDIT_CONTACT);
    }

    @Override // defpackage.mho
    public final void aF(int i2, String str, int i3) {
        aozy createBuilder = amfs.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amfs amfsVar = (amfs) apagVar;
        amfsVar.c = i2 - 1;
        amfsVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        amfs amfsVar2 = (amfs) apagVar2;
        amfsVar2.e = i3 - 1;
        amfsVar2.b |= 4;
        if (str != null) {
            if (!apagVar2.isMutable()) {
                createBuilder.u();
            }
            amfs amfsVar3 = (amfs) createBuilder.b;
            amfsVar3.b |= 2;
            amfsVar3.d = str;
        }
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_FILE_PREVIEW_CLICK;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amfs amfsVar4 = (amfs) createBuilder.s();
        amfsVar4.getClass();
        amfrVar2.F = amfsVar4;
        amfrVar2.b |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
        this.x.j(amfqVar);
    }

    @Override // defpackage.mho
    public final void aG(int i2, int i3, int i4) {
        if (!this.y.get()) {
            r();
            return;
        }
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_GIF_CHOOSER;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        aozy createBuilder = amft.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amft amftVar = (amft) apagVar;
        amftVar.c = i2 - 1;
        amftVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        amft amftVar2 = (amft) apagVar2;
        int i5 = i3 - 1;
        if (i3 != 0) {
            amftVar2.d = i5;
            amftVar2.b |= 2;
            if (!apagVar2.isMutable()) {
                createBuilder.u();
            }
            amft amftVar3 = (amft) createBuilder.b;
            int i6 = i4 - 1;
            if (i4 != 0) {
                amftVar3.e = i6;
                amftVar3.b |= 4;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                amfr amfrVar2 = (amfr) amfqVar.b;
                amft amftVar4 = (amft) createBuilder.s();
                amftVar4.getClass();
                amfrVar2.A = amftVar4;
                amfrVar2.b |= 2097152;
                this.x.j(amfqVar);
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // defpackage.mho
    public final void aH(final MessageCoreData messageCoreData, final int i2, final int i3, final int i4, final int i5, final int i6, final amxb amxbVar, final int i7, final int i8, final Optional optional, final Optional optional2, final Optional optional3) {
        qiu.h(aktp.ah(new Runnable() { // from class: mhs
            @Override // java.lang.Runnable
            public final void run() {
                mic.this.bv(messageCoreData, i2, i3, i4, i5, i6, amxbVar, i7, i8, optional, optional2, Optional.empty(), optional3);
            }
        }, this.B));
    }

    @Override // defpackage.mho
    public final void aI(MessageCoreData messageCoreData, int i2, int i3, int i4, int i5, amxb amxbVar, int i6, int i7, Optional optional, Optional optional2) {
        new mhi(messageCoreData, i3, i4, i5);
        if (!this.y.get()) {
            r();
        } else {
            aH(messageCoreData, i2, i3, i4, i5, 6, amxbVar, i6, i7, Optional.empty(), optional, optional2);
        }
    }

    @Override // defpackage.mho
    public final void aJ(MessageCoreData messageCoreData, int i2, long j2, boolean z, int i3) {
        new mhf(messageCoreData);
        if (!this.y.get()) {
            r();
            return;
        }
        aozy createBuilder = amje.a.createBuilder();
        int e = e();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amje amjeVar = (amje) createBuilder.b;
        amjeVar.b |= 1;
        amjeVar.c = e;
        String d = ((mie) this.F.b()).d();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amje amjeVar2 = (amje) createBuilder.b;
        d.getClass();
        amjeVar2.b |= 4;
        amjeVar2.e = d;
        amje amjeVar3 = (amje) createBuilder.s();
        amgl amglVar = (amgl) amgu.a.createBuilder();
        long a = ((lzz) this.q.b()).a(messageCoreData.z());
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar = (amgu) amglVar.b;
        amguVar.b |= 1073741824;
        amguVar.G = a;
        long s = messageCoreData.s();
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar2 = (amgu) amglVar.b;
        amguVar2.b |= 128;
        amguVar2.n = s;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar3 = (amgu) amglVar.b;
        int i4 = 2;
        amguVar3.g = 2;
        amguVar3.b |= 1;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar4 = (amgu) amglVar.b;
        amguVar4.h = 3;
        amguVar4.b |= 2;
        amhb x = ((lfl) this.s.b()).x(i2);
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar5 = (amgu) amglVar.b;
        amguVar5.i = x;
        amguVar5.b |= 4;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar6 = (amgu) amglVar.b;
        amjeVar3.getClass();
        amguVar6.y = amjeVar3;
        amguVar6.b |= 4194304;
        amgw j3 = ((mie) this.F.b()).j(((MessageData) messageCoreData).i, 4);
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar7 = (amgu) amglVar.b;
        j3.getClass();
        amguVar7.j = j3;
        amguVar7.b |= 8;
        int bs = bs(messageCoreData.z());
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar8 = (amgu) amglVar.b;
        amguVar8.x = bs - 1;
        amguVar8.b |= 2097152;
        int i5 = xyp.a;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar9 = (amgu) amglVar.b;
        int i6 = i5 - 1;
        Integer num = null;
        if (i5 != 0) {
            amguVar9.N = i6;
            amguVar9.c |= 512;
            if (true != messageCoreData.cn()) {
                i4 = 3;
            }
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar10 = (amgu) amglVar.b;
            amguVar10.S = i4 - 1;
            amguVar10.c |= 16384;
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar11 = (amgu) amglVar.b;
            int i7 = i3 - 1;
            if (i3 != 0) {
                amguVar11.Y = i7;
                amguVar11.c |= 524288;
                boolean cz = messageCoreData.cz();
                if (!amglVar.b.isMutable()) {
                    amglVar.u();
                }
                amgu amguVar12 = (amgu) amglVar.b;
                amguVar12.c |= 1073741824;
                amguVar12.aj = cz;
                smr q = ((rtz) this.o.b()).q(messageCoreData.z());
                if (q != null) {
                    num = Integer.valueOf(q.h());
                }
                amfg v = lgb.v(num);
                if (!amglVar.b.isMutable()) {
                    amglVar.u();
                }
                amgu amguVar13 = (amgu) amglVar.b;
                amguVar13.r = v.f;
                amguVar13.b |= 16384;
                ((mie) this.F.b()).e(amglVar, i2);
                ((mie) this.F.b()).k(amglVar, 3, 4, i2);
                if (((oir) this.av.b()).a()) {
                    qiu.h(((mgl) this.aw.b()).a(messageCoreData).h(new ijq(this, amglVar, 19), this.B));
                } else {
                    bo(amglVar);
                }
                if (!z) {
                    bm(j2, "Bugle.Success.Attachment.Size.Bucket.Mms");
                    ((mbl) this.S.b()).c("Bugle.DataModel.Action.Download.Success.Count.Mms");
                    return;
                }
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // defpackage.mho
    public final void aK(amhc amhcVar, int i2, List list) {
        if (!this.y.get()) {
            r();
            return;
        }
        aozy createBuilder = amls.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amls amlsVar = (amls) createBuilder.b;
        amlsVar.c = i2 - 1;
        amlsVar.b |= 1;
        if (list != null && !list.isEmpty()) {
            Stream stream = Collection.EL.stream(list);
            lzz lzzVar = (lzz) this.q.b();
            lzzVar.getClass();
            List list2 = (List) stream.map(new lut(lzzVar, 18)).collect(Collectors.toCollection(new mcw(6)));
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amls amlsVar2 = (amls) createBuilder.b;
            apar aparVar = amlsVar2.d;
            if (!aparVar.c()) {
                amlsVar2.d = apag.mutableCopy(aparVar);
            }
            aoyj.addAll(list2, amlsVar2.d);
        }
        aozy createBuilder2 = amhd.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar = createBuilder2.b;
        amhd amhdVar = (amhd) apagVar;
        amhdVar.c = amhcVar.e;
        amhdVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder2.u();
        }
        amhd amhdVar2 = (amhd) createBuilder2.b;
        amls amlsVar3 = (amls) createBuilder.s();
        amlsVar3.getClass();
        amhdVar2.d = amlsVar3;
        amhdVar2.b |= 2;
        amhd amhdVar3 = (amhd) createBuilder2.s();
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_NOTIFICATION;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amhdVar3.getClass();
        amfrVar2.X = amhdVar3;
        amfrVar2.c |= VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
        this.x.j(amfqVar);
    }

    @Override // defpackage.mho
    public final void aL(int i2, int i3, String str) {
        if (!this.y.get()) {
            r();
            return;
        }
        aozy createBuilder = amhq.a.createBuilder();
        if (str != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amhq amhqVar = (amhq) createBuilder.b;
            amhqVar.b |= 1;
            amhqVar.c = str;
        }
        aozy createBuilder2 = amhp.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar = createBuilder2.b;
        amhp amhpVar = (amhp) apagVar;
        amhpVar.f = i2 - 1;
        amhpVar.b |= 8;
        if (!apagVar.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar2 = createBuilder2.b;
        amhp amhpVar2 = (amhp) apagVar2;
        amhpVar2.g = i3 - 1;
        amhpVar2.b |= 16;
        if (!apagVar2.isMutable()) {
            createBuilder2.u();
        }
        amhp amhpVar3 = (amhp) createBuilder2.b;
        amhq amhqVar2 = (amhq) createBuilder.s();
        amhqVar2.getClass();
        amhpVar3.c = amhqVar2;
        amhpVar3.b |= 1;
        amhp amhpVar4 = (amhp) createBuilder2.s();
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_RBM_BUSINESS_INFO;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amhpVar4.getClass();
        amfrVar2.x = amhpVar4;
        amfrVar2.b |= 131072;
        this.x.j(amfqVar);
    }

    @Override // defpackage.mho
    public final void aM(int i2, String str) {
        if (!this.y.get()) {
            r();
            return;
        }
        aozy createBuilder = amhq.a.createBuilder();
        if (str != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amhq amhqVar = (amhq) createBuilder.b;
            amhqVar.b |= 1;
            amhqVar.c = str;
        }
        aozy createBuilder2 = amhp.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar = createBuilder2.b;
        amhp amhpVar = (amhp) apagVar;
        amhpVar.h = i2 - 1;
        amhpVar.b |= 32;
        if (!apagVar.isMutable()) {
            createBuilder2.u();
        }
        amhp amhpVar2 = (amhp) createBuilder2.b;
        amhq amhqVar2 = (amhq) createBuilder.s();
        amhqVar2.getClass();
        amhpVar2.c = amhqVar2;
        amhpVar2.b |= 1;
        amhp amhpVar3 = (amhp) createBuilder2.s();
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_RBM_BUSINESS_INFO;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amhpVar3.getClass();
        amfrVar2.x = amhpVar3;
        amfrVar2.b |= 131072;
        this.x.j(amfqVar);
    }

    @Override // defpackage.mho
    public final void aN(int i2, amho amhoVar, String str) {
        if (!this.y.get()) {
            r();
            return;
        }
        aozy createBuilder = amhq.a.createBuilder();
        if (str != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amhq amhqVar = (amhq) createBuilder.b;
            amhqVar.b |= 1;
            amhqVar.c = str;
        }
        aozy createBuilder2 = amhp.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar = createBuilder2.b;
        amhp amhpVar = (amhp) apagVar;
        amhpVar.d = i2 - 1;
        amhpVar.b |= 2;
        if (!apagVar.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar2 = createBuilder2.b;
        amhp amhpVar2 = (amhp) apagVar2;
        amhpVar2.e = amhoVar.h;
        amhpVar2.b |= 4;
        if (!apagVar2.isMutable()) {
            createBuilder2.u();
        }
        amhp amhpVar3 = (amhp) createBuilder2.b;
        amhq amhqVar2 = (amhq) createBuilder.s();
        amhqVar2.getClass();
        amhpVar3.c = amhqVar2;
        amhpVar3.b |= 1;
        amhp amhpVar4 = (amhp) createBuilder2.s();
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_RBM_BUSINESS_INFO;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amhpVar4.getClass();
        amfrVar2.x = amhpVar4;
        amfrVar2.b |= 131072;
        this.x.j(amfqVar);
    }

    @Override // defpackage.mho
    public final void aO(final MessageCoreData messageCoreData, final int i2, final amxo amxoVar, final int i3, final int i4) {
        d.t(messageCoreData.cI(), "Requires RCS message to log correct info");
        if (messageCoreData.y() != null) {
            qiu.h(messageCoreData.y().f().h(new algk() { // from class: mhx
                @Override // defpackage.algk
                public final Object apply(Object obj) {
                    mic.this.bw(messageCoreData, i2, amxoVar, i3, i4);
                    return null;
                }
            }, this.B));
        } else {
            bw(messageCoreData, i2, amxoVar, i3, i4);
        }
    }

    @Override // defpackage.mho
    public final void aP(int i2) {
        aQ(i2, 2);
    }

    @Override // defpackage.mho
    public final void aQ(int i2, int i3) {
        if (!this.y.get()) {
            r();
            return;
        }
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_SHAKE_TO_REPORT;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        aozy createBuilder = ammp.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ammp ammpVar = (ammp) apagVar;
        ammpVar.c = i2 - 1;
        ammpVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ammp ammpVar2 = (ammp) createBuilder.b;
        ammpVar2.d = i3 - 1;
        ammpVar2.b |= 2;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        ammp ammpVar3 = (ammp) createBuilder.s();
        ammpVar3.getClass();
        amfrVar2.L = ammpVar3;
        amfrVar2.c |= 4096;
        this.x.j(amfqVar);
    }

    @Override // defpackage.mho
    public final void aR(int i2) {
        zxy zxyVar = (zxy) this.U.b();
        int i3 = i2 - 1;
        if (((ykw) zxyVar.b).d("fast_track_onboarding_progress", 0) < i3) {
            ((ykw) zxyVar.b).j("fast_track_onboarding_progress", i3);
        }
    }

    @Override // defpackage.mho
    public final void aS(int i2) {
        zxy zxyVar = (zxy) this.U.b();
        int i3 = i2 - 1;
        if (((ykw) zxyVar.b).d("rcs_onboarding_progress", 0) < i3) {
            ((ykw) zxyVar.b).j("rcs_onboarding_progress", i3);
        }
    }

    @Override // defpackage.mho
    public final void aT(MessageCoreData messageCoreData, int i2, int i3, int i4, int i5, Optional optional) {
        aI(messageCoreData, i2, -2, i3, -1, null, i4, i5, Optional.empty(), optional);
    }

    @Override // defpackage.mho
    public final void aU(MessageCoreData messageCoreData, amgu amguVar) {
        boolean z;
        if (lgb.x(messageCoreData.d()) != 3) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        if (!this.y.get()) {
            k.l("Clearcut loggings are disabled.");
            return;
        }
        d.s(messageCoreData.cJ());
        MessagePartCoreData G = messageCoreData.G();
        G.getClass();
        bm(G.p(), "Bugle.Download.Failure.Attachment.Size.Bucket.Rcs");
        amxo b = amxo.b(amguVar.aa);
        if (b == null) {
            b = amxo.UNKNOWN_RCS_TYPE;
        }
        int ordinal = b.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            throw new IllegalStateException("Not RCS.");
                        }
                    } else {
                        ((mbl) this.S.b()).c("Bugle.DataModel.Action.Download.Failure.Count.Rcs.Tachygram");
                    }
                } else {
                    ((mbl) this.S.b()).c("Bugle.DataModel.Action.Download.Failure.Count.Rcs.Smapi");
                }
            } else {
                ((mbl) this.S.b()).c("Bugle.DataModel.Action.Download.Failure.Count.Rcs");
            }
            amxo b2 = amxo.b(amguVar.aa);
            if (b2 == null) {
                b2 = amxo.UNKNOWN_RCS_TYPE;
            }
            Optional of = Optional.of(b2);
            amgn b3 = amgn.b(amguVar.ak);
            if (b3 == null) {
                b3 = amgn.UNKNOWN_FORMAT_TYPE;
            }
            aH(messageCoreData, -1, -2, 0, -1, 7, null, 1, 0, of, Optional.of(b3), Optional.empty());
            return;
        }
        throw new IllegalStateException("Unknown RCS transport type.");
    }

    @Override // defpackage.mho
    public final void aV(MessageCoreData messageCoreData) {
        boolean z;
        if (messageCoreData.E().b != null) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        aT(messageCoreData, -1, 0, 1, 0, Optional.empty());
    }

    @Override // defpackage.mho
    public final void aW() {
        if (!this.y.get()) {
            r();
            return;
        }
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_CONSENT;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        aozy createBuilder = amet.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amet ametVar = (amet) apagVar;
        ametVar.d = 1;
        ametVar.b |= 2;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        amet ametVar2 = (amet) createBuilder.b;
        ametVar2.c = 3;
        ametVar2.b = 1 | ametVar2.b;
        ameu ameuVar = ameu.a;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amet ametVar3 = (amet) createBuilder.b;
        ameuVar.getClass();
        ametVar3.j = ameuVar;
        ametVar3.b |= 128;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amet ametVar4 = (amet) createBuilder.s();
        ametVar4.getClass();
        amfrVar2.I = ametVar4;
        amfrVar2.c |= 64;
        this.x.j(amfqVar);
    }

    @Override // defpackage.mho
    public final void aX(int i2) {
        if (!this.y.get()) {
            r();
            return;
        }
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_CONSENT;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        aozy createBuilder = amet.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amet ametVar = (amet) apagVar;
        ametVar.d = 2;
        ametVar.b = 2 | ametVar.b;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        amet ametVar2 = (amet) createBuilder.b;
        ametVar2.c = i2 - 1;
        ametVar2.b |= 1;
        amey ameyVar = amey.a;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amet ametVar3 = (amet) createBuilder.b;
        ameyVar.getClass();
        ametVar3.g = ameyVar;
        ametVar3.b |= 16;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amet ametVar4 = (amet) createBuilder.s();
        ametVar4.getClass();
        amfrVar2.I = ametVar4;
        amfrVar2.c |= 64;
        this.x.j(amfqVar);
    }

    @Override // defpackage.mho
    public final void aY() {
        if (!this.y.get()) {
            r();
            return;
        }
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        aozy createBuilder = amga.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amga amgaVar = (amga) apagVar;
        amgaVar.c = 1;
        amgaVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        amga amgaVar2 = (amga) createBuilder.b;
        amgaVar2.d = 1;
        amgaVar2.b |= 2;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amga amgaVar3 = (amga) createBuilder.s();
        amgaVar3.getClass();
        amfrVar.t = amgaVar3;
        amfrVar.b |= 8192;
        this.x.j(amfqVar);
    }

    @Override // defpackage.mho
    public final void aZ(MessageCoreData messageCoreData, int i2, mbh mbhVar, amgl amglVar) {
        MessageUsageStatisticsData messageUsageStatisticsData = ((MessageData) messageCoreData).k;
        if (messageUsageStatisticsData != null) {
            qiu.h(messageUsageStatisticsData.f().h(new mhz(this, messageCoreData, i2, mbhVar, amglVar, 0), this.B));
        } else {
            br(messageCoreData, i2, mbhVar, amglVar);
        }
    }

    @Override // defpackage.mho
    public final void aa(amir amirVar, yua yuaVar, long j2) {
        if (this.y.get()) {
            String str = (String) alor.o(amir.VERIFIED, "Bugle.VerifiedSms.Grpc.Successful.Verified.Latency", amir.UNVERIFIED, "Bugle.VerifiedSms.Grpc.Successful.Unverified.Latency", amir.NA, "Bugle.VerifiedSms.Grpc.Successful.Na.Latency", amir.UNKNOWN, "Bugle.VerifiedSms.Grpc.Successful.Unknown.Latency").get(amirVar);
            if (str != null) {
                ((mbl) this.S.b()).g(str, j2);
            }
            amfq amfqVar = (amfq) amfr.a.createBuilder();
            amfp amfpVar = amfp.BUGLE_VERIFIED_SMS;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar = (amfr) amfqVar.b;
            amfrVar.i = amfpVar.dg;
            amfrVar.b |= 1;
            aozy createBuilder = amit.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            amit amitVar = (amit) apagVar;
            amitVar.c = amirVar.g;
            amitVar.b |= 1;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            amit amitVar2 = (amit) createBuilder.b;
            amitVar2.b |= 2;
            amitVar2.d = j2;
            amis amisVar = (amis) bh().getOrDefault(yuaVar, amis.UNKNOWN_TYPE);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amit amitVar3 = (amit) createBuilder.b;
            amitVar3.e = amisVar.f;
            amitVar3.b |= 4;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar2 = (amfr) amfqVar.b;
            amit amitVar4 = (amit) createBuilder.s();
            amitVar4.getClass();
            amfrVar2.K = amitVar4;
            amfrVar2.c |= 1024;
            this.x.j(amfqVar);
            return;
        }
        r();
    }

    @Override // defpackage.mho
    @Deprecated
    public final void ab(String str, int i2, String str2, String str3, tqr tqrVar) {
        bI(str, i2, str2, 5, str3, tqrVar);
    }

    @Override // defpackage.mho
    public final void ac(int i2) {
        ((mbl) this.S.b()).e("Bugle.Media.VideoViewer.Launch.Counts", i2);
    }

    @Override // defpackage.mho
    public final void ad(amgj amgjVar, atok atokVar, mbh mbhVar) {
        synchronized (this.m) {
            Map map = (Map) this.m.get(atokVar.b);
            if (map == null) {
                map = new ConcurrentHashMap();
                this.m.put(atokVar.b, map);
            }
            map.put(amgjVar, mbhVar);
        }
    }

    @Override // defpackage.mho
    public final void ae() {
        yyb.aO(albo.bF(((mdt) this.z.b()).e(-1L), ((mdt) this.z.b()).g(-1L)), "BugleUsageStatistics", "Failed to clear downloaded and upload report bytes");
    }

    @Override // defpackage.mho
    public final void af(MessageCoreData messageCoreData) {
        if (messageCoreData.y() != null) {
            qiu.h(messageCoreData.y().f().h(new ijq(this, messageCoreData, 18), this.B));
        } else {
            this.D.e(messageCoreData);
        }
    }

    @Override // defpackage.mho
    public final void ag(int i2) {
        ahka ahkaVar;
        mgv mgvVar = (mgv) this.V.b();
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 3) {
                    ahkaVar = mgv.a;
                } else {
                    ahkaVar = mgv.g;
                }
            } else {
                ahkaVar = mgv.f;
            }
        } else {
            ahkaVar = mgv.e;
        }
        mgvVar.e(ahkaVar);
        ((mgv) this.V.b()).e(lgb.u(i2));
    }

    @Override // defpackage.mho
    public final void ah(boolean z) {
        long epochMilli = this.v.f().toEpochMilli();
        yyb.aO(albo.bF(((mdt) this.z.b()).c.b(akto.a(new mdq(epochMilli, 1)), andi.a), ((mdt) this.z.b()).f(epochMilli)), "BugleUsageStatistics", "Failed to update lastActiveEvent|lastPassiveEvent");
        if (((pes) this.as.b()).a()) {
            ((lfl) this.at.b()).l(epochMilli);
            ((lfl) this.at.b()).k(epochMilli);
        }
        if (z) {
            yyb.aO(((mdt) this.z.b()).c.b(akto.a(new mdq(epochMilli, 4)), andi.a), "BugleUsageStatistics", "Failed to update LastActiveRcsEventTimeMillis");
            if (((pes) this.as.b()).a()) {
                ((lfl) this.at.b()).m(epochMilli);
            }
        }
    }

    @Override // defpackage.mho
    public final void ai() {
        ((ykw) this.T.b()).k("last_rbm_active_event_time_millis", this.v.f().toEpochMilli());
    }

    @Override // defpackage.mho
    public final void aj() {
        ((ykw) this.T.b()).k("last_rbm_interactive_event_time_millis", this.v.f().toEpochMilli());
    }

    @Override // defpackage.mho
    public final void ak() {
        ((ykw) this.T.b()).k("last_video_call_button_click_time_millis", this.v.f().toEpochMilli());
    }

    @Override // defpackage.mho
    public final boolean al() {
        return this.y.get();
    }

    @Override // defpackage.mho
    public final void am(msh mshVar, tqr tqrVar, String str) {
        amir amirVar = (amir) bg().getOrDefault(tqrVar, amir.UNKNOWN);
        String ag = albo.ag(mshVar.m());
        if (mshVar.m() != null && amir.VERIFIED != amirVar) {
            ag = yyb.bh(ag).toString();
        }
        String str2 = ag;
        if (!this.y.get()) {
            r();
        } else {
            qjb.a(new eex(this, str2, str, tqrVar, 11), this.A);
        }
    }

    @Override // defpackage.mho
    public final void an(int i2, int i3, int i4, long j2, int i5, long j3, ConversationIdType conversationIdType) {
        bA(-1, i2, i3, j2, i5, i4, j3, true, conversationIdType);
    }

    @Override // defpackage.mho
    public final void ao(rve rveVar, amxb amxbVar, amxo amxoVar) {
        bK(rveVar, null, 1, 14, amxbVar, amxoVar);
    }

    @Override // defpackage.mho
    public final void ap(MessageCoreData messageCoreData) {
        akrh e = aktp.e("UsageStatisticsImpl::logMessageCreated");
        try {
            new mha(messageCoreData);
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

    @Override // defpackage.mho
    public final void aq(MessageCoreData messageCoreData, Optional optional, amxo amxoVar, mbh mbhVar) {
        if (lgb.x(messageCoreData.d()) != 4) {
            new mhb(messageCoreData, "");
        }
        bL(messageCoreData, 10, optional, Optional.of(amxoVar), mbhVar);
    }

    @Override // defpackage.mho
    public final void ar(MessageCoreData messageCoreData, Optional optional) {
        bL(messageCoreData, 9, optional, Optional.empty(), lgb.L(this.v));
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x005b, code lost:
    
        if (r0.equals(r1) == false) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.mho
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void as(android.app.NotificationChannel r6, android.app.NotificationChannel r7) {
        /*
            r5 = this;
            if (r6 == 0) goto Ld1
            if (r7 != 0) goto L6
            goto Ld1
        L6:
            java.lang.String r0 = defpackage.bl$$ExternalSyntheticApiModelOutline0.m98m(r6)
            if (r0 == 0) goto Lc9
            java.lang.String r0 = defpackage.bl$$ExternalSyntheticApiModelOutline0.m98m(r6)
            java.lang.String r1 = defpackage.bl$$ExternalSyntheticApiModelOutline0.m98m(r7)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1c
            goto Lc9
        L1c:
            int r0 = defpackage.bl$$ExternalSyntheticApiModelOutline0.m(r6)
            int r1 = defpackage.bl$$ExternalSyntheticApiModelOutline0.m(r7)
            r2 = 1
            java.lang.String r3 = "Bugle.UI.PeopleAndOptions.Notification.Setting.Changes"
            if (r0 == r1) goto L48
            int r0 = defpackage.bl$$ExternalSyntheticApiModelOutline0.m(r7)
            r1 = 2
            if (r0 == r2) goto L3d
            r4 = 3
            if (r0 == r1) goto L3c
            r1 = 4
            if (r0 == r4) goto L3d
            if (r0 == r1) goto L3a
            r1 = r2
            goto L3d
        L3a:
            r1 = 5
            goto L3d
        L3c:
            r1 = r4
        L3d:
            armf r0 = r5.S
            java.lang.Object r0 = r0.b()
            mbl r0 = (defpackage.mbl) r0
            r0.e(r3, r1)
        L48:
            android.net.Uri r0 = defpackage.bl$$ExternalSyntheticApiModelOutline0.m92m(r6)
            android.net.Uri r1 = defpackage.bl$$ExternalSyntheticApiModelOutline0.m92m(r7)
            if (r0 != 0) goto L55
            if (r1 != 0) goto L5d
            r1 = 0
        L55:
            if (r0 == 0) goto L69
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L69
        L5d:
            armf r0 = r5.S
            java.lang.Object r0 = r0.b()
            mbl r0 = (defpackage.mbl) r0
            r1 = 6
            r0.e(r3, r1)
        L69:
            boolean r0 = defpackage.bl$$ExternalSyntheticApiModelOutline0.m110m$1(r6)
            boolean r1 = defpackage.bl$$ExternalSyntheticApiModelOutline0.m110m$1(r7)
            if (r0 == r1) goto L88
            armf r0 = r5.S
            java.lang.Object r0 = r0.b()
            mbl r0 = (defpackage.mbl) r0
            boolean r1 = defpackage.bl$$ExternalSyntheticApiModelOutline0.m110m$1(r7)
            if (r2 == r1) goto L84
            r1 = 8
            goto L85
        L84:
            r1 = 7
        L85:
            r0.e(r3, r1)
        L88:
            boolean r0 = defpackage.bl$$ExternalSyntheticApiModelOutline0.m104m(r6)
            boolean r1 = defpackage.bl$$ExternalSyntheticApiModelOutline0.m104m(r7)
            if (r0 == r1) goto La8
            armf r0 = r5.S
            java.lang.Object r0 = r0.b()
            mbl r0 = (defpackage.mbl) r0
            boolean r1 = defpackage.bl$$ExternalSyntheticApiModelOutline0.m104m(r7)
            if (r2 == r1) goto La3
            r1 = 10
            goto La5
        La3:
            r1 = 9
        La5:
            r0.e(r3, r1)
        La8:
            boolean r6 = defpackage.ex$$ExternalSyntheticApiModelOutline1.m381m(r6)
            boolean r0 = defpackage.ex$$ExternalSyntheticApiModelOutline1.m381m(r7)
            if (r6 == r0) goto Lc8
            armf r6 = r5.S
            java.lang.Object r6 = r6.b()
            mbl r6 = (defpackage.mbl) r6
            boolean r7 = defpackage.ex$$ExternalSyntheticApiModelOutline1.m381m(r7)
            if (r2 == r7) goto Lc3
            r7 = 12
            goto Lc5
        Lc3:
            r7 = 11
        Lc5:
            r6.e(r3, r7)
        Lc8:
            return
        Lc9:
            xze r6 = defpackage.mic.k
            java.lang.String r7 = "Before channel does not match after channel."
            r6.q(r7)
            return
        Ld1:
            xze r6 = defpackage.mic.k
            java.lang.String r7 = "Before channel or after channel is null."
            r6.q(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mic.as(android.app.NotificationChannel, android.app.NotificationChannel):void");
    }

    @Override // defpackage.mho
    public final void at() {
    }

    @Override // defpackage.mho
    public final int au() {
        ApplicationInfo b = adwi.b(this.ah);
        if (b != null) {
            if (!adwi.j(b.flags)) {
                return 3;
            }
            if (!b.enabled) {
                return 4;
            }
            if (!agkx.U(this.ah)) {
                return 5;
            }
            return 2;
        }
        return 1;
    }

    @Override // defpackage.mho
    @Deprecated
    public final void av(int i2) {
        bJ(i2, 3, amfp.BUGLE_ADD_CONTACT);
    }

    @Override // defpackage.mho
    public final void aw(String str, int i2) {
        aF(3, str, i2);
    }

    @Override // defpackage.mho
    public final void ax(int i2) {
        if (!this.y.get()) {
            r();
            return;
        }
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_CONSENT;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        aozy createBuilder = amet.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amet ametVar = (amet) apagVar;
        ametVar.d = 1;
        ametVar.b |= 2;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        amet ametVar2 = (amet) createBuilder.b;
        ametVar2.c = i2 - 1;
        ametVar2.b |= 1;
        amev amevVar = amev.a;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amet ametVar3 = (amet) createBuilder.b;
        amevVar.getClass();
        ametVar3.h = amevVar;
        ametVar3.b |= 32;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amet ametVar4 = (amet) createBuilder.s();
        ametVar4.getClass();
        amfrVar2.I = ametVar4;
        amfrVar2.c |= 64;
        this.x.j(amfqVar);
    }

    @Override // defpackage.mho
    public final void ay(int i2, int i3) {
        if (!this.y.get()) {
            r();
            return;
        }
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_CONSENT;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        aozy createBuilder = amet.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amet ametVar = (amet) apagVar;
        ametVar.d = i3 - 1;
        ametVar.b |= 2;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        amet ametVar2 = (amet) createBuilder.b;
        ametVar2.c = i2 - 1;
        ametVar2.b |= 1;
        amex amexVar = amex.a;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amet ametVar3 = (amet) createBuilder.b;
        amexVar.getClass();
        ametVar3.i = amexVar;
        ametVar3.b |= 64;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amet ametVar4 = (amet) createBuilder.s();
        ametVar4.getClass();
        amfrVar2.I = ametVar4;
        amfrVar2.c |= 64;
        this.x.j(amfqVar);
    }

    @Override // defpackage.mho
    public final void az(int i2) {
        if (!this.y.get()) {
            r();
            return;
        }
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_CONSENT;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        aozy createBuilder = amet.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amet ametVar = (amet) apagVar;
        ametVar.d = 1;
        ametVar.b |= 2;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        amet ametVar2 = (amet) createBuilder.b;
        ametVar2.c = i2 - 1;
        ametVar2.b |= 1;
        amew amewVar = amew.a;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amet ametVar3 = (amet) createBuilder.b;
        amewVar.getClass();
        ametVar3.e = amewVar;
        ametVar3.b |= 4;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amet ametVar4 = (amet) createBuilder.s();
        ametVar4.getClass();
        amfrVar2.I = ametVar4;
        amfrVar2.c |= 64;
        this.x.j(amfqVar);
    }

    @Override // defpackage.mho, defpackage.adtj
    public final void b(aphq aphqVar) {
        if (((Boolean) i.e()).booleanValue()) {
            return;
        }
        akrc b = this.aj.b("UsageStatistics dispatchSimEventDelay");
        try {
            if (!this.y.get()) {
                r();
            } else {
                amfq amfqVar = (amfq) amfr.a.createBuilder();
                amfp amfpVar = amfp.BUGLE_TELEPHONY_EVENT;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                amfr amfrVar = (amfr) amfqVar.b;
                amfrVar.i = amfpVar.dg;
                amfrVar.b |= 1;
                aozy createBuilder = aphw.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                aphw aphwVar = (aphw) createBuilder.b;
                aphqVar.getClass();
                aphwVar.c = aphqVar;
                aphwVar.b = 2;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                amfr amfrVar2 = (amfr) amfqVar.b;
                aphw aphwVar2 = (aphw) createBuilder.s();
                aphwVar2.getClass();
                amfrVar2.z = aphwVar2;
                amfrVar2.b |= 1048576;
                this.x.j(amfqVar);
            }
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.mho
    public final void ba(amhc amhcVar) {
        aK(amhcVar, 3, null);
    }

    @Override // defpackage.mho
    public final void bb(int i2) {
        if (!this.y.get()) {
            r();
            return;
        }
        aozy createBuilder = amhe.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amhe amheVar = (amhe) apagVar;
        amheVar.c = 1;
        amheVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        amhe amheVar2 = (amhe) createBuilder.b;
        amheVar2.d = i2 - 1;
        amheVar2.b |= 4;
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_USER_AND_DEVICE_INFO;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        aozy createBuilder2 = ameq.a.createBuilder();
        aozy createBuilder3 = amhf.a.createBuilder();
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        amhf amhfVar = (amhf) createBuilder3.b;
        amhe amheVar3 = (amhe) createBuilder.s();
        amheVar3.getClass();
        apax apaxVar = amhfVar.c;
        if (!apaxVar.c()) {
            amhfVar.c = apag.mutableCopy(apaxVar);
        }
        amhfVar.c.add(amheVar3);
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        ameq ameqVar = (ameq) createBuilder2.b;
        amhf amhfVar2 = (amhf) createBuilder3.s();
        amhfVar2.getClass();
        ameqVar.g = amhfVar2;
        ameqVar.b |= 16;
        qiu.h(bf().h(new kxr(this, amfqVar, (ameq) createBuilder2.s(), 8), andi.a));
    }

    @Override // defpackage.mho
    public final lfl bc() {
        if (this.y.get()) {
            return (lfl) this.ai.b();
        }
        return null;
    }

    public final int bd(MessageCoreData messageCoreData) {
        SelfIdentityId be;
        qwm c;
        if (messageCoreData != null && (be = be(messageCoreData)) != null && (c = ((ryg) this.Y.b()).c(be)) != null) {
            return c.e();
        }
        return -1;
    }

    final SelfIdentityId be(MessageCoreData messageCoreData) {
        rto m;
        akrh e = aktp.e("UsageStatisticsImpl#getMessageSelfParticipantId");
        try {
            SelfIdentityId v = messageCoreData.v();
            if (v != null) {
                e.close();
                return v;
            }
            ConversationIdType z = messageCoreData.z();
            SelfIdentityId selfIdentityId = null;
            if (!z.b() && (m = ((uie) this.N.b()).m(z)) != null) {
                selfIdentityId = m.f();
            }
            e.close();
            return selfIdentityId;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final akul bf() {
        aozy createBuilder = amiq.a.createBuilder();
        akul a = ((uwu) this.al.b()).a();
        akul b = ((uwu) this.al.b()).b();
        return aktp.ap(a, b).h(new hbd(createBuilder, a, b, 7), andi.a);
    }

    public final amwt bj(int i2) {
        return ((adjc) this.am.b()).d(i2).a;
    }

    public final List bk(ConversationIdType conversationIdType) {
        if (!conversationIdType.b()) {
            return ((lfl) this.u.b()).r(((rtz) this.o.b()).K(conversationIdType));
        }
        return alog.r(amgg.UNKNOWN_FORMAT);
    }

    /* JADX WARN: Type inference failed for: r2v23, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v33, types: [arwe, java.lang.Object] */
    public final void bl(MessageCoreData messageCoreData, Integer num, int i2, amgc amgcVar, amgl amglVar) {
        akrh e = aktp.e("UsageStatisticsImpl::logActiveUserSendMessage");
        try {
            int x = lgb.x(messageCoreData.d());
            long a = ((lzz) this.q.b()).a(messageCoreData.z());
            aozy createBuilder = amim.a.createBuilder();
            long q = messageCoreData.q();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amim amimVar = (amim) createBuilder.b;
            amimVar.b |= 1;
            amimVar.c = q;
            amim amimVar2 = (amim) createBuilder.s();
            aozy createBuilder2 = amje.a.createBuilder();
            int e2 = e();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            amje amjeVar = (amje) createBuilder2.b;
            amjeVar.b |= 1;
            amjeVar.c = e2;
            String d = ((mie) this.F.b()).d();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            amje amjeVar2 = (amje) createBuilder2.b;
            d.getClass();
            amjeVar2.b |= 4;
            amjeVar2.e = d;
            amje amjeVar3 = (amje) createBuilder2.s();
            amee t = ((lfl) this.r.b()).t(i2);
            int i3 = i2 < -2 ? 2 : i2 == -2 ? 3 : i2 == -1 ? 4 : i2 > 0 ? 6 : 1;
            aozy createBuilder3 = amgd.a.createBuilder();
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            amgd amgdVar = (amgd) createBuilder3.b;
            amgdVar.c = amgcVar.e;
            amgdVar.b |= 1;
            amgd amgdVar2 = (amgd) createBuilder3.s();
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar = (amgu) amglVar.b;
            amgu amguVar2 = amgu.a;
            amguVar.b |= 1073741824;
            amguVar.G = a;
            long s = messageCoreData.s();
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar3 = (amgu) amglVar.b;
            amguVar3.b |= 128;
            amguVar3.n = s;
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar4 = (amgu) amglVar.b;
            amguVar4.g = x - 1;
            amguVar4.b |= 1;
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar5 = (amgu) amglVar.b;
            amguVar5.h = 12;
            amguVar5.b |= 2;
            amfg v = lgb.v(num);
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar6 = (amgu) amglVar.b;
            amguVar6.r = v.f;
            amguVar6.b |= 16384;
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar7 = (amgu) amglVar.b;
            amjeVar3.getClass();
            amguVar7.y = amjeVar3;
            amguVar7.b |= 4194304;
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar8 = (amgu) amglVar.b;
            amimVar2.getClass();
            amguVar8.k = amimVar2;
            amguVar8.b |= 16;
            String k2 = k(Optional.of(Integer.valueOf(i2)));
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar9 = (amgu) amglVar.b;
            k2.getClass();
            amguVar9.c |= 1;
            amguVar9.J = k2;
            amgw j2 = ((mie) this.F.b()).j(messageCoreData.W(), 13);
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar10 = (amgu) amglVar.b;
            j2.getClass();
            amguVar10.j = j2;
            int i4 = 8;
            amguVar10.b |= 8;
            int i5 = xyp.a;
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar11 = (amgu) amglVar.b;
            int i6 = i5 - 1;
            if (i5 != 0) {
                amguVar11.N = i6;
                amguVar11.c |= 512;
                if (!amglVar.b.isMutable()) {
                    amglVar.u();
                }
                amgu amguVar12 = (amgu) amglVar.b;
                t.getClass();
                amguVar12.U = t;
                amguVar12.c |= 65536;
                if (!amglVar.b.isMutable()) {
                    amglVar.u();
                }
                amgu amguVar13 = (amgu) amglVar.b;
                amguVar13.as = i3 - 1;
                amguVar13.d |= 128;
                int i7 = true != messageCoreData.cn() ? 3 : 2;
                if (!amglVar.b.isMutable()) {
                    amglVar.u();
                }
                amgu amguVar14 = (amgu) amglVar.b;
                amguVar14.S = i7 - 1;
                amguVar14.c |= 16384;
                if (!amglVar.b.isMutable()) {
                    amglVar.u();
                }
                amgu amguVar15 = (amgu) amglVar.b;
                amgdVar2.getClass();
                amguVar15.aA = amgdVar2;
                amguVar15.d |= 32768;
                if (messageCoreData.aF() != null) {
                    atok aF = messageCoreData.aF();
                    aF.getClass();
                    if (!amglVar.b.isMutable()) {
                        amglVar.u();
                    }
                    amgu amguVar16 = (amgu) amglVar.b;
                    amguVar16.o = aF;
                    amguVar16.b |= 1024;
                }
                amhb x2 = ((lfl) this.s.b()).x(i2);
                if (!amglVar.b.isMutable()) {
                    amglVar.u();
                }
                amgu amguVar17 = (amgu) amglVar.b;
                amguVar17.i = x2;
                amguVar17.b |= 4;
                if (rve.l(messageCoreData.E())) {
                    String f2 = messageCoreData.E().f();
                    if (!amglVar.b.isMutable()) {
                        amglVar.u();
                    }
                    amgu amguVar18 = (amgu) amglVar.b;
                    amguVar18.b |= Integer.MIN_VALUE;
                    amguVar18.H = f2;
                }
                ((mie) this.F.b()).h(messageCoreData, amglVar);
                ((mie) this.F.b()).g(messageCoreData, amglVar);
                ((mie) this.F.b()).k(amglVar, x, 13, i2);
                ((mie) this.F.b()).e(amglVar, i2);
                MessageUsageStatisticsData y = messageCoreData.y();
                if (y != null) {
                    if (y.j() != null) {
                        amgj j3 = y.j();
                        if (!amglVar.b.isMutable()) {
                            amglVar.u();
                        }
                        amgu amguVar19 = (amgu) amglVar.b;
                        amguVar19.m = j3.w;
                        amguVar19.b |= 64;
                    }
                    amgk k3 = y.k();
                    amgh h2 = y.h();
                    amwt bj = bj(i2);
                    amjk l2 = y.l();
                    if (!amglVar.b.isMutable()) {
                        amglVar.u();
                    }
                    amgu amguVar20 = (amgu) amglVar.b;
                    amguVar20.u = k3.d;
                    amguVar20.b |= 262144;
                    if (!amglVar.b.isMutable()) {
                        amglVar.u();
                    }
                    amgu amguVar21 = (amgu) amglVar.b;
                    amguVar21.v = h2.p;
                    amguVar21.b |= 524288;
                    if (bj != null) {
                        if (!amglVar.b.isMutable()) {
                            amglVar.u();
                        }
                        amgu amguVar22 = (amgu) amglVar.b;
                        amguVar22.w = bj.E;
                        amguVar22.b |= 1048576;
                    }
                    if (l2 != null && utw.a(ThreadLocalRandom.current(), d)) {
                        if (!amglVar.b.isMutable()) {
                            amglVar.u();
                        }
                        amgu amguVar23 = (amgu) amglVar.b;
                        amguVar23.P = l2;
                        amguVar23.c |= 2048;
                    }
                    DeviceData d2 = y.d();
                    if (d2 != null) {
                        amfm amfmVar = d2.a;
                        aozy createBuilder4 = amfn.a.createBuilder();
                        if (!createBuilder4.b.isMutable()) {
                            createBuilder4.u();
                        }
                        amfn amfnVar = (amfn) createBuilder4.b;
                        amfnVar.c = amfmVar.f;
                        amfnVar.b |= 1;
                        amfn amfnVar2 = (amfn) createBuilder4.s();
                        if (!amglVar.b.isMutable()) {
                            amglVar.u();
                        }
                        amgu amguVar24 = (amgu) amglVar.b;
                        amfnVar2.getClass();
                        amguVar24.q = amfnVar2;
                        amguVar24.b |= 8192;
                    }
                    y.m().ifPresent(new mht(amglVar, 6));
                    Optional n = y.n();
                    amglVar.getClass();
                    n.ifPresent(new mht(amglVar, 7));
                }
                amfq amfqVar = (amfq) amfr.a.createBuilder();
                amfp amfpVar = amfp.BUGLE_MESSAGE;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                amfr amfrVar = (amfr) amfqVar.b;
                amfrVar.i = amfpVar.dg;
                amfrVar.b |= 1;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                amfr amfrVar2 = (amfr) amfqVar.b;
                amgu amguVar25 = (amgu) amglVar.s();
                amguVar25.getClass();
                amfrVar2.k = amguVar25;
                amfrVar2.b |= 4;
                mar a2 = this.J.a();
                a2.e(amrs.ACTIVE_USER_SEND_MESSAGE);
                a2.b(amfqVar, mbt.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
                if (((pes) this.as.b()).a()) {
                    long epochMilli = this.v.f().toEpochMilli();
                    ((lfl) this.at.b()).l(epochMilli);
                    ((lfl) this.at.b()).k(epochMilli);
                    lfl lflVar = (lfl) this.at.b();
                    albo.ax(arwi.e(aktp.a(lflVar.c.b())), (ahlp) lflVar.d, new mge((arpe) null, lflVar, epochMilli, 4, (int[]) null));
                    if (messageCoreData.cI()) {
                        ((lfl) this.at.b()).m(epochMilli);
                        lfl lflVar2 = (lfl) this.at.b();
                        albo.ax(arwi.e(aktp.a(lflVar2.c.b())), (ahlp) lflVar2.d, new mge((arpe) null, lflVar2, epochMilli, 3, (short[]) null));
                    }
                }
                aktp.ah(new itl(this, messageCoreData, amglVar, i4), this.B);
                e.close();
                return;
            }
            throw null;
        } catch (Throwable th) {
            try {
                e.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final void bm(long j2, String str) {
        ((mbl) this.S.b()).e(str, a.aq(yyb.aR(j2)));
    }

    public final void bn(MessageCoreData messageCoreData, int i2, int i3, amgl amglVar) {
        int i4;
        if (!this.y.get()) {
            r();
            return;
        }
        this.J.getClass();
        Integer d = this.D.d(messageCoreData.B().a());
        lqn k2 = this.D.k(messageCoreData.B().a());
        aozy createBuilder = amje.a.createBuilder();
        int e = e();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amje amjeVar = (amje) createBuilder.b;
        amjeVar.b |= 1;
        amjeVar.c = e;
        String d2 = ((mie) this.F.b()).d();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amje amjeVar2 = (amje) createBuilder.b;
        d2.getClass();
        amjeVar2.b |= 4;
        amjeVar2.e = d2;
        amje amjeVar3 = (amje) createBuilder.s();
        int x = lgb.x(messageCoreData.d());
        long a = ((lzz) this.q.b()).a(messageCoreData.z());
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar = (amgu) amglVar.b;
        amgu amguVar2 = amgu.a;
        amguVar.b |= 1073741824;
        amguVar.G = a;
        long s = messageCoreData.s();
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar3 = (amgu) amglVar.b;
        amguVar3.b |= 128;
        amguVar3.n = s;
        String f2 = messageCoreData.E().f();
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar4 = (amgu) amglVar.b;
        amguVar4.b |= Integer.MIN_VALUE;
        amguVar4.H = f2;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar5 = (amgu) amglVar.b;
        amguVar5.g = x - 1;
        amguVar5.b |= 1;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar6 = (amgu) amglVar.b;
        amguVar6.h = 7;
        int i5 = 2;
        amguVar6.b |= 2;
        amhb x2 = ((lfl) this.s.b()).x(i2);
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar7 = (amgu) amglVar.b;
        amguVar7.i = x2;
        amguVar7.b |= 4;
        String k3 = k(Optional.of(Integer.valueOf(i2)));
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar8 = (amgu) amglVar.b;
        k3.getClass();
        amguVar8.c |= 1;
        amguVar8.J = k3;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar9 = (amgu) amglVar.b;
        amjeVar3.getClass();
        amguVar9.y = amjeVar3;
        amguVar9.b |= 4194304;
        int bs = bs(messageCoreData.z());
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar10 = (amgu) amglVar.b;
        amguVar10.x = bs - 1;
        amguVar10.b |= 2097152;
        int i6 = xyp.a;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar11 = (amgu) amglVar.b;
        int i7 = i6 - 1;
        if (i6 != 0) {
            amguVar11.N = i7;
            amguVar11.c |= 512;
            if (true != messageCoreData.cn()) {
                i5 = 3;
            }
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar12 = (amgu) amglVar.b;
            amguVar12.S = i5 - 1;
            amguVar12.c |= 16384;
            if (messageCoreData.aF() != null) {
                atok aF = messageCoreData.aF();
                aF.getClass();
                if (!amglVar.b.isMutable()) {
                    amglVar.u();
                }
                amgu amguVar13 = (amgu) amglVar.b;
                amguVar13.o = aF;
                amguVar13.b |= 1024;
            }
            bE(amglVar, messageCoreData);
            if (i3 >= 0) {
                if (!amglVar.b.isMutable()) {
                    amglVar.u();
                }
                amgu amguVar14 = (amgu) amglVar.b;
                amguVar14.d |= 16;
                amguVar14.ap = i3;
            }
            amgt amgtVar = (amgt) this.ax.fu(messageCoreData.N());
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar15 = (amgu) amglVar.b;
            amguVar15.aq = amgtVar.h;
            amguVar15.d |= 32;
            ((mie) this.F.b()).h(messageCoreData, amglVar);
            if (d != null) {
                amfg v = lgb.v(d);
                if (!amglVar.b.isMutable()) {
                    amglVar.u();
                }
                amgu amguVar16 = (amgu) amglVar.b;
                amguVar16.r = v.f;
                amguVar16.b |= 16384;
                xyo a2 = k.a();
                amfg b = amfg.b(((amgu) amglVar.b).r);
                if (b == null) {
                    b = amfg.UNKNOWN_BUGLE_CONVERSATION_TYPE;
                }
                a2.z("messageConversationType", b);
                a2.q();
            }
            if (k2 != null) {
                amgw j2 = ((mie) this.F.b()).j(messageCoreData.W(), 8);
                if (!amglVar.b.isMutable()) {
                    amglVar.u();
                }
                amgu amguVar17 = (amgu) amglVar.b;
                j2.getClass();
                amguVar17.j = j2;
                amguVar17.b |= 8;
            }
            ((mie) this.F.b()).g(messageCoreData, amglVar);
            if (((Boolean) f.e()).booleanValue()) {
                lru lruVar = (lru) this.ak.b();
                if (d != null) {
                    i4 = d.intValue();
                } else {
                    i4 = 0;
                }
                lruVar.b(amglVar, messageCoreData, i4);
            }
            amfq amfqVar = (amfq) amfr.a.createBuilder();
            amfp amfpVar = amfp.BUGLE_MESSAGE;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar = (amfr) amfqVar.b;
            amfrVar.i = amfpVar.dg;
            amfrVar.b |= 1;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar2 = (amfr) amfqVar.b;
            amgu amguVar18 = (amgu) amglVar.s();
            amguVar18.getClass();
            amfrVar2.k = amguVar18;
            amfrVar2.b |= 4;
            this.J.a().b(amfqVar, mbt.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
            return;
        }
        throw null;
    }

    public final void bo(amgl amglVar) {
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_MESSAGE;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amgu amguVar = (amgu) amglVar.s();
        amguVar.getClass();
        amfrVar2.k = amguVar;
        amfrVar2.b |= 4;
        this.J.a().b(amfqVar, mbt.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
        ((mgv) this.V.b()).c(new ahka("MMS downloaded"));
    }

    public final boolean bp(MessageCoreData messageCoreData) {
        if (this.ao.a() && messageCoreData.cL()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0339  */
    /* JADX WARN: Type inference failed for: r10v25, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v26, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v30, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v103, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.Map, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void br(final com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r45, final int r46, final defpackage.mbh r47, defpackage.amgl r48) {
        /*
            Method dump skipped, instructions count: 1070
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mic.br(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, int, mbh, amgl):void");
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [armf, java.lang.Object] */
    public final int bs(ConversationIdType conversationIdType) {
        if (conversationIdType.b()) {
            return 1;
        }
        lfl lflVar = (lfl) this.u.b();
        List K = ((rtz) this.o.b()).K(conversationIdType);
        if (((alsx) K).c == 1) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) K.get(0);
            return lfl.s(lflVar.q(((msk) lflVar.c.b()).q(bindData), vcp.k(bindData)));
        }
        return 2;
    }

    public final int bt(Instant instant) {
        long epochMilli = this.v.f().toEpochMilli() - instant.toEpochMilli();
        if (epochMilli < TimeUnit.SECONDS.toMillis(1L)) {
            return 2;
        }
        if (epochMilli < TimeUnit.SECONDS.toMillis(2L)) {
            return 3;
        }
        if (epochMilli < TimeUnit.SECONDS.toMillis(5L)) {
            return 4;
        }
        if (epochMilli < TimeUnit.SECONDS.toMillis(10L)) {
            return 5;
        }
        if (epochMilli < TimeUnit.SECONDS.toMillis(30L)) {
            return 6;
        }
        if (epochMilli < TimeUnit.MINUTES.toMillis(1L)) {
            return 7;
        }
        if (epochMilli < TimeUnit.MINUTES.toMillis(5L)) {
            return 8;
        }
        if (epochMilli < TimeUnit.MINUTES.toMillis(30L)) {
            return 9;
        }
        if (epochMilli < TimeUnit.HOURS.toMillis(1L)) {
            return 10;
        }
        if (epochMilli < TimeUnit.HOURS.toMillis(2L)) {
            return 11;
        }
        if (epochMilli < TimeUnit.HOURS.toMillis(5L)) {
            return 12;
        }
        if (epochMilli < TimeUnit.HOURS.toMillis(12L) + TimeUnit.MINUTES.toMillis(1L)) {
            return 13;
        }
        if (epochMilli < TimeUnit.HOURS.toMillis(13L)) {
            return 14;
        }
        return 15;
    }

    public final void bu(MessageCoreData messageCoreData, int i2, amxb amxbVar, amgl amglVar) {
        long j2;
        String a;
        if (messageCoreData != null) {
            j2 = messageCoreData.s();
        } else {
            j2 = -1;
        }
        ((mie) this.F.b()).e(amglVar, bd(messageCoreData));
        aozy createBuilder = amje.a.createBuilder();
        int e = e();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amje amjeVar = (amje) createBuilder.b;
        amjeVar.b |= 1;
        amjeVar.c = e;
        String d = ((mie) this.F.b()).d();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amje amjeVar2 = (amje) createBuilder.b;
        d.getClass();
        amjeVar2.b |= 4;
        amjeVar2.e = d;
        amje amjeVar3 = (amje) createBuilder.s();
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar = (amgu) amglVar.b;
        amgu amguVar2 = amgu.a;
        amjeVar3.getClass();
        amguVar.y = amjeVar3;
        amguVar.b |= 4194304;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar3 = (amgu) amglVar.b;
        amguVar3.b |= 128;
        amguVar3.n = j2;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar4 = (amgu) amglVar.b;
        amguVar4.A = 1;
        amguVar4.b |= 16777216;
        int i3 = 3;
        if (messageCoreData != null && i2 == 3) {
            amge a2 = this.D.a(messageCoreData.B().a());
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar5 = (amgu) amglVar.b;
            amguVar5.t = a2.d;
            amguVar5.b |= 131072;
            amgh b = this.D.b(messageCoreData.B().a());
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar6 = (amgu) amglVar.b;
            amguVar6.v = b.p;
            amguVar6.b |= 524288;
            amgw j3 = ((mie) this.F.b()).j(messageCoreData.W(), 10);
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar7 = (amgu) amglVar.b;
            j3.getClass();
            amguVar7.j = j3;
            amguVar7.b |= 8;
        }
        if (messageCoreData != null) {
            if (true == messageCoreData.cn()) {
                i3 = 2;
            }
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar8 = (amgu) amglVar.b;
            amguVar8.S = i3 - 1;
            amguVar8.c |= 16384;
        }
        if (messageCoreData != null && (a = messageCoreData.B().a()) != null) {
            amfg v = lgb.v(this.D.d(a));
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar9 = (amgu) amglVar.b;
            amguVar9.r = v.f;
            amguVar9.b |= 16384;
        }
        if (amxbVar != null) {
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar10 = (amgu) amglVar.b;
            amguVar10.O = amxbVar;
            amguVar10.c |= 1024;
        }
        amgm amgmVar = amgm.EMOJI_STATUS_NA;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar11 = (amgu) amglVar.b;
        amguVar11.E = amgmVar.g;
        amguVar11.b |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar12 = (amgu) amglVar.b;
        amguVar12.F = 12;
        amguVar12.b |= 536870912;
        amgi amgiVar = amgi.UNKNOWN_RESEND_ATTEMPT;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar13 = (amgu) amglVar.b;
        amguVar13.s = amgiVar.d;
        amguVar13.b |= 65536;
        amgk amgkVar = amgk.WAS_RCS_CONVERSATION;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar14 = (amgu) amglVar.b;
        amguVar14.u = amgkVar.d;
        amguVar14.b |= 262144;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar15 = (amgu) amglVar.b;
        amguVar15.B = 15;
        amguVar15.b |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
        ammr ammrVar = ammr.REPLY;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar16 = (amgu) amglVar.b;
        amguVar16.D = ammrVar.d;
        amguVar16.b |= VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_MESSAGE;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amgu amguVar17 = (amgu) amglVar.s();
        amguVar17.getClass();
        amfrVar2.k = amguVar17;
        amfrVar2.b |= 4;
        this.J.a().b(amfqVar, mbt.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
    }

    /* JADX WARN: Type inference failed for: r2v16, types: [arwe, java.lang.Object] */
    public final void bv(MessageCoreData messageCoreData, int i2, int i3, int i4, int i5, int i6, amxb amxbVar, int i7, int i8, Optional optional, Optional optional2, Optional optional3, Optional optional4) {
        String a = messageCoreData.B().a();
        Integer d = this.D.d(a);
        lqn k2 = this.D.k(a);
        aozy createBuilder = amje.a.createBuilder();
        int e = e();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amje amjeVar = (amje) createBuilder.b;
        amjeVar.b |= 1;
        amjeVar.c = e;
        String d2 = ((mie) this.F.b()).d();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amje amjeVar2 = (amje) createBuilder.b;
        d2.getClass();
        amjeVar2.b |= 4;
        amjeVar2.e = d2;
        amje amjeVar3 = (amje) createBuilder.s();
        amee t = ((lfl) this.r.b()).t(i2);
        int x = lgb.x(messageCoreData.d());
        amgl amglVar = (amgl) amgu.a.createBuilder();
        long a2 = ((lzz) this.q.b()).a(messageCoreData.z());
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar = (amgu) amglVar.b;
        amguVar.b |= 1073741824;
        amguVar.G = a2;
        long s = messageCoreData.s();
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar2 = (amgu) amglVar.b;
        amguVar2.b |= 128;
        amguVar2.n = s;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar3 = (amgu) amglVar.b;
        amguVar3.g = x - 1;
        amguVar3.b |= 1;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar4 = (amgu) amglVar.b;
        amguVar4.h = i6 - 1;
        amguVar4.b |= 2;
        amhb x2 = ((lfl) this.s.b()).x(i2);
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar5 = (amgu) amglVar.b;
        amguVar5.i = x2;
        amguVar5.b |= 4;
        String k3 = k(Optional.of(Integer.valueOf(i2)));
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar6 = (amgu) amglVar.b;
        k3.getClass();
        amguVar6.c |= 1;
        amguVar6.J = k3;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar7 = (amgu) amglVar.b;
        amjeVar3.getClass();
        amguVar7.y = amjeVar3;
        amguVar7.b |= 4194304;
        int bs = bs(messageCoreData.z());
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar8 = (amgu) amglVar.b;
        amguVar8.x = bs - 1;
        amguVar8.b |= 2097152;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar9 = (amgu) amglVar.b;
        t.getClass();
        amguVar9.U = t;
        amguVar9.c |= 65536;
        int i9 = xyp.a;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar10 = (amgu) amglVar.b;
        int i10 = i9 - 1;
        if (i9 != 0) {
            amguVar10.N = i10;
            amguVar10.c |= 512;
            int i11 = true != messageCoreData.cn() ? 3 : 2;
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar11 = (amgu) amglVar.b;
            amguVar11.S = i11 - 1;
            amguVar11.c |= 16384;
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar12 = (amgu) amglVar.b;
            int i12 = i7 - 1;
            if (i7 != 0) {
                amguVar12.Y = i12;
                amguVar12.c |= 524288;
                if (bp(messageCoreData) || ((pkq) this.an.b()).a()) {
                    amglVar.a(bk(messageCoreData.z()));
                }
                if (bp(messageCoreData)) {
                    optional4.ifPresent(new mht(amglVar, 2));
                }
                if (messageCoreData.aF() != null) {
                    atok aF = messageCoreData.aF();
                    aF.getClass();
                    if (!amglVar.b.isMutable()) {
                        amglVar.u();
                    }
                    amgu amguVar13 = (amgu) amglVar.b;
                    amguVar13.o = aF;
                    amguVar13.b |= 1024;
                }
                ((mie) this.F.b()).i(messageCoreData, amglVar, optional);
                optional2.ifPresent(new met(amglVar, 13));
                optional3.ifPresent(new mht(amglVar, 3));
                amgt amgtVar = (amgt) this.ax.fu(messageCoreData.N());
                if (!amglVar.b.isMutable()) {
                    amglVar.u();
                }
                amgu amguVar14 = (amgu) amglVar.b;
                amguVar14.aq = amgtVar.h;
                amguVar14.d |= 32;
                amgi c = this.D.c(messageCoreData.B().a());
                if (!amglVar.b.isMutable()) {
                    amglVar.u();
                }
                amgu amguVar15 = (amgu) amglVar.b;
                amguVar15.s = c.d;
                amguVar15.b |= 65536;
                ((mie) this.F.b()).g(messageCoreData, amglVar);
                if (messageCoreData.E() != null) {
                    messageCoreData.E().g(new mht(amglVar, 4));
                    bE(amglVar, messageCoreData);
                }
                ((mie) this.F.b()).e(amglVar, i2);
                if (bp(messageCoreData)) {
                    messageCoreData.A().g(new mht(amglVar, 5));
                }
                ((mie) this.F.b()).k(amglVar, x, i6, i2);
                if (d != null) {
                    amfg v = lgb.v(d);
                    if (!amglVar.b.isMutable()) {
                        amglVar.u();
                    }
                    amgu amguVar16 = (amgu) amglVar.b;
                    amguVar16.r = v.f;
                    amguVar16.b |= 16384;
                    xyo a3 = k.a();
                    amfg b = amfg.b(((amgu) amglVar.b).r);
                    if (b == null) {
                        b = amfg.UNKNOWN_BUGLE_CONVERSATION_TYPE;
                    }
                    a3.z("messageConversationType", b);
                    a3.q();
                }
                if (lgb.x(messageCoreData.d()) == 3) {
                    amha bq = bq(lgb.w(i3), i4, i3, messageCoreData.f(), i8);
                    if (!amglVar.b.isMutable()) {
                        amglVar.u();
                    }
                    amgu amguVar17 = (amgu) amglVar.b;
                    bq.getClass();
                    amguVar17.f = bq;
                    amguVar17.e = 7;
                    amha amhaVar = (amha) amguVar17.f;
                    amee ameeVar = amguVar17.U;
                    if (ameeVar == null) {
                        ameeVar = amee.b;
                    }
                    bC(amhaVar, i4, ameeVar);
                }
                if (lgb.x(messageCoreData.d()) == 4) {
                    aozy createBuilder2 = amhs.a.createBuilder();
                    int f2 = messageCoreData.f();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    amhs amhsVar = (amhs) createBuilder2.b;
                    amhsVar.b |= 1;
                    amhsVar.c = f2;
                    amhs amhsVar2 = (amhs) createBuilder2.s();
                    if (!amglVar.b.isMutable()) {
                        amglVar.u();
                    }
                    amgu amguVar18 = (amgu) amglVar.b;
                    amhsVar2.getClass();
                    amguVar18.f = amhsVar2;
                    amguVar18.e = 60;
                }
                if (k2 != null) {
                    amgw j2 = ((mie) this.F.b()).j(messageCoreData.W(), i6);
                    if (!amglVar.b.isMutable()) {
                        amglVar.u();
                    }
                    amgu amguVar19 = (amgu) amglVar.b;
                    j2.getClass();
                    amguVar19.j = j2;
                    amguVar19.b |= 8;
                }
                if (i6 == 6) {
                    if (k2 != null) {
                        if (!amglVar.b.isMutable()) {
                            amglVar.u();
                        }
                        amgu amguVar20 = (amgu) amglVar.b;
                        amguVar20.m = ((amgj) k2.a).w;
                        amguVar20.b |= 64;
                    }
                    int bt = bt(messageCoreData.X());
                    if (!amglVar.b.isMutable()) {
                        amglVar.u();
                    }
                    amgu amguVar21 = (amgu) amglVar.b;
                    amguVar21.B = bt - 1;
                    amguVar21.b |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
                    if (lgb.x(messageCoreData.d()) == 2) {
                        aozy createBuilder3 = amij.a.createBuilder();
                        if (!createBuilder3.b.isMutable()) {
                            createBuilder3.u();
                        }
                        amij amijVar = (amij) createBuilder3.b;
                        amijVar.b |= 1;
                        amijVar.c = i5;
                        aozy createBuilder4 = amer.a.createBuilder();
                        if (!createBuilder4.b.isMutable()) {
                            createBuilder4.u();
                        }
                        amer amerVar = (amer) createBuilder4.b;
                        amerVar.b |= 1;
                        amerVar.c = i3;
                        if (!createBuilder3.b.isMutable()) {
                            createBuilder3.u();
                        }
                        amij amijVar2 = (amij) createBuilder3.b;
                        amer amerVar2 = (amer) createBuilder4.s();
                        amerVar2.getClass();
                        amijVar2.d = amerVar2;
                        amijVar2.b |= 2;
                        amii bx = bx(i2);
                        if (!createBuilder3.b.isMutable()) {
                            createBuilder3.u();
                        }
                        amij amijVar3 = (amij) createBuilder3.b;
                        amijVar3.e = bx.e;
                        amijVar3.b |= 4;
                        amij amijVar4 = (amij) createBuilder3.s();
                        if (!amglVar.b.isMutable()) {
                            amglVar.u();
                        }
                        amgu amguVar22 = (amgu) amglVar.b;
                        amijVar4.getClass();
                        amguVar22.f = amijVar4;
                        amguVar22.e = 41;
                        amij amijVar5 = (amij) amguVar22.f;
                        amee ameeVar2 = amguVar22.U;
                        if (ameeVar2 == null) {
                            ameeVar2 = amee.b;
                        }
                        bG(amijVar5, ameeVar2);
                    }
                }
                if (amxbVar != null) {
                    if (!amglVar.b.isMutable()) {
                        amglVar.u();
                    }
                    amgu amguVar23 = (amgu) amglVar.b;
                    amguVar23.O = amxbVar;
                    amguVar23.c |= 1024;
                }
                if (((Boolean) f.e()).booleanValue()) {
                    ((lru) this.ak.b()).b(amglVar, messageCoreData, d != null ? d.intValue() : 0);
                }
                if (((pdq) this.I.b()).a()) {
                    ((mie) this.F.b()).f(amglVar);
                }
                amfq amfqVar = (amfq) amfr.a.createBuilder();
                amfp amfpVar = amfp.BUGLE_MESSAGE;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                amfr amfrVar = (amfr) amfqVar.b;
                amfrVar.i = amfpVar.dg;
                amfrVar.b |= 1;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                amfr amfrVar2 = (amfr) amfqVar.b;
                amgu amguVar24 = (amgu) amglVar.s();
                amguVar24.getClass();
                amfrVar2.k = amguVar24;
                amfrVar2.b |= 4;
                this.J.a().b(amfqVar, mbt.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
                if (((pes) this.as.b()).a()) {
                    lfl lflVar = (lfl) this.at.b();
                    albo.ax(arwi.e(aktp.a(lflVar.c.b())), (ahlp) lflVar.d, new mgd((arpe) null, lflVar, 1, (byte[]) null));
                    return;
                }
                return;
            }
            throw null;
        }
        throw null;
    }

    public final void bw(MessageCoreData messageCoreData, int i2, amxo amxoVar, int i3, int i4) {
        Object obj;
        if (!this.y.get()) {
            r();
            return;
        }
        if (messageCoreData != null && !messageCoreData.E().i()) {
            this.D.e(messageCoreData);
            String a = messageCoreData.B().a();
            lqn k2 = this.D.k(a);
            aozy createBuilder = amim.a.createBuilder();
            long epochMilli = this.v.f().toEpochMilli();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amim amimVar = (amim) createBuilder.b;
            amimVar.b |= 1;
            amimVar.c = epochMilli;
            long q = amimVar.d - messageCoreData.q();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amim amimVar2 = (amim) createBuilder.b;
            int i5 = 2;
            amimVar2.b |= 2;
            amimVar2.d = q;
            aozy createBuilder2 = amje.a.createBuilder();
            int e = e();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            amje amjeVar = (amje) createBuilder2.b;
            amjeVar.b |= 1;
            amjeVar.c = e;
            String d = ((mie) this.F.b()).d();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            amje amjeVar2 = (amje) createBuilder2.b;
            d.getClass();
            amjeVar2.b |= 4;
            amjeVar2.e = d;
            amje amjeVar3 = (amje) createBuilder2.s();
            amwt bj = bj(i3);
            amgl amglVar = (amgl) amgu.a.createBuilder();
            long s = messageCoreData.s();
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar = (amgu) amglVar.b;
            amguVar.b |= 128;
            amguVar.n = s;
            long a2 = ((lzz) this.q.b()).a(messageCoreData.z());
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar2 = (amgu) amglVar.b;
            amguVar2.b |= 1073741824;
            amguVar2.G = a2;
            amgk amgkVar = amgk.WAS_RCS_CONVERSATION;
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar3 = (amgu) amglVar.b;
            amguVar3.u = amgkVar.d;
            amguVar3.b |= 262144;
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar4 = (amgu) amglVar.b;
            amguVar4.h = 11;
            amguVar4.b |= 2;
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar5 = (amgu) amglVar.b;
            amguVar5.av = i4 - 1;
            amguVar5.d |= 1024;
            int x = lgb.x(i2);
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar6 = (amgu) amglVar.b;
            amguVar6.g = x - 1;
            amguVar6.b |= 1;
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar7 = (amgu) amglVar.b;
            amim amimVar3 = (amim) createBuilder.s();
            amimVar3.getClass();
            amguVar7.k = amimVar3;
            amguVar7.b |= 16;
            amgw j2 = ((mie) this.F.b()).j(messageCoreData.W(), 12);
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar8 = (amgu) amglVar.b;
            j2.getClass();
            amguVar8.j = j2;
            amguVar8.b |= 8;
            amhb x2 = ((lfl) this.s.b()).x(((yyt) this.ac.b()).Q(vqk.d));
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar9 = (amgu) amglVar.b;
            amguVar9.i = x2;
            amguVar9.b |= 4;
            String k3 = k(Optional.of(Integer.valueOf(i3)));
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar10 = (amgu) amglVar.b;
            k3.getClass();
            amguVar10.c |= 1;
            amguVar10.J = k3;
            amge a3 = this.D.a(a);
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar11 = (amgu) amglVar.b;
            amguVar11.t = a3.d;
            amguVar11.b |= 131072;
            amgh b = this.D.b(a);
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar12 = (amgu) amglVar.b;
            amguVar12.v = b.p;
            amguVar12.b |= 524288;
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar13 = (amgu) amglVar.b;
            amguVar13.w = bj.E;
            amguVar13.b |= 1048576;
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar14 = (amgu) amglVar.b;
            amjeVar3.getClass();
            amguVar14.y = amjeVar3;
            amguVar14.b |= 4194304;
            int bs = bs(messageCoreData.z());
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar15 = (amgu) amglVar.b;
            amguVar15.x = bs - 1;
            amguVar15.b |= 2097152;
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar16 = (amgu) amglVar.b;
            amguVar16.A = 1;
            amguVar16.b |= 16777216;
            int i6 = xyp.a;
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar17 = (amgu) amglVar.b;
            int i7 = i6 - 1;
            if (i6 != 0) {
                amguVar17.N = i7;
                amguVar17.c |= 512;
                if (true != messageCoreData.cn()) {
                    i5 = 3;
                }
                if (!amglVar.b.isMutable()) {
                    amglVar.u();
                }
                amgu amguVar18 = (amgu) amglVar.b;
                amguVar18.S = i5 - 1;
                amguVar18.c |= 16384;
                if (!amglVar.b.isMutable()) {
                    amglVar.u();
                }
                amgu amguVar19 = (amgu) amglVar.b;
                amguVar19.aa = amxoVar.h;
                amguVar19.c |= 2097152;
                if (k2 != null && (obj = k2.a) != null) {
                    if (!amglVar.b.isMutable()) {
                        amglVar.u();
                    }
                    amgu amguVar20 = (amgu) amglVar.b;
                    amguVar20.m = ((amgj) obj).w;
                    amguVar20.b |= 64;
                }
                ((mie) this.F.b()).g(messageCoreData, amglVar);
                messageCoreData.E().g(new mht(amglVar, 0));
                amfq amfqVar = (amfq) amfr.a.createBuilder();
                amfp amfpVar = amfp.BUGLE_MESSAGE;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                amfr amfrVar = (amfr) amfqVar.b;
                amfrVar.i = amfpVar.dg;
                amfrVar.b |= 1;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                amfr amfrVar2 = (amfr) amfqVar.b;
                amgu amguVar21 = (amgu) amglVar.s();
                amguVar21.getClass();
                amfrVar2.k = amguVar21;
                amfrVar2.b |= 4;
                this.J.a().b(amfqVar, mbt.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
                return;
            }
            throw null;
        }
    }

    @Override // defpackage.mho, defpackage.adtj
    public final void c(apht aphtVar) {
        if (((Boolean) i.e()).booleanValue()) {
            return;
        }
        akrc b = this.aj.b("UsageStatistics dispatchSimStateEvent");
        try {
            if (!this.y.get()) {
                r();
            } else {
                amfq amfqVar = (amfq) amfr.a.createBuilder();
                amfp amfpVar = amfp.BUGLE_TELEPHONY_EVENT;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                amfr amfrVar = (amfr) amfqVar.b;
                amfrVar.i = amfpVar.dg;
                amfrVar.b |= 1;
                aozy createBuilder = aphw.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                aphw aphwVar = (aphw) createBuilder.b;
                aphtVar.getClass();
                aphwVar.c = aphtVar;
                aphwVar.b = 1;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                amfr amfrVar2 = (amfr) amfqVar.b;
                aphw aphwVar2 = (aphw) createBuilder.s();
                aphwVar2.getClass();
                amfrVar2.z = aphwVar2;
                amfrVar2.b |= 1048576;
                this.x.j(amfqVar);
            }
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.adtj
    public final void d(aphv aphvVar) {
        if (((Boolean) i.e()).booleanValue()) {
            return;
        }
        akrc b = this.aj.b("UsageStatistics dispatchSubChangedEvent");
        try {
            if (!this.y.get()) {
                r();
            } else {
                amfq amfqVar = (amfq) amfr.a.createBuilder();
                amfp amfpVar = amfp.BUGLE_TELEPHONY_EVENT;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                amfr amfrVar = (amfr) amfqVar.b;
                amfrVar.i = amfpVar.dg;
                amfrVar.b |= 1;
                aozy createBuilder = aphw.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                aphw aphwVar = (aphw) createBuilder.b;
                aphvVar.getClass();
                aphwVar.c = aphvVar;
                aphwVar.b = 4;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                amfr amfrVar2 = (amfr) amfqVar.b;
                aphw aphwVar2 = (aphw) createBuilder.s();
                aphwVar2.getClass();
                amfrVar2.z = aphwVar2;
                amfrVar2.b |= 1048576;
                this.x.j(amfqVar);
            }
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.mho
    public final int e() {
        return ((Integer) ((mie) this.F.b()).c().map(new mfk(7)).orElse(-1)).intValue();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [armf, java.lang.Object] */
    @Override // defpackage.mho
    public final BackgroundLoadingMessageUsageStatisticsData f(Callable callable, amgj amgjVar) {
        akul ai = aktp.ai(callable, this.B);
        ai.getClass();
        amgjVar.getClass();
        arwe arweVar = (arwe) this.ay.a.b();
        arweVar.getClass();
        return new BackgroundLoadingMessageUsageStatisticsData(ai, amgjVar, arweVar);
    }

    @Override // defpackage.mho
    public final akul g() {
        return aktp.ai(new mig(this, 1), this.A);
    }

    @Override // defpackage.mho
    public final amio h(long j2) {
        if (j2 <= a) {
            return amio.EVENT_AGE_WITHIN_1_DAY;
        }
        if (j2 <= b) {
            return amio.EVENT_AGE_1_TO_7_DAYS;
        }
        if (j2 <= c) {
            return amio.EVENT_AGE_7_TO_28_DAYS;
        }
        return amio.EVENT_AGE_MORE_THAN_28_DAYS;
    }

    @Override // defpackage.mho
    public final amio i(String str) {
        return h(this.v.f().toEpochMilli() - ((ykw) this.T.b()).e(str, -1L));
    }

    @Override // defpackage.mho
    public final ListenableFuture j() {
        return this.C.h(new mdr(16), andi.a);
    }

    @Override // defpackage.mho
    public final String k(Optional optional) {
        Optional empty;
        ImsConfiguration imsConfiguration;
        if (((olf) this.ar.b()).a()) {
            empty = (Optional) optional.map(new lut(this, 20)).orElseGet(new mcw(8));
        } else {
            armf armfVar = this.aa;
            if (armfVar != null && ((RcsProfileService) armfVar.b()).isConnected()) {
                try {
                    empty = Optional.ofNullable(((RcsProfileService) this.aa.b()).getRcsConfig());
                } catch (ajny e) {
                    xyo e2 = k.e();
                    e2.H("Unable to retrieve the RCS Config");
                    e2.H(e.getMessage());
                    e2.q();
                }
            }
            empty = Optional.empty();
        }
        if (!empty.isEmpty() && (imsConfiguration = ((Configuration) empty.get()).mImsConfiguration) != null) {
            String str = imsConfiguration.mPcscfAddress;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            return "NOT_AVAILABLE";
        }
        return "NOT_AVAILABLE";
    }

    @Override // defpackage.mho
    public final void l() {
        armf armfVar = this.ai;
        aiut.b();
        boolean b = ((mif) this.ag.b()).b();
        if (b) {
            this.x = (maq) this.P.b();
            this.J = (mbb) this.Q.b();
            this.ai = armfVar;
            this.C = akul.g(((mdt) this.z.b()).c.b(akto.a(new itk(new lut(this, 19), 20)), andi.a)).i(new lso(this, 9), andi.a);
        }
        this.y.set(b);
    }

    @Override // defpackage.mho
    public final void m(amen amenVar) {
        if (!this.y.get()) {
            r();
            return;
        }
        xyo c = k.c();
        c.H("app created");
        c.z("openCause", amenVar);
        c.q();
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        aozy createBuilder = ameo.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ameo ameoVar = (ameo) apagVar;
        ameoVar.c = amenVar.l;
        ameoVar.b |= 2;
        int i2 = xyp.a;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ameo ameoVar2 = (ameo) createBuilder.b;
        int i3 = i2 - 1;
        if (i2 != 0) {
            ameoVar2.d = i3;
            ameoVar2.b |= 64;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar = (amfr) amfqVar.b;
            ameo ameoVar3 = (ameo) createBuilder.s();
            ameoVar3.getClass();
            amfrVar.j = ameoVar3;
            amfrVar.b |= 2;
            amfp amfpVar = amfp.BUGLE_APP;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar2 = (amfr) amfqVar.b;
            amfrVar2.i = amfpVar.dg;
            amfrVar2.b |= 1;
            this.x.j(amfqVar);
            return;
        }
        throw null;
    }

    @Override // defpackage.mho
    public final void n(long j2) {
        if (!this.y.get()) {
            r();
        } else {
            ((ykw) this.T.b()).k("total_millis_spent", ((ykw) this.T.b()).e("total_millis_spent", 0L) + j2);
        }
    }

    @Override // defpackage.mho
    public final void o(boolean z, boolean z2) {
        int i2;
        if (!this.y.get()) {
            r();
            return;
        }
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_APP_CONFIGURATION;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        aozy createBuilder = amep.a.createBuilder();
        int i3 = 3;
        if (true != z) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amep amepVar = (amep) apagVar;
        amepVar.c = i2 - 1;
        amepVar.b |= 1;
        if (true == z2) {
            i3 = 2;
        }
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        amep amepVar2 = (amep) createBuilder.b;
        amepVar2.d = i3 - 1;
        amepVar2.b |= 2;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amep amepVar3 = (amep) createBuilder.s();
        amepVar3.getClass();
        amfrVar2.w = amepVar3;
        amfrVar2.b |= 65536;
        this.x.j(amfqVar);
    }

    @Override // defpackage.mho
    @Deprecated
    public final void p(String str, int i2, String str2, String str3, tqr tqrVar) {
        bI(str, i2, str2, 3, str3, tqrVar);
    }

    @Override // defpackage.mho
    @Deprecated
    public final void q(String str, int i2, String str2, String str3, tqr tqrVar) {
        bI(str, i2, str2, 2, str3, tqrVar);
    }

    @Override // defpackage.mho
    public final void r() {
        ((mif) this.ag.b()).a();
    }

    @Override // defpackage.mho
    public final void s(amfh amfhVar, ConversationIdType conversationIdType, amfe amfeVar, tqc tqcVar, tqc tqcVar2) {
        if (!this.y.get()) {
            r();
            return;
        }
        aozy builder = amfhVar.toBuilder();
        long a = ((lzz) this.q.b()).a(conversationIdType);
        if (!builder.b.isMutable()) {
            builder.u();
        }
        apag apagVar = builder.b;
        amfh amfhVar2 = (amfh) apagVar;
        amfhVar2.b |= 65536;
        amfhVar2.r = a;
        if (!apagVar.isMutable()) {
            builder.u();
        }
        apag apagVar2 = builder.b;
        amfh amfhVar3 = (amfh) apagVar2;
        amfhVar3.e = 2;
        amfhVar3.b |= 1;
        if (!apagVar2.isMutable()) {
            builder.u();
        }
        amfh amfhVar4 = (amfh) builder.b;
        amfhVar4.f = amfeVar.t;
        amfhVar4.b |= 2;
        int i2 = tqc.i(tqcVar2);
        if (!builder.b.isMutable()) {
            builder.u();
        }
        amfh amfhVar5 = (amfh) builder.b;
        amfhVar5.C = i2 - 1;
        amfhVar5.b |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
        int i3 = tqc.i(tqcVar);
        if (!builder.b.isMutable()) {
            builder.u();
        }
        amfh amfhVar6 = (amfh) builder.b;
        amfhVar6.D = i3 - 1;
        amfhVar6.b |= 536870912;
        armf armfVar = this.E;
        akul ag = aktp.ag(null);
        if (((Optional) ((apxx) armfVar).a).isPresent()) {
            ag = ((lbq) ((Optional) ((apxx) this.E).a).get()).a();
        }
        qiu.h(ag.h(new kxr(this, builder, amfeVar, 6), this.A));
    }

    @Override // defpackage.mho
    public final void t(ConversationIdType conversationIdType, amfe amfeVar, int i2) {
        qjb.a(new mib(this, conversationIdType, amfeVar, i2, 0), this.A);
    }

    @Override // defpackage.mho
    public final void u(amfh amfhVar, ConversationIdType conversationIdType, amfe amfeVar, boolean z, tqc tqcVar) {
        if (!this.y.get()) {
            r();
            return;
        }
        aozy builder = amfhVar.toBuilder();
        long a = ((lzz) this.q.b()).a(conversationIdType);
        if (!builder.b.isMutable()) {
            builder.u();
        }
        apag apagVar = builder.b;
        amfh amfhVar2 = (amfh) apagVar;
        amfhVar2.b |= 65536;
        amfhVar2.r = a;
        if (!apagVar.isMutable()) {
            builder.u();
        }
        apag apagVar2 = builder.b;
        amfh amfhVar3 = (amfh) apagVar2;
        amfhVar3.e = 3;
        amfhVar3.b |= 1;
        if (!apagVar2.isMutable()) {
            builder.u();
        }
        amfh amfhVar4 = (amfh) builder.b;
        amfhVar4.f = amfeVar.t;
        amfhVar4.b |= 2;
        int i2 = tqc.i(tqcVar);
        if (!builder.b.isMutable()) {
            builder.u();
        }
        apag apagVar3 = builder.b;
        amfh amfhVar5 = (amfh) apagVar3;
        amfhVar5.C = i2 - 1;
        amfhVar5.b |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
        if (!apagVar3.isMutable()) {
            builder.u();
        }
        amfh amfhVar6 = (amfh) builder.b;
        amfhVar6.b |= 32;
        amfhVar6.i = z;
        armf armfVar = this.E;
        akul ag = aktp.ag(null);
        if (((Optional) ((apxx) armfVar).a).isPresent()) {
            ag = ((lbq) ((Optional) ((apxx) this.E).a).get()).a();
        }
        qiu.h(ag.h(new kxr(this, builder, amfeVar, 5), this.A));
    }

    @Override // defpackage.mho
    public final void v(ConversationIdType conversationIdType, amfd amfdVar) {
        if (this.y.get()) {
            aozy createBuilder = amfh.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            amfh amfhVar = (amfh) apagVar;
            amfhVar.x = 2;
            amfhVar.b |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            amfh amfhVar2 = (amfh) createBuilder.b;
            amfhVar2.d = Integer.valueOf(amfdVar.i);
            amfhVar2.c = 28;
            bM(createBuilder, conversationIdType);
            return;
        }
        r();
    }

    @Override // defpackage.mho
    public final void w(boolean z, boolean z2) {
        if (!this.y.get()) {
            r();
            return;
        }
        xyo a = k.a();
        a.H("Default SMS app changed.");
        a.A("beforeState", z);
        a.A("currentState", z2);
        a.q();
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_SETTING;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        int i2 = 1;
        amfrVar.b |= 1;
        aozy createBuilder = amic.a.createBuilder();
        aozy createBuilder2 = amfl.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar = createBuilder2.b;
        amfl amflVar = (amfl) apagVar;
        amflVar.b |= 1;
        amflVar.c = z;
        if (!apagVar.isMutable()) {
            createBuilder2.u();
        }
        amfl amflVar2 = (amfl) createBuilder2.b;
        amflVar2.b |= 2;
        amflVar2.d = z2;
        yyb.aO(akul.g(aktp.ap(this.C).h(new ujb(this, this.v.f().toEpochMilli(), i2), this.af)).h(new mhr(this, createBuilder2, amfqVar, createBuilder, 0), this.A), "BugleUsageStatistics", "Failed to update logDefaultSmsAppChange");
    }

    @Override // defpackage.mho
    public final void x() {
        if (!this.y.get()) {
            r();
        } else {
            ((mbl) this.S.b()).e("Bugle.Rcs.Onboarding.Boew.Outcome.Counts", ((zxy) this.U.b()).w() - 1);
        }
    }

    @Override // defpackage.mho
    public final void y(ConversationIdType conversationIdType, amfu amfuVar) {
        String r = ((vqu) this.ab.b()).r(conversationIdType);
        aozy createBuilder = amfv.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amfv amfvVar = (amfv) createBuilder.b;
        amfvVar.c = 5;
        amfvVar.b |= 1;
        amhb x = ((lfl) this.s.b()).x(((yyt) this.ac.b()).Q(vqk.c));
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amfv amfvVar2 = (amfv) createBuilder.b;
        amfvVar2.e = x;
        amfvVar2.b |= 4;
        amwt d = ((vrn) ((xyt) this.M.b()).a()).d();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amfv amfvVar3 = (amfv) apagVar;
        amfvVar3.f = d.E;
        amfvVar3.b |= 8;
        if (r == null) {
            r = "";
        }
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        amfv amfvVar4 = (amfv) apagVar2;
        amfvVar4.b |= 32;
        amfvVar4.h = r;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        amfv amfvVar5 = (amfv) createBuilder.b;
        amfuVar.getClass();
        amfvVar5.g = amfuVar;
        amfvVar5.b |= 16;
        amfv amfvVar6 = (amfv) createBuilder.s();
        hgj hgjVar = this.K;
        AtomicBoolean atomicBoolean = this.y;
        amxo n = hgjVar.n();
        if (!atomicBoolean.get()) {
            r();
            return;
        }
        maq maqVar = this.x;
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amgl amglVar = (amgl) amgu.a.createBuilder();
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar = (amgu) amglVar.b;
        amguVar.aa = n.h;
        amguVar.c |= 2097152;
        amgu amguVar2 = (amgu) amglVar.s();
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amguVar2.getClass();
        amfrVar.k = amguVar2;
        amfrVar.b |= 4;
        amfp amfpVar = amfp.BUGLE_GROUP;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amfrVar2.i = amfpVar.dg;
        amfrVar2.b |= 1;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar3 = (amfr) amfqVar.b;
        amfvVar6.getClass();
        amfrVar3.B = amfvVar6;
        amfrVar3.b |= 4194304;
        maqVar.j((amfq) ((amfr) amfqVar.s()).toBuilder());
    }

    @Override // defpackage.mho
    public final void z(rve rveVar, MessageCoreData messageCoreData, int i2, amxo amxoVar) {
        bK(rveVar, messageCoreData, i2, 3, null, amxoVar);
    }
}
