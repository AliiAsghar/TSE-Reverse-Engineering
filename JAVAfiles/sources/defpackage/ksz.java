package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ksz {
    private final alwo a = alwo.o("Bugle");
    private int b;
    private int c;
    private byte d;
    private lga e;

    public final kta a() {
        if (this.d == 3 && this.e != null) {
            kta ktaVar = new kta(this.b, this.c, this.e);
            if (ktaVar.c > 0 && ktaVar.d > 0) {
                return ktaVar;
            }
            ksz kszVar = new ksz();
            kszVar.d(ktaVar.e);
            kszVar.c(ktaVar.d);
            kszVar.b(ktaVar.c);
            if (ktaVar.d <= 0) {
                int intValue = ((Integer) kta.b.e()).intValue();
                kszVar.c(intValue);
                ((alwl) ((alwl) this.a.i()).h("com/google/android/apps/messaging/helpandfeedback/advancedfeedback/dataservices/ProblematicConversationDataRequest$Builder", "build", 73, "ProblematicConversationDataRequest.java")).r("maxMessageCount is non-positive, default value [%d] is used instead", intValue);
            }
            if (ktaVar.c <= 0) {
                int intValue2 = ((Integer) kta.a.e()).intValue();
                kszVar.b(intValue2);
                ((alwl) ((alwl) this.a.i()).h("com/google/android/apps/messaging/helpandfeedback/advancedfeedback/dataservices/ProblematicConversationDataRequest$Builder", "build", 79, "ProblematicConversationDataRequest.java")).r("maxConversationCount is non-positive, default value [%d] is used instead", intValue2);
            }
            return kszVar.a();
        }
        StringBuilder sb = new StringBuilder();
        if ((this.d & 1) == 0) {
            sb.append(" maxConversationCount");
        }
        if ((this.d & 2) == 0) {
            sb.append(" maxMessageCount");
        }
        if (this.e == null) {
            sb.append(" converter");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.b = i;
        this.d = (byte) (this.d | 1);
    }

    public final void c(int i) {
        this.c = i;
        this.d = (byte) (this.d | 2);
    }

    public final void d(lga lgaVar) {
        if (lgaVar != null) {
            this.e = lgaVar;
            return;
        }
        throw new NullPointerException("Null converter");
    }
}
