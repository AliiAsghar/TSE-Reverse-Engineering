package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qbh implements qby {
    private static final alwo a = alwo.o("BugleGroupManagement");

    @Override // defpackage.qby
    public final /* synthetic */ qfl a(Object obj, qbs qbsVar) {
        qey qeyVar = (qey) obj;
        d.t(qeyVar.e.equals(qbsVar.f), "Mismatch between the RCS conversation Id from the GroupFullState and ConversationsTable");
        aozy createBuilder = qfl.a.createBuilder();
        String str = qeyVar.e;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qfl qflVar = (qfl) createBuilder.b;
        str.getClass();
        qflVar.b |= 1;
        qflVar.c = str;
        qei qeiVar = qei.a;
        qei qeiVar2 = qeyVar.n;
        if (qeiVar2 == null) {
            qeiVar2 = qeiVar;
        }
        if (qeiVar.equals(qeiVar2)) {
            return (qfl) createBuilder.s();
        }
        qeh qehVar = qeh.GROUP;
        qei qeiVar3 = qeyVar.n;
        if (qeiVar3 == null) {
            qeiVar3 = qei.a;
        }
        qeh b = qeh.b(qeiVar3.c);
        if (b == null) {
            b = qeh.UNKNOWN_TYPE;
        }
        d.t(qehVar.equals(b), "When present the group destination endpoint should always be of type GROUP");
        String str2 = qbsVar.g;
        qei qeiVar4 = qeyVar.n;
        if (qeiVar4 == null) {
            qeiVar4 = qei.a;
        }
        if (!str2.equals(qeiVar4.d)) {
            alvw m = a.m();
            m.X(ydl.o, qbsVar.a.toString());
            m.X(ydl.I, qbsVar.f);
            ((alwl) m.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventEndpointConverter", "toGroupUpdate", 59, "GroupEventEndpointConverter.java")).q("Detected change of the RCS conference URI");
            aozy createBuilder2 = qet.a.createBuilder();
            qei qeiVar5 = qeyVar.n;
            if (qeiVar5 == null) {
                qeiVar5 = qei.a;
            }
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            qet qetVar = (qet) createBuilder2.b;
            qeiVar5.getClass();
            qetVar.c = qeiVar5;
            qetVar.b |= 1;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qfl qflVar2 = (qfl) createBuilder.b;
            qet qetVar2 = (qet) createBuilder2.s();
            qetVar2.getClass();
            qflVar2.d = qetVar2;
            qflVar2.b |= 2;
        }
        return (qfl) createBuilder.s();
    }
}
