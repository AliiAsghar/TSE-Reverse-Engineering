package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.util.common.RcsIntents;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class adly {
    public final adek a;
    private final Context b;
    private final adtn c;
    private final adnk d;
    private final adnv e;
    private final armf f;
    private final armf g;
    private final armf h;
    private final armf i;
    private final acnz j;

    public adly(Context context, adek adekVar, acnz acnzVar, adtn adtnVar, adnk adnkVar, adnv adnvVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        this.b = context;
        this.a = adekVar;
        this.j = acnzVar;
        this.c = adtnVar;
        this.d = adnkVar;
        this.e = adnvVar;
        this.f = armfVar;
        this.g = armfVar2;
        this.h = armfVar3;
        this.i = armfVar4;
    }

    public final Optional a(String str) {
        if (((acxv) this.g.b()).a()) {
            return ((aday) this.i.b()).y(str);
        }
        return adnu.a().c(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        boolean z;
        boolean z2;
        String r;
        Optional c;
        Optional ofNullable;
        boolean z3;
        String c2;
        advr.k("RcsAvailabilityManager: Calculating Rcs Availability", new Object[0]);
        if (!Build.FINGERPRINT.startsWith("robolectric")) {
            agkx.R();
        }
        ArrayList arrayList = new ArrayList();
        if (!((Boolean) acpq.E().v().a()).booleanValue()) {
            arrayList.add(amwt.DISABLED_VIA_FLAGS);
        }
        if (!this.d.C()) {
            arrayList.add(amwt.DISABLED_NOT_DEFAULT_SMS_APP);
        }
        try {
            z = this.d.b.l("com.google.android.ims.provisioning.engine.bugle_has_required_permission", false, "BuglePermissionChecker");
        } catch (adux e) {
            advr.j(e, adnk.a, "Error while retrieving minimum required RCS permissions from Bugle", new Object[0]);
            z = false;
        }
        advr.l(adnk.a, "Bugle has minimum required RCS permissions: %s", Boolean.valueOf(z));
        if (!z) {
            arrayList.add(amwt.DISABLED_NO_PERMISSIONS);
        }
        adek adekVar = this.a;
        if (!((adtl) adekVar.c).l((Context) adekVar.a)) {
            arrayList.add(amwt.DISABLED_SIM_ABSENT);
        }
        if (!((wih) this.f.b()).o()) {
            arrayList.add(amwt.DISABLED_FROM_PREFERENCES);
        }
        if (!this.e.h() && !this.a.b()) {
            arrayList.add(amwt.DISABLED_VIA_GSERVICES);
        }
        if (((acxv) this.g.b()).a()) {
            z2 = ((aday) this.h.b()).j(this.c.l()).getBoolean("provisioning_engine_has_term_of_service_key", false);
        } else {
            adnu.a();
            z2 = adnu.e(this.b, this.c.l()).getBoolean("provisioning_engine_has_term_of_service_key", false);
        }
        if (z2) {
            arrayList.add(amwt.CARRIER_TERMS_AND_CONDITIONS_ACCEPTANCE_PENDING);
        }
        if (!this.a.b()) {
            arrayList.add(amwt.CARRIER_SETUP_PENDING);
        }
        adtn adtnVar = this.c;
        adnk adnkVar = this.d;
        String l = adtnVar.l();
        Configuration f = adnkVar.f(l);
        if (f.mConfigState == 0 && this.d.z(l)) {
            f.r();
            advr.k("Config migration update to ACCEPTED from Configuration terms and conditions", new Object[0]);
            this.d.u(l, f);
        }
        if (f.mConfigState != 1) {
            advr.k("Config state is not ACCEPTED, provisioning still in progress", new Object[0]);
            arrayList.add(amwt.CARRIER_SETUP_PENDING);
        }
        if (!f.mServicesConfiguration.mChatAuth) {
            advr.c("User is not authorised to send chat messages.", new Object[0]);
            arrayList.add(amwt.DISABLED_VIA_RCS_CONFIG_CHAT_AUTH);
        }
        if (arrayList.isEmpty()) {
            arrayList.add(amwt.AVAILABLE);
        }
        amwt amwtVar = (amwt) alzz.aN(arrayList, amwt.BUGLE_LOADING_AVAILABILITY_IN_PROGRESS);
        adtn adtnVar2 = this.c;
        armf armfVar = this.g;
        String l2 = adtnVar2.l();
        if (((acxv) armfVar.b()).a()) {
            r = ((aday) this.h.b()).o(l2);
            c = ((aday) this.i.b()).y(l2);
            ofNullable = Optional.ofNullable((String) ((AtomicReference) ((aday) this.i.b()).b).get());
        } else {
            Context context = this.b;
            adnu.a();
            r = adnu.r(context, l2);
            c = adnu.a().c(l2);
            ofNullable = Optional.ofNullable((String) adnu.a().b.get());
        }
        if (!ofNullable.isEmpty() && l2.equals(ofNullable.get())) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!c.isEmpty() && amwtVar == ((adjl) c.get()).a && !z3) {
            advr.k("RcsAvailabilityManager: Rcs Availability still %s", ((adjl) c.get()).a());
            return;
        }
        adjl adjlVar = new adjl(amwtVar);
        if (((acxv) this.g.b()).a()) {
            aday adayVar = (aday) this.i.b();
            l2.getClass();
            ((ConcurrentHashMap) adayVar.a).put(l2, adjlVar);
            ((AtomicReference) adayVar.b).set(l2);
        } else {
            adnu a = adnu.a();
            a.a.put(l2, adjlVar);
            a.b.set(l2);
        }
        advr.k("RcsAvailabilityManager: Updating Rcs Availability to %s, sim id changed: %b", adjlVar.a(), Boolean.valueOf(z3));
        acnz acnzVar = this.j;
        Context context2 = this.b;
        adnv adnvVar = this.e;
        int i = adnvVar.i();
        String str = (String) adnvVar.c().orElse("");
        String str2 = (String) Optional.ofNullable(r).orElse("");
        adiw adiwVar = new adiw(l2);
        aozy createBuilder = apik.a.createBuilder();
        aozy createBuilder2 = apii.a.createBuilder();
        int j = appn.j(amwtVar.E);
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar = createBuilder2.b;
        apii apiiVar = (apii) apagVar;
        int i2 = j - 1;
        if (j != 0) {
            apiiVar.c = i2;
            apiiVar.b |= 1;
            String ag = albo.ag(str);
            if (!apagVar.isMutable()) {
                createBuilder2.u();
            }
            apag apagVar2 = createBuilder2.b;
            apii apiiVar2 = (apii) apagVar2;
            apiiVar2.b |= 8;
            apiiVar2.f = ag;
            if (!apagVar2.isMutable()) {
                createBuilder2.u();
            }
            apag apagVar3 = createBuilder2.b;
            apii apiiVar3 = (apii) apagVar3;
            apiiVar3.e = i - 1;
            apiiVar3.b |= 4;
            if (!apagVar3.isMutable()) {
                createBuilder2.u();
            }
            apii apiiVar4 = (apii) createBuilder2.b;
            apiiVar4.d = 1;
            apiiVar4.b |= 2;
            amva a2 = acnzVar.b.a(adiwVar);
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apii apiiVar5 = (apii) createBuilder2.b;
            a2.getClass();
            apiiVar5.g = a2;
            apiiVar5.b |= 16;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apik apikVar = (apik) createBuilder.b;
            apii apiiVar6 = (apii) createBuilder2.s();
            apiiVar6.getClass();
            apikVar.c = apiiVar6;
            apikVar.b = 1;
            apik apikVar2 = (apik) createBuilder.s();
            aozy createBuilder3 = apjm.a.createBuilder();
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            apjm apjmVar = (apjm) createBuilder3.b;
            apikVar2.getClass();
            apjmVar.c = apikVar2;
            apjmVar.b = 3;
            acnzVar.w(context2, (apjm) createBuilder3.s(), str2);
            Bundle bundle = new Bundle();
            bundle.putInt("com.google.android.ims.provisioning.rcs.availability.update.key", adjlVar.a.E);
            bundle.putString("com.google.android.ims.provisioning.sim.id.key", l2);
            adjk.c(this.b, 12, bundle);
            Context context3 = this.b;
            Intent intent = new Intent(RcsIntents.ACTION_PROVISIONING_EVENT);
            intent.putExtra("com.google.android.ims.provisioning.engine.provisioning_event_code_key", 12);
            intent.putExtra("com.google.android.ims.provisioning.engine.provisioning_event_bundle_key", bundle);
            String b = adjk.b(12);
            if (Objects.isNull(bundle)) {
                c2 = "no extra data";
            } else {
                c2 = advq.GENERIC.c(bundle);
            }
            advr.k("Sending ProvisioningEvent Internal %s, %s", b, c2);
            intent.setPackage(context3.getPackageName());
            context3.sendBroadcast(intent);
            return;
        }
        throw null;
    }
}
