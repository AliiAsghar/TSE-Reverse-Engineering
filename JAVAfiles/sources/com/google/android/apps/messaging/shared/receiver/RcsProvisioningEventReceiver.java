package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.ims.util.common.RcsIntents;
import defpackage.acun;
import defpackage.adiw;
import defpackage.adjk;
import defpackage.agkx;
import defpackage.aiut;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.akto;
import defpackage.alvg;
import defpackage.alvi;
import defpackage.amhx;
import defpackage.amwt;
import defpackage.aozs;
import defpackage.apag;
import defpackage.apba;
import defpackage.apwt;
import defpackage.armf;
import defpackage.lpg;
import defpackage.min;
import defpackage.pcl;
import defpackage.uql;
import defpackage.vqu;
import defpackage.vrn;
import defpackage.wfh;
import defpackage.whs;
import defpackage.wlq;
import defpackage.xyo;
import defpackage.xyt;
import defpackage.xze;
import defpackage.yjf;
import defpackage.ykw;
import defpackage.zxy;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RcsProvisioningEventReceiver extends wlq {
    private static final xze l = xze.g("BugleRcsProvisioning", "RcsProvisioningEventReceiver");
    private static final alvi m = alvi.m("com/google/android/apps/messaging/shared/receiver/RcsProvisioningEventReceiver");
    public armf a;
    public armf b;
    public armf c;
    public armf d;
    public armf e;
    public apwt f;
    public armf g;
    public armf h;
    public armf i;
    public armf j;
    public armf k;

    @Override // defpackage.wng
    public final akrc a() {
        return ((aksr) this.g.b()).b("RcsProvisioningEventReceiver Receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return "Bugle.Broadcast.ProvisioningEvent.Latency";
    }

    @Override // defpackage.wng
    protected final int e() {
        return 4;
    }

    @Override // defpackage.wna
    public final String f() {
        return "Bugle.Broadcast.ForegroundService.ProvisioningEvent.Latency";
    }

    /* JADX WARN: Type inference failed for: r10v22, types: [armf, java.lang.Object] */
    @Override // defpackage.wna
    public final void g(Context context, Intent intent) {
        byte[] bArr;
        amhx d;
        if (!((vqu) this.e.b()).G(intent)) {
            l.q("ProvisioningEvent not from an authorized source.");
            return;
        }
        if ("com.google.android.ims.provisioning.engine.provisioningEventAction".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("com.google.android.ims.provisioning.engine.provisioning_event_code_key", -1);
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.ims.provisioning.engine.provisioning_event_bundle_key");
            xze xzeVar = l;
            xyo c = xzeVar.c();
            c.z("Received ProvisioningEvent", adjk.a(intExtra));
            c.q();
            int i = 1;
            if (intExtra != 0) {
                if (intExtra != 3) {
                    if (intExtra != 5) {
                        if (intExtra != 15) {
                            if (intExtra != 18) {
                                int i2 = 0;
                                if (intExtra != 22) {
                                    if (intExtra != 24) {
                                        if (intExtra != 8) {
                                            if (intExtra != 9) {
                                                switch (intExtra) {
                                                    case 11:
                                                        if (bundleExtra == null) {
                                                            xzeVar.m("No extras for ProvisioningEvent.PROVISIONING_EVENT_UPDATE_PROVISIONING_STATUS");
                                                            return;
                                                        }
                                                        int i3 = new int[]{1, 2, 3, 4}[bundleExtra.getInt("com.google.android.ims.provisioning.engine.update_provisioning_status_key")];
                                                        zxy zxyVar = (zxy) this.b.b();
                                                        if (i3 != 0) {
                                                            i = i3;
                                                            i2 = i;
                                                        }
                                                        ((ykw) zxyVar.b).j("rcs_provisioning_status_pev2", i - 1);
                                                        if (i2 == 3 || i2 == 4) {
                                                            lpg lpgVar = (lpg) this.c.b();
                                                            long longValue = agkx.W().longValue();
                                                            if (!lpgVar.g().isPresent()) {
                                                                ((ykw) lpgVar.a).k("first_rcs_eligibility_time", longValue);
                                                            }
                                                        }
                                                        if (i2 == 4) {
                                                            lpg lpgVar2 = (lpg) this.c.b();
                                                            long longValue2 = agkx.W().longValue();
                                                            if (!lpgVar2.e().isPresent()) {
                                                                ((ykw) lpgVar2.a).k("first_time_rcs_provisioned_millis", longValue2);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    case 12:
                                                        if (bundleExtra == null) {
                                                            xzeVar.m("No extras for ProvisioningEvent.PROVISIONING_EVENT_RCS_AVAILABILITY_UPDATED");
                                                            return;
                                                        }
                                                        amwt b = amwt.b(bundleExtra.getInt("com.google.android.ims.provisioning.rcs.availability.update.key"));
                                                        if (bundleExtra.getString("com.google.android.ims.provisioning.sim.id.key") == null) {
                                                            xzeVar.m("simId is not set for ProvisioningEvent.PROVISIONING_EVENT_RCS_AVAILABILITY_UPDATED");
                                                            return;
                                                        }
                                                        Optional.ofNullable(bundleExtra.getString("com.google.android.ims.provisioning.sim.iccid.key"));
                                                        xyo c2 = xzeVar.c();
                                                        c2.z("Bugle receives rcs availability update to", b);
                                                        c2.q();
                                                        if (((yjf) this.i.b()).i()) {
                                                            min minVar = (min) this.f.b();
                                                            xyo d2 = min.a.d();
                                                            d2.z("Availability updated", b);
                                                            d2.q();
                                                            synchronized (minVar) {
                                                                if (!minVar.c(b)) {
                                                                    d = minVar.d(2, b);
                                                                } else if (minVar.e == 4) {
                                                                    d = minVar.d(4, b);
                                                                } else {
                                                                    d = minVar.d(3, b);
                                                                }
                                                            }
                                                            if (d != null) {
                                                                minVar.b(d);
                                                            }
                                                        }
                                                        ((vrn) ((xyt) this.d.b()).a()).y();
                                                        return;
                                                    case 13:
                                                        aiut.e(akto.j(new uql(this, 16)));
                                                        return;
                                                    default:
                                                        xzeVar.m("Unknown provisioning event " + String.valueOf(intent.getSerializableExtra("com.google.android.ims.provisioning.engine.provisioning_event_code_key")) + " possible version mismatch?");
                                                        return;
                                                }
                                            }
                                            if (bundleExtra != null) {
                                                bArr = bundleExtra.getByteArray("com.google.android.ims.provisioning.enginge.provisioning_alert_server_message");
                                            } else {
                                                bArr = null;
                                            }
                                            if (bArr != null) {
                                                try {
                                                    acun acunVar = (acun) apag.parseFrom(acun.a, bArr);
                                                    if (((pcl) this.k.b()).a()) {
                                                        String string = bundleExtra.getString("com.google.android.ims.provisioning.sim.id.key");
                                                        if (string == null) {
                                                            ((alvg) ((alvg) m.h()).h("com/google/android/apps/messaging/shared/receiver/RcsProvisioningEventReceiver", "handleProvisioningEvent", 170, "RcsProvisioningEventReceiver.java")).q("simId is not set for ProvisioningEvent.PROVISIONING_EVENT_TERMS_AND_CONDITIONS");
                                                            return;
                                                        }
                                                        ((whs) this.j.b()).g(new adiw(string), acunVar);
                                                    } else {
                                                        ((vqu) this.e.b()).B(acunVar);
                                                    }
                                                    context.sendBroadcast(new Intent(RcsIntents.ACTION_NOTIFY_RECEIVED_CARRIER_TOS_REQUEST));
                                                    return;
                                                } catch (apba e) {
                                                    xyo b2 = l.b();
                                                    b2.H("Unable to parse Terms and Conditions BugleServerMessage from PEv2, event will be ignored");
                                                    b2.r(e);
                                                    return;
                                                }
                                            }
                                            xzeVar.m("BugleServerMessage was not set for ProvisioningEvent.PROVISIONING_EVENT_TERMS_AND_CONDITIONS, can not set Terms and Conditions message.");
                                            return;
                                        }
                                    } else {
                                        ((ykw) this.a.b()).h("should_show_rcs_default_on_prompt", true);
                                        context.sendBroadcast(new Intent(RcsIntents.ACTION_NOTIFY_RECEIVED_LEGAL_FYI_REQUEST));
                                        return;
                                    }
                                } else {
                                    ykw ykwVar = (ykw) ((wfh) this.h.b()).a.b();
                                    ykwVar.n("rcs_tos_state");
                                    ykwVar.h("fast_track_prompt_dismissed", false);
                                    ykwVar.h("did_show_google_tos_prompt", false);
                                    ((ykw) this.a.b()).h("should_show_google_tos_prompt", true);
                                    context.sendBroadcast(new Intent(RcsIntents.ACTION_NOTIFY_RECEIVED_GOOGLE_TOS_REQUEST));
                                    return;
                                }
                            } else if (bundleExtra == null) {
                                xzeVar.m("No extras for ProvisioningEvent.PROVISIONING_EVENT_SESSION_ID");
                                return;
                            } else {
                                ((ykw) this.a.b()).l("provisioning_session_id", bundleExtra.getString("com.google.android.ims.provisioning.session.id.key"));
                                return;
                            }
                        } else {
                            ((vqu) this.e.b()).u();
                            return;
                        }
                    } else {
                        ((ykw) this.a.b()).h("should_show_google_tos_prompt", true);
                        context.sendBroadcast(new Intent(RcsIntents.ACTION_NOTIFY_RECEIVED_GOOGLE_TOS_REQUEST));
                        return;
                    }
                } else {
                    if (bundleExtra == null) {
                        xzeVar.m("No extras for ProvisioningEvent.PROVISIONING_WELCOME_MESSAGE_KEY");
                        return;
                    }
                    byte[] byteArray = bundleExtra.getByteArray("com.google.android.ims.provisioning.enginge.welcome_message");
                    if (byteArray == null) {
                        xzeVar.m("Message is not set for ProvisioningEvent.PROVISIONING_WELCOME_MESSAGE_KEY");
                        return;
                    }
                    try {
                        acun acunVar2 = (acun) apag.parseFrom(acun.a, byteArray, aozs.a());
                        String string2 = bundleExtra.getString("com.google.android.ims.provisioning.sim.id.key");
                        if (string2 == null) {
                            ((alvg) ((alvg) m.h()).h("com/google/android/apps/messaging/shared/receiver/RcsProvisioningEventReceiver", "handleProvisioningEvent", 207, "RcsProvisioningEventReceiver.java")).q("simId is not set for ProvisioningEvent.PROVISIONING_EVENT_WELCOME_MESSAGE");
                            return;
                        } else {
                            ((whs) this.j.b()).h(new adiw(string2), acunVar2);
                            context.sendBroadcast(new Intent(RcsIntents.ACTION_NOTIFY_RECEIVED_PROVISIONING_WELCOME_MESSAGE));
                            return;
                        }
                    } catch (apba e2) {
                        l.n("Unable to parse Welcome Message", e2);
                        return;
                    }
                }
            }
            ((ykw) this.a.b()).h("should_show_rcs_promo", true);
            context.sendBroadcast(new Intent(RcsIntents.ACTION_NOTIFY_RECEIVED_RCS_PROMO_REQUEST));
        }
    }

    @Override // defpackage.wna
    public final boolean i(Intent intent) {
        return true;
    }
}
