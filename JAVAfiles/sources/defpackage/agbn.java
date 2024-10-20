package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
import com.google.android.libraries.compose.ui.keyboard.detector.KeyboardDetectorViewInsetsListener;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agbn implements agau {
    static final /* synthetic */ artm[] a;
    public final cj b;
    private final arml c;
    private final arsn d;
    private final adta e;

    static {
        arrr arrrVar = new arrr(agbn.class, "state", "getState()Lcom/google/android/libraries/compose/ui/keyboard/detector/KeyboardDetectorViewStrategy$Companion$State;", 0);
        int i = arsc.a;
        a = new artm[]{arrrVar};
    }

    public agbn(Activity activity, adta adtaVar) {
        activity.getClass();
        this.e = adtaVar;
        if (activity instanceof cj) {
            this.b = (cj) activity;
            this.c = armd.a(new agbl(activity));
            this.d = new agbm(agbj.a, this);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    private final agbk e() {
        return (agbk) this.d.c(a[0]);
    }

    private final void f(agbk agbkVar) {
        this.d.d(a[0], agbkVar);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [armf, java.lang.Object] */
    @Override // defpackage.agau
    public final void a(agar agarVar) {
        if (!(e() instanceof agbi)) {
            agbr agbrVar = new agbr(this.b);
            agbrVar.setTag("KEYBOARD_DETECTION");
            agbrVar.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
            afke afkeVar = (afke) this.e.a.b();
            afkeVar.getClass();
            f(new agbi(agbrVar, new KeyboardDetectorViewInsetsListener(afkeVar, agbrVar), agarVar));
            return;
        }
        throw new IllegalStateException("Detector view was already attached");
    }

    @Override // defpackage.agau
    public final void b() {
        if (e() instanceof agbi) {
            f(agbj.a);
            return;
        }
        throw new IllegalStateException("Detector view wasn't attached");
    }

    @Override // defpackage.agau
    public final boolean c() {
        if (!afzv.h(this.b)) {
            return true;
        }
        return false;
    }

    public final ViewGroup d() {
        return (ViewGroup) this.c.a();
    }
}
