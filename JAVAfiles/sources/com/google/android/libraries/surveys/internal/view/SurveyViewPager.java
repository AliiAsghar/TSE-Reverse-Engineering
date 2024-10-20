package com.google.android.libraries.surveys.internal.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.messaging.R;
import defpackage.a;
import defpackage.ahnu;
import defpackage.ahnz;
import defpackage.aiyq;
import defpackage.aizj;
import defpackage.aizp;
import defpackage.aizv;
import defpackage.ajbm;
import defpackage.ajbn;
import defpackage.ajbq;
import defpackage.ajbr;
import defpackage.apqi;
import defpackage.apqz;
import defpackage.aprn;
import defpackage.aqqo;
import defpackage.cg;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class SurveyViewPager extends ViewPager {
    public ajbm m;

    public SurveyViewPager(Context context) {
        super(context);
        D();
    }

    private final View C() {
        aizv u;
        if (this.b != null && (u = u()) != null) {
            return u.Q;
        }
        return null;
    }

    private final void D() {
        ajbq ajbqVar = new ajbq(this);
        d(ajbqVar);
        post(new ahnu(this, ajbqVar, 19));
    }

    public final boolean A() {
        int i;
        ajbr ajbrVar = (ajbr) this.b;
        if (ajbrVar == null) {
            Log.e("SurveyViewPager", "Error, survey view pager adapter is null!");
            return false;
        }
        if (aizp.a() && u() != null && ajbrVar.o(this.c) != null && (ajbrVar.o(this.c).b & 1) != 0) {
            aprn aprnVar = ((ajbr) this.b).o(this.c).k;
            if (aprnVar == null) {
                aprnVar = aprn.a;
            }
            apqi apqiVar = aprnVar.d;
            if (apqiVar == null) {
                apqiVar = apqi.a;
            }
            int Z = a.Z(apqiVar.b);
            if (Z == 0 || Z != 5) {
                return false;
            }
            return true;
        }
        ahnz ahnzVar = aizp.c;
        if (aizp.c(aqqo.b(aizp.b))) {
            if (ajbrVar.b == aiyq.CARD) {
                i = 2;
            } else {
                i = 1;
            }
            if (this.c != ajbrVar.j() - i) {
                return false;
            }
            return true;
        }
        if (this.c != ajbrVar.j() - 2) {
            return false;
        }
        return true;
    }

    public final boolean B() {
        ahnz ahnzVar = aizp.c;
        if (aizp.c(aqqo.b(aizp.b))) {
            ajbr ajbrVar = (ajbr) this.b;
            if (ajbrVar == null) {
                Log.e("SurveyViewPager", "Error, survey view pager adapter is null!");
                return false;
            }
            if (((ajbn) ajbrVar.a.get(this.c)).b == 5) {
                return true;
            }
            return false;
        }
        if (this.c == this.b.j() - 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        switch (keyCode) {
            case 19:
            case 20:
            case 21:
            case 22:
                return false;
            default:
                switch (keyCode) {
                    case 268:
                    case 269:
                    case 270:
                    case 271:
                        return false;
                    default:
                        return super.dispatchKeyEvent(keyEvent);
                }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final void onMeasure(int i, int i2) {
        View view;
        boolean z;
        ahnz ahnzVar = aizp.c;
        if (!aizp.c(aqqo.a.get().a(aizp.b))) {
            if (getChildCount() == 0) {
                super.onMeasure(i, i2);
            }
            View C = C();
            if (C == null) {
                super.onMeasure(i, i2);
                return;
            }
            C.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = C.getMeasuredHeight();
            Rect rect = new Rect();
            C.getWindowVisibleDisplayFrame(rect);
            int height = rect.height() - C.findViewById(R.id.survey_question_header_logo_text).getHeight();
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.survey_card_vertical_margin);
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(measuredHeight, height - (dimensionPixelSize + dimensionPixelSize)), 1073741824));
            return;
        }
        View C2 = C();
        if (C2 == null) {
            super.onMeasure(i, i2);
            return;
        }
        ajbm ajbmVar = this.m;
        if (ajbmVar != null) {
            view = ajbmVar.d().findViewById(R.id.survey_controls_container);
        } else {
            view = null;
        }
        View view2 = view;
        ajbm ajbmVar2 = this.m;
        if (ajbmVar2 != null && !ajbmVar2.aM()) {
            z = false;
        } else {
            z = true;
        }
        super.onMeasure(i, aizj.b(this, C2, i, i2, C2.findViewById(R.id.survey_question_header_logo_text), view2, z));
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final aizv u() {
        ajbm ajbmVar = this.m;
        if (ajbmVar != null) {
            int i = this.c;
            for (cg cgVar : ajbmVar.a().l()) {
                if (ajbr.m(cgVar) == i && (cgVar instanceof aizv)) {
                    return (aizv) cgVar;
                }
            }
            return null;
        }
        return null;
    }

    public final apqz v() {
        aizv u = u();
        if (u == null) {
            return null;
        }
        return u.e();
    }

    public final void w() {
        k(this.b.j() - 1, true);
        u().o();
    }

    public final void x(int i) {
        k(i, true);
        u().o();
    }

    public final void y(String str) {
        aizv u = u();
        if (u != null) {
            u.q(str);
        } else {
            post(new ahnu(this, str, 18, null));
        }
    }

    public final boolean z() {
        if (this.c == 0) {
            return true;
        }
        return false;
    }

    public SurveyViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        D();
    }
}
