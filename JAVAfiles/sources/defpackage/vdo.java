package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.messaging.wearable.action.RequestMoreMessagesAction;
import com.google.android.gms.constellation.GetIidTokenResponse;
import com.google.android.gms.gmscompliance.ui.UncertifiedDeviceActivity;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;
import j$.util.Optional;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vdo implements acim {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ vdo(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, acim] */
    @Override // defpackage.acim
    public final void e(Object obj) {
        amui amuiVar;
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        Object obj2 = ((aojh) obj).a;
                        Object obj3 = this.a;
                        if (obj3 != null) {
                            if (((String) obj2).equals(((aohb) obj3).b)) {
                                return;
                            }
                        }
                        Iterator it = ((FirebaseInstanceId) this.b).f.iterator();
                        while (it.hasNext()) {
                            ((FirebaseMessaging) ((asqc) it.next()).a).d((String) obj2);
                        }
                        return;
                    }
                    Object obj4 = this.a;
                    aktr g = aktr.g();
                    aktr.e((aktr) obj4);
                    try {
                        this.b.e(obj);
                        return;
                    } finally {
                        aktr.e(g);
                    }
                }
                RequestMoreMessagesAction requestMoreMessagesAction = (RequestMoreMessagesAction) this.b;
                ((mbl) requestMoreMessagesAction.b.b.b()).e("Bugle.Wear.Rpc.Outgoing.Count", ((Integer) ywf.a.getOrDefault("/bugle/rpc/more_messages/", 0)).intValue());
                ywh ywhVar = (ywh) requestMoreMessagesAction.c.b();
                int intValue = ((Integer) obj).intValue();
                Object obj5 = this.a;
                obj5.getClass();
                if (!ywhVar.b()) {
                    return;
                }
                if (intValue >= 0) {
                    amuiVar = ywh.b;
                } else {
                    amuiVar = ywh.c;
                }
                ywh.d(ywhVar, 2, "/bugle/rpc/more_messages/", (String) obj5, amuiVar);
                return;
            }
            boolean a = ((abzt) obj).a();
            Object obj6 = this.b;
            if (a) {
                uxe uxeVar = (uxe) obj6;
                ((mbl) uxeVar.c.b()).e("Bugle.IPCompliance.EnforcementResult.Counts", 1);
                Intent intent = new Intent(uxeVar.b, (Class<?>) UncertifiedDeviceActivity.class);
                TextUtils.isEmpty(null);
                if (!TextUtils.isEmpty(null)) {
                    intent = intent.putExtra("customBodyText", (String) null);
                }
                intent.putExtra("overrideNavBarColor", false);
                intent.setFlags(268468224);
                uxeVar.b.startActivity(intent);
            } else {
                ((mbl) ((uxe) obj6).c.b()).e("Bugle.IPCompliance.EnforcementResult.Counts", 2);
            }
            ((mgv) ((uxe) obj6).d.b()).h((ahqq) this.a, mgv.F);
            return;
        }
        String str = ((GetIidTokenResponse) obj).a;
        xyo a2 = vdp.a.a();
        a2.H("C11N token request succeeded.");
        a2.z("token", str);
        a2.q();
        ((vdp) this.a).e.c("Bugle.Constellation.IIDToken.Request.Succeeded");
        ((dtq) this.b).b(Optional.ofNullable(str));
    }

    public /* synthetic */ vdo(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
