package com.google.android.apps.messaging.ui.conversation.richcard;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCard;
import defpackage.aack;
import defpackage.aaeg;
import defpackage.aael;
import defpackage.aafi;
import defpackage.aafw;
import defpackage.armf;
import defpackage.qyh;
import defpackage.yai;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class RichCardContentContainer extends aaeg {
    public TextView a;
    public TextView b;
    public LinearLayout c;
    public boolean d;
    public aael e;
    public qyh f;
    public armf g;
    public ConversationRichCardView h;

    public RichCardContentContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected static final int d(TextView textView, int i, int i2) {
        int lineCount = textView.getLineCount();
        while (textView.getVisibility() != 8 && lineCount > 1 && i2 > i) {
            int measuredHeight = textView.getMeasuredHeight();
            lineCount--;
            textView.setMaxLines(lineCount);
            textView.measure(yai.c(textView), yai.b(textView));
            i2 -= measuredHeight - textView.getMeasuredHeight();
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final aafw f(aack aackVar) {
        if (aackVar == null) {
            return null;
        }
        return new aafi(aackVar, aackVar.a());
    }

    public final boolean c() {
        if (this.a.getVisibility() != 8 && this.a.getVisibility() != 4) {
            return false;
        }
        if (this.b.getVisibility() != 8 && this.b.getVisibility() != 4) {
            return false;
        }
        if (this.c.getVisibility() != 8 && this.c.getVisibility() != 4) {
            return false;
        }
        return true;
    }

    public final void e(TextView textView, String str) {
        if (TextUtils.isEmpty(str)) {
            textView.setText("");
            textView.setVisibility(8);
        } else {
            textView.setMaxLines(Integer.MAX_VALUE);
            textView.setText(this.f.c(str, null));
            textView.setVisibility(0);
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.rich_card_title);
        this.b = (TextView) findViewById(R.id.rich_card_description);
        this.c = (LinearLayout) findViewById(R.id.rich_card_suggestions_container);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 0));
        if (!this.d) {
            return;
        }
        int measuredHeight = getMeasuredHeight();
        GeneralPurposeRichCard generalPurposeRichCard = this.h.h;
        generalPurposeRichCard.getClass();
        int i4 = generalPurposeRichCard.layout.desiredHeight;
        if (i4 == -1) {
            z = true;
        } else {
            z = false;
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.rich_card_max_height);
        if (z) {
            i4 = dimensionPixelOffset + 3;
        }
        RichCardMediaAttachmentView richCardMediaAttachmentView = this.h.k;
        if (richCardMediaAttachmentView == null) {
            i3 = 0;
        } else {
            i3 = richCardMediaAttachmentView.getLayoutParams().height;
        }
        int max = Math.max(0, i4 - i3);
        if (max != 0 && (!c() || !z)) {
            if (measuredHeight > max) {
                measuredHeight = d(this.a, max, d(this.b, max, measuredHeight));
                int childCount = this.c.getChildCount() - 1;
                while (true) {
                    if (childCount < 0 || measuredHeight <= max) {
                        break;
                    }
                    int measuredHeight2 = this.c.getMeasuredHeight();
                    if (childCount == 0) {
                        this.c.setVisibility(8);
                        measuredHeight -= measuredHeight2;
                        break;
                    }
                    View childAt = this.c.getChildAt(childCount);
                    if (childAt != null && childAt.getVisibility() != 8) {
                        childAt.setVisibility(8);
                        LinearLayout linearLayout = this.c;
                        linearLayout.measure(yai.c(linearLayout), yai.b(this.c));
                        measuredHeight -= measuredHeight2 - this.c.getMeasuredHeight();
                    }
                    childCount--;
                }
                if (this.c.getVisibility() == 8 && getPaddingBottom() == 0) {
                    int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.rich_card_edge_padding);
                    setPaddingRelative(getPaddingStart(), getPaddingTop(), getPaddingEnd(), dimensionPixelSize);
                    measuredHeight += dimensionPixelSize;
                }
                if (this.b.getVisibility() != 8 && measuredHeight > max) {
                    measuredHeight -= this.b.getMeasuredHeight();
                    this.b.setVisibility(8);
                }
                if (this.a.getVisibility() != 8 && measuredHeight > max) {
                    measuredHeight -= this.b.getMeasuredHeight();
                    this.a.setVisibility(8);
                }
            }
            if (!z && this.d && this.c.getVisibility() == 0) {
                LinearLayout linearLayout2 = this.c;
                linearLayout2.measure(yai.d(linearLayout2), View.MeasureSpec.makeMeasureSpec((max - measuredHeight) + this.c.getMeasuredHeight(), 1073741824));
            } else {
                max = measuredHeight;
            }
            setMeasuredDimension(View.MeasureSpec.getSize(i), max);
            return;
        }
        setMeasuredDimension(0, 0);
    }
}
