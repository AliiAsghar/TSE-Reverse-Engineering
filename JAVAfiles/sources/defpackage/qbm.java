package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qbm implements qby {
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
        if (qeyVar.j) {
            alvw m = a.m();
            m.X(ydl.o, qbsVar.a.toString());
            m.X(ydl.I, qbsVar.f);
            m.X(ydl.E, qbsVar.c);
            ((alwl) m.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventSubjectConverter", "toGroupUpdate", 51, "GroupEventSubjectConverter.java")).q("Received a GroupEvent with subject deleted from the server.");
            aozy createBuilder2 = qfk.a.createBuilder();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            qfk qfkVar = (qfk) createBuilder2.b;
            qfkVar.b |= 2;
            qfkVar.d = true;
            qfm qfmVar = qeyVar.o;
            if (qfmVar == null) {
                qfmVar = qfm.a;
            }
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            qfk qfkVar2 = (qfk) createBuilder2.b;
            qfmVar.getClass();
            qfkVar2.e = qfmVar;
            qfkVar2.b |= 4;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qfl qflVar2 = (qfl) createBuilder.b;
            qfk qfkVar3 = (qfk) createBuilder2.s();
            qfkVar3.getClass();
            qflVar2.g = qfkVar3;
            qflVar2.b |= 16;
            return (qfl) createBuilder.s();
        }
        if ((qeyVar.d & 4) != 0) {
            alvw m2 = a.m();
            m2.X(ydl.o, qbsVar.a.toString());
            m2.X(ydl.I, qbsVar.f);
            m2.X(ydl.E, qbsVar.c);
            ((alwl) m2.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventSubjectConverter", "toGroupUpdate", 69, "GroupEventSubjectConverter.java")).t("Received a GroupEvent with a Subject update from the server. Updated subject: %s", qeyVar.k);
            aozy createBuilder3 = qfk.a.createBuilder();
            String str2 = qeyVar.k;
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            qfk qfkVar4 = (qfk) createBuilder3.b;
            str2.getClass();
            qfkVar4.b |= 1;
            qfkVar4.c = str2;
            qfm qfmVar2 = qeyVar.o;
            if (qfmVar2 == null) {
                qfmVar2 = qfm.a;
            }
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            qfk qfkVar5 = (qfk) createBuilder3.b;
            qfmVar2.getClass();
            qfkVar5.e = qfmVar2;
            qfkVar5.b |= 4;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qfl qflVar3 = (qfl) createBuilder.b;
            qfk qfkVar6 = (qfk) createBuilder3.s();
            qfkVar6.getClass();
            qflVar3.g = qfkVar6;
            qflVar3.b |= 16;
            return (qfl) createBuilder.s();
        }
        return (qfl) createBuilder.s();
    }
}
