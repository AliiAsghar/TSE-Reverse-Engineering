package com.google.android.ims.network.common;

import android.os.IBinder;
import com.google.android.ims.rcs.engine.IRcsEngineTemporaryController;
import defpackage.acoh;
import defpackage.acys;
import defpackage.addv;
import defpackage.adeu;
import defpackage.adev;
import defpackage.adew;
import defpackage.adoc;
import defpackage.adth;
import defpackage.adwl;
import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface RcsEngine extends IRcsEngineTemporaryController, IBinder, adoc, adeu, adev, acoh, acys, adth, addv {
    public static final int[] DEFAULT_NETWORK_REGISTRATION_ORDER = {17, 1, 0};

    void dumpState(PrintWriter printWriter);

    adew getImsModule();

    adwl getSipConnectionType();

    void init();

    void onBackendChanged();

    void onReconfigurationRequested();

    void onSimLoaded(boolean z);

    void onSimRemoved();

    void shutdown();
}
