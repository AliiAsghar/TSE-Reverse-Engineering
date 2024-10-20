package defpackage;

import com.airbnb.lottie.LottieAnimationView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hef implements hbn {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public hef(arvo arvoVar, int i) {
        this.b = i;
        this.a = arvoVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [arvo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, arpe] */
    @Override // defpackage.hbn
    public final void a(Object obj) {
        if (this.b != 0) {
            ((LottieAnimationView) this.a).f((hbb) obj);
        } else if (!this.a.j()) {
            this.a.w(obj);
        }
    }

    public /* synthetic */ hef(LottieAnimationView lottieAnimationView, int i) {
        this.b = i;
        this.a = lottieAnimationView;
    }
}
