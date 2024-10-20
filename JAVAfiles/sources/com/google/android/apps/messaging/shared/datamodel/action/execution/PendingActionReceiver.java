package com.google.android.apps.messaging.shared.datamodel.action.execution;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.alhr;
import defpackage.amdy;
import defpackage.armf;
import defpackage.lqn;
import defpackage.mgv;
import defpackage.rhg;
import defpackage.rho;
import defpackage.rib;
import defpackage.rij;
import defpackage.utz;
import defpackage.uuh;
import defpackage.xze;
import defpackage.yhy;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PendingActionReceiver extends rij {
    static final alhr a = uuh.x(169455120, "pending_action_receiver_async");
    private static final xze f = xze.g("BugleDataModel", "PendingActionReceiver");
    public armf b;
    public armf c;
    public armf d;
    public armf e;

    public static PendingIntent l(Context context, Action action, int i, boolean z, int i2, Uri uri, rib ribVar) {
        Intent a2 = lqn.f(context.getApplicationContext(), PendingActionReceiver.class, "android.intent.action.VIEW").a();
        if (uri != null) {
            a2.setData(uri);
        }
        a2.putExtra("datamodel_action_bundle", ribVar.a(action));
        a2.putExtra("job_id", i);
        if (z) {
            a2.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        }
        return PendingIntent.getBroadcast(context, i, a2, yhy.a(i2));
    }

    private final void m(Intent intent) {
        if (intent == null) {
            f.m("received no intent.");
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("datamodel_action_bundle");
        if (bundleExtra == null) {
            f.m("received intent with no Bundle.");
            return;
        }
        try {
            Action c = ((rib) this.c.b()).c(bundleExtra);
            if (c == null) {
                f.m("received intent with no Action.");
                return;
            }
            int i = bundleExtra.getInt("job_id", rho.a(c));
            if (c.x == amdy.MARK_AS_READ_ACTION) {
                ((mgv) this.b.b()).e(mgv.o);
            }
            rho rhoVar = new rho(c.t, i, null, this, true);
            rhoVar.b = toString();
            q("PendingActionReceiver", ((rhg) this.e.b()).a(rhoVar, c));
        } catch (BadParcelableException e) {
            f.n("Failed to unparcel action.", e);
        }
    }

    @Override // defpackage.wng
    public final akrc a() {
        return ((aksr) this.d.b()).b("PendingActionReceiver Receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return null;
    }

    @Override // defpackage.wna
    public final String f() {
        return "Bugle.Broadcast.ForegroundService.PendingActionReceiver.Latency";
    }

    @Override // defpackage.wna
    public final void g(Context context, Intent intent) {
        m(intent);
    }

    @Override // defpackage.wna
    public final boolean h(Context context, Intent intent) {
        if (((Boolean) ((utz) a.get()).e()).booleanValue()) {
            return true;
        }
        this.I = true;
        m(intent);
        return false;
    }

    @Override // defpackage.wna
    public final boolean i(Intent intent) {
        return ((Boolean) ((utz) a.get()).e()).booleanValue();
    }
}
