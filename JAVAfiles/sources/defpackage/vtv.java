package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vtv extends unp {
    public static final /* synthetic */ int a = 0;
    private static final alwo b = alwo.o("BugleGroupManagement");
    private final uhj c;

    public vtv(uhj uhjVar) {
        this.c = uhjVar;
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("GroupSessionStartFailedHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        boolean z;
        long j = ((vtw) apbtVar).b;
        if (j != -1) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "Invalid session ID.");
        snf e = sni.e();
        e.w("processPendingWorkItemAsync-conversations");
        e.h(new rum(j, 7));
        smr smrVar = (smr) ((sna) e.b().n()).cO();
        if (smrVar == null) {
            alwl alwlVar = (alwl) b.i();
            alwlVar.X(ydl.G, Long.valueOf(j));
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/rcs/groups/invite/GroupSessionStartFailedHandler", "processPendingWorkItemAsync", 71, "GroupSessionStartFailedHandler.java")).q("Found no conversation for session start failed event.");
            return aktp.ag(upm.b());
        }
        ConversationIdType x = smrVar.x();
        sng sngVar = new sng();
        sngVar.aj("processPendingWorkItemAsync#update");
        sngVar.N(-1L);
        sngVar.v(5);
        sngVar.e(x);
        this.c.d(x);
        alvw m = b.m();
        m.X(ydl.G, Long.valueOf(j));
        ((alwl) m.h("com/google/android/apps/messaging/shared/rcs/groups/invite/GroupSessionStartFailedHandler", "processPendingWorkItemAsync", 85, "GroupSessionStartFailedHandler.java")).q("Session start failed for a new RCS group. Updated conversation join state to group creation failed.");
        return aktp.ag(upm.b());
    }

    @Override // defpackage.unx
    public final apca e() {
        return vtw.a.getParserForType();
    }
}
