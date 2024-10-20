package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ypt {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/util/spam/common/SpamErrorHandler");
    public final armf b;
    public final armf c;
    public final armf d;
    private final armf e;
    private final arwe f;

    public ypt(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, arwe arweVar) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        arweVar.getClass();
        this.b = armfVar;
        this.e = armfVar2;
        this.c = armfVar3;
        this.d = armfVar4;
        this.f = arweVar;
    }

    public final amzq a(Throwable th) {
        if (th instanceof aqwb) {
            amzq apply = new ypo().apply(((aqwb) th).a.getCode());
            apply.getClass();
            return apply;
        }
        return amzq.UNEXPECTED_ERROR_TYPE;
    }

    public final void b(ypm ypmVar, Throwable th, ypi ypiVar, amzf amzfVar, int i) {
        ypiVar.getClass();
        amzfVar.getClass();
        boolean z = th instanceof aqwb;
        amzq a2 = a(th);
        if (z) {
            ((alvg) ((alvg) a.g()).g(th).h("com/google/android/apps/messaging/shared/util/spam/common/SpamErrorHandler", "handleClassificationError", 71, "SpamErrorHandler.kt")).q("SpamErrorHandler#handleClassificationError: failed to classify spam");
        } else {
            ((alvg) ((alvg) a.i()).g(th).h("com/google/android/apps/messaging/shared/util/spam/common/SpamErrorHandler", "handleClassificationError", 76, "SpamErrorHandler.kt")).q("SpamErrorHandler#handleClassificationError: failed to classify spam");
        }
        c(th, a2);
        qjh.l(this.f, null, new yps(this, ypmVar, ypiVar, amzfVar, i, a2, null), 3);
    }

    public final void c(Throwable th, amzq amzqVar) {
        if (amzqVar == amzq.UNEXPECTED_ERROR_TYPE) {
            qiu.h(((uvi) this.e.b()).b(th));
        }
    }
}
