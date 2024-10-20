package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aifo implements aipj {
    INIT,
    ACTIVE,
    CLOSING,
    CLOSED,
    FAILED;

    public static final aiim f;

    static {
        aifo aifoVar = INIT;
        aifo aifoVar2 = ACTIVE;
        aifo aifoVar3 = CLOSING;
        aifo aifoVar4 = CLOSED;
        aifo aifoVar5 = FAILED;
        alpu alpuVar = new alpu();
        alpuVar.k(aifoVar, aifoVar2, aifoVar3);
        alpuVar.k(aifoVar2, aifoVar2, aifoVar3);
        alpuVar.k(aifoVar3, aifoVar4);
        f = new aiim(aifoVar, aifoVar5, alpuVar.a(), altc.a);
    }
}
