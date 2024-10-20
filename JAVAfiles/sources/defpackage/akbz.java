package defpackage;

import android.database.ContentObserver;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akbz extends ContentObserver {
    final /* synthetic */ arqv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akbz(arqv arqvVar) {
        super(null);
        this.a = arqvVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.a(Boolean.valueOf(z), null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.a(Boolean.valueOf(z), uri);
    }
}
