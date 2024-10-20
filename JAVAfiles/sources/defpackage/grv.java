package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class grv implements gru {
    private final /* synthetic */ int c;
    public static final grv b = new grv(1);
    public static final grv a = new grv(0);

    private grv(int i) {
        this.c = i;
    }

    @Override // defpackage.gru
    public final float a(Context context) {
        WindowMetrics currentWindowMetrics;
        float density;
        if (this.c == 0) {
            return context.getResources().getDisplayMetrics().density;
        }
        currentWindowMetrics = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
        density = currentWindowMetrics.getDensity();
        return density;
    }

    @Override // defpackage.gru
    public final float b(Configuration configuration, WindowMetrics windowMetrics) {
        float density;
        if (this.c != 0) {
            density = windowMetrics.getDensity();
            return density;
        }
        return configuration.densityDpi / 160.0f;
    }
}
