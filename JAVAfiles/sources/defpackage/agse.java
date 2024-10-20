package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.hats20.view.ScrollViewWithSizeCallback;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class agse extends agrw {
    private ImageView ag;
    public View ah;
    public View ai;
    public View aj;
    public ScrollViewWithSizeCallback ak;
    private TextView d;
    private final ajay al = new ajay(this, 1);
    private boolean e = false;

    @Override // defpackage.cg
    public View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.hats_survey_question_with_scrollable_content, viewGroup, false);
        this.ah = inflate.findViewById(R.id.hats_lib_survey_question_header_logo_text);
        TextView textView = (TextView) inflate.findViewById(R.id.hats_lib_survey_question_text);
        this.d = textView;
        textView.setText(agrv.a(aM()));
        this.d.setContentDescription(aM());
        this.aj = r();
        ScrollViewWithSizeCallback scrollViewWithSizeCallback = (ScrollViewWithSizeCallback) inflate.findViewById(R.id.hats_survey_question_scroll_view);
        this.ak = scrollViewWithSizeCallback;
        scrollViewWithSizeCallback.addView(this.aj);
        ScrollViewWithSizeCallback scrollViewWithSizeCallback2 = this.ak;
        ajay ajayVar = this.al;
        scrollViewWithSizeCallback2.a = ajayVar;
        if (!this.e && scrollViewWithSizeCallback2 != null) {
            scrollViewWithSizeCallback2.getViewTreeObserver().addOnScrollChangedListener(ajayVar);
            this.e = true;
        }
        ImageView imageView = (ImageView) inflate.findViewById(R.id.hats_lib_prompt_banner_logo);
        this.ag = imageView;
        agkx.m(imageView, this.b);
        this.ai = ((cj) viewGroup.getContext()).findViewById(R.id.hats_lib_survey_controls_container);
        return inflate;
    }

    public abstract String aM();

    @Override // defpackage.agrw
    public final String e() {
        return this.d.getText().toString();
    }

    @Override // defpackage.cg
    public final void h() {
        ScrollViewWithSizeCallback scrollViewWithSizeCallback;
        if (this.e && (scrollViewWithSizeCallback = this.ak) != null) {
            scrollViewWithSizeCallback.getViewTreeObserver().removeOnScrollChangedListener(this.al);
            this.e = false;
        }
        super.h();
    }

    @Override // defpackage.agrw
    public final void q(String str) {
        this.d.setText(agrv.a(str));
        this.d.setContentDescription(aM());
    }

    public abstract View r();
}
