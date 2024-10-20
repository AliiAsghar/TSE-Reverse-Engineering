package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qbg implements qby {
    private static final alwo a = alwo.o("BugleGroupManagement");

    @Override // defpackage.qby
    public final /* synthetic */ qfl a(Object obj, qbs qbsVar) {
        qey qeyVar = (qey) obj;
        d.t(qeyVar.e.equals(qbsVar.f), "Mismatch between the RCS conversation Id from the GroupFullState and ConversationsTable");
        aozy createBuilder = qer.a.createBuilder();
        for (qes qesVar : new apaq(qeyVar.h, qey.a)) {
            alvw m = a.m();
            m.X(ydl.o, qbsVar.a.toString());
            m.X(ydl.I, qbsVar.f);
            ((alwl) m.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventCapabilitiesConverter", "toGroupUpdate", 53, "GroupEventCapabilitiesConverter.java")).t("Group capability from the server to add to the client: %s", qesVar);
            aozy createBuilder2 = qdz.a.createBuilder();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            qdz qdzVar = (qdz) createBuilder2.b;
            qdzVar.c = qesVar.f;
            qdzVar.b |= 1;
            createBuilder.bg(createBuilder2);
        }
        for (qes qesVar2 : new apaq(qeyVar.i, qey.b)) {
            alvw m2 = a.m();
            m2.X(ydl.o, qbsVar.a.toString());
            m2.X(ydl.I, qbsVar.f);
            ((alwl) m2.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventCapabilitiesConverter", "toGroupUpdate", 66, "GroupEventCapabilitiesConverter.java")).t("Group capability from the server to remove from he client: %s", qesVar2);
            aozy createBuilder3 = qfv.a.createBuilder();
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            qfv qfvVar = (qfv) createBuilder3.b;
            qfvVar.c = qesVar2.f;
            qfvVar.b |= 1;
            createBuilder.bh(createBuilder3);
        }
        aozy createBuilder4 = qfl.a.createBuilder();
        String str = qeyVar.e;
        if (!createBuilder4.b.isMutable()) {
            createBuilder4.u();
        }
        apag apagVar = createBuilder4.b;
        qfl qflVar = (qfl) apagVar;
        str.getClass();
        qflVar.b |= 1;
        qflVar.c = str;
        if (!apagVar.isMutable()) {
            createBuilder4.u();
        }
        qfl qflVar2 = (qfl) createBuilder4.b;
        qer qerVar = (qer) createBuilder.s();
        qerVar.getClass();
        qflVar2.f = qerVar;
        qflVar2.b |= 8;
        return (qfl) createBuilder4.s();
    }
}
