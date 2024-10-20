package defpackage;

import android.content.Context;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class msj {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/api/messaging/identity/MessagingIdentityDifferenceReporter");
    public final Context b;
    public final apwt c;
    public final apwt d;
    public final apwt e;
    public final apwt f;
    private final apwt g;

    public msj(Context context, apwt apwtVar, apwt apwtVar2, apwt apwtVar3, apwt apwtVar4, apwt apwtVar5) {
        this.b = context;
        this.c = apwtVar;
        this.d = apwtVar2;
        this.g = apwtVar3;
        this.e = apwtVar4;
        this.f = apwtVar5;
    }

    public static aomj b(qqq qqqVar, String str) {
        String str2;
        aomi aomiVar = aomi.CONFIRMED_UPLOAD_SAFE_USER_DATA;
        if (str == null) {
            str2 = "null";
        } else {
            str2 = qqqVar.a(str).b;
        }
        return new aomj(aomiVar, str2);
    }

    public final yjt a(String str) {
        if (str != null && str.length() == 2) {
            yjt yjtVar = new yjt(((anhn) this.g.b()).a(str.toUpperCase(Locale.US)));
            if (!yjtVar.a()) {
                return yjtVar;
            }
        }
        return new yjt(0);
    }
}
