package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.contactssync.internal.AbstractContactsSyncServiceCallbacks;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acfw extends AbstractContactsSyncServiceCallbacks {
    final /* synthetic */ Context a;
    final /* synthetic */ acit b;
    private final WeakReference c;

    public acfw(Context context, acit acitVar) {
        this.a = context;
        this.b = acitVar;
        this.c = new WeakReference(context);
    }

    @Override // com.google.android.gms.people.contactssync.internal.AbstractContactsSyncServiceCallbacks, com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
    public final void onGetDeviceContactsSyncSettingAction(Status status, String str) {
        if (status.c()) {
            Intent intent = new Intent(str);
            Bundle bundle = new Bundle();
            bundle.putString("ApplicationId", this.a.getPackageName());
            intent.putExtras(bundle);
            Context context = (Context) this.c.get();
            if (context != null) {
                context.startActivity(intent);
            }
            abhb.d(status, null, this.b);
        }
    }
}
