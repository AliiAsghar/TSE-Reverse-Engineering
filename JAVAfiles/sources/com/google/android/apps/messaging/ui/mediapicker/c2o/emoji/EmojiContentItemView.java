package com.google.android.apps.messaging.ui.mediapicker.c2o.emoji;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.aafl;
import defpackage.aaqf;
import defpackage.aaqi;
import defpackage.aarg;
import defpackage.aarh;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class EmojiContentItemView extends aarh implements aaqi {
    public TextView a;
    public aarg b;
    public aaqf c;

    public EmojiContentItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.aaqi
    public final int a() {
        return 1;
    }

    @Override // defpackage.aaqi
    public final void b(aaqf aaqfVar) {
        this.c = aaqfVar;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.emoji_text);
        setOnClickListener(new aafl(this, 17));
        setClipToOutline(true);
        this.a.setTextColor(getContext().getColor(R.color.google_grey900));
    }
}
