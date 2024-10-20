package defpackage;

import android.os.Bundle;
import com.google.android.apps.tachyon.contacts.reachability.IReachabilityQueryNoCacheCallback;
import com.google.android.gms.duokit.LookupSingleRemoteReachabilityRequest;
import com.google.android.gms.duokit.LookupSingleRemoteReachabilityResponse;
import com.google.android.gms.duokit.RemoteUserReachability;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abxf extends IReachabilityQueryNoCacheCallback.Stub {
    final /* synthetic */ LookupSingleRemoteReachabilityRequest a;
    final /* synthetic */ acit b;
    final /* synthetic */ abxg c;

    public abxf(abxg abxgVar, LookupSingleRemoteReachabilityRequest lookupSingleRemoteReachabilityRequest, acit acitVar) {
        this.a = lookupSingleRemoteReachabilityRequest;
        this.b = acitVar;
        this.c = abxgVar;
    }

    @Override // com.google.android.apps.tachyon.contacts.reachability.IReachabilityQueryNoCacheCallback
    public final void onFinished(Map map) {
        LookupSingleRemoteReachabilityResponse lookupSingleRemoteReachabilityResponse = new LookupSingleRemoteReachabilityResponse();
        acit acitVar = this.b;
        LookupSingleRemoteReachabilityRequest lookupSingleRemoteReachabilityRequest = this.a;
        abxg abxgVar = this.c;
        if (map != null && !map.isEmpty()) {
            Bundle bundle = (Bundle) map.values().iterator().next();
            if (!bundle.isEmpty()) {
                RemoteUserReachability remoteUserReachability = new RemoteUserReachability();
                remoteUserReachability.a = lookupSingleRemoteReachabilityRequest.a;
                int i = bundle.getInt("IS_USER_REACHABLE", 0);
                remoteUserReachability.b = i;
                int i2 = bundle.getInt("IS_USER_MEET_REACHABLE", 0);
                remoteUserReachability.c = i2;
                acak acakVar = abxgVar.a;
                aozy createBuilder = apug.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                ((apug) apagVar).b = i;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                ((apug) createBuilder.b).c = i2;
                acakVar.f((apug) createBuilder.s());
                lookupSingleRemoteReachabilityResponse.a = remoteUserReachability;
                acitVar.b(lookupSingleRemoteReachabilityResponse);
                return;
            }
            abxgVar.a.h(14);
            RemoteUserReachability remoteUserReachability2 = new RemoteUserReachability();
            remoteUserReachability2.a = lookupSingleRemoteReachabilityRequest.a;
            remoteUserReachability2.b = 0;
            remoteUserReachability2.c = 0;
            lookupSingleRemoteReachabilityResponse.a = remoteUserReachability2;
            acitVar.b(lookupSingleRemoteReachabilityResponse);
            return;
        }
        abxgVar.a.h(14);
        RemoteUserReachability remoteUserReachability3 = new RemoteUserReachability();
        remoteUserReachability3.a = lookupSingleRemoteReachabilityRequest.a;
        remoteUserReachability3.b = 0;
        lookupSingleRemoteReachabilityResponse.a = remoteUserReachability3;
        acitVar.b(lookupSingleRemoteReachabilityResponse);
    }
}
