package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.apps.messaging.shared.analytics.recurringmetrics.AnalyticsAlarmReceiver;
import j$.util.Collection;
import j$.util.DesugarTimeZone;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mfo {
    public final armf A;
    public final armf B;
    public final armf C;
    public final armf D;
    public final armf E;
    public final armf F;
    public final armf G;
    public final Optional H;
    public final armf I;
    public final armf J;
    public final armf K;
    public final Optional L;
    public final armf M;
    public final armf N;
    public final armf O;
    public final armf P;
    public final armf Q;
    public final armf R;
    public final armf S;
    public final armf T;
    public final armf U;
    public final zxy V;
    private final xyt X;
    private final yjr Y;
    private final Optional Z;
    private final xvu aa;
    private final anen ab;
    private final adtn ac;
    private final Optional ad;
    private final Optional ae;
    private final armf af;
    private final armf ag;
    private final Optional ah;
    private final Optional ai;
    private final armf aj;
    private final armf ak;
    private final armf al;
    private final armf am;
    private final armf an;
    private final armf ao;
    private final armf ap;
    private final lpg aq;
    private final zai ar;
    public final Context i;
    public final trn j;
    public final yjy k;
    public final yhu l;
    public final mho m;
    public final mbl n;
    public final apwt o;
    public final armf p;
    public final ykw q;
    public final yjf r;
    public final xnv s;
    public final vqu t;
    public final men u;
    public final mek v;
    public final mdt w;
    public final anen x;
    public final anen y;
    public final armf z;
    public static final xze a = xze.g("BugleUsageStatistics", "RecurringMetricsUploader");
    private static final utz W = uuh.i(uuh.b, "enable_device_resolution_upload", true);
    public static final uuf b = uuh.q(151630898);
    static final alhr c = uuh.w("log_subs_per_active_sim");
    static final utz d = uuh.e(uuh.b, "num_of_last_phone_number_digits", 5);
    static final utz e = uuh.e(uuh.b, "upper_limit_of_sub_per_number", 10);
    public static final long f = TimeUnit.DAYS.toMillis(1);
    public static final long g = TimeUnit.DAYS.toMillis(1);
    public static final long h = TimeUnit.DAYS.toMillis(1);

    public mfo(Context context, trn trnVar, yjy yjyVar, yhu yhuVar, mho mhoVar, mbl mblVar, apwt apwtVar, armf armfVar, zxy zxyVar, xyt xytVar, yjr yjrVar, ykw ykwVar, yjf yjfVar, xnv xnvVar, Optional optional, lpg lpgVar, xvu xvuVar, vqu vquVar, men menVar, mek mekVar, mdt mdtVar, anen anenVar, anen anenVar2, anen anenVar3, adtn adtnVar, zai zaiVar, armf armfVar2, Optional optional2, Optional optional3, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, Optional optional4, armf armfVar12, armf armfVar13, armf armfVar14, Optional optional5, Optional optional6, Optional optional7, armf armfVar15, armf armfVar16, armf armfVar17, armf armfVar18, armf armfVar19, armf armfVar20, armf armfVar21, armf armfVar22, armf armfVar23, armf armfVar24, armf armfVar25, armf armfVar26, armf armfVar27, armf armfVar28, armf armfVar29, armf armfVar30) {
        this.i = context;
        this.j = trnVar;
        this.k = yjyVar;
        this.l = yhuVar;
        this.m = mhoVar;
        this.n = mblVar;
        this.o = apwtVar;
        this.p = armfVar;
        this.V = zxyVar;
        this.X = xytVar;
        this.Y = yjrVar;
        this.q = ykwVar;
        this.r = yjfVar;
        this.s = xnvVar;
        this.Z = optional;
        this.aq = lpgVar;
        this.aa = xvuVar;
        this.t = vquVar;
        this.u = menVar;
        this.v = mekVar;
        this.w = mdtVar;
        this.x = anenVar;
        this.y = anenVar2;
        this.ab = anenVar3;
        this.ac = adtnVar;
        this.ar = zaiVar;
        this.z = armfVar2;
        this.ad = optional2;
        this.ae = optional3;
        this.C = armfVar5;
        this.D = armfVar6;
        this.E = armfVar7;
        this.F = armfVar8;
        this.A = armfVar3;
        this.B = armfVar4;
        this.af = armfVar9;
        this.ag = armfVar10;
        this.O = armfVar18;
        this.G = armfVar11;
        this.H = optional4;
        this.I = armfVar12;
        this.J = armfVar13;
        this.ah = optional5;
        this.ai = optional6;
        this.K = armfVar14;
        this.L = optional7;
        this.aj = armfVar15;
        this.M = armfVar16;
        this.ak = armfVar17;
        this.N = armfVar20;
        this.al = armfVar19;
        this.P = armfVar21;
        this.am = armfVar22;
        this.Q = armfVar23;
        this.R = armfVar24;
        this.an = armfVar25;
        this.ao = armfVar26;
        this.ap = armfVar27;
        this.S = armfVar28;
        this.T = armfVar29;
        this.U = armfVar30;
    }

    private final amig f(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i5;
        Object apply;
        Integer valueOf;
        ykb h2 = this.k.h(i);
        int i6 = 0;
        Optional j = h2.j(false);
        aozy createBuilder = amif.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        int i7 = 1;
        if (i == i2) {
            z = true;
        } else {
            z = false;
        }
        apag apagVar = createBuilder.b;
        amif amifVar = (amif) apagVar;
        amifVar.b |= 1;
        amifVar.c = z;
        if (i == i3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        amif amifVar2 = (amif) apagVar2;
        int i8 = 2;
        amifVar2.b |= 2;
        amifVar2.d = z2;
        if (i == i4) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        amif amifVar3 = (amif) createBuilder.b;
        amifVar3.b |= 4;
        amifVar3.e = z3;
        if (((pcf) this.ap.b()).a() && i == this.k.f()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amif amifVar4 = (amif) createBuilder.b;
        amifVar4.b |= 8;
        amifVar4.f = z4;
        amif amifVar5 = (amif) createBuilder.s();
        boolean isPresent = j.isPresent();
        aozy createBuilder2 = amig.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar3 = createBuilder2.b;
        amig amigVar = (amig) apagVar3;
        amigVar.b |= 1;
        amigVar.c = i;
        if (!apagVar3.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar4 = createBuilder2.b;
        amig amigVar2 = (amig) apagVar4;
        amigVar2.b |= 2;
        amigVar2.d = isPresent;
        if (true != isPresent) {
            i5 = 3;
        } else {
            i5 = 2;
        }
        if (!apagVar4.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar5 = createBuilder2.b;
        amig amigVar3 = (amig) apagVar5;
        amigVar3.e = i5 - 1;
        amigVar3.b |= 4;
        if (!apagVar5.isMutable()) {
            createBuilder2.u();
        }
        amig amigVar4 = (amig) createBuilder2.b;
        amifVar5.getClass();
        amigVar4.f = amifVar5;
        amigVar4.b |= 8;
        if (((pcf) this.ap.b()).a()) {
            amwt amwtVar = ((adjc) this.ao.b()).d(i).a;
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            amig amigVar5 = (amig) createBuilder2.b;
            amigVar5.j = amwtVar.E;
            amigVar5.b |= 64;
        }
        if (((Boolean) ((utz) c.get()).e()).booleanValue()) {
            String y = h2.y();
            qwt a2 = qww.a();
            a2.w("querySubscriptionsInRecurringMetrics");
            apply = new mfk(i7).apply(qww.e);
            qwp[] qwpVarArr = {(qwp) apply};
            valueOf = Integer.valueOf(a.bp().c());
            int intValue = valueOf.intValue();
            if (((Integer) qww.b.getOrDefault(qwpVarArr[0].toString(), -1)).intValue() > intValue) {
                agnc.t("columnReference.toString()", intValue);
            }
            a2.m(qwpVarArr);
            a2.c(new lut(y, 12));
            a2.u(((Integer) e.e()).intValue());
            Map.EL.forEach((HashMap) Collection.EL.stream(a2.b().t()).map(new mfk(i6)).collect(Collectors.groupingBy(Function$CC.identity(), new mcw(5), Collectors.counting())), new lui(createBuilder2, i8));
        }
        return (amig) createBuilder2.s();
    }

    public final void a(alor alorVar, String str) {
        aluq listIterator = alorVar.entrySet().listIterator();
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            this.n.h(str, ((Boolean) entry.getValue()).booleanValue() ? 1L : 0L, (String) entry.getKey());
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:228:0x07ad. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:236:0x07c5 A[Catch: apba -> 0x0c0a, TryCatch #0 {apba -> 0x0c0a, blocks: (B:224:0x078b, B:226:0x07a7, B:227:0x07a9, B:228:0x07ad, B:229:0x07b0, B:230:0x0bf8, B:231:0x0c09, B:234:0x07bd, B:236:0x07c5, B:237:0x07c8, B:239:0x07de, B:242:0x07e7, B:244:0x07f5, B:246:0x07fd, B:247:0x0800, B:299:0x080f, B:301:0x0817, B:302:0x081a, B:303:0x0827, B:305:0x082f, B:306:0x0832), top: B:223:0x078b }] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x07de A[Catch: apba -> 0x0c0a, TryCatch #0 {apba -> 0x0c0a, blocks: (B:224:0x078b, B:226:0x07a7, B:227:0x07a9, B:228:0x07ad, B:229:0x07b0, B:230:0x0bf8, B:231:0x0c09, B:234:0x07bd, B:236:0x07c5, B:237:0x07c8, B:239:0x07de, B:242:0x07e7, B:244:0x07f5, B:246:0x07fd, B:247:0x0800, B:299:0x080f, B:301:0x0817, B:302:0x081a, B:303:0x0827, B:305:0x082f, B:306:0x0832), top: B:223:0x078b }] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x07f5 A[Catch: apba -> 0x0c0a, TryCatch #0 {apba -> 0x0c0a, blocks: (B:224:0x078b, B:226:0x07a7, B:227:0x07a9, B:228:0x07ad, B:229:0x07b0, B:230:0x0bf8, B:231:0x0c09, B:234:0x07bd, B:236:0x07c5, B:237:0x07c8, B:239:0x07de, B:242:0x07e7, B:244:0x07f5, B:246:0x07fd, B:247:0x0800, B:299:0x080f, B:301:0x0817, B:302:0x081a, B:303:0x0827, B:305:0x082f, B:306:0x0832), top: B:223:0x078b }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x08a8  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x08ff  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0989  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0a05  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0a14  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0a24  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0a3b  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0ae2  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0b38  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0b17  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0a1b  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0a07  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x099f  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x096b  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x080d  */
    /* JADX WARN: Type inference failed for: r1v319, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v322, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v47, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v53, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, trz] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.mfs r35, android.app.usage.NetworkStatsManager r36) {
        /*
            Method dump skipped, instructions count: 3116
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mfo.b(mfs, android.app.usage.NetworkStatsManager):void");
    }

    public final void c(Calendar calendar) {
        xze xzeVar = a;
        if (xzeVar.s(3)) {
            DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(3, 3);
            xyo a2 = xzeVar.a();
            a2.H("Scheduling analytics uploader for");
            a2.H(dateTimeInstance.format(calendar.getTime()));
            a2.q();
        }
        AlarmManager alarmManager = (AlarmManager) this.i.getSystemService("alarm");
        if (alarmManager == null) {
            xzeVar.q("Cannot schedule telemetry. AlarmManager is null");
            return;
        }
        Context context = this.i;
        lqn f2 = lqn.f(context, AnalyticsAlarmReceiver.class, "android.intent.action.VIEW");
        f2.c(context.getPackageName());
        PendingIntent b2 = aipr.b(this.i, 0, f2.a(), yhy.a(0));
        if (b2 == null) {
            xzeVar.q("Cannot schedule telemetry. Pending intent is null");
        } else {
            alarmManager.setInexactRepeating(0, calendar.getTimeInMillis(), 86400000L, b2);
        }
    }

    public final void d() {
        if (this.m.al()) {
            Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
            Random random = new Random();
            long e2 = this.q.e("first_analytics_upload_time_in_millis", -1L);
            if (e2 == -1) {
                calendar.set(11, 11);
                calendar.add(10, random.nextInt(5));
                calendar.set(12, random.nextInt(60));
                calendar.set(13, random.nextInt(60));
                this.q.k("first_analytics_upload_time_in_millis", calendar.getTimeInMillis());
            } else {
                Calendar calendar2 = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
                calendar2.setTimeInMillis(e2);
                calendar.set(10, calendar2.get(10));
                calendar.set(12, calendar2.get(12));
                calendar.set(13, calendar2.get(13));
            }
            calendar.set(5, Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC")).get(5));
            calendar.add(5, 1);
            c(calendar);
        }
    }

    public final void e(wng wngVar) {
        akul h2 = akul.g(aktp.Y(this.w.c.a(), new mdr(4), andi.a)).h(new ijq(this, wngVar, 16), andi.a);
        wngVar.q("RecurringTelemetryUploader", h2);
        yyb.aO(h2, "BugleUsageStatistics", "Failed to log recurring telemetry");
    }
}
