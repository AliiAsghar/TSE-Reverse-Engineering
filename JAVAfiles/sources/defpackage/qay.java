package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qay implements qby {
    private static final alwo a = alwo.o("BugleGroupManagement");
    private final vtj b;

    public qay(vtj vtjVar) {
        this.b = vtjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qby
    public final /* synthetic */ qfl a(Object obj, qbs qbsVar) {
        qez qezVar = (qez) obj;
        d.t(qezVar.d.equals(qbsVar.f), "Mismatch between the RCS conversation Id from the GroupFullState and ConversationsTable");
        aozy createBuilder = qer.a.createBuilder();
        alpr alprVar = new alpr();
        alog c = qbsVar.i.c();
        int size = c.size();
        for (int i = 0; i < size; i++) {
            alprVar.c((qes) this.b.m().fu((vtl) c.get(i)));
        }
        alpt g = alprVar.g();
        alpt o = alpt.o(new apaq(qezVar.f, qez.a));
        aluq it = alzz.G(o, g).iterator();
        while (it.hasNext()) {
            qes qesVar = (qes) it.next();
            alvw m = a.m();
            m.X(ydl.o, qbsVar.a.toString());
            m.X(ydl.I, qbsVar.f);
            ((alwl) m.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateCapabilitiesConverter", "toGroupUpdate", 68, "GroupFullStateCapabilitiesConverter.java")).t("Found a server capability not present on the client. Generating add capability GroupOperation: %s", qesVar);
            aozy createBuilder2 = qdz.a.createBuilder();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            qdz qdzVar = (qdz) createBuilder2.b;
            qdzVar.c = qesVar.f;
            qdzVar.b |= 1;
            createBuilder.bg(createBuilder2);
        }
        aluq it2 = alzz.G(g, o).iterator();
        while (it2.hasNext()) {
            qes qesVar2 = (qes) it2.next();
            alvw m2 = a.m();
            m2.X(ydl.o, qbsVar.a.toString());
            m2.X(ydl.I, qbsVar.f);
            ((alwl) m2.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateCapabilitiesConverter", "toGroupUpdate", 84, "GroupFullStateCapabilitiesConverter.java")).t("Found a client capability not present on the server. Generating remove capability GroupOperation: %s", qesVar2);
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
        String str = qezVar.d;
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
