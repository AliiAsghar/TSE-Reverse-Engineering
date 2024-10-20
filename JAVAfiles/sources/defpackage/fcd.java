package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcd extends ContentObserver {
    public final ContentResolver a;
    public final Uri b;
    final /* synthetic */ fcf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcd(fcf fcfVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.c = fcfVar;
        this.a = contentResolver;
        this.b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        fcf fcfVar = this.c;
        fcfVar.a(fcb.d(fcfVar.a, fcfVar.g, fcfVar.i));
    }
}
