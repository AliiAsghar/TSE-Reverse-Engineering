package defpackage;

import android.net.Uri;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abcc extends xzs {
    final /* synthetic */ Uri a;
    final /* synthetic */ abce b;
    final /* synthetic */ abac c;
    private String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abcc(abac abacVar, Uri uri, abce abceVar) {
        super("Bugle.Async.Compose.PersistVCardToScratchFile.Duration");
        this.a = uri;
        this.b = abceVar;
        this.c = abacVar;
    }

    @Override // defpackage.xzs
    public final /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        String a = ((yce) this.c.a).a(this.a);
        this.k = a;
        if (TextUtils.isEmpty(a)) {
            xzb.n("Bugle", "Could not find lookupKey for the selected contact uri ".concat(this.a.toString()));
            return Uri.EMPTY;
        }
        return this.c.a(this.k);
    }

    @Override // defpackage.xzs
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        abac.b((Uri) obj, this.b);
    }
}
