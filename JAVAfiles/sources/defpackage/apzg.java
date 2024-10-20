package defpackage;

import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apzg {
    private static final Logger a = Logger.getLogger(apzg.class.getName());

    private apzg() {
    }

    public static apyz a(armf armfVar, armf armfVar2) {
        apyy apzbVar;
        apyy apyyVar;
        try {
            Collection collection = (Collection) ((apxx) armfVar2).a;
            if (collection.isEmpty()) {
                apyyVar = apyy.a;
            } else {
                if (collection.size() == 1) {
                    apzbVar = new apze((apyy) alzz.aP(collection));
                } else {
                    apzbVar = new apzb(collection);
                }
                apyyVar = apzbVar;
            }
            return apyyVar.a(((apxx) armfVar).a);
        } catch (RuntimeException e) {
            a.logp(Level.SEVERE, "dagger.producers.monitoring.internal.Monitors", "createMonitorForComponent", "RuntimeException while constructing monitor factories.", (Throwable) e);
            return apyz.a;
        }
    }

    public static void b(RuntimeException runtimeException, apyy apyyVar, Object obj) {
        a.logp(Level.SEVERE, "dagger.producers.monitoring.internal.Monitors", "logCreateException", a.cd(obj, apyyVar, "RuntimeException while calling ProductionComponentMonitor.Factory.create on factory ", " with component "), (Throwable) runtimeException);
    }

    public static void c(RuntimeException runtimeException, apyu apyuVar, String str, Object obj) {
        a.logp(Level.SEVERE, "dagger.producers.monitoring.internal.Monitors", "logProducerMonitorArgMethodException", "RuntimeException while calling ProducerMonitor." + str + " on monitor " + apyuVar + " with " + obj, (Throwable) runtimeException);
    }

    public static void d(RuntimeException runtimeException, apyz apyzVar, apyv apyvVar) {
        a.logp(Level.SEVERE, "dagger.producers.monitoring.internal.Monitors", "logProducerMonitorForException", a.cd(apyvVar, apyzVar, "RuntimeException while calling ProductionComponentMonitor.producerMonitorFor on monitor ", " with token "), (Throwable) runtimeException);
    }

    public static void e(RuntimeException runtimeException, apyu apyuVar, String str) {
        a.logp(Level.SEVERE, "dagger.producers.monitoring.internal.Monitors", "logProducerMonitorMethodException", a.ci(apyuVar, str, "RuntimeException while calling ProducerMonitor.", " on monitor "), (Throwable) runtimeException);
    }
}
