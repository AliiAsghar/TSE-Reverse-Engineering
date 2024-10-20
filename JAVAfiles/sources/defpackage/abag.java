package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class abag extends FrameLayout implements View.OnClickListener {
    protected View a;
    protected abai b;

    public abag(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected abstract View a();

    protected abstract void b();

    public final void c() {
        if (this.b != null) {
            b();
            setVisibility(0);
            return;
        }
        throw new IllegalStateException("bind() must be called before show the popup.");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.a) {
            this.b.j();
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        View a = a();
        this.a = a;
        if (a != null) {
            a.setOnClickListener(this);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }
}
