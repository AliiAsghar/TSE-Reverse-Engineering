package defpackage;

import android.view.View;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eec {
    public eec() {
    }

    public static int a(View view) {
        int importantForAutofill;
        importantForAutofill = view.getImportantForAutofill();
        return importantForAutofill;
    }

    public static void b(View view, int i) {
        view.setImportantForAutofill(8);
    }

    public static int g(int i) {
        if (i == 7) {
            return 6;
        }
        return 3;
    }

    public static long h(atal atalVar) {
        Object obj = atalVar.b;
        if (!(obj instanceof erm) && !(obj instanceof FileNotFoundException) && !(obj instanceof evu) && !(obj instanceof fjp)) {
            while (obj != null) {
                if (!(obj instanceof evi) || ((evi) obj).a != 2008) {
                    obj = ((Throwable) obj).getCause();
                } else {
                    return -9223372036854775807L;
                }
            }
            return Math.min((atalVar.a - 1) * 1000, 5000);
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return false;
    }

    public boolean f() {
        return false;
    }

    public eec(byte[] bArr) {
    }

    public void c(boolean z) {
    }

    public void d(boolean z) {
    }
}
