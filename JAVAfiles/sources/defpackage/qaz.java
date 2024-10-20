package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qaz implements qby {
    private static final alwo a = alwo.o("BugleGroupManagement");

    @Override // defpackage.qby
    public final /* synthetic */ qfl a(Object obj, qbs qbsVar) {
        qez qezVar = (qez) obj;
        d.t(qezVar.d.equals(qbsVar.f), "Mismatch between the RCS conversation Id from the GroupFullState and ConversationsTable");
        qeh qehVar = qeh.GROUP;
        qei qeiVar = qezVar.e;
        if (qeiVar == null) {
            qeiVar = qei.a;
        }
        qeh b = qeh.b(qeiVar.c);
        if (b == null) {
            b = qeh.UNKNOWN_TYPE;
        }
        d.t(qehVar.equals(b), "Group destination endpoint should always be of type GROUP");
        aozy createBuilder = qfl.a.createBuilder();
        String str = qezVar.d;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qfl qflVar = (qfl) createBuilder.b;
        str.getClass();
        qflVar.b |= 1;
        qflVar.c = str;
        String str2 = qbsVar.g;
        qei qeiVar2 = qezVar.e;
        if (qeiVar2 == null) {
            qeiVar2 = qei.a;
        }
        if (!str2.equals(qeiVar2.d)) {
            alvw m = a.m();
            m.X(ydl.o, qbsVar.a.toString());
            m.X(ydl.I, qbsVar.f);
            ((alwl) m.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateEndpointConverter", "toGroupUpdate", 56, "GroupFullStateEndpointConverter.java")).q("Detected change of the RCS conference URI");
            aozy createBuilder2 = qet.a.createBuilder();
            qei qeiVar3 = qezVar.e;
            if (qeiVar3 == null) {
                qeiVar3 = qei.a;
            }
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            qet qetVar = (qet) createBuilder2.b;
            qeiVar3.getClass();
            qetVar.c = qeiVar3;
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
