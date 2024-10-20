package com.google.android.libraries.hats20;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.util.Patterns;
import android.view.MotionEvent;
import android.view.ViewPropertyAnimator;
import android.view.inputmethod.InputMethodManager;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.hats20.view.SurveyViewPager;
import defpackage.a;
import defpackage.agkx;
import defpackage.agqd;
import defpackage.agri;
import defpackage.agrn;
import defpackage.agsa;
import defpackage.agsg;
import defpackage.ahiy;
import defpackage.akro;
import defpackage.aock;
import defpackage.aocl;
import defpackage.aocn;
import defpackage.aocp;
import defpackage.aorr;
import defpackage.aors;
import defpackage.aort;
import defpackage.aoyj;
import defpackage.aozy;
import defpackage.apag;
import defpackage.apao;
import defpackage.apax;
import defpackage.cg;
import defpackage.ex;
import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class SurveyPromptActivity extends ex {
    private String A;
    private LinearLayout B;
    private TextView C;
    private TextView D;
    private int E;
    private boolean F;
    private int H;
    private boolean I;
    private ahiy J;
    public RectF o;
    public SurveyViewPager q;
    public agri r;
    public FrameLayout s;
    public LinearLayout t;
    public agsg v;
    public boolean w;
    public akro x;
    private aorr y;
    private aocp z;
    public final Point n = new Point(0, 0);
    public int p = 0;
    public String u = "";
    private final Handler G = new Handler();

    public static void D(Activity activity, String str, aorr aorrVar, aocp aocpVar, agri agriVar, Integer num, boolean z, boolean z2, int i) {
        Intent intent = new Intent();
        intent.setClassName(activity, "com.google.android.libraries.hats20.SurveyPromptActivity");
        intent.putExtra("SiteId", str);
        intent.putExtra("Survey", aorrVar.toByteArray());
        intent.putExtra("SurveyPayload", aocpVar.toByteArray());
        intent.putExtra("AnswerBeacon", agriVar);
        intent.putExtra("IsFullWidth", z);
        intent.putExtra("IgnoreFirstQuestion", z2);
        intent.putExtra("PromplessRatingLogo", i);
        Log.d("HatsLibSurveyActivity", String.format("Starting survey for client activity: %s", activity.getClass().getCanonicalName()));
        if (num == null) {
            activity.startActivity(intent);
        } else {
            activity.startActivityForResult(intent, num.intValue());
        }
    }

    private final int F() {
        SurveyViewPager surveyViewPager = this.q;
        if (surveyViewPager != null) {
            int i = surveyViewPager.c;
            if (this.I) {
                return i + 1;
            }
            return i;
        }
        return 0;
    }

    private final String G() {
        String str;
        aorr aorrVar = this.y;
        if ((aorrVar.b & 256) != 0) {
            if (Patterns.WEB_URL.matcher(aorrVar.j.toLowerCase()).matches() && (URLUtil.isHttpUrl(this.y.j) || URLUtil.isHttpsUrl(this.y.j))) {
                Uri parse = Uri.parse(this.y.j);
                try {
                    if (parse.getQuery() == null) {
                        str = "";
                    } else {
                        str = URLEncoder.encode(parse.getQuery(), "utf-8");
                    }
                    return new URI(parse.getScheme(), parse.getAuthority(), parse.getPath(), str).toString();
                } catch (UnsupportedEncodingException | URISyntaxException e) {
                    Log.e("HatsLibSurveyActivity", e.getMessage());
                }
            }
        }
        return "";
    }

    private final void H(boolean z) {
        float f;
        Button button = (Button) findViewById(R.id.hats_lib_next);
        if (button != null && button.isEnabled() != z) {
            if (true != z) {
                f = 0.3f;
            } else {
                f = 1.0f;
            }
            button.setAlpha(f);
            button.setEnabled(z);
        }
    }

    private final void I(boolean z) {
        int i;
        TextView textView = this.C;
        textView.announceForAccessibility(textView.getContentDescription());
        ViewPropertyAnimator duration = this.C.animate().alpha(1.0f).setDuration(350L);
        if (true != z) {
            i = 0;
        } else {
            i = 700;
        }
        long j = i;
        duration.setStartDelay(j);
        this.C.setVisibility(0);
        if (!this.u.isEmpty()) {
            this.D.animate().alpha(1.0f).setDuration(350L).setStartDelay(j);
            this.D.setVisibility(0);
        } else {
            agrn.c().b().a = true;
            this.G.postDelayed(new agqd(this, 3), 2400L);
        }
    }

    private final void J() {
        Button button = (Button) findViewById(R.id.hats_lib_next);
        if (button != null && this.q.w()) {
            button.setText(R.string.hats_lib_submit);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean K(int i) {
        if (i >= this.z.b.size()) {
            return false;
        }
        aocl aoclVar = (aocl) this.z.b.get(i);
        ArrayList<String> arrayList = new ArrayList();
        int T = a.T(aoclVar.d);
        if (T == 0) {
            T = 1;
        }
        int i2 = T - 2;
        if (i2 != 1 && i2 != 2) {
            if (i2 == 4) {
                aocn aocnVar = aoclVar.f;
                if (aocnVar == null) {
                    aocnVar = aocn.a;
                }
                apao apaoVar = aocnVar.d;
                int i3 = 0;
                while (i3 < apaoVar.size()) {
                    int i4 = i3 + 1;
                    if (((Integer) apaoVar.get(i3)).intValue() == 0) {
                        arrayList.add(String.valueOf(i4));
                    }
                    i3 = i4;
                }
            }
        } else {
            for (aock aockVar : aoclVar.e) {
                if (aockVar.c == 0) {
                    arrayList.add(aockVar.b);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        apax apaxVar = ((aors) this.r.b.get(i)).d;
        for (String str : arrayList) {
            Iterator<E> it = apaxVar.iterator();
            while (it.hasNext()) {
                if (str.equals((String) it.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void A(boolean z, cg cgVar) {
        if (agsg.m(cgVar) == this.q.c) {
            H(z);
        }
    }

    public final void B() {
        this.q.u().Q.sendAccessibilityEvent(32);
    }

    public final void C(String str) {
        this.r.c(str);
        this.J.d(this.r);
    }

    public final void E() {
        int i;
        int i2;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.s.getLayoutParams();
        int i3 = agkx.l(this).x;
        int i4 = agkx.l(this).y;
        Resources resources = getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i = resources.getDimensionPixelSize(identifier);
        } else {
            i = 0;
        }
        int round = (i4 - i) - Math.round(this.o.top + this.o.bottom);
        if (!this.F) {
            i3 = akro.c(this.x);
        }
        Point point = new Point(i3, Math.min(round, this.n.y));
        layoutParams.width = point.x - Math.round(this.o.left + this.o.right);
        if (point.y > 0) {
            i2 = point.y;
        } else {
            i2 = this.E;
        }
        layoutParams.height = i2;
        this.s.setAlpha(1.0f);
        layoutParams.setMargins(Math.round(this.o.left), Math.round(this.o.top), Math.round(this.o.right), Math.round(this.o.bottom));
        this.s.setLayoutParams(layoutParams);
    }

    @Override // android.app.Activity
    public final void finish() {
        if (getCallingActivity() != null) {
            aozy createBuilder = aort.a.createBuilder();
            aorr aorrVar = this.y;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            aort aortVar = (aort) apagVar;
            aorrVar.getClass();
            aortVar.d = aorrVar;
            int i = 2;
            aortVar.b |= 2;
            List list = this.r.b;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            aort aortVar2 = (aort) createBuilder.b;
            apax apaxVar = aortVar2.e;
            if (!apaxVar.c()) {
                aortVar2.e = apag.mutableCopy(apaxVar);
            }
            aoyj.addAll(list, aortVar2.e);
            if (true == "a".equals(this.r.a.getString("t"))) {
                i = 1;
            }
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            aort aortVar3 = (aort) createBuilder.b;
            aortVar3.c = i;
            aortVar3.b = 1 | aortVar3.b;
            setResult(-1, new Intent().putExtra("ExtraResultSurveyResponse", ((aort) createBuilder.s()).toByteArray()).putExtra("ExtraResultAnswerBeaconString", this.r.a(false).getQuery()));
        }
        super.finish();
    }

    @Override // defpackage.re, android.app.Activity
    public final void onBackPressed() {
        C("o");
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x023a  */
    @Override // defpackage.cj, defpackage.re, defpackage.dx, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.hats20.SurveyPromptActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.ex, defpackage.cj, android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        if (isFinishing()) {
            agrn.c().a().a();
        }
        this.G.removeCallbacks(null);
    }

    @Override // defpackage.ex, defpackage.cj, android.app.Activity
    protected final void onPostResume() {
        super.onPostResume();
        if (this.w && this.u.isEmpty()) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.re, defpackage.dx, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("CurrentQuestionIndex", F());
        bundle.putBoolean("IsSubmitting", this.w);
        bundle.putParcelable("AnswerBeacon", this.r);
    }

    @Override // android.app.Activity
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = new Rect();
            this.s.getGlobalVisibleRect(rect);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY()) && this.w) {
                Log.d("HatsLibSurveyActivity", "User clicked outside of survey root container when showing thank-you page. Closing.");
                finish();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void y() {
        SurveyViewPager surveyViewPager = this.q;
        if (surveyViewPager != null && (surveyViewPager.u() instanceof agsa)) {
            agsa agsaVar = (agsa) this.q.u();
            ((InputMethodManager) agsaVar.fe().getSystemService("input_method")).hideSoftInputFromWindow(agsaVar.d.getWindowToken(), 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z() {
        /*
            Method dump skipped, instructions count: 629
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.hats20.SurveyPromptActivity.z():void");
    }
}
