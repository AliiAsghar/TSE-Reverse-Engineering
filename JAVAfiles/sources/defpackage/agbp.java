package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import com.google.android.apps.messaging.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agbp implements ViewTreeObserver.OnGlobalLayoutListener, View.OnApplyWindowInsetsListener {
    public static final alvi a = alvi.m("com/google/android/libraries/compose/ui/keyboard/detector/KeyboardLayoutListener");
    public final Activity b;
    public final View c;
    public final int d;
    public final Rect e;
    public int f;
    public int g;
    public agar h;
    private final afke i;
    private final Map j;

    public agbp(Activity activity, afke afkeVar, View view) {
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.minimum_keyboard_height);
        this.b = activity;
        this.i = afkeVar;
        this.c = view;
        this.d = dimensionPixelSize;
        this.e = new Rect();
        this.j = new LinkedHashMap();
    }

    public final agbo a() {
        Integer valueOf = Integer.valueOf(this.c.getResources().getConfiguration().orientation);
        Map map = this.j;
        Object obj = map.get(valueOf);
        if (obj == null) {
            agbo agboVar = new agbo(this.d);
            map.put(valueOf, agboVar);
            obj = agboVar;
        }
        return (agbo) obj;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        view.getClass();
        windowInsets.getClass();
        return (WindowInsets) this.i.f("KeyboardLayoutListener#onApplyWindowInsets", new afzu(windowInsets, this, 4, null));
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.i.f("KeyboardLayoutListener#onGlobalLayout", new afzg(this, 11));
    }
}
