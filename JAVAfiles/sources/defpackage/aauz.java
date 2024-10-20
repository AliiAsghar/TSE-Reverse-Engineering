package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aauz extends OrientationEventListener {
    public final /* synthetic */ aava a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aauz(aava aavaVar, Context context) {
        super(context, 3);
        this.a = aavaVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        if (i != -1) {
            int round = (int) Math.round(i / 90.0d);
            aava aavaVar = this.a;
            int i2 = (360 - (round * 90)) % 360;
            if (aavaVar.o && i2 == aavaVar.m && aavaVar.n == aavaVar.b()) {
                return;
            }
            this.a.d(new wog(this, i2, 3));
        }
    }
}
