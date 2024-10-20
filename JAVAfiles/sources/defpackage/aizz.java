package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aizz implements View.OnTouchListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public aizz(aaff aaffVar, AtomicReference atomicReference, AtomicReference atomicReference2, int i) {
        this.d = i;
        this.c = atomicReference;
        this.a = atomicReference2;
        this.b = aaffVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                int action = motionEvent.getAction();
                Object obj = this.a;
                Object obj2 = this.b;
                Object obj3 = this.c;
                if (action != 0) {
                    if (action != 1) {
                        if (action != 2) {
                            return false;
                        }
                        if (!ajax.e(motionEvent, view)) {
                            ((FrameLayout) obj2).setPressed(false);
                            ajax ajaxVar = (ajax) obj3;
                            ahnz.R((ImageView) obj, ajaxVar.getContext(), ajaxVar.a(R.color.survey_grey_icon_color));
                        }
                    } else {
                        FrameLayout frameLayout = (FrameLayout) obj2;
                        if (frameLayout.isPressed()) {
                            frameLayout.performClick();
                        }
                    }
                } else if (ajax.e(motionEvent, view)) {
                    ((FrameLayout) obj2).setPressed(true);
                    ajax ajaxVar2 = (ajax) obj3;
                    ahnz.R((ImageView) obj, ajaxVar2.getContext(), ajaxVar2.a(R.color.survey_accent_color));
                }
                return true;
            }
            GestureDetector gestureDetector = (GestureDetector) ((AtomicReference) this.c).get();
            if (gestureDetector != null) {
                gestureDetector.onTouchEvent(motionEvent);
            }
            Object obj4 = this.a;
            float rawX = motionEvent.getRawX();
            int a = abbv.a(((aaff) this.b).m);
            if (a <= 0) {
                f = -1.0f;
            } else {
                f = rawX / a;
            }
            ((AtomicReference) obj4).set(Float.valueOf(f));
            aaff.a.o("Suggestion touch event registered at: ".concat(String.valueOf(String.valueOf(((AtomicReference) this.a).get()))));
            return false;
        }
        if (motionEvent.getAction() == 1) {
            if (motionEvent.getX() >= brg.a) {
                CheckBox checkBox = (CheckBox) this.a;
                if (motionEvent.getX() < checkBox.getWidth() && motionEvent.getY() >= brg.a) {
                    if (motionEvent.getY() < ((View) this.b).getHeight()) {
                        checkBox.performClick();
                    }
                }
            }
            Object obj5 = this.c;
            ((EditText) obj5).requestFocus();
            aizr.h((View) obj5);
        }
        return false;
    }

    public /* synthetic */ aizz(ajax ajaxVar, FrameLayout frameLayout, ImageView imageView, int i) {
        this.d = i;
        this.c = ajaxVar;
        this.b = frameLayout;
        this.a = imageView;
    }

    public /* synthetic */ aizz(CheckBox checkBox, View view, EditText editText, int i) {
        this.d = i;
        this.a = checkBox;
        this.b = view;
        this.c = editText;
    }
}
