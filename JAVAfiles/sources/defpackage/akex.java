package defpackage;

import android.content.Context;
import android.net.Uri;
import j$.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akex extends aker implements akfx {
    public final akfc a;
    final /* synthetic */ atsg b;
    private final Uri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public akex(atsg atsgVar, Uri uri) {
        super((aksr) atsgVar.d, "External ContentObserver notification", atsgVar.g);
        this.b = atsgVar;
        this.a = new akgb(this);
        this.c = uri;
    }

    @Override // defpackage.aker
    public final void a(boolean z, Uri uri) {
        if (!z) {
            atsg atsgVar = this.b;
            ((ahiy) atsgVar.b).q(albo.bI(null), this.a);
        }
    }

    @Override // defpackage.akfx
    public final void c() {
        ((Context) this.b.e).getContentResolver().unregisterContentObserver(this);
    }

    @Override // defpackage.akfx
    public final void d() {
        ((Context) this.b.e).getContentResolver().registerContentObserver(this.c, false, this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof akex) {
            return Objects.equals(this.c, ((akex) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.c);
    }

    public final String toString() {
        return "ResultPropagator for URI: ".concat(String.valueOf(String.valueOf(this.c)));
    }
}
