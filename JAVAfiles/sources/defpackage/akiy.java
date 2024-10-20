package defpackage;

import com.google.common.util.concurrent.SettableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akiy {
    public final String a;
    public final ahtt b;
    public final SettableFuture c = SettableFuture.create();
    public final akbj d;
    final /* synthetic */ adef e;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public akiy(adef adefVar, String str, ahtt ahttVar) {
        this.e = adefVar;
        this.a = str;
        this.b = ahttVar;
        this.d = new akbj(new akiq(adefVar, this, 2, null), adefVar.d);
    }
}
