package defpackage;

import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akeu implements aixl {
    final /* synthetic */ Uri a;
    final /* synthetic */ String[] b;
    final /* synthetic */ String c;
    final /* synthetic */ String[] d;
    final /* synthetic */ String e;
    final /* synthetic */ atsg f;

    public akeu(atsg atsgVar, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        this.a = uri;
        this.b = strArr;
        this.c = str;
        this.d = strArr2;
        this.e = str2;
        this.f = atsgVar;
    }

    @Override // defpackage.aixl
    public final Cursor a(CancellationSignal cancellationSignal) {
        return ((ansy) this.f.a).o(this.a, this.b, this.c, this.d, this.e, cancellationSignal);
    }

    @Override // defpackage.aixl
    public final String b() {
        return ansy.q(this.b, this.a, this.c, this.e);
    }

    @Override // defpackage.aixl
    public final void c() {
    }
}
