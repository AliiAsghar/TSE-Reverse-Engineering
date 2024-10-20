package com.google.android.rcs.client.lifecycle;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.ims.rcs.engine.IRcsEngineController;
import com.google.android.ims.rcsservice.lifecycle.InitializeAndStartRcsTransportRequest;
import com.google.android.ims.rcsservice.lifecycle.StopAllRcsTransportsExceptRequest;
import defpackage.ajnv;
import defpackage.ajny;
import defpackage.ajoa;
import defpackage.xzb;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class RcsEngineLifecycleServiceV2 extends ajnv<IRcsEngineController> {
    public RcsEngineLifecycleServiceV2(Context context, ajoa ajoaVar) {
        super(IRcsEngineController.class, context, ajoaVar, 1, Optional.empty());
    }

    public com.google.android.ims.rcs.engine.RcsEngineLifecycleServiceResult destroy(int i) {
        b();
        try {
            return ((IRcsEngineController) a()).destroy(i);
        } catch (RemoteException | IllegalStateException e) {
            xzb.u(e, "Error while destroying RCS engine for subId=%d.", Integer.valueOf(i));
            throw new ajny("Error while initializing RCS engine.", e);
        }
    }

    @Override // defpackage.ajnv
    public String getRcsServiceMetaDataKey() {
        return "RcsEngineLifecycleServiceVersions";
    }

    public com.google.android.ims.rcs.engine.RcsEngineLifecycleServiceResult initialize(int i, int i2) {
        b();
        try {
            return ((IRcsEngineController) a()).initialize(i, i2);
        } catch (RemoteException | IllegalStateException e) {
            xzb.u(e, "Error while initializing RCS engine for subId=%d.", Integer.valueOf(i));
            throw new ajny("Error while initializing RCS engine.", e);
        }
    }

    public com.google.android.ims.rcs.engine.RcsEngineLifecycleServiceResult initializeAndStartRcsTransport(InitializeAndStartRcsTransportRequest initializeAndStartRcsTransportRequest) {
        b();
        try {
            return ((IRcsEngineController) a()).initializeAndStartRcsTransport(initializeAndStartRcsTransportRequest);
        } catch (RemoteException | IllegalStateException e) {
            xzb.p("RcsClientLib", e, "Error while initializing RCS transport");
            throw new ajny("Error while initializing RCS engine.", e);
        }
    }

    public com.google.android.ims.rcs.engine.RcsEngineLifecycleServiceResult stopAllRcsTransportsExcept(StopAllRcsTransportsExceptRequest stopAllRcsTransportsExceptRequest) {
        b();
        try {
            return ((IRcsEngineController) a()).stopAllRcsTransportsExcept(stopAllRcsTransportsExceptRequest);
        } catch (RemoteException | IllegalStateException e) {
            xzb.p("RcsClientLib", e, "Error while initializing RCS transport");
            throw new ajny("Error while initializing RCS engine.", e);
        }
    }

    public com.google.android.ims.rcs.engine.RcsEngineLifecycleServiceResult triggerStartRcsStack(int i) {
        b();
        try {
            return ((IRcsEngineController) a()).triggerStartRcsStack(i);
        } catch (RemoteException | IllegalStateException e) {
            xzb.u(e, "Error while starting RCS engine for subId=%d.", Integer.valueOf(i));
            throw new ajny("Error while starting RCS engine.");
        }
    }

    public com.google.android.ims.rcs.engine.RcsEngineLifecycleServiceResult triggerStopRcsStack(int i) {
        b();
        try {
            return ((IRcsEngineController) a()).triggerStopRcsStack(i);
        } catch (RemoteException | IllegalStateException e) {
            xzb.u(e, "Error while stopping RCS engine for subId=%d.", Integer.valueOf(i));
            throw new ajny("Error while stopping RCS engine.");
        }
    }
}
