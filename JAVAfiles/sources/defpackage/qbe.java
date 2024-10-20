package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qbe implements qby {
    private static final alwo a = alwo.o("BugleGroupManagement");

    @Override // defpackage.qby
    public final /* synthetic */ qfl a(Object obj, qbs qbsVar) {
        qez qezVar = (qez) obj;
        d.t(qezVar.d.equals(qbsVar.f), "Mismatch between the RCS conversation Id from the GroupFullState and ConversationsTable");
        aozy createBuilder = qfl.a.createBuilder();
        String str = qezVar.d;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qfl qflVar = (qfl) createBuilder.b;
        str.getClass();
        qflVar.b |= 1;
        qflVar.c = str;
        if ((qezVar.c & 4) != 0) {
            if (!qbsVar.i.d(vtl.NAME_CHANGE)) {
                alvw m = a.m();
                m.X(ydl.o, qbsVar.a.toString());
                m.X(ydl.I, qbsVar.f);
                ((alwl) m.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateSubjectConverter", "toGroupUpdate", 74, "GroupFullStateSubjectConverter.java")).q("Skipping group subject change check because subject changes are not supported by conversation");
                return (qfl) createBuilder.s();
            }
            qfj qfjVar = qezVar.h;
            if (qfjVar == null) {
                qfjVar = qfj.a;
            }
            String str2 = qbsVar.c;
            tqh tqhVar = qbsVar.d;
            String str3 = qfjVar.c;
            if (wam.s(str3, str2, tqhVar)) {
                alvw m2 = a.m();
                m2.X(ydl.o, qbsVar.a.toString());
                m2.X(ydl.I, qbsVar.f);
                ((alwl) m2.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateSubjectConverter", "toGroupUpdate", 91, "GroupFullStateSubjectConverter.java")).D("Server subject (%s) and client subject (%s) do not match. Generating subject update GroupEvent.", str3, str2);
                aozy createBuilder2 = qfk.a.createBuilder();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                qfk qfkVar = (qfk) createBuilder2.b;
                str3.getClass();
                qfkVar.b |= 1;
                qfkVar.c = str3;
                boolean isEmpty = str3.isEmpty();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                qfk qfkVar2 = (qfk) createBuilder2.b;
                qfkVar2.b |= 2;
                qfkVar2.d = isEmpty;
                qfm qfmVar = qfjVar.d;
                if (qfmVar == null) {
                    qfmVar = qfm.a;
                }
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                qfk qfkVar3 = (qfk) createBuilder2.b;
                qfmVar.getClass();
                qfkVar3.e = qfmVar;
                qfkVar3.b |= 4;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                qfl qflVar2 = (qfl) createBuilder.b;
                qfk qfkVar4 = (qfk) createBuilder2.s();
                qfkVar4.getClass();
                qflVar2.g = qfkVar4;
                qflVar2.b |= 16;
            }
            return (qfl) createBuilder.s();
        }
        alvw m3 = a.m();
        m3.X(ydl.o, qbsVar.a.toString());
        m3.X(ydl.I, qbsVar.f);
        ((alwl) m3.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateSubjectConverter", "toGroupUpdate", 59, "GroupFullStateSubjectConverter.java")).q("Skipping group subject change because subject missing in group full state notification");
        return (qfl) createBuilder.s();
    }
}
