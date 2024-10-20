package com.google.android.apps.messaging.ui.common;

import android.content.Context;
import android.support.v7.widget.SearchView;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class BugleSearchView extends SearchView {
    public BugleSearchView(Context context) {
        super(getThemedContext(context));
    }

    private static Context getThemedContext(Context context) {
        return new ContextThemeWrapper(context, R.style.BugleSearchViewStyle);
    }

    public EditText getSearchTextView() {
        return (EditText) findViewById(R.id.search_src_text);
    }

    public void setZeroEffectivePadding() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.search_edit_frame);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams.setMargins(0, 0, 0, 0);
        linearLayout.setLayoutParams(layoutParams);
        findViewById(R.id.search_src_text).setPadding(0, 0, 0, 0);
    }

    public BugleSearchView(Context context, AttributeSet attributeSet) {
        super(getThemedContext(context), attributeSet);
    }
}
