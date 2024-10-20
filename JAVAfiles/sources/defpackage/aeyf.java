package defpackage;

import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aeyf extends arrp implements arqr {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ byn c;
    final /* synthetic */ float d;
    final /* synthetic */ byn e;
    final /* synthetic */ arqg f;
    final /* synthetic */ arqr g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeyf(boolean z, boolean z2, byn bynVar, float f, byn bynVar2, arqg arqgVar, arqr arqrVar) {
        super(1);
        this.a = z;
        this.b = z2;
        this.c = bynVar;
        this.d = f;
        this.e = bynVar2;
        this.f = arqgVar;
        this.g = arqrVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        float intBitsToFloat;
        float intBitsToFloat2;
        MotionEvent motionEvent = (MotionEvent) obj;
        motionEvent.getClass();
        if (!this.a) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    if (!((Boolean) this.e.a()).booleanValue()) {
                        return false;
                    }
                    this.g.a(Float.valueOf(motionEvent.getY()));
                    return true;
                }
            }
            if (!((Boolean) this.e.a()).booleanValue()) {
                return false;
            }
            this.e.h(false);
            return true;
        }
        if (this.b) {
            intBitsToFloat = brg.a;
        } else {
            long j = ((cjt) this.c.a()).a >> 32;
            intBitsToFloat = Float.intBitsToFloat((int) j) - this.d;
        }
        if (this.b) {
            intBitsToFloat2 = this.d;
        } else {
            intBitsToFloat2 = Float.intBitsToFloat((int) (((cjt) this.c.a()).a >> 32));
        }
        float x = motionEvent.getX();
        if (intBitsToFloat > x || x > intBitsToFloat2) {
            return false;
        }
        this.e.h(true);
        this.f.a();
        this.g.a(Float.valueOf(motionEvent.getY()));
        return true;
    }
}
