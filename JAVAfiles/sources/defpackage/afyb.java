package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afyb implements agar {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public afyb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.agar
    public final void l(int i) {
        if (this.b != 0) {
            return;
        }
        ((alvg) afye.b.g().h("com/google/android/libraries/compose/ui/HugoManagerImpl$keyboardStateListener$1", "onKeyboardHeightChanged", 156, "HugoManagerImpl.kt")).r("Keyboard height changed to %d", i);
        ((afye) this.a).i.l(i);
        afye.q((afye) this.a, i, 0, 2);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byn, java.lang.Object] */
    @Override // defpackage.agar
    public final void m(agaq agaqVar) {
        if (this.b != 0) {
            agaqVar.getClass();
            this.a.h(agaqVar);
            return;
        }
        agaqVar.getClass();
        ((alvg) afye.b.g().h("com/google/android/libraries/compose/ui/HugoManagerImpl$keyboardStateListener$1", "onKeyboardStateChanged", 149, "HugoManagerImpl.kt")).t("Keyboard state switched to %s", agaqVar);
        ((afye) this.a).f.f(agaqVar);
        ((afye) this.a).i.m(agaqVar);
        afye.q((afye) this.a, 0, 0, 3);
    }
}
