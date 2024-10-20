package defpackage;

import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.CategoryToggleView;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aaqd implements aaqo {
    public aapu h;
    protected CategoryToggleView i;
    protected final int j;

    /* JADX INFO: Access modifiers changed from: protected */
    public aaqd(int i) {
        this.j = i;
    }

    public abstract int a();

    public abstract int b();

    protected abstract int c();

    public Set d() {
        return Collections.emptySet();
    }

    public void e(View view) {
        CategoryToggleView categoryToggleView = (CategoryToggleView) view.findViewById(R.id.c2o_category_toggle);
        if (categoryToggleView == null) {
            return;
        }
        int c = c();
        this.i = categoryToggleView;
        int i = -1;
        if (c == -1) {
            categoryToggleView.setVisibility(8);
            return;
        }
        categoryToggleView.setVisibility(0);
        this.i.a.setImageResource(c);
        CategoryToggleView categoryToggleView2 = this.i;
        categoryToggleView2.a.setAlpha(1.0f);
        TypedArray obtainStyledAttributes = categoryToggleView2.getContext().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        if (obtainStyledAttributes != null) {
            categoryToggleView2.b.setForeground(obtainStyledAttributes.getDrawable(0));
            obtainStyledAttributes.recycle();
        }
        CategoryToggleView categoryToggleView3 = this.i;
        categoryToggleView3.c = this;
        ViewGroup.LayoutParams layoutParams = categoryToggleView3.getLayoutParams();
        if (a() != -2) {
            i = categoryToggleView.getResources().getDimensionPixelSize(a());
        }
        layoutParams.height = i;
        int b = b();
        FrameLayout frameLayout = this.i.b;
        frameLayout.setImportantForAccessibility(1);
        frameLayout.setContentDescription(categoryToggleView.getResources().getString(b));
    }

    public abstract int m();

    /* JADX INFO: Access modifiers changed from: protected */
    public int n() {
        return R.layout.compose2o_item_placeholder;
    }

    public void q(aapu aapuVar) {
        this.h = aapuVar;
    }

    public void g() {
    }

    public void p() {
    }

    public void f(Bundle bundle) {
    }

    public void h(Bundle bundle) {
    }

    public void l(aaas aaasVar) {
    }

    public void o(Configuration configuration) {
    }
}
