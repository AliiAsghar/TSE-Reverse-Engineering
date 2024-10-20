package defpackage;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aef {
    public static final boolean a(bwj bwjVar) {
        if ((((Configuration) bwjVar.g(AndroidCompositionLocals_androidKt.a)).uiMode & 48) == 32) {
            return true;
        }
        return false;
    }
}
