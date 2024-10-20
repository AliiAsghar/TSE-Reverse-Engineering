package com.google.android.setupdesign.view;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatTextView;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.MovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.TextAppearanceSpan;
import android.text.style.TypefaceSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;
import defpackage.ajgl;
import defpackage.ajvq;
import defpackage.ajvs;
import defpackage.ajvu;
import defpackage.ajwm;
import defpackage.eek;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class RichTextView extends AppCompatTextView {
    public static Typeface a;
    private ajvq b;

    public RichTextView(Context context) {
        super(context);
        a();
    }

    private final void a() {
        if (isInEditMode()) {
            return;
        }
        ajvq ajvqVar = new ajvq();
        this.b = ajvqVar;
        eek.n(this, ajvqVar);
    }

    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        for (Drawable drawable : getCompoundDrawablesRelative()) {
            if (drawable != null && drawable.setState(drawableState)) {
                invalidateDrawable(drawable);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        MovementMethod movementMethod = getMovementMethod();
        if (movementMethod instanceof ajwm) {
            ajwm ajwmVar = (ajwm) movementMethod;
            if (ajwmVar.b == motionEvent) {
                return ajwmVar.a;
            }
        }
        return onTouchEvent;
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        Object ajvuVar;
        TypefaceSpan typefaceSpan;
        Context context = getContext();
        boolean z = true;
        if (charSequence instanceof Spanned) {
            SpannableString spannableString = new SpannableString(charSequence);
            for (Annotation annotation : (Annotation[]) spannableString.getSpans(0, spannableString.length(), Annotation.class)) {
                String key = annotation.getKey();
                if ("textAppearance".equals(key)) {
                    int identifier = context.getResources().getIdentifier(annotation.getValue(), "style", context.getPackageName());
                    if (identifier == 0) {
                        Log.w("RichTextView", "Cannot find resource: 0");
                        identifier = 0;
                    }
                    ajgl.u(spannableString, annotation, new TextAppearanceSpan(context, identifier));
                } else if ("link".equals(key)) {
                    if (ajgl.x()) {
                        annotation.getValue();
                        ajvuVar = new ajvs(context);
                    } else {
                        annotation.getValue();
                        ajvuVar = new ajvu();
                    }
                    if (a != null) {
                        typefaceSpan = new TypefaceSpan(a);
                    } else {
                        typefaceSpan = new TypefaceSpan("sans-serif-medium");
                    }
                    ajgl.u(spannableString, annotation, ajvuVar, typefaceSpan);
                }
            }
            charSequence = spannableString;
        }
        super.setText(charSequence, bufferType);
        if (!(charSequence instanceof Spanned) || ((ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class)).length <= 0) {
            z = false;
        }
        if (z) {
            setMovementMethod(new ajwm());
        } else {
            setMovementMethod(null);
        }
        setFocusable(z);
        setRevealOnFocusHint(false);
        setFocusableInTouchMode(z);
    }

    public RichTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }
}
