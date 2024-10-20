package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afph implements agvi {
    public final afni a;
    private final Context b;
    private final arwe c;

    public afph(Context context, arwe arweVar, afni afniVar) {
        context.getClass();
        arweVar.getClass();
        this.b = context;
        this.c = arweVar;
        this.a = afniVar;
    }

    @Override // defpackage.agvi
    public final ListenableFuture a() {
        return arro.I(this.c, new afmg(this, (arpe) null, 10));
    }

    @Override // defpackage.agvj
    public final /* synthetic */ ListenableFuture b() {
        return aglo.A(this);
    }

    @Override // defpackage.agvj
    public final String c() {
        String string = this.b.getResources().getString(R.string.emoji_recents_category);
        string.getClass();
        String upperCase = string.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return upperCase;
    }

    @Override // defpackage.agvj
    public final /* synthetic */ void d(agxy agxyVar) {
        aglo.B(this, agxyVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.agvi
    public final void e(String str) {
    }
}
