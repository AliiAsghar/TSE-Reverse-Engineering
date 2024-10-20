package defpackage;

import android.content.Context;
import com.google.android.rcs.client.contacts.ContactsService;
import com.google.android.rcs.client.events.EventService;
import com.google.android.rcs.client.filetransfer.FileTransferService;
import com.google.android.rcs.client.ims.ImsConnectionTrackerService;
import com.google.android.rcs.client.lifecycle.RcsEngineLifecycleService;
import com.google.android.rcs.client.lifecycle.RcsEngineLifecycleServiceV2;
import com.google.android.rcs.client.locationsharing.LocationSharingService;
import com.google.android.rcs.client.messaging.RcsMessagingService;
import com.google.android.rcs.client.profile.RcsProfileService;
import com.google.android.rcs.client.provisioning.singleregistration.SingleRegistrationVendorImsService;
import j$.util.Optional;
import java.util.function.BiFunction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wuc implements wui {
    private static final alwo a = alwo.o("BugleRcs");
    private final EventService b;
    private final ContactsService c;
    private final FileTransferService d;
    private final LocationSharingService e;
    private final ImsConnectionTrackerService f;
    private final RcsProfileService g;
    private final RcsMessagingService h;
    private final wud i;
    private final xyt j;
    private final SingleRegistrationVendorImsService k;
    private final yjf l;

    public wuc(Context context, agcp agcpVar, wud wudVar, xyt xytVar, armf armfVar, yjf yjfVar, armf armfVar2) {
        EventService p = agcpVar.p(context, wudVar);
        ContactsService contactsService = new ContactsService(context, wudVar, Optional.of((ajnw) armfVar.b()));
        FileTransferService fileTransferService = new FileTransferService(context, wudVar, Optional.of((ajnw) armfVar.b()));
        LocationSharingService locationSharingService = new LocationSharingService(context, wudVar);
        ImsConnectionTrackerService imsConnectionTrackerService = new ImsConnectionTrackerService(context, wudVar, Optional.of((ajnw) armfVar.b()));
        RcsProfileService rcsProfileService = new RcsProfileService(context, wudVar, (ylm) armfVar2.b());
        RcsMessagingService rcsMessagingService = new RcsMessagingService(context, wudVar);
        new RcsEngineLifecycleService(context, wudVar);
        SingleRegistrationVendorImsService singleRegistrationVendorImsService = new SingleRegistrationVendorImsService(context, wudVar);
        new RcsEngineLifecycleServiceV2(context, wudVar);
        Optional.of((ajnw) armfVar.b());
        this.i = wudVar;
        this.j = xytVar;
        this.l = yjfVar;
        this.b = p;
        this.c = contactsService;
        this.d = fileTransferService;
        this.e = locationSharingService;
        this.f = imsConnectionTrackerService;
        this.g = rcsProfileService;
        this.h = rcsMessagingService;
        this.k = singleRegistrationVendorImsService;
    }

    private final void p(ajnv ajnvVar) {
        if (!ajnvVar.isConnected() && ((vrn) this.j.a()).d() == amwt.BUGLE_LOADING_AVAILABILITY_IN_PROGRESS) {
            ((vrn) this.j.a()).o(vrk.NO_HINT);
        }
    }

    @Override // defpackage.wui
    public final ContactsService a() {
        p(this.c);
        return this.c;
    }

    @Override // defpackage.wui
    public final EventService b() {
        p(this.b);
        return this.b;
    }

    @Override // defpackage.wui
    public final FileTransferService c() {
        p(this.d);
        return this.d;
    }

    @Override // defpackage.wui
    public final ImsConnectionTrackerService d() {
        p(this.f);
        return this.f;
    }

    @Override // defpackage.wui
    public final LocationSharingService e() {
        p(this.e);
        return this.e;
    }

    @Override // defpackage.wui
    public final RcsMessagingService f() {
        p(this.h);
        return this.h;
    }

    @Override // defpackage.wui
    public final RcsProfileService g() {
        p(this.g);
        return this.g;
    }

    @Override // defpackage.wui
    public final BiFunction h() {
        return new mle(5);
    }

    @Override // defpackage.wui
    public final BiFunction i() {
        return new mle(6);
    }

    @Override // defpackage.wui
    public final BiFunction j() {
        return new mle(3);
    }

    @Override // defpackage.wui
    public final BiFunction k() {
        return new mle(4);
    }

    @Override // defpackage.wui
    public final void l() {
        int i;
        if (!this.l.i()) {
            alwl alwlVar = (alwl) a.i();
            alwlVar.Z(alwk.FULL);
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/service/BugleRcsServiceFactory", "connect", 218, "BugleRcsServiceFactory.java")).q("Bugle is trying to connect to RCS without READ_PHONE_STATE permission.");
        }
        if (!this.b.isConnected()) {
            this.b.connect();
            i = 1;
        } else {
            i = 0;
        }
        if (!this.c.isConnected()) {
            this.c.connect();
            i++;
        }
        if (!this.d.isConnected()) {
            this.d.connect();
            i++;
        }
        if (!this.e.isConnected()) {
            this.e.connect();
            i++;
        }
        if (!this.f.isConnected()) {
            this.f.connect();
            i++;
        }
        if (!this.g.isConnected()) {
            this.g.connect();
            i++;
        }
        if (!this.h.isConnected()) {
            this.h.connect();
            i++;
        }
        if (aczf.H() && !this.k.isConnected()) {
            this.k.connect();
            i++;
        }
        if (i > 0) {
            xzb.k("BugleRcs", "connecting to %d Rcs Services", Integer.valueOf(i));
        } else {
            xzb.l("BugleRcs", "RCS services already connected");
        }
    }

    @Override // defpackage.wui
    public final void m() {
        this.b.disconnect();
        this.c.disconnect();
        this.d.disconnect();
        this.e.disconnect();
        this.f.disconnect();
        this.g.disconnect();
        this.h.disconnect();
        if (aczf.H()) {
            this.k.disconnect();
        }
        xzb.n("BugleRcs", "disconnecting from all Rcs Services");
    }

    @Override // defpackage.wui
    public final void n(ajoa ajoaVar) {
        this.i.d(ajoaVar);
    }

    @Override // defpackage.wui
    public final RcsMessagingService o() {
        p(this.h);
        return this.h;
    }
}
