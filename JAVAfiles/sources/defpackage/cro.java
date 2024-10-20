package defpackage;

import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cro extends arrp implements arqr<MotionEvent, Boolean> {
    final /* synthetic */ drx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cro(drx drxVar) {
        super(1);
        this.a = drxVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        boolean dispatchTouchEvent;
        MotionEvent motionEvent = (MotionEvent) obj;
        switch (motionEvent.getActionMasked()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                dispatchTouchEvent = this.a.dispatchTouchEvent(motionEvent);
                break;
            default:
                dispatchTouchEvent = this.a.dispatchGenericMotionEvent(motionEvent);
                break;
        }
        return Boolean.valueOf(dispatchTouchEvent);
    }
}
