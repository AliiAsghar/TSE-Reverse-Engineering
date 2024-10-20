package defpackage;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.iid.Registrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aofs implements aoep {
    private final /* synthetic */ int a;

    public /* synthetic */ aofs(int i) {
        this.a = i;
    }

    @Override // defpackage.aoep
    public final Object a(aoeo aoeoVar) {
        switch (this.a) {
            case 0:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.a();
            case 1:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.a();
            case 2:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.a();
            case 3:
                return aoft.a;
            case 4:
                return TransportRegistrar.lambda$getComponents$0(aoeoVar);
            case 5:
                return TransportRegistrar.lambda$getComponents$1(aoeoVar);
            case 6:
                return TransportRegistrar.lambda$getComponents$2(aoeoVar);
            case 7:
                return Registrar.lambda$getComponents$0(aoeoVar);
            case 8:
                return Registrar.lambda$getComponents$1(aoeoVar);
            case 9:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(aoeoVar);
            case 10:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(aoeoVar);
            default:
                Set l = aode.l(aoeoVar, aojk.class);
                aojj aojjVar = aojj.a;
                if (aojjVar == null) {
                    synchronized (aojj.class) {
                        aojjVar = aojj.a;
                        if (aojjVar == null) {
                            aojjVar = new aojj();
                            aojj.a = aojjVar;
                        }
                    }
                }
                return new aoji(l, aojjVar);
        }
    }
}
