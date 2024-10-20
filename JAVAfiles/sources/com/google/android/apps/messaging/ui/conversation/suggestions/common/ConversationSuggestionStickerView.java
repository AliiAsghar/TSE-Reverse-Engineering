package com.google.android.apps.messaging.ui.conversation.suggestions.common;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import defpackage.aafv;
import defpackage.akms;
import defpackage.xvy;
import defpackage.xze;
import defpackage.yyb;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConversationSuggestionStickerView extends aafv {
    public static final xze a = xze.g("Bugle", "ConversationSuggestionStickerView");
    public final Context b;
    public ImageView c;
    public xvy d;
    public akms e;
    private Path f;
    private int g;
    private int h;

    public ConversationSuggestionStickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = context;
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.save();
        this.f.reset();
        Rect rect = new Rect(0, 0, getWidth(), getHeight());
        int i = this.h;
        rect.inset(i, i);
        Path path = this.f;
        float f = rect.left;
        float f2 = rect.top;
        float f3 = rect.right;
        float f4 = rect.bottom;
        float f5 = this.g;
        path.addRoundRect(f, f2, f3, f4, f5, f5, Path.Direction.CW);
        canvas.getClipBounds(rect);
        canvas.clipPath(this.f);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.c = (ImageView) findViewById(R.id.sticker_image);
        this.d = new xvy(this, R.id.sticker_debug_info_view_stub, R.id.sticker_debug_info_view);
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.conversation_suggestion_sticker_start_end_inset);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.conversation_suggestion_sticker_top_bottom_inset);
        setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        this.c.setAdjustViewBounds(true);
        setClipToOutline(true);
        setBackground(resources.getDrawable(R.drawable.conversation_suggestion_sticker_background_v2, getContext().getTheme()));
        setForeground(resources.getDrawable(yyb.bx(getContext(), android.R.attr.selectableItemBackground).resourceId, getContext().getTheme()));
        this.f = new Path();
        this.g = resources.getDimensionPixelSize(R.dimen.conversation_suggestion_sticker_background_corner_clip_outline_radius_v2);
        this.h = (int) TypedValue.applyDimension(1, 1.0f, getResources().getDisplayMetrics());
    }
}
