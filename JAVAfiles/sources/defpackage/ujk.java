package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ujk extends unp {
    public static final xze a = xze.g("Bugle", "RichCardMediaUriCleanupHandler");
    public final uhj b;
    private final anen c;

    public ujk(anen anenVar, uhj uhjVar) {
        this.c = anenVar;
        this.b = uhjVar;
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("RichCardMediaUriCleanupHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        ujl ujlVar = (ujl) apbtVar;
        String str = ujlVar.b;
        if (TextUtils.isEmpty(str)) {
            a.q("empty uri was requested to be cleaned up");
            return aktp.ag(upm.d());
        }
        if (TextUtils.isEmpty(ujlVar.c)) {
            a.q("empty message id when requesting URI cleanup");
            return aktp.ag(upm.d());
        }
        return aktp.ai(new rbn(this, ujlVar, str, 6), this.c);
    }

    @Override // defpackage.unx
    public final apca e() {
        return ujl.a.getParserForType();
    }
}
