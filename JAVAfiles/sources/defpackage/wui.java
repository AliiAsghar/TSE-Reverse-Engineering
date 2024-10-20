package defpackage;

import com.google.android.rcs.client.contacts.ContactsService;
import com.google.android.rcs.client.events.EventService;
import com.google.android.rcs.client.filetransfer.FileTransferService;
import com.google.android.rcs.client.ims.ImsConnectionTrackerService;
import com.google.android.rcs.client.locationsharing.LocationSharingService;
import com.google.android.rcs.client.messaging.RcsMessagingService;
import com.google.android.rcs.client.profile.RcsProfileService;
import java.util.function.BiFunction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface wui {
    ContactsService a();

    EventService b();

    FileTransferService c();

    ImsConnectionTrackerService d();

    LocationSharingService e();

    RcsMessagingService f();

    RcsProfileService g();

    BiFunction h();

    BiFunction i();

    BiFunction j();

    BiFunction k();

    void l();

    void m();

    void n(ajoa ajoaVar);

    RcsMessagingService o();
}
