package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class wzv implements algk {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ wzv(Collection collection, qqq qqqVar, long j, int i) {
        this.d = i;
        this.b = collection;
        this.c = qqqVar;
        this.a = j;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Collection, java.lang.Object] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        if (this.d != 0) {
            vty vtyVar = (vty) obj;
            if (vtyVar.d.isEmpty()) {
                ((alwl) ((alwl) vtx.a.i()).h("com/google/android/apps/messaging/shared/rcs/groups/invite/GroupSessionStartedHandler", "areValidGroupSessionStartedParameters", 186, "GroupSessionStartedHandler.java")).q("Invalid parameters. RCS group ID not set");
            } else if (vtyVar.e.isEmpty()) {
                ((alwl) ((alwl) vtx.a.i()).h("com/google/android/apps/messaging/shared/rcs/groups/invite/GroupSessionStartedHandler", "areValidGroupSessionStartedParameters", 191, "GroupSessionStartedHandler.java")).q("Invalid parameters. RCS conference URI not set");
            } else {
                long j = this.a;
                Object obj2 = this.c;
                vsi a = vsj.a();
                a.b(false);
                a.h(true);
                a.n(amku.GROUP_SESSION_STARTED_EVENT);
                a.g(false);
                a.p(j);
                a.k(vtyVar.d);
                a.e(vtyVar.f);
                vtx vtxVar = (vtx) obj2;
                ConversationIdType a2 = vtxVar.c.a(a.a());
                if (a2.b()) {
                    alwl alwlVar = (alwl) vtx.a.h();
                    alwlVar.X(ydl.I, vtyVar.d);
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/rcs/groups/invite/GroupSessionStartedHandler", "processPendingWorkItemAsync", 147, "GroupSessionStartedHandler.java")).q("Could not retrieve conversation. Skipping conference URI update.");
                    return upm.d();
                }
                Object obj3 = this.b;
                String str = vtyVar.e;
                d.t(!TextUtils.isEmpty(str), "Calling updateConferenceUri with empty URI");
                sng sngVar = new sng();
                sngVar.aj("updateConferenceUri");
                sngVar.X(new vte(a2, 4));
                sngVar.I(str);
                sngVar.a().e();
                vty vtyVar2 = (vty) obj3;
                if ((vtyVar2.b & 1) != 0) {
                    vtu vtuVar = vtyVar2.g;
                    if (vtuVar == null) {
                        vtuVar = vtu.a;
                    }
                    vtxVar.d.e("GroupSessionStartedHandler#updateRcsGroupCapabilities", new ung(a2, vtuVar, 17));
                }
                return upm.b();
            }
            alvw m = vtx.a.m();
            m.X(ydl.G, Long.valueOf(vtyVar.c));
            ((alwl) m.h("com/google/android/apps/messaging/shared/rcs/groups/invite/GroupSessionStartedHandler", "processPendingWorkItemAsync", 122, "GroupSessionStartedHandler.java")).q("Invalid GroupSessionStartedParameters. Ignoring incoming RCS group invitation. This is probably because this conversation is actually a one to one conversation and this handler is scheduled to support legacy CS.apk clients.");
            return upm.b();
        }
        long j2 = this.a;
        Stream stream = Collection.EL.stream(this.b);
        Object obj4 = this.c;
        Stream map = stream.map(new wki(obj4, 13));
        int i = alog.d;
        ((alwl) ((alwl) wzw.e.g()).h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "logGetOrCreateThreadIdToFlogger", 1031, "TelephonyManagerInterfaceImpl.java")).J("Telephony.getOrCreateThreadId returned thread %s for %s, matching canonical %s", Long.valueOf(j2), (alog) map.collect(alls.a), (alog) Collection.EL.stream((alog) obj).map(new wmi(10)).map(new wki(obj4, 14)).collect(alls.a));
        return null;
    }

    public /* synthetic */ wzv(vtx vtxVar, long j, vty vtyVar, int i) {
        this.d = i;
        this.c = vtxVar;
        this.a = j;
        this.b = vtyVar;
    }
}
