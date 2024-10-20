package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqnc implements alhr {
    public static final aqnc a = new aqnc();
    private final alhr b = new alhw(new aqne());

    public static boolean b(Context context) {
        return a.get().i(context);
    }

    public static boolean c(Context context) {
        return a.get().j(context);
    }

    public static boolean d(Context context) {
        return a.get().m(context);
    }

    @Override // defpackage.alhr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aqnd get() {
        return (aqnd) ((alhw) this.b).a;
    }
}
