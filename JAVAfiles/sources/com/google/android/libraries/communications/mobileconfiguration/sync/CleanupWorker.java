package com.google.android.libraries.communications.mobileconfiguration.sync;

import android.content.Context;
import android.os.Bundle;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import defpackage.a;
import defpackage.aehm;
import defpackage.aehn;
import defpackage.aehq;
import defpackage.alor;
import defpackage.alpr;
import defpackage.alpt;
import defpackage.altc;
import defpackage.aluq;
import defpackage.alvg;
import defpackage.anca;
import defpackage.aotl;
import defpackage.aozy;
import defpackage.apct;
import defpackage.apml;
import defpackage.apmm;
import defpackage.aqni;
import defpackage.gsv;
import defpackage.gsw;
import defpackage.gvf;
import defpackage.vco;
import j$.time.Instant;
import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class CleanupWorker extends Worker {
    private final aehq e;

    public CleanupWorker(Context context, WorkerParameters workerParameters, aehq aehqVar) {
        super(context, workerParameters);
        this.e = aehqVar;
    }

    @Override // androidx.work.Worker
    public final gvf c() {
        Optional of;
        aehq aehqVar = this.e;
        aehm aehmVar = aehqVar.b;
        alor alorVar = (alor) aehmVar.b().orElse(altc.a);
        anca ancaVar = aehmVar.c;
        Instant minusSeconds = Instant.now().minusSeconds(aqni.a.get().a(aehmVar.b));
        alpr alprVar = new alpr();
        aluq listIterator = alorVar.entrySet().listIterator();
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            aehn aehnVar = (aehn) entry.getValue();
            if ((aehnVar.b & 8) != 0) {
                apct apctVar = aehnVar.f;
                if (apctVar == null) {
                    apctVar = apct.a;
                }
                if (aotl.l(apctVar).isBefore(minusSeconds)) {
                    Bundle a = aehmVar.a("REMOVE", (String) entry.getKey(), Optional.empty());
                    if (a != null && !a.containsKey("result_error_key")) {
                        alprVar.c((String) entry.getKey());
                    } else {
                        ((alvg) ((alvg) aehm.a.i()).h("com/google/android/libraries/communications/mobileconfiguration/storage/BugleConfigurationManagerImpl", "deleteStaleConfigs", 177, "BugleConfigurationManagerImpl.java")).q("deleteStaleConfigs: error calling content provider");
                        of = Optional.empty();
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        of = Optional.of(alprVar.g());
        if (of.isEmpty()) {
            ((alvg) ((alvg) aehq.a.h()).h("com/google/android/libraries/communications/mobileconfiguration/sync/CleanupWorkerHandler", "doWork", 31, "CleanupWorkerHandler.java")).q("Error deleting stale configs");
            vco vcoVar = aehqVar.c;
            aozy createBuilder = apmm.a.createBuilder();
            aozy createBuilder2 = apml.a.createBuilder();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apml apmlVar = (apml) createBuilder2.b;
            apmlVar.c = a.an(3);
            apmlVar.b |= 1;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apmm apmmVar = (apmm) createBuilder.b;
            apml apmlVar2 = (apml) createBuilder2.s();
            apmlVar2.getClass();
            apmmVar.c = apmlVar2;
            apmmVar.b = 4;
            vcoVar.f((apmm) createBuilder.s());
            return new gsv();
        }
        int size = ((alpt) of.get()).size();
        ((alvg) ((alvg) aehq.a.g()).h("com/google/android/libraries/communications/mobileconfiguration/sync/CleanupWorkerHandler", "doWork", 36, "CleanupWorkerHandler.java")).r("Successfully deleted %d configs", size);
        vco vcoVar2 = aehqVar.c;
        aozy createBuilder3 = apmm.a.createBuilder();
        aozy createBuilder4 = apml.a.createBuilder();
        if (!createBuilder4.b.isMutable()) {
            createBuilder4.u();
        }
        apml apmlVar3 = (apml) createBuilder4.b;
        apmlVar3.c = a.an(4);
        apmlVar3.b |= 1;
        if (!createBuilder4.b.isMutable()) {
            createBuilder4.u();
        }
        apml apmlVar4 = (apml) createBuilder4.b;
        apmlVar4.b |= 2;
        apmlVar4.d = size;
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        apmm apmmVar2 = (apmm) createBuilder3.b;
        apml apmlVar5 = (apml) createBuilder4.s();
        apmlVar5.getClass();
        apmmVar2.c = apmlVar5;
        apmmVar2.b = 4;
        vcoVar2.f((apmm) createBuilder3.s());
        return new gsw();
    }
}
