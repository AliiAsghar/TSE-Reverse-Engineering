package defpackage;

import android.content.Context;
import com.google.android.ims.rcs.engine.IRcsEngineController;
import com.google.android.ims.rcs.engine.IRcsEngineTemporaryController;
import com.google.android.ims.rcs.singleregistration.ISingleRegistrationVendorImsController;
import com.google.android.ims.rcsservice.businessinfo.IBusinessInfo;
import com.google.android.ims.rcsservice.chatsession.IChatSession;
import com.google.android.ims.rcsservice.contacts.IContactsManagement;
import com.google.android.ims.rcsservice.events.IEvent;
import com.google.android.ims.rcsservice.filetransfer.IFileTransfer;
import com.google.android.ims.rcsservice.ims.IImsConnectionTracker;
import com.google.android.ims.rcsservice.locationsharing.ILocationSharing;
import com.google.android.ims.rcsservice.profile.IRcsProfile;
import com.google.android.ims.rcsservice.signup.ISignup;
import com.google.android.ims.rcsservice.transportcontrol.ITransportControl;
import com.google.android.ims.service.binder.ForwardingBusinessInfoBinder;
import com.google.android.ims.service.binder.ForwardingChatSessionBinder;
import com.google.android.ims.service.binder.ForwardingContactsManagementBinder;
import com.google.android.ims.service.binder.ForwardingFileTransferBinder;
import com.google.android.ims.service.binder.ForwardingIEventBinder;
import com.google.android.ims.service.binder.ForwardingImsConnectionTrackerBinder;
import com.google.android.ims.service.binder.ForwardingLocationSharingBinder;
import com.google.android.ims.service.binder.ForwardingMessagingBinder;
import com.google.android.ims.service.binder.ForwardingRcsEngineControllerBinder;
import com.google.android.ims.service.binder.ForwardingRcsEngineTemporaryControllerBinder;
import com.google.android.ims.service.binder.ForwardingRcsProfileBinder;
import com.google.android.ims.service.binder.ForwardingSignupBinder;
import com.google.android.ims.service.binder.ForwardingSingleRegistrationVendorImsControllerBinder;
import com.google.android.ims.service.binder.ForwardingTransportControlEngine;
import com.google.android.rcs.client.messaging.IMessaging;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adue {
    public static final acyz a = aczd.a(185217001);
    private static volatile adue b;
    private final ConcurrentHashMap c;

    private adue(Context context) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.c = concurrentHashMap;
        concurrentHashMap.put(IEvent.class.getName(), new ForwardingIEventBinder(context));
        concurrentHashMap.put(IImsConnectionTracker.class.getName(), new ForwardingImsConnectionTrackerBinder(context));
        concurrentHashMap.put(IContactsManagement.class.getName(), new ForwardingContactsManagementBinder(context));
        concurrentHashMap.put(IFileTransfer.class.getName(), new ForwardingFileTransferBinder(context));
        concurrentHashMap.put(IChatSession.class.getName(), new ForwardingChatSessionBinder(context));
        concurrentHashMap.put(IRcsProfile.class.getName(), new ForwardingRcsProfileBinder(context));
        concurrentHashMap.put(ISignup.class.getName(), new ForwardingSignupBinder(context));
        concurrentHashMap.put(ILocationSharing.class.getName(), new ForwardingLocationSharingBinder(context));
        concurrentHashMap.put(IBusinessInfo.class.getName(), new ForwardingBusinessInfoBinder(context));
        concurrentHashMap.put(IMessaging.class.getName(), new ForwardingMessagingBinder(context));
        concurrentHashMap.put(ITransportControl.class.getName(), new ForwardingTransportControlEngine(context));
        concurrentHashMap.put(IRcsEngineTemporaryController.class.getName(), new ForwardingRcsEngineTemporaryControllerBinder(context));
        concurrentHashMap.put(ISingleRegistrationVendorImsController.class.getName(), new ForwardingSingleRegistrationVendorImsControllerBinder(context));
        concurrentHashMap.put(IRcsEngineController.class.getName(), new ForwardingRcsEngineControllerBinder(context));
    }

    public static synchronized adue a(Context context) {
        synchronized (adue.class) {
            adue adueVar = b;
            if (adueVar == null) {
                adue adueVar2 = new adue(context);
                b = adueVar2;
                return adueVar2;
            }
            return adueVar;
        }
    }

    public final Optional b(String str) {
        return Optional.ofNullable((adud) this.c.get(str));
    }

    public final void c() {
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            ((adud) it.next()).clear();
        }
    }
}
