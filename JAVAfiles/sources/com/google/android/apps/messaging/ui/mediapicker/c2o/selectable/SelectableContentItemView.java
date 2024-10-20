package com.google.android.apps.messaging.ui.mediapicker.c2o.selectable;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem;
import defpackage.aaqf;
import defpackage.aaqi;
import defpackage.aarv;
import defpackage.aaul;
import defpackage.imv;
import defpackage.yai;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SelectableContentItemView extends aaul implements aaqi {
    public yai d;
    public TextView e;
    public View f;
    public MediaContentItem g;
    public imv h;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public aaqf m;
    protected final View.OnClickListener n;

    public SelectableContentItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = new aarv(this, 14);
        this.k = false;
        this.l = -1;
    }

    public int a() {
        return 4;
    }

    @Override // defpackage.aaqi
    public final void b(aaqf aaqfVar) {
        this.m = aaqfVar;
    }

    public final void f(int i, boolean z) {
        this.l = i;
        this.k = z;
        clearAnimation();
        TextView textView = this.e;
        if (textView != null && this.f != null) {
            if (this.k) {
                textView.setText(Integer.toString(this.l + 1));
                this.d.m(this, 0.88f);
                this.e.setVisibility(0);
                this.f.setBackgroundColor(this.j);
                return;
            }
            this.d.m(this, 1.0f);
            this.e.setVisibility(8);
            this.f.setBackgroundColor(this.i);
        }
    }

    @Override // android.view.View
    public final boolean isSelected() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.e = (TextView) findViewById(R.id.content_selected_index_overlay);
        this.f = findViewById(R.id.content_selected_tint);
        this.i = getResources().getColor(R.color.c2o_content_item_tint_start_color);
        this.j = getResources().getColor(R.color.c2o_content_item_tint_end_color);
        setClipToOutline(true);
    }
}
