package defpackage;

import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ulr extends unp {
    public final Context a;
    public final Optional b;
    private final anen c;

    public ulr(anen anenVar, Context context, Optional optional) {
        this.c = anenVar;
        this.a = context;
        this.b = optional;
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("CleanupPartUriHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        return aktp.ai(new ulo(this, (uls) apbtVar, 2), this.c);
    }

    @Override // defpackage.unx
    public final apca e() {
        return uls.a.getParserForType();
    }
}
