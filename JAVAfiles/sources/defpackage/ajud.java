package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ajud implements ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ajud(aazt aaztVar, int i) {
        this.b = i;
        this.a = aaztVar;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        if (this.b != 0) {
            if (z) {
                ((aazt) this.a).l();
                return;
            }
            return;
        }
        Object obj = this.a;
        ajue ajueVar = (ajue) obj;
        ajul a = ajul.a(ajueVar.getContext());
        String shortString = ajueVar.a.getComponentName().toShortString();
        Activity activity = ajueVar.a;
        Bundle bundle = new Bundle();
        bundle.putString("packageName", activity.getComponentName().getPackageName());
        bundle.putString("screenName", activity.getComponentName().getShortClassName());
        bundle.putInt("hash", obj.hashCode());
        bundle.putBoolean("focus", z);
        bundle.putLong("timeInMillis", System.currentTimeMillis());
        a.e(shortString, bundle);
    }

    public /* synthetic */ ajud(ajue ajueVar, int i) {
        this.b = i;
        this.a = ajueVar;
    }
}
