package defpackage;

import android.os.Build;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface afn {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public static final afn a() {
            if (afc.a()) {
                if (Build.VERSION.SDK_INT == 28) {
                    return afo.a;
                }
                return afp.a;
            }
            throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }

    afm a(View view, boolean z, long j, float f, float f2, boolean z2, dqv dqvVar, float f3);

    boolean b();
}
