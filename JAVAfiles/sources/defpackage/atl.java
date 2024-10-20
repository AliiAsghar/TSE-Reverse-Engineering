package defpackage;

import android.os.Build;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atl {
    public static final AnonymousClass1 a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [atl$1] */
    static {
        AnonymousClass1 anonymousClass1;
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (d.F(lowerCase, "robolectric")) {
            anonymousClass1 = new atk() { // from class: atl.1
                @Override // defpackage.atk
                public final void a(ati atiVar) {
                }
            };
        } else {
            anonymousClass1 = null;
        }
        a = anonymousClass1;
    }
}
