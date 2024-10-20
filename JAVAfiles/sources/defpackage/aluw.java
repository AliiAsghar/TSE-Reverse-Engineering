package defpackage;

import defpackage.alvw;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aluw<API extends alvw<API>> {
    public final alww b;

    /* JADX INFO: Access modifiers changed from: protected */
    public aluw(alww alwwVar) {
        alwwVar.getClass();
        this.b = alwwVar;
    }

    public static void k(String str, alwv alwvVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(TimeUnit.NANOSECONDS.toMillis(alwvVar.d()))));
        sb.append(": logging error [");
        alzz.y(1, alwvVar.e(), sb);
        sb.append("]: ");
        sb.append(str);
        System.err.println(sb);
        System.err.flush();
    }

    public abstract alvw a(Level level);

    public final alvw c() {
        return a(Level.CONFIG);
    }

    public final alvw d() {
        return a(Level.FINE);
    }

    public final alvw e() {
        return a(Level.FINER);
    }

    public final alvw f() {
        return a(Level.FINEST);
    }

    public final alvw g() {
        return a(Level.INFO);
    }

    public final alvw h() {
        return a(Level.SEVERE);
    }

    public final alvw i() {
        return a(Level.WARNING);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String j() {
        return this.b.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean l(Level level) {
        return this.b.c(level);
    }
}
