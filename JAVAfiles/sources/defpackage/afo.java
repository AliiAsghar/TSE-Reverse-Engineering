package defpackage;

import android.view.View;
import android.widget.Magnifier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afo implements afn {
    public static final afo a = new afo();

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public class a implements afm {
        public final Magnifier a;

        public a(Magnifier magnifier) {
            this.a = magnifier;
        }

        @Override // defpackage.afm
        public final long a() {
            int width;
            int height;
            width = this.a.getWidth();
            height = this.a.getHeight();
            return (width << 32) | (height & 4294967295L);
        }

        @Override // defpackage.afm
        public final void b() {
            this.a.dismiss();
        }

        @Override // defpackage.afm
        public final void c() {
            this.a.update();
        }

        @Override // defpackage.afm
        public void d(long j, float f) {
            this.a.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)));
        }
    }

    private afo() {
    }

    @Override // defpackage.afn
    public final /* bridge */ /* synthetic */ afm a(View view, boolean z, long j, float f, float f2, boolean z2, dqv dqvVar, float f3) {
        return new a(new Magnifier(view));
    }

    @Override // defpackage.afn
    public final boolean b() {
        return false;
    }
}
