package defpackage;

import android.content.Context;
import android.net.Uri;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.rcs.availability.metrics.RcsAvailabilityLogWorker;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vyv {
    public final Object a;

    public vyv(Object obj) {
        this.a = obj;
    }

    public static amvn I(amvm amvmVar, int i, boolean z, boolean z2) {
        aozy createBuilder = amvn.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amvn amvnVar = (amvn) apagVar;
        amvnVar.e = amvmVar.M;
        amvnVar.b |= 4;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        amvn amvnVar2 = (amvn) apagVar2;
        amvnVar2.g = i - 1;
        amvnVar2.b |= 16;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apag apagVar3 = createBuilder.b;
        amvn amvnVar3 = (amvn) apagVar3;
        amvnVar3.b |= 1;
        amvnVar3.c = z;
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        amvn amvnVar4 = (amvn) createBuilder.b;
        amvnVar4.b |= 2;
        amvnVar4.d = z2;
        return (amvn) createBuilder.s();
    }

    public static amvn L(amvm amvmVar, boolean z, boolean z2, UUID uuid) {
        aozb w;
        aozy builder = I(amvmVar, 3, z, z2).toBuilder();
        w = aozb.w(ByteBuffer.allocate(16).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits()).array());
        if (!builder.b.isMutable()) {
            builder.u();
        }
        amvn amvnVar = (amvn) builder.b;
        amvnVar.b |= 8;
        amvnVar.f = w;
        return (amvn) builder.s();
    }

    public static /* synthetic */ String T(vyv vyvVar) {
        Object obj = vyvVar.a;
        return t();
    }

    public static final RcsDestinationId c(qei qeiVar) {
        String format;
        qeh qehVar = qeh.PHONE;
        qeh b = qeh.b(qeiVar.c);
        if (b == null) {
            b = qeh.UNKNOWN_TYPE;
        }
        if (!qehVar.equals(b)) {
            if (qeiVar.d.startsWith("sip:")) {
                format = qeiVar.d;
            } else {
                format = String.format("%s%s", "sip:", qeiVar.d);
            }
            atkv atkvVar = new atkv((byte[]) null);
            atkvVar.k(2);
            atkvVar.j(format);
            return atkvVar.i();
        }
        atkv atkvVar2 = new atkv((byte[]) null);
        atkvVar2.k(1);
        atkvVar2.j(qeiVar.d);
        return atkvVar2.i();
    }

    public static final void p(tap tapVar, String str, String str2) {
        tapVar.getClass();
        if ((str != null && str.length() != 0) || (str2 != null && str2.length() != 0)) {
            tapVar.F(vox.PROFILE_CONTACT_SOURCE);
            tapVar.u(str);
            tapVar.t(str2);
        } else {
            tapVar.F(vox.PROFILE_UNSPECIFIED_SOURCE);
            tapVar.u(null);
            tapVar.t(null);
        }
    }

    public static final String t() {
        LocalDate now = LocalDate.now(ZoneId.systemDefault());
        Objects.toString(now);
        return String.valueOf(now).concat("");
    }

    public final /* synthetic */ void A() {
        aozy aozyVar = (aozy) this.a;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        xlc xlcVar = (xlc) aozyVar.b;
        xlc xlcVar2 = xlc.a;
        xlcVar.c = xlc.emptyProtobufList();
    }

    public final /* synthetic */ void B() {
        DesugarCollections.unmodifiableList(((xlc) ((aozy) this.a).b).c).getClass();
    }

    public final /* synthetic */ xku C() {
        apag s = ((aozy) this.a).s();
        s.getClass();
        return (xku) s;
    }

    public final xlb D() {
        xlb xlbVar = ((xku) ((aozy) this.a).b).c;
        if (xlbVar == null) {
            xlbVar = xlb.a;
        }
        xlbVar.getClass();
        return xlbVar;
    }

    public final void E(apct apctVar) {
        aozy aozyVar = (aozy) this.a;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        xku xkuVar = (xku) aozyVar.b;
        xku xkuVar2 = xku.a;
        xkuVar.i = apctVar;
        xkuVar.b |= 16;
    }

    public final void F(int i) {
        aozy aozyVar = (aozy) this.a;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        xku xkuVar = (xku) aozyVar.b;
        xku xkuVar2 = xku.a;
        xkuVar.g = i;
    }

    public final void G(apct apctVar) {
        aozy aozyVar = (aozy) this.a;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        xku xkuVar = (xku) aozyVar.b;
        xku xkuVar2 = xku.a;
        xkuVar.d = apctVar;
        xkuVar.b |= 2;
    }

    public final void H(xlb xlbVar) {
        aozy aozyVar = (aozy) this.a;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        xku xkuVar = (xku) aozyVar.b;
        xku xkuVar2 = xku.a;
        xkuVar.c = xlbVar;
        xkuVar.b |= 1;
    }

    public final void J(amvm amvmVar, int i, boolean z, alog alogVar) {
        ((xjc) this.a).c(alogVar, I(amvmVar, i, true, z));
    }

    public final void K(amvm amvmVar, int i, alog alogVar) {
        ((xjc) this.a).c(alogVar, I(amvmVar, i, false, false));
    }

    public final void M(UUID uuid, UUID uuid2, int i, alog alogVar) {
        aozb w;
        aozy createBuilder = amvh.a.createBuilder();
        w = aozb.w(ByteBuffer.allocate(16).putLong(uuid2.getMostSignificantBits()).putLong(uuid2.getLeastSignificantBits()).array());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amvh amvhVar = (amvh) apagVar;
        amvhVar.b |= 1;
        amvhVar.c = w;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        amvh amvhVar2 = (amvh) apagVar2;
        amvhVar2.b |= 2;
        amvhVar2.d = 0L;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        amvh amvhVar3 = (amvh) createBuilder.b;
        amvhVar3.e = i - 1;
        amvhVar3.b |= 4;
        ((xjc) this.a).b(uuid, alogVar, (amvh) createBuilder.s());
    }

    public final void N(UUID uuid, Instant instant, Instant instant2, Instant instant3, long j, alog alogVar) {
        Duration between = Duration.between(instant, instant3);
        aozy createBuilder = amvf.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amvf amvfVar = (amvf) createBuilder.b;
        amvfVar.b |= 1;
        amvfVar.c = j;
        aozn i = aotl.i(between);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amvf amvfVar2 = (amvf) createBuilder.b;
        i.getClass();
        amvfVar2.d = i;
        amvfVar2.b |= 2;
        aozn i2 = aotl.i(Duration.between(instant2, instant3));
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amvf amvfVar3 = (amvf) createBuilder.b;
        i2.getClass();
        amvfVar3.e = i2;
        amvfVar3.b |= 4;
        ((xjc) this.a).b(uuid, alogVar, (amvf) createBuilder.s());
    }

    public final void O(UUID uuid, UUID uuid2, int i, int i2, int i3, int i4, int i5, alog alogVar) {
        aozb w;
        if (true != ((Boolean) xjc.a.e()).booleanValue()) {
            i = -1;
        }
        if (true != ((Boolean) xjc.a.e()).booleanValue()) {
            i2 = -1;
        }
        if (true != ((Boolean) xjc.a.e()).booleanValue()) {
            i3 = -1;
        }
        if (true != ((Boolean) xjc.a.e()).booleanValue()) {
            i4 = -1;
        }
        if (true != ((Boolean) xjc.a.e()).booleanValue()) {
            i5 = -1;
        }
        aozy createBuilder = amvc.a.createBuilder();
        w = aozb.w(ByteBuffer.allocate(16).putLong(uuid2.getMostSignificantBits()).putLong(uuid2.getLeastSignificantBits()).array());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amvc amvcVar = (amvc) apagVar;
        amvcVar.b = 1 | amvcVar.b;
        amvcVar.c = w;
        long j = i;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        amvc amvcVar2 = (amvc) apagVar2;
        amvcVar2.b |= 2;
        amvcVar2.d = j;
        long j2 = i3;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apag apagVar3 = createBuilder.b;
        amvc amvcVar3 = (amvc) apagVar3;
        amvcVar3.b |= 4;
        amvcVar3.e = j2;
        long j3 = i4;
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        apag apagVar4 = createBuilder.b;
        amvc amvcVar4 = (amvc) apagVar4;
        amvcVar4.b |= 8;
        amvcVar4.f = j3;
        long j4 = i5;
        if (!apagVar4.isMutable()) {
            createBuilder.u();
        }
        amvc amvcVar5 = (amvc) createBuilder.b;
        amvcVar5.b |= 32;
        amvcVar5.h = j4;
        if (((Boolean) ((utz) xim.h.get()).e()).booleanValue()) {
            long j5 = i2;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amvc amvcVar6 = (amvc) createBuilder.b;
            amvcVar6.b |= 16;
            amvcVar6.g = j5;
        }
        ((xjc) this.a).b(uuid, alogVar, (amvc) createBuilder.s());
    }

    public final void P(UUID uuid, UUID uuid2, UUID uuid3, int i, Duration duration, Duration duration2, alog alogVar) {
        aozb w;
        aozb w2;
        aozy createBuilder = amvb.a.createBuilder();
        w = aozb.w(ByteBuffer.allocate(16).putLong(uuid2.getMostSignificantBits()).putLong(uuid2.getLeastSignificantBits()).array());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amvb amvbVar = (amvb) createBuilder.b;
        amvbVar.b |= 1;
        amvbVar.c = w;
        w2 = aozb.w(ByteBuffer.allocate(16).putLong(uuid3.getMostSignificantBits()).putLong(uuid3.getLeastSignificantBits()).array());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amvb amvbVar2 = (amvb) apagVar;
        amvbVar2.b |= 8;
        amvbVar2.f = w2;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        amvb amvbVar3 = (amvb) createBuilder.b;
        amvbVar3.g = i - 1;
        amvbVar3.b |= 16;
        aozn i2 = aotl.i(duration);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amvb amvbVar4 = (amvb) createBuilder.b;
        i2.getClass();
        amvbVar4.d = i2;
        amvbVar4.b |= 2;
        aozn i3 = aotl.i(duration2);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amvb amvbVar5 = (amvb) createBuilder.b;
        i3.getClass();
        amvbVar5.e = i3;
        amvbVar5.b |= 4;
        ((xjc) this.a).b(uuid, alogVar, (amvb) createBuilder.s());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v21, types: [armf, java.lang.Object] */
    public final void Q(Instant instant, Instant instant2, Instant instant3, int i, int i2, amvm amvmVar, UUID uuid, UUID uuid2) {
        aozb w;
        aozb w2;
        vyv vyvVar = (vyv) this.a.b();
        aozy createBuilder = xig.a.createBuilder();
        apct b = apds.b(instant.toEpochMilli());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        xig xigVar = (xig) createBuilder.b;
        b.getClass();
        xigVar.c = b;
        xigVar.b |= 1;
        apct b2 = apds.b(instant2.toEpochMilli());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        xig xigVar2 = (xig) createBuilder.b;
        b2.getClass();
        xigVar2.d = b2;
        xigVar2.b |= 2;
        apct b3 = apds.b(instant3.toEpochMilli());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        xig xigVar3 = (xig) apagVar;
        b3.getClass();
        xigVar3.e = b3;
        xigVar3.b |= 4;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        ((xig) apagVar2).f = i;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apag apagVar3 = createBuilder.b;
        ((xig) apagVar3).g = i2;
        int i3 = amvmVar.M;
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        ((xig) createBuilder.b).h = i3;
        w = aozb.w(ByteBuffer.allocate(16).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits()).array());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((xig) createBuilder.b).i = w;
        w2 = aozb.w(ByteBuffer.allocate(16).putLong(uuid2.getMostSignificantBits()).putLong(uuid2.getLeastSignificantBits()).array());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((xig) createBuilder.b).j = w2;
        ((uof) vyvVar.a.b()).a(upk.a("forward_sync_batch", (xig) createBuilder.s()));
    }

    public final void R(UUID uuid) {
        aozy createBuilder = xhb.a.createBuilder();
        createBuilder.getClass();
        if (uuid != null) {
            aozy createBuilder2 = xhb.a.createBuilder();
            aozb bX = yyb.bX(uuid);
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            xhb xhbVar = (xhb) createBuilder2.b;
            xhbVar.b |= 4;
            xhbVar.e = bX;
        }
        ((uof) this.a).a(upk.a("IncrementalReverseSyncWorkItemHandler", createBuilder.s()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xyt, java.lang.Object] */
    public final ankp S() {
        alpt e = ((yaq) this.a.a()).e();
        if (e.isEmpty()) {
            return ankp.NO_NETWORK;
        }
        if (e.contains(yap.CELLULAR)) {
            return ankp.CELLULAR;
        }
        if (e.contains(yap.WIFI)) {
            return ankp.WIFI;
        }
        if (e.contains(yap.ETHERNET)) {
            return ankp.ETHERNET;
        }
        return ankp.UNKNOWN;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final akul a() {
        aogy aogyVar = (aogy) this.a.b();
        akct a = akcx.a(vyf.class);
        a.e(new akcw("RcsLimboMessagesResolverWorker", 2));
        gsd gsdVar = new gsd();
        gsdVar.c(2);
        a.b(gsdVar.a());
        a.c(new akcu(new akcv(((Long) vyf.a.e()).longValue(), TimeUnit.HOURS), alfd.a));
        return akul.g(aogyVar.r(a.a())).h(new vsw(13), andi.a);
    }

    public final qei b(RcsDestinationId rcsDestinationId, boolean z) {
        String a;
        if (!z && rcsDestinationId.b() != 1) {
            if (rcsDestinationId.a().startsWith("sip:")) {
                a = rcsDestinationId.a().substring(4);
            } else {
                a = rcsDestinationId.a();
            }
            int indexOf = a.indexOf(59);
            if (indexOf >= 0) {
                a = a.substring(0, indexOf);
            }
            return ((psq) this.a).a(a, false);
        }
        return ((psq) this.a).a(rcsDestinationId.a(), z);
    }

    public final amgu d() {
        amgl amglVar = (amgl) amgu.a.createBuilder();
        amxo n = ((hgj) this.a).n();
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar = (amgu) amglVar.b;
        amguVar.aa = n.h;
        amguVar.c |= 2097152;
        return (amgu) amglVar.s();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void e(int i) {
        mar a = ((mbb) this.a.b()).a();
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.REVOKE_CONSENT_EVENT;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        aozy createBuilder = amxw.a.createBuilder();
        aozy createBuilder2 = amxx.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        amxx amxxVar = (amxx) createBuilder2.b;
        amxxVar.c = i - 1;
        amxxVar.b |= 1;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amxw amxwVar = (amxw) createBuilder.b;
        amxx amxxVar2 = (amxx) createBuilder2.s();
        amxxVar2.getClass();
        amxwVar.c = amxxVar2;
        amxwVar.b = 2;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amxw amxwVar2 = (amxw) createBuilder.s();
        amxwVar2.getClass();
        amfrVar2.bx = amxwVar2;
        amfrVar2.h |= 512;
        a.a(amfqVar, mbt.LOG_SPEC_REVOKE_CONSENT_EVENTS);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void f(vxj vxjVar) {
        ((uof) this.a.b()).b(upk.a("recover_disabled_rcs_group", vxjVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void g(vwp vwpVar) {
        ((uof) this.a.b()).a(upk.a("process_rcs_group_notify", vwpVar));
    }

    public final void h(amsu amsuVar) {
        mar a = ((mbb) this.a).a();
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfqVar.getClass();
        alzz.n(amfp.MMS_MERGING_EVENT, amfqVar);
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.bJ = amsuVar;
        amfrVar.h |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
        a.b((amfq) alzz.h(amfqVar).toBuilder(), mbt.LOG_SPEC_MMS_MERGING_EVENT);
    }

    public final void i() {
        aozy createBuilder = amsu.a.createBuilder();
        createBuilder.getClass();
        aktp.bj(3, createBuilder);
        aktp.bk(4, createBuilder);
        h(aktp.bi(createBuilder));
    }

    public final void j() {
        aozy createBuilder = amsu.a.createBuilder();
        createBuilder.getClass();
        aktp.bj(3, createBuilder);
        aktp.bk(3, createBuilder);
        h(aktp.bi(createBuilder));
    }

    public final void k() {
        aozy createBuilder = amsu.a.createBuilder();
        createBuilder.getClass();
        aktp.bj(3, createBuilder);
        aktp.bk(2, createBuilder);
        h(aktp.bi(createBuilder));
    }

    public final void l() {
        aozy createBuilder = amsu.a.createBuilder();
        createBuilder.getClass();
        aktp.bj(2, createBuilder);
        h(aktp.bi(createBuilder));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void m(int i) {
        ((mbl) this.a.b()).e("Bugle.DataModel.Data.ProcessMessage.SelfNotPresent.Counts", i - 1);
    }

    public final void n() {
        gtm ar = gvf.ar((Context) this.a);
        gtg gtgVar = new gtg(RcsAvailabilityLogWorker.class, TimeUnit.HOURS, TimeUnit.HOURS);
        gsd gsdVar = new gsd();
        gsdVar.c(2);
        gsdVar.d();
        gtgVar.f(gsdVar.a());
        gtgVar.e(gry.LINEAR, 60L, TimeUnit.MINUTES);
        ar.j("com.google.android.apps.messaging.shared.rcs.availability.metrics.RcsAvailabilityLogWorker", 2, gtgVar.j());
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [armf, java.lang.Object] */
    public final void o(tap tapVar, String str) {
        tapVar.getClass();
        if (str != null && str.length() != 0) {
            tapVar.n(Uri.parse(str));
        } else {
            tapVar.n(null);
        }
        vox voxVar = tapVar.Q;
        vox voxVar2 = vox.PROFILE_PEOPLE_SHARING_SOURCE;
        if (voxVar != voxVar2) {
            if (voxVar == voxVar2) {
            }
            if (str != null && str.length() != 0) {
                tapVar.J(vox.PROFILE_CONTACT_SOURCE);
                tapVar.M(Uri.parse(str));
                return;
            } else {
                tapVar.J(vox.PROFILE_UNSPECIFIED_SOURCE);
                tapVar.M(null);
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [armf, java.lang.Object] */
    public final aevv q(Uri uri, boolean z) {
        uri.getClass();
        String queryParameter = uri.getQueryParameter("m");
        if (queryParameter == null) {
            queryParameter = uri.toString();
            queryParameter.getClass();
        }
        if (z && ydk.C(queryParameter)) {
            String queryParameter2 = uri.getQueryParameter("f");
            Uri uri2 = null;
            if (queryParameter2 != null && queryParameter2.length() != 0) {
                uri2 = Uri.parse(queryParameter2);
            }
            Uri parse = Uri.parse(queryParameter);
            parse.getClass();
            return new aevv(parse, true, null, null, uri2, 12);
        }
        return new aevv(uri, Boolean.valueOf(z), T((vyv) this.a.b()), null, null, 24);
    }

    public final aevv r(miu miuVar, alog alogVar) {
        miuVar.getClass();
        alogVar.getClass();
        Uri a = miuVar.a();
        if (a != null) {
            boolean z = true;
            if (miuVar.b() == mit.GROUP && alogVar.size() != 1) {
                z = false;
            }
            return q(a, z);
        }
        return null;
    }

    public final aevv s(ResolvedRecipient resolvedRecipient) {
        Uri b = resolvedRecipient.b();
        b.getClass();
        return q(b, true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void u(xrn xrnVar) {
        ((uof) this.a.b()).a(upk.a("thumbnail_download_completed", xrnVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final akul v(xqr xqrVar) {
        return ((uof) this.a.b()).b(upk.a("file_download_failed", xqrVar));
    }

    public final akul w() {
        if (!((Boolean) xnk.a.e()).booleanValue()) {
            return aktp.ag(Optional.empty());
        }
        Object obj = this.a;
        akct a = akcx.a(xnk.class);
        a.e(new akcw("UniqueKeyGarbageCollectorTikTokWork", 2));
        a.c(new akcu(new akcv(1L, TimeUnit.DAYS), alfd.a));
        return akul.g(((aogy) obj).r(a.a())).h(new xgu(16), andi.a);
    }

    public final /* synthetic */ xlc x() {
        apag s = ((aozy) this.a).s();
        s.getClass();
        return (xlc) s;
    }

    public final void y(xku xkuVar) {
        xkuVar.getClass();
        aozy aozyVar = (aozy) this.a;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        xlc xlcVar = (xlc) aozyVar.b;
        xlc xlcVar2 = xlc.a;
        xlcVar.d = xkuVar;
        xlcVar.b |= 1;
    }

    public final /* synthetic */ void z(Iterable iterable) {
        iterable.getClass();
        aozy aozyVar = (aozy) this.a;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        xlc xlcVar = (xlc) aozyVar.b;
        xlc xlcVar2 = xlc.a;
        xlcVar.a();
        aoyj.addAll(iterable, xlcVar.c);
    }

    public vyv(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public vyv(armf armfVar, int[] iArr, byte[] bArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public vyv(uof uofVar, byte[] bArr) {
        uofVar.getClass();
        this.a = uofVar;
    }

    public vyv(xnv xnvVar) {
        xnvVar.getClass();
        this.a = xnvVar;
    }

    public vyv(armf armfVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public vyv(armf armfVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public vyv(mbb mbbVar) {
        mbbVar.getClass();
        this.a = mbbVar;
    }

    public vyv(Context context, aolz aolzVar) {
        this.a = aolzVar;
        HashMap hashMap = new HashMap();
        aqam.m("bugle.smapi.rcs.MessagingEngineNotificationService", aode.V(context, alpt.r("com.google.android.ims", "com.google.android.apps.messaging")), hashMap);
        aolzVar.b(aqam.o(hashMap));
    }

    public vyv(armf armfVar, char[] cArr, char[] cArr2, byte[] bArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public vyv(wyj wyjVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = wyjVar.e(new vhg(5));
    }

    public vyv() {
        this.a = new ReentrantLock();
    }

    public vyv(wyj wyjVar, char[] cArr) {
        this.a = wyjVar.e(new vhg(6));
    }

    public vyv(wyj wyjVar, byte[] bArr, byte[] bArr2) {
        this.a = wyjVar.e(new vhg(8));
    }

    public vyv(wyj wyjVar, byte[] bArr) {
        this.a = wyjVar.e(new vhg(9));
    }

    public vyv(wyj wyjVar) {
        this.a = wyjVar.e(new vhg(10));
    }

    public vyv(Context context, byte[] bArr) {
        context.getClass();
        this.a = context;
    }

    public vyv(char[] cArr) {
        this.a = ZoneId.systemDefault();
    }

    public vyv(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new vyv((byte[]) null, (byte[]) null);
    }

    public vyv(byte[] bArr, byte[] bArr2) {
        this.a = new xty();
    }

    public vyv(yyb yybVar) {
        yybVar.getClass();
        this.a = yybVar;
    }

    public vyv(armf armfVar, boolean[] zArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public vyv(@oaq armf armfVar, @oap armf armfVar2) {
        armfVar.getClass();
        armfVar2.getClass();
        this.a = armfVar;
    }

    public vyv(byte[] bArr) {
        this.a = alhe.a;
    }
}
