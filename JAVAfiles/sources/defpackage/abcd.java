package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abcd extends xzs {
    final /* synthetic */ String a;
    final /* synthetic */ abce b;
    final /* synthetic */ abac c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abcd(abac abacVar, String str, abce abceVar) {
        super("Bugle.Async.Compose.PersistVCardToScratchFile.Duration");
        this.a = str;
        this.b = abceVar;
        this.c = abacVar;
    }

    @Override // defpackage.xzs
    public final /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        return this.c.a(this.a);
    }

    @Override // defpackage.xzs
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        abac.b((Uri) obj, this.b);
    }
}
