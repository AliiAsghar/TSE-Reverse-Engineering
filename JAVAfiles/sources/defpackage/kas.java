package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kas extends arrp implements arqg {
    final /* synthetic */ Uri a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ long d;
    final /* synthetic */ kcg e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kas(kcg kcgVar, Uri uri, String str, String str2, long j) {
        super(0);
        this.e = kcgVar;
        this.a = uri;
        this.b = str;
        this.c = str2;
        this.d = j;
    }

    @Override // defpackage.arqg
    public final /* bridge */ /* synthetic */ Object a() {
        Uri uri = this.a;
        uri.getClass();
        ((lkd) this.e.a).b(new lmk(uri, this.b, this.c, this.d, true));
        return true;
    }
}
