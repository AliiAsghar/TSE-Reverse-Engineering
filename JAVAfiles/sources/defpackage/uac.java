package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.util.SparseBooleanArray;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.time.Instant;
import j$.util.Map;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uac {
    public final Object a;
    public final Object b;

    public uac(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public static uac G() {
        uac uacVar = (uac) qyh.a.get();
        if (uacVar == null) {
            uacVar = new uac((char[]) null);
            qyh.a.set(uacVar);
        }
        ((HashSet) uacVar.a).clear();
        ((StringBuilder) uacVar.b).setLength(0);
        return uacVar;
    }

    private final boolean I(String str) {
        aluq listIterator = ((altx) this.a).listIterator();
        while (listIterator.hasNext()) {
            if (adah.b(str) || adah.f(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean h(uxk uxkVar) {
        uxkVar.getClass();
        if ((uxkVar.b & 1) != 0 && !uxkVar.d) {
            return true;
        }
        return false;
    }

    public static void t(agoz agozVar, Object obj, enh enhVar, ahiy ahiyVar) {
        agozVar.F(enhVar, new tre(ahiyVar, obj));
    }

    public static void u(ncq ncqVar, Object obj, enh enhVar, ahiy ahiyVar) {
        enhVar.getClass();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            enhVar.c(new trd(ncqVar, ahiyVar, obj));
            return;
        }
        throw new IllegalStateException("cannot add observe lifecycle from other than main thread");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    public final qxd A(String str, Context context, Uri uri, ecj ecjVar) {
        return new qxd((aksr) this.a.b(), (ahmn) this.b.b(), str, context, uri, ecjVar);
    }

    public final alpt B() {
        return ((qvo) this.b).a();
    }

    public final Optional C() {
        return ((qvo) this.b).a;
    }

    public final Optional D() {
        return ((qvo) this.b).d;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    public final qsa E(puu puuVar) {
        anen anenVar = (anen) this.a.b();
        anenVar.getClass();
        ((lgg) this.b.b()).getClass();
        return new qsa(puuVar, anenVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Map, java.lang.Object] */
    public final synchronized Random F(String str) {
        if (((AtomicBoolean) this.a).get()) {
            return new Random();
        }
        int intValue = ((Integer) Map.EL.getOrDefault(this.b, str, 0)).intValue();
        this.b.put(str, Integer.valueOf(intValue + 1));
        return new Random(intValue);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    public final usk H(alpt alptVar) {
        Function m329m = d$$ExternalSyntheticApiModelOutline0.m329m(this.a.b());
        m329m.getClass();
        acxs acxsVar = (acxs) this.b.b();
        acxsVar.getClass();
        alptVar.getClass();
        return new usk(m329m, acxsVar, "", alptVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final tvz a() {
        return new tvz(this.b, this.a);
    }

    public final twa b() {
        return a().a();
    }

    public final Drawable c(int i) {
        if (i == 40 && ttd.f()) {
            Drawable drawable = ((Context) this.a).getDrawable(R.drawable.ic_e2ee_send_icon);
            drawable.getClass();
            return drawable;
        }
        Drawable drawable2 = ((Context) this.a).getDrawable(R.drawable.ic_compose_send);
        drawable2.getClass();
        return drawable2;
    }

    public final akfb d(agoz agozVar, tra traVar, Object obj, enh enhVar) {
        t(agozVar, obj, enhVar, (ahiy) this.b);
        return new akfk((ansy) this.a, new izd(traVar, agozVar, 6), obj, 2);
    }

    public final akfb e(ncq ncqVar, Object obj, enh enhVar) {
        u(ncqVar, obj, enhVar, (ahiy) this.b);
        return new akfk((ansy) this.a, new ikn(ncqVar, 6), obj, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r7v2, types: [arpi, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.arpe r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.uxl
            if (r0 == 0) goto L13
            r0 = r7
            uxl r0 = (defpackage.uxl) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            uxl r0 = new uxl
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r7)
            goto L45
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            defpackage.aqil.P(r7)
            java.lang.Object r7 = r6.a
            txt r2 = new txt
            r4 = 18
            r5 = 0
            r2.<init>(r6, r5, r4, r5)
            r0.b = r3
            java.lang.Object r7 = defpackage.arro.q(r7, r2, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uac.f(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.arpe r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.uxm
            if (r0 == 0) goto L13
            r0 = r5
            uxm r0 = (defpackage.uxm) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            uxm r0 = new uxm
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.aqil.P(r5)
            r0.b = r3
            java.lang.Object r5 = r4.f(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            uxk r5 = (defpackage.uxk) r5
            boolean r5 = h(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uac.g(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r7v2, types: [arpi, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(defpackage.arpe r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.uxa
            if (r0 == 0) goto L13
            r0 = r7
            uxa r0 = (defpackage.uxa) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            uxa r0 = new uxa
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r7)
            goto L45
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            defpackage.aqil.P(r7)
            java.lang.Object r7 = r6.b
            txt r2 = new txt
            r4 = 16
            r5 = 0
            r2.<init>(r6, r5, r4, r5)
            r0.b = r3
            java.lang.Object r7 = defpackage.arro.q(r7, r2, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uac.i(arpe):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final long j(sqf sqfVar) {
        uvx uvxVar = (uvx) this.a.get(sqfVar.k());
        if (uvxVar != null) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            sqfVar.k();
            long millis = timeUnit.toMillis(uvxVar.d());
            sqfVar.ao(3, "flagged_message_timestamp");
            return millis + sqfVar.d;
        }
        return Long.MAX_VALUE;
    }

    public final Instant k(sqf sqfVar) {
        return Instant.ofEpochMilli(j(sqfVar));
    }

    public final boolean l(sqf sqfVar) {
        if (k(sqfVar).compareTo(((xnv) this.b).f()) <= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r7v6, types: [armf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(defpackage.akul r7, j$.time.Duration r8, java.lang.Throwable r9, defpackage.arpe r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.uvu
            if (r0 == 0) goto L13
            r0 = r10
            uvu r0 = (defpackage.uvu) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            uvu r0 = new uvu
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            mmf r9 = r0.c
            uac r7 = r0.e
            defpackage.aqil.P(r10)
            goto L52
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            defpackage.aqil.P(r10)
            long r4 = r8.toMillis()
            txt r8 = new txt
            r10 = 0
            r2 = 13
            r8.<init>(r7, r10, r2)
            r0.e = r6
            r7 = r9
            mmf r7 = (defpackage.mmf) r7
            r0.c = r7
            r0.b = r3
            java.lang.Object r10 = defpackage.arwi.s(r4, r8, r0)
            if (r10 == r1) goto L65
            r7 = r6
        L52:
            if (r10 != 0) goto L62
            java.lang.Object r7 = r7.b
            java.lang.Object r7 = r7.b()
            uvi r7 = (defpackage.uvi) r7
            r7.c(r9)
            defpackage.mmg.F()
        L62:
            arnb r7 = defpackage.arnb.a
            return r7
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uac.m(akul, j$.time.Duration, java.lang.Throwable, arpe):java.lang.Object");
    }

    public final utz n(String str, int i) {
        return uuh.e((ahtn) this.b, ((String) this.a).concat(str), i);
    }

    public final utz o(String str, long j) {
        return uuh.f((ahtn) this.b, ((String) this.a).concat(str), j);
    }

    public final utz p(String str, String str2) {
        return uuh.h((ahtn) this.b, ((String) this.a).concat(str), str2);
    }

    public final utz q(String str, boolean z) {
        return uuh.i((ahtn) this.b, ((String) this.a).concat(str), z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [pks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [pks, java.lang.Object] */
    public final void r(MessageCoreData messageCoreData, Bundle bundle) {
        bundle.getClass();
        if (!this.b.a()) {
            String string = bundle.getString("chat.extra.wrappingContentType");
            if (string != null) {
                wcm.I(messageCoreData, string);
            }
            String string2 = bundle.getString("chat.extra.customDeliveryReceiptContentType");
            byte[] byteArray = bundle.getByteArray("chat.extra.customDeliveryReceipt");
            if (string2 != null && byteArray != null) {
                messageCoreData.bi(string2, byteArray);
                return;
            }
            return;
        }
        String string3 = bundle.getString("chat.extra.wrappingContentType");
        if (string3 != null) {
            if (!this.b.a()) {
                wcm.I(messageCoreData, string3);
            } else if (I(string3)) {
                messageCoreData.bn();
            }
        }
        String string4 = bundle.getString("chat.extra.customDeliveryReceiptContentType");
        byte[] byteArray2 = bundle.getByteArray("chat.extra.customDeliveryReceipt");
        if (string4 != null && byteArray2 != null) {
            messageCoreData.bi(string4, byteArray2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [pks, java.lang.Object] */
    public final boolean s(Bundle bundle) {
        bundle.getClass();
        if (!this.b.a()) {
            String string = bundle.getString("chat.extra.wrappingContentType");
            if (string == null) {
                return false;
            }
            if (!adah.b(string) && !adah.f(string)) {
                return false;
            }
            return true;
        }
        String string2 = bundle.getString("chat.extra.wrappingContentType");
        if (string2 == null) {
            return false;
        }
        return I(string2);
    }

    public final void v(rhd rhdVar) {
        apct apctVar = rhdVar.d;
        if (apctVar == null) {
            apctVar = apds.b(((xnv) this.b).f().toEpochMilli());
        }
        w(rhdVar.a, rhdVar.b, rhdVar.e, rhdVar.f, rhdVar.g, Optional.ofNullable(rhdVar.c), apctVar);
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [armf, java.lang.Object] */
    public final void w(atok atokVar, rve rveVar, int i, int i2, int i3, Optional optional, apct apctVar) {
        if (!yad.a(atokVar)) {
            return;
        }
        aozy createBuilder = asgx.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((asgx) createBuilder.b).e = a.aq(i);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((asgx) createBuilder.b).f = atpj.b(i2);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((asgx) createBuilder.b).g = arsd.at(i3);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        asgx asgxVar = (asgx) apagVar;
        apctVar.getClass();
        asgxVar.h = apctVar;
        asgxVar.b |= 4;
        if (atokVar != null) {
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            asgx asgxVar2 = (asgx) createBuilder.b;
            asgxVar2.c = atokVar;
            asgxVar2.b |= 1;
        }
        if (optional.isPresent()) {
            aozy createBuilder2 = asgw.a.createBuilder();
            asgt asgtVar = (asgt) optional.get();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            asgw asgwVar = (asgw) createBuilder2.b;
            asgwVar.c = Integer.valueOf(asgtVar.a());
            asgwVar.b = 2;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            asgx asgxVar3 = (asgx) createBuilder.b;
            asgw asgwVar2 = (asgw) createBuilder2.s();
            asgwVar2.getClass();
            asgxVar3.i = asgwVar2;
            asgxVar3.b |= 32;
        }
        if (rveVar != null && rve.l(rveVar)) {
            aozy createBuilder3 = asgv.a.createBuilder();
            createBuilder3.bP(rveVar.f());
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            asgx asgxVar4 = (asgx) createBuilder.b;
            asgv asgvVar = (asgv) createBuilder3.s();
            asgvVar.getClass();
            asgxVar4.d = asgvVar;
            asgxVar4.b |= 2;
        }
        long a = apds.a(apctVar);
        maq maqVar = (maq) this.a.b();
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.XSL_REQUEST_EVENT;
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
        asgx asgxVar5 = (asgx) createBuilder.s();
        asgxVar5.getClass();
        amfrVar2.aI = asgxVar5;
        amfrVar2.e |= 16777216;
        maqVar.l(amfqVar, amrs.XSL_REQUEST_EVENT, a);
    }

    public final void x(atok atokVar, rve rveVar, int i, Optional optional) {
        w(atokVar, rveVar, 10, 21, i, optional, apds.b(((xnv) this.b).f().toEpochMilli()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    public final qxz y(int i) {
        ocu ocuVar = (ocu) this.a.b();
        ocuVar.getClass();
        Executor executor = (Executor) this.b.b();
        executor.getClass();
        return new qxz(ocuVar, executor, i);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [armf, java.lang.Object] */
    public final rto z(ConversationIdType conversationIdType) {
        akrh e = aktp.e("BugleDbOperationsCached::getExistingConversation");
        try {
            rto m = ((uie) this.b.b()).m(conversationIdType);
            e.close();
            return m;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public uac(Object obj, Object obj2, byte[] bArr) {
        this.a = obj;
        this.b = obj2;
    }

    public uac(qvo qvoVar, yjy yjyVar) {
        this.b = qvoVar;
        this.a = yjyVar;
    }

    public uac(armf armfVar, anen anenVar) {
        this.b = armfVar;
        this.a = new anew(anenVar);
    }

    public uac(armf armfVar, armf armfVar2, char[] cArr, byte[] bArr) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }

    public uac(qwo qwoVar) {
        qwe e = qwoVar.e();
        e.getClass();
        this.b = e;
        qwoVar.ao(1, "sim_serial_number");
        this.a = qwoVar.b;
    }

    public uac(cg cgVar, armf armfVar) {
        armfVar.getClass();
        this.a = cgVar;
        this.b = armfVar;
    }

    public uac(uub uubVar, armf armfVar, armf armfVar2) {
        uubVar.a();
        this.b = armfVar2;
        this.a = armfVar;
    }

    public uac(char[] cArr, byte[] bArr) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "conversations._id";
        a.c = new wsy();
        this.b = new qpy(a.a());
        agmi a2 = agmk.a();
        a2.d = 1;
        a2.a = "conversations.conv_type";
        a2.c = new wsy();
        a2.a();
        agmi a3 = agmk.a();
        a3.d = 1;
        a3.a = "conversations.has_ea2p_bot_recipient";
        a3.c = new wsy();
        a3.a();
        agmi a4 = agmk.a();
        a4.d = 1;
        a4.c(true);
        a4.a = "conversations.sms_thread_id";
        a4.c = new wsy();
        a4.a();
        agmi a5 = agmk.a();
        a5.d = 4;
        a5.a = "conversations.name";
        a5.c = new wsy();
        a5.a();
        agmi a6 = agmk.a();
        a6.d = 2;
        a6.a = "conversations.name_is_automatic";
        a6.c = new wsy();
        a6.a();
        agmi a7 = agmk.a();
        a7.d = 4;
        a7.a = "conversations.subtitle";
        a7.c = new wsy();
        a7.a();
        agmi a8 = agmk.a();
        a8.d = 1;
        a8.a = "conversations.latest_message_id";
        a8.c = new wsy();
        a8.a();
        agmi a9 = agmk.a();
        a9.d = 4;
        a9.a = "conversations.snippet_text";
        a9.c = new wsy();
        a9.a();
        agmi a10 = agmk.a();
        a10.d = 4;
        a10.a = "conversations.subject_text";
        a10.c = new wsy();
        a10.a();
        agmi a11 = agmk.a();
        a11.d = 4;
        a11.a = "conversations.preview_uri";
        a11.c = new wsy();
        a11.a();
        agmi a12 = agmk.a();
        a12.d = 4;
        a12.a = "conversations.preview_content_type";
        a12.c = new wsy();
        a12.a();
        agmi a13 = agmk.a();
        a13.d = 1;
        a13.a = "conversations.show_draft";
        a13.c = new wsy();
        a13.a();
        agmi a14 = agmk.a();
        a14.d = 4;
        a14.a = "conversations.draft_snippet_text";
        a14.c = new wsy();
        a14.a();
        agmi a15 = agmk.a();
        a15.d = 4;
        a15.a = "conversations.draft_subject_text";
        a15.c = new wsy();
        a15.a();
        agmi a16 = agmk.a();
        a16.d = 4;
        a16.a = "conversations.draft_preview_uri";
        a16.c = new wsy();
        a16.a();
        agmi a17 = agmk.a();
        a17.d = 4;
        a17.a = "conversations.draft_preview_content_type";
        a17.c = new wsy();
        a17.a();
        agmi a18 = agmk.a();
        a18.d = 1;
        a18.a = "conversations.etouffee_default";
        a18.c = new wsy();
        a18.a();
        agmi a19 = agmk.a();
        a19.d = 1;
        a19.c(true);
        a19.a = "conversations.archive_status";
        a19.c = new wsy();
        a19.a();
        agmi a20 = agmk.a();
        a20.d = 1;
        a20.c(true);
        a20.a = "conversations.sort_timestamp";
        a20.c = new wsy();
        a20.a();
        agmi a21 = agmk.a();
        a21.d = 1;
        a21.a = "conversations.last_read_timestamp";
        a21.c = new wsy();
        a21.a();
        agmi a22 = agmk.a();
        a22.d = 4;
        a22.a = "conversations.icon";
        a22.c = new wsy();
        a22.a();
        agmi a23 = agmk.a();
        a23.d = 1;
        a23.a = "conversations.participant_contact_id";
        a23.c = new wsy();
        a23.a();
        agmi a24 = agmk.a();
        a24.d = 1;
        a24.a = "conversations.normalized_participant_contact_id";
        a24.c = new wsy();
        a24.a();
        agmi a25 = agmk.a();
        a25.d = 4;
        a25.a = "conversations.participant_lookup_key";
        a25.c = new wsy();
        a25.a();
        agmi a26 = agmk.a();
        a26.d = 4;
        a26.a = "conversations.normalized_participant_lookup_key";
        a26.c = new wsy();
        a26.a();
        agmi a27 = agmk.a();
        a27.d = 4;
        a27.c(true);
        a27.a = "conversations.participant_normalized_destination";
        a27.c = new wsy();
        a27.a();
        agmi a28 = agmk.a();
        a28.d = 4;
        a28.j(true);
        a28.c(true);
        a28.a = "conversations.participant_comparable_destination";
        a28.e(true);
        a28.c = new wsy();
        a28.a();
        agmi a29 = agmk.a();
        a29.d = 4;
        a29.a = "conversations.current_self_id";
        a29.c = new wsy();
        a29.a();
        agmi a30 = agmk.a();
        a30.d = 4;
        a30.a = "conversations.current_my_identity";
        a30.c = new wsy();
        a30.a();
        agmi a31 = agmk.a();
        a31.d = 4;
        a31.c(true);
        a31.d(true);
        a31.b = new qaa(13);
        a31.a = "conversations.current_my_identity_foreign_key";
        a31.c = new wsy();
        a31.a();
        agmi a32 = agmk.a();
        a32.d = 4;
        a32.c(true);
        a32.d(true);
        a32.b = new qaa(14);
        a32.a = "conversations.destination_token";
        a32.c = new wsy();
        a32.a();
        agmi a33 = agmk.a();
        a33.d = 1;
        a33.a = "conversations.participant_count";
        a33.c = new wsy();
        a33.a();
        agmi a34 = agmk.a();
        a34.d = 1;
        a34.a = "conversations.notification_enabled";
        a34.c = new wsy();
        a34.a();
        agmi a35 = agmk.a();
        a35.d = 4;
        a35.a = "conversations.notification_sound_uri";
        a35.c = new wsy();
        a35.a();
        agmi a36 = agmk.a();
        a36.d = 1;
        a36.a = "conversations.notification_vibration";
        a36.c = new wsy();
        a36.a();
        agmi a37 = agmk.a();
        a37.d = 1;
        a37.a = "conversations.include_email_addr";
        a37.c = new wsy();
        a37.a();
        agmi a38 = agmk.a();
        a38.d = 4;
        a38.a = "conversations.sms_service_center";
        a38.c = new wsy();
        a38.a();
        agmi a39 = agmk.a();
        a39.d = 4;
        a39.a = "conversations.participant_id_list";
        a39.c = new wsy();
        a39.a();
        agmi a40 = agmk.a();
        a40.d = 4;
        a40.j(true);
        a40.c(true);
        a40.a = "conversations.normalized_participant_id_list";
        a40.e(true);
        a40.c = new wsy();
        a40.a();
        agmi a41 = agmk.a();
        a41.d = 1;
        a41.a = "conversations.source_type";
        a41.c = new wsy();
        a41.a();
        agmi a42 = agmk.a();
        a42.d = 1;
        a42.c(true);
        a42.a = "conversations.rcs_session_id";
        a42.c = new wsy();
        a42.a();
        agmi a43 = agmk.a();
        a43.d = 1;
        a43.a = "conversations.join_state";
        a43.c = new wsy();
        a43.a();
        agmi a44 = agmk.a();
        a44.d = 1;
        a44.a = "conversations.send_mode";
        a44.c = new wsy();
        a44.a();
        agmi a45 = agmk.a();
        a45.d = 1;
        a45.a = "conversations.IS_ENTERPRISE";
        a45.c = new wsy();
        a45.a();
        agmi a46 = agmk.a();
        a46.d = 1;
        a46.a = "conversations.last_interactive_event_timestamp";
        a46.c = new wsy();
        a46.a();
        agmi a47 = agmk.a();
        a47.d = 4;
        a47.a = "conversations.participant_display_destination";
        a47.c = new wsy();
        a47.a();
        agmi a48 = agmk.a();
        a48.d = 4;
        a48.a = "conversations.normalized_participant_display_destination";
        a48.c = new wsy();
        a48.a();
        agmi a49 = agmk.a();
        a49.d = 1;
        a49.a = "conversations.spam_warning_dismiss_status";
        a49.c = new wsy();
        a49.a();
        agmi a50 = agmk.a();
        a50.d = 1;
        a50.a = "conversations.open_count";
        a50.c = new wsy();
        a50.a();
        agmi a51 = agmk.a();
        a51.d = 1;
        a51.a = "conversations.last_logged_scooby_metadata_timestamp";
        a51.c = new wsy();
        a51.a();
        agmi a52 = agmk.a();
        a52.d = 1;
        a52.c(true);
        a52.a = "conversations.delete_timestamp";
        a52.c = new wsy();
        a52.a();
        agmi a53 = agmk.a();
        a53.d = 4;
        a53.j(true);
        a53.c(true);
        a53.a = "conversations.cms_id";
        a53.e(true);
        a53.c = new wsy();
        a53.a();
        agmi a54 = agmk.a();
        a54.d = 4;
        a54.c(true);
        a54.a = "conversations.rcs_group_id";
        a54.c = new wsy();
        a54.a();
        agmi a55 = agmk.a();
        a55.d = 4;
        a55.a = "conversations.rcs_conference_uri";
        a55.c = new wsy();
        a55.a();
        agmi a56 = agmk.a();
        a56.d = 5;
        a56.a = "conversations.tachygram_group_routing_info_token";
        a56.c = new wsy();
        a56.a();
        agmi a57 = agmk.a();
        a57.d = 1;
        a57.a = "conversations.cms_most_recent_read_message_timestamp_ms";
        a57.c = new wsy();
        a57.a();
        agmi a58 = agmk.a();
        a58.d = 2;
        a58.a = "conversations.rcs_subject_change_timestamp_ms";
        a58.c = new wsy();
        a58.a();
        agmi a59 = agmk.a();
        a59.d = 1;
        a59.a = "conversations.rcs_session_allows_revocation";
        a59.c = new wsy();
        a59.a();
        agmi a60 = agmk.a();
        a60.d = 2;
        a60.a = "conversations.rcs_group_capabilities";
        a60.c = new wsy();
        a60.a();
        agmi a61 = agmk.a();
        a61.d = 1;
        a61.a = "conversations.awaiting_reverse_sync";
        a61.c = new wsy();
        a61.a();
        agmi a62 = agmk.a();
        a62.d = 2;
        a62.c(true);
        a62.d(true);
        a62.b = new qaa(15);
        a62.a = "conversations.duplicate_of";
        a62.c = new wsy();
        a62.a();
        agmi a63 = agmk.a();
        a63.d = 2;
        a63.c(true);
        a63.d(true);
        a63.b = new qaa(16);
        a63.a = "conversations.new_duplicate_of";
        a63.c = new wsy();
        a63.a();
        agmi a64 = agmk.a();
        a64.d = 1;
        a64.a = "conversations.error_state";
        a64.c = new wsy();
        a64.a();
        agmi a65 = agmk.a();
        a65.d = 1;
        a65.a = "conversations.cms_life_cycle";
        a65.c = new wsy();
        a65.a();
        agmi a66 = agmk.a();
        a66.d = 4;
        a66.a = "conversations.rcs_group_self_msisdn";
        a66.c = new wsy();
        a66.a();
        agmi a67 = agmk.a();
        a67.d = 2;
        a67.a = "conversations.recipient_offline_timestamp_ms";
        a67.c = new wsy();
        a67.a();
        agmi a68 = agmk.a();
        a68.d = 2;
        a68.a = "conversations.rcs_group_last_sync_timestamp";
        a68.c = new wsy();
        a68.a();
        agmi a69 = agmk.a();
        a69.d = 1;
        a69.a = "conversations.has_been_e2ee";
        a69.c = new wsy();
        a69.a();
        agmi a70 = agmk.a();
        a70.d = 1;
        a70.a = "conversations.marked_as_unread";
        a70.c = new wsy();
        a70.a();
        agmi a71 = agmk.a();
        a71.d = 5;
        a71.a = "conversations.custom_theme";
        a71.c = new wsy();
        a71.a();
        agmi a72 = agmk.a();
        a72.d = 2;
        a72.a = "conversations.mms_group_upgrade_status";
        a72.c = new wsy();
        a72.a();
        agmi a73 = agmk.a();
        a73.d = 2;
        a73.a = "conversations.mms_group_upgrade_retries";
        a73.c = new wsy();
        a73.a();
        agmi a74 = agmk.a();
        a74.d = 2;
        a74.a = "conversations.encryption_protocol";
        a74.c = new wsy();
        a74.a();
        agmi a75 = agmk.a();
        a75.d = 4;
        a75.a = "conversations.encryption_id";
        a75.c = new wsy();
        a75.a();
        agmi a76 = agmk.a();
        a76.d = 4;
        a76.j(true);
        a76.c(true);
        a76.a = "conversations.cms_correlation_id";
        a76.e(true);
        a76.c = new wsy();
        a76.a();
        agmi a77 = agmk.a();
        a77.d = 1;
        a77.j(true);
        a77.i(true);
        a77.f(true);
        a77.c(true);
        a77.d(true);
        a77.a = "conversation_to_participants.participant_id";
        a77.e(true);
        a77.c = new wsy();
        a77.a();
        agmi a78 = agmk.a();
        a78.d = 8;
        a78.a = "conversation_to_participants__ROWID";
        a78.c = new wsy();
        a78.a();
        agmi a79 = agmk.a();
        a79.d = 1;
        a79.j(true);
        a79.i(true);
        a79.f(true);
        a79.c(true);
        a79.d(true);
        a79.a = "conversation_to_participants.conversation_id";
        a79.e(true);
        a79.c = new wsy();
        a79.a();
        agmi a80 = agmk.a();
        a80.d = 1;
        a80.i(true);
        a80.a = "conversation_to_participants.rcs_group_join_status";
        a80.c = new wsy();
        a80.a();
        agmi a81 = agmk.a();
        a81.d = 4;
        a81.a = "conversation_to_participants.last_modified_by_key";
        a81.c = new wsy();
        a81.a();
        agmi a82 = agmk.a();
        a82.d = 2;
        a82.j(true);
        a82.f(true);
        a82.c(true);
        a82.a = "participants._id";
        a82.c = new wsy();
        a82.a();
        agmi a83 = agmk.a();
        a83.d = 4;
        a83.c(true);
        a83.a = "participants.normalized_destination";
        a83.e(true);
        a83.c = new wsy();
        this.a = new qpy(a83.a());
        agmi a84 = agmk.a();
        a84.d = 4;
        a84.a = "participants.send_destination";
        a84.c = new wsy();
        a84.a();
        agmi a85 = agmk.a();
        a85.d = 8;
        a85.a = "participants__ROWID";
        a85.c = new wsy();
        a85.a();
        agmi a86 = agmk.a();
        a86.d = 4;
        a86.c(true);
        a86.a = "participants.my_identity_token";
        a86.c = new wsy();
        a86.a();
        agmi a87 = agmk.a();
        a87.d = 4;
        a87.c(true);
        a87.d(true);
        a87.b = new qaa(11);
        a87.a = "participants.my_identity_token_foreign_key";
        a87.c = new wsy();
        a87.a();
        agmi a88 = agmk.a();
        a88.d = 1;
        a88.c(true);
        a88.a = "participants.sub_id";
        a88.e(true);
        a88.c = new wsy();
        a88.a();
        agmi a89 = agmk.a();
        a89.d = 1;
        a89.a = "participants.sim_slot_id";
        a89.c = new wsy();
        a89.a();
        agmi a90 = agmk.a();
        a90.d = 4;
        a90.a = "participants.display_destination";
        a90.c = new wsy();
        a90.a();
        agmi a91 = agmk.a();
        a91.d = 4;
        a91.j(true);
        a91.c(true);
        a91.a = "participants.comparable_destination";
        a91.e(true);
        a91.c = new wsy();
        a91.a();
        agmi a92 = agmk.a();
        a92.d = 4;
        a92.a = "participants.country_code";
        a92.c = new wsy();
        a92.a();
        agmi a93 = agmk.a();
        a93.d = 2;
        a93.j(true);
        a93.c(true);
        a93.a = "participants.recipient_id";
        a93.e(true);
        a93.c = new wsy();
        a93.a();
        agmi a94 = agmk.a();
        a94.d = 4;
        a94.a = "participants.recipient_canonical_address";
        a94.c = new wsy();
        a94.a();
        agmi a95 = agmk.a();
        a95.d = 4;
        a95.a = "participants.full_name";
        a95.c = new wsy();
        a95.a();
        agmi a96 = agmk.a();
        a96.d = 4;
        a96.a = "participants.first_name";
        a96.c = new wsy();
        a96.a();
        agmi a97 = agmk.a();
        a97.d = 4;
        a97.a = "participants.profile_photo_uri";
        a97.c = new wsy();
        a97.a();
        agmi a98 = agmk.a();
        a98.d = 4;
        a98.a = "participants.contact_photo_uri";
        a98.c = new wsy();
        a98.a();
        agmi a99 = agmk.a();
        a99.d = 1;
        a99.a = "participants.contact_id";
        a99.c = new wsy();
        a99.a();
        agmi a100 = agmk.a();
        a100.d = 4;
        a100.a = "participants.lookup_key";
        a100.c = new wsy();
        a100.a();
        agmi a101 = agmk.a();
        a101.d = 1;
        a101.a = "participants.color_palette_index";
        a101.c = new wsy();
        a101.a();
        agmi a102 = agmk.a();
        a102.d = 1;
        a102.a = "participants.color_type";
        a102.c = new wsy();
        a102.a();
        agmi a103 = agmk.a();
        a103.d = 1;
        a103.a = "participants.extended_color";
        a103.c = new wsy();
        a103.a();
        agmi a104 = agmk.a();
        a104.d = 1;
        a104.a = "participants.blocked";
        a104.c = new wsy();
        a104.a();
        agmi a105 = agmk.a();
        a105.d = 4;
        a105.a = "participants.subscription_name";
        a105.c = new wsy();
        a105.a();
        agmi a106 = agmk.a();
        a106.d = 1;
        a106.a = "participants.subscription_color";
        a106.c = new wsy();
        a106.a();
        agmi a107 = agmk.a();
        a107.d = 4;
        a107.a = "participants.contact_destination";
        a107.c = new wsy();
        a107.a();
        agmi a108 = agmk.a();
        a108.d = 1;
        a108.a = "participants.participant_type";
        a108.c = new wsy();
        a108.a();
        agmi a109 = agmk.a();
        a109.d = 1;
        a109.a = "participants.video_reachability";
        a109.c = new wsy();
        a109.a();
        agmi a110 = agmk.a();
        a110.d = 4;
        a110.a = "participants.alias";
        a110.c = new wsy();
        a110.a();
        agmi a111 = agmk.a();
        a111.d = 1;
        a111.a = "participants.is_spam";
        a111.c = new wsy();
        a111.a();
        agmi a112 = agmk.a();
        a112.d = 1;
        a112.a = "participants.is_rcs_available";
        a112.c = new wsy();
        a112.a();
        agmi a113 = agmk.a();
        a113.d = 1;
        a113.a = "participants.is_spam_source";
        a113.c = new wsy();
        a113.a();
        agmi a114 = agmk.a();
        a114.d = 4;
        a114.j(true);
        a114.c(true);
        a114.a = "participants.cms_id";
        a114.e(true);
        a114.c = new wsy();
        a114.a();
        agmi a115 = agmk.a();
        a115.d = 1;
        a115.a = "participants.latest_verification_status";
        a115.c = new wsy();
        a115.a();
        agmi a116 = agmk.a();
        a116.d = 4;
        a116.a = "participants.profile_photo_blob_id";
        a116.c = new wsy();
        a116.a();
        agmi a117 = agmk.a();
        a117.d = 5;
        a117.a = "participants.profile_photo_encryption_key";
        a117.c = new wsy();
        a117.a();
        agmi a118 = agmk.a();
        a118.d = 1;
        a118.a = "participants.directory_id";
        a118.c = new wsy();
        a118.a();
        agmi a119 = agmk.a();
        a119.d = 1;
        a119.a = "participants.is_check_constraint_enabled_via_phenotype";
        a119.c = new wsy();
        a119.a();
        agmi a120 = agmk.a();
        a120.d = 1;
        a120.a = "participants.is_valid_phone_number_data";
        a120.c = new wsy();
        a120.a();
        agmi a121 = agmk.a();
        a121.d = 2;
        a121.c(true);
        a121.d(true);
        a121.b = new qaa(12);
        a121.a = "participants.duplicate_of";
        a121.c = new wsy();
        a121.a();
        agmi a122 = agmk.a();
        a122.d = 1;
        a122.a = "participants.cms_life_cycle";
        a122.c = new wsy();
        a122.a();
        agmi a123 = agmk.a();
        a123.d = 1;
        a123.a = "participants.norm_ui_status";
        a123.c = new wsy();
        a123.a();
        agmi a124 = agmk.a();
        a124.d = 4;
        a124.a = "participants.last_modified_by_key";
        a124.c = new wsy();
        a124.a();
        agmi a125 = agmk.a();
        a125.d = 1;
        a125.a = "participants.name_source";
        a125.c = new wsy();
        a125.a();
        agmi a126 = agmk.a();
        a126.d = 1;
        a126.a = "participants.photo_source";
        a126.c = new wsy();
        a126.a();
        agmi a127 = agmk.a();
        a127.d = 1;
        a127.a = "participants.profile_photo_user_preference";
        a127.c = new wsy();
        a127.a();
        agmi a128 = agmk.a();
        a128.d = 5;
        a128.a = "participants.contact_metadata";
        a128.c = new wsy();
        a128.a();
    }

    public uac(armf armfVar, armf armfVar2) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
    }

    public uac(armf armfVar, armf armfVar2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        new ConcurrentHashMap();
        this.b = armfVar;
        this.a = armfVar2;
    }

    public uac(armf armfVar, armf armfVar2, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }

    public uac(ahtn ahtnVar, String str) {
        d.t(str.endsWith("__"), "Phenotype builder prefix should end with __ characters");
        this.b = ahtnVar;
        this.a = str;
    }

    private uac(char[] cArr) {
        this.b = new StringBuilder();
        this.a = new HashSet();
    }

    public uac(armf armfVar) {
        this.b = new tm();
        this.a = armfVar;
    }

    public uac(rkd rkdVar, rkd rkdVar2, rkd rkdVar3, rkd rkdVar4, rkd rkdVar5, rkd rkdVar6, rkd rkdVar7, rkd rkdVar8, rkd rkdVar9, rkd rkdVar10, rkd rkdVar11, rkd rkdVar12) {
        this.b = aqjn.B(new rkf(rkdVar, "myIdentities"), new rkf(rkdVar2, "participants"), new rkf(rkdVar3, "conversations"), new rkf(rkdVar4, "conversation-participants"), new rkf(rkdVar5, "messages"), new rkf(rkdVar6, "parts"));
        this.a = aqjn.B(new rkf(rkdVar7, "metadata"), new rkf(rkdVar8, "conversation-pins"), new rkf(rkdVar10, "message-reactions"), new rkf(rkdVar9, "message-replies"), new rkf(rkdVar11, "message-stars"), new rkf(rkdVar12, "link-previews"));
    }

    public uac(arwe arweVar, armf armfVar) {
        arweVar.getClass();
        armfVar.getClass();
        this.a = arweVar;
        this.b = armfVar;
    }

    public uac() {
        agmi a = agmk.a();
        a.d = 4;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "verified_sms_blacklisted_senders.sender_id";
        a.c = new wsy();
        toq toqVar = new toq(a.a());
        this.a = toqVar;
        this.b = new toq[]{toqVar};
    }

    public uac(xnv xnvVar, java.util.Map map) {
        this.b = xnvVar;
        this.a = new HashMap(map);
    }

    public uac(byte[] bArr) {
        new SparseBooleanArray();
        this.a = new LinkedHashSet();
        this.b = new AtomicReference(Optional.empty());
    }

    public uac(arpi arpiVar, arwe arweVar, aiwu aiwuVar) {
        arpiVar.getClass();
        arweVar.getClass();
        aiwuVar.getClass();
        this.b = arpiVar;
        this.a = aiwuVar;
    }

    public uac(arpi arpiVar, wul wulVar) {
        arpiVar.getClass();
        this.a = arpiVar;
        this.b = wulVar;
    }

    public uac(vco vcoVar, mbl mblVar) {
        vcoVar.getClass();
        mblVar.getClass();
        this.a = vcoVar;
        this.b = mblVar;
    }

    public uac(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "conversations._id";
        a.c = new wsy();
        this.b = new qqf(a.a());
        agmi a2 = agmk.a();
        a2.d = 1;
        a2.a = "conversations.conv_type";
        a2.c = new wsy();
        a2.a();
        agmi a3 = agmk.a();
        a3.d = 1;
        a3.a = "conversations.has_ea2p_bot_recipient";
        a3.c = new wsy();
        a3.a();
        agmi a4 = agmk.a();
        a4.d = 1;
        a4.c(true);
        a4.a = "conversations.sms_thread_id";
        a4.c = new wsy();
        a4.a();
        agmi a5 = agmk.a();
        a5.d = 4;
        a5.a = "conversations.name";
        a5.c = new wsy();
        a5.a();
        agmi a6 = agmk.a();
        a6.d = 2;
        a6.a = "conversations.name_is_automatic";
        a6.c = new wsy();
        a6.a();
        agmi a7 = agmk.a();
        a7.d = 4;
        a7.a = "conversations.subtitle";
        a7.c = new wsy();
        a7.a();
        agmi a8 = agmk.a();
        a8.d = 1;
        a8.a = "conversations.latest_message_id";
        a8.c = new wsy();
        a8.a();
        agmi a9 = agmk.a();
        a9.d = 4;
        a9.a = "conversations.snippet_text";
        a9.c = new wsy();
        a9.a();
        agmi a10 = agmk.a();
        a10.d = 4;
        a10.a = "conversations.subject_text";
        a10.c = new wsy();
        a10.a();
        agmi a11 = agmk.a();
        a11.d = 4;
        a11.a = "conversations.preview_uri";
        a11.c = new wsy();
        a11.a();
        agmi a12 = agmk.a();
        a12.d = 4;
        a12.a = "conversations.preview_content_type";
        a12.c = new wsy();
        a12.a();
        agmi a13 = agmk.a();
        a13.d = 1;
        a13.a = "conversations.show_draft";
        a13.c = new wsy();
        a13.a();
        agmi a14 = agmk.a();
        a14.d = 4;
        a14.a = "conversations.draft_snippet_text";
        a14.c = new wsy();
        a14.a();
        agmi a15 = agmk.a();
        a15.d = 4;
        a15.a = "conversations.draft_subject_text";
        a15.c = new wsy();
        a15.a();
        agmi a16 = agmk.a();
        a16.d = 4;
        a16.a = "conversations.draft_preview_uri";
        a16.c = new wsy();
        a16.a();
        agmi a17 = agmk.a();
        a17.d = 4;
        a17.a = "conversations.draft_preview_content_type";
        a17.c = new wsy();
        a17.a();
        agmi a18 = agmk.a();
        a18.d = 1;
        a18.a = "conversations.etouffee_default";
        a18.c = new wsy();
        a18.a();
        agmi a19 = agmk.a();
        a19.d = 1;
        a19.c(true);
        a19.a = "conversations.archive_status";
        a19.c = new wsy();
        a19.a();
        agmi a20 = agmk.a();
        a20.d = 1;
        a20.c(true);
        a20.a = "conversations.sort_timestamp";
        a20.c = new wsy();
        a20.a();
        agmi a21 = agmk.a();
        a21.d = 1;
        a21.a = "conversations.last_read_timestamp";
        a21.c = new wsy();
        a21.a();
        agmi a22 = agmk.a();
        a22.d = 4;
        a22.a = "conversations.icon";
        a22.c = new wsy();
        a22.a();
        agmi a23 = agmk.a();
        a23.d = 1;
        a23.a = "conversations.participant_contact_id";
        a23.c = new wsy();
        a23.a();
        agmi a24 = agmk.a();
        a24.d = 1;
        a24.a = "conversations.normalized_participant_contact_id";
        a24.c = new wsy();
        a24.a();
        agmi a25 = agmk.a();
        a25.d = 4;
        a25.a = "conversations.participant_lookup_key";
        a25.c = new wsy();
        a25.a();
        agmi a26 = agmk.a();
        a26.d = 4;
        a26.a = "conversations.normalized_participant_lookup_key";
        a26.c = new wsy();
        a26.a();
        agmi a27 = agmk.a();
        a27.d = 4;
        a27.c(true);
        a27.a = "conversations.participant_normalized_destination";
        a27.c = new wsy();
        a27.a();
        agmi a28 = agmk.a();
        a28.d = 4;
        a28.j(true);
        a28.c(true);
        a28.a = "conversations.participant_comparable_destination";
        a28.e(true);
        a28.c = new wsy();
        a28.a();
        agmi a29 = agmk.a();
        a29.d = 4;
        a29.a = "conversations.current_self_id";
        a29.c = new wsy();
        a29.a();
        agmi a30 = agmk.a();
        a30.d = 4;
        a30.a = "conversations.current_my_identity";
        a30.c = new wsy();
        a30.a();
        agmi a31 = agmk.a();
        a31.d = 4;
        a31.c(true);
        a31.d(true);
        a31.b = new qaa(19);
        a31.a = "conversations.current_my_identity_foreign_key";
        a31.c = new wsy();
        a31.a();
        agmi a32 = agmk.a();
        a32.d = 4;
        a32.c(true);
        a32.d(true);
        a32.b = new qaa(20);
        a32.a = "conversations.destination_token";
        a32.c = new wsy();
        a32.a();
        agmi a33 = agmk.a();
        a33.d = 1;
        a33.a = "conversations.participant_count";
        a33.c = new wsy();
        a33.a();
        agmi a34 = agmk.a();
        a34.d = 1;
        a34.a = "conversations.notification_enabled";
        a34.c = new wsy();
        a34.a();
        agmi a35 = agmk.a();
        a35.d = 4;
        a35.a = "conversations.notification_sound_uri";
        a35.c = new wsy();
        a35.a();
        agmi a36 = agmk.a();
        a36.d = 1;
        a36.a = "conversations.notification_vibration";
        a36.c = new wsy();
        a36.a();
        agmi a37 = agmk.a();
        a37.d = 1;
        a37.a = "conversations.include_email_addr";
        a37.c = new wsy();
        a37.a();
        agmi a38 = agmk.a();
        a38.d = 4;
        a38.a = "conversations.sms_service_center";
        a38.c = new wsy();
        a38.a();
        agmi a39 = agmk.a();
        a39.d = 4;
        a39.a = "conversations.participant_id_list";
        a39.c = new wsy();
        a39.a();
        agmi a40 = agmk.a();
        a40.d = 4;
        a40.j(true);
        a40.c(true);
        a40.a = "conversations.normalized_participant_id_list";
        a40.e(true);
        a40.c = new wsy();
        a40.a();
        agmi a41 = agmk.a();
        a41.d = 1;
        a41.a = "conversations.source_type";
        a41.c = new wsy();
        a41.a();
        agmi a42 = agmk.a();
        a42.d = 1;
        a42.c(true);
        a42.a = "conversations.rcs_session_id";
        a42.c = new wsy();
        a42.a();
        agmi a43 = agmk.a();
        a43.d = 1;
        a43.a = "conversations.join_state";
        a43.c = new wsy();
        a43.a();
        agmi a44 = agmk.a();
        a44.d = 1;
        a44.a = "conversations.send_mode";
        a44.c = new wsy();
        a44.a();
        agmi a45 = agmk.a();
        a45.d = 1;
        a45.a = "conversations.IS_ENTERPRISE";
        a45.c = new wsy();
        a45.a();
        agmi a46 = agmk.a();
        a46.d = 1;
        a46.a = "conversations.last_interactive_event_timestamp";
        a46.c = new wsy();
        a46.a();
        agmi a47 = agmk.a();
        a47.d = 4;
        a47.a = "conversations.participant_display_destination";
        a47.c = new wsy();
        a47.a();
        agmi a48 = agmk.a();
        a48.d = 4;
        a48.a = "conversations.normalized_participant_display_destination";
        a48.c = new wsy();
        a48.a();
        agmi a49 = agmk.a();
        a49.d = 1;
        a49.a = "conversations.spam_warning_dismiss_status";
        a49.c = new wsy();
        a49.a();
        agmi a50 = agmk.a();
        a50.d = 1;
        a50.a = "conversations.open_count";
        a50.c = new wsy();
        a50.a();
        agmi a51 = agmk.a();
        a51.d = 1;
        a51.a = "conversations.last_logged_scooby_metadata_timestamp";
        a51.c = new wsy();
        a51.a();
        agmi a52 = agmk.a();
        a52.d = 1;
        a52.c(true);
        a52.a = "conversations.delete_timestamp";
        a52.c = new wsy();
        a52.a();
        agmi a53 = agmk.a();
        a53.d = 4;
        a53.j(true);
        a53.c(true);
        a53.a = "conversations.cms_id";
        a53.e(true);
        a53.c = new wsy();
        a53.a();
        agmi a54 = agmk.a();
        a54.d = 4;
        a54.c(true);
        a54.a = "conversations.rcs_group_id";
        a54.c = new wsy();
        a54.a();
        agmi a55 = agmk.a();
        a55.d = 4;
        a55.a = "conversations.rcs_conference_uri";
        a55.c = new wsy();
        a55.a();
        agmi a56 = agmk.a();
        a56.d = 5;
        a56.a = "conversations.tachygram_group_routing_info_token";
        a56.c = new wsy();
        a56.a();
        agmi a57 = agmk.a();
        a57.d = 1;
        a57.a = "conversations.cms_most_recent_read_message_timestamp_ms";
        a57.c = new wsy();
        a57.a();
        agmi a58 = agmk.a();
        a58.d = 2;
        a58.a = "conversations.rcs_subject_change_timestamp_ms";
        a58.c = new wsy();
        a58.a();
        agmi a59 = agmk.a();
        a59.d = 1;
        a59.a = "conversations.rcs_session_allows_revocation";
        a59.c = new wsy();
        a59.a();
        agmi a60 = agmk.a();
        a60.d = 2;
        a60.a = "conversations.rcs_group_capabilities";
        a60.c = new wsy();
        a60.a();
        agmi a61 = agmk.a();
        a61.d = 1;
        a61.a = "conversations.awaiting_reverse_sync";
        a61.c = new wsy();
        a61.a();
        agmi a62 = agmk.a();
        a62.d = 2;
        a62.c(true);
        a62.d(true);
        a62.b = new qqe(1);
        a62.a = "conversations.duplicate_of";
        a62.c = new wsy();
        a62.a();
        agmi a63 = agmk.a();
        a63.d = 2;
        a63.c(true);
        a63.d(true);
        a63.b = new qqe(0);
        a63.a = "conversations.new_duplicate_of";
        a63.c = new wsy();
        a63.a();
        agmi a64 = agmk.a();
        a64.d = 1;
        a64.a = "conversations.error_state";
        a64.c = new wsy();
        a64.a();
        agmi a65 = agmk.a();
        a65.d = 1;
        a65.a = "conversations.cms_life_cycle";
        a65.c = new wsy();
        a65.a();
        agmi a66 = agmk.a();
        a66.d = 4;
        a66.a = "conversations.rcs_group_self_msisdn";
        a66.c = new wsy();
        a66.a();
        agmi a67 = agmk.a();
        a67.d = 2;
        a67.a = "conversations.recipient_offline_timestamp_ms";
        a67.c = new wsy();
        a67.a();
        agmi a68 = agmk.a();
        a68.d = 2;
        a68.a = "conversations.rcs_group_last_sync_timestamp";
        a68.c = new wsy();
        a68.a();
        agmi a69 = agmk.a();
        a69.d = 1;
        a69.a = "conversations.has_been_e2ee";
        a69.c = new wsy();
        a69.a();
        agmi a70 = agmk.a();
        a70.d = 1;
        a70.a = "conversations.marked_as_unread";
        a70.c = new wsy();
        a70.a();
        agmi a71 = agmk.a();
        a71.d = 5;
        a71.a = "conversations.custom_theme";
        a71.c = new wsy();
        a71.a();
        agmi a72 = agmk.a();
        a72.d = 2;
        a72.a = "conversations.mms_group_upgrade_status";
        a72.c = new wsy();
        a72.a();
        agmi a73 = agmk.a();
        a73.d = 2;
        a73.a = "conversations.mms_group_upgrade_retries";
        a73.c = new wsy();
        a73.a();
        agmi a74 = agmk.a();
        a74.d = 2;
        a74.a = "conversations.encryption_protocol";
        a74.c = new wsy();
        a74.a();
        agmi a75 = agmk.a();
        a75.d = 4;
        a75.a = "conversations.encryption_id";
        a75.c = new wsy();
        a75.a();
        agmi a76 = agmk.a();
        a76.d = 4;
        a76.j(true);
        a76.c(true);
        a76.a = "conversations.cms_correlation_id";
        a76.e(true);
        a76.c = new wsy();
        a76.a();
        agmi a77 = agmk.a();
        a77.d = 1;
        a77.c(true);
        a77.d(true);
        a77.a = "conversation_participants.participant_id";
        a77.e(true);
        a77.c = new wsy();
        a77.a();
        agmi a78 = agmk.a();
        a78.d = 8;
        a78.a = "conversation_participants__ROWID";
        a78.c = new wsy();
        a78.a();
        agmi a79 = agmk.a();
        a79.d = 2;
        a79.j(true);
        a79.f(true);
        a79.c(true);
        a79.a = "conversation_participants._id";
        a79.c = new wsy();
        a79.a();
        agmi a80 = agmk.a();
        a80.d = 1;
        a80.c(true);
        a80.d(true);
        a80.a = "conversation_participants.conversation_id";
        a80.e(true);
        a80.c = new wsy();
        a80.a();
        agmi a81 = agmk.a();
        a81.d = 1;
        a81.c(true);
        a81.a = "conversation_participants.is_normalized";
        a81.e(true);
        a81.c = new wsy();
        a81.a();
        agmi a82 = agmk.a();
        a82.d = 1;
        a82.a = "conversation_participants.rcs_group_join_status";
        a82.c = new wsy();
        a82.a();
        agmi a83 = agmk.a();
        a83.d = 4;
        a83.a = "conversation_participants.last_modified_by_key";
        a83.c = new wsy();
        a83.a();
        agmi a84 = agmk.a();
        a84.d = 2;
        a84.j(true);
        a84.f(true);
        a84.c(true);
        a84.a = "participants._id";
        a84.c = new wsy();
        a84.a();
        agmi a85 = agmk.a();
        a85.d = 4;
        a85.c(true);
        a85.a = "participants.normalized_destination";
        a85.e(true);
        a85.c = new wsy();
        this.a = new qqf(a85.a());
        agmi a86 = agmk.a();
        a86.d = 4;
        a86.a = "participants.send_destination";
        a86.c = new wsy();
        a86.a();
        agmi a87 = agmk.a();
        a87.d = 8;
        a87.a = "participants__ROWID";
        a87.c = new wsy();
        a87.a();
        agmi a88 = agmk.a();
        a88.d = 4;
        a88.c(true);
        a88.a = "participants.my_identity_token";
        a88.c = new wsy();
        a88.a();
        agmi a89 = agmk.a();
        a89.d = 4;
        a89.c(true);
        a89.d(true);
        a89.b = new qaa(17);
        a89.a = "participants.my_identity_token_foreign_key";
        a89.c = new wsy();
        a89.a();
        agmi a90 = agmk.a();
        a90.d = 1;
        a90.c(true);
        a90.a = "participants.sub_id";
        a90.e(true);
        a90.c = new wsy();
        a90.a();
        agmi a91 = agmk.a();
        a91.d = 1;
        a91.a = "participants.sim_slot_id";
        a91.c = new wsy();
        a91.a();
        agmi a92 = agmk.a();
        a92.d = 4;
        a92.a = "participants.display_destination";
        a92.c = new wsy();
        a92.a();
        agmi a93 = agmk.a();
        a93.d = 4;
        a93.j(true);
        a93.c(true);
        a93.a = "participants.comparable_destination";
        a93.e(true);
        a93.c = new wsy();
        a93.a();
        agmi a94 = agmk.a();
        a94.d = 4;
        a94.a = "participants.country_code";
        a94.c = new wsy();
        a94.a();
        agmi a95 = agmk.a();
        a95.d = 2;
        a95.j(true);
        a95.c(true);
        a95.a = "participants.recipient_id";
        a95.e(true);
        a95.c = new wsy();
        a95.a();
        agmi a96 = agmk.a();
        a96.d = 4;
        a96.a = "participants.recipient_canonical_address";
        a96.c = new wsy();
        a96.a();
        agmi a97 = agmk.a();
        a97.d = 4;
        a97.a = "participants.full_name";
        a97.c = new wsy();
        a97.a();
        agmi a98 = agmk.a();
        a98.d = 4;
        a98.a = "participants.first_name";
        a98.c = new wsy();
        a98.a();
        agmi a99 = agmk.a();
        a99.d = 4;
        a99.a = "participants.profile_photo_uri";
        a99.c = new wsy();
        a99.a();
        agmi a100 = agmk.a();
        a100.d = 4;
        a100.a = "participants.contact_photo_uri";
        a100.c = new wsy();
        a100.a();
        agmi a101 = agmk.a();
        a101.d = 1;
        a101.a = "participants.contact_id";
        a101.c = new wsy();
        a101.a();
        agmi a102 = agmk.a();
        a102.d = 4;
        a102.a = "participants.lookup_key";
        a102.c = new wsy();
        a102.a();
        agmi a103 = agmk.a();
        a103.d = 1;
        a103.a = "participants.color_palette_index";
        a103.c = new wsy();
        a103.a();
        agmi a104 = agmk.a();
        a104.d = 1;
        a104.a = "participants.color_type";
        a104.c = new wsy();
        a104.a();
        agmi a105 = agmk.a();
        a105.d = 1;
        a105.a = "participants.extended_color";
        a105.c = new wsy();
        a105.a();
        agmi a106 = agmk.a();
        a106.d = 1;
        a106.a = "participants.blocked";
        a106.c = new wsy();
        a106.a();
        agmi a107 = agmk.a();
        a107.d = 4;
        a107.a = "participants.subscription_name";
        a107.c = new wsy();
        a107.a();
        agmi a108 = agmk.a();
        a108.d = 1;
        a108.a = "participants.subscription_color";
        a108.c = new wsy();
        a108.a();
        agmi a109 = agmk.a();
        a109.d = 4;
        a109.a = "participants.contact_destination";
        a109.c = new wsy();
        a109.a();
        agmi a110 = agmk.a();
        a110.d = 1;
        a110.a = "participants.participant_type";
        a110.c = new wsy();
        a110.a();
        agmi a111 = agmk.a();
        a111.d = 1;
        a111.a = "participants.video_reachability";
        a111.c = new wsy();
        a111.a();
        agmi a112 = agmk.a();
        a112.d = 4;
        a112.a = "participants.alias";
        a112.c = new wsy();
        a112.a();
        agmi a113 = agmk.a();
        a113.d = 1;
        a113.a = "participants.is_spam";
        a113.c = new wsy();
        a113.a();
        agmi a114 = agmk.a();
        a114.d = 1;
        a114.a = "participants.is_rcs_available";
        a114.c = new wsy();
        a114.a();
        agmi a115 = agmk.a();
        a115.d = 1;
        a115.a = "participants.is_spam_source";
        a115.c = new wsy();
        a115.a();
        agmi a116 = agmk.a();
        a116.d = 4;
        a116.j(true);
        a116.c(true);
        a116.a = "participants.cms_id";
        a116.e(true);
        a116.c = new wsy();
        a116.a();
        agmi a117 = agmk.a();
        a117.d = 1;
        a117.a = "participants.latest_verification_status";
        a117.c = new wsy();
        a117.a();
        agmi a118 = agmk.a();
        a118.d = 4;
        a118.a = "participants.profile_photo_blob_id";
        a118.c = new wsy();
        a118.a();
        agmi a119 = agmk.a();
        a119.d = 5;
        a119.a = "participants.profile_photo_encryption_key";
        a119.c = new wsy();
        a119.a();
        agmi a120 = agmk.a();
        a120.d = 1;
        a120.a = "participants.directory_id";
        a120.c = new wsy();
        a120.a();
        agmi a121 = agmk.a();
        a121.d = 1;
        a121.a = "participants.is_check_constraint_enabled_via_phenotype";
        a121.c = new wsy();
        a121.a();
        agmi a122 = agmk.a();
        a122.d = 1;
        a122.a = "participants.is_valid_phone_number_data";
        a122.c = new wsy();
        a122.a();
        agmi a123 = agmk.a();
        a123.d = 2;
        a123.c(true);
        a123.d(true);
        a123.b = new qaa(18);
        a123.a = "participants.duplicate_of";
        a123.c = new wsy();
        a123.a();
        agmi a124 = agmk.a();
        a124.d = 1;
        a124.a = "participants.cms_life_cycle";
        a124.c = new wsy();
        a124.a();
        agmi a125 = agmk.a();
        a125.d = 1;
        a125.a = "participants.norm_ui_status";
        a125.c = new wsy();
        a125.a();
        agmi a126 = agmk.a();
        a126.d = 4;
        a126.a = "participants.last_modified_by_key";
        a126.c = new wsy();
        a126.a();
        agmi a127 = agmk.a();
        a127.d = 1;
        a127.a = "participants.name_source";
        a127.c = new wsy();
        a127.a();
        agmi a128 = agmk.a();
        a128.d = 1;
        a128.a = "participants.photo_source";
        a128.c = new wsy();
        a128.a();
        agmi a129 = agmk.a();
        a129.d = 1;
        a129.a = "participants.profile_photo_user_preference";
        a129.c = new wsy();
        a129.a();
        agmi a130 = agmk.a();
        a130.d = 5;
        a130.a = "participants.contact_metadata";
        a130.c = new wsy();
        a130.a();
    }

    public uac(byte[] bArr, byte[] bArr2) {
        this.a = new AtomicBoolean(true);
        this.b = new HashMap();
    }

    public uac(armf armfVar, armf armfVar2, byte[] bArr, char[] cArr) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }
}
