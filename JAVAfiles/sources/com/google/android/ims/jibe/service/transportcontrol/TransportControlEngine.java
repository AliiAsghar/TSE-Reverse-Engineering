package com.google.android.ims.jibe.service.transportcontrol;

import com.google.android.ims.rcsservice.transportcontrol.ITransportControl;
import com.google.android.ims.rcsservice.transportcontrol.TransportControlServiceResult;
import com.google.android.ims.rcsservice.transportcontrol.TransportOptions;
import defpackage.adod;
import defpackage.adtn;
import defpackage.advr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TransportControlEngine extends ITransportControl.Stub {
    private final adod a;
    private final adtn b;

    public TransportControlEngine(adod adodVar, adtn adtnVar) {
        this.a = adodVar;
        this.b = adtnVar;
    }

    @Override // com.google.android.ims.rcsservice.transportcontrol.ITransportControl
    public TransportControlServiceResult useTransport(TransportOptions transportOptions) {
        int i = transportOptions.a;
        if (i != 0) {
            if (i != 1) {
                advr.q("Unknown transport type: %d", Integer.valueOf(i));
                return new TransportControlServiceResult(12);
            }
            advr.k("Received stop RCS stack request from Bugle", new Object[0]);
            this.a.stopRcsStack(this.b.b());
        } else {
            advr.k("Received start RCS stack request from Bugle", new Object[0]);
            this.a.startRcsStack(this.b.b());
        }
        return new TransportControlServiceResult(0);
    }
}
