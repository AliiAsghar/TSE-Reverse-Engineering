package defpackage;

import android.support.v7.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class heg implements hbn {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public heg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [arvo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, arpe] */
    @Override // defpackage.hbn
    public final /* synthetic */ void a(Object obj) {
        if (this.b != 0) {
            Object obj2 = this.a;
            Throwable th = (Throwable) obj;
            int i = ((LottieAnimationView) obj2).b;
            if (i != 0) {
                ((AppCompatImageView) obj2).setImageResource(i);
            }
            LottieAnimationView.a.a(th);
            return;
        }
        Throwable th2 = (Throwable) obj;
        if (!this.a.j()) {
            ?? r0 = this.a;
            th2.getClass();
            r0.w(aqil.O(th2));
        }
    }
}
