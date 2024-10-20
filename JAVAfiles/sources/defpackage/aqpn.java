package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqpn implements alhr {
    private static final aqpn a = new aqpn();
    private final alhr b = new alhw(new aqpp());

    public static boolean b(Context context) {
        return a.get().a(context);
    }

    public static boolean c(Context context) {
        return a.get().b(context);
    }

    @Override // defpackage.alhr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aqpo get() {
        return (aqpo) ((alhw) this.b).a;
    }
}
