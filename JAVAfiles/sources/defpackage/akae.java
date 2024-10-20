package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akae implements ajzc {
    public final Context a;
    public final anen b;
    private final anen c;

    public akae(Context context, anen anenVar, anen anenVar2) {
        this.a = context;
        this.c = anenVar;
        this.b = anenVar2;
    }

    @Override // defpackage.ajzc
    public final ListenableFuture a(ajzd ajzdVar) {
        return albo.bN(new akdj(this, 1), this.c);
    }
}
