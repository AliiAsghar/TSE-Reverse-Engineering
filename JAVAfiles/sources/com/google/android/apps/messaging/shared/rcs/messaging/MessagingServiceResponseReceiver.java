package com.google.android.apps.messaging.shared.rcs.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.aktp;
import defpackage.akul;
import defpackage.albo;
import defpackage.armf;
import defpackage.tul;
import defpackage.vqu;
import defpackage.vyr;
import defpackage.vyz;
import defpackage.xnv;
import defpackage.xyo;
import defpackage.xzb;
import defpackage.xze;
import j$.time.Instant;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MessagingServiceResponseReceiver extends vyr {
    private static final xze g = xze.g("BugleRcs", "MessagingServiceResponseReceiver");
    public armf a;
    public armf b;
    public armf c;
    public armf d;
    public armf e;
    public armf f;

    @Override // defpackage.wng
    public final akrc a() {
        return ((aksr) this.a.b()).b("RCS Engine MessagingService receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return "Bugle.Broadcast.MessagingServiceResponseReceiver.Latency";
    }

    @Override // defpackage.wng
    protected final int e() {
        return 18;
    }

    @Override // defpackage.wna
    public final String f() {
        return "Bugle.Broadcast.ForegroundService.MessagingServiceResponseReceiver.Latency";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wna
    public final String fB() {
        return "Bugle.Broadcast.Sequencer.MessagingServiceResponseReceiver.Latency";
    }

    @Override // defpackage.wna
    protected final boolean h(Context context, Intent intent) {
        return ((vqu) this.b.b()).G(intent);
    }

    @Override // defpackage.wna
    public final boolean i(Intent intent) {
        return true;
    }

    @Override // defpackage.wna
    public final akul j(Context context, Intent intent) {
        akul ag;
        String ag2 = albo.ag(intent.getAction());
        xze xzeVar = g;
        xyo c = xzeVar.c();
        c.H("Intent received");
        c.z(GroupManagementRequest.ACTION_TAG, ag2);
        c.q();
        armf armfVar = (armf) ((Map) this.c.b()).get(ag2);
        if (armfVar == null) {
            xyo b = xzeVar.b();
            b.H("Ignoring intent with unknown action");
            b.z(GroupManagementRequest.ACTION_TAG, ag2);
            b.q();
            return aktp.ag(null);
        }
        vyz vyzVar = (vyz) armfVar.b();
        Instant ofEpochMilli = Instant.ofEpochMilli(((xnv) this.d.b()).a());
        try {
            ag = vyzVar.a(intent);
        } catch (IllegalArgumentException e) {
            xyo b2 = g.b();
            b2.H("Ignoring intent with invalid data");
            b2.z(GroupManagementRequest.ACTION_TAG, intent.getAction());
            b2.q();
            xzb.n("BugleRcs", Log.getStackTraceString(e));
            ag = aktp.ag(null);
        }
        return ag.h(new tul(this, ofEpochMilli, vyzVar, 17), (Executor) this.f.b());
    }
}
