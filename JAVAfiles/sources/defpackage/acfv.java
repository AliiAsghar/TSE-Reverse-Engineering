package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.contactssync.internal.AbstractContactsSyncServiceCallbacks;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acfv extends AbstractContactsSyncServiceCallbacks {
    final /* synthetic */ acit a;

    public acfv(acit acitVar) {
        this.a = acitVar;
    }

    @Override // com.google.android.gms.people.contactssync.internal.AbstractContactsSyncServiceCallbacks, com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
    public final void onStatus(Status status) {
        abhb.e(status, true, this.a);
    }
}
