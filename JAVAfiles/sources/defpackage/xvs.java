package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xvs {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic");
    public final ykw b;
    public final anen c;
    public final wwn d;
    public final vau e;
    public final anen f;
    public final anen g;
    public final pmh h;
    public final vjs i;
    private final xvu j;
    private final ylo k;

    public xvs(ykw ykwVar, xvu xvuVar, ylo yloVar, anen anenVar, wwn wwnVar, vau vauVar, vjs vjsVar, anen anenVar2, anen anenVar3, pmh pmhVar) {
        this.b = ykwVar;
        this.j = xvuVar;
        this.k = yloVar;
        this.c = anenVar;
        this.d = wwnVar;
        this.e = vauVar;
        this.i = vjsVar;
        this.f = anenVar2;
        this.g = anenVar3;
        this.h = pmhVar;
    }

    public static boolean c() {
        return ((Boolean) utw.X.e()).booleanValue();
    }

    @Deprecated
    public static boolean e() {
        return ((Boolean) xvt.a.e()).booleanValue();
    }

    public final boolean a() {
        return this.j.f();
    }

    @Deprecated
    public final boolean b() {
        ylo yloVar = this.k;
        if (((ykw) yloVar.b.b()).q("fast_track_prompt_dismissed", false)) {
            xyo a2 = ylo.a.a();
            a2.H("Don't show Google ToS popup because it's dismissed");
            a2.q();
            return false;
        }
        return yloVar.a();
    }

    public final boolean d() {
        return this.b.q("should_show_google_tos_prompt", false);
    }
}
