package defpackage;

import android.util.Log;
import com.google.android.apps.messaging.wearable.action.RequestMoreMessagesAction;
import com.google.android.gms.duokit.GetApiAvailabilityResponse;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vdn implements acil {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ vdn(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v39, types: [acil, java.lang.Object] */
    @Override // defpackage.acil
    public final void d(Exception exc) {
        switch (this.c) {
            case 0:
                xyo a = vdp.a.a();
                a.H("C11N token request failed. Returning empty optional.");
                a.r(exc);
                ((vdp) this.a).e.c("Bugle.Constellation.IIDToken.Request.Failed");
                ((dtq) this.b).b(Optional.empty());
                return;
            case 1:
                uxe uxeVar = (uxe) this.b;
                ((mbl) uxeVar.c.b()).e("Bugle.IPCompliance.EnforcementResult.Counts", 3);
                ((mgv) uxeVar.d.b()).h((ahqq) this.a, mgv.F);
                uxe.a.q("GmsDeviceCompliance API threw an exception.");
                return;
            case 2:
                alwl alwlVar = (alwl) ((alwl) RequestMoreMessagesAction.a.i()).g(exc);
                alwlVar.X(ydl.M, "RequestMoreMessagesAction");
                alwlVar.X(ywv.c, "/bugle/rpc/more_messages/");
                ((alwl) alwlVar.h("com/google/android/apps/messaging/wearable/action/RequestMoreMessagesAction", "doBackgroundWork", 197, "RequestMoreMessagesAction.java")).q("Failed to send message to path");
                ywh ywhVar = (ywh) ((RequestMoreMessagesAction) this.b).c.b();
                Object obj = this.a;
                obj.getClass();
                if (!ywhVar.b()) {
                    return;
                }
                ywh.d(ywhVar, 2, "/bugle/rpc/more_messages/", (String) obj, ywhVar.a(exc));
                return;
            case 3:
                int i = abwo.b;
                ((acak) this.b).j(3);
                GetApiAvailabilityResponse getApiAvailabilityResponse = new GetApiAvailabilityResponse();
                getApiAvailabilityResponse.a = 1;
                ((acit) this.a).b(getApiAvailabilityResponse);
                return;
            case 4:
                Log.e("DuoStateFetcher", "Error getting duo registered.", exc);
                Object obj2 = this.b;
                ((abwt) obj2).initCause(exc);
                ((acit) this.a).a((Exception) obj2);
                return;
            case 5:
                Object obj3 = this.b;
                ((abwt) obj3).initCause(exc);
                ((acit) this.a).a((Exception) obj3);
                return;
            case 6:
                ((acak) this.b).h(5);
                ((acit) this.a).a(new IllegalStateException("Failed to get Duo state."));
                return;
            case 7:
                ((acak) this.b).h(12);
                ((acit) this.a).a(new IllegalStateException("Failed to get Duo state."));
                return;
            default:
                Object obj4 = this.a;
                aktr g = aktr.g();
                aktr.e((aktr) obj4);
                try {
                    this.b.d(exc);
                    return;
                } finally {
                    aktr.e(g);
                }
        }
    }

    public /* synthetic */ vdn(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
