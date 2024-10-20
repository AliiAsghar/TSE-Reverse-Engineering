package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jui implements juv {
    private static final alvi b = alvi.m("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/LoggingShortcutHandler");
    private final jgq c;
    private final juv d;
    private final jus e;

    public jui(jgq jgqVar, juv juvVar, jus jusVar) {
        jgqVar.getClass();
        this.c = jgqVar;
        this.d = juvVar;
        this.e = jusVar;
    }

    @Override // defpackage.juv
    public final int a() {
        return this.d.a();
    }

    @Override // defpackage.juv
    public final afxb b() {
        return this.d.b();
    }

    @Override // defpackage.juv
    public final List c() {
        return this.d.c();
    }

    @Override // defpackage.juv
    public final void d(View view) {
        alvw d = b.d();
        d.X(alwp.a, "BugleComposeRow2");
        ((alvg) d.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/LoggingShortcutHandler", "handleShortcutClick", 30, "LoggingShortcutHandler.kt")).t("Handling shortcut click for %s", this.e);
        this.d.d(view);
        this.c.c(this.e);
    }

    @Override // defpackage.juv
    public final boolean e() {
        return this.d.e();
    }
}
