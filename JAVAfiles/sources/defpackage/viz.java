package defpackage;

import android.app.Notification;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class viz implements vja {
    final /* synthetic */ vja a;
    private Supplier b;

    public viz(vja vjaVar) {
        this.a = vjaVar;
    }

    @Override // defpackage.vja
    public final Notification a(String str) {
        if (this.b == null) {
            this.b = new uea(this.a.a(str), 11);
        }
        return (Notification) ((uea) this.b).a;
    }
}
