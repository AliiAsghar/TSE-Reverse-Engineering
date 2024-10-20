package com.google.android.libraries.communications.mobileconfiguration.sync;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.aaze;
import defpackage.abes;
import defpackage.aehu;
import defpackage.aehv;
import defpackage.aetn;
import defpackage.akec;
import defpackage.albo;
import defpackage.alvg;
import defpackage.ancj;
import defpackage.ancs;
import defpackage.anen;
import defpackage.aozy;
import defpackage.apmm;
import defpackage.apmr;
import defpackage.apmv;
import defpackage.apmw;
import defpackage.aqnl;
import defpackage.gsx;
import defpackage.vco;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class SyncWorker extends gsx {
    private final aehv e;
    private final anen f;
    private final boolean g;

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public interface a {
        anen hT();

        aehv hj();
    }

    public SyncWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        a aVar = (a) akec.w(context, a.class);
        this.e = aVar.hj();
        this.f = aVar.hT();
        this.g = workerParameters.b.h("is_force_sync");
    }

    @Override // defpackage.gsx
    public final ListenableFuture b() {
        ListenableFuture g;
        final UUID g2 = g();
        alvg alvgVar = (alvg) ((alvg) aehv.a.g()).h("com/google/android/libraries/communications/mobileconfiguration/sync/SyncHelper", "syncConfigsForStoredParameters", 102, "SyncHelper.java");
        final aehv aehvVar = this.e;
        alvgVar.D("[%s] sync started, workRequestId:%s", aehvVar.h, g2);
        aozy createBuilder = apmm.a.createBuilder();
        aozy createBuilder2 = apmr.a.createBuilder();
        String uuid = aehvVar.h.toString();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apmr apmrVar = (apmr) createBuilder2.b;
        uuid.getClass();
        apmrVar.b |= 1;
        apmrVar.e = uuid;
        String uuid2 = g2.toString();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apmr apmrVar2 = (apmr) createBuilder2.b;
        uuid2.getClass();
        apmrVar2.b |= 2;
        apmrVar2.f = uuid2;
        apmv apmvVar = apmv.a;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apmr apmrVar3 = (apmr) createBuilder2.b;
        apmvVar.getClass();
        apmrVar3.d = apmvVar;
        apmrVar3.c = 2;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        vco vcoVar = aehvVar.i;
        apmm apmmVar = (apmm) createBuilder.b;
        apmr apmrVar4 = (apmr) createBuilder2.s();
        apmrVar4.getClass();
        apmmVar.c = apmrVar4;
        apmmVar.b = 3;
        vcoVar.f((apmm) createBuilder.s());
        if (!aqnl.a.get().j(aehvVar.b)) {
            ((alvg) ((alvg) aehv.a.g()).h("com/google/android/libraries/communications/mobileconfiguration/sync/SyncHelper", "syncConfigsForStoredParameters", 106, "SyncHelper.java")).D("[%s] sync disabled by flag, workRequestId:%s", aehvVar.h, g2);
            aehvVar.i.f(aetn.aU(aehvVar.h, 6, g2));
            g = albo.bI(aehu.DISABLED_BY_FLAG);
        } else {
            final boolean z = this.g;
            g = ancj.g(aehvVar.f.submit(new aaze(aehvVar, 9)), new ancs() { // from class: aeht
                @Override // defpackage.ancs
                public final ListenableFuture a(Object obj) {
                    alor alorVar;
                    Optional optional;
                    aehv aehvVar2;
                    ListenableFuture f;
                    Optional optional2;
                    int i;
                    Optional optional3 = (Optional) obj;
                    boolean isEmpty = optional3.isEmpty();
                    aehv aehvVar3 = aehv.this;
                    final UUID uuid3 = g2;
                    if (isEmpty) {
                        ((alvg) ((alvg) aehv.a.i()).h("com/google/android/libraries/communications/mobileconfiguration/sync/SyncHelper", "syncAboutToExpireConfigData", 129, "SyncHelper.java")).D("[%s] sync aborted because failed to get parameters, workRequestId:%s", aehvVar3.h, uuid3);
                        aehvVar3.i.f(aetn.aT(aehvVar3.h, 3, uuid3));
                        return albo.bI(aehu.FAILURE);
                    }
                    int i2 = 18;
                    int i3 = 4;
                    if (aqnl.c(aehvVar3.b)) {
                        alorVar = (alor) Collection.EL.stream(((alor) optional3.get()).entrySet()).filter(new zko(aehvVar3, i2)).collect(alls.a(new aegk(i3), new aegk(5)));
                    } else {
                        alorVar = (alor) optional3.get();
                    }
                    if (alorVar.isEmpty()) {
                        ((alvg) ((alvg) aehv.a.g()).h("com/google/android/libraries/communications/mobileconfiguration/sync/SyncHelper", "syncAboutToExpireConfigData", 183, "SyncHelper.java")).D("[%s] sync aborted because no parameters are stored, workRequestId:%s", aehvVar3.h, uuid3);
                        aehvVar3.i.f(aetn.aU(aehvVar3.h, 3, uuid3));
                        return albo.bI(aehu.NO_PARAMETERS_STORED);
                    }
                    alok alokVar = new alok();
                    Iterator it = alorVar.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        aehn aehnVar = (aehn) entry.getValue();
                        aozy createBuilder3 = aotv.a.createBuilder();
                        String packageName = aehvVar3.b.getPackageName();
                        if (!createBuilder3.b.isMutable()) {
                            createBuilder3.u();
                        }
                        aotv aotvVar = (aotv) createBuilder3.b;
                        packageName.getClass();
                        aotvVar.b = packageName;
                        Context context = aehvVar3.b;
                        try {
                            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                        } catch (PackageManager.NameNotFoundException unused) {
                            i = -1;
                        }
                        if (!createBuilder3.b.isMutable()) {
                            createBuilder3.u();
                        }
                        ((aotv) createBuilder3.b).c = i;
                        aotv aotvVar2 = (aotv) createBuilder3.s();
                        aotx aotxVar = aehnVar.c;
                        if (aotxVar == null) {
                            aotxVar = aotx.a;
                        }
                        aozy builder = aotxVar.toBuilder();
                        if (!builder.b.isMutable()) {
                            builder.u();
                        }
                        ((aotx) builder.b).g = aotx.emptyProtobufList();
                        builder.aY(aotvVar2);
                        aotx aotxVar2 = (aotx) builder.s();
                        aozy builder2 = aehnVar.toBuilder();
                        if (!builder2.b.isMutable()) {
                            builder2.u();
                        }
                        aehn aehnVar2 = (aehn) builder2.b;
                        aotxVar2.getClass();
                        aehnVar2.c = aotxVar2;
                        aehnVar2.b |= 1;
                        alokVar.h((String) entry.getKey(), (aehn) builder2.s());
                    }
                    final alor b = alokVar.b();
                    final aehk aehkVar = (aehk) aehvVar3.d.b();
                    final UUID uuid4 = aehvVar3.h;
                    if (aehkVar.g.isEmpty()) {
                        ((alvg) ((alvg) aehk.a.i()).h("com/google/android/libraries/communications/mobileconfiguration/rpc/RpcManager", "getConfigurations", 190, "RpcManager.java")).t("[%s] failed to create mobileConfigurationClient", uuid4);
                        f = albo.bI(new aehe(4));
                        optional = optional3;
                        aehvVar2 = aehvVar3;
                    } else {
                        final boolean z2 = z;
                        final AtomicReference atomicReference = (AtomicReference) aehkVar.g.get();
                        ListenableFuture submit = aehkVar.d.submit(new Callable() { // from class: aehh
                            /* JADX WARN: Removed duplicated region for block: B:40:0x0155  */
                            /* JADX WARN: Removed duplicated region for block: B:45:0x019a  */
                            @Override // java.util.concurrent.Callable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public final java.lang.Object call() {
                                /*
                                    Method dump skipped, instructions count: 438
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.aehh.call():java.lang.Object");
                            }
                        });
                        alob alobVar = new alob();
                        alob alobVar2 = new alob();
                        int i4 = 0;
                        for (Map.Entry entry2 : b.entrySet()) {
                            aotx aotxVar3 = ((aehn) entry2.getValue()).c;
                            if (aotxVar3 == null) {
                                aotxVar3 = aotx.a;
                            }
                            aozy builder3 = aotxVar3.toBuilder();
                            String num = Integer.toString(i4);
                            if (!builder3.b.isMutable()) {
                                builder3.u();
                            }
                            aotx aotxVar4 = (aotx) builder3.b;
                            num.getClass();
                            aotxVar4.c = num;
                            if ((aotxVar4.b & 2) != 0) {
                                aouo aouoVar = aotxVar4.f;
                                if (aouoVar == null) {
                                    aouoVar = aouo.a;
                                }
                                String b2 = assd.b(aouoVar.c, '0');
                                aouo aouoVar2 = ((aotx) builder3.b).f;
                                if (aouoVar2 == null) {
                                    aouoVar2 = aouo.a;
                                }
                                aozy builder4 = aouoVar2.toBuilder();
                                optional2 = optional3;
                                if (!builder4.b.isMutable()) {
                                    builder4.u();
                                }
                                aouo aouoVar3 = (aouo) builder4.b;
                                b2.getClass();
                                aouoVar3.c = b2;
                                aouo aouoVar4 = (aouo) builder4.s();
                                if (!builder3.b.isMutable()) {
                                    builder3.u();
                                }
                                aotx aotxVar5 = (aotx) builder3.b;
                                aouoVar4.getClass();
                                aotxVar5.f = aouoVar4;
                                aotxVar5.b |= 2;
                            } else {
                                optional2 = optional3;
                            }
                            alobVar.h((aotx) builder3.s());
                            alobVar2.h((String) entry2.getKey());
                            i4++;
                            optional3 = optional2;
                        }
                        optional = optional3;
                        alog g3 = alobVar.g();
                        final alog g4 = alobVar2.g();
                        aozy createBuilder4 = aotz.a.createBuilder();
                        aozy createBuilder5 = aoun.a.createBuilder();
                        String uuid5 = uuid4.toString();
                        if (!createBuilder5.b.isMutable()) {
                            createBuilder5.u();
                        }
                        apag apagVar = createBuilder5.b;
                        aehvVar2 = aehvVar3;
                        uuid5.getClass();
                        ((aoun) apagVar).b = uuid5;
                        long j = aehkVar.b;
                        if (!apagVar.isMutable()) {
                            createBuilder5.u();
                        }
                        ((aoun) createBuilder5.b).c = j;
                        aoun aounVar = (aoun) createBuilder5.s();
                        if (!createBuilder4.b.isMutable()) {
                            createBuilder4.u();
                        }
                        apag apagVar2 = createBuilder4.b;
                        aotz aotzVar = (aotz) apagVar2;
                        aounVar.getClass();
                        aotzVar.c = aounVar;
                        aotzVar.b |= 1;
                        if (!apagVar2.isMutable()) {
                            createBuilder4.u();
                        }
                        aotz aotzVar2 = (aotz) createBuilder4.b;
                        apax apaxVar = aotzVar2.d;
                        if (!apaxVar.c()) {
                            aotzVar2.d = apag.mutableCopy(apaxVar);
                        }
                        aoyj.addAll(g3, aotzVar2.d);
                        aotz aotzVar3 = (aotz) createBuilder4.s();
                        ((alvg) ((alvg) aehk.a.g()).h("com/google/android/libraries/communications/mobileconfiguration/rpc/RpcManager", "getConfigurations", 238, "RpcManager.java")).D("[%s] making getConfiguration request, workRequestId:%s", uuid4, uuid3);
                        ((alvg) ((alvg) aehk.a.f()).h("com/google/android/libraries/communications/mobileconfiguration/rpc/RpcManager", "getConfigurations", 240, "RpcManager.java")).t("GetConfigurationRequest: %s", aotzVar3);
                        vco vcoVar2 = aehkVar.j;
                        int i5 = ((alsx) g3).c;
                        aozy createBuilder6 = apmm.a.createBuilder();
                        aozy createBuilder7 = apmr.a.createBuilder();
                        String uuid6 = uuid4.toString();
                        if (!createBuilder7.b.isMutable()) {
                            createBuilder7.u();
                        }
                        apmr apmrVar5 = (apmr) createBuilder7.b;
                        uuid6.getClass();
                        apmrVar5.b |= 1;
                        apmrVar5.e = uuid6;
                        String uuid7 = uuid3.toString();
                        if (!createBuilder7.b.isMutable()) {
                            createBuilder7.u();
                        }
                        apmr apmrVar6 = (apmr) createBuilder7.b;
                        uuid7.getClass();
                        apmrVar6.b |= 2;
                        apmrVar6.f = uuid7;
                        aozy createBuilder8 = apmt.a.createBuilder();
                        if (!createBuilder8.b.isMutable()) {
                            createBuilder8.u();
                        }
                        apmt apmtVar = (apmt) createBuilder8.b;
                        apmtVar.b |= 1;
                        apmtVar.c = i5;
                        if (!createBuilder7.b.isMutable()) {
                            createBuilder7.u();
                        }
                        apmr apmrVar7 = (apmr) createBuilder7.b;
                        apmt apmtVar2 = (apmt) createBuilder8.s();
                        apmtVar2.getClass();
                        apmrVar7.d = apmtVar2;
                        apmrVar7.c = 4;
                        if (!createBuilder6.b.isMutable()) {
                            createBuilder6.u();
                        }
                        apmm apmmVar2 = (apmm) createBuilder6.b;
                        apmr apmrVar8 = (apmr) createBuilder7.s();
                        apmrVar8.getClass();
                        apmmVar2.c = apmrVar8;
                        apmmVar2.b = 3;
                        vcoVar2.f((apmm) createBuilder6.s());
                        f = ancd.f(ancj.f(anee.o(ancj.g(anee.o(submit), new yui(atomicReference, aotzVar3, 18, null), aehkVar.d)), new algk() { // from class: aehi
                            /* JADX WARN: Type inference failed for: r0v28, types: [apwt, java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r6v18, types: [apwt, java.lang.Object] */
                            @Override // defpackage.algk
                            public final Object apply(Object obj2) {
                                Map map;
                                aoua aouaVar = (aoua) obj2;
                                alvg alvgVar2 = (alvg) ((alvg) aehk.a.g()).h("com/google/android/libraries/communications/mobileconfiguration/rpc/RpcManager", "processResponse", 272, "RpcManager.java");
                                UUID uuid8 = uuid4;
                                UUID uuid9 = uuid3;
                                alvgVar2.D("[%s] processing getConfiguration response, workRequestId:%s", uuid8, uuid9);
                                ((alvg) ((alvg) aehk.a.f()).h("com/google/android/libraries/communications/mobileconfiguration/rpc/RpcManager", "processResponse", 274, "RpcManager.java")).t("GetConfigurationResponse: %s", aouaVar);
                                int size = aouaVar.b.size();
                                aozy createBuilder9 = apmm.a.createBuilder();
                                aozy createBuilder10 = apmr.a.createBuilder();
                                String uuid10 = uuid8.toString();
                                if (!createBuilder10.b.isMutable()) {
                                    createBuilder10.u();
                                }
                                apmr apmrVar9 = (apmr) createBuilder10.b;
                                uuid10.getClass();
                                apmrVar9.b |= 1;
                                apmrVar9.e = uuid10;
                                String uuid11 = uuid9.toString();
                                if (!createBuilder10.b.isMutable()) {
                                    createBuilder10.u();
                                }
                                apmr apmrVar10 = (apmr) createBuilder10.b;
                                uuid11.getClass();
                                apmrVar10.b |= 2;
                                apmrVar10.f = uuid11;
                                aozy createBuilder11 = apmu.a.createBuilder();
                                if (!createBuilder11.b.isMutable()) {
                                    createBuilder11.u();
                                }
                                apmu apmuVar = (apmu) createBuilder11.b;
                                apmuVar.b |= 1;
                                apmuVar.c = size;
                                if (!createBuilder10.b.isMutable()) {
                                    createBuilder10.u();
                                }
                                apmr apmrVar11 = (apmr) createBuilder10.b;
                                apmu apmuVar2 = (apmu) createBuilder11.s();
                                apmuVar2.getClass();
                                apmrVar11.d = apmuVar2;
                                apmrVar11.c = 5;
                                if (!createBuilder9.b.isMutable()) {
                                    createBuilder9.u();
                                }
                                aehk aehkVar2 = aehk.this;
                                apmm apmmVar3 = (apmm) createBuilder9.b;
                                apmr apmrVar12 = (apmr) createBuilder10.s();
                                apmrVar12.getClass();
                                apmmVar3.c = apmrVar12;
                                apmmVar3.b = 3;
                                aehkVar2.j.f((apmm) createBuilder9.s());
                                HashSet hashSet = new HashSet(aouaVar.c);
                                if (!hashSet.equals(aehkVar2.i.get())) {
                                    aehkVar2.h.isPresent();
                                    aehkVar2.i.set(hashSet);
                                    int[] array = Collection.EL.stream(aouaVar.c).mapToInt(new kmb(10)).toArray();
                                    ((acgl) aehkVar2.h.get().b()).x(array, "ANDROID_MESSAGING");
                                    ((acgl) aehkVar2.h.get().b()).x(array, "CARRIER_SERVICES");
                                }
                                alok alokVar2 = new alok();
                                Iterator<E> it2 = aouaVar.b.iterator();
                                while (true) {
                                    map = b;
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    alog alogVar = g4;
                                    aotw aotwVar = (aotw) it2.next();
                                    String str = (String) alogVar.get(Integer.parseInt(aotwVar.e));
                                    aozy createBuilder12 = aehn.a.createBuilder();
                                    aotx aotxVar6 = ((aehn) map.get(str)).c;
                                    if (aotxVar6 == null) {
                                        aotxVar6 = aotx.a;
                                    }
                                    if (!createBuilder12.b.isMutable()) {
                                        createBuilder12.u();
                                    }
                                    apag apagVar3 = createBuilder12.b;
                                    aehn aehnVar3 = (aehn) apagVar3;
                                    aotxVar6.getClass();
                                    aehnVar3.c = aotxVar6;
                                    aehnVar3.b |= 1;
                                    if (!apagVar3.isMutable()) {
                                        createBuilder12.u();
                                    }
                                    aehn aehnVar4 = (aehn) createBuilder12.b;
                                    aotwVar.getClass();
                                    aehnVar4.d = aotwVar;
                                    aehnVar4.b |= 2;
                                    apct apctVar = ((aehn) map.get(str)).f;
                                    if (apctVar == null) {
                                        apctVar = apct.a;
                                    }
                                    if (!createBuilder12.b.isMutable()) {
                                        createBuilder12.u();
                                    }
                                    aehn aehnVar5 = (aehn) createBuilder12.b;
                                    apctVar.getClass();
                                    aehnVar5.f = apctVar;
                                    aehnVar5.b |= 8;
                                    apct j2 = aotl.j(Instant.now());
                                    if (!createBuilder12.b.isMutable()) {
                                        createBuilder12.u();
                                    }
                                    aehn aehnVar6 = (aehn) createBuilder12.b;
                                    j2.getClass();
                                    aehnVar6.e = j2;
                                    aehnVar6.b |= 4;
                                    alokVar2.h(str, (aehn) createBuilder12.s());
                                }
                                alor b3 = alokVar2.b();
                                if (((altc) b3).d < ((altc) map).d) {
                                    ((alvg) ((alvg) aehk.a.i()).h("com/google/android/libraries/communications/mobileconfiguration/rpc/RpcManager", "processResponse", 318, "RpcManager.java")).t("[%s] response is missing configs", uuid8);
                                    return new aehe(6);
                                }
                                return new aehd(b3);
                            }
                        }, aehkVar.e), aqwb.class, new adhe(uuid4, 16), aehkVar.e);
                    }
                    final aehv aehvVar4 = aehvVar2;
                    final Optional optional4 = optional;
                    return ancj.f(f, new algk() { // from class: aehs
                        @Override // defpackage.algk
                        public final Object apply(Object obj2) {
                            aehj aehjVar = (aehj) obj2;
                            alor alorVar2 = (alor) optional4.get();
                            int b3 = aehjVar.b();
                            UUID uuid8 = uuid3;
                            aehv aehvVar5 = aehv.this;
                            if (b3 == 2) {
                                aehvVar5.i.f(aetn.aT(aehvVar5.h, aehjVar.c(), uuid8));
                                return aehu.FAILURE;
                            }
                            Map a2 = aehjVar.a();
                            alpr alprVar = new alpr();
                            for (Map.Entry entry3 : ((alor) a2).entrySet()) {
                                String str = (String) entry3.getKey();
                                aehn aehnVar3 = (aehn) entry3.getValue();
                                try {
                                    ((aehm) aehvVar5.c.b()).d(str, aehnVar3);
                                    if ((((aehn) alorVar2.get(str)).b & 2) != 0) {
                                        aotw aotwVar = ((aehn) alorVar2.get(str)).d;
                                        if (aotwVar == null) {
                                            aotwVar = aotw.a;
                                        }
                                        aotw aotwVar2 = aehnVar3.d;
                                        if (aotwVar2 == null) {
                                            aotwVar2 = aotw.a;
                                        }
                                        aozy builder5 = aotwVar.toBuilder();
                                        if (!builder5.b.isMutable()) {
                                            builder5.u();
                                        }
                                        apag apagVar3 = builder5.b;
                                        ((aotw) apagVar3).e = aotw.a.e;
                                        if (!apagVar3.isMutable()) {
                                            builder5.u();
                                        }
                                        aotw aotwVar3 = (aotw) builder5.b;
                                        aotwVar3.f = null;
                                        aotwVar3.b &= -2;
                                        aotw aotwVar4 = (aotw) builder5.s();
                                        aozy builder6 = aotwVar2.toBuilder();
                                        if (!builder6.b.isMutable()) {
                                            builder6.u();
                                        }
                                        apag apagVar4 = builder6.b;
                                        ((aotw) apagVar4).e = aotw.a.e;
                                        if (!apagVar4.isMutable()) {
                                            builder6.u();
                                        }
                                        aotw aotwVar5 = (aotw) builder6.b;
                                        aotwVar5.f = null;
                                        aotwVar5.b &= -2;
                                        if (!aotwVar4.equals(builder6.s())) {
                                            alprVar.c(str);
                                        }
                                    } else {
                                        alprVar.c(str);
                                    }
                                } catch (aehc unused2) {
                                    ((alvg) ((alvg) aehv.a.i()).h("com/google/android/libraries/communications/mobileconfiguration/sync/SyncHelper", "processUpdatedBatchedConfigData", 273, "SyncHelper.java")).D("[%s] failed to store configs, workRequestId:%s", aehvVar5.h, uuid8);
                                    aehvVar5.i.f(aetn.aT(aehvVar5.h, 7, uuid8));
                                    return aehu.FAILURE;
                                }
                            }
                            alpt g5 = alprVar.g();
                            if (!g5.isEmpty()) {
                                Intent intent = new Intent();
                                intent.setAction("com.google.android.libraries.communications.mobileconfiguration.CONFIG_UPDATED");
                                intent.addFlags(16777216);
                                intent.putStringArrayListExtra("config_data_ids_of_updated_configs", new ArrayList<>(g5));
                                ((alvg) ((alvg) aehv.a.g()).h("com/google/android/libraries/communications/mobileconfiguration/sync/SyncHelper", "processUpdatedBatchedConfigData", 299, "SyncHelper.java")).D("[%s] broadcasting changed configs, workRequestId:%s", aehvVar5.h, uuid8);
                                vco vcoVar3 = aehvVar5.i;
                                UUID uuid9 = aehvVar5.h;
                                int size = g5.size();
                                aozy createBuilder9 = apmm.a.createBuilder();
                                aozy createBuilder10 = apmr.a.createBuilder();
                                String uuid10 = uuid9.toString();
                                if (!createBuilder10.b.isMutable()) {
                                    createBuilder10.u();
                                }
                                apmr apmrVar9 = (apmr) createBuilder10.b;
                                uuid10.getClass();
                                apmrVar9.b |= 1;
                                apmrVar9.e = uuid10;
                                String uuid11 = uuid8.toString();
                                if (!createBuilder10.b.isMutable()) {
                                    createBuilder10.u();
                                }
                                apmr apmrVar10 = (apmr) createBuilder10.b;
                                uuid11.getClass();
                                apmrVar10.b |= 2;
                                apmrVar10.f = uuid11;
                                aozy createBuilder11 = apmq.a.createBuilder();
                                if (!createBuilder11.b.isMutable()) {
                                    createBuilder11.u();
                                }
                                apmq apmqVar = (apmq) createBuilder11.b;
                                apmqVar.b |= 1;
                                apmqVar.c = size;
                                if (!createBuilder10.b.isMutable()) {
                                    createBuilder10.u();
                                }
                                apmr apmrVar11 = (apmr) createBuilder10.b;
                                apmq apmqVar2 = (apmq) createBuilder11.s();
                                apmqVar2.getClass();
                                apmrVar11.d = apmqVar2;
                                apmrVar11.c = 6;
                                if (!createBuilder9.b.isMutable()) {
                                    createBuilder9.u();
                                }
                                apmm apmmVar3 = (apmm) createBuilder9.b;
                                apmr apmrVar12 = (apmr) createBuilder10.s();
                                apmrVar12.getClass();
                                apmmVar3.c = apmrVar12;
                                apmmVar3.b = 3;
                                vcoVar3.f((apmm) createBuilder9.s());
                                aehvVar5.b.sendBroadcast(intent);
                            }
                            if (aqnl.c(aehvVar5.b)) {
                                alok alokVar2 = new alok();
                                alokVar2.l(alorVar2);
                                alokVar2.l(a2);
                                aehvVar5.e.c(alokVar2.g());
                            } else {
                                aehvVar5.e.c(a2);
                            }
                            ((alvg) ((alvg) aehv.a.g()).h("com/google/android/libraries/communications/mobileconfiguration/sync/SyncHelper", "processUpdatedBatchedConfigData", 322, "SyncHelper.java")).D("[%s] sync succeeded, workRequestId:%s", aehvVar5.h, uuid8);
                            aehvVar5.i.f(aetn.aU(aehvVar5.h, 5, uuid8));
                            return aehu.SUCCESS;
                        }
                    }, aehvVar4.f);
                }
            }, aehvVar.g);
        }
        return ancj.f(g, new abes(11), this.f);
    }

    @Override // defpackage.gsx
    public final void d() {
        UUID g = g();
        alvg alvgVar = (alvg) ((alvg) aehv.a.i()).h("com/google/android/libraries/communications/mobileconfiguration/sync/SyncHelper", "onStopped", 213, "SyncHelper.java");
        aehv aehvVar = this.e;
        alvgVar.D("[%s] sync stopped, workRequestId:%s", aehvVar.h, g);
        aozy createBuilder = apmm.a.createBuilder();
        aozy createBuilder2 = apmr.a.createBuilder();
        String uuid = aehvVar.h.toString();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apmr apmrVar = (apmr) createBuilder2.b;
        uuid.getClass();
        apmrVar.b |= 1;
        apmrVar.e = uuid;
        String uuid2 = g.toString();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apmr apmrVar2 = (apmr) createBuilder2.b;
        uuid2.getClass();
        apmrVar2.b |= 2;
        apmrVar2.f = uuid2;
        apmw apmwVar = apmw.a;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apmr apmrVar3 = (apmr) createBuilder2.b;
        apmwVar.getClass();
        apmrVar3.d = apmwVar;
        apmrVar3.c = 7;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        vco vcoVar = aehvVar.i;
        apmm apmmVar = (apmm) createBuilder.b;
        apmr apmrVar4 = (apmr) createBuilder2.s();
        apmrVar4.getClass();
        apmmVar.c = apmrVar4;
        apmmVar.b = 3;
        vcoVar.f((apmm) createBuilder.s());
    }
}
