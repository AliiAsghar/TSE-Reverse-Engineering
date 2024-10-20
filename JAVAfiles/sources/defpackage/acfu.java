package defpackage;

import com.google.android.gms.people.contactssync.internal.AbstractContactsSyncServiceCallbacks;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acfu extends AbstractContactsSyncServiceCallbacks {
    final /* synthetic */ absy a;

    public acfu(absy absyVar) {
        this.a = absyVar;
    }

    @Override // com.google.android.gms.people.contactssync.internal.AbstractContactsSyncServiceCallbacks, com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
    public final void onDeviceContactsSyncSettingChanged() {
        this.a.b(new acft(0));
    }
}
