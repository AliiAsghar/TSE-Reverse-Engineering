package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hgj {
    public final Object a;

    public hgj(Handler handler) {
        this.a = new fcv(handler, 4, null);
    }

    private static String s(String str) {
        return albo.ag(str).replace(' ', '_');
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void a(hkd hkdVar, hkl hklVar) {
        hkdVar.c("post-error");
        this.a.execute(new hjw(hkdVar, new akju(hklVar), (Runnable) null, 0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final boolean b(Class cls) {
        return this.a.containsKey(cls);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [hvq, java.lang.Object] */
    public final synchronized hvq c(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return hvr.a;
        }
        for (kkc kkcVar : this.a) {
            if (kkcVar.c(cls, cls2)) {
                return kkcVar.b;
            }
        }
        throw new IllegalArgumentException(a.ct(cls2, cls, "No transcoder registered to transcode from ", " to "));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    public final synchronized List d(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (kkc kkcVar : this.a) {
            if (kkcVar.c(cls, cls2) && !arrayList.contains(kkcVar.a)) {
                arrayList.add(kkcVar.a);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List, java.lang.Object] */
    public final synchronized void e(Class cls, Class cls2, hvq hvqVar) {
        this.a.add(new kkc(cls, cls2, hvqVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Queue] */
    public final synchronized hme f(ByteBuffer byteBuffer) {
        hme hmeVar;
        hmeVar = (hme) this.a.poll();
        if (hmeVar == null) {
            hmeVar = new hme();
        }
        hmeVar.b = null;
        Arrays.fill(hmeVar.a, (byte) 0);
        hmeVar.c = new hmd();
        hmeVar.d = 0;
        hmeVar.b = byteBuffer.asReadOnlyBuffer();
        hmeVar.b.position(0);
        hmeVar.b.order(ByteOrder.LITTLE_ENDIAN);
        return hmeVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Queue] */
    public final synchronized void g(hme hmeVar) {
        hmeVar.b = null;
        hmeVar.c = null;
        this.a.offer(hmeVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final void h() {
        this.a.clear();
    }

    public final void i(hkd hkdVar, akju akjuVar) {
        j(hkdVar, akjuVar, null);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void j(hkd hkdVar, akju akjuVar, Runnable runnable) {
        hkdVar.g();
        hkdVar.c("post-response");
        this.a.execute(new hjw(hkdVar, akjuVar, runnable, 0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final pyo k(pza pzaVar, pza pzaVar2) {
        pyx pyxVar = (pyx) this.a.b();
        pyxVar.getClass();
        return new pyo(pyxVar, pzaVar, pzaVar2);
    }

    public final String l() {
        return String.format("%s %s/%s-%s %s/%s", "IM-client/OMA1.0", s(Build.MANUFACTURER), s(Build.MODEL), s(Build.VERSION.RELEASE), s("Goog"), s(yuv.a((Context) this.a).a));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final pvo m(pvp pvpVar) {
        xnv xnvVar = (xnv) this.a.b();
        xnvVar.getClass();
        return new pvo(xnvVar, pvpVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final amxo n() {
        amuk d = ((xtj) this.a.b()).d();
        int ordinal = d.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return amxo.RCS_SINGLE_REG;
                    }
                    throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(d))));
                }
                return amxo.RCS_TACHYGRAM;
            }
            return amxo.RCS_DUAL_REG;
        }
        return amxo.UNKNOWN_RCS_TYPE;
    }

    public final qfb o(String str, String str2) {
        d.t(!str.isEmpty(), "RCS conversation id is empty");
        d.t(!str2.isEmpty(), "RCS group Uri is empty");
        qei a = ((psq) this.a).a(str2, true);
        aozy createBuilder = qfb.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        qfb qfbVar = (qfb) apagVar;
        str.getClass();
        qfbVar.b = 1 | qfbVar.b;
        qfbVar.c = str;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        qfb qfbVar2 = (qfb) createBuilder.b;
        a.getClass();
        qfbVar2.d = a;
        qfbVar2.b |= 2;
        return (qfb) createBuilder.s();
    }

    public final qfb p(ConversationIdType conversationIdType) {
        return (qfb) sni.f(conversationIdType, new nfc(this, 18), new nfz(9));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, wul] */
    public final akul q() {
        return this.a.h().h(new mme(19), andi.a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, wul] */
    public final akul r(String str) {
        return this.a.j(new ndd(str, 16)).h(new psf(0), andi.a);
    }

    public hgj(Object obj) {
        this.a = obj;
    }

    public hgj(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public hgj() {
        this.a = new HashMap();
    }

    public hgj(armf armfVar, short[] sArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public hgj(byte[] bArr, char[] cArr) {
        this.a = asck.d(Integer.MAX_VALUE, 1, 2);
    }

    public hgj(armf armfVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public hgj(armf armfVar, char[] cArr, char[] cArr2) {
        znj znjVar = (znj) armfVar.b();
        aiwl a = wus.a();
        a.i(wuk.BUSINESS_APP_DATA);
        a.k(pse.a);
        this.a = znjVar.ab(a.f());
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map, java.lang.Object] */
    public hgj(hgj hgjVar) {
        this.a = DesugarCollections.unmodifiableMap(new HashMap((Map) hgjVar.a));
    }

    public hgj(char[] cArr) {
        this.a = new HashMap();
    }

    public hgj(byte[] bArr, byte[] bArr2) {
        this.a = new ArrayDeque(0);
    }

    public hgj(byte[] bArr) {
        this.a = new ArrayList();
    }

    public hgj(armf armfVar) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public hgj(short[] sArr) {
        this.a = albo.D(new msu(11));
    }

    public hgj(armf armfVar, int[] iArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public hgj(armf armfVar, char[] cArr, byte[] bArr) {
        armfVar.getClass();
        this.a = armfVar;
    }
}
