package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.agq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agr {
    public static final bzc a = new bxa(AnonymousClass1.a);
    public static final agq b = new agq() { // from class: agr.2
        @Override // defpackage.agq
        public final float a(float f, float f2, float f3) {
            float abs = Math.abs((f2 + f) - f);
            float f4 = (0.3f * f3) - (brg.a * abs);
            if (abs <= f3 && f3 - f4 < abs) {
                f4 = f3 - abs;
            }
            return f - f4;
        }
    };

    /* compiled from: PG */
    /* renamed from: agr$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<bww, agq> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            if (!((Context) ((bww) obj).a(AndroidCompositionLocals_androidKt.b)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                int i = agq.a;
                return agq.a.b;
            }
            return agr.b;
        }
    }
}
