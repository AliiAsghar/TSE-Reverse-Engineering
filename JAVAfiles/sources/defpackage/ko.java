package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ko extends ImageButton {
    private final ki a;
    private boolean b;
    private final asnn c;

    public ko(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        ki kiVar = this.a;
        if (kiVar != null) {
            kiVar.a();
        }
        asnn asnnVar = this.c;
        if (asnnVar != null) {
            asnnVar.h();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        if (this.c.l() && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ki kiVar = this.a;
        if (kiVar != null) {
            kiVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ki kiVar = this.a;
        if (kiVar != null) {
            kiVar.c(i);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        asnn asnnVar = this.c;
        if (asnnVar != null) {
            asnnVar.h();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        asnn asnnVar = this.c;
        if (asnnVar != null && drawable != null && !this.b) {
            asnnVar.j(drawable);
        }
        super.setImageDrawable(drawable);
        asnn asnnVar2 = this.c;
        if (asnnVar2 != null) {
            asnnVar2.h();
            if (!this.b) {
                this.c.g();
            }
        }
    }

    @Override // android.widget.ImageView
    public final void setImageLevel(int i) {
        super.setImageLevel(i);
        this.b = true;
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        this.c.k(i);
    }

    @Override // android.widget.ImageView
    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        asnn asnnVar = this.c;
        if (asnnVar != null) {
            asnnVar.h();
        }
    }

    public ko(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        pt.a(context);
        this.b = false;
        pr.d(this, getContext());
        ki kiVar = new ki(this);
        this.a = kiVar;
        kiVar.b(attributeSet, i);
        asnn asnnVar = new asnn(this);
        this.c = asnnVar;
        asnnVar.i(attributeSet, i);
    }
}
