package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.R;
import com.google.android.apps.tachyon.contacts.reachability.IReachabilityInviteLinkCallback;
import com.google.android.gms.duokit.GenerateInviteLinkResponse;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abxc extends IReachabilityInviteLinkCallback.Stub {
    final /* synthetic */ acit a;
    final /* synthetic */ boolean b;
    final /* synthetic */ abxd c;

    public abxc(abxd abxdVar, acit acitVar, boolean z) {
        this.a = acitVar;
        this.b = z;
        this.c = abxdVar;
    }

    @Override // com.google.android.apps.tachyon.contacts.reachability.IReachabilityInviteLinkCallback
    public final void onFinished(Map map) {
        int i;
        boolean z = this.b;
        if (z) {
            i = 16;
        } else {
            i = 15;
        }
        acit acitVar = this.a;
        abxd abxdVar = this.c;
        if (map != null && !map.isEmpty()) {
            Bundle bundle = (Bundle) map.values().iterator().next();
            GenerateInviteLinkResponse generateInviteLinkResponse = new GenerateInviteLinkResponse();
            if (!bundle.isEmpty() && bundle.containsKey("INVITE_LINK")) {
                String string = bundle.getString("INVITE_LINK");
                abhg.m(string);
                generateInviteLinkResponse.a = string;
                generateInviteLinkResponse.b = abxdVar.a.getString(R.string.generate_invite_link_default_message);
                abxdVar.b.e(z);
                acitVar.b(generateInviteLinkResponse);
                return;
            }
            abxdVar.b.h(i);
            acitVar.a(new IllegalStateException("Result bundle is empty or does not contain invite link."));
            return;
        }
        abxdVar.b.h(i);
        acitVar.a(new IllegalStateException("Received null or empty result from Duo Reachability Service."));
    }
}
