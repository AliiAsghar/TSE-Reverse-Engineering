package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lfb implements lep {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/main/RPlusLocusProxy");
    private final arqr b;

    public lfb(arqr arqrVar) {
        this.b = arqrVar;
    }

    @Override // defpackage.lep
    public final void a(leo leoVar) {
        String str;
        if (leoVar instanceof lem) {
            alvw g = a.g();
            g.X(alwp.a, "Bugle");
            ((alvg) g.h("com/google/android/apps/messaging/main/RPlusLocusProxy", "onUiUpdate", 50, "Locus.kt")).q("update locus context to conversation");
            str = ((lem) leoVar).a;
        } else {
            alvw g2 = a.g();
            g2.X(alwp.a, "Bugle");
            ((alvg) g2.h("com/google/android/apps/messaging/main/RPlusLocusProxy", "onUiUpdate", 54, "Locus.kt")).q("update locus context to non-conversation");
            str = "NonConversationPage";
        }
        this.b.a(str);
    }
}
