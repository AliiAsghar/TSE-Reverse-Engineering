package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class qda implements algk {
    private final /* synthetic */ int a;

    public /* synthetic */ qda(int i) {
        this.a = i;
    }

    @Override // defpackage.algk
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                ver.m((aqwb) obj);
                return null;
            case 1:
                return null;
            case 2:
                return upm.d();
            case 3:
                return upm.b();
            case 4:
                int ordinal = ((pwh) obj).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        return upm.d();
                    }
                    return upm.e();
                }
                return upm.b();
            case 5:
                return pwh.FAIL_NO_RETRY;
            case 6:
                ((alwl) ((alwl) ((alwl) qdn.a.i()).g((IllegalStateException) obj)).h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visit", 338, "UnencryptedIncomingChatMessageVisitor.java")).q("File transfer processing failed.");
                return pwh.FAIL_RETRY;
            case 7:
                qid qidVar = (qid) obj;
                xze xzeVar = qif.a;
                if ((qidVar.b & 8) != 0) {
                    return Optional.of(qidVar.f);
                }
                return Optional.empty();
            case 8:
                qic b = qic.b(((qid) obj).l);
                if (b == null) {
                    return qic.UNSPECIFIED_STATUS;
                }
                return b;
            case 9:
                xze xzeVar2 = qif.a;
                aozy builder = ((qid) obj).toBuilder();
                if (!builder.a.isMutable()) {
                    builder.b = builder.r();
                    return (qid) builder.s();
                }
                throw new IllegalArgumentException("Default instance must be immutable.");
            case 10:
                return Boolean.valueOf(((qid) obj).d);
            case 11:
                apct apctVar = ((qid) obj).n;
                if (apctVar == null) {
                    return apct.a;
                }
                return apctVar;
            case 12:
                xze xzeVar3 = qif.a;
                aozy builder2 = ((qid) obj).toBuilder();
                if (!builder2.b.isMutable()) {
                    builder2.u();
                }
                qid qidVar2 = (qid) builder2.b;
                qidVar2.b |= 8192;
                qidVar2.k = true;
                return (qid) builder2.s();
            case 13:
                return null;
            case 14:
                return qno.c(obj);
            case 15:
                return upm.b();
            case 16:
                return Integer.valueOf(qqw.r((Optional) obj));
            case 17:
                return qrz.a(((pto) obj).a());
            case 18:
                return psv.a(((pto) obj).a());
            case 19:
                return null;
            default:
                return Long.valueOf(((uhh) obj).c);
        }
    }
}
