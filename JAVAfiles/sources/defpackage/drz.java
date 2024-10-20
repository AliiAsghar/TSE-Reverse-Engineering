package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class drz {
    public static final AnonymousClass1 a = new cpz() { // from class: drz.1
        @Override // defpackage.cpz
        public final /* synthetic */ long a(long j, long j2, int i) {
            return 0L;
        }

        @Override // defpackage.cpz
        public final /* synthetic */ long b(long j, int i) {
            return 0L;
        }

        @Override // defpackage.cpz
        public final /* synthetic */ Object c(long j, long j2, arpe arpeVar) {
            return new drp(0L);
        }

        @Override // defpackage.cpz
        public final /* synthetic */ Object d(long j, arpe arpeVar) {
            return new drp(0L);
        }
    };

    public static final float a(int i) {
        return -i;
    }

    public static final float b(float f) {
        return -f;
    }

    public static final int c(int i) {
        if (1 != i) {
            return 1;
        }
        return 2;
    }

    public static final void d(View view, cxn cxnVar) {
        long a2 = ctj.a(cxnVar.x());
        int round = Math.round(Float.intBitsToFloat((int) (a2 >> 32)));
        int round2 = Math.round(Float.intBitsToFloat((int) (a2 & 4294967295L)));
        view.layout(round, round2, view.getMeasuredWidth() + round, view.getMeasuredHeight() + round2);
    }
}
