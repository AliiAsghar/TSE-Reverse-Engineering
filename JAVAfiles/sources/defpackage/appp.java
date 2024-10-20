package defpackage;

import android.util.Log;
import com.google.research.xeno.effect.UserInteractionManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class appp implements appo {
    private final /* synthetic */ int a;

    @Override // defpackage.appo
    public final void a() {
        if (this.a != 0) {
            Log.w(UserInteractionManager.a, "Sending touch event to user interaction manager which is released");
        } else {
            Log.w(UserInteractionManager.a, "Sending gesture event to user interaction manager which is released");
        }
    }
}
