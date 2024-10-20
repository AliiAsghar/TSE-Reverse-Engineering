package defpackage;

import android.util.Log;
import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alyi extends alxy {
    private final Level a;
    private final boolean b;
    private final Set c;
    private final alxh d;
    private final int e;

    public alyi(String str, int i, Level level, boolean z, Set set, alxh alxhVar) {
        super(str);
        this.e = 2;
        this.a = level;
        this.b = z;
        this.c = set;
        this.d = alxhVar;
    }

    @Override // defpackage.alww
    public final void b(alwv alwvVar) {
        String str = (String) alwvVar.i().d(alwp.a);
        if (str == null) {
            str = d();
        }
        if (str == null) {
            str = alwvVar.e().b();
            int indexOf = str.indexOf(36, str.lastIndexOf(46));
            if (indexOf >= 0) {
                str = str.substring(0, indexOf);
            }
        }
        String x = alzz.x(str);
        Level m = alwvVar.m();
        if (!this.b) {
            int w = alzz.w(m);
            if (!Log.isLoggable(x, w) && !Log.isLoggable("all", w)) {
                return;
            }
        }
        alyj.e(alwvVar, x, 2, this.a, this.c, this.d);
    }

    @Override // defpackage.alww
    public final boolean c(Level level) {
        return true;
    }
}
