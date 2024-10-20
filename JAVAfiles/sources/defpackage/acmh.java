package defpackage;

import android.database.ContentObserver;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acmh extends ContentObserver {
    final /* synthetic */ acmk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acmh(acmk acmkVar) {
        super(null);
        this.a = acmkVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.a.set(true);
    }
}
