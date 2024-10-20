package defpackage;

import java.text.MessageFormat;
import java.util.logging.Level;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqzy extends aqrt {
    private final aqzz a;

    public aqzy(aqzz aqzzVar, arhs arhsVar) {
        aqzzVar.getClass();
        this.a = aqzzVar;
        arhsVar.getClass();
    }

    public static Level c(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                return Level.FINEST;
            }
            return Level.FINE;
        }
        return Level.FINER;
    }

    private final void d(int i) {
        if (i != 1) {
            synchronized (this.a.b) {
            }
        }
    }

    @Override // defpackage.aqrt
    public final void a(int i, String str) {
        Level c = c(i);
        if (aqzz.a.isLoggable(c)) {
            aqzz.a(this.a.c, c, str);
        }
        d(i);
    }

    @Override // defpackage.aqrt
    public final void b(int i, String str, Object... objArr) {
        String str2;
        Level c = c(i);
        d(i);
        if (aqzz.a.isLoggable(c)) {
            str2 = MessageFormat.format(str, objArr);
        } else {
            str2 = null;
        }
        a(i, str2);
    }
}
