package defpackage;

import android.os.Build;
import androidx.compose.foundation.MagnifierElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afc {
    public static final dhn a = new dhn("MagnifierPositionInRoot");

    public static /* synthetic */ boolean a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ cga b(cga cgaVar, arqr arqrVar, arqr arqrVar2, afn afnVar) {
        if (a()) {
            return new MagnifierElement(arqrVar, arqrVar2, afnVar);
        }
        return cgaVar;
    }
}
