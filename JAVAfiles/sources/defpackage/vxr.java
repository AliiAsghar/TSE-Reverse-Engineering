package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vxr {
    public static final alwo a = alwo.o("BugleGroupManagement");
    public final wzs b;
    public final vbu c;
    public final vxq d;
    public final mbl e;
    public final armf f;

    public vxr(wzs wzsVar, vbu vbuVar, vxq vxqVar, mbl mblVar, armf armfVar) {
        this.b = wzsVar;
        this.c = vbuVar;
        this.d = vxqVar;
        this.e = mblVar;
        this.f = armfVar;
    }

    public final vxo a(xhv xhvVar) {
        String G = this.b.G(xhvVar);
        if (albo.ah(G)) {
            alwl alwlVar = (alwl) a.i();
            alwlVar.X(ydl.r, xhvVar);
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/rcs/groups/telephony/RcsGroupTelephonyRecipientsManager", "getRcsGroupTelephonyData", 80, "RcsGroupTelephonyRecipientsManager.java")).q("Cannot find recipient IDs for provided thread ID.");
            xou xouVar = new xou(null, null, null);
            xouVar.h(vxn.NO_RECIPIENT_IDS_FOR_THREAD_ID);
            return xouVar.g();
        }
        G.getClass();
        if (TextUtils.split(G, " ").length != 1) {
            alwl alwlVar2 = (alwl) a.i();
            alwlVar2.X(ydl.r, xhvVar);
            ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/rcs/groups/telephony/RcsGroupTelephonyRecipientsManager", "getRcsGroupTelephonyData", 91, "RcsGroupTelephonyRecipientsManager.java")).q("RCS group thread should only have a single recipient ID.");
            xou xouVar2 = new xou(null, null, null);
            xouVar2.h(vxn.MULTIPLE_RECIPIENT_IDS_RETURNED);
            return xouVar2.g();
        }
        List I = this.b.I(G);
        if (I.size() != 1) {
            alwl alwlVar3 = (alwl) a.i();
            alwlVar3.X(ydl.r, xhvVar);
            ((alwl) alwlVar3.h("com/google/android/apps/messaging/shared/rcs/groups/telephony/RcsGroupTelephonyRecipientsManager", "getRcsGroupTelephonyData", 103, "RcsGroupTelephonyRecipientsManager.java")).q("RCS group thread should only have a single recipient.");
            xou xouVar3 = new xou(null, null, null);
            xouVar3.h(vxn.MULTIPLE_RECIPIENTS_PARSED);
            return xouVar3.g();
        }
        vxm a2 = this.d.a(albo.ag(((msh) I.get(0)).h(((Boolean) new msn(18).get()).booleanValue())));
        if (a2 == null) {
            xou xouVar4 = new xou(null, null, null);
            xouVar4.h(vxn.INVALID_RECIPIENT_ADDRESS_FORMAT);
            return xouVar4.g();
        }
        xou xouVar5 = new xou(null, null, null);
        xouVar5.b = Optional.of(a2);
        return xouVar5.g();
    }
}
