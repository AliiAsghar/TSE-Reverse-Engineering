package com.google.android.rcs.client.lifecycle;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.ims.rcs.engine.IRcsEngineTemporaryController;
import defpackage.ajnv;
import defpackage.ajny;
import defpackage.ajoa;
import defpackage.xzb;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class RcsEngineLifecycleService extends ajnv<IRcsEngineTemporaryController> {
    public RcsEngineLifecycleService(Context context, ajoa ajoaVar) {
        super(IRcsEngineTemporaryController.class, context, ajoaVar, 1, Optional.empty());
    }

    @Override // defpackage.ajnv
    public String getRcsServiceMetaDataKey() {
        return "RcsEngineLifecycleServiceVersions";
    }

    public RcsEngineLifecycleServiceResult triggerStartRcsStack(String str) {
        b();
        try {
            ((IRcsEngineTemporaryController) a()).triggerStartRcsStack(str);
            return new RcsEngineLifecycleServiceResult(0);
        } catch (RemoteException | IllegalStateException e) {
            xzb.p("RcsClientLib", e, "Error while starting RCS engine.");
            throw new ajny("Error while starting RCS engine.");
        }
    }

    public RcsEngineLifecycleServiceResult triggerStopRcsStack(String str) {
        b();
        try {
            ((IRcsEngineTemporaryController) a()).triggerStopRcsStack(str);
            return new RcsEngineLifecycleServiceResult(0);
        } catch (RemoteException | IllegalStateException e) {
            xzb.p("RcsClientLib", e, "Error while stopping RCS engine.");
            throw new ajny("Error while stopping RCS engine.");
        }
    }
}
