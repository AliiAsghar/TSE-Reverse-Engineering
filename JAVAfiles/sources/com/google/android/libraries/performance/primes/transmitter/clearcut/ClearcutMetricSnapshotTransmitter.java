package com.google.android.libraries.performance.primes.transmitter.clearcut;

import android.content.Context;
import android.util.Base64;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.abnl;
import defpackage.abnr;
import defpackage.ahkh;
import defpackage.ahsb;
import defpackage.ahsc;
import defpackage.ahsg;
import defpackage.ahsl;
import defpackage.albo;
import defpackage.alhr;
import defpackage.alvg;
import defpackage.anax;
import defpackage.anay;
import defpackage.anaz;
import defpackage.anba;
import defpackage.ancj;
import defpackage.andi;
import defpackage.aneh;
import defpackage.aoyj;
import defpackage.aozy;
import defpackage.apaa;
import defpackage.apae;
import defpackage.apag;
import defpackage.apar;
import defpackage.apax;
import defpackage.aquq;
import defpackage.ashe;
import defpackage.ashf;
import defpackage.asid;
import defpackage.asie;
import defpackage.asih;
import defpackage.asii;
import defpackage.asij;
import defpackage.asjg;
import defpackage.asjn;
import defpackage.asjo;
import defpackage.asjt;
import defpackage.d;
import defpackage.vug;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ClearcutMetricSnapshotTransmitter implements ahsc {
    public static final alhr a = albo.D(new abnl(10));
    public volatile abnr b;
    public volatile abnr c;
    private volatile ahsl d;
    private final alhr e = albo.D(new abnl(9));
    private volatile aquq f;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ahsc
    public final ListenableFuture a(Context context, ahsb ahsbVar) {
        apae checkIsLite;
        apae checkIsLite2;
        Object c;
        String str;
        anay anayVar;
        checkIsLite = apag.checkIsLite(ahsg.b);
        ahsbVar.b(checkIsLite);
        d.t(ahsbVar.l.o(checkIsLite.d), "ClearcutMetricSnapshotTransmitter received a snapshot without the expected extension.");
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    this.d = new ahsl();
                }
            }
        }
        asjt asjtVar = ahsbVar.c;
        if (asjtVar == null) {
            asjtVar = asjt.a;
        }
        aozy builder = asjtVar.toBuilder();
        ahsl.b(ahsl.a, builder);
        ashf ashfVar = ((asjt) builder.b).k;
        if (ashfVar == null) {
            ashfVar = ashf.a;
        }
        if ((ashfVar.b & 1) != 0) {
            ashf ashfVar2 = ((asjt) builder.b).k;
            if (ashfVar2 == null) {
                ashfVar2 = ashf.a;
            }
            ashe asheVar = ashfVar2.c;
            if (asheVar == null) {
                asheVar = ashe.a;
            }
            aozy builder2 = asheVar.toBuilder();
            ahsl.b(ahsl.b, builder2);
            ashf ashfVar3 = ((asjt) builder.b).k;
            if (ashfVar3 == null) {
                ashfVar3 = ashf.a;
            }
            aozy builder3 = ashfVar3.toBuilder();
            if (!builder3.b.isMutable()) {
                builder3.u();
            }
            ashf ashfVar4 = (ashf) builder3.b;
            ashe asheVar2 = (ashe) builder2.s();
            asheVar2.getClass();
            ashfVar4.c = asheVar2;
            ashfVar4.b |= 1;
            if (!builder.b.isMutable()) {
                builder.u();
            }
            asjt asjtVar2 = (asjt) builder.b;
            ashf ashfVar5 = (ashf) builder3.s();
            ashfVar5.getClass();
            asjtVar2.k = ashfVar5;
            asjtVar2.b |= 256;
        }
        asjg asjgVar = ((asjt) builder.b).i;
        if (asjgVar == null) {
            asjgVar = asjg.a;
        }
        if ((asjgVar.b & 256) != 0) {
            asjg asjgVar2 = ((asjt) builder.b).i;
            if (asjgVar2 == null) {
                asjgVar2 = asjg.a;
            }
            anba anbaVar = asjgVar2.i;
            if (anbaVar == null) {
                anbaVar = anba.a;
            }
            aozy builder4 = anbaVar.toBuilder();
            anax anaxVar = ((anba) builder4.b).e;
            if (anaxVar == null) {
                anaxVar = anax.a;
            }
            anax c2 = ahsl.c(anaxVar);
            if (!builder4.b.isMutable()) {
                builder4.u();
            }
            anba anbaVar2 = (anba) builder4.b;
            c2.getClass();
            anbaVar2.e = c2;
            anbaVar2.b |= 1;
            List unmodifiableList = DesugarCollections.unmodifiableList(anbaVar2.f);
            if (!builder4.b.isMutable()) {
                builder4.u();
            }
            ((anba) builder4.b).f = anba.emptyProtobufList();
            Iterator it = unmodifiableList.iterator();
            while (it.hasNext()) {
                anax c3 = ahsl.c((anax) it.next());
                if (!builder4.b.isMutable()) {
                    builder4.u();
                }
                anba anbaVar3 = (anba) builder4.b;
                c3.getClass();
                anbaVar3.a();
                anbaVar3.f.add(c3);
            }
            anba anbaVar4 = (anba) builder4.b;
            if (anbaVar4.c == 4) {
                anayVar = (anay) anbaVar4.d;
            } else {
                anayVar = anay.a;
            }
            apax<anaz> apaxVar = anayVar.b;
            aozy createBuilder = anay.a.createBuilder();
            for (anaz anazVar : apaxVar) {
                anax anaxVar2 = anazVar.c;
                if (anaxVar2 == null) {
                    anaxVar2 = anax.a;
                }
                if ((anaxVar2.b & 2) != 0) {
                    aozy builder5 = anazVar.toBuilder();
                    anax c4 = ahsl.c(anaxVar2);
                    if (!builder5.b.isMutable()) {
                        builder5.u();
                    }
                    anaz anazVar2 = (anaz) builder5.b;
                    c4.getClass();
                    anazVar2.c = c4;
                    anazVar2.b |= 1;
                    anazVar = (anaz) builder5.s();
                }
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                anay anayVar2 = (anay) createBuilder.b;
                anazVar.getClass();
                anayVar2.a();
                anayVar2.b.add(anazVar);
            }
            anay anayVar3 = (anay) createBuilder.s();
            if (!builder4.b.isMutable()) {
                builder4.u();
            }
            anba anbaVar5 = (anba) builder4.b;
            anayVar3.getClass();
            anbaVar5.d = anayVar3;
            anbaVar5.c = 4;
            asjg asjgVar3 = ((asjt) builder.b).i;
            if (asjgVar3 == null) {
                asjgVar3 = asjg.a;
            }
            aozy builder6 = asjgVar3.toBuilder();
            anba anbaVar6 = (anba) builder4.s();
            if (!builder6.b.isMutable()) {
                builder6.u();
            }
            asjg asjgVar4 = (asjg) builder6.b;
            anbaVar6.getClass();
            asjgVar4.i = anbaVar6;
            asjgVar4.b |= 256;
            asjg asjgVar5 = (asjg) builder6.s();
            if (!builder.b.isMutable()) {
                builder.u();
            }
            asjt asjtVar3 = (asjt) builder.b;
            asjgVar5.getClass();
            asjtVar3.i = asjgVar5;
            asjtVar3.b |= 64;
        }
        asjo asjoVar = ((asjt) builder.b).j;
        if (asjoVar == null) {
            asjoVar = asjo.a;
        }
        boolean z = false;
        if (asjoVar.k.size() != 0) {
            asjo asjoVar2 = ((asjt) builder.b).j;
            if (asjoVar2 == null) {
                asjoVar2 = asjo.a;
            }
            aozy builder7 = asjoVar2.toBuilder();
            for (int i = 0; i < ((asjo) builder7.b).k.size(); i++) {
                aozy builder8 = ((asjn) ((asjo) builder7.b).k.get(i)).toBuilder();
                if (!((asjn) builder8.b).c.isEmpty()) {
                    if (!builder8.b.isMutable()) {
                        builder8.u();
                    }
                    ((asjn) builder8.b).d = asjn.emptyLongList();
                    List a2 = ahsl.a(((asjn) builder8.b).c);
                    if (!builder8.b.isMutable()) {
                        builder8.u();
                    }
                    asjn asjnVar = (asjn) builder8.b;
                    apar aparVar = asjnVar.d;
                    if (!aparVar.c()) {
                        asjnVar.d = apag.mutableCopy(aparVar);
                    }
                    aoyj.addAll(a2, asjnVar.d);
                }
                if (!builder8.b.isMutable()) {
                    builder8.u();
                }
                asjn asjnVar2 = (asjn) builder8.b;
                asjnVar2.b &= -2;
                asjnVar2.c = asjn.a.c;
                if (!builder7.b.isMutable()) {
                    builder7.u();
                }
                asjo asjoVar3 = (asjo) builder7.b;
                asjn asjnVar3 = (asjn) builder8.s();
                asjnVar3.getClass();
                apax apaxVar2 = asjoVar3.k;
                if (!apaxVar2.c()) {
                    asjoVar3.k = apag.mutableCopy(apaxVar2);
                }
                asjoVar3.k.set(i, asjnVar3);
            }
            if (!builder.b.isMutable()) {
                builder.u();
            }
            asjt asjtVar4 = (asjt) builder.b;
            asjo asjoVar4 = (asjo) builder7.s();
            asjoVar4.getClass();
            asjtVar4.j = asjoVar4;
            asjtVar4.b |= 128;
        }
        asie asieVar = ((asjt) builder.b).h;
        if (asieVar == null) {
            asieVar = asie.a;
        }
        if (asieVar.b.size() != 0) {
            asie asieVar2 = ((asjt) builder.b).h;
            if (asieVar2 == null) {
                asieVar2 = asie.a;
            }
            aozy builder9 = asieVar2.toBuilder();
            for (int i2 = 0; i2 < ((asie) builder9.b).b.size(); i2++) {
                aozy builder10 = ((asid) ((asie) builder9.b).b.get(i2)).toBuilder();
                if (!((asid) builder10.b).u.isEmpty()) {
                    if (!builder10.b.isMutable()) {
                        builder10.u();
                    }
                    ((asid) builder10.b).v = asid.emptyLongList();
                    List a3 = ahsl.a(((asid) builder10.b).u);
                    if (!builder10.b.isMutable()) {
                        builder10.u();
                    }
                    asid asidVar = (asid) builder10.b;
                    apar aparVar2 = asidVar.v;
                    if (!aparVar2.c()) {
                        asidVar.v = apag.mutableCopy(aparVar2);
                    }
                    aoyj.addAll(a3, asidVar.v);
                }
                if (!builder10.b.isMutable()) {
                    builder10.u();
                }
                asid asidVar2 = (asid) builder10.b;
                asidVar2.b &= -524289;
                asidVar2.u = asid.a.u;
                if (!builder9.b.isMutable()) {
                    builder9.u();
                }
                asie asieVar3 = (asie) builder9.b;
                asid asidVar3 = (asid) builder10.s();
                asidVar3.getClass();
                asieVar3.a();
                asieVar3.b.set(i2, asidVar3);
            }
            for (int i3 = 0; i3 < ((asie) builder9.b).c.size(); i3++) {
                aozy builder11 = ((asih) ((asie) builder9.b).c.get(i3)).toBuilder();
                if (!((asih) builder11.b).c.isEmpty()) {
                    if (!builder11.b.isMutable()) {
                        builder11.u();
                    }
                    ((asih) builder11.b).d = asih.emptyLongList();
                    List a4 = ahsl.a(((asih) builder11.b).c);
                    if (!builder11.b.isMutable()) {
                        builder11.u();
                    }
                    asih asihVar = (asih) builder11.b;
                    apar aparVar3 = asihVar.d;
                    if (!aparVar3.c()) {
                        asihVar.d = apag.mutableCopy(aparVar3);
                    }
                    aoyj.addAll(a4, asihVar.d);
                }
                if (!builder11.b.isMutable()) {
                    builder11.u();
                }
                asih asihVar2 = (asih) builder11.b;
                asihVar2.b &= -2;
                asihVar2.c = asih.a.c;
                if (!builder9.b.isMutable()) {
                    builder9.u();
                }
                asie asieVar4 = (asie) builder9.b;
                asih asihVar3 = (asih) builder11.s();
                asihVar3.getClass();
                apax apaxVar3 = asieVar4.c;
                if (!apaxVar3.c()) {
                    asieVar4.c = apag.mutableCopy(apaxVar3);
                }
                asieVar4.c.set(i3, asihVar3);
            }
            if (!builder.b.isMutable()) {
                builder.u();
            }
            asjt asjtVar5 = (asjt) builder.b;
            asie asieVar5 = (asie) builder9.s();
            asieVar5.getClass();
            asjtVar5.h = asieVar5;
            asjtVar5.b |= 32;
        }
        asii asiiVar = ((asjt) builder.b).m;
        if (asiiVar == null) {
            asiiVar = asii.a;
        }
        if (asiiVar.e.size() != 0) {
            asii asiiVar2 = ((asjt) builder.b).m;
            if (asiiVar2 == null) {
                asiiVar2 = asii.a;
            }
            aozy builder12 = asiiVar2.toBuilder();
            for (int i4 = 0; i4 < ((asii) builder12.b).e.size(); i4++) {
                apaa apaaVar = (apaa) ((asij) ((asii) builder12.b).e.get(i4)).toBuilder();
                ahsl.b(ahsl.c, apaaVar);
                if (!builder12.b.isMutable()) {
                    builder12.u();
                }
                asii asiiVar3 = (asii) builder12.b;
                asij asijVar = (asij) apaaVar.s();
                asijVar.getClass();
                asiiVar3.a();
                asiiVar3.e.set(i4, asijVar);
            }
            if (!builder.b.isMutable()) {
                builder.u();
            }
            asjt asjtVar6 = (asjt) builder.b;
            asii asiiVar4 = (asii) builder12.s();
            asiiVar4.getClass();
            asjtVar6.m = asiiVar4;
            asjtVar6.b |= 2048;
        }
        asjt asjtVar7 = (asjt) builder.s();
        if (((alvg) ahkh.a.f()).R()) {
            int i5 = asjtVar7.b;
            if ((8388608 & i5) == 0) {
                str = null;
            } else {
                str = "primes stats";
            }
            int i6 = i5 & 32;
            int i7 = i5 & 16;
            int i8 = i5 & 8;
            int i9 = i5 & 256;
            int i10 = i5 & 64;
            int i11 = i5 & 1024;
            int i12 = i5 & 128;
            int i13 = i5 & 2048;
            if (i6 != 0) {
                str = "network metric";
            }
            if (i7 != 0) {
                str = "timer metric";
            }
            if (i8 != 0) {
                str = "memory metric";
            }
            if (i9 != 0) {
                str = "battery metric";
            }
            if (i10 != 0) {
                str = "crash metric";
            }
            if (i11 != 0) {
                str = "jank metric";
            }
            if (i12 != 0) {
                str = "package metric";
            }
            if (i13 != 0) {
                str = "trace";
            }
            alvg alvgVar = (alvg) ((alvg) ahkh.a.f()).h("com/google/android/libraries/performance/primes/transmitter/clearcut/ClearcutMetricSnapshotTransmitter", "logSystemHealthMetric", 219, "ClearcutMetricSnapshotTransmitter.java");
            if (str == null) {
                str = "unknown";
            }
            alvgVar.D("Sending Primes %s: %s", str, asjtVar7);
        }
        if (!((Boolean) this.e.get()).booleanValue()) {
            checkIsLite2 = apag.checkIsLite(ahsg.b);
            ahsbVar.b(checkIsLite2);
            Object l = ahsbVar.l.l(checkIsLite2.d);
            if (l == null) {
                c = checkIsLite2.b;
            } else {
                c = checkIsLite2.c(l);
            }
            ahsg ahsgVar = (ahsg) c;
            if (((alvg) ahkh.a.f()).R()) {
                ((alvg) ((alvg) ahkh.a.f()).h("com/google/android/libraries/performance/primes/transmitter/clearcut/ClearcutMetricSnapshotTransmitter", "transmit", 119, "ClearcutMetricSnapshotTransmitter.java")).t("%s", Base64.encodeToString(asjtVar7.toByteArray(), 2));
            }
            boolean z2 = ahsgVar.j;
            if ((asjtVar7.b & 64) != 0) {
                z = true;
            }
            aquq aquqVar = this.f;
            if (aquqVar == null) {
                synchronized (this) {
                    aquqVar = this.f;
                    if (aquqVar == null) {
                        aquqVar = new aquq();
                        this.f = aquqVar;
                    }
                }
            }
            return ancj.g(aquqVar.i(context, z2, !z), new vug(this, context, asjtVar7, ahsgVar, 19), andi.a);
        }
        return aneh.a;
    }
}
